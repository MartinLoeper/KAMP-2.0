package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public class RuleResult<I extends EObject, O extends EObject> extends Result<I, O> {
	private final List<LookupResult<EObject, EObject>> lookupResults;
	private final String ruleName;

	public RuleResult(Set<CausingEntityMapping<I, EObject>> inputElements, Set<CausingEntityMapping<O, EObject>> outputElements, String ruleName, List<LookupResult<EObject, EObject>> lookupResults) {
		super(inputElements, outputElements);
		this.lookupResults = lookupResults;
		this.ruleName = ruleName;
		
		addChild(new ViewerTreeParent() {
			
			{
				for(LookupResult<EObject, EObject> lookupResult : RuleResult.this.getLookupResults()) {
					addChild(lookupResult);
				}
			}
			
			@Override
			public String getName() {
				return "Lookups";
			}
		});
	}
	
	public List<LookupResult<EObject, EObject>> getLookupResults() {
		return this.lookupResults;
	}
	
	@Override
	public String getName() {
		return "Rule " + this.ruleName;
	}
}
