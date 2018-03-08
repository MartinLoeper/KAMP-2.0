package edu.kit.ipd.sdq.kamp4bp.core.derivation;

import java.util.ArrayList;
import java.util.List;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.AbstractISModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4bp.core.BPActivityElementType;
import edu.kit.ipd.sdq.kamp4bp.core.BPActivityType;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityElementType;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISInternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAcquireDeviceResourceAction;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction;

public class BPInternalModificationDerivation {
	
	// Fields should be set by user, but defaults used to prevent NullPointer
	private BPChangePropagationDueToDataDependencies bpChangePropagationDueToDataDependencies =
			BPModificationmarksFactory.eINSTANCE.createBPChangePropagationDueToDataDependencies();
	private BPInterBusinessProcessPropagation interBusinessPropagation =
			BPModificationmarksFactory.eINSTANCE.createBPInterBusinessProcessPropagation();
	
	public List<Activity> deriveInternalModifications(BPArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();
		if (targetVersion.getModificationMarkRepository() != null) {
			this.findRelevantPropagationSteps(targetVersion.getModificationMarkRepository());
			this.deriveDataTypeModifications(activityList);			
			this.deriveDataObjectModifications(activityList);
			this.deriveUserActionModifications(activityList);
		}
		return activityList;
	}
	
	/**
	 * Relevant for KAMP+IntBIIS are only propagation because of data dependencies and
	 * business processes (both model elements should only exist once). All other kinds
	 * of steps are handled by the superclass.
	 */
	private void findRelevantPropagationSteps(AbstractISModificationRepository<?> 
			modificationRepository) {
		for (ChangePropagationStep step: modificationRepository.getChangePropagationSteps()) {
			if (step instanceof BPChangePropagationDueToDataDependencies) {
				this.setChangePropagationDueToDataDependencies(
						(BPChangePropagationDueToDataDependencies) step);
			} else if (step instanceof BPInterBusinessProcessPropagation) {
				this.setInterBusinessPropagation((BPInterBusinessProcessPropagation) step);
			}
		}
	}

	private void deriveDataTypeModifications(List<Activity> activityList) {
		List<ISModifyDataType> datatypeModifications = new ArrayList<ISModifyDataType>(this.
				getChangePropagationDueToDataDependencies().getDatatypeModifications());
		for (ISModifyDataType modifyDatatype : datatypeModifications) {
			activityList.add(ISInternalModificationDerivation.createModificationActivity(
					modifyDatatype, ISActivityElementType.DATATYPE));
		}
	}
	
	private void deriveDataObjectModifications(List<Activity> activityList) {
		List<BPModifyDataObject> dataObjectModifications = new ArrayList<BPModifyDataObject>(
				this.getChangePropagationDueToDataDependencies().getDataObjectModifications());
		for (BPModifyDataObject modifyDataObject : dataObjectModifications) {
			activityList.add(ISInternalModificationDerivation.createModificationActivity(
					modifyDataObject, BPActivityElementType.getArchitectureActivityTypeForObject(
							modifyDataObject.getAffectedElement())));
		}
	}
	
	private void deriveUserActionModifications(List<Activity> activityList) {
		List<BPModifyAbstractUserAction<?>> userActionModifications = 
				new ArrayList<BPModifyAbstractUserAction<?>>(this.getInterBusinessPropagation().
						getAbstractUserActionModifications());
		userActionModifications.addAll(this.getChangePropagationDueToDataDependencies().
				getActorStepModifications());
		userActionModifications.addAll(this.getChangePropagationDueToDataDependencies().
				getEntryLevelSystemCallModifications());
		for (BPModifyAbstractUserAction<?> modifyAbstractUserAction :  userActionModifications) {
			// Propagation algorithm detects if acquire or release action of a 
			// marked DeviceResource are missing
			if (modifyAbstractUserAction instanceof BPModifyAcquireDeviceResourceAction
					&& modifyAbstractUserAction.getAffectedElement() == null) {
				DeviceResource deviceResource = ((BPModifyAcquireDeviceResourceAction)
						modifyAbstractUserAction).getAffectedElement().getPassiveresource_AcquireAction();
				activityList.add(new Activity(BPActivityType.WARNING, 
						BPActivityElementType.ACQUIREDEVICERESOURCEACTION, deviceResource, 
						deviceResource.getEntityName(), null, BasicActivity.MODIFY, 
						"Warning: No matching acquire action found."));
			} else if (modifyAbstractUserAction instanceof BPModifyReleaseDeviceResourceAction
					&& modifyAbstractUserAction.getAffectedElement() == null) {
				DeviceResource deviceResource = ((BPModifyReleaseDeviceResourceAction)
						modifyAbstractUserAction).getAffectedElement().getPassiveresource_ReleaseAction();
				activityList.add(new Activity(BPActivityType.WARNING, 
						BPActivityElementType.RELEASEDEVICERESOURCEACTION, deviceResource,
						deviceResource.getEntityName(), null, BasicActivity.MODIFY, 
						"Warning: No matching release action found."));
			} else {
				activityList.add(ISInternalModificationDerivation.createModificationActivity(
						modifyAbstractUserAction, BPActivityElementType.getArchitectureActivityTypeForObject(
								modifyAbstractUserAction.getAffectedElement())));
			}
		}
	}
	
	protected BPChangePropagationDueToDataDependencies getChangePropagationDueToDataDependencies() {
		return bpChangePropagationDueToDataDependencies;
	}

	protected void setChangePropagationDueToDataDependencies(
			BPChangePropagationDueToDataDependencies bpChangePropagationDueToDataDependencies) {
		this.bpChangePropagationDueToDataDependencies = bpChangePropagationDueToDataDependencies;
	}

	protected BPInterBusinessProcessPropagation getInterBusinessPropagation() {
		return interBusinessPropagation;
	}

	protected void setInterBusinessPropagation(BPInterBusinessProcessPropagation interBusinessPropagation) {
		this.interBusinessPropagation = interBusinessPropagation;
	}
	
}
