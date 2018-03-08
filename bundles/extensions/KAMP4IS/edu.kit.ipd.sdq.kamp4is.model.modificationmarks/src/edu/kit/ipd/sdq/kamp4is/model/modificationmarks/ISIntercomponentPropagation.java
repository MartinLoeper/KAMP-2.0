/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Intercomponent Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation#getConnectorModifications <em>Connector Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISIntercomponentPropagation()
 * @model
 * @generated
 */
public interface ISIntercomponentPropagation extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Connector Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISIntercomponentPropagation_ConnectorModifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ISModifyConnector> getConnectorModifications();

} // ISIntercomponentPropagation
