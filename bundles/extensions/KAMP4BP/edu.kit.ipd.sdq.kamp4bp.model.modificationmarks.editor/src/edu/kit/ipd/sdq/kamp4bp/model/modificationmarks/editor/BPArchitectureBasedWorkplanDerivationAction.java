package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4bp.core.derivation.BPDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4bp.core.derivation.BPEnrichedWorkplanDerivation;

/**
 * @generated NOT
 */
public class BPArchitectureBasedWorkplanDerivationAction
		extends AbstractArchitectureBasedWorkplanDerivationAction<BPArchitectureVersion> {

	public BPArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new BPDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new BPEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new BPArchitectureVersionPersistency());
	}

}
