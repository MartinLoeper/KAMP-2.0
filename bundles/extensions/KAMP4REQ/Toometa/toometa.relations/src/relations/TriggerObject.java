/**
 */
package relations;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relations.TriggerObject#getTriggerOf <em>Trigger Of</em>}</li>
 *   <li>{@link relations.TriggerObject#getTriggeredBy <em>Triggered By</em>}</li>
 * </ul>
 *
 * @see relations.RelationsPackage#getTriggerObject()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface TriggerObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Trigger Of</b></em>' reference list.
	 * The list contents are of type {@link relations.TriggerObject}.
	 * It is bidirectional and its opposite is '{@link relations.TriggerObject#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Of</em>' reference list.
	 * @see relations.RelationsPackage#getTriggerObject_TriggerOf()
	 * @see relations.TriggerObject#getTriggeredBy
	 * @model opposite="triggeredBy"
	 * @generated
	 */
	EList<TriggerObject> getTriggerOf();

	/**
	 * Returns the value of the '<em><b>Triggered By</b></em>' reference list.
	 * The list contents are of type {@link relations.TriggerObject}.
	 * It is bidirectional and its opposite is '{@link relations.TriggerObject#getTriggerOf <em>Trigger Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By</em>' reference list.
	 * @see relations.RelationsPackage#getTriggerObject_TriggeredBy()
	 * @see relations.TriggerObject#getTriggerOf
	 * @model opposite="triggerOf"
	 * @generated
	 */
	EList<TriggerObject> getTriggeredBy();

} // TriggerObject
