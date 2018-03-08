package edu.kit.ipd.sdq.kamp4bp.core;

import java.util.Collections;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsagemodelFactory;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelFactory;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationRepository;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPSeedModifications;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification;

public class BPArchitectureModelFactoryFacade {

	public static BPArchitectureVersion createEmptyBPModel(String name) {
		Repository repository = ISArchitectureModelFactoryFacade.createRepository(name);
		System system = ISArchitectureModelFactoryFacade.createSystem();
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = BPArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		BPModificationRepository modificationMarkRepository = BPArchitectureModelFactoryFacade.createModificationMarkRepository();
		ComponentInternalDependencyRepository componentInternalDependencyRepository = ISArchitectureModelFactoryFacade.createComponentInternalDependencyRepository();
		UsageModel usageModel = UsagemodelFactory.eINSTANCE.createUsageModel();
		DataModel dataModel = DatamodelFactory.eINSTANCE.createDataModel();
		OrganizationEnvironmentModel organizationEnvironmentModel = OrganizationenvironmentmodelFactory.eINSTANCE.createOrganizationEnvironmentModel();
		
		return new BPArchitectureVersion(name, repository, system, fieldOfActivityRepository, 
				modificationMarkRepository, componentInternalDependencyRepository, 
				Collections.singletonMap(BPArchitectureVersion.USAGEMODEL_DEFAULT_NAME, usageModel), 
				dataModel, organizationEnvironmentModel, null);
	}
	
	public static BPFieldOfActivityAnnotationsRepository createFieldOfActivityAnnotationsRepository() {
		BPFieldOfActivityAnnotationsRepository repository =  BPFieldOfActivityAnnotationsFactory.eINSTANCE.createBPFieldOfActivityAnnotationsRepository();
		
		ISDevelopmentArtefactSpecification devSpec = ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISDevelopmentArtefactSpecification();
		repository.setDevelopmentArtefactSpecification(devSpec);
		ISDeploymentSpecification deploymentSpec = ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISDeploymentSpecification();
		repository.setDeploymentSpecification(deploymentSpec);
		ISTestSpecification testSpec = ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISTestSpecification();
		repository.setTestSpecification(testSpec);
		ISReleaseSpecification releaseSpec = ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISReleaseSpecification();
		repository.setReleaseSpecification(releaseSpec);
		ISBuildSpecification buildSpec = ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISBuildSpecification();
		repository.setBuildSpecification(buildSpec);
		ISStaffSpecification staffSpec = ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISStaffSpecification();
		repository.setStaffSpecification(staffSpec);
		staffSpec.setPersonList(ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISPersonList());
		staffSpec.setRoleList(ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISRoleList());
		BPBusinessProcessSpecification busiennsSpec = BPFieldOfActivityAnnotationsFactory.eINSTANCE.createBPBusinessProcessSpecification();
		repository.setBusinessProcessSpecification(busiennsSpec);
		
		return repository;
	}
	
	public static BPModificationRepository createModificationMarkRepository() {
		BPModificationRepository repository = BPModificationmarksFactory.eINSTANCE.createBPModificationRepository();

		BPSeedModifications seedModifications = BPModificationmarksFactory.eINSTANCE.createBPSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}

}
