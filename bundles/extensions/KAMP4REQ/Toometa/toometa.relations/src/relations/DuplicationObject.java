/**
 */
package relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duplication Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.DuplicationObject#getDuplicateOf <em>Duplicate Of</em>}</li>
 *   <li>{@link relations.DuplicationObject#getHasDuplicates <em>Has Duplicates</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getDuplicationObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface DuplicationObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Duplicate Of</b></em>' reference list.
	 * The list contents are of type {@link relations.DuplicationObject}.
	 * It is bidirectional and its opposite is '{@link relations.DuplicationObject#getHasDuplicates <em>Has Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duplicate Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicate Of</em>' reference list.
	 * @see relations.RelationsPackage#getDuplicationObject_DuplicateOf()
	 * @see relations.DuplicationObject#getHasDuplicates
	 * @model opposite="hasDuplicates"
	 * @generated
	 */
	EList<DuplicationObject> getDuplicateOf();

	/**
	 * Returns the value of the '<em><b>Has Duplicates</b></em>' reference list.
	 * The list contents are of type {@link relations.DuplicationObject}.
	 * It is bidirectional and its opposite is '{@link relations.DuplicationObject#getDuplicateOf <em>Duplicate Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Duplicates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Duplicates</em>' reference list.
	 * @see relations.RelationsPackage#getDuplicationObject_HasDuplicates()
	 * @see relations.DuplicationObject#getDuplicateOf
	 * @model opposite="duplicateOf"
	 * @generated
	 */
	EList<DuplicationObject> getHasDuplicates();

} // DuplicationObject
