package edu.kit.ipd.sdq.kamp4bp.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersionPersistency;

public class BPCreateEmptyBaseModelAction extends AbstractCreateEmptyBaseModelAction<BPArchitectureVersion> {

	public BPCreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new BPArchitectureVersionPersistency());
	}
	
	@Override
	protected BPArchitectureVersion createArchitectureVersion() {
		return BPArchitectureModelFactoryFacade.createEmptyBPModel("architecturemodel");
	}

}
