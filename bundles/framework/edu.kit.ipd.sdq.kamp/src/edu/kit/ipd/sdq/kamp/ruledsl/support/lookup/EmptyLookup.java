package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.LookupResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result;

public class EmptyLookup<I extends EObject> extends AbstractLookup<I, EObject> {
	
	private static String LOOKUP_NAME = "<not defined>";

	@Override
	public LookupResult<I, EObject> invoke(Result<EObject, I> previousLookupResult) {
		return new LookupResult<>(previousLookupResult.getOutputElements(), new HashSet<CausingEntityMapping<EObject, EObject>>(), null, LOOKUP_NAME);
	}

}
