package edu.kit.ipd.sdq.kamp4req.core;

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
import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationRepository;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqSeedModifications;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksFactory;
import options.OptionRepository;
import options.OptionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;

public class ReqArchitectureModelFactoryFacade {

	public static ReqArchitectureVersion createEmptyReqModel(String name) {
		Repository repository = ISArchitectureModelFactoryFacade.createRepository(name);
		System system = ISArchitectureModelFactoryFacade.createSystem();
		ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository = BPArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		ReqModificationRepository internalModificationMarkRepository = createReqModificationMarkRepository();
		ComponentInternalDependencyRepository componentInternalDependencyRepository = ISArchitectureModelFactoryFacade.createComponentInternalDependencyRepository();
		UsageModel usageModel = UsagemodelFactory.eINSTANCE.createUsageModel();
		DataModel dataModel = DatamodelFactory.eINSTANCE.createDataModel();
		OrganizationEnvironmentModel organizationEnvironmentModel = OrganizationenvironmentmodelFactory.eINSTANCE.createOrganizationEnvironmentModel();
		ReqRepository requirementRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		DecisionRepository decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		OptionRepository optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		return new ReqArchitectureVersion(name, repository, system, fieldOfActivityRepository, 
				internalModificationMarkRepository, componentInternalDependencyRepository, 
				Collections.singletonMap(BPArchitectureVersion.USAGEMODEL_DEFAULT_NAME, usageModel), 
				dataModel, organizationEnvironmentModel, requirementRepository, decisionRepository, 
				optionRepository, null);
	}
	
	public static ReqModificationRepository createReqModificationMarkRepository() {
		ReqModificationRepository repository = ReqModificationmarksFactory.eINSTANCE.createReqModificationRepository();

		ReqSeedModifications seedModifications = ReqModificationmarksFactory.eINSTANCE.createReqSeedModifications();
		repository.setSeedModifications(seedModifications);
		
		return repository;
	}

}
