package edu.kit.ipd.sdq.kamp.ruledsl.tests.integration.test1

import edu.kit.ipd.sdq.kamp.ruledsl.tests.integration.KampRuleLanguageIntegrationTestBase
import org.junit.Test
import java.util.Collection
import java.util.stream.Collectors

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
			
			rule A: metaclass(pcm::CompositeComponent) -> feature(assemblyContexts__ComposedStructure);
		'''
		
		// 2. run the test
		val testResult = this.runABTest(filePaths, cprlFile)
		
		// 3. compare the results of KAMP with and without CPRL enabled
		val resultMap = testResult.resultMap
		val keys = resultMap.keys;
		
		System.err.println("These are the results of CPRL:")
		for(key : keys) {
			val list = resultMap.get(key).collect(Collectors.toList);
			
			for(cem : list) {
				println(cem.affectedElement)
			}
		}
		
		val steps = testResult.steps;
		System.err.println("These are the results of KAMP without CPRL:")
		System.err.println("steps: " + steps.length);
			for (step : steps) {
				println(step.class)
			}
	}
}