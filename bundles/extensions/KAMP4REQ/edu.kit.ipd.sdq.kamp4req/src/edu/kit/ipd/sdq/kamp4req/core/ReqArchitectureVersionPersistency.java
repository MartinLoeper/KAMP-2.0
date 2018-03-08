package edu.kit.ipd.sdq.kamp4req.core;

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
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import decisions.DecisionRepository;
import decisions.DecisionsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4is.core.AbstractISArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage;
import options.OptionRepository;
import options.OptionsPackage;
import requirements.ReqRepository;
import requirements.RequirementsPackage;

public class ReqArchitectureVersionPersistency extends AbstractISArchitectureVersionPersistency<ReqArchitectureVersion> {

	public static final String FILEEXTENSION_REQUIREMENTS = "requirements";
	public static final String FILEEXTENSION_DECISIONS = "decisions";
	public static final String FILEEXTENSION_OPTIONS = "options";
	
	@Override
	public ReqArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		ECrossReferenceAdapter adapter = new ECrossReferenceAdapter();
		loadResourceSet.eAdapters().add(adapter);
		
		String repositoryfilePath = filename + "."+FILEEXTENSION_REPOSITORY;
		String systemfilePath = filename + "."+FILEEXTENSION_SYSTEM;
		String fieldOfActivityRepositoryFilePath = filename + "."+FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String cidepfilePath = filename + "." + FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES;
		String usageModelFilePath = filename + "." + BPArchitectureVersionPersistency.FILEEXTENSION_USAGEMODEL;
		String bpusageModelFilePath = filename + "." + BPArchitectureVersionPersistency.FILEEXTENSION_BPUSAGEMODEL;
		String dataModelFilePath = filename + "." + BPArchitectureVersionPersistency.FILEEXTENSION_DATAMODEL;
		String orgEnvironmentModelFilePath = filename + "." + BPArchitectureVersionPersistency.FILEEXTENSION_ORGANIZATIONENVIRONMENTMODEL;
		String requirementsFilePath = filename + "." + FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + FILEEXTENSION_OPTIONS;
		
		Repository repository = (Repository)loadEmfModelFromResource(folderpath, repositoryfilePath, loadResourceSet);
		System system = (System)loadEmfModelFromResource(folderpath, systemfilePath, loadResourceSet);
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = (ISFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		AbstractISModificationRepository<?> modificationMarkRepository = (AbstractISModificationRepository<?>)loadEmfModelFromResource(folderpath, internalModFilePath, loadResourceSet);
		ComponentInternalDependencyRepository componentInternalDependencyRepository = (ComponentInternalDependencyRepository)loadEmfModelFromResource(folderpath, cidepfilePath, loadResourceSet);
		// Usage-model could be a PCM one or an IntBIIS one (IntBIIS file extension preferred)
		UsageModel usageModel = (UsageModel)loadEmfModelFromResource(folderpath, bpusageModelFilePath, loadResourceSet);
		if (usageModel == null) {
			usageModel = (UsageModel)loadEmfModelFromResource(folderpath, usageModelFilePath, loadResourceSet);
		}
		DataModel dataModel = (DataModel)loadEmfModelFromResource(folderpath, dataModelFilePath, loadResourceSet);
		OrganizationEnvironmentModel orgEnviromentModel = (OrganizationEnvironmentModel)loadEmfModelFromResource(folderpath, orgEnvironmentModelFilePath, loadResourceSet);
		ReqRepository requirementRepostory = (ReqRepository)loadEmfModelFromResource(folderpath, requirementsFilePath, loadResourceSet);
		DecisionRepository decisionRepository = (DecisionRepository)loadEmfModelFromResource(folderpath, decisionsFilePath, loadResourceSet);
		OptionRepository optionRepository = (OptionRepository)loadEmfModelFromResource(folderpath, optionsFilePath, loadResourceSet);
		
		return new ReqArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, 
				modificationMarkRepository, componentInternalDependencyRepository, 
				Collections.singletonMap(BPArchitectureVersion.USAGEMODEL_DEFAULT_NAME, usageModel), 
				dataModel, orgEnviromentModel, requirementRepostory, decisionRepository, optionRepository, adapter);
	}

	@Override
	public ReqArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();	
		ECrossReferenceAdapter adapter = new ECrossReferenceAdapter();
		loadResourceSet.eAdapters().add(adapter);
		
		IFile repositoryfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_REPOSITORY);
		IFile systemfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_SYSTEM);
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		IFile cidepfile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_COMPONENTINTERNALDEPENDENCIES);
		// Usage-models could be a PCM one or an IntBIIS one
		Collection<IFile> usageModelFiles = FileAndFolderManagement.retrieveFilesWithExtension(folder, BPArchitectureVersionPersistency.FILEEXTENSION_BPUSAGEMODEL);
		usageModelFiles.addAll(FileAndFolderManagement.retrieveFilesWithExtension(folder, BPArchitectureVersionPersistency.FILEEXTENSION_USAGEMODEL));
		IFile dataModelFile = FileAndFolderManagement.retrieveFileWithExtension(folder, BPArchitectureVersionPersistency.FILEEXTENSION_DATAMODEL);
		IFile organizationEnvironmentModelFile = FileAndFolderManagement.retrieveFileWithExtension(folder, BPArchitectureVersionPersistency.FILEEXTENSION_ORGANIZATIONENVIRONMENTMODEL);
		IFile requirementsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_REQUIREMENTS);
		IFile decisionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_DECISIONS);
		IFile optionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_OPTIONS);
		
		Repository repository = null;
		System system = null;
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = null;
		AbstractISModificationRepository<?> modificationMarkRepository = null;
		ComponentInternalDependencyRepository componentInternalDependencyRepository = null;
		Map<String, UsageModel> usageModels = new HashMap<String, UsageModel>();
		DataModel dataModel = null;
		OrganizationEnvironmentModel organizationEnvironmentModel = null;
		ReqRepository requirementRepository = null;
		DecisionRepository decisionRepository = null;
		OptionRepository optionRepository = null;
		
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
		if (requirementsFile != null && requirementsFile.exists())
			requirementRepository = (ReqRepository)loadEmfModelFromResource(requirementsFile.getFullPath().toString(), null, loadResourceSet);
		if (decisionsFile != null && decisionsFile.exists())
			decisionRepository = (DecisionRepository)loadEmfModelFromResource(decisionsFile.getFullPath().toString(), null, loadResourceSet);
		if (optionsFile != null && optionsFile.exists())
			optionRepository = (OptionRepository)loadEmfModelFromResource(optionsFile.getFullPath().toString(), null, loadResourceSet);
		
		return new ReqArchitectureVersion(versionname, repository, system, fieldOfActivityRepository, 
				modificationMarkRepository, componentInternalDependencyRepository, usageModels, 
				dataModel, organizationEnvironmentModel, requirementRepository, decisionRepository,
				optionRepository, adapter);
	}
	
	@Override
	public void save(String targetDirectoryPath, String filename, ReqArchitectureVersion version) {
		savePCMAndKAMPModels(targetDirectoryPath, filename, version);
		BPArchitectureVersionPersistency.saveBusinessProcessModels(targetDirectoryPath, filename, version);
		saveRequirementsModel(targetDirectoryPath, filename, version);
	}
	
	public static void saveRequirementsModel(String targetDirectoryPath, String filename, ReqArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		String requirementsFilePath = filename + "." + FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + FILEEXTENSION_OPTIONS;
		
		if (version.getRequirementsRepository() != null)
			saveEmfModelToResource(version.getRequirementsRepository(), targetDirectoryPath, requirementsFilePath, resourceSet);		
		if (version.getDecisionRepository() != null)
			saveEmfModelToResource(version.getDecisionRepository(), targetDirectoryPath, decisionsFilePath, resourceSet);		
		if (version.getOptionRepository() != null)
			saveEmfModelToResource(version.getOptionRepository(), targetDirectoryPath, optionsFilePath, resourceSet);
	}
	
	@Override
	protected void registerEPackages(ResourceSet resourceSet) {
		registerKAMPPackages(resourceSet);
		BPArchitectureVersionPersistency.registerBusinessProcessPackages(resourceSet);
		registerRequirementsPackages(resourceSet);
    }
	
	public static void registerRequirementsPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(ReqModificationmarksPackage.eNS_URI, ReqModificationmarksPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(DecisionsPackage.eNS_URI, DecisionsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OptionsPackage.eNS_URI, OptionsPackage.eINSTANCE);
	}
	
}
