package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersion;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4is.core.ISChangePropagationAnalysis;

/**
 * @generated NOT
 */
public class ISChangePropagationAction extends AbstractChangePropagationAction<ISArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<ISArchitectureVersion> createChangePropagationAnalysis() {
		return new ISChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<ISArchitectureVersion> createArchitectureVersionPersistency() {
		return new ISArchitectureVersionPersistency();
	}

}
