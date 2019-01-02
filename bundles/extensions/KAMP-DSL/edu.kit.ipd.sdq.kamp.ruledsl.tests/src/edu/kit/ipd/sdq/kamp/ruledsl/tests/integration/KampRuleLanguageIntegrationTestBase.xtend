package edu.kit.ipd.sdq.kamp.ruledsl.tests.integration

import com.google.inject.Inject
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency
import edu.kit.ipd.sdq.kamp.ruledsl.generator.KarlJobBase
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRuleProvider
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageFacade
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageUtil
import edu.kit.ipd.sdq.kamp.ruledsl.tests.KampRuleLanguageInjectorProviderForIntegrationTest
import edu.kit.ipd.sdq.kamp.ruledsl.tests.ResourcesSetupUtil
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersion
import edu.kit.ipd.sdq.kamp4bp.core.BPArchitectureVersionPersistency
import edu.kit.ipd.sdq.kamp4bp.core.BPChangePropagationAnalysis
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.Collection
import java.util.stream.Collectors
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.junit4.ui.AbstractWorkbenchTest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper.Result
import org.eclipse.xtext.xbase.testing.TemporaryFolder
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.osgi.framework.Bundle
import org.osgi.framework.BundleContext
import org.osgi.framework.FrameworkUtil

import static edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageUtil.getBundleNameForProjectName
import static org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil.cleanWorkspace
import edu.kit.ipd.sdq.kamp.ruledsl.support.ResultMap
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
import org.eclipse.emf.common.util.EList

// this file contais some exemplary integration tests
// these are A/B-Tests which compare the outcome of KAMP with CPRL enabled vs. CPRL disabled
@RunWith(XtextRunner)
@InjectWith(KampRuleLanguageInjectorProviderForIntegrationTest) 
abstract class KampRuleLanguageIntegrationTestBase extends AbstractWorkbenchTest {
	@Rule @Inject public TemporaryFolder temporaryFolder;
	@Inject extension CompilationTestHelper
	
	// this name is determined by the value of the PARENT_FOLDER_NAME in KampRuleLanguageFileSystemAccessProvider
	// unfortunately there is no easy way to pass this value to this class via the InjectWith annotation above
	val PROJECT_NAME = "Example"
	val MODIFICATIONMARKS_FILE_NAME = "test.modificationmarks"
	val MODIFIED_FOLDER_NAME = "modified"
	val BASE_FOLDER_NAME = "base"
	
	/**
	 * Should return the name of the test without any slashes or other path components.
	 */
	def String getTestName();
	
	private def String readResource(String filePath) {
		val ClassLoader classLoader = getClass().getClassLoader();
		val InputStream inputStream = classLoader.getResourceAsStream("/resources/" + filePath);
		println("reading:" + "/resources/" + filePath)
		val String result = new BufferedReader(new InputStreamReader(inputStream)).lines().collect(Collectors.joining("\n"));
		
		return result;
	}
	
	/**
	 * Adds the file path for a file in the base version.
	 * This file must be located under /resources/<test name>/base.
	 * 
	 * @param filename the name of the file in the base directory
	 */
	public def String createBaseFilePath(String filename) {
		return filename
	}
	
	/**
	 * Adds the file path for a file in the base version.
	 * This file must be located under /resources/<test name>/base/modified.
	 * 
	 * @param filename the name of the file in the base directory
	 */
	public def String createTargetFilePath(String filename) {
		return MODIFIED_FOLDER_NAME + "/" + filename
	}
	
