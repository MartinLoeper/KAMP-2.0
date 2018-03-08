package edu.kit.ipd.sdq.kamp4req.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersionPersistency;

public class ReqCreateEmptyBaseModelAction extends AbstractCreateEmptyBaseModelAction<ReqArchitectureVersion> {

	public ReqCreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new ReqArchitectureVersionPersistency());
	}
	
	@Override
	protected ReqArchitectureVersion createArchitectureVersion() {
		return ReqArchitectureModelFactoryFacade.createEmptyReqModel("architecturemodel");
	}

}
