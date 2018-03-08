package edu.kit.ipd.sdq.kamp4is.core.derivation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.DataType;

import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityElementType;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityType;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider.ISLabelCustomizing;

public class ISDifferenceCalculation extends AbstractDifferenceCalculation<ISArchitectureVersion>{
	private final ISInternalModificationDerivation architectureInternalModificationDerivation = 
			new ISInternalModificationDerivation();
	private final ISSubactivityDerivation architectureSubactivityDerivation =
			new ISSubactivityDerivation();

	@Override
	public void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		for (ISActivityElementType elementType: ISActivityElementType.topLevelPCMActivityElementTypes()) {
			if (detectionRuleAdded(diffElement, elementType.getElementClass())) {
				if (elementType == ISActivityElementType.DATATYPE) {
					DataType architectureElement = (DataType)(((ReferenceChange)diffElement).getValue());
					workplan.add(new Activity(ISActivityType.ARCHITECTUREMODELDIFF, elementType, 
							architectureElement, ISLabelCustomizing.getDataTypeName(architectureElement), 
							null, BasicActivity.ADD, createAddElementDescription(architectureElement)));
				} else { //all other supported elements (including CompositeDataType and 
					// CollectionDataType are Entities -> NamedElements
					NamedElement architectureElement = (NamedElement)(((ReferenceChange)diffElement).getValue());
					Activity newActivity = new Activity(ISActivityType.ARCHITECTUREMODELDIFF, elementType, 
							architectureElement, architectureElement.getEntityName(), null,
							BasicActivity.ADD, createAddElementDescription(architectureElement));
					workplan.add(newActivity);
					this.architectureSubactivityDerivation.deriveSubactivities(
							architectureElement, newActivity);
				}
				return;
			} else if (detectionRuleDeleted(diffElement, elementType.getElementClass())) {
				if (elementType == ISActivityElementType.DATATYPE) {
					DataType architectureElement = (DataType)(((ReferenceChange)diffElement).getValue());
					workplan.add(new Activity(ISActivityType.ARCHITECTUREMODELDIFF, elementType, 
							architectureElement, ISLabelCustomizing.getDataTypeName(architectureElement), 
							null, BasicActivity.REMOVE, createRemoveElementDescription(architectureElement)));
				} else {
					NamedElement architectureElement = (NamedElement)(((ReferenceChange)diffElement).getValue());
					Activity newActivity = new Activity(ISActivityType.ARCHITECTUREMODELDIFF, elementType,
							architectureElement, architectureElement.getEntityName(), null,
							BasicActivity.REMOVE, createRemoveElementDescription(architectureElement));
					workplan.add(newActivity);
					this.architectureSubactivityDerivation.deriveSubactivities(
							architectureElement, newActivity);
				}
				return;
			}
		}
	}

	@Override
	public List<Activity> deriveWorkplan(ISArchitectureVersion baseVersion, ISArchitectureVersion targetVersion) {
		List<Activity> activityList = new ArrayList<Activity>();		
		List<Diff> repositoryDiff = calculateDiffModel(baseVersion.getRepository(), targetVersion.getRepository());
		List<Diff> systemDiff = calculateDiffModel(baseVersion.getSystem(), targetVersion.getSystem());

		List<Activity> repositoryActivities = deriveAddAndRemoveActivities(repositoryDiff);
		activityList.addAll(repositoryActivities);
		List<Activity> systemActivities = deriveAddAndRemoveActivities(systemDiff);
		activityList.addAll(systemActivities);
		List<Activity> internalModificationActivities = this.architectureInternalModificationDerivation.
				deriveInternalModifications(targetVersion);
		activityList.addAll(internalModificationActivities);
		
		return activityList;
	}
	
	public static String createAddElementDescription(NamedElement element) {
		return "Add " + element.eClass().getName() + " " + element.getEntityName() + ".";
	}
	
	public static String createAddElementDescription(DataType element) {
		return "Add " + element.eClass().getName() + " " + element.toString() + ".";
	}
	
	public static String createRemoveElementDescription(NamedElement element) {
		return "Remove " + element.eClass().getName() + " " + element.getEntityName() + ".";
	}
	
	public static String createRemoveElementDescription(DataType element) {
		return "Remove " + element.eClass().getName() + " " + ISLabelCustomizing.
				getDataTypeName(element) + ".";
	}
}
