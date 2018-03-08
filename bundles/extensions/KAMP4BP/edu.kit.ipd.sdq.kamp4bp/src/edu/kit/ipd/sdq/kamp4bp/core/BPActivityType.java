package edu.kit.ipd.sdq.kamp4bp.core;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityType;

public enum BPActivityType implements AbstractActivityType {
	BUSINESS_PROCESS("Business process change"),
	WARNING("[WARNING]");
	
	private final String name;
	
	private BPActivityType(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

}
