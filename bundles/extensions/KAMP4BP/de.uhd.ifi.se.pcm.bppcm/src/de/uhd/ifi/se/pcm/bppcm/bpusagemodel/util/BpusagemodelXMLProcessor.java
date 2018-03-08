/**
 */
package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.util;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.BpusagemodelPackage;

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
public class BpusagemodelXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpusagemodelXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		BpusagemodelPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the BpusagemodelResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new BpusagemodelResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new BpusagemodelResourceFactoryImpl());
		}
		return registrations;
	}

} //BpusagemodelXMLProcessor
