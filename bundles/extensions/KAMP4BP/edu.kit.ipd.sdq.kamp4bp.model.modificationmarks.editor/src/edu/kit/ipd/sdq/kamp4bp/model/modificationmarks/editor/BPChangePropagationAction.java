package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.editor;

import org.eclipse.core.resources.IProject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4bp.core.BPChangePropagationAnalysis;

/**
 * @generated NOT 
 */
public class BPChangePropagationAction extends AbstractChangePropagationAction<BPArchitectureVersion> {
	
	@Override
	protected AbstractChangePropagationAnalysis<BPArchitectureVersion> createChangePropagationAnalysis() {
		return new BPChangePropagationAnalysis(getProject());
	}

	@Override
	protected AbstractArchitectureVersionPersistency<BPArchitectureVersion> createArchitectureVersionPersistency() {
		return new BPArchitectureVersionPersistency();
	}
	
}
