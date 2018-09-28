package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.LookupResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result;

public abstract class EntityConversionLookup<I extends EObject, O extends EObject> extends AbstractLookup<I, O> {
	private final boolean addCausingEntities;
	private final String lookupName;
	
	public EntityConversionLookup(boolean addCausingEntities, String lookupName) {
		this.addCausingEntities = addCausingEntities;
		this.lookupName = lookupName;
	}
	
	public boolean isCausingEntitySelectionEnabled() {
		return this.addCausingEntities;
	}
	
	@Override
	public LookupResult<I, O> invoke(Result<EObject, I> previousLookupResult) {
		Set<Transition<I, O>> transitions = new HashSet<>();
		// for every element in in outElements invoke convert
		Set<CausingEntityMapping<I, EObject>> inputElements = previousLookupResult.getOutputElements();
		Set<CausingEntityMapping<O, EObject>> outputElements = new HashSet<CausingEntityMapping<O, EObject>>();
		
		for(CausingEntityMapping<I, EObject> element : inputElements) {
			Transition<I, O> transition = convert(element);
			transitions.add(transition);
			for(CausingEntityMapping<O, EObject> outputElement : transition.getTargets()) {
				outputElements.add(outputElement);
			}
		}
		
		return new LookupResult<>(inputElements, outputElements, transitions, this.lookupName);
	}
	
	protected abstract Transition<I, O> convert(CausingEntityMapping<I, EObject> element);
}
