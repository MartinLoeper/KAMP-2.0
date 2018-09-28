package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;

public class StructuralFeatureForwardReferenceLookup<I extends EObject, O extends EObject> extends EntityConversionLookup<I, O> {
	private static String LOOKUP_NAME = "Forward Reference at Structural Feature";
	
	private final boolean isFeatureMany;
	private final String featureName;
	
	public StructuralFeatureForwardReferenceLookup(boolean addCausingEntities, boolean isFeatureMany, String featureName) {
		super(addCausingEntities, LOOKUP_NAME + " '" + featureName + "'");

		this.isFeatureMany = isFeatureMany;
		this.featureName = featureName;
	}

	@Override
	protected Transition<I, O> convert(CausingEntityMapping<I, EObject> sourceMapping) {
		I affectedElement = sourceMapping.getAffectedElement();
		Set<EObject> causingEntities = sourceMapping.getCausingEntities();
		Set<CausingEntityMapping<O, EObject>> outputMappings = new HashSet<>();
		
		if(this.isFeatureMany) {
			@SuppressWarnings("unchecked")	// checked by isFeatureMany
			List<O> elementsRetreived = (EList<O>) affectedElement.eGet(affectedElement.eClass().getEStructuralFeature(featureName));
			
			if(elementsRetreived == null)
				return new Transition<I, O>(sourceMapping, new HashSet<>());
			
			for(O element : elementsRetreived) {
				if(element != null) {
					CausingEntityMapping<O, EObject> newMapping = new CausingEntityMapping<>(element, causingEntities);
					if(isCausingEntitySelectionEnabled()) {
						newMapping.addCausingEntityDistinct(affectedElement);
					}
					
					outputMappings.add(newMapping);
				}
			}
		} else {
			@SuppressWarnings("unchecked") // checked by isFeatureMany
			O element = (O) affectedElement.eGet(affectedElement.eClass().getEStructuralFeature(featureName));
			
			if(element == null)
				return new Transition<I, O>(sourceMapping, new HashSet<>());
			
			CausingEntityMapping<O, EObject> newMapping = new CausingEntityMapping<>(element, causingEntities);
			if(isCausingEntitySelectionEnabled()) {
				newMapping.addCausingEntityDistinct(affectedElement);
			}
			
			outputMappings.add(newMapping);
		}
		
		return new Transition<I, O>(sourceMapping, outputMappings);
	}

}
