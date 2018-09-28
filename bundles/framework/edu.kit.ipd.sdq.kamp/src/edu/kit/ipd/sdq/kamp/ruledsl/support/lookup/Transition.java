package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ViewerTreeParent;

public class Transition<I extends EObject, O extends EObject> extends ViewerTreeParent {
	private final CausingEntityMapping<I, EObject> source;
	private final Set<CausingEntityMapping<O, EObject>> targets;
	
	public Transition(CausingEntityMapping<I, EObject> source, 
			Set<CausingEntityMapping<O, EObject>> targets) {

		this.source = source;
		this.targets = targets;
	}
	
	public CausingEntityMapping<I, EObject> getSource() {
		return this.source;
	}
	
	public Set<CausingEntityMapping<O, EObject>> getTargets() {
		return this.targets;
	}

	@Override
	public String getName() {
		for(CausingEntityMapping<O, EObject> targetMapping : getTargets()) {
			addChild(new ViewerTreeParent() {
				
				@Override
				public String getName() {
					return CausingEntityMapping.getNameFromEObject(targetMapping.getAffectedElement());
				}
			});
		}
		
		return CausingEntityMapping.getNameFromEObject(getSource().getAffectedElement());
	}
}
