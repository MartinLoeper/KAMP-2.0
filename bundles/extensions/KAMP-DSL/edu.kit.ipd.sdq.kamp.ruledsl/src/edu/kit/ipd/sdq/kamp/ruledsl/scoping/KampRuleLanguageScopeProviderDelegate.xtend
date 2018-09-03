
package edu.kit.ipd.sdq.kamp.ruledsl.scoping

import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.ForwardEReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceIdDeclaration
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstancePredicateDeclaration
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceProjection
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceRuleSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.KampRule
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.KampRuleLanguagePackage
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.Lookup
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.ModelInstanceReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RecursiveBlock
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleFile
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.StandardBlock
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.StructuralFeatureForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.runtime.KarlModelLoader
import edu.kit.ipd.sdq.kamp.ruledsl.util.CustomEObjectDescription
import java.io.IOException
import org.eclipse.emf.cdo.common.id.CDOWithID
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.SimpleScope
import tools.vitruv.dsls.mirbase.mirBase.MetaclassReference
import tools.vitruv.dsls.mirbase.mirBase.MetamodelImport
import tools.vitruv.dsls.mirbase.mirBase.MirBasePackage
import tools.vitruv.dsls.mirbase.scoping.MirBaseScopeProviderDelegate

import static tools.vitruv.dsls.mirbase.mirBase.MirBasePackage.Literals.*

import static extension edu.kit.ipd.sdq.kamp.ruledsl.util.KampRuleLanguageEcoreUtil.*
import org.eclipse.xtext.EcoreUtil2
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardReferenceInstanceSource
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardEReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardReferenceMetaclassSource

