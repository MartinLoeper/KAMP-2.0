package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4is.core.derivation.ISEnrichedWorkplanDerivation;

/**
 * @generated NOT
 */
public class ISArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<ISArchitectureVersion> {
	
	public ISArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new ISDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new ISEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new ISArchitectureVersionPersistency());
	}

}

