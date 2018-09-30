package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.Collection;
import java.util.Set;
import java.util.function.BiFunction;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.LookupResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result;
import edu.kit.ipd.sdq.kamp.ruledsl.support.RuleResult;

public class RuleReferenceLookup<I extends EObject, O extends EObject> extends AbstractLookup<I, O> {
	private static String LOOKUP_NAME = "Rule Reference";

	private final BiFunction<Result<?, I>, AbstractArchitectureVersion<AbstractModificationRepository<?, ?>>, RuleResult<I, O>> lookupFn;
	private final AbstractArchitectureVersion<AbstractModificationRepository<?, ?>> version;
	private RuleResult<I, O> referenceRuleResult;

	public RuleReferenceLookup(AbstractArchitectureVersion<AbstractModificationRepository<?, ?>> version, BiFunction<Result<?, I>, AbstractArchitectureVersion<AbstractModificationRepository<?, ?>>, RuleResult<I, O>> lookupFn) {
		this.lookupFn = lookupFn;
		this.version = version;
	}

	@Override
	public LookupResult<I, O> invoke(Result<EObject, I> previousLookupResult) {
		this.referenceRuleResult = this.lookupFn.apply(previousLookupResult, this.version);
		Set<CausingEntityMapping<O, EObject>> outputElements = this.referenceRuleResult.getOutputElements();
		
		return new LookupResult<I, O>(previousLookupResult.getOutputElements(), outputElements, null, LOOKUP_NAME);
	}

	public RuleResult<I, O> getReferencedRuleResult() {
		return this.referenceRuleResult;
	}
}
