/*
 * generated by Xtext 2.10.0
 */
package edu.kit.ipd.sdq.kamp.ruledsl.jvmmodel

import com.google.inject.Inject
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardEReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.Block
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.CausingEntityMarker
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.ForwardEReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InlineInstancePredicateProjection
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.Instruction
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.KampRule
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.Lookup
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RecursiveBlock
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleFile
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.RuleReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.StandardBlock
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.StructuralFeatureForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping
import edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRecursiveRule
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRule
import edu.kit.ipd.sdq.kamp.ruledsl.support.RuleResult
import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.AbstractLookup
import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.EmptyLookup
import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.RuleReferenceLookup
import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.StructuralFeatureForwardReferenceLookup
import edu.kit.ipd.sdq.kamp.ruledsl.util.ErrorHandlingUtil
import edu.kit.ipd.sdq.kamp.util.LookupUtil
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.UUID
import java.util.concurrent.atomic.AtomicInteger
import java.util.stream.Stream
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.dialogs.ErrorDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.PlatformUI
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.osgi.framework.FrameworkUtil

import static edu.kit.ipd.sdq.kamp.ruledsl.util.EcoreUtil.*

import static extension edu.kit.ipd.sdq.kamp.ruledsl.util.KampRuleLanguageEcoreUtil.*
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.PropagationReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.MetaclassForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.MetaclassForwardReferenceLookup
import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.InstanceForwardReferenceLookup
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceForwardReferenceTarget
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.InstanceIdDeclaration
import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.InstanceIdPredicate
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class KampRuleLanguageJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject extension JvmTypesBuilder
	
	/** track the index of the currently inserted rule */
	private AtomicInteger currentRuleIndex = new AtomicInteger();
	
	def void inferBlock(Block block, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {		
		if(block instanceof StandardBlock) {
			createRule(block as KampRule, acceptor, isPreIndexingPhase, -1, currentRuleIndex);
		} else if(block instanceof RecursiveBlock) {
			for(rule : block.rules) {
				createRule(rule, acceptor, isPreIndexingPhase, getBlockNumber(rule, block.eContainer as RuleFile), currentRuleIndex);
			}
		}	
	}
	
	def dispatch void infer(RuleFile ruleFile, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		val clazz = ruleFile.toClass("InstanceLookupHelper");
		clazz.packageName = "gen.utils"
		
		acceptor.accept(clazz) [
			for(predicate : ruleFile.intancePredicates) {
				members += predicate.toMethod("find" + predicate.name.toFirstUpper, typeRef(boolean)) [
 					val context = predicate.toParameter('it', typeRef(predicate.type.metaclass.instanceClass))
 					parameters += context
 					if (predicate.body !== null) { 
 						body = predicate.body
 					} else {
 						body = ''''''
 					}
				]
			}
			
			for(block : ruleFile.blocks) {
				val rules = newArrayList()
				if(block instanceof KampRule) {
					rules.add(block as KampRule)
				} else {
					rules += (rules as RecursiveBlock).rules;
				}

				for(inlinePredicate : rules.map[rule | rule.instructions].flatten.filter[i | i instanceof InlineInstancePredicateProjection]) {
					val type = inlinePredicate.metaclass;
					val predicate = inlinePredicate as InlineInstancePredicateProjection;
					members += predicate.toMethod("findInline" + UUID.randomUUID().toString().replace("-", ""), typeRef(boolean)) [
	 					val context = predicate.toParameter('it', typeRef(type.instanceClass))
	 					parameters += context
	 					if (predicate.body !== null) { 
	 						body = predicate.body
	 					} else {
	 						body = ''''''
	 					}
					]
				}
			}
		]
		
		for(block : ruleFile.blocks) {
			inferBlock(block, acceptor, isPreIndexingPhase);
		}
	}
	
	def int getBlockNumber(KampRule rule, RuleFile ruleFile) {
		var i = -1;
		for(cStep : ruleFile.blocks) {
			if(cStep instanceof RecursiveBlock) {
				i++;
				
				if(cStep.rules.contains(rule)) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	// stepId == -1 means that it is an independent rule
	def void createRule(KampRule rule, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase, int blockId, AtomicInteger currentRuleIndex) {
		val className = rule.getClassName();
		val clazz = rule.toClass(className);
		clazz.packageName = "gen.rule";

		// First check if the project has the JRE on classpath
		ensureJreIsOnClasspath();
		
		acceptor.accept(clazz,
			[ theClass |
				try {
					// determine formal parameter types
					val returnType = typeRef(getReturnType(rule.lookups.last));
					val sourceType = typeRef(rule.source.metaclass.instanceTypeName);
					val List<CausingEntityMarker> causingEntityMarkers = getCausingEntityMarkers(rule.instructions);
					val Map<CausingEntityMarker, Lookup> causingEntityLookups = getCausingEntityLookups(rule.instructions, causingEntityMarkers);
					val hasSourceMarker = checkIfRuleHasSourceMarker(causingEntityMarkers, causingEntityLookups);
					
					// create fields, setters and getters
					theClass.members += rule.toField("architectureVersion", typeRef(AbstractArchitectureVersion, typeRef(AbstractModificationRepository, wildcard(), wildcard())));
					theClass.members += rule.toField("changePropagationStepRegistry", typeRef(ChangePropagationStepRegistry));
					
					val architectureVersionGetter = rule.toGetter("architectureVersion", "architectureVersion", typeRef(AbstractArchitectureVersion, typeRef(AbstractModificationRepository, wildcard(), wildcard())));
					theClass.members += architectureVersionGetter
					architectureVersionGetter.annotations += annotationRef(Override)
					
					val changePropagationStepRegistryGetter = rule.toGetter("changePropagationStepRegistry", "changePropagationStepRegistry", typeRef(ChangePropagationStepRegistry));			
					theClass.members += changePropagationStepRegistryGetter
					changePropagationStepRegistryGetter.annotations += annotationRef(Override)
					
					val architectureVersionSetter = rule.toSetter("architectureVersion", "architectureVersion", typeRef(AbstractArchitectureVersion, typeRef(AbstractModificationRepository, wildcard(), wildcard())))
					theClass.members += architectureVersionSetter
					architectureVersionSetter.annotations += annotationRef(Override)
					
					val changePropagationStepRegistrySetter = rule.toSetter("changePropagationStepRegistry", "changePropagationStepRegistry", typeRef(ChangePropagationStepRegistry))
					theClass.members += changePropagationStepRegistrySetter
					changePropagationStepRegistrySetter.annotations += annotationRef(Override)
					
					// choose correct implementing interface and add special methods
					var JvmTypeReference currentInterface = null;
					if(blockId > -1) {
						currentInterface = IRecursiveRule.typeRef(sourceType, returnType, typeRef(AbstractArchitectureVersion, typeRef(AbstractModificationRepository, wildcard(), wildcard())), typeRef(AbstractModificationRepository, wildcard(), wildcard()))
					} else {
						currentInterface = IRule.typeRef(sourceType, returnType, typeRef(AbstractArchitectureVersion, typeRef(AbstractModificationRepository, wildcard(), wildcard())), typeRef(AbstractModificationRepository, wildcard(), wildcard()));
					}
					
					// create lookups method
					val lookupsType = typeRef(AbstractLookup, wildcard(), wildcard()).addArrayTypeDimension;
					val createLookupsMethod = rule.toMethod("createLookups", lookupsType)[
						body = '''return new «AbstractLookup»[] {
								«FOR lookup : rule.lookups»
									«createLookup(lookup, sourceType, returnType, isLookupMarkedForCausingEntities(lookup, causingEntityLookups, hasSourceMarker, rule.instructions), rule)»«IF rule.lookups.last !== lookup»,«ENDIF»
								«ENDFOR»
							};'''
					];
					createLookupsMethod.static = true;
					createLookupsMethod.visibility = JvmVisibility.PRIVATE;
					createLookupsMethod.parameters += createLookupsMethod.toParameter("version", typeRef(AbstractArchitectureVersion, typeRef(AbstractModificationRepository, wildcard(), wildcard())))
					theClass.members += createLookupsMethod
					
					// add formal type parameters to implementing interface
					theClass.superTypes += currentInterface;
					
					//theClass.members += createApplyMethod(rule);
				
					// create the static lookup method	
					val lookupMethod = createLookupMethod(rule, theClass, sourceType, returnType, hasSourceMarker, causingEntityLookups);
					theClass.members += lookupMethod;
				
					// create the lookup member method
					val lookupMemberMethod = createLookupMemberMethod(rule, lookupMethod, sourceType, returnType);
					theClass.members += lookupMemberMethod;	
				
					// create class getter methods
					val sourceElementClassGetter = rule.toMethod("getSourceElementClass", Class.typeRef(sourceType)) [
						body = '''
								return «sourceType».class;
							'''
					]
					sourceElementClassGetter.annotations += annotationRef(Override)
					theClass.members += sourceElementClassGetter
					
					val affectedElementClassGetter = rule.toMethod("getAffectedElementClass", Class.typeRef(returnType)) [
						body = '''
								return «returnType».class;
							'''
					]
					affectedElementClassGetter.annotations += annotationRef(Override)	
					theClass.members += affectedElementClassGetter
					
					// create the getPosition method
					val positionMethod = rule.toMethod("getPosition", typeRef("int")) [
						body = '''
								return «currentRuleIndex.getAndIncrement() * 10»;
							'''
					]
					positionMethod.annotations += annotationRef(Override)	
					theClass.members += positionMethod
				} catch(Exception e) {
					e.printStackTrace
					// TODO replace with proper exception handling
					System.err.println("Rule could not be created. Not fully defined? Name: " + rule.name)
				}
			]
		);
	}
	
	def checkIfRuleHasSourceMarker(List<CausingEntityMarker> causingEntityMarkers, Map<CausingEntityMarker, Lookup> causingEntityLookups) {
		var boolean hasSourceMarker = false;
		
		// determine the data type of causing elements...
		for(marker : causingEntityLookups.entrySet) {
			if(marker.value === null) {
				// this means that source was marked
				hasSourceMarker = true;
			}
		}
		
		if(causingEntityMarkers.isEmpty) {
			// if there is no marker, mark source
			hasSourceMarker = true;
		}
		
		return hasSourceMarker;
	}
	
	def createLookupMemberMethod(KampRule rule, JvmOperation lookupMethod, JvmTypeReference sourceType, JvmTypeReference returnType) {
		val lookupMemberMethod = rule.toMethod("lookup", null) [
		parameters += rule.toParameter("previousRuleResult", typeRef(Result, wildcard(), sourceType));
		// Stream.typeRef(typeRef(CausingEntityMapping, sourceType, typeRef(EObject)))
		
			val StringConcatenationClient strategy = '''								
						return «lookupMethod.simpleName»(previousRuleResult, this.getArchitectureVersion());
					''';
		
			setBody(it, strategy);
		];
		
		lookupMemberMethod.annotations += annotationRef(Override)
		lookupMemberMethod.returnType = typeRef(RuleResult, sourceType, returnType)
		// Stream.typeRef(typeRef(CausingEntityMapping, returnType, typeRef(EObject)));
		
		return lookupMemberMethod;
	}
	
	def createLookupMethod(KampRule rule, JvmGenericType  theClass, JvmTypeReference sourceType, JvmTypeReference returnType, boolean hasSourceMarker, Map<CausingEntityMarker, Lookup> causingEntityLookups) {
		val lookupMethod = rule.toMethod("lookup", null) [
			parameters += rule.toParameter("previousRuleResult", typeRef(Result, wildcard(), sourceType))		
			parameters += rule.toParameter("version", typeRef(AbstractArchitectureVersion, typeRef(AbstractModificationRepository, wildcard(), wildcard())))

			val StringConcatenationClient strategy = '''
					«AbstractLookup»[] lookups = createLookups(version);
					RuleResult<«sourceType.qualifiedName», «returnType.qualifiedName»> result = «LookupUtil».runLookups(previousRuleResult, lookups, "«rule.name»");
					return result;
					''';

			setBody(it, strategy);
		];

		lookupMethod.returnType = typeRef(RuleResult, sourceType, returnType)			
		lookupMethod.static = true;
		lookupMethod.final = true;
		
		return lookupMethod;
	}
	
	def createApplyMethod(KampRule rule) {
		// create the apply method
		val applyMethod = rule.toMethod("apply", typeRef("void")) [
			// parameters += rule.toParameter("version", typeRef(AbstractArchitectureVersion, wildcard()))
			// parameters += rule.toParameter("registry", typeRef(ChangePropagationStepRegistry))
			parameters += rule.toParameter("affectedElements", Stream.typeRef(typeRef(CausingEntityMapping, returnType, typeRef(EObject))));
						
			if(rule.modificationMark !== null) {
							
					// TODO reimplement this stuff to match new return type of lookup method
					body = '''
«««							«LookupUtil».lookup(architectureVersion, «typeRef(rule.source.metaclass.instanceTypeName)».class, «rule.getClassName»::«rule.getLookupMethodName(rule.lookups.last)»)
«««								.forEach((result) -> {
«««									if(«PropagationStepUtil».isNewEntry(result, «stepId», changePropagationRegistry)) {
«««										«AbstractModification»<?, «EObject»> modificationMark = «ModificationMarkCreationUtil».createModificationMark(result, «rule.modificationMark.type.qualifiedName».eINSTANCE.«rule.modificationMark.memberRef»());
«««										«ModificationMarkCreationUtil».insertModificationMark(modificationMark, registry, «rule.modificationMark.target.qualifiedName».class, "«rule.modificationMark.targetMethod»");
«««										«PropagationStepUtil».addNewModificationMark(result, modificationMark, «stepId», changePropagationRegistry);
«««									} else {
«««										«PropagationStepUtil».addToExistingModificationMark(result, «stepId», changePropagationRegistry);
«««									}
«««								});
					'''
			} else {
				body = ''''''
			}
		];
		applyMethod.annotations += annotationRef(Override)
		
		return applyMethod;
	}
	
	// TODO this might not be the best way to do this, but it works
	def ensureJreIsOnClasspath() {
		try {
			annotationRef(Override)
		} catch(IllegalArgumentException e) {
			e.printStackTrace;
			System.err.println("This error is probably caused by JRE not being activated for the project which contains the rules.karl file.")
			
			// show a dialog
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
				override void run() {
					val Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
					ErrorDialog.openError(shell, "Error", "The JRE is not on classpath. You must convert the KAMP project to a Java Plugin Project!", ErrorHandlingUtil.createMultiStatus(FrameworkUtil.getBundle(KampRuleLanguageJvmModelInferrer).getSymbolicName(), e.getLocalizedMessage(), e));
				}
			});	
			
			return;
		}
	}
	
	def boolean isLookupMarkedForCausingEntities(Lookup lookup, Map<CausingEntityMarker, Lookup> causingEntityLookups, boolean hasSourceMarker, List<Instruction> instructions) {
		if(hasSourceMarker) {
			val PropagationReference lastPropagationReference = instructions.filter[i | return i instanceof PropagationReference].last as PropagationReference;
			if(lastPropagationReference !== null && lastPropagationReference == lookup) {
				return true;
			} else {
				// TODO: if there is no PropagationReference, we should select the source
			}
		}

		return causingEntityLookups.containsValue(lookup)
	}
	
	def String generateSourceMarkerParameter(boolean hasSourceMarker, String parameterName) {
		return if(hasSourceMarker) parameterName else "new java.util.HashSet<>()";
	}
	
	def List<CausingEntityMarker> getCausingEntityMarkers(EList<Instruction> instructions) {
		val List<CausingEntityMarker> markers = new ArrayList();
		
		for(cInstruction : instructions) {
			if(cInstruction instanceof CausingEntityMarker) {
				markers.add(cInstruction);
			}
		}
		
		return markers;
	}
	
	def Map<CausingEntityMarker, Lookup> getCausingEntityLookups(EList<Instruction> instructions, List<CausingEntityMarker> markers) {		
		val Map<CausingEntityMarker, Lookup> lookups = new HashMap();
		if(markers.size == 0) {
			return lookups;
		}
		
		for(marker : markers) {
			lookups.put(marker, getPreviousSiblingOfType(marker, Lookup));
		}
		
		return lookups;
	}
	
	def EList<Lookup> getLookups(KampRule rule) {
		val EList<Lookup> list = new BasicEList();
		for(cInstruction : rule.instructions) {
			if(cInstruction instanceof Lookup) {
				list.add(cInstruction);
			}
		}
		
		return list;
	}
	
	def String getClassName(KampRule rule) {
		return rule.name.toFirstUpper + "Rule"
	}
	
	def Class<?> getReturnType(Lookup lastLookup) {
		lastLookup.metaclass.instanceClass
	}
	
	def dispatch CharSequence createLookup(Lookup lookup, JvmTypeReference sourceType, JvmTypeReference returnType, boolean addToCausingEntities, KampRule rule) {
		return '''new «EmptyLookup.canonicalName»()''';
	}
	
	def dispatch CharSequence createLookup(RuleReference lookup, JvmTypeReference sourceType, JvmTypeReference returnType, boolean addToCausingEntities, KampRule rule) {
		return '''new «RuleReferenceLookup.canonicalName»<«sourceType.qualifiedName», «returnType.qualifiedName»>(version, «lookup.rule.className»::lookup)''';
	}
	
	def dispatch CharSequence createLookup(StructuralFeatureForwardReferenceTarget lookup, JvmTypeReference sourceType, JvmTypeReference returnType, boolean addToCausingEntities, KampRule rule) {
		return '''new «StructuralFeatureForwardReferenceLookup.canonicalName»<«sourceType.qualifiedName», «returnType.qualifiedName»>(«addToCausingEntities», «lookup.feature.many», "«lookup.feature.name»")''';
	}
	
	def dispatch CharSequence createLookup(MetaclassForwardReferenceTarget lookup, JvmTypeReference sourceType, JvmTypeReference returnType, boolean addToCausingEntities, KampRule rule) {
		return '''new «MetaclassForwardReferenceLookup.canonicalName»<«sourceType.qualifiedName», «returnType.qualifiedName»>(«addToCausingEntities», «returnType.qualifiedName».class)''';
	}
	
	def dispatch CharSequence createLookup(InstanceForwardReferenceTarget lookup, JvmTypeReference sourceType, JvmTypeReference returnType, boolean addToCausingEntities, KampRule rule) {
		val referenceType = lookup.instanceReference;
		var CharSequence predicate = null;
		if(referenceType instanceof InstanceIdDeclaration) {
			val instanceId = EcoreUtil.getID(referenceType.instanceReference.instance);
			predicate = '''new «InstanceIdPredicate.canonicalName»<«returnType.qualifiedName»>("«instanceId»")''';
		}

		return '''new «InstanceForwardReferenceLookup.canonicalName»<«sourceType.qualifiedName», «returnType.qualifiedName»>(«addToCausingEntities», «returnType.qualifiedName».class, «predicate»)''';
	}

//	def dispatch generateCodeForRule(BackwardReferenceMetaclassSource ref, JvmGenericType typeToAddTo, boolean addToCausingEntities) {
//		'''
//			«Stream.canonicalName»<CausingEntityMapping<«ref.metaclass.instanceTypeName», EObject>> «varName» = «LookupUtil.canonicalName».lookupBackwardReference(version, «ref.metaclass.instanceTypeName».class, ''' + getFeatureName(ref) + ''', «nameForLookup.get(getPreviousSiblingOfType(ref, Lookup))», «addToCausingEntities»).stream();
//		'''
	
	
	def getLookupNumber(Lookup reference) {
		val list = reference.eContainer.eContents;
		for(var int i = 0; i < list.size; i++) {
			val cRule = list.get(i);
			if(cRule.equals(reference)) {
				return i;
			}
		}
	}
}
