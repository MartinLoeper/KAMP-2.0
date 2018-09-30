package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;

public class ModelLoader implements IModelLoader {
	private ModelCache cache;
	private ResourceSet resourceSet;
	
	public ModelLoader(ModelCache cache) {
		this.cache = cache;
		this.resourceSet = new ResourceSetImpl();
	}
	
	public Resource loadModelFromFile(String filePath, boolean useCached) throws IOException {
		return this.loadModelFromFile(filePath, null, useCached);
	}
	
	public Resource loadModelFromFile(String filePath, String alias, boolean useCached) throws IOException {
		Resource resource = null;
		if(useCached) {
			resource = this.getResourceByFilename(filePath);
			if(resource != null) {
				return resource;
			}
		}

		URI loadURI = URI.createPlatformResourceURI(filePath, true);     
    	resource = this.resourceSet.createResource(loadURI);  	
    	((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());      	
    	Map<Object, Object> loadOptions = AbstractArchitectureVersionPersistency.setupLoadOptions(resource);
    	resource.load(loadOptions);	
    	this.cache.load(resource, filePath, alias);
    	
    	return resource;
	}
	
	private Resource getResourceByUri(URI uri) {
		return this.cache.getResource(uri);
	}
	
	private Resource getResourceByFilename(String filePath) {
		URI uri = this.cache.getUriForFilePath(filePath);
		return this.cache.getResource(uri);
	}
	
	private Resource getResourceByAlias(String alias) {
		URI uri = this.cache.getUriForAlias(alias);
		return this.cache.getResource(uri);
	}
	
	public TreeIterator<EObject> getObjectsIterator(Resource resource) {
		return resource.getAllContents();
	}
}
