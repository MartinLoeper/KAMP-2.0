package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.LookupResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result;

public class TypeProjectionLookup<T extends EObject> extends AbstractLookup<T, T> {
	private static String LOOKUP_NAME = "Type Projection";
	private final Class<?>[] moreTargetClasses;
	private final Class<? extends T> targetClass;

	public TypeProjectionLookup(Class<? extends T> targetClass, Class<?> ...moreTargetClasses) {
		this.moreTargetClasses = (moreTargetClasses == null) ? new Class[0] : moreTargetClasses;
		this.targetClass = targetClass;
	}
	
	public String getLookupName(Class<?>[] allTargetClasses) {
		String targetClassNames = "";

		for(int i = 0; i < allTargetClasses.length; i++) {
			if(i > 0) {
				targetClassNames += ", ";
			}
			targetClassNames += allTargetClasses[i].getSimpleName();
		}
		
		return LOOKUP_NAME + " (" + targetClassNames + ")";
	}
	
	private static <T> T[] concat(T[] first, T[] second) {
	    T[] result = Arrays.copyOf(first, first.length + second.length);
	    System.arraycopy(second, 0, result, first.length, second.length);
	    return result;
	}

	@Override
	public LookupResult<T, T> invoke(Result<EObject, T> previousLookupResult) {
		Set<CausingEntityMapping<T, EObject>> outputElements = new HashSet<>();
		Class<?>[] allTargetClasses = concat(this.moreTargetClasses, new Class[] { this.targetClass });
		
		outer:
		for(CausingEntityMapping<T, EObject> element : previousLookupResult.getOutputElements()) {
			Class<?> elementClass = element.getAffectedElement().eClass().getInstanceClass();
			for(Class<?> targetClass : allTargetClasses) {
				if(!targetClass.isAssignableFrom(elementClass)) {
					continue outer;
				}
			}
			
			outputElements.add(element);
		}
		
		return new LookupResult<T, T>(previousLookupResult.getOutputElements(), outputElements, null, getLookupName(allTargetClasses));
	}
}
