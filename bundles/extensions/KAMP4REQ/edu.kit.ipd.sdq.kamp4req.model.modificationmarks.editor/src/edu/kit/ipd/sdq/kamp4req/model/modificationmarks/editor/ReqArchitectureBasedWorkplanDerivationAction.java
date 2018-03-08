package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4bp.core.derivation.BPEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4req.core.derivation.ReqDifferenceCalculation;

/**
 *@generated NOT
 */
public class ReqArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<ReqArchitectureVersion> {

	public ReqArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new ReqDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new BPEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ReqArchitectureVersionPersistency());
	}
	
}
