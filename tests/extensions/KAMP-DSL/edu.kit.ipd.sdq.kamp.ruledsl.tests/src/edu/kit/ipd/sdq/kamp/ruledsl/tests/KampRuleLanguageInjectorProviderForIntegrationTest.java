package edu.kit.ipd.sdq.kamp.ruledsl.tests;

import org.eclipse.xtext.xbase.testing.RegisteringFileSystemAccess;

import com.google.inject.Binder;

import edu.kit.ipd.sdq.kamp.ruledsl.KampRuleLanguageRuntimeModule;

public class KampRuleLanguageInjectorProviderForIntegrationTest extends KampRuleLanguageInjectorProvider {
	
	@Override
	protected KampRuleLanguageRuntimeModule createRuntimeModule() {
		return new KampRuleLanguageRuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return KampRuleLanguageInjectorProvider.class
						.getClassLoader();
			}
			
			@Override
			public void configure(Binder binder) {				
				binder.bind(RegisteringFileSystemAccess.class).toProvider(KampRuleLanguageFileSystemAccessProviderForIntegrationTest.class);
				
				super.configure(binder);
			}
		};
	}
}
