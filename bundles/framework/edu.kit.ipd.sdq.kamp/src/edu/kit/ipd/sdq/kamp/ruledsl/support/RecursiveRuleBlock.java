package edu.kit.ipd.sdq.kamp.ruledsl.support;

public class RecursiveRuleBlock extends RuleBlock {

	public RecursiveRuleBlock(ResultMap resultMap, SeedMap seedMap) {
		super(resultMap, seedMap);
	}

	@Override
	public boolean runLookups() {
		boolean newInsertions = false;
		do {
			newInsertions = super.runLookups();
		} while(newInsertions);
		
		return false;	// per definition, no special meaning
	}
}
