package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.Transition;

public class LookupResult<I extends EObject, O extends EObject> extends Result<I, O> {
	private final Set<Transition<I, O>> transitions;
	private final String lookupName;
	
	public LookupResult(Set<CausingEntityMapping<I, EObject>> inputElements, Set<CausingEntityMapping<O, EObject>> outputElements, Set<Transition<I, O>> transitions, String lookupName) {
		super(inputElements, outputElements);
		
		this.transitions = transitions;
		this.lookupName = lookupName;
		
		addChild(new ViewerTreeParent() {
			
			{
				for(Transition<I, O> transition : transitions) {
					addChild(transition);
				}
			}
			
			@Override
			public String getName() {
				return "Transitions";
			}
		});
	}
	
	public Set<Transition<I, O>> getTransitions() {
		return this.transitions;
	}

	@Override
	public String getName() {
		return this.lookupName;
	}
}
