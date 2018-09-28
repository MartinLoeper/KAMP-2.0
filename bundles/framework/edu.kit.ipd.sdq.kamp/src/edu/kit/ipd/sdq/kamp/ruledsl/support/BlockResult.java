package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.ecore.EObject;

public class BlockResult extends ViewerTreeParent {
	private List<Result<EObject, EObject>> ruleResults;
	private final BlockResult previousRunResult;

	public BlockResult(List<Result<EObject, EObject>> ruleResults, BlockResult previousRunResult) {
		this.ruleResults = ruleResults;
		this.previousRunResult = previousRunResult;
		
		if(this.previousRunResult == null) {
			for(Result<EObject, EObject> result : this.ruleResults) {
				addChild(result);
			}
		} else {
			BlockResult currentBlockResult = this;
			AtomicInteger i = new AtomicInteger(0);
			List<ViewerTreeParent> items = new ArrayList<>();
			while(currentBlockResult != null) {
				final BlockResult currentBlockResultFinal = currentBlockResult;
				items.add(new ViewerTreeParent() {
					
					{
						for(Result<EObject, EObject> result : currentBlockResultFinal.getRuleResults()) {
							addChild(result);
						}
					}
					
					@Override
					public String getName() {
						return "Block Execution " + i.incrementAndGet();
					}
				});
				currentBlockResult = currentBlockResult.getPreviousRunResult();
			}
			Collections.reverse(items);
			items.forEach((item) -> addChild(item));
		}
	}
	
	public List<Result<EObject, EObject>> getRuleResults() {
		return this.ruleResults;
	}
	
	public BlockResult getPreviousRunResult() {
		return this.previousRunResult;
	}

	@Override
	public String getName() {
		return (this.previousRunResult != null) ? "Recursive Block" : "Standard Block";
	}
}
