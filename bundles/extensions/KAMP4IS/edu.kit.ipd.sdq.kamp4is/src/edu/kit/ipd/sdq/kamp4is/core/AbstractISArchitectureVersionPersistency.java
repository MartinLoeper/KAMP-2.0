package edu.kit.ipd.sdq.kamp4is.core;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.system.SystemPackage;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesPackage;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;

public abstract class AbstractISArchitectureVersionPersistency<T extends ISArchitectureVersion> 
		extends AbstractArchitectureVersionPersistency<T> {

	public static final String FILEEXTENSION_REPOSITORY = "repository";
	public static final String FILEEXTENSION_SYSTEM = "system";
	public static final String FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS = "fieldofactivityannotations";
	public static final String FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES = "componentinternaldependencies";
	
	@Override
	public void save(String targetDirectoryPath, String filename, T version) {
		savePCMAndKAMPModels(targetDirectoryPath, filename, version);
	}
	
	public static void savePCMAndKAMPModels(String targetDirectoryPath, String filename, ISArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		String repositoryfilePath = filename + "."+FILEEXTENSION_REPOSITORY;
		String systemfilePath = filename + "."+FILEEXTENSION_SYSTEM;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String fieldOfActivityRepositoryFilePath = filename + "."+FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String cidepfilePath = filename + "." + FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES;
		
		if (version.getRepository()!=null)
			saveEmfModelToResource(version.getRepository(), targetDirectoryPath, repositoryfilePath, resourceSet);		
		if (version.getSystem()!=null)
			saveEmfModelToResource(version.getSystem(), targetDirectoryPath, systemfilePath, resourceSet);		
		if (version.getModificationMarkRepository()!=null)
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, internalModFilePath, resourceSet);		
		if (version.getFieldOfActivityRepository()!=null)
			saveEmfModelToResource(version.getFieldOfActivityRepository(), targetDirectoryPath, fieldOfActivityRepositoryFilePath, resourceSet);
		if (version.getComponentInternalDependencyRepository()!=null)
			saveEmfModelToResource(version.getComponentInternalDependencyRepository(), targetDirectoryPath, cidepfilePath, resourceSet);
	}
	
	@Override
	protected void registerEPackages(ResourceSet resourceSet) {
    	registerKAMPPackages(resourceSet);
    }
	
	public static void registerKAMPPackages(ResourceSet resourceSet) {
    	resourceSet.getPackageRegistry().put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ISFieldOfActivityAnnotationsPackage.eNS_URI, ISFieldOfActivityAnnotationsPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ComponentInternalDependenciesPackage.eNS_URI, ComponentInternalDependenciesPackage.eINSTANCE);
        resourceSet.getPackageRegistry().put(ISModificationmarksPackage.eNS_URI, ISModificationmarksPackage.eINSTANCE);
    }

}
