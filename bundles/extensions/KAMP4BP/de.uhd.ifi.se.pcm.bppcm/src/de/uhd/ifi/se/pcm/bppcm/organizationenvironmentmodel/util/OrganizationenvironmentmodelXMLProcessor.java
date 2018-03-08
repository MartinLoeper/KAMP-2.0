/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.util;

import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationenvironmentmodelXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationenvironmentmodelXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		OrganizationenvironmentmodelPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the OrganizationenvironmentmodelResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new OrganizationenvironmentmodelResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new OrganizationenvironmentmodelResourceFactoryImpl());
		}
		return registrations;
	}

} //OrganizationenvironmentmodelXMLProcessor
