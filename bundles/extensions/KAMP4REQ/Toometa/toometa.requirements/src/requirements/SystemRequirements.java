/**
 */
package requirements;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements.SystemRequirements#getSystemRequirements <em>System Requirements</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getSystemRequirements()
 * @model
 * @generated
 */
public interface SystemRequirements extends Identifier {
	/**
	 * Returns the value of the '<em><b>System Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link requirements.SystemRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Requirements</em>' containment reference list.
	 * @see requirements.RequirementsPackage#getSystemRequirements_SystemRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemRequirement> getSystemRequirements();

} // SystemRequirements
