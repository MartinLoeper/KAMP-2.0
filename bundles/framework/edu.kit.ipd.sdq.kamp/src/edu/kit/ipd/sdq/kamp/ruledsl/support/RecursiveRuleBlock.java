package edu.kit.ipd.sdq.kamp.ruledsl.support;

public class RecursiveRuleBlock extends RuleBlock {

	public RecursiveRuleBlock(ResultMap resultMap, SeedMap seedMap) {
		super(resultMap, seedMap);
	}

	@Override
	public BlockResult runLookups(BlockResult previousRunResult) {
		BlockResult result = previousRunResult;
		do {
			result = super.runLookups(result);
		} while(!isFinished());
		
		return result;
	}
}