class KampRuleLanguageScopeProviderDelegate extends MirBaseScopeProviderDelegate {
	override getScope(EObject context, EReference reference) {
		if (context instanceof KampRule && reference.equals(METACLASS_REFERENCE__METACLASS)) {
			return IScope.NULLSCOPE 
		}

		// BackwardReferenceMetaclassSource - feature
		else if(context instanceof BackwardReferenceMetaclassSource && reference.equals(KampRuleLanguagePackage.Literals.BACKWARD_REFERENCE_METACLASS_SOURCE__FEATURE)) {
			return createFilteredEReferenceScope((context as BackwardReferenceMetaclassSource)?.mclass, (context as Lookup)?.previousMetaclass)
		}
		
		// BackwardReferenceInstanceSource - instanceReference
		else if(context instanceof BackwardReferenceInstanceSource && reference.equals(KampRuleLanguagePackage.Literals.BACKWARD_REFERENCE_INSTANCE_SOURCE__INSTANCE_REFERENCE)) {
			val previousMetaclass = getPreviousMetaclass(EcoreUtil2.getContainerOfType(context, Lookup));
			val backwardRef = context as BackwardEReference;
			val rule = backwardRef.eContainer as KampRule
			val ruleFile = rule.eContainer as RuleFile;
			val classifierDescriptions = newArrayList()
			
			// retrieve instance declarations
			ruleFile.instances.forEach[i |
				if(i instanceof InstanceIdDeclaration) {
					val iDecl = i as InstanceIdDeclaration;
					iDecl.metaclass.EAllReferences.forEach[sourceReference |
						if(sourceReference.EReferenceType.isSubtype(previousMetaclass)) {
							classifierDescriptions += EObjectDescription.create(iDecl.name, i)
						}
					]
				}
			]
			
			// retrieve instance predicates
			ruleFile.intancePredicates.forEach[i |
				if(i instanceof InstancePredicateDeclaration) {
					val iPredicateDecl = i as InstancePredicateDeclaration;
					iPredicateDecl.metaclass.EAllReferences.forEach[sourceReference |
						if(sourceReference.EReferenceType.isSubtype(previousMetaclass)) {
							classifierDescriptions += EObjectDescription.create(iPredicateDecl.name, i)
						}
					]
				}
			]
			
			return new SimpleScope(IScope.NULLSCOPE, classifierDescriptions)
		}
		
		// InstanceForwardReferenceTarget - Instance 
		else if (context instanceof InstanceForwardReferenceTarget && reference.equals(KampRuleLanguagePackage.Literals.INSTANCE_FORWARD_REFERENCE_TARGET__INSTANCE_REFERENCE)) {
			val previousMetaclass = getPreviousMetaclass(EcoreUtil2.getContainerOfType(context, Lookup));
			val forwardRef = context as ForwardEReference;
			val rule = forwardRef.eContainer as KampRule
			val ruleFile = rule.eContainer as RuleFile;
			val classifierDescriptions = newArrayList()
			
			// retrieve instance declarations
			ruleFile.instances.forEach[i |
				if(i instanceof InstanceIdDeclaration) {
					val iDecl = i as InstanceIdDeclaration;
					previousMetaclass.EAllReferences.forEach[sourceReference |
						if(iDecl.metaclass.isSubtype(sourceReference.EReferenceType)) {
							classifierDescriptions += EObjectDescription.create(iDecl.name, i)
						}
					]
				}
			]
			
			// retrieve instance predicates
			ruleFile.intancePredicates.forEach[i |
				if(i instanceof InstancePredicateDeclaration) {
					val iPredicateDecl = i as InstancePredicateDeclaration;
					previousMetaclass.EAllReferences.forEach[sourceReference |
						if(iPredicateDecl.metaclass.isSubtype(sourceReference.EReferenceType)) {
							classifierDescriptions += EObjectDescription.create(iPredicateDecl.name, i)
						}
					]
				}
			]
			
			return new SimpleScope(IScope.NULLSCOPE, classifierDescriptions)
		}
		
		// StructuralFeatureReferenceTarget - Feature
		else if (context instanceof StructuralFeatureForwardReferenceTarget && reference.equals(KampRuleLanguagePackage.Literals.STRUCTURAL_FEATURE_FORWARD_REFERENCE_TARGET__FEATURE)) {
			val previousMetaclass = getPreviousMetaclass((context as Lookup));
			val scopes = createEReferenceScope(previousMetaclass);

			return scopes;
		} 
		
		// InstanceProjection - instanceDeclarationReference
		else if(context instanceof InstanceProjection && reference.equals(KampRuleLanguagePackage.Literals.INSTANCE_PROJECTION__INSTANCE_DECLARATION_REFERENCE)) {
			val previousMetaclass = getPreviousMetaclass((context as Lookup));
			val ruleFile = retrieveRuleFile(context);
			val classifierDescriptions = newArrayList()
			
			ruleFile.intancePredicates.forEach[i |
				val iPredicateDecl = i as InstancePredicateDeclaration;
				if(previousMetaclass.isSubtype(iPredicateDecl.metaclass)) {
					classifierDescriptions += EObjectDescription.create(iPredicateDecl.name, i)
				}
			]
			
			ruleFile.instances.forEach[i |
				val iPredicateIdDecl = i as InstanceIdDeclaration;
				if(previousMetaclass.isSubtype(iPredicateIdDecl.metaclass)) {
					classifierDescriptions += EObjectDescription.create(iPredicateIdDecl.name, i)
				}
			]
			
			return new SimpleScope(IScope.NULLSCOPE, classifierDescriptions)
		}
		
		// InstanceRuleSource - instanceReference
		else if(context instanceof InstanceRuleSource && reference.equals(KampRuleLanguagePackage.Literals.INSTANCE_RULE_SOURCE__INSTANCE_REFERENCE)) {
			
		}
		
		// RuleReference - Rule
		else if(context instanceof RuleReference && reference.equals(KampRuleLanguagePackage.Literals.RULE_REFERENCE__RULE)) {
			var RuleFile ruleFile = retrieveRuleFile(context);
			if(ruleFile !== null) {
				val classifierDescriptions = newArrayList()
				
				for(block : ruleFile.blocks) {
					if(block instanceof RecursiveBlock) {
						for(cRule : block.rules) {
							// a rule may not call itself -> cycle and the source element type must match
							if(!cRule.equals(context.eContainer) && (context as Lookup).previousMetaclass.isSubtype(getMetaclass(cRule.source)))
								classifierDescriptions += EObjectDescription.create(cRule.name, cRule)
						}
					} else if(block instanceof StandardBlock) {
						// a rule may not call itself -> cycle and the source element type must match
						if(!block.equals(context.eContainer) && (context as Lookup).previousMetaclass.isSubtype((block as KampRule).source.metaclass))
							classifierDescriptions += EObjectDescription.create((block as KampRule).name, block as KampRule)
					}
				}
				
				return new SimpleScope(IScope.NULLSCOPE, classifierDescriptions)
			}
		}
		
//		else if(context instanceof ModificationMark && reference == KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE) {
//			val mm = (context as ModificationMark)
//			if(mm.type !== null && !(mm.type instanceof JvmVoid)) {				
//				if(mm.type instanceof EFactory) {
//					return super.getScope(context, reference)
//				} else {
//					return IScope.NULLSCOPE 
//				}
//			}
//		}

		// ModelInstanceReference - Instance
		else if(context instanceof ModelInstanceReference && reference.equals(KampRuleLanguagePackage.Literals.MODEL_INSTANCE_REFERENCE__INSTANCE)) {
			val modelInstanceReference = context as ModelInstanceReference;
			val model = modelInstanceReference.model;
			if(model !== null) {
				try {
					val resource = KarlModelLoader.INSTANCE.loadModelFromFile(model.file, model.name, true);
					val classifierDescriptions = <IEObjectDescription>newArrayList()
					KarlModelLoader.INSTANCE.getObjectsIterator(resource).forEach[object |
						var String name = null;
						if(object instanceof ENamedElement) {
							val namedElement = object as ENamedElement;
							name = namedElement.name;
						} else {
							// search for name attribute
							val EList<EAttribute> eAllAttributes = object.eClass().getEAllAttributes();
						    for (EAttribute eAttribute : eAllAttributes) {
						        if(eAttribute.getName().equals("name") || eAttribute.getName().equals("entityName")){
						            name = object.eGet(eAttribute).toString;
						        }
						    }
						} 
	
						val userData = newHashMap;
						if (name !== null) {
							userData.put("name", name);
						}
						
						var qualifiedName = EcoreUtil.getID(object);
						if(qualifiedName === null) {
							if(object instanceof CDOWithID && object !== null) {
								val cdoId = (object as CDOWithID).cdoID;
								if(cdoId !== null) {
									qualifiedName = cdoId.toString;
								}
							}
						}
						if(qualifiedName !== null) {
							var IEObjectDescription desc;
							if(name !== null) {
								val simpleName = QualifiedName.create(name + "_" + qualifiedName);
								desc = new CustomEObjectDescription(simpleName, QualifiedName.create(qualifiedName), object, userData);
							} else {
								desc = EObjectDescription.create(qualifiedName, object, userData);
							}
							classifierDescriptions += desc;
						} else {
							//System.err.println("Omitting " + object + " because no id given!");
						}
					]
					
					return new SimpleScope(IScope.NULLSCOPE, classifierDescriptions)
				} catch (IOException e) {
					return IScope.NULLSCOPE;
				}
			} else {
				return IScope.NULLSCOPE;
			}
		}

		// ALL - METACLASS
		if (reference.equals(METACLASS_REFERENCE__METACLASS)) {
			return createQualifiedEClassScope((context as MetaclassReference).metamodel, true, false);
		}

		// Delegate all other calls	
		return super.getScope(context, reference)
	}
	
