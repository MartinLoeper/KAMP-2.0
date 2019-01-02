package edu.kit.ipd.sdq.kamp.ruledsl.tests.integration;

import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ResultMap;

public class TestResult {
	private EList<ChangePropagationStep> steps;
	private ResultMap resultMap;

	public TestResult(EList<ChangePropagationStep> steps, ResultMap resultMap) {
		this.steps = steps;
		this.resultMap = resultMap;
	}

	public EList<ChangePropagationStep> getSteps() {
		return steps;
	}

	public ResultMap getResultMap() {
		return resultMap;
	}
}
