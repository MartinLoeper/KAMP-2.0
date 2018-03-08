package edu.kit.ipd.sdq.kamp4is.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersionPersistency;

public class ISCreateEmptyBaseModelAction  extends AbstractCreateEmptyBaseModelAction<ISArchitectureVersion> {
	
	public ISCreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new ISArchitectureVersionPersistency());
	}
	
	@Override
	protected ISArchitectureVersion createArchitectureVersion() {
		return ISArchitectureModelFactoryFacade.createEmptyModel("architecturemodel");
	}

}

