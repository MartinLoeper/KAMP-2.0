/**
 */
package relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.SelectionObject#getSelected <em>Selected</em>}</li>
 *   <li>{@link relations.SelectionObject#getSelectedBy <em>Selected By</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getSelectionObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface SelectionObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference list.
	 * The list contents are of type {@link relations.SelectionObject}.
	 * It is bidirectional and its opposite is '{@link relations.SelectionObject#getSelectedBy <em>Selected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference list.
	 * @see relations.RelationsPackage#getSelectionObject_Selected()
	 * @see relations.SelectionObject#getSelectedBy
	 * @model opposite="selectedBy"
	 * @generated
	 */
	EList<SelectionObject> getSelected();

	/**
	 * Returns the value of the '<em><b>Selected By</b></em>' reference list.
	 * The list contents are of type {@link relations.SelectionObject}.
	 * It is bidirectional and its opposite is '{@link relations.SelectionObject#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected By</em>' reference list.
	 * @see relations.RelationsPackage#getSelectionObject_SelectedBy()
	 * @see relations.SelectionObject#getSelected
	 * @model opposite="selected"
	 * @generated
	 */
	EList<SelectionObject> getSelectedBy();

} // SelectionObject
