package edu.kit.ipd.sdq.kamp.ruledsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper.Result
import org.eclipse.xtext.xbase.testing.TemporaryFolder
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// this file contais some exemplary tests 
// to check if the Java code is generated correctly out of the CPRL file
@RunWith(XtextRunner)
@InjectWith(KampRuleLanguageInjectorProviderForCompilation) 
class KampRuleLanguageCompilerTest {
	@Rule @Inject public TemporaryFolder temporaryFolder;
	@Inject extension CompilationTestHelper
	
	/**
	 * Create an exemplary rule in the rule file and check if the expected Java code is generated.
	 */
	@Test
	def void testRuleCreation() {
		val boolean[] called = newArrayList(false);
		val expectedRuleFile = '''
			package gen.rule;
			
			import edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.AbstractLookup;
			import edu.kit.ipd.sdq.kamp.util.LookupUtil;
			
			@SuppressWarnings("all")
			public class ARule implements edu.kit.ipd.sdq.kamp.ruledsl.support.IRule {
			  private edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion architectureVersion;
			  
			  private edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry changePropagationStepRegistry;
			  
			  @Override
			  public edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion getArchitectureVersion() {
			    return this.architectureVersion;
			  }
			  
			  @Override
			  public edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry getChangePropagationStepRegistry() {
			    return this.changePropagationStepRegistry;
			  }
			  
			  @Override
			  public void setArchitectureVersion(final edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion architectureVersion) {
			    this.architectureVersion = architectureVersion;
			  }
			  
			  @Override
			  public void setChangePropagationStepRegistry(final edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry changePropagationStepRegistry) {
			    this.changePropagationStepRegistry = changePropagationStepRegistry;
			  }
			  
			  private static Object/* type is 'null' */ createLookups(final edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion version) {
			    return new AbstractLookup[] {
			    								/* no lookup for rule source */
			    								new edu.kit.ipd.sdq.kamp.ruledsl.support.lookup.StructuralFeatureForwardReferenceLookup<org.palladiosimulator.pcm.repository.CompositeComponent, org.palladiosimulator.pcm.core.composition.AssemblyContext>(true, true, "assemblyContexts__ComposedStructure")
			    							};
			  }
			  
			  public static final edu.kit.ipd.sdq.kamp.ruledsl.support.RuleResult lookup(final edu.kit.ipd.sdq.kamp.ruledsl.support.Result previousRuleResult, final edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion version) {
			    AbstractLookup[] lookups = createLookups(version);
			    RuleResult<org.palladiosimulator.pcm.repository.CompositeComponent, org.palladiosimulator.pcm.core.composition.AssemblyContext> result = LookupUtil.runLookups(previousRuleResult, lookups, "A");
			    return result;
			  }
			  
			  @Override
			  public edu.kit.ipd.sdq.kamp.ruledsl.support.RuleResult lookup(final edu.kit.ipd.sdq.kamp.ruledsl.support.Result previousRuleResult) {
			    return lookup(previousRuleResult, this.getArchitectureVersion());
			  }
			  
			  @Override
			  public /* Class<org.palladiosimulator.pcm.repository.CompositeComponent> */Object getSourceElementClass() {
			    return org.palladiosimulator.pcm.repository.CompositeComponent.class;
			  }
			  
			  @Override
			  public /* Class<org.palladiosimulator.pcm.core.composition.AssemblyContext> */Object getAffectedElementClass() {
			    return org.palladiosimulator.pcm.core.composition.AssemblyContext.class;
			  }
			  
			  @Override
			  public int getPosition() {
			    return 0;
			  }
			}'''
		
		val expectedLookupHelperFile = '''
			package gen.utils;
			
			@SuppressWarnings("all")
			public class InstanceLookupHelper {
			}'''
		
		// the following is the CPRL file which is used to generate the Java code:
		'''
			// we refer to the palladio component model (version 5.2)
			import "http://palladiosimulator.org/PalladioComponentModel/5.2" as pcm
			
			rule A: metaclass(pcm::CompositeComponent) -> feature(assemblyContexts__ComposedStructure);
		'''.compile(new IAcceptor<CompilationTestHelper.Result>() {
			
			override accept(Result r) {
				// check that there are no compilation errors
				Assert.assertEquals(r.errorsAndWarnings.length, 0)
				
				// check if the compiled source code matches the expected source code
				// the comparation ignores white spaces because they have (almost) no effect on Java semantics and are
				// easy to mess up when creating the test case
				r.allGeneratedResources.forEach[p1, p2| 
					if(p1.endsWith("gen/utils/InstanceLookupHelper.java")) {
						assertEqualIgnoringWhitespace(expectedLookupHelperFile.toString(), p2.toString)
					} else if(p1.endsWith("gen/rule/ARule.java")) {
						assertEqualIgnoringWhitespace(expectedRuleFile.toString(), p2.toString)
					} else {
						/* do nothing if more files are returned than expected */
					}
				]
				called.set(0, true)
			}
		})
		
		Assert.assertTrue("Nothing was generated", called.get(0));
	}
	
	def static assertEqualIgnoringWhitespace(String o1, String o2) {
		Assert.assertEquals(o1.replaceAll("\\s+",""), o2.replaceAll("\\s+",""));
	}

}
