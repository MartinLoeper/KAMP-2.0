package edu.kit.ipd.sdq.kamp4bp.core;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelPackage;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4is.core.AbstractISArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksPackage;

public class BPArchitectureVersionPersistency extends AbstractISArchitectureVersionPersistency<BPArchitectureVersion> {

	public static final String FILEEXTENSION_USAGEMODEL = "usagemodel";
	public static final String FILEEXTENSION_BPUSAGEMODEL = "bpusagemodel";
	public static final String FILEEXTENSION_DATAMODEL = "datamodel";
	public static final String FILEEXTENSION_ORGANIZATIONENVIRONMENTMODEL = "organizationenvironmentmodel";
	
	@Override
	public BPArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		ECrossReferenceAdapter adapter = new ECrossReferenceAdapter();
		loadResourceSet.eAdapters().add(adapter);
		
		String repositoryfilePath = filename + "."+FILEEXTENSION_REPOSITORY;
		String systemfilePath = filename + "."+FILEEXTENSION_SYSTEM;
		String fieldOfActivityRepositoryFilePath = filename + "."+FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String cidepfilePath = filename + "." + FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES;
		String usageModelFilePath = filename + "." + FILEEXTENSION_USAGEMODEL;
		String bpusageModelFilePath = filename + "." + FILEEXTENSION_BPUSAGEMODEL;
		String dataModelFilePath = filename + "." + FILEEXTENSION_DATAMODEL;
		String orgEnvironmentModelFilePath = filename + "." + FILEEXTENSION_ORGANIZATIONENVIRONMENTMODEL;
		