	private def RuleFile retrieveRuleFile(EObject obj) {
		var cObj = obj;
		while(!(cObj instanceof RuleFile) && cObj !== null) {
			cObj = cObj.eContainer;
		}
		
		return cObj as RuleFile;
	}
	
	public static def getEClassForInstanceClass(Resource res, String canonicalClassName) {
		return getAllImportedEClasses(res).findFirst[
			println(it.instanceClass.canonicalName)
			it.instanceClass.canonicalName == canonicalClassName
		]
	}
	
	// FIXME copied from MirBaseScopeProviderDelegate
	private def createQualifiedEClassScope(MetamodelImport metamodelImport, boolean includeAbstract, boolean includeEObject) {
		val classifierDescriptions = 
			if (metamodelImport === null || metamodelImport.package === null) {
				if (includeEObject) {
					#[createEObjectDescription(EcorePackage.Literals.EOBJECT, false)];
				} else {
					#[];
				}
			} else { 
				collectObjectDescriptions(metamodelImport.package, 
					true, includeAbstract, metamodelImport.useQualifiedNames)
			}

		var resultScope = new SimpleScope(IScope.NULLSCOPE, classifierDescriptions)
		return resultScope
	}
	
	/**
	 * Creates a scope for {@link EReference EReferences} of {@source sourceEClass}.
	 * 
	 * FIXME: move to MirBaseScopeProviderDelegate
	 */
	override createEReferenceScope(EClass eClass) {		
		if (eClass !== null) {
			createScope(IScope.NULLSCOPE, eClass.EAllReferences.iterator, [
				EObjectDescription.create(it.name, it)
			])
		} else {
			return IScope.NULLSCOPE
		}
	}

