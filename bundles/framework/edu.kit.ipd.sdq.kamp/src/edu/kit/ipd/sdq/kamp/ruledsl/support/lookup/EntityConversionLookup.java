package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;

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
	
	public static <T extends EObject> Predicate<T> distinctByEqualityHelper() {
	    Predicate<T> p = new Predicate<T>() {
	    	EqualityHelper eqHelper = new EcoreUtil.EqualityHelper();
	    	KeySetView<EObject, Boolean> seen = ConcurrentHashMap.newKeySet();
		    
			@Override
			public boolean test(T t) {
				for(EObject eobj : seen) {
			    	if(eqHelper.equals(eobj, t)) {
			    		return false;
			    	}
			    }
				
				seen.add(t);
				return true;
			}
		};
		
		return p;
	}
}
