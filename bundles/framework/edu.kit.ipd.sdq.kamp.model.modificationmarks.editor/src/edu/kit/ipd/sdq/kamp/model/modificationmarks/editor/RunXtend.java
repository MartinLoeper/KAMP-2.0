package edu.kit.ipd.sdq.kamp.model.modificationmarks.editor;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.architecture.CrossReferenceProvider;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersionPersistency;
import thesis.KampXtendTest;

/**
 * Runs user defined xtend queries.
 * This is part of the KAMP CPRL Evaluation.
 * 
 * @generated NOT
 */
public class RunXtend implements IActionDelegate {
	
	private ISelection selection;
	
	@Override
	public void run(IAction action) {
		PlatformUI.getWorkbench().saveAllEditors(false);	
		Object selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).size() == 1) {
				selectedElement = ((IStructuredSelection)selection).getFirstElement();
			}
		}
		
		if (selectedElement != null && selectedElement instanceof AbstractModification) {
			AbstractModification<? extends EObject, ? extends EObject> element = (AbstractModification<? extends EObject, ? extends EObject>) selectedElement;
			CrossReferenceProvider provider = this.getArchitectureVersion(element);
			CompositeComponent compositeComponent = (CompositeComponent) element.getAffectedElement();
			CausingEntityMapping<CompositeComponent, EObject> ce = new CausingEntityMapping<CompositeComponent, EObject>(compositeComponent);
			Collection<CausingEntityMapping<RepositoryComponent, EObject>> result = KampXtendTest.evaluateRule(Stream.of(ce), provider.getECrossReferenceAdapter()).collect(Collectors.toList());
			 
//			System.out.println("RESULTS FOR " + compositeComponent.getEntityName());
//			for(EObject obj : result) {
//				EObject cComponent = (EObject) obj;
//				System.out.println(cComponent);
//			}
		}
	}
	
	private CrossReferenceProvider getArchitectureVersion(AbstractModification<?, ?> element) {
		// TODO this is tailored to the example's version persistency
		AbstractArchitectureVersionPersistency<?> architectureVersionPersistency = new ISArchitectureVersionPersistency();
	
		URI resourceURI = element.eResource().getURI();
		String folderPathString = resourceURI.trimSegments(1).toPlatformString(false);
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(folderPathString));
		
		if (folderPathString != null) {
			AbstractArchitectureVersion<?> targetversion = architectureVersionPersistency.load(folder, "target");
			if(targetversion instanceof CrossReferenceProvider) {
				return (CrossReferenceProvider) targetversion;
			}
		}
		
		return null;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}
}