	/**
	 * Creates a scope for {@link EReference EReferences} of {@source sourceEClass}
	 * that have the type {@source targetEClass} as their {@link EReference#getEReferenceType target type}.
	 * 
	 * FIXME: move to MirBaseScopeProviderDelegate
	 */
	def createFilteredEReferenceScope(MetaclassReference sourceEClass, EClass targetEClass) {
		val featuresOfSource = sourceEClass.metaclass.EAllStructuralFeatures;
		if (sourceEClass !== null && targetEClass !== null) {
			// featuresOfSource.stream.forEach[f | println(f.EType + "-" + targetEClass + targetEClass.isSubtype(f.EType))];
			createScope(IScope.NULLSCOPE, featuresOfSource.filter[feature | targetEClass.isSubtype(feature.EType)].iterator, [
				EObjectDescription.create(it.name, it)
			])
		} else {
			return IScope.NULLSCOPE
		}
	}
	
	public static def getAllImportedEClasses(Resource res) {
		val imports = _getMetamodelImports(res)
		return imports.map[i | collectEClasses(i.package, true)].flatten.toSet
	}
	
	private static def _getMetamodelImports(Resource res) {
		var contents = res._getAllContentsOfEClass(MirBasePackage.eINSTANCE.getMetamodelImport, true).toList
		val validImports = contents.filter(MetamodelImport).filter[package !== null].map[it.name = it.name ?: it.package.name; it]

		return validImports
	}
	
	private static def _getAllContentsOfEClass(Resource res, EClass namedParent, boolean allContents) {
		var contents = if (allContents)
				res.allContents.toList
			else
				res.contents

		return contents.filter[eClass.equals(namedParent)]
	}
	
	private static def Iterable<EClass> collectEClasses(EPackage pckg, boolean includeSubpackages) {
		var recursiveResult = <EClass>newArrayList();
		if (includeSubpackages) {
			recursiveResult += pckg.ESubpackages.map[it | collectEClasses(it, includeSubpackages)].flatten
		}
		val result = pckg.EClassifiers.filter(EClass);
		return recursiveResult + result;
	}
	
	/**
	 * Returns true if the given subType is either the same type as superType or
	 * a real subtype.
	 */
	public static def Boolean isSubtype(EClass superType, EClassifier subType) {
		if(subType.equals(superType)) {
			return true
		}
		
		if(subType instanceof EClass) {	
			return subType.EAllSuperTypes.exists[sType | sType.equals(superType)]
		} else {
			return false;
		}
	}
}