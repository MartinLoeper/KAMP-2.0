package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;

public class MetaclassForwardReferenceLookup<I extends EObject, O extends EObject> extends EntityConversionLookup<I, O> {
	private static String LOOKUP_NAME = "Forward Reference at Metaclass";
	private final Class<O> targetClass;
	
	public MetaclassForwardReferenceLookup(boolean addCausingEntities, Class<O> targetClass) {
		super(addCausingEntities, LOOKUP_NAME + " '" + targetClass.getSimpleName() + "'");
		
		this.targetClass = targetClass;
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
						CausingEntityMapping<O, EObject> newMapping = new CausingEntityMapping<>(targetElement, causingEntities);
						if(isCausingEntitySelectionEnabled()) {
							newMapping.addCausingEntityDistinct(affectedElement);
						}
						
						outputMappings.add(newMapping);
					}
				} else {
					O targetElement = (O) crossReferences;
					
					CausingEntityMapping<O, EObject> newMapping = new CausingEntityMapping<>(targetElement, causingEntities);
					if(isCausingEntitySelectionEnabled()) {
						newMapping.addCausingEntityDistinct(affectedElement);
					}
					
					outputMappings.add(newMapping);
				}
			}
		}
		
		return new Transition<I, O>(sourceMapping, outputMappings);
	}

}
