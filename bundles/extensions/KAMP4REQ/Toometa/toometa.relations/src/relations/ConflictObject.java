/**
 */
package relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.ConflictObject#getConflictsWith <em>Conflicts With</em>}</li>
 *   <li>{@link relations.ConflictObject#getHasConflicts <em>Has Conflicts</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getConflictObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ConflictObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Conflicts With</b></em>' reference list.
	 * The list contents are of type {@link relations.ConflictObject}.
	 * It is bidirectional and its opposite is '{@link relations.ConflictObject#getHasConflicts <em>Has Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicts With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts With</em>' reference list.
	 * @see relations.RelationsPackage#getConflictObject_ConflictsWith()
	 * @see relations.ConflictObject#getHasConflicts
	 * @model opposite="hasConflicts"
	 * @generated
	 */
	EList<ConflictObject> getConflictsWith();

	/**
	 * Returns the value of the '<em><b>Has Conflicts</b></em>' reference list.
	 * The list contents are of type {@link relations.ConflictObject}.
	 * It is bidirectional and its opposite is '{@link relations.ConflictObject#getConflictsWith <em>Conflicts With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Conflicts</em>' reference list.
	 * @see relations.RelationsPackage#getConflictObject_HasConflicts()
	 * @see relations.ConflictObject#getConflictsWith
	 * @model opposite="conflictsWith"
	 * @generated
	 */
	EList<ConflictObject> getHasConflicts();

} // ConflictObject
