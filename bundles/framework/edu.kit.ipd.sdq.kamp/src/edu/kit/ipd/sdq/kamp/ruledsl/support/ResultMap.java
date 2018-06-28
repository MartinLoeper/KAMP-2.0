package edu.kit.ipd.sdq.kamp.ruledsl.support;

import static edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup.lookUpMarkedObjectsOfAType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;

/**
 * This is a special implementation of a typesafe heterogeneous map.
 * We store a mapping of data type to affected elements.
 * There are special method to retrieve all keys and their corresponding values for a 
 * specific type and all its subtypes.
 * 
 * The ResultMap is used inside the RuleProvider to determine whether the recursion algorithm
 * should stop.
 * 
 * @author Martin Loeper
 *
 */
public class ResultMap {
	protected Map<Class<? extends EObject>, List<CausingEntityMapping<? extends EObject, EObject>>> mapping = new HashMap<>();

	/**
	 * Inits the set for a specific type.
	 * If it is already initialized, nothing is done.
	 * 
	 * @param clazz the type for which the set is prepared
	 */
	public void init(Class<? extends EObject> clazz) {
		if(mapping.get(clazz) == null) {
			mapping.put(clazz, new ArrayList<CausingEntityMapping<? extends EObject, EObject>>());
		}
	}
	
	@SuppressWarnings("unchecked")
	public <T extends EObject> Stream<CausingEntityMapping<T, EObject>> get(Class<T> clazz) {
		return this.mapping.get(clazz).stream().map(e -> (CausingEntityMapping<T, EObject>) e);
	}
	
	public <T extends EObject> Stream<CausingEntityMapping<T, EObject>> getWithAllSubtypes(Class<T> clazz, boolean clearCausingEntities) {
		return this.mapping
				.entrySet()
				.stream()
				.filter(new Predicate<Entry<Class<? extends EObject>, List<CausingEntityMapping<? extends EObject, EObject>>>>() {

					@Override
					public boolean test(
							Entry<Class<? extends EObject>, List<CausingEntityMapping<? extends EObject, EObject>>> e) {
						boolean isAssignable = clazz.isAssignableFrom(e.getKey());
						
						return isAssignable;
					}
				})
				.flatMap(e -> e.getValue()
						.stream()
						.map(el -> (clearCausingEntities) ? (CausingEntityMapping<T, EObject>) new CausingEntityMapping<EObject, EObject>(el.getAffectedElement()) : (CausingEntityMapping<T, EObject>) new CausingEntityMapping<EObject, EObject>(el.getAffectedElement(), el))
						);
	}
	
	/**
	 * Puts the given element into the set.
	 * Please note that init must be called for the given clazz in advance.
	 * Otherwise a NullPointer exception is thrown.
	 * 
	 * @return true if element was added, false if element was already present
	 * 
	 * @param clazz the class of the element
	 * @param value the element
	 */
	public <T extends EObject> boolean put(Class<T> clazz, CausingEntityMapping<T, EObject> value) {
		List<CausingEntityMapping<? extends EObject, EObject>> elements = this.mapping.get(clazz);
		
		return addElementToListIfNonExistent(elements, value);
	}
	
	protected boolean addElementToListIfNonExistent(List<CausingEntityMapping<? extends EObject, EObject>> list, CausingEntityMapping<? extends EObject, EObject> element) {
		// check if element is non existent
		for(CausingEntityMapping<? extends EObject, EObject> entry : list) {
			if(EcoreUtil.equals(entry.getAffectedElement(), element.getAffectedElement())) {
				// add causing entites to existing element
				for(EObject ce : element.getCausingEntities()) {
					entry.addCausingEntityDistinct(ce);
				}
				
				return false;
			}
		}
		
		// element is not present, add it
		list.add(element);
		
		return true;
	}
	
	public Set<Class<? extends EObject>> getKeys() {
		return this.mapping.keySet();
	}
}
