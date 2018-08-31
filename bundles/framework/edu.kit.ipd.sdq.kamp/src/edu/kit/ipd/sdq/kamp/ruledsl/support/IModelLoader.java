package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public interface IModelLoader {
	Resource loadModelFromFile(String filePath, String alias, boolean useCached) throws IOException;
	Resource loadModelFromFile(String filePath, boolean useCached) throws IOException;
	
	TreeIterator<EObject> getObjectsIterator(Resource resource);
}
