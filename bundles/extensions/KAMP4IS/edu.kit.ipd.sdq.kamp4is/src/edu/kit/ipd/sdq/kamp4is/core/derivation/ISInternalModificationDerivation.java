package edu.kit.ipd.sdq.kamp4is.core.derivation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider.ISLabelCustomizing;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityElementType;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityType;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersion;

public class ISInternalModificationDerivation {
	
	public static List<String> getCausingElementsNames(AbstractModification<?, ?>
			modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement: modification.getCausingElements()) {
			if (causingElement instanceof Entity) {
				Entity causingEntity = (Entity) causingElement;
				causingElementNames.add(causingEntity.eClass().getName() + " \"" 
						+ causingEntity.getEntityName() + "\"");
			} else if (causingElement instanceof DataType) {
				DataType causingDataType = (DataType) causingElement;
				causingElementNames.add(causingDataType.eClass().getName() + " \""
						+ ISLabelCustomizing.getDataTypeName(causingDataType) +"\"");
			}
		}
		return causingElementNames;
	}
	
	public static Activity createModificationActivity(AbstractModification<?, ?> 
			modification, List<String> causingElementNames, 
			AbstractActivityElementType activityElementType) {
		if (modification instanceof ISModifyEntity<?>) {
			Entity entity = ((ISModifyEntity<?>) modification).getAffectedElement();
			return new Activity(ISActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					entity, entity.getEntityName(), causingElementNames, 
					BasicActivity.MODIFY, "Modify " + entity.eClass().getName() + " " 
					+ entity.getEntityName() + ".");
		} else if (modification instanceof ISModifyDataType) {
			DataType dataType = ((ISModifyDataType) modification).getAffectedElement();
			String dataTypeName = ISLabelCustomizing.getDataTypeName(dataType);
			return new Activity(ISActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					dataType, dataTypeName, causingElementNames, BasicActivity.MODIFY, 
					"Modify DataType " + dataTypeName + ".");
		} else {
			return null;
		}
	}
	
	public static Activity createModificationActivity(AbstractModification<?, ?> 
			modification, AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}
	
	public static Activity addModificationSubActivity(AbstractModification<?, ?>
			modification, AbstractActivityElementType activityType, Activity superActivity) {
		Activity result = createModificationActivity(modification, activityType);
		superActivity.addSubActivity(result);
		return result;
	}
	
	public List<Activity> deriveInternalModifications(ISArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();
		
		this.deriveComponentModifications(targetVersion, activityList);
		this.deriveInterfaceModifications(targetVersion, activityList);
		
		return activityList;
	}
	
	private void deriveComponentModifications(ISArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ISModifyComponent> modifyComponents = ArchitectureModelLookup.
				lookUpAllCalculatedMarksOfAType(targetVersion, ISModifyComponent.class);
		for (ISModifyComponent modifyComponent : modifyComponents) {
			Activity componentActivity = createModificationActivity(modifyComponent, 
					   ISActivityElementType.COMPONENT);
			activityList.add(componentActivity);
			this.deriveSubActivities(modifyComponent, componentActivity);
		}
	}
	
	private void deriveInterfaceModifications(ISArchitectureVersion targetVersion, List<Activity> activityList) {
		Collection<ISModifyInterface> modifyInterfaces = ArchitectureModelLookup.
				lookUpAllCalculatedMarksOfAType(targetVersion, ISModifyInterface.class);
		for (ISModifyInterface modifyInterface : modifyInterfaces) {
			Activity interfaceActivity = createModificationActivity(modifyInterface, 
					ISActivityElementType.INTERFACE);
			activityList.add(interfaceActivity);
			for (ISModifySignature modifySignature : modifyInterface.getSignatureModifications()) {
				addModificationSubActivity(modifySignature, ISActivityElementType.SIGNATURE, 
						interfaceActivity);
			}
		}
	}

	private void deriveSubActivities(ISModifyComponent modifyComponent, 
			Activity componentActivity) {
		for (ISModifyProvidedRole modifyProvidedRole : modifyComponent.getProvidedRoleModifications()) {			
		    Activity providedRoleActivity = addModificationSubActivity(modifyProvidedRole, 
						ISActivityElementType.PROVIDEDROLE, componentActivity);
		    for (ISModifySignature modifySignature : modifyProvidedRole.getSignatureModifications()) {	
				addModificationSubActivity(modifySignature, ISActivityElementType.PROVIDEDOPERATION, 
							providedRoleActivity);
			}
		}
		for (ISModifyRequiredRole modifyRequiredRole : modifyComponent.getRequiredRoleModifications()) {			
		    Activity requiredRoleActivity = addModificationSubActivity(modifyRequiredRole, 
						ISActivityElementType.REQUIREDROLE, componentActivity);
		    for (ISModifySignature modifySignature : modifyRequiredRole.getSignatureModifications()) {
				addModificationSubActivity(modifySignature, ISActivityElementType.REQUIREDOPERATION, 
							requiredRoleActivity);
			}
		}
	}
}
