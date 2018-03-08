package edu.kit.ipd.sdq.kamp4req.core.derivation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider.ISLabelCustomizing;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityElementType;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityType;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISInternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4req.core.ReqActivityElementType;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyTraceableObject;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity;
import options.Option;
import relations.TraceableObject;
import requirements.Requirement;

public class ReqInternalModificationDerivation {
	
	public static List<String> getCausingElementsNames(AbstractModification<?,?> 
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
			} else if (causingElement instanceof TraceableObject) {
				TraceableObject causingTraceableObject = (TraceableObject) causingElement;
				causingElementNames.add(causingTraceableObject.eClass().getName() + " \"" 
						+ getElementNameForTraceableObject(causingTraceableObject) + "\"");
			}
		}
		return causingElementNames;
	}
	
	public static Activity createModificationActivity(AbstractModification<?,?> 
			modification, List<String> causingElementNames, 
			AbstractActivityElementType activityElementType) {
		Activity result = ISInternalModificationDerivation.createModificationActivity(
				modification, causingElementNames, activityElementType);
		if (result != null) {
			return result;
		} else if (modification instanceof ReqModifyTraceableObject<?>) {
			TraceableObject traceableObject = ((ReqModifyTraceableObject<?>) modification).
					getAffectedElement();
			String elementName = getElementNameForTraceableObject(traceableObject);
			return new Activity(ISActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					traceableObject, elementName, causingElementNames, BasicActivity.MODIFY, 
					"Modify " + traceableObject.eClass().getName() + " " + elementName + ".");
		} else {
			return null;
		}
	}
	
	public static Activity createModificationActivity(AbstractModification<?,?>  
			modification, AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}
	
	protected static String getElementNameForTraceableObject(TraceableObject object) {
		if (object instanceof Requirement) {
			return "\"" + ((Requirement)object).getSpecification() + "\"";
		} else if (object instanceof Decision) {
			return "\"" + ((Decision)object).getDescription() + "\"";
		} else if (object instanceof Option) {
			return "\"" + ((Option)object).getDescription() + "\"";
		} else {
			return null;
		}
	}

	public List<Activity> deriveInternalModifications(ReqArchitectureVersion targetVersion) {
		List<Activity> activityList = new LinkedList<Activity>();
		for (ChangePropagationStep currentPropagationStep: targetVersion.
				getModificationMarkRepository().getChangePropagationSteps()) {
			if (currentPropagationStep instanceof ReqChangePropagationDueToSpecificationDependencies) {
				ReqChangePropagationDueToSpecificationDependencies cp =
						(ReqChangePropagationDueToSpecificationDependencies) currentPropagationStep;
				this.deriveTraceableObjectModifications(cp.getRequirementModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getDecisionModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getOptionModifications(), activityList);
				this.deriveDataTypeModifications(cp.getDataTypeModifications(), activityList);
				this.deriveEntityModifications(cp.getEntityModifications(), activityList);
			}
		}
		return activityList;
	}
	
	private void deriveTraceableObjectModifications(Collection<? extends ReqModifyTraceableObject<?>> 
			modifications, List<Activity> activityList) {
		for (ReqModifyTraceableObject<?> modification: modifications) {
			activityList.add(createModificationActivity(modification, ReqActivityElementType.
					getActivityTypeForObject(modification.getAffectedElement())));
		}
	}
	
	private void deriveDataTypeModifications(Collection<ISModifyDataType> 
			modifications, List<Activity> activityList) {
		for (ISModifyDataType modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					ISActivityElementType.DATATYPE));
		}
	}
	
	private void deriveEntityModifications(Collection<? extends ReqModifyEntity> 
			modifications, List<Activity> activityList) {
		for (ReqModifyEntity modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					ReqActivityElementType.ENTITY));
		}
	}
	
}
