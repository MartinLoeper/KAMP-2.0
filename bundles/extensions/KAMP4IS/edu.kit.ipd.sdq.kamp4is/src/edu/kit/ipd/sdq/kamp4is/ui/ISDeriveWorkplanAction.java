package edu.kit.ipd.sdq.kamp4is.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISEnrichedWorkplanDerivation;

public class ISDeriveWorkplanAction extends AbstractDeriveWorkplanAction<ISArchitectureVersion> {

	public ISDeriveWorkplanAction() {
		this.setWorkplanDerivation(new ISDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new ISEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ISArchitectureVersionPersistency());
	}

}
