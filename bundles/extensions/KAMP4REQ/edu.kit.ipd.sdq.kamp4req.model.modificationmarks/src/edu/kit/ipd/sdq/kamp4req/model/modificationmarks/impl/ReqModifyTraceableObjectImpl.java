/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyTraceableObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import relations.TraceableObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Modify Traceable Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ReqModifyTraceableObjectImpl<T extends TraceableObject> extends AbstractModificationImpl<T, EObject> implements ReqModifyTraceableObject<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqModifyTraceableObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqModificationmarksPackage.Literals.REQ_MODIFY_TRACEABLE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} //ReqModifyTraceableObjectImpl