		Repository repository = (Repository)loadEmfModelFromResource(folderpath, repositoryfilePath, loadResourceSet);
		System system = (System)loadEmfModelFromResource(folderpath, systemfilePath, loadResourceSet);
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = (ISFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		AbstractISModificationRepository<?> internalModificationMarkRepository = (AbstractISModificationRepository<?>)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		ComponentInternalDependencyRepository componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(folderpath, cidepfilePath, loadResourceSet);
		// Usage-model could be a PCM one or an IntBIIS one (IntBIIS file extension preferred)
		UsageModel usageModel = (UsageModel)loadEmfModelFromResource(folderpath, bpusageModelFilePath, loadResourceSet);
		if (usageModel == null) {
			usageModel = (UsageModel)loadEmfModelFromResource(folderpath, usageModelFilePath, loadResourceSet);
		}
		DataModel dataModel = (DataModel)loadEmfModelFromResource(folderpath, dataModelFilePath, loadResourceSet);
		OrganizationEnvironmentModel orgEnviromentModel = 
				(OrganizationEnvironmentModel)loadEmfModelFromResource(folderpath, orgEnvironmentModelFilePath, loadResourceSet);
		
		return new BPArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, 
				internalModificationMarkRepository, componentInternalDependencyRepository, 
				Collections.singletonMap(BPArchitectureVersion.USAGEMODEL_DEFAULT_NAME, usageModel), 
				dataModel, orgEnviromentModel, adapter);
	}

	@Override
	public BPArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		ECrossReferenceAdapter adapter = new ECrossReferenceAdapter();
		loadResourceSet.eAdapters().add(adapter);
		
		IFile repositoryfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_REPOSITORY);
		IFile systemfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_SYSTEM);
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		IFile cidepfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES);
		// Usage-models could be a PCM one or an IntBIIS one
		Collection<IFile> usageModelFiles = FileAndFolderManagement.retrieveFilesWithExtension(folder, FILEEXTENSION_BPUSAGEMODEL);
		usageModelFiles.addAll(FileAndFolderManagement.retrieveFilesWithExtension(folder, FILEEXTENSION_USAGEMODEL));
		IFile dataModelFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_DATAMODEL);
		IFile organizationEnvironmentModelFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_ORGANIZATIONENVIRONMENTMODEL);
		
		Repository repository = null;
		System system = null;
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = null;
		AbstractISModificationRepository<?> internalModificationMarkRepository = null;
		ComponentInternalDependencyRepository componentInternalDependencyRepository = null;
		Map<String,UsageModel> usageModels = new HashMap<String, UsageModel>();
		DataModel dataModel = null;
		OrganizationEnvironmentModel organizationEnvironmentModel = null;
		
		if (repositoryfile != null && repositoryfile.exists())
			repository = (Repository)loadEmfModelFromResource(repositoryfile.getFullPath().toString(), null, loadResourceSet);
		if (systemfile != null && systemfile.exists())
			system = (System)loadEmfModelFromResource(systemfile.getFullPath().toString(), null, loadResourceSet);
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists())
			fieldOfActivityRepository = (ISFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalModFile != null && internalModFile.exists())
			internalModificationMarkRepository = (AbstractISModificationRepository<?>)loadEmfModelFromResource(internalModFile.getFullPath().toString(), null, loadResourceSet);
		if (cidepfile != null && cidepfile.exists())
			componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(cidepfile.getFullPath().toString(), null, loadResourceSet);
		for (IFile usageModelFile: usageModelFiles) {
			if (usageModelFile != null && usageModelFile.exists()) {
				usageModels.put(usageModelFile.getName(), (UsageModel)loadEmfModelFromResource(
						usageModelFile.getFullPath().toString(), null, loadResourceSet));
			}
		}
		if (dataModelFile != null && dataModelFile.exists())
			dataModel = (DataModel)loadEmfModelFromResource(dataModelFile.getFullPath().toString(), null, loadResourceSet);
		if (organizationEnvironmentModelFile != null && organizationEnvironmentModelFile.exists())
			organizationEnvironmentModel = (OrganizationEnvironmentModel)loadEmfModelFromResource(organizationEnvironmentModelFile.getFullPath().toString(), null, loadResourceSet);
		
		return new BPArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, 
				internalModificationMarkRepository, componentInternalDependencyRepository, usageModels, 
				dataModel, organizationEnvironmentModel, adapter);
	}
	
	@Override
	public void save(String targetDirectoryPath, String filename, BPArchitectureVersion version) {
		savePCMAndKAMPModels(targetDirectoryPath, filename, version);
		saveBusinessProcessModels(targetDirectoryPath, filename, version);
	}
	
	public static void saveBusinessProcessModels(String targetDirectoryPath, String filename, BPArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		String usageModelFilePath = filename + "." + FILEEXTENSION_USAGEMODEL;
		String dataModelFilePath = filename + "." + FILEEXTENSION_DATAMODEL;
		String organizationEnvironmentModelFilePath = filename + "." + FILEEXTENSION_ORGANIZATIONENVIRONMENTMODEL;
		
		if (version.getUsageModels().containsKey(filename)) {
			saveEmfModelToResource(version.getUsageModels().get(filename), targetDirectoryPath, 
						usageModelFilePath, resourceSet);
		}
		if (version.getDataModel()!=null)
			saveEmfModelToResource(version.getDataModel(), targetDirectoryPath, dataModelFilePath, resourceSet);	
		if (version.getOrganizationEnvironmentModel()!=null)
			saveEmfModelToResource(version.getOrganizationEnvironmentModel(), targetDirectoryPath, organizationEnvironmentModelFilePath, resourceSet);	
	}
	
	@Override
	protected void registerEPackages(ResourceSet resourceSet) {
		registerKAMPPackages(resourceSet);
		registerBusinessProcessPackages(resourceSet);
	}
	
	public static void registerBusinessProcessPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(BPModificationmarksPackage.eNS_URI, 
				BPModificationmarksPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BPFieldOfActivityAnnotationsPackage.eNS_URI, 
				BPFieldOfActivityAnnotationsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(UsagemodelPackage.eNS_URI, UsagemodelPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BpusagemodelPackage.eNS_URI, BpusagemodelPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(DatamodelPackage.eNS_URI, DatamodelPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OrganizationenvironmentmodelPackage.eNS_URI, 
				OrganizationenvironmentmodelPackage.eINSTANCE);
	}
	
}
