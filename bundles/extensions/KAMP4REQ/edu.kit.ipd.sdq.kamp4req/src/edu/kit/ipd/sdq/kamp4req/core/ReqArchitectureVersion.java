package edu.kit.ipd.sdq.kamp4req.core;

import java.util.Map;

import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp.architecture.CrossReferenceProvider;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import options.OptionRepository;
import options.OptionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;

/**
 * This class adds support for the requirements-related repositories for 
 * requirements/options/decisions as fields.
 */
public class ReqArchitectureVersion extends BPArchitectureVersion {
	
	private ReqRepository requirementsRepository;
	private DecisionRepository decisionRepository;
	private OptionRepository optionRepository;
	
	public ReqArchitectureVersion(String name, Repository repository, System system,
			ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository,
			AbstractISModificationRepository<?> internalModificationMarkRepository,
			ComponentInternalDependencyRepository componentInternalDependencyRepository, 
			Map<String, UsageModel> usageModels, DataModel dataModel, OrganizationEnvironmentModel
			organizationEnvironmentModel, ReqRepository requirementsRepository, 
			DecisionRepository decisionRepository, OptionRepository optionRepository, ECrossReferenceAdapter eCrossReferenceAdapter) {
		super(name, repository, system, fieldOfActivityRepository, internalModificationMarkRepository,
				componentInternalDependencyRepository, usageModels, dataModel, organizationEnvironmentModel, eCrossReferenceAdapter);
		if (requirementsRepository == null) {
			requirementsRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		}
		this.setRequirementsRepository(requirementsRepository);
		if (decisionRepository == null) {
			decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		}
		this.setDecisionRepository(decisionRepository);
		if (optionRepository == null) {
			optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		}
		this.setOptionRepository(optionRepository);
	}

	public ReqRepository getRequirementsRepository() {
		return requirementsRepository;
	}

	public void setRequirementsRepository(ReqRepository requirementsRepository) {
		this.requirementsRepository = requirementsRepository;
	}

	public DecisionRepository getDecisionRepository() {
		return decisionRepository;
	}

	public void setDecisionRepository(DecisionRepository decisionRepository) {
		this.decisionRepository = decisionRepository;
	}

	public OptionRepository getOptionRepository() {
		return optionRepository;
	}

	public void setOptionRepository(OptionRepository optionRepository) {
		this.optionRepository = optionRepository;
	}

}
