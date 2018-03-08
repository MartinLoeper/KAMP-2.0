/**
 */
package pcmbpoptions;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCM Change Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcmbpoptions.PCM_ChangeEntity#getOldEntities <em>Old Entities</em>}</li>
 *   <li>{@link pcmbpoptions.PCM_ChangeEntity#getNewEntities <em>New Entities</em>}</li>
 * </ul>
 *
 * @see pcmbpoptions.PcmbpoptionsPackage#getPCM_ChangeEntity()
 * @model
 * @generated
 */
public interface PCM_ChangeEntity extends PCM_EntityOption {
	/**
	 * Returns the value of the '<em><b>Old Entities</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.entity.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Entities</em>' reference list.
	 * @see pcmbpoptions.PcmbpoptionsPackage#getPCM_ChangeEntity_OldEntities()
	 * @model required="true"
	 * @generated
	 */
	EList<Entity> getOldEntities();

	/**
	 * Returns the value of the '<em><b>New Entities</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.core.entity.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Entities</em>' reference list.
	 * @see pcmbpoptions.PcmbpoptionsPackage#getPCM_ChangeEntity_NewEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getNewEntities();

} // PCM_ChangeEntity
