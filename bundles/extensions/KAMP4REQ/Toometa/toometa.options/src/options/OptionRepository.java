/**
 */
package options;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link options.OptionRepository#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see options.OptionsPackage#getOptionRepository()
 * @model
 * @generated
 */
public interface OptionRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link options.Option}.
	 * It is bidirectional and its opposite is '{@link options.Option#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see options.OptionsPackage#getOptionRepository_Options()
	 * @see options.Option#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<Option> getOptions();

} // OptionRepository
