package edu.kit.ipd.sdq.kamp.ruledsl.tests.integration

import com.google.inject.Inject
import edu.kit.ipd.sdq.kamp.ruledsl.tests.KampRuleLanguageInjectorProviderForCompilation
import edu.kit.ipd.sdq.kamp.ruledsl.tests.ResourcesSetupUtil
import org.eclipse.xtext.junit4.ui.AbstractWorkbenchTest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper.Result
import org.eclipse.xtext.xbase.testing.TemporaryFolder
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// this file contais some exemplary integration tests
// these are A/B-Tests which compare the outcome of KAMP with CPRL enabled vs. CPRL disabled
@RunWith(XtextRunner)
@InjectWith(KampRuleLanguageInjectorProviderForCompilation) 
class KampRuleLanguageIntegrationTest extends AbstractWorkbenchTest {
	@Rule @Inject public TemporaryFolder temporaryFolder;
	@Inject extension CompilationTestHelper
	
	// this name is determined by the value of the PARENT_FOLDER_NAME in KampRuleLanguageFileSystemAccessProvider
	// unfortunately there is no easy way to pass this value to this class via the InjectWith annotation above
	val PROJECT_NAME = "Example"
	
	@Test
	def void testRuleCreation() {
		
		// create the Example project against which the CPRL project will be run
		
		// content of the files to create
		val manifestContent = "";
		val modificationmarksContent = "";
		
		// create META-INF file: important, because must be synced
		ResourcesSetupUtil.createFile(PROJECT_NAME + "/META-INF/MANIFEST.MF", manifestContent)
		
		// create modificationmarks file and modified folder
		ResourcesSetupUtil.createFile(PROJECT_NAME + "/modified/test.modificationmarks", modificationmarksContent)
		
		// create the CPRL file and execute the bundle registration
		'''
			// we refer to the palladio component model (version 5.2)
			import "http://palladiosimulator.org/PalladioComponentModel/5.2" as pcm
			
			rule A: metaclass(pcm::CompositeComponent) -> feature(assemblyContexts__ComposedStructure);
		'''.compile(new IAcceptor<CompilationTestHelper.Result>() {
				override accept(Result r) {}
		})
		
		// TODO: check if the bundle was successfully registered
		
		// TODO: create a KAMP instance and register the models in the given example project
		
		// TODO: trigger KAMP execution with CPRL enabled
		
		// TODO: trigger KAMP execution with CPRL disabled
		
		// TODO: compare the two values
	}
	
	def static assertEqualIgnoringWhitespace(String o1, String o2) {
		Assert.assertEquals(o1.replaceAll("\\s+",""), o2.replaceAll("\\s+",""));
	}

	@Before
	override void setUp() {
		super.setUp
		
		// create a java project as holder for the file
		ResourcesSetupUtil.createProject(PROJECT_NAME)
	}
}
