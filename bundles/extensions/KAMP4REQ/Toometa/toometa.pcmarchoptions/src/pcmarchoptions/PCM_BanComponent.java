/**
 */
package pcmarchoptions;

import archoptions.BanComponent;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Ban Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmarchoptions.PCM_BanComponent#getBannedContextNames <em>Banned Context Names</em>}</li>
 * </ul>
 *
 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_BanComponent()
 * @model
 * @generated
 */
public interface PCM_BanComponent extends BanComponent {
	/**
	 * Returns the value of the '<em><b>Banned Context Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Banned Context Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banned Context Names</em>' attribute list.
	 * @see pcmarchoptions.PcmarchoptionsPackage#getPCM_BanComponent_BannedContextNames()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getBannedContextNames();

} // PCM_BanComponent
