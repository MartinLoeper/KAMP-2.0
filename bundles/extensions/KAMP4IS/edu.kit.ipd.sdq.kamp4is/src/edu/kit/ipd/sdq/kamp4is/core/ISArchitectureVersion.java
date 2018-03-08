package edu.kit.ipd.sdq.kamp4is.core;

import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependenciesFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;

import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.system.SystemFactory;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;

public class ISArchitectureVersion extends AbstractArchitectureVersion<AbstractISModificationRepository<?>> {
	private Repository repository;
	private org.palladiosimulator.pcm.system.System system;
	private ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository;
	private ComponentInternalDependencyRepository componentInternalDependencyRepository;
	
	public ISArchitectureVersion(String name, Repository repository, System system,
			ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository,
			AbstractISModificationRepository<?> modificationMarkRepository,
			ComponentInternalDependencyRepository componentInternalDependencyRepository) {
		super(name, modificationMarkRepository);
		// Some of the files describing the architecture might not exist; prevent NullPointer
		// in propagation algorithm by setting newly created objects (whose EReferences are
		// instantiated with empty collections, so the algorithm can handle them)
		if (repository == null) {
			repository = RepositoryFactory.eINSTANCE.createRepository();
		}
		this.repository = repository;
		if (system == null) {
			system = SystemFactory.eINSTANCE.createSystem();
		}
		this.system = system;
		if (fieldOfActivityRepository == null) {
			fieldOfActivityRepository = ISFieldOfActivityAnnotationsFactory.eINSTANCE.
					createISFieldOfActivityAnnotationsRepository();
		}
		this.fieldOfActivityRepository = fieldOfActivityRepository;
		if (componentInternalDependencyRepository == null) {
			componentInternalDependencyRepository = ComponentInternalDependenciesFactory.eINSTANCE.
					createComponentInternalDependencyRepository();
		}
		this.componentInternalDependencyRepository = componentInternalDependencyRepository;
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public org.palladiosimulator.pcm.system.System getSystem() {
		return system;
	}

	public void setSystem(org.palladiosimulator.pcm.system.System system) {
		this.system = system;
	}

	public ISFieldOfActivityAnnotationsRepository getFieldOfActivityRepository() {
		return fieldOfActivityRepository;
	}

	public void setFieldOfActivityRepository(
			ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository) {
		this.fieldOfActivityRepository = fieldOfActivityRepository;
	}

	public ComponentInternalDependencyRepository getComponentInternalDependencyRepository() {
		return componentInternalDependencyRepository;
	}

	public void setComponentInternalDependencyRepository(
			ComponentInternalDependencyRepository componentInternalDependencyRepository) {
		this.componentInternalDependencyRepository = componentInternalDependencyRepository;
	}

}
