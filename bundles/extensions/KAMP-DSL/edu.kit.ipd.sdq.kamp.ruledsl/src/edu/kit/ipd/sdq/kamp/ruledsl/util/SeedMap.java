package edu.kit.ipd.sdq.kamp.ruledsl.util;

import static edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup.lookUpMarkedObjectsOfAType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;

public class SeedMap extends ResultMap {
	private SeedMap(ResultMap resultMap) {
		super();
		
		// copy the passed map (in fact just in order to copy the keys)
		this.mapping = new HashMap<>(resultMap.mapping);
		
		// reinitialize the lists (instead of deep copying)
		for(Class<? extends EObject> key : this.mapping.keySet()) {
			mapping.put(key, new ArrayList<CausingEntityMapping<? extends EObject, EObject>>());
		}
	}
	
	/**
	 * Computes the seed element map.
	 * @param version the architecture version to use for seed element retrieval
	 * @return 
	 */
	public static SeedMap from(ResultMap resultMap, AbstractArchitectureVersion<?> version) {	
		SeedMap newSeedMap = new SeedMap(resultMap);
		
		newSeedMap.getKeys().stream().forEach((clazz) -> {
			Set<? extends EObject> seedModificationMarks = lookUpMarkedObjectsOfAType(version, clazz);
			
			seedModificationMarks.stream().forEach((value) -> {
				CausingEntityMapping<? extends EObject, EObject> newEntry = new CausingEntityMapping<>(value);
				List<CausingEntityMapping<? extends EObject, EObject>> elements = newSeedMap.mapping.get(clazz);
				
				newSeedMap.addElementToListIfNonExistent(elements, newEntry);
			});
		});
		
		return newSeedMap;
	}
}
