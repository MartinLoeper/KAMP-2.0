package edu.kit.ipd.sdq.kamp.ruledsl.tests.integration.test1

import edu.kit.ipd.sdq.kamp.ruledsl.tests.integration.KampRuleLanguageIntegrationTestBase
import org.junit.Test
import java.util.Collection
import java.util.stream.Collectors
import org.junit.Assert
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall
import org.palladiosimulator.pcm.usagemodel.impl.EntryLevelSystemCallImpl
import org.palladiosimulator.pcm.repository.OperationSignature
import org.eclipse.emf.ecore.util.EcoreUtil

class SignatureToEntryLevelSystemCallPropagationTest extends KampRuleLanguageIntegrationTestBase {
	
	val TEST_NAME = "test1"
	
	override getTestName() {
		return TEST_NAME;
	}
	
	@Test
	def void SignatureToEntryLevelSystemCallPropagationTest() {	
		
		// 1. prepate the test
		val Collection<String> filePaths = newArrayList();
		filePaths.add(this.createTargetFilePath('test1.modificationmarks'))
		filePaths.add(this.createTargetFilePath('test1.repository'))
		filePaths.add(this.createTargetFilePath('test1.usagemodel'))
		filePaths.add(this.createBaseFilePath('META-INF/MANIFEST.MF'))
		
		val cprlFile = '''
			// we refer to the palladio component model (version 5.2)
			import "http://palladiosimulator.org/PalladioComponentModel/5.2" as pcm
			
			rule A: metaclass(pcm::OperationSignature) <- metaclass(pcm::EntryLevelSystemCall, operationSignature__EntryLevelSystemCall);
		'''
		
		// 2. run the test
		val testResult = this.runABTest(filePaths, cprlFile) 
		
		// 3. compare the results of KAMP with and without CPRL enabled
		// 3.1 CPRL enabled
		val resultMap = testResult.resultMap
		val keys = resultMap.keys;
		
		Assert.assertEquals(3, keys.length)
		Assert.assertTrue(keys.contains(EntryLevelSystemCallImpl))
		Assert.assertTrue(keys.contains(EntryLevelSystemCall))
		Assert.assertTrue(keys.contains(OperationSignature))
		
		val list = resultMap.get(EntryLevelSystemCallImpl).collect(Collectors.toList);
		Assert.assertEquals(1, list.length)
		val cem = list.get(0)
		Assert.assertEquals("cName (EntryLevelSystemCall)", cem.name);
		
		// 3.2 CPRL disabled
		val steps = testResult.steps;
		Assert.assertEquals(2, steps.length)
		
		for (step : steps) {
			
			// we are implicitly testing the correctness of the 'old' implementation too
			// this goes beyond a simple A/B test which compares previous implementation to CPRL implementation
			if(step instanceof BPChangePropagationDueToDataDependencies) {
				Assert.assertEquals(0, step.actorStepModifications.length)
				Assert.assertEquals(0, step.dataObjectModifications.length)
				Assert.assertEquals(0, step.datatypeModifications.length)
			} else if(step instanceof BPInterBusinessProcessPropagation) {
				Assert.assertEquals(1, step.abstractUserActionModifications.length)
				
				// the following is the real comparison of both executions' result (i.e. A/B test)
				Assert.assertEquals(
					EcoreUtil.getID(step.abstractUserActionModifications.get(0).affectedElement), 
					EcoreUtil.getID(cem.affectedElement)
				)
			} else {
				Assert.fail("Unexpected change propagation step received: " + step.class)
			}
		}
	}
}