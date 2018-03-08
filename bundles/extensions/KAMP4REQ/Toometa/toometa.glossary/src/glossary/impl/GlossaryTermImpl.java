/**
 */
package glossary.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import glossary.Glossary;
import glossary.GlossaryPackage;
import glossary.GlossaryTerm;
import glossary.TermCategory;
import glossary.TermInfluenceProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getGlossary <em>Glossary</em>}</li>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getOtherforms <em>Otherforms</em>}</li>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getTermcategory <em>Termcategory</em>}</li>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getTermproperty <em>Termproperty</em>}</li>
 *   <li>{@link glossary.impl.GlossaryTermImpl#getAntonym <em>Antonym</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryTermImpl extends IdentifierImpl implements GlossaryTerm {
	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTermproperty() <em>Termproperty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermproperty()
	 * @generated
	 * @ordered
	 */
	protected static final TermInfluenceProperty TERMPROPERTY_EDEFAULT = TermInfluenceProperty.NEUTRAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossaryPackage.Literals.GLOSSARY_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glossary getGlossary() {
		return (Glossary)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__GLOSSARY, GlossaryPackage.Literals.GLOSSARY_TERM__GLOSSARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlossary(Glossary newGlossary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGlossary, GlossaryPackage.GLOSSARY_TERM__GLOSSARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlossary(Glossary newGlossary) {
		eDynamicSet(GlossaryPackage.GLOSSARY_TERM__GLOSSARY, GlossaryPackage.Literals.GLOSSARY_TERM__GLOSSARY, newGlossary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return (String)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__TERM, GlossaryPackage.Literals.GLOSSARY_TERM__TERM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		eDynamicSet(GlossaryPackage.GLOSSARY_TERM__TERM, GlossaryPackage.Literals.GLOSSARY_TERM__TERM, newTerm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinition() {
		return (String)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__DEFINITION, GlossaryPackage.Literals.GLOSSARY_TERM__DEFINITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		eDynamicSet(GlossaryPackage.GLOSSARY_TERM__DEFINITION, GlossaryPackage.Literals.GLOSSARY_TERM__DEFINITION, newDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GlossaryTerm> getSynonym() {
		return (EList<GlossaryTerm>)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__SYNONYM, GlossaryPackage.Literals.GLOSSARY_TERM__SYNONYM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getOtherforms() {
		return (EList<String>)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__OTHERFORMS, GlossaryPackage.Literals.GLOSSARY_TERM__OTHERFORMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TermCategory> getTermcategory() {
		return (EList<TermCategory>)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__TERMCATEGORY, GlossaryPackage.Literals.GLOSSARY_TERM__TERMCATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermInfluenceProperty getTermproperty() {
		return (TermInfluenceProperty)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__TERMPROPERTY, GlossaryPackage.Literals.GLOSSARY_TERM__TERMPROPERTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermproperty(TermInfluenceProperty newTermproperty) {
		eDynamicSet(GlossaryPackage.GLOSSARY_TERM__TERMPROPERTY, GlossaryPackage.Literals.GLOSSARY_TERM__TERMPROPERTY, newTermproperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GlossaryTerm> getAntonym() {
		return (EList<GlossaryTerm>)eDynamicGet(GlossaryPackage.GLOSSARY_TERM__ANTONYM, GlossaryPackage.Literals.GLOSSARY_TERM__ANTONYM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlossaryPackage.GLOSSARY_TERM__GLOSSARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGlossary((Glossary)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlossaryPackage.GLOSSARY_TERM__GLOSSARY:
				return basicSetGlossary(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GlossaryPackage.GLOSSARY_TERM__GLOSSARY:
				return eInternalContainer().eInverseRemove(this, GlossaryPackage.GLOSSARY__TERMS, Glossary.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GlossaryPackage.GLOSSARY_TERM__GLOSSARY:
				return getGlossary();
			case GlossaryPackage.GLOSSARY_TERM__TERM:
				return getTerm();
			case GlossaryPackage.GLOSSARY_TERM__DEFINITION:
				return getDefinition();
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				return getSynonym();
			case GlossaryPackage.GLOSSARY_TERM__OTHERFORMS:
				return getOtherforms();
			case GlossaryPackage.GLOSSARY_TERM__TERMCATEGORY:
				return getTermcategory();
			case GlossaryPackage.GLOSSARY_TERM__TERMPROPERTY:
				return getTermproperty();
			case GlossaryPackage.GLOSSARY_TERM__ANTONYM:
				return getAntonym();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GlossaryPackage.GLOSSARY_TERM__GLOSSARY:
				setGlossary((Glossary)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__TERM:
				setTerm((String)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__DEFINITION:
				setDefinition((String)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				getSynonym().clear();
				getSynonym().addAll((Collection<? extends GlossaryTerm>)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__OTHERFORMS:
				getOtherforms().clear();
				getOtherforms().addAll((Collection<? extends String>)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__TERMCATEGORY:
				getTermcategory().clear();
				getTermcategory().addAll((Collection<? extends TermCategory>)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__TERMPROPERTY:
				setTermproperty((TermInfluenceProperty)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__ANTONYM:
				getAntonym().clear();
				getAntonym().addAll((Collection<? extends GlossaryTerm>)newValue);
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
			case GlossaryPackage.GLOSSARY_TERM__GLOSSARY:
				setGlossary((Glossary)null);
				return;
			case GlossaryPackage.GLOSSARY_TERM__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case GlossaryPackage.GLOSSARY_TERM__DEFINITION:
				setDefinition(DEFINITION_EDEFAULT);
				return;
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				getSynonym().clear();
				return;
			case GlossaryPackage.GLOSSARY_TERM__OTHERFORMS:
				getOtherforms().clear();
				return;
			case GlossaryPackage.GLOSSARY_TERM__TERMCATEGORY:
				getTermcategory().clear();
				return;
			case GlossaryPackage.GLOSSARY_TERM__TERMPROPERTY:
				setTermproperty(TERMPROPERTY_EDEFAULT);
				return;
			case GlossaryPackage.GLOSSARY_TERM__ANTONYM:
				getAntonym().clear();
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
			case GlossaryPackage.GLOSSARY_TERM__GLOSSARY:
				return getGlossary() != null;
			case GlossaryPackage.GLOSSARY_TERM__TERM:
				return TERM_EDEFAULT == null ? getTerm() != null : !TERM_EDEFAULT.equals(getTerm());
			case GlossaryPackage.GLOSSARY_TERM__DEFINITION:
				return DEFINITION_EDEFAULT == null ? getDefinition() != null : !DEFINITION_EDEFAULT.equals(getDefinition());
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				return !getSynonym().isEmpty();
			case GlossaryPackage.GLOSSARY_TERM__OTHERFORMS:
				return !getOtherforms().isEmpty();
			case GlossaryPackage.GLOSSARY_TERM__TERMCATEGORY:
				return !getTermcategory().isEmpty();
			case GlossaryPackage.GLOSSARY_TERM__TERMPROPERTY:
				return getTermproperty() != TERMPROPERTY_EDEFAULT;
			case GlossaryPackage.GLOSSARY_TERM__ANTONYM:
				return !getAntonym().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GlossaryTermImpl
