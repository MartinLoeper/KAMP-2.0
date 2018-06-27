package edu.kit.ipd.sdq.kamp.ruledsl.util;

public class RecursiveRuleBlock extends RuleBlock {

	public RecursiveRuleBlock(ResultMap resultMap, SeedMap seedMap) {
		super(resultMap, seedMap);
	}

	@Override
	public boolean runLookups(ResultMap sourceMap) {
		boolean newInsertions = false;
		ResultMap currentMap = this.seedMap;
		do {
			newInsertions = super.runLookups(currentMap);
			currentMap = this.resultMap;
		} while(newInsertions);
		
		return false;
	}
}
