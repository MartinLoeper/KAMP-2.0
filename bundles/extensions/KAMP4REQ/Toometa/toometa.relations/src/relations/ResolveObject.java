/**
 */
package relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.ResolveObject#getResolves <em>Resolves</em>}</li>
 *   <li>{@link relations.ResolveObject#getResolvedBy <em>Resolved By</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getResolveObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ResolveObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Resolves</b></em>' reference list.
	 * The list contents are of type {@link relations.ResolveObject}.
	 * It is bidirectional and its opposite is '{@link relations.ResolveObject#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolves</em>' reference list.
	 * @see relations.RelationsPackage#getResolveObject_Resolves()
	 * @see relations.ResolveObject#getResolvedBy
	 * @model opposite="resolvedBy"
	 * @generated
	 */
	EList<ResolveObject> getResolves();

	/**
	 * Returns the value of the '<em><b>Resolved By</b></em>' reference list.
	 * The list contents are of type {@link relations.ResolveObject}.
	 * It is bidirectional and its opposite is '{@link relations.ResolveObject#getResolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved By</em>' reference list.
	 * @see relations.RelationsPackage#getResolveObject_ResolvedBy()
	 * @see relations.ResolveObject#getResolves
	 * @model opposite="resolves"
	 * @generated
	 */
	EList<ResolveObject> getResolvedBy();

} // ResolveObject
