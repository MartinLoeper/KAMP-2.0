/**
 */
package relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parental Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.ParentalObject#getParentOf <em>Parent Of</em>}</li>
 *   <li>{@link relations.ParentalObject#getSubpartOf <em>Subpart Of</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getParentalObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ParentalObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Parent Of</b></em>' reference list.
	 * The list contents are of type {@link relations.ParentalObject}.
	 * It is bidirectional and its opposite is '{@link relations.ParentalObject#getSubpartOf <em>Subpart Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Of</em>' reference list.
	 * @see relations.RelationsPackage#getParentalObject_ParentOf()
	 * @see relations.ParentalObject#getSubpartOf
	 * @model opposite="subpartOf"
	 * @generated
	 */
	EList<ParentalObject> getParentOf();

	/**
	 * Returns the value of the '<em><b>Subpart Of</b></em>' reference list.
	 * The list contents are of type {@link relations.ParentalObject}.
	 * It is bidirectional and its opposite is '{@link relations.ParentalObject#getParentOf <em>Parent Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subpart Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subpart Of</em>' reference list.
	 * @see relations.RelationsPackage#getParentalObject_SubpartOf()
	 * @see relations.ParentalObject#getParentOf
	 * @model opposite="parentOf"
	 * @generated
	 */
	EList<ParentalObject> getSubpartOf();

} // ParentalObject
