package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.ruledsl.support.LookupResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.Result;

public abstract class AbstractLookup<I extends EObject, O extends EObject> {
	public abstract LookupResult<I, O> invoke(Result<EObject, I> previousLookupResult);
}
