package de.uhd.ifi.se.pcm.bppcm.converter;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationEnvironmentModel;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

/**
 * 
 * Loads and persists an EMF model
 * 
 * @author Annika Boldt
 */
public class EMFModelLoader {
	
	/**
	 * loads the selected UsageModel
	 * 
	 * @param location		the path of the selected UsageModel
	 * @return				the model which was selected
	 */
	public UsageModel loadUsageModel(String location) {
		
		// Initialize the model
	    UsagemodelPackage.eINSTANCE.eClass();
	    
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    // Get the resource 
	    Resource resource = resSet.getResource(URI.createURI(location), true);
	  
	    // Get the first model element and cast it to the right type
	    assert ((UsageModel) resource.getContents().get(0) instanceof UsageModel) : "only UsageModels allowed";
	    UsageModel model = (UsageModel) resource.getContents().get(0);
	   
	   
	   return model;
	   
	}
	
	/**
	 * persists a UsageModel which was selected before.
	 * 
	 * @param location			the path of the selected UsageModel
	 * @param model				the selected UsageModel
	 */
	public void persistUsageModel(String location, UsageModel model){
		
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    // Create a resource
	    Resource resource = resSet.createResource(URI.createURI(location));
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(model);

	    // Now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
		
	}

	/**
	 * loads the selected OrganizationEnvironmentModel
	 * 
	 * @param location		the path of the selected OrganizationEnvironmentModel
	 * @return				the model which was selected
	 */
	public OrganizationEnvironmentModel loadOrganizationEnvironmentModel(
			String location) {
		
		// Initialize the model
	    OrganizationenvironmentmodelPackage.eINSTANCE.eClass();
	    
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    // Get the resource 
	    Resource resource = resSet.getResource(URI.createURI(location), true);
	  
	    // Get the first model element and cast it to the right type
	    assert ((OrganizationEnvironmentModel) resource.getContents().
	    		get(0) instanceof OrganizationEnvironmentModel) : 
	    			"only OrganizationEnvironmentModels allowed";
	    OrganizationEnvironmentModel model = (OrganizationEnvironmentModel) 
	    		resource.getContents().get(0);
	   
	   
	   return model;
	}

	/**
	 * persists an OrganizationEnvironmentModel which was selected before.
	 * 
	 * @param location			the path of the selected OrganizationEnvironmentModel
	 * @param model				the selected OrganizationEnvironmentModel
	 */
	public void persistOrganizationEnvironmentModel(String location,
			OrganizationEnvironmentModel model) {
		
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    // Create a resource
	    Resource resource = resSet.createResource(URI.createURI(location));
	    
	    // Get the first model element and cast it to the right type
	    // everything is hierarchical included in this first node
	    resource.getContents().add(model);

	    // Now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

	}
	
}
