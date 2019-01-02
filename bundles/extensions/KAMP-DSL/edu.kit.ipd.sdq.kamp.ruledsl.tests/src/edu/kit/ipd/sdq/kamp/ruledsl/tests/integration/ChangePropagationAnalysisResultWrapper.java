package edu.kit.ipd.sdq.kamp.ruledsl.tests.integration;

import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion;
import edu.kit.ipd.sdq.kamp4bp.core.BPChangePropagationAnalysis;

public class ChangePropagationAnalysisResultWrapper {
	private final BPChangePropagationAnalysis analysis;
	private final BPArchitectureVersion architectureVersion;
	
	public ChangePropagationAnalysisResultWrapper(
			BPChangePropagationAnalysis analysis,
			BPArchitectureVersion architectureVersion
		) {
		this.analysis = analysis;
		this.architectureVersion = architectureVersion;
	}
	
	public BPChangePropagationAnalysis getAnalysis() {
		return this.analysis;
	}
	
	public BPArchitectureVersion getArchitectureVersion() {
		return this.architectureVersion;
	}
}
