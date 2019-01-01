package edu.kit.ipd.sdq.kamp.ruledsl.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.xbase.testing.RegisteringFileSystemAccess;

import com.google.inject.Provider;

class KampRuleLanguageFileSystemAccessProvider implements Provider<RegisteringFileSystemAccess> {
	
	public static String PARENT_FOLDER_NAME = "Example";

	@Override
	public RegisteringFileSystemAccess get() {
		return new RegisteringFileSystemAccess() {
			@Override
			public URI getURI(String path) {
			
				// returns an arbitrary platform URI - just must be valid...
				return URI.createURI("platform:/resource/" + PARENT_FOLDER_NAME + "/src-gen");
			}
		};
	}
	
}