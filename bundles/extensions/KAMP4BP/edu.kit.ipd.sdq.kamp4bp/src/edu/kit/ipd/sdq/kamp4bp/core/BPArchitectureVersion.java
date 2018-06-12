package edu.kit.ipd.sdq.kamp4bp.core;

import java.util.Map;

import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsagemodelFactory;

import de.uhd.ifi.se.pcm.bppcm.datamodel.DataModel;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DatamodelFactory;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelFactory;
import de.uka.ipd.sdq.componentInternalDependencies.ComponentInternalDependencyRepository;
import edu.kit.ipd.sdq.kamp.architecture.CrossReferenceProvider;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;

/**
 * Be aware that this class is not parameterized. It adds the business
 * process-related usage model, data model and organization environment model as
 * fields, but the <code>internalModificationMarkRepository</code> and
 * <code>fieldOfActivityRepository</code> could also be the normal KAMP ones
 * without the business process additions. This ensures backwards compatibility
 * (old files that do not have a KAMP+INTBIIS model, but a KAMP model, can be
 * still be processed).
 */
public class BPArchitectureVersion extends ISArchitectureVersion {

	public static final String USAGEMODEL_DEFAULT_NAME = "default";

	private Map<String, UsageModel> usageModels;
	private DataModel dataModel;
	private OrganizationEnvironmentModel organizationEnvironmentModel;

	public BPArchitectureVersion(String name, Repository repository, System system,
			ISFieldOfActivityAnnotationsRepository fieldOfActivityRepository,
			AbstractISModificationRepository<?> modificationMarkRepository,
			ComponentInternalDependencyRepository componentInternalDependencyRepository,
			Map<String, UsageModel> usageModels, DataModel dataModel,
			OrganizationEnvironmentModel organizationEnvironmentModel, ECrossReferenceAdapter eCrossReferenceAdapter) {
		super(name, repository, system, fieldOfActivityRepository, modificationMarkRepository,
				componentInternalDependencyRepository, eCrossReferenceAdapter);
	
		if (usageModels.isEmpty()) {
			usageModels.put(USAGEMODEL_DEFAULT_NAME, UsagemodelFactory.eINSTANCE.createUsageModel());
		}
		this.setUsageModels(usageModels);
		if (dataModel == null) {
			dataModel = DatamodelFactory.eINSTANCE.createDataModel();
		}
		this.dataModel = dataModel;
		if (organizationEnvironmentModel == null) {
			organizationEnvironmentModel = OrganizationenvironmentmodelFactory.eINSTANCE
					.createOrganizationEnvironmentModel();
		}
		this.organizationEnvironmentModel = organizationEnvironmentModel;
	}

	public Map<String, UsageModel> getUsageModels() {
		return usageModels;
	}

	public void setUsageModels(Map<String, UsageModel> usageModela) {
		this.usageModels = usageModela;
	}

	public DataModel getDataModel() {
		return dataModel;
	}

	public void setDataModel(DataModel dataModel) {
		this.dataModel = dataModel;
	}

	public OrganizationEnvironmentModel getOrganizationEnvironmentModel() {
		return organizationEnvironmentModel;
	}

	public void setOrganizationEnvironmentModel(OrganizationEnvironmentModel organizationEnvironmentModel) {
		this.organizationEnvironmentModel = organizationEnvironmentModel;
	}

}
