/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.util.ISFieldOfActivityAnnotationsResourceImpl
 * @generated
 */
public class ISFieldOfActivityAnnotationsResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFieldOfActivityAnnotationsResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new ISFieldOfActivityAnnotationsResourceImpl(uri);
		return result;
	}

} //ISFieldOfActivityAnnotationsResourceFactoryImpl
