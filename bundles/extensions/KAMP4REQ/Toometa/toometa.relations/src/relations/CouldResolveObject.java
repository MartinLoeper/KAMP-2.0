/**
 */
package relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Could Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.CouldResolveObject#getCouldResolve <em>Could Resolve</em>}</li>
 *   <li>{@link relations.CouldResolveObject#getCouldBeResolvedBy <em>Could Be Resolved By</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getCouldResolveObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface CouldResolveObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Could Resolve</b></em>' reference list.
	 * The list contents are of type {@link relations.CouldResolveObject}.
	 * It is bidirectional and its opposite is '{@link relations.CouldResolveObject#getCouldBeResolvedBy <em>Could Be Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Could Resolve</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Could Resolve</em>' reference list.
	 * @see relations.RelationsPackage#getCouldResolveObject_CouldResolve()
	 * @see relations.CouldResolveObject#getCouldBeResolvedBy
	 * @model opposite="couldBeResolvedBy"
	 * @generated
	 */
	EList<CouldResolveObject> getCouldResolve();

	/**
	 * Returns the value of the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * The list contents are of type {@link relations.CouldResolveObject}.
	 * It is bidirectional and its opposite is '{@link relations.CouldResolveObject#getCouldResolve <em>Could Resolve</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Could Be Resolved By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Could Be Resolved By</em>' reference list.
	 * @see relations.RelationsPackage#getCouldResolveObject_CouldBeResolvedBy()
	 * @see relations.CouldResolveObject#getCouldResolve
	 * @model opposite="couldResolve"
	 * @generated
	 */
	EList<CouldResolveObject> getCouldBeResolvedBy();

} // CouldResolveObject
