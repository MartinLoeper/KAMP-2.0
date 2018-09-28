package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.List;

public class ChangePropagationResult extends ViewerTreeParent {
	private final List<BlockResult> blockResults;
	private final SeedMap seedMap;
	private final ResultMap resultMap;

	public ChangePropagationResult(List<BlockResult> blockResults, SeedMap seedMap, ResultMap resultMap) {
		super();
		
		this.blockResults = blockResults;
		this.seedMap = seedMap;
		this.resultMap = resultMap;
		
		addChild(seedMap);
		addChild(resultMap);
		addChild(new ViewerTreeParent() {
			
			{
				for(BlockResult blockResult : blockResults) {
					addChild(blockResult);
				}
			}
			
			@Override
			public String getName() {
				return "Blocks";
			}
		});
	}
	
	public SeedMap getSeedMap() {
		return this.seedMap;
	}
	
	public ResultMap getResultMap() {
		return this.resultMap;
	}
	
	public List<BlockResult> getBlockResults() {
		return this.blockResults;
	}

	@Override
	public String getName() {
		return "Change Propagation Result";
	}
}
