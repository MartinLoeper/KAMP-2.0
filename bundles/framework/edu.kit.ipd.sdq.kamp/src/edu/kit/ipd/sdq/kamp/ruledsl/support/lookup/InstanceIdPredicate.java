package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class InstanceIdPredicate<I extends EObject> implements Function<I, Boolean> {
	private final String instanceId;
	
	public InstanceIdPredicate(String instanceId) {
		// the replace is just a temp fix for the unexpected ID hyphen character
		this.instanceId = instanceId.replace("$", "-");
	}
	
	public String getInstanceId() {
		return this.instanceId;
	}

	@Override
	public Boolean apply(I it) {
		return EcoreUtil.getID(it).equals(this.instanceId);
	}

	@Override
	public String toString() {
		return this.getInstanceId();
	}
}
