package edu.kit.ipd.sdq.kamp4bp.core;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.usagemodel.Branch;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.Loop;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit;
import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse;

public enum BPActivityElementType implements AbstractActivityElementType {
	
	// Top-level activity element types in architecture
	ACQUIREDEVICERESOURCEACTION(AcquireDeviceResourceAction.class),
	ACTIVITY(Activity.class),
	ACTORSTEP(ActorStep.class),
	BRANCH(Branch.class),
	COMPOSITEDATAOBJECT(CompositeDataObject.class),
	COLLECTIONDATAOBJECT(CollectionDataObject.class),
	DEVICERESOURCE(DeviceResource.class),
	ENTRYLEVELSYSTEMCALL(EntryLevelSystemCall.class),
	LOOP(Loop.class),
	RELEASEDEVICERESOURCEACTION(ReleaseDeviceResourceAction.class),
	ROLE(Role.class),
	// Sub-activity element types
	ACTORSTEP_DATAOBJECT(DataObject.class),
	ACTORSTEP_ROLE(Role.class),
	COLLECTIONDATAOBJECT_INNEROBJECT(DataObject.class),
	COMPOSITEDATAOBJECT_INNERDECLARATION(InnerDataObjectDeclaration.class),
	ENTRYLEVELSYSTEMCALL_OPERATION(Signature.class),
	// Annotation-related element types
	GOOD(BPGood.class),
	MESSAGE(BPMessage.class),
	ORGANIZATIONALUNIT(BPOrganizationalUnit.class),
	TRAININGCOURSE(BPTrainingCourse.class);
	
	private final Class<?> clazz;
	private final String name;
	
	private BPActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public static BPActivityElementType getArchitectureActivityTypeForObject(EObject object) {
		for (BPActivityElementType type: BPActivityElementType.getTopLevelArchitectureActivityElementTypes()) {
			if (type.getElementClass().isAssignableFrom(object.getClass())) {
				return type;
			}
		}
		return null;
	}
	
	public static BPActivityElementType[] getTopLevelArchitectureActivityElementTypes() {
		return new BPActivityElementType[]{ACQUIREDEVICERESOURCEACTION, ACTIVITY, ACTORSTEP,
				BRANCH, COMPOSITEDATAOBJECT, COLLECTIONDATAOBJECT, DEVICERESOURCE,
				ENTRYLEVELSYSTEMCALL, LOOP, RELEASEDEVICERESOURCEACTION, ROLE};
	}
	
	public static BPActivityElementType getAnnotationActivityTypeForObject(EObject object) {
		for (BPActivityElementType type: BPActivityElementType.getAnnotationActivityElementTypes()) {
			if (type.getElementClass().isAssignableFrom(object.getClass())) {
				return type;
			}
		}
		return null;
	}
	
	public static BPActivityElementType[] getAnnotationActivityElementTypes() {
		return new BPActivityElementType[]{GOOD, MESSAGE, ORGANIZATIONALUNIT, 
				TRAININGCOURSE};
	}

}
