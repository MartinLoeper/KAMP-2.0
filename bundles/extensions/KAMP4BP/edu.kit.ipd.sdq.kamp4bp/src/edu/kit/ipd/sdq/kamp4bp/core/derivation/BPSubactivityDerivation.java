package edu.kit.ipd.sdq.kamp4bp.core.derivation;

import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4bp.core.BPActivityElementType;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISSubactivityDerivation;

public class BPSubactivityDerivation {
	
	protected void deriveSubacitvities(NamedElement architectureElement, Activity activity) {
		if (architectureElement instanceof CollectionDataObject) {
			this.deriveCollectionDataObjectSubacitvities(
					(CollectionDataObject) architectureElement, activity);
		} else if (architectureElement instanceof CompositeDataObject) {
			this.deriveCompositeDataObjectSubacitvities(
					(CompositeDataObject) architectureElement, activity);	
		} else if (architectureElement instanceof EntryLevelSystemCall) {
			this.deriveELSCSubacitvities((EntryLevelSystemCall) architectureElement, activity);		
		} else if (architectureElement instanceof ActorStep) {
			this.deriveActorStepSubactivities((ActorStep) architectureElement, activity);
		} else if (architectureElement instanceof AcquireDeviceResourceAction) {
			this.deriveAcquireDeviceResourceActionSubactivities((AcquireDeviceResourceAction)
					architectureElement, activity);
		} else if (architectureElement instanceof ReleaseDeviceResourceAction) {
			this.deriveReleaseDeviceResourceActionSubactivities((ReleaseDeviceResourceAction)
					architectureElement, activity);
		}
	}

	protected void deriveCollectionDataObjectSubacitvities(CollectionDataObject dataObject, 
			Activity dataObjectActivity) {
		for(DataObject<?> innerDataObject: dataObject.getInnerDataObjects()) {
			ISSubactivityDerivation.addSubActivity(innerDataObject, 
					BPActivityElementType.COLLECTIONDATAOBJECT_INNEROBJECT, 
					dataObject, dataObjectActivity);
		}
	}
	
	protected void deriveCompositeDataObjectSubacitvities(CompositeDataObject dataObject, 
			Activity dataObjectActivity) {
		for(InnerDataObjectDeclaration innerDataObjectDeclaration: 
				dataObject.getInnerDataObjectDeclarations()) {
			ISSubactivityDerivation.addSubActivity(innerDataObjectDeclaration, 
					BPActivityElementType.COMPOSITEDATAOBJECT_INNERDECLARATION, 
					dataObject, dataObjectActivity);
		}
	}
	
	protected void deriveELSCSubacitvities(EntryLevelSystemCall elsc, Activity elscActivity) {
		OperationSignature signature = elsc.getOperationSignature__EntryLevelSystemCall();
		if (signature != null) {
			ISSubactivityDerivation.addSubActivity(signature, 
					BPActivityElementType.ENTRYLEVELSYSTEMCALL_OPERATION, 
					elsc, elscActivity);
		}
	}
	
	protected void deriveActorStepSubactivities(ActorStep actorStep, Activity actorActivity) {
		List<DataObject<?>> dataObjects = new LinkedList<DataObject<?>>();
		dataObjects.addAll(actorStep.getInputDataObjects());
		dataObjects.addAll(actorStep.getOutputDataObjects());
		for (DataObject<?> dataObject: dataObjects) {
			ISSubactivityDerivation.addSubActivity(dataObject, 
					BPActivityElementType.ACTORSTEP_DATAOBJECT, actorStep, actorActivity);
		}
		Role role = actorStep.getResponsibleRole();
		if (role != null) {
			ISSubactivityDerivation.addSubActivity(role, BPActivityElementType.ACTORSTEP_ROLE, 
					actorStep, actorActivity);
		}
	}
	
	protected void deriveAcquireDeviceResourceActionSubactivities(AcquireDeviceResourceAction acquireAction,
			Activity acquireActivity) {
		DeviceResource deviceResource = acquireAction.getPassiveresource_AcquireAction();
		if (deviceResource != null) {
			ISSubactivityDerivation.addSubActivity(deviceResource, 
					BPActivityElementType.DEVICERESOURCE, acquireAction, acquireActivity);
		}
	}
	
	protected void deriveReleaseDeviceResourceActionSubactivities(ReleaseDeviceResourceAction releaseAction,
			Activity releaseActivity) {
		DeviceResource deviceResource = releaseAction.getPassiveresource_ReleaseAction();
		if (deviceResource != null) {
			ISSubactivityDerivation.addSubActivity(deviceResource, 
					BPActivityElementType.DEVICERESOURCE, releaseAction, releaseActivity);
		}
	}

}
