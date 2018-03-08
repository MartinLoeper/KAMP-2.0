package edu.kit.ipd.sdq.kamp4req.core;


import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import options.Option;
import requirements.Requirement;

public enum ReqActivityElementType implements AbstractActivityElementType {

	DECISION(Decision.class),
	ENTITY(Entity.class),
	OPTION(Option.class),
	REQUIREMENT(Requirement.class);
	
	private final Class<?> clazz;
	private final String name;
	
	private ReqActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public static ReqActivityElementType getActivityTypeForObject(EObject object) {
		for (ReqActivityElementType type: ReqActivityElementType.values()) {
			if (type.getElementClass().isAssignableFrom(object.getClass())) {
				return type;
			}
		}
		return null;
	}

}
