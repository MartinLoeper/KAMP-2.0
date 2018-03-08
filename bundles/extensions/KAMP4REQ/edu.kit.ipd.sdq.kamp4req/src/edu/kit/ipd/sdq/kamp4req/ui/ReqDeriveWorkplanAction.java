package edu.kit.ipd.sdq.kamp4req.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4req.core.derivation.ReqDifferenceCalculation;

public class ReqDeriveWorkplanAction extends AbstractDeriveWorkplanAction<ReqArchitectureVersion> {

	public ReqDeriveWorkplanAction() {
		this.setWorkplanDerivation(new ReqDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new ISEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ReqArchitectureVersionPersistency());
	}
	
}
