package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * This class maps an affected element to its corresponding causing entity.
 * A causing entity is the element which is responsible for affected element being marked.
 * 
 * @author Martin Loeper
 *
 * @param <U> the type of affected element
 * @param <V> the type of causing entity
 */
public final class CausingEntityMapping<U extends EObject, V extends EObject> extends ViewerTreeParent {
	private final U affectedElement;
	private final Set<V> causingEntities;
	
	/**
	 * Creates a new mapping from an affected element to causing entities.
	 * 
	 * @param affectedElement the affected element
	 * @param causingEntities the causing entities
	 */
	public CausingEntityMapping(U affectedElement, Set<V> causingEntities) {
		this.affectedElement = affectedElement;
		this.causingEntities = new HashSet<>(causingEntities);
	}

	/**
	 * Creates a new mapping from an affected element to causing entities.
	 * This is basically a convenience constructor for passing one single causing entity instead of a collection of causing entities.
	 * 
	 * @param affectedElement the affected element
	 * @param causingEntity one single causing entity
	 */
	public CausingEntityMapping(U affectedElement, V causingEntity) {
		Set<V> newSet = new HashSet<>();
		newSet.add(causingEntity);
		
		this.affectedElement = affectedElement;
		this.causingEntities = newSet;
	}
	
	public CausingEntityMapping(U affectedElement) {
		this(affectedElement, new HashSet<>());
	}
	
	public CausingEntityMapping(U affectedElement, CausingEntityMapping<?, V> cem) {
		this(affectedElement, cem.getCausingEntities());
	}

	/**
	 * Returns the affected element.
	 * @return the affected element
	 */
	public U getAffectedElement() {
		return affectedElement;
	}

	/**
	 * Returns a copy of the set with causing entities.
	 * @return the causing entities
	 */
	public Set<V> getCausingEntities() {
		return new HashSet<>(causingEntities);
	}

	public void addCausingEntityDistinct(V element) {
		EqualityHelper eqHelper = new EcoreUtil.EqualityHelper();
		
		// remove duplicates
		for(V e : this.causingEntities) {
			if(eqHelper.equals(e, element)) {
				return;
			}
		}
		
		this.causingEntities.add(element);
	}
	
	public void addCausingEntityItem(V causingEntity) {
		addChild(new ViewerTreeObject(causingEntity) {
			
			@Override
			public String getName() {
				return getNameFromEObject(causingEntity);
			}
		});
	}
	
	public static String getNameFromEObject(EObject eobj) {
		String name = null;
		
		if(eobj instanceof NamedElement) {
			return ((NamedElement) eobj).getEntityName();
		}
		
		name = EcoreUtil.getID(eobj);
		
		if(name != null) {
			return name;
		}
		
		return EcoreUtil.getIdentification(eobj);
	}

	@Override
	public String getName() {
		return getNameFromEObject(this.getAffectedElement());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null && this.getAffectedElement() != null) {
			return false;
		}
		
		if(obj instanceof CausingEntityMapping) {
			CausingEntityMapping<EObject, EObject> affectedObject = (CausingEntityMapping<EObject, EObject>) obj;
	
			return this.getAffectedElement().equals(affectedObject.getAffectedElement());
		}
		
		return false;
	}
	
	@Override
	public ViewerTreeObject[] getChildren() {
		return getCausingEntities().stream().map(new Function<EObject, ViewerTreeObject>() {

			@Override
			public ViewerTreeObject apply(EObject eobj) {
				return new ViewerTreeObject(eobj) {
					
					@Override
					public String getName() {
						return CausingEntityMapping.getNameFromEObject(eobj);
					}
				};
			}
			
		}).toArray(ViewerTreeObject[]::new);
	}
	
	@Override
	public boolean hasChildren() {
		return getChildren().length > 0;
	}
	
	@Override
	public int hashCode() {
		return this.getAffectedElement().hashCode();
	}
}
