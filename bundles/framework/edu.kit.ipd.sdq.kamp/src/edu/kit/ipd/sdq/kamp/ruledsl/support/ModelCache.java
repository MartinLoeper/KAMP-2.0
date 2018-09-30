package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class ModelCache {
	private Map<URI, Resource> resources = new HashMap<>();
	private Map<String, URI> uris = new HashMap<>();
	private Map<String, URI> aliases = new HashMap<>();

	public void load(Resource resource, String filePath, String alias) {
		resources.put(resource.getURI(), resource);
		uris.put(filePath, resource.getURI());
		if(alias != null) {
			aliases.put(alias, resource.getURI());
		}
	}
	
	public Resource getResource(URI uri) {
		return resources.get(uri);
	}
	
	public URI getUriForAlias(String alias) {
		return this.aliases.get(alias);
	}
	
	public URI getUriForFilePath(String filePath) {
		return this.uris.get(filePath);
	}
	
	public void clear() {
		resources.clear();
		uris.clear();
	}

}
