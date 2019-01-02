package edu.kit.ipd.sdq.kamp.ruledsl.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xbase.testing.RegisteringFileSystemAccess;

import com.google.inject.Provider;

class KampRuleLanguageFileSystemAccessProviderForIntegrationTest implements Provider<RegisteringFileSystemAccess> {
	
	@Override
	public RegisteringFileSystemAccess get() {
		return new RegisteringFileSystemAccess() {
			@Override
			public URI getURI(String path) {
			
				return URI.createURI("platform:/resource/" + KampRuleLanguageFileSystemAccessProvider.PARENT_FOLDER_NAME + "/src-gen/" + path);
			}
		};
	}
	
}