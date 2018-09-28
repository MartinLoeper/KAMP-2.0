/*
 * generated by Xtext 2.10.0
 */
package edu.kit.ipd.sdq.kamp.ruledsl.ui.contentassist

import com.google.inject.Inject
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.BackwardEReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.ForwardEReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.KampRuleLanguagePackage
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.Lookup
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.ModificationMark
import org.eclipse.emf.ecore.EFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.core.Flags
import org.eclipse.jdt.core.search.IJavaSearchConstants
import org.eclipse.jface.text.IDocument
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.jface.text.contentassist.IContextInformation
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.graphics.Point
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmMember
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtext.common.types.access.IJvmTypeProvider
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

import static extension edu.kit.ipd.sdq.kamp.ruledsl.util.KampRuleLanguageEcoreUtil.*
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.jface.viewers.StyledString
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IFile
import org.eclipse.ui.internal.ide.model.WorkbenchFile
import org.eclipse.jface.resource.ImageDescriptor
import org.eclipse.core.runtime.content.IContentType
import org.eclipse.ui.internal.WorkbenchPlugin
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.core.runtime.CoreException
import org.eclipse.ui.ide.IDE
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.ISharedImages
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.IScope
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.KampRule
import org.eclipse.xtext.CrossReference
import edu.kit.ipd.sdq.kamp.ruledsl.kampRuleLanguage.TypeProjection

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class KampRuleLanguageProposalProvider extends AbstractKampRuleLanguageProposalProvider {
	
	@Inject
    private IJvmTypeProvider.Factory jvmTypeProviderFactory;
    
    @Inject
    private ITypesProposalProvider typeProposalProvider;
	
	override completeModificationMark_MemberRef(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeRuleCall(assignment.getTerminal() as RuleCall, context, acceptor);
		
		if(model instanceof ModificationMark) {
			if(model.getType() !== null && model.getType() instanceof JvmGenericType) {
				val JvmGenericType jvmGenType = model.getType() as JvmGenericType

				for(JvmMember jvmMember : jvmGenType.getMembers()) {
					if(jvmMember.getSimpleName().startsWith("create"))
						acceptor.accept(createCompletionProposal(jvmMember.getSimpleName(), context)); 
				}
			}
		}
	}
	
	override protected getDisplayString(EObject element, String qualifiedNameAsString, String shortName) {
		if(shortName !== null && !shortName.equals(qualifiedNameAsString)) {
			return shortName
		} else {
			return super.getDisplayString(element, qualifiedNameAsString, shortName)
		}
	}
	
	override createCompletionProposal(String proposal, StyledString displayString, Image image, ContentAssistContext contentAssistContext) {
		super.createCompletionProposal(proposal, displayString, image, contentAssistContext)
	}
	
	override completeModelInstanceReference_Instance(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeModelInstanceReference_Instance(model, assignment, context, acceptor)
	}
	
	override completeModificationMark_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		lookupCrossReference(assignment.getTerminal() as CrossReference, 
//	      context, acceptor, [
//	      	if(model instanceof ModificationMark) {
//	      		val aa = it.EObjectOrProxy
//	      		println(it.EObjectOrProxy)
//	      	} 
//	        true
//	      ]);
//	      

	    if (EcoreUtil2.getContainerOfType(model, ModificationMark) !== null) {
            val IJvmTypeProvider jvmTypeProvider = jvmTypeProviderFactory.createTypeProvider(model.eContainer.eResource().getResourceSet());
            val JvmType interfaceToImplement = jvmTypeProvider.findTypeByName(EFactory.getName());
            typeProposalProvider.createSubTypeProposals(interfaceToImplement, this, context, KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE, new IsInterface(), acceptor);
        } else {
            super.completeJvmParameterizedTypeReference_Type(model, assignment, context, acceptor);
        }
	}
	
	override completeModificationMark_Target(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (EcoreUtil2.getContainerOfType(model, ModificationMark) !== null) {
            val IJvmTypeProvider jvmTypeProvider = jvmTypeProviderFactory.createTypeProvider(model.eContainer.eResource().getResourceSet());
            val JvmType interfaceToImplement = jvmTypeProvider.findTypeByName(ChangePropagationStep.getName());
            typeProposalProvider.createSubTypeProposals(interfaceToImplement, this, context, KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE, new IsInterface(), acceptor);
        } else {
            super.completeJvmParameterizedTypeReference_Type(model, assignment, context, acceptor);
        }
	}
	
	override completeModificationMark_TargetMethod(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeRuleCall(assignment.getTerminal() as RuleCall, context, acceptor);
		
		if(model instanceof ModificationMark) {
			if(model.target !== null && model.target instanceof JvmGenericType) {
				val JvmGenericType jvmGenType = model.target as JvmGenericType

				for(JvmMember jvmMember : jvmGenType.getMembers()) {
					if(jvmMember.getSimpleName().startsWith("get"))
						acceptor.accept(createCompletionProposal(jvmMember.getSimpleName(), context)); 
				}
			}
		}
	}
	
	override complete_TypeProjection(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.complete_TypeProjection(model, ruleCall, context, acceptor)
	}

	override completeTypeProjection_Types(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		var container = EcoreUtil2.getContainerOfType(context.previousModel, TypeProjection);
		
		// TODO why is this never invoked?
		if(container instanceof TypeProjection) {
			val lookup = EcoreUtil2.getContainerOfType(context.previousModel, Lookup);
			val previousInstanceClass = getPreviousInstanceClass(lookup)
            val IJvmTypeProvider jvmTypeProvider = jvmTypeProviderFactory.createTypeProvider(model.eContainer.eResource().getResourceSet());
            val JvmType interfaceToImplement = jvmTypeProvider.findTypeByName(previousInstanceClass.canonicalName);
            // what does KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE mean here?
            typeProposalProvider.createSubTypeProposals(interfaceToImplement, this, context, KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE, new IsInterface(), acceptor);
        } else {
            super.completeJvmParameterizedTypeReference_Type(model, assignment, context, acceptor);
        }
	}
		
	/*
	override completeMetaForwardReferenceTarget_Projections(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		var container = EcoreUtil2.getContainerOfType(model, MetaForwardReferenceTarget);
		
		if (container !== null && container instanceof MetaForwardReferenceTarget) {
			val currentFeature = container.feature;
            val IJvmTypeProvider jvmTypeProvider = jvmTypeProviderFactory.createTypeProvider(model.eContainer.eResource().getResourceSet());
            val JvmType interfaceToImplement = jvmTypeProvider.findTypeByName(currentFeature.getEType().instanceClass.canonicalName);
            // what does KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE mean here?
            typeProposalProvider.createSubTypeProposals(interfaceToImplement, this, context, KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE, new IsInterface(), acceptor);
        } else {
            super.completeJvmParameterizedTypeReference_Type(model, assignment, context, acceptor);
        }
	}
	*/
	
	override completeModelImport_File(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeModelImport_File(model, assignment,context, acceptor);
		val workspace = ResourcesPlugin.getWorkspace();
		workspace.root.projects.forEach[project |
			if(project.name.endsWith("-rules")) {
				return;				
			}

			project.members(IResource.FILE).forEach[resource |
				if(resource instanceof IFile) {
					val replacementOffset = context.getReplaceRegion().getOffset();
					val replacementLength = context.getReplaceRegion().getLength();
					val proposal = "\"" + resource.fullPath.toString + "\"";
					var Image img = null;
					var imageDescriptor = getBaseImage(resource);
					if(imageDescriptor !== null) {
						img = imageDescriptor.createImage();
					}
					val ConfigurableCompletionProposal result = new ConfigurableCompletionProposal(proposal, replacementOffset, replacementLength, proposal.length(),
							img, new StyledString(resource.fullPath.toString), null, null);
					result.setPriority(400);
					result.setMatcher(context.getMatcher());
					result.setReplaceContextLength(getReplacementContextLength(context));
					if(proposal.contains(context.prefix)) {
						acceptor.accept(result)
					}
				}
			]
		]
	}
	
	// from: https://github.com/vogella/eclipse.platform.ui/blob/master/bundles/org.eclipse.ui.ide/src/org/eclipse/ui/internal/ide/model/WorkbenchFile.java
	public static QualifiedName IMAGE_CACHE_KEY = new QualifiedName(WorkbenchPlugin.PI_WORKBENCH, "WorkbenchFileImage"); 
	public static def ImageDescriptor getBaseImage(IResource resource) {
		var IContentType contentType = null;
		// do we need to worry about checking here?
		if (resource instanceof IFile) {
			val IFile file = resource as IFile;
			// cached images come from ContentTypeDecorator
			var ImageDescriptor cached;
			try {
				cached = file.getSessionProperty(IMAGE_CACHE_KEY) as ImageDescriptor;
				if (cached !== null) {
					return cached;
				}
			} catch (CoreException e) {
				// ignore - not having a cached image descriptor is not fatal
			}
			contentType = IDE.guessContentType(file);
		}

        var ImageDescriptor image = PlatformUI.getWorkbench().getEditorRegistry()
                .getImageDescriptor(resource.getName(), contentType);
        if (image === null) {
			image = PlatformUI.getWorkbench().getSharedImages()
                    .getImageDescriptor(ISharedImages.IMG_OBJ_FILE);
		}
        return image;
    }
	
	/*
	override completeKampRule_Instance(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeKampRule_Instance(model, assignment,context, acceptor);
		//acceptor.accept(createCompletionProposal("test", context));
		val replacementOffset = context.getReplaceRegion().getOffset();
		val replacementLength = context.getReplaceRegion().getLength();
		val proposal = "test";
		val ConfigurableCompletionProposal result = new ConfigurableCompletionProposal(proposal, replacementOffset, replacementLength, proposal.length(),
				null, new StyledString(proposal), null, null);
		result.setPriority(400);
		result.setMatcher(context.getMatcher());
		result.setReplaceContextLength(getReplacementContextLength(context));
		acceptor.accept(result)
	}
	*/

	/*
	override completeBackwardEReference_Projections(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		var container = EcoreUtil2.getContainerOfType(model, BackwardEReference);
		
		if (container !== null && container instanceof BackwardEReference) {
			val previousLookup = (container as Lookup).previousMetaclass
            val IJvmTypeProvider jvmTypeProvider = jvmTypeProviderFactory.createTypeProvider(model.eContainer.eResource().getResourceSet());
            print(previousLookup.instanceClass.canonicalName);
            val JvmType interfaceToImplement = jvmTypeProvider.findTypeByName(previousLookup.instanceClass.canonicalName);
            // what does KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE mean here?
            typeProposalProvider.createSubTypeProposals(interfaceToImplement, this, context, KampRuleLanguagePackage.Literals.MODIFICATION_MARK__TYPE, new IsInterface(), acceptor);
        } else {
            super.completeJvmParameterizedTypeReference_Type(model, assignment, context, acceptor);
        }
	}
	*/
	
	public static class IsInterface implements ITypesProposalProvider.Filter {
		override accept(int modifiers, char[] packageName, char[] simpleTypeName,
				char[][] enclosingTypeNames, String path) {

			return Flags.isInterface(modifiers);
		}
		
		override getSearchFor() {
			return IJavaSearchConstants.INTERFACE;
		}
	}	
}
