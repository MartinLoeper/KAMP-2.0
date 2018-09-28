package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public class Result<I extends EObject, O extends EObject> extends ViewerTreeParent {
	private final Set<CausingEntityMapping<I, EObject>> inputElements;
	private final Set<CausingEntityMapping<O, EObject>> outputElements;
	
	public Result(Set<CausingEntityMapping<I, EObject>> inputElements, Set<CausingEntityMapping<O, EObject>> outputElements) {
		this.inputElements = inputElements;
		this.outputElements = outputElements;
		
		addChild(new ViewerTreeParent() {
			
			{
				for(CausingEntityMapping<I, EObject> inputMapping : getInputElements()) {
					addChild(inputMapping);
				}
			}
			
			@Override
			public String getName() {
				return "Input Set";
			}
		});
		
		addChild(new ViewerTreeParent() {
			
			{
				for(CausingEntityMapping<O, EObject> outputMapping : getOutputElements()) {
					addChild(outputMapping);
				}
			}
			
			@Override
			public String getName() {
				return "Output Set";
			}
		});
	}
	
	public Result(Set<CausingEntityMapping<O, EObject>> outputElements) {
		this.outputElements = outputElements;
		this.inputElements = new HashSet<>();
	}
	
	public Set<CausingEntityMapping<I, EObject>> getInputElements() {
		return new HashSet<>(this.inputElements);
	}
	
	public Set<CausingEntityMapping<O, EObject>> getOutputElements() {
		return new HashSet<>(this.outputElements);
	}

	@Override
	public String getName() {
		return "Results";
	}
}