	/**
	 * Runs an A-B test which evaluates to true if both results match.
	 * 
	 * @param testName the name of the test to run. This must match the test's resource directory name.
	 * @param filePaths a list of files to use for the test (relative to test base folder without leading slash)
	 * @param cprlFile the cprl file to use
	 */
	public def TestResult runABTest(Collection<String> filePaths, String cprlFile) {		
		// create the Example project against which the CPRL project will be run
		ResourcesSetupUtil.createProject(PROJECT_NAME)
		
		// copy all test resources into test workspace
		for(filePath : filePaths) {
			println("write it to: " + PROJECT_NAME + "/" + filePath)
			val content = this.readResource(this.testName + "/" + BASE_FOLDER_NAME + "/" + filePath)
			ResourcesSetupUtil.createFile(PROJECT_NAME + "/" + filePath, content)
		}

		// create the CPRL file and execute the bundle registration
		cprlFile.compile(new IAcceptor<CompilationTestHelper.Result>() {
				override accept(Result r) {
					Assert.assertEquals(r.errorsAndWarnings.length, 0)
					
					for(entry : r.allGeneratedResources.entrySet) {
						// determine filename
						val parts = entry.key.split("/")
						val filenameParts = newArrayList()
						var startConcat = false;
						for(p : parts) {
							if(startConcat) {
								filenameParts.add(p);
							}
							
							if(p.equals("src-gen")) {
								startConcat = true;
							}
						}
						
						val filename = filenameParts.join("/")
						
						val filePath = PROJECT_NAME + "/src-gen/" + filename;
						
						println("Writing file: " + filePath)
						
						// write the file into src-gen directory of example
						ResourcesSetupUtil.createFile(filePath, entry.value.toString);
					}
				}
		})
		
		println("Waiting for job to finish...")
		val jobMan = Job.getJobManager();
		jobMan.join(KarlJobBase.RULE_JOB_FAMILY, new NullProgressMonitor)
		println("Job finished!")
		
		// find the registered cprl bundle
		val BundleContext bundleContext = FrameworkUtil.getBundle(KampRuleLanguageFacade).getBundleContext();
		
		var Bundle cprlBundle = null
	    for(Bundle bundle : bundleContext.getBundles()) {
	    	if(bundle.getSymbolicName() !== null && bundle.getSymbolicName().equals(getBundleNameForProjectName(PROJECT_NAME))) {
	   	  		println(bundle.symbolicName + " [" + bundle.state + "]")
	   	  		cprlBundle = bundle;
	   	  	}
	    }
	    
	    // check if the bundle was successfully registered
	    Assert.assertNotNull(cprlBundle)
	    Assert.assertEquals(Bundle.ACTIVE, cprlBundle.state)
	   	{
			val languageService = KampRuleLanguageFacade.getInstance(PROJECT_NAME, IRuleProvider)
			Assert.assertNotNull(languageService)
			
			val provider = languageService.getService();
			
			Assert.assertNotNull(provider)
			Assert.assertEquals(1, provider.numberOfRegisteredRules)
			
			languageService.close
		}
		
		// trigger KAMP execution with CPRL enabled
		var ResultMap resultMap;
		{
			val changePropagationAnalysis = runChangePropagationAnalysis();
			resultMap = changePropagationAnalysis.analysis.changePropagationResult.resultMap
		}
		
		// change the configuration
		{
			val configurationContent = '''package src;
	
				import edu.kit.ipd.sdq.kamp.ruledsl.runtime.KampConfiguration;
				import edu.kit.ipd.sdq.kamp.ruledsl.support.IConfiguration;
				
				@KampConfiguration()
				public class CustomConfiguration implements IConfiguration {
				
					@Override
					public boolean areKampStandardRulesEnabled() {
						return true;
					}
				
					@Override
					public boolean isKampDslEnabled() {
						return false;
					}
				
				}'''.toString
			ResourcesSetupUtil.createFile(KampRuleLanguageUtil.getProject(PROJECT_NAME).name + "/src/CustomConfiguration.java", configurationContent)
			KampRuleLanguageFacade.buildProjectAndReInstall(PROJECT_NAME, new NullProgressMonitor);
		}
		
		// check if configuration change was applied successfully and configuration object is available now
		{
			val languageService = KampRuleLanguageFacade.getInstance(PROJECT_NAME, IRuleProvider)
			Assert.assertNotNull(languageService)
			
			val provider = languageService.getService();
			
			Assert.assertNotNull(provider)
			Assert.assertEquals(1, provider.numberOfRegisteredRules)
			Assert.assertTrue(provider.configuration.areKampStandardRulesEnabled)
   	  		Assert.assertFalse(provider.configuration.kampDslEnabled)
			
			languageService.close
		}
		
		// trigger KAMP execution with CPRL disabled
		var EList<ChangePropagationStep> steps;
		{
			val changePropagationAnalysis = runChangePropagationAnalysis();
			steps = changePropagationAnalysis.architectureVersion.getModificationMarkRepository().getChangePropagationSteps()
		}
		
		return new TestResult(
			steps,
			resultMap
		);
	}
	
	def runChangePropagationAnalysis() {
		PlatformUI.getWorkbench().saveAllEditors(false);
		val AbstractArchitectureVersionPersistency<BPArchitectureVersion> architectureVersionPersistency = new BPArchitectureVersionPersistency();
		
		val project = ResourcesPlugin.workspace.root.getProject(PROJECT_NAME)
		val folder = project.getFolder(MODIFIED_FOLDER_NAME)
		val targetversion = architectureVersionPersistency.load(folder, "target");
		
		if (targetversion !== null) {
			val analysis = new BPChangePropagationAnalysis(project);
			
			//Clear results of previous run and start new run
			targetversion.getModificationMarkRepository().getChangePropagationSteps().clear();
			analysis.runChangePropagationAnalysis(targetversion);
			try {
				architectureVersionPersistency.saveModificationMarkFile(folder.fullPath.toString, MODIFICATIONMARKS_FILE_NAME, targetversion);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			// the following is for debugging purposes only (pauses test execution)
			//if (!targetversion.getModificationMarkRepository().getChangePropagationSteps().isEmpty()) {
			//	AbstractDeriveWorkplanAction.showMessage("Propagation steps have been added to the tree.");
			//} else {
			//	AbstractDeriveWorkplanAction.showMessage("No propagation steps could be found.");
			//}
			
			PlatformUI.getWorkbench().saveAllEditors(false);
			
			// TODO: use the following if change proagations are inserted into the tree again
			//return targetversion.getModificationMarkRepository().getChangePropagationSteps();
			
			return new ChangePropagationAnalysisResultWrapper(analysis, targetversion);
		} else {
			throw new IllegalStateException("Missing the modified folder.");
		}
	}

	@Before
	override void setUp() {
		closeWelcomePage();
		closeEditors();
		cleanWorkspace();
		
		// create a java project as holder for the file
		ResourcesSetupUtil.createProject(PROJECT_NAME)
	}
	
	@After
	override tearDown() throws Exception {
		closeEditors();
		cleanWorkspace();
	}
}
