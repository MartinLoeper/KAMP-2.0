package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.provider;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement;

/**
 *@generated NOT
 */
public class ReqLabelCustomizing {

	public static String customize(ReqModifyDecision modifyDecision) {
		if (modifyDecision.getAffectedElement() == null) {
			return "(Please select a decision!)";
		} else if (modifyDecision.getAffectedElement().getDescription() != null) {
			return "\""+ modifyDecision.getAffectedElement().getDescription() + "\"";
		} else {
			return "with id \"" + modifyDecision.getAffectedElement().getId() + "\"";
		}
	}
	
	public static String customize(ReqModifyOption modifyOption) {
		if (modifyOption.getAffectedElement() == null) {
			return "(Please select an option!)";
		} else if (modifyOption.getAffectedElement().getDescription() != null) {
			return "\""+ modifyOption.getAffectedElement().getDescription() + "\"";
		} else {
			return "with id \"" + modifyOption.getAffectedElement().getId() + "\"";
		}
	}
	
	public static String customize(ReqModifyRequirement modifyRequirement) {
		if (modifyRequirement.getAffectedElement() == null) {
			return "(Please select a requirement!)";
		} else if (modifyRequirement.getAffectedElement().getSpecification() != null) {
			return "\""+ modifyRequirement.getAffectedElement().getSpecification() + "\"";
		} else {
			return "with id \"" + modifyRequirement.getAffectedElement().getId() + "\"";
		}
	}

}
