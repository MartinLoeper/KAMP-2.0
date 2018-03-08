package edu.kit.ipd.sdq.kamp4is.core;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.system.SystemFactory;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDevelopmentArtefactSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISStaffSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestSpecification;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;

public class ISArchitectureModelFactoryFacade {
	
	public static ISArchitectureVersion createEmptyModel(String name) {
		Repository repository = ISArchitectureModelFactoryFacade.createRepository(name);
		System system = ISArchitectureModelFactoryFacade.createSystem();
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = ISArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		ISModificationRepository modificationMarkRepository = ISArchitectureModelFactoryFacade.createModificationmarksRepository();
		ComponentInternalDependencyRepository componentInternalDependencyRepository = ISArchitectureModelFactoryFacade.createComponentInternalDependencyRepository();
		return new ISArchitectureVersion(name, repository, system, fieldOfActivityRepository, modificationMarkRepository, componentInternalDependencyRepository);
	}
	
	public static Repository createRepository(String name) {
		Repository repository = RepositoryFactory.eINSTANCE.createRepository();
		repository.setEntityName(name);
		return repository;
	}
	
	public static org.palladiosimulator.pcm.system.System createSystem() {
		return SystemFactory.eINSTANCE.createSystem();
	}
	
	public static ISModificationRepository createModificationmarksRepository() {
		ISModificationRepository repository = ISModificationmarksFactory.eINSTANCE.createISModificationRepository();

		ISSeedModifications seedModifications = ISModificationmarksFactory.eINSTANCE.createISSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}

	public static ComponentInternalDependencyRepository createComponentInternalDependencyRepository() {
		return ComponentInternalDependenciesFactory.eINSTANCE.createComponentInternalDependencyRepository();
	}

	public static ISFieldOfActivityAnnotationsRepository createFieldOfActivityAnnotationsRepository() {
		ISFieldOfActivityAnnotationsRepository repository =  ISFieldOfActivityAnnotationsFactory.eINSTANCE.createISFieldOfActivityAnnotationsRepository();
		
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
		
		return repository;
	}

}
