/**
 */
package archoptions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arch Candidate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link archoptions.ArchCandidate#getSubOptions <em>Sub Options</em>}</li>
 * </ul>
 *
 * @see archoptions.ArchoptionsPackage#getArchCandidate()
 * @model abstract="true"
 * @generated
 */
public interface ArchCandidate extends ArchOption {
	/**
	 * Returns the value of the '<em><b>Sub Options</b></em>' reference list.
	 * The list contents are of type {@link archoptions.ArchOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Options</em>' reference list.
	 * @see archoptions.ArchoptionsPackage#getArchCandidate_SubOptions()
	 * @model
	 * @generated
	 */
	EList<ArchOption> getSubOptions();

} // ArchCandidate
