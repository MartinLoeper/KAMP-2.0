package edu.kit.ipd.sdq.kamp.ruledsl.tests.integration;

import org.eclipse.emf.common.util.EList;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ResultMap;

/**
 * A TestResult wraps both results:
 *  - the result of the CPRL enabled change propagation analysis
 *  - the result of the 'old' change propagation analysis with plain Java rules
 */
public class TestResult {
	private EList<ChangePropagationStep> steps;
	private ResultMap resultMap;

	public TestResult(EList<ChangePropagationStep> steps, ResultMap resultMap) {
		this.steps = steps;
		this.resultMap = resultMap;
	}

	/**
	 * Returns the result of the change progation without CPRL.
	 */
	public EList<ChangePropagationStep> getSteps() {
		return steps;
	}

	/**
	 * Returns the result of the change propagation with CPRL enabled.
	 */
	public ResultMap getResultMap() {
		return resultMap;
	}
}
