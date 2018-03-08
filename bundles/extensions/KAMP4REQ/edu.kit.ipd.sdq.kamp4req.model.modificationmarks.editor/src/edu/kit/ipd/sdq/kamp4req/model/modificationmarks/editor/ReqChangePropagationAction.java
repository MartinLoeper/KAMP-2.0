package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4req.core.ReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4req.core.ReqChangePropagationAnalysis;

/**
 *@generated NOT
 */
public class ReqChangePropagationAction extends AbstractChangePropagationAction<ReqArchitectureVersion> {
	
	@Override
	protected AbstractChangePropagationAnalysis<ReqArchitectureVersion> createChangePropagationAnalysis() {
		return new ReqChangePropagationAnalysis(getProject());
	}

	@Override
	protected AbstractArchitectureVersionPersistency<ReqArchitectureVersion> createArchitectureVersionPersistency() {
		return new ReqArchitectureVersionPersistency();
	}
	
}
