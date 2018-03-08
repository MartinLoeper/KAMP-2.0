package edu.kit.ipd.sdq.kamp4bp.core.derivation;

import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4bp.core.BPActivityElementType;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityType;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISDifferenceCalculation;

public class BPDifferenceCalculation extends AbstractDifferenceCalculation<BPArchitectureVersion> {

	private final ISDifferenceCalculation isDifferenceCalculation = 
			new ISDifferenceCalculation();
	private final BPInternalModificationDerivation bpInternalModificationDerivation = 
			new BPInternalModificationDerivation();
	private final BPSubactivityDerivation bpSubactivityDerivation = 
			new BPSubactivityDerivation();
	
	@Override
	public List<Activity> deriveWorkplan(BPArchitectureVersion baseVersion, BPArchitectureVersion targetVersion) {
		List<Activity> activityList = this.isDifferenceCalculation.deriveWorkplan(baseVersion, targetVersion);
		activityList.addAll(this.deriveAddAndRemoveActivities(calculateDiffModel(
				baseVersion.getDataModel(), targetVersion.getDataModel())));
		for (Entry<String, UsageModel> baseUsageModelEntry: baseVersion.getUsageModels().entrySet()) {
			String usageModelName = baseUsageModelEntry.getKey();
			if (targetVersion.getUsageModels().containsKey(usageModelName)) {
				activityList.addAll(this.deriveAddAndRemoveActivities(calculateDiffModel(
						baseVersion.getUsageModels().get(usageModelName), 
						targetVersion.getUsageModels().get(usageModelName))));
			}
		}
		activityList.addAll(this.deriveAddAndRemoveActivities(calculateDiffModel(
				baseVersion.getOrganizationEnvironmentModel(), targetVersion.getOrganizationEnvironmentModel())));
		activityList.addAll(this.bpInternalModificationDerivation.deriveInternalModifications(targetVersion));
		return activityList;
	}
	
	@Override
	public void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		this.isDifferenceCalculation.checkForDifferencesAndAddToWorkplan(diffElement, workplan);
		for (BPActivityElementType elementType: BPActivityElementType.getTopLevelArchitectureActivityElementTypes()) {
			if (detectionRuleAdded(diffElement, elementType.getElementClass())) {
				NamedElement architectureElement = (NamedElement)(((ReferenceChange)diffElement).getValue());
				Activity newActivity = new Activity(ISActivityType.ARCHITECTUREMODELDIFF, elementType, 
						architectureElement, architectureElement.getEntityName(), null, BasicActivity.ADD, 
						ISDifferenceCalculation.createAddElementDescription(architectureElement));
				workplan.add(newActivity);
				this.bpSubactivityDerivation.deriveSubacitvities(architectureElement, newActivity);
				break;
			} 
			if (detectionRuleDeleted(diffElement, elementType.getElementClass())) {
				NamedElement architectureElement = (NamedElement)(((ReferenceChange)diffElement).getValue());
				Activity newActivity = new Activity(ISActivityType.ARCHITECTUREMODELDIFF, elementType,
						architectureElement, architectureElement.getEntityName(), null, BasicActivity.REMOVE, 
						ISDifferenceCalculation.createRemoveElementDescription(architectureElement));
				workplan.add(newActivity);
				this.bpSubactivityDerivation.deriveSubacitvities(architectureElement, newActivity);
				break;
			}
		}
	}
	
}
