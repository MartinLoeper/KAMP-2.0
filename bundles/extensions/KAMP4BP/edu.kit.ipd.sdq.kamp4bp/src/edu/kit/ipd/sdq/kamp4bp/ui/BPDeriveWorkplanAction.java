package edu.kit.ipd.sdq.kamp4bp.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4bp.core.derivation.BPDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4bp.core.derivation.BPEnrichedWorkplanDerivation;

public class BPDeriveWorkplanAction extends AbstractDeriveWorkplanAction<BPArchitectureVersion> {

	public BPDeriveWorkplanAction() {
		this.setWorkplanDerivation(new BPDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new BPEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new BPArchitectureVersionPersistency());
	}
	
}
