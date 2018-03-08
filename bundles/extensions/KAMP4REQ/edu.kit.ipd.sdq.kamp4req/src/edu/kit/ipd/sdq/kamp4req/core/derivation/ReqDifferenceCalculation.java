package edu.kit.ipd.sdq.kamp4req.core.derivation;

import java.util.List;

import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.ecore.EObject;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4bp.core.derivation.BPDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4is.core.ISActivityType;
import edu.kit.ipd.sdq.kamp4req.core.ReqActivityElementType;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import options.Option;
import requirements.Requirement;

public class ReqDifferenceCalculation extends AbstractDifferenceCalculation<ReqArchitectureVersion> {

	private final BPDifferenceCalculation bpDifferenceCalculation = 
			new BPDifferenceCalculation();
	private final ReqInternalModificationDerivation reqInternalModificationDerivation = 
			new ReqInternalModificationDerivation();
	
	@Override
	public List<Activity> deriveWorkplan(ReqArchitectureVersion baseVersion, ReqArchitectureVersion targetVersion) {
		List<Activity> activityList = this.bpDifferenceCalculation.deriveWorkplan(baseVersion, targetVersion);
		activityList.addAll(this.deriveAddAndRemoveActivities(calculateDiffModel(
				baseVersion.getRequirementsRepository(), targetVersion.getRequirementsRepository())));
		activityList.addAll(this.deriveAddAndRemoveActivities(calculateDiffModel(
				baseVersion.getDecisionRepository(), targetVersion.getDecisionRepository())));
		activityList.addAll(this.deriveAddAndRemoveActivities(calculateDiffModel(
				baseVersion.getOptionRepository(), targetVersion.getOptionRepository())));
		activityList.addAll(this.reqInternalModificationDerivation.deriveInternalModifications(targetVersion));
		return activityList;
	}
	
	@Override
	protected void checkForDifferencesAndAddToWorkplan(Diff diffElement, List<Activity> workplan) {
		this.bpDifferenceCalculation.checkForDifferencesAndAddToWorkplan(diffElement, workplan);
		if (detectionRuleAdded(diffElement, Requirement.class)) {
			Requirement requirement = (Requirement)(((ReferenceChange)diffElement).getValue());
			String elementName = "\"" + requirement.getSpecification() + "\"";
			workplan.add(createReqAddActivity(requirement, elementName));
		} else if (detectionRuleDeleted(diffElement, Requirement.class)) {
			Requirement requirement = (Requirement)(((ReferenceChange)diffElement).getValue());
			String elementName = "\"" + requirement.getSpecification() + "\"";
			workplan.add(createReqRemoveActivity(requirement, elementName));
		} else if (detectionRuleAdded(diffElement, Decision.class)) {
			Decision decision = (Decision)(((ReferenceChange)diffElement).getValue());
			String elementName = "\"" + decision.getDescription() + "\"";
			workplan.add(createReqAddActivity(decision, elementName));
		} else if (detectionRuleDeleted(diffElement, Decision.class)) {
			Decision decision = (Decision)(((ReferenceChange)diffElement).getValue());
			String elementName = "\"" + decision.getDescription() + "\"";
			workplan.add(createReqRemoveActivity(decision, elementName));
		} else if (detectionRuleAdded(diffElement, Option.class)) {
			Option option = (Option)(((ReferenceChange)diffElement).getValue());
			String elementName = "\"" + option.getDescription() + "\"";
			workplan.add(createReqAddActivity(option, elementName));
		} else if (detectionRuleDeleted(diffElement, Option.class)) {
			Option option = (Option)(((ReferenceChange)diffElement).getValue());
			String elementName = "\"" + option.getDescription() + "\"";
			workplan.add(createReqRemoveActivity(option, elementName));
		}
	}
	
	protected static Activity createReqAddActivity(EObject element, String elementName) {
		ReqActivityElementType activityElementType = ReqActivityElementType.
				getActivityTypeForObject(element);
		return new Activity(ISActivityType.INTERNALMODIFICATIONMARK, 
				activityElementType, element, elementName, null, BasicActivity.MODIFY, "Add " + 
				element.eClass().getName() + " " + elementName + ".");
	}
	
	protected static Activity createReqRemoveActivity(EObject element, String elementName) {
		ReqActivityElementType activityElementType = ReqActivityElementType.
				getActivityTypeForObject(element);
		return new Activity(ISActivityType.INTERNALMODIFICATIONMARK, 
				activityElementType, element, elementName, null, BasicActivity.MODIFY, "Remove " + 
				element.eClass().getName() + " " + elementName + ".");
	}
}
