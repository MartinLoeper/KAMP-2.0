package edu.kit.ipd.sdq.kamp4is.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;

public class ISArchitectureVersionPersistency extends AbstractISArchitectureVersionPersistency<ISArchitectureVersion> {	
	
	@Override
	public ISArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		String repositoryfilePath = filename + "."+FILEEXTENSION_REPOSITORY;
		String systemfilePath = filename + "."+FILEEXTENSION_SYSTEM;
		String fieldOfActivityRepositoryFilePath = filename + "."+FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String cidepfilePath = filename + "." + FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES;

		Repository repository = (Repository)loadEmfModelFromResource(folderpath, repositoryfilePath, loadResourceSet);
		System system = (System)loadEmfModelFromResource(folderpath, systemfilePath, loadResourceSet);
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = (ISFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		AbstractISModificationRepository<?> modificationMarkRepository = (AbstractISModificationRepository<?>)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		ComponentInternalDependencyRepository componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(folderpath, cidepfilePath, loadResourceSet);
		
		return new ISArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, modificationMarkRepository, componentInternalDependencyRepository);
	}	
	
	@Override
	public ISArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		IFile repositoryfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_REPOSITORY);
		IFile systemfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_SYSTEM);
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		IFile cidepfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES);

		Repository repository = null;
		System system = null;
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = null;
		AbstractISModificationRepository<?> modificationMarkRepository = null;
		ComponentInternalDependencyRepository componentInternalDependencyRepository = null;
		
		if (repositoryfile != null && repositoryfile.exists())
			repository = (Repository)loadEmfModelFromResource(repositoryfile.getFullPath().toString(), null, loadResourceSet);
		if (systemfile != null && systemfile.exists())
			system = (System)loadEmfModelFromResource(systemfile.getFullPath().toString(), null, loadResourceSet);
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists())
			fieldOfActivityRepository = (ISFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalModFile != null && internalModFile.exists())
			modificationMarkRepository = (AbstractISModificationRepository<?>)loadEmfModelFromResource(internalModFile.getFullPath().toString(), null, loadResourceSet);
		if (cidepfile != null && cidepfile.exists())
			componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(cidepfile.getFullPath().toString(), null, loadResourceSet);
		
		return new ISArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, modificationMarkRepository, componentInternalDependencyRepository);
	}
	
}
