package edu.kit.ipd.sdq.kamp.ruledsl.util;

public class RecursiveRuleBlock extends RuleBlock {

	public RecursiveRuleBlock(ResultMap resultMap) {
		super(resultMap);
	}

	public boolean runLookups() {
		boolean newInsertions = false;
		do {
			newInsertions = super.runLookups();
		} while(newInsertions);
		
		return false;
	}
}
