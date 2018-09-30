package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.LookupResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result;

public class InstanceProjectionLookup<T extends EObject> extends AbstractLookup<T, T> {
	private static String LOOKUP_NAME = "Instance Projection";
	private final Function<T, Boolean> predicate;

	public InstanceProjectionLookup(Function<T, Boolean> predicate) {
		this.predicate = predicate;
	}

	@Override
	public LookupResult<T, T> invoke(Result<EObject, T> previousLookupResult) {
		Set<CausingEntityMapping<T, EObject>> outputElements = new HashSet<>();
		
		for(CausingEntityMapping<T, EObject> element : previousLookupResult.getOutputElements()) {
			if(this.predicate.apply(element.getAffectedElement())) {
				outputElements.add(element);
			}
		}
		
		return new LookupResult<T, T>(previousLookupResult.getOutputElements(), outputElements, null, LOOKUP_NAME);
	}
}
