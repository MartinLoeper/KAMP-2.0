/**
 */
package effects;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link effects.CategoryEffect#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see effects.EffectsPackage#getCategoryEffect()
 * @model
 * @generated
 */
public interface CategoryEffect extends Effect {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link effects.EffectCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see effects.EffectsPackage#getCategoryEffect_Category()
	 * @model
	 * @generated
	 */
	EList<EffectCategory> getCategory();

} // CategoryEffect
