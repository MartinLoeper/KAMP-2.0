package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;

public class InstanceForwardReferenceLookup<I extends EObject, O extends EObject> extends EntityConversionLookup<I, O> {
	private static String LOOKUP_NAME = "Forward Reference at Instance";
	private final Function<O, Boolean> predicate;
	private final Class<O> targetClass;
	
	public InstanceForwardReferenceLookup(boolean addCausingEntities, Class<O> targetClass, Function<O, Boolean> predicate) {
		super(addCausingEntities, LOOKUP_NAME + " '" + predicate.toString() + "'");
		
		this.targetClass = targetClass;
		this.predicate = predicate;
	}

	@Override
	protected Transition<I, O> convert(CausingEntityMapping<I, EObject> sourceMapping) {
		I affectedElement = sourceMapping.getAffectedElement();
		Set<EObject> causingEntities = sourceMapping.getCausingEntities();
		Set<CausingEntityMapping<O, EObject>> outputMappings = new HashSet<>();
		
		EList<EStructuralFeature> features = affectedElement.eClass().getEAllStructuralFeatures();
		for(EStructuralFeature feature : features) {
			if(this.targetClass.isAssignableFrom(feature.getEType().getInstanceClass())) {
				Object crossReferences = affectedElement.eGet(feature, true);
				
				if(feature.isMany()) {
					EList<O> targetElements = (EList<O>) crossReferences;
					for(O targetElement : targetElements) {
						if(this.predicate.apply(targetElement)) {
							CausingEntityMapping<O, EObject> newMapping = new CausingEntityMapping<>(targetElement, causingEntities);
							if(isCausingEntitySelectionEnabled()) {
								newMapping.addCausingEntityDistinct(affectedElement);
							}
							
							outputMappings.add(newMapping);
						}
					}
				} else {
					O targetElement = (O) crossReferences;

					if(this.predicate.apply(targetElement)) {						
						CausingEntityMapping<O, EObject> newMapping = new CausingEntityMapping<>(targetElement, causingEntities);
						if(isCausingEntitySelectionEnabled()) {
							newMapping.addCausingEntityDistinct(affectedElement);
						}
						
						outputMappings.add(newMapping);
					}
				}
			}
		}
		
		return new Transition<I, O>(sourceMapping, outputMappings);
	}

}
