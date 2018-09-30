package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.LookupResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result;

public class InstanceProjectionLookup<I extends EObject, O extends EObject> extends AbstractLookup<I, O> {
	private static String LOOKUP_NAME = "Instance Projection";
	private final Function<I, Boolean> predicate;
	private final Class<? extends O> targetClass;

	public InstanceProjectionLookup(Function<I, Boolean> predicate, Class<? extends O> targetClass) {
		this.predicate = predicate;
		this.targetClass = targetClass;
	}

	@Override
	public LookupResult<I, O> invoke(Result<EObject, I> previousLookupResult) {
		Set<CausingEntityMapping<O, EObject>> outputElements = new HashSet<>();
		
		for(CausingEntityMapping<I, EObject> element : previousLookupResult.getOutputElements()) {
			Class<?> elementClass = element.getAffectedElement().eClass().getInstanceClass();
			if(this.targetClass.isAssignableFrom(elementClass) 
					&& this.predicate.apply(element.getAffectedElement())) {

				// cast is checked above with this.targetClass.isAssignableFrom(elementClass)
				outputElements.add((CausingEntityMapping<O, EObject>) element);
			}
		}
		
		return new LookupResult<I, O>(previousLookupResult.getOutputElements(), outputElements, null, LOOKUP_NAME);
	}
}
