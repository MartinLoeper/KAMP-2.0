package edu.kit.ipd.sdq.kamp.ruledsl.runtime;

import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import edu.kit.ipd.sdq.kamp.ruledsl.support.IModelLoader;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ModelCache;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ModelLoader;

public enum KarlModelLoader implements IModelLoader {
	INSTANCE;
	
	private final ModelLoader modelLoader;
	
	private KarlModelLoader() {
		this.modelLoader = new ModelLoader(new ModelCache());
	}
	
	public Resource loadModelFromFile(String filePath, String alias, boolean useCached) throws IOException {
		return this.modelLoader.loadModelFromFile(filePath, alias, useCached);
	}

	@Override
	public TreeIterator<EObject> getObjectsIterator(Resource resource) {
		return this.modelLoader.getObjectsIterator(resource);
	}

	@Override
	public Resource loadModelFromFile(String filePath, boolean useCached) throws IOException {
		return this.modelLoader.loadModelFromFile(filePath, useCached);
	}
}
