/**
 */
package relations.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.ecore.EClass;

import relations.Relation;
import relations.RelationObject;
import relations.RelationType;
import relations.RelationsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relations.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link relations.impl.RelationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link relations.impl.RelationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link relations.impl.RelationImpl#getTo <em>To</em>}</li>
 *   <li>{@link relations.impl.RelationImpl#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends IdentifierImpl implements Relation {
	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationsPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType getType() {
		return (RelationType)eDynamicGet(RelationsPackage.RELATION__TYPE, RelationsPackage.Literals.RELATION__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType basicGetType() {
		return (RelationType)eDynamicGet(RelationsPackage.RELATION__TYPE, RelationsPackage.Literals.RELATION__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationType newType) {
		eDynamicSet(RelationsPackage.RELATION__TYPE, RelationsPackage.Literals.RELATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getOpposite() {
		return (Relation)eDynamicGet(RelationsPackage.RELATION__OPPOSITE, RelationsPackage.Literals.RELATION__OPPOSITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetOpposite() {
		return (Relation)eDynamicGet(RelationsPackage.RELATION__OPPOSITE, RelationsPackage.Literals.RELATION__OPPOSITE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Relation newOpposite) {
		eDynamicSet(RelationsPackage.RELATION__OPPOSITE, RelationsPackage.Literals.RELATION__OPPOSITE, newOpposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationObject getFrom() {
		return (RelationObject)eDynamicGet(RelationsPackage.RELATION__FROM, RelationsPackage.Literals.RELATION__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationObject basicGetFrom() {
		return (RelationObject)eDynamicGet(RelationsPackage.RELATION__FROM, RelationsPackage.Literals.RELATION__FROM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(RelationObject newFrom) {
		eDynamicSet(RelationsPackage.RELATION__FROM, RelationsPackage.Literals.RELATION__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationObject getTo() {
		return (RelationObject)eDynamicGet(RelationsPackage.RELATION__TO, RelationsPackage.Literals.RELATION__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationObject basicGetTo() {
		return (RelationObject)eDynamicGet(RelationsPackage.RELATION__TO, RelationsPackage.Literals.RELATION__TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(RelationObject newTo) {
		eDynamicSet(RelationsPackage.RELATION__TO, RelationsPackage.Literals.RELATION__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return (Boolean)eDynamicGet(RelationsPackage.RELATION__BIDIRECTIONAL, RelationsPackage.Literals.RELATION__BIDIRECTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		eDynamicSet(RelationsPackage.RELATION__BIDIRECTIONAL, RelationsPackage.Literals.RELATION__BIDIRECTIONAL, newBidirectional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationsPackage.RELATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case RelationsPackage.RELATION__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case RelationsPackage.RELATION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case RelationsPackage.RELATION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case RelationsPackage.RELATION__BIDIRECTIONAL:
				return isBidirectional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RelationsPackage.RELATION__TYPE:
				setType((RelationType)newValue);
				return;
			case RelationsPackage.RELATION__OPPOSITE:
				setOpposite((Relation)newValue);
				return;
			case RelationsPackage.RELATION__FROM:
				setFrom((RelationObject)newValue);
				return;
			case RelationsPackage.RELATION__TO:
				setTo((RelationObject)newValue);
				return;
			case RelationsPackage.RELATION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RelationsPackage.RELATION__TYPE:
				setType((RelationType)null);
				return;
			case RelationsPackage.RELATION__OPPOSITE:
				setOpposite((Relation)null);
				return;
			case RelationsPackage.RELATION__FROM:
				setFrom((RelationObject)null);
				return;
			case RelationsPackage.RELATION__TO:
				setTo((RelationObject)null);
				return;
			case RelationsPackage.RELATION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RelationsPackage.RELATION__TYPE:
				return basicGetType() != null;
			case RelationsPackage.RELATION__OPPOSITE:
				return basicGetOpposite() != null;
			case RelationsPackage.RELATION__FROM:
				return basicGetFrom() != null;
			case RelationsPackage.RELATION__TO:
				return basicGetTo() != null;
			case RelationsPackage.RELATION__BIDIRECTIONAL:
				return isBidirectional() != BIDIRECTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RelationImpl
