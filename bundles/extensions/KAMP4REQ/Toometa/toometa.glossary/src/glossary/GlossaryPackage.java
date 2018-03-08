/**
 */
package glossary;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see glossary.GlossaryFactory
 * @model kind="package"
 * @generated
 */
public interface GlossaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "glossary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toometa.de/glossary/0.6";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "glossary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlossaryPackage eINSTANCE = glossary.impl.GlossaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link glossary.impl.GlossaryTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossary.impl.GlossaryTermImpl
	 * @see glossary.impl.GlossaryPackageImpl#getGlossaryTerm()
	 * @generated
	 */
	int GLOSSARY_TERM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Glossary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__GLOSSARY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__TERM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__DEFINITION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synonym</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__SYNONYM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Otherforms</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__OTHERFORMS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Termcategory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__TERMCATEGORY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Termproperty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__TERMPROPERTY = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Antonym</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__ANTONYM = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link glossary.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossary.impl.GlossaryImpl
	 * @see glossary.impl.GlossaryPackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__TERMS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__TITLE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link glossary.TermInfluenceProperty <em>Term Influence Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossary.TermInfluenceProperty
	 * @see glossary.impl.GlossaryPackageImpl#getTermInfluenceProperty()
	 * @generated
	 */
	int TERM_INFLUENCE_PROPERTY = 2;

	/**
	 * The meta object id for the '{@link glossary.TermCategory <em>Term Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see glossary.TermCategory
	 * @see glossary.impl.GlossaryPackageImpl#getTermCategory()
	 * @generated
	 */
	int TERM_CATEGORY = 3;


	/**
	 * Returns the meta object for class '{@link glossary.GlossaryTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see glossary.GlossaryTerm
	 * @generated
	 */
	EClass getGlossaryTerm();

	/**
	 * Returns the meta object for the container reference '{@link glossary.GlossaryTerm#getGlossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Glossary</em>'.
	 * @see glossary.GlossaryTerm#getGlossary()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_Glossary();

	/**
	 * Returns the meta object for the attribute '{@link glossary.GlossaryTerm#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see glossary.GlossaryTerm#getTerm()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EAttribute getGlossaryTerm_Term();

	/**
	 * Returns the meta object for the attribute '{@link glossary.GlossaryTerm#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see glossary.GlossaryTerm#getDefinition()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EAttribute getGlossaryTerm_Definition();

	/**
	 * Returns the meta object for the reference list '{@link glossary.GlossaryTerm#getSynonym <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synonym</em>'.
	 * @see glossary.GlossaryTerm#getSynonym()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_Synonym();

	/**
	 * Returns the meta object for the attribute list '{@link glossary.GlossaryTerm#getOtherforms <em>Otherforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Otherforms</em>'.
	 * @see glossary.GlossaryTerm#getOtherforms()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EAttribute getGlossaryTerm_Otherforms();

	/**
	 * Returns the meta object for the attribute list '{@link glossary.GlossaryTerm#getTermcategory <em>Termcategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Termcategory</em>'.
	 * @see glossary.GlossaryTerm#getTermcategory()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EAttribute getGlossaryTerm_Termcategory();

	/**
	 * Returns the meta object for the attribute '{@link glossary.GlossaryTerm#getTermproperty <em>Termproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termproperty</em>'.
	 * @see glossary.GlossaryTerm#getTermproperty()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EAttribute getGlossaryTerm_Termproperty();

	/**
	 * Returns the meta object for the reference list '{@link glossary.GlossaryTerm#getAntonym <em>Antonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Antonym</em>'.
	 * @see glossary.GlossaryTerm#getAntonym()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_Antonym();

	/**
	 * Returns the meta object for class '{@link glossary.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see glossary.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the containment reference list '{@link glossary.Glossary#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see glossary.Glossary#getTerms()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Terms();

	/**
	 * Returns the meta object for the attribute '{@link glossary.Glossary#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see glossary.Glossary#getTitle()
	 * @see #getGlossary()
	 * @generated
	 */
	EAttribute getGlossary_Title();

	/**
	 * Returns the meta object for enum '{@link glossary.TermInfluenceProperty <em>Term Influence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Term Influence Property</em>'.
	 * @see glossary.TermInfluenceProperty
	 * @generated
	 */
	EEnum getTermInfluenceProperty();

	/**
	 * Returns the meta object for enum '{@link glossary.TermCategory <em>Term Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Term Category</em>'.
	 * @see glossary.TermCategory
	 * @generated
	 */
	EEnum getTermCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlossaryFactory getGlossaryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link glossary.impl.GlossaryTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossary.impl.GlossaryTermImpl
		 * @see glossary.impl.GlossaryPackageImpl#getGlossaryTerm()
		 * @generated
		 */
		EClass GLOSSARY_TERM = eINSTANCE.getGlossaryTerm();

		/**
		 * The meta object literal for the '<em><b>Glossary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__GLOSSARY = eINSTANCE.getGlossaryTerm_Glossary();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_TERM__TERM = eINSTANCE.getGlossaryTerm_Term();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_TERM__DEFINITION = eINSTANCE.getGlossaryTerm_Definition();

		/**
		 * The meta object literal for the '<em><b>Synonym</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__SYNONYM = eINSTANCE.getGlossaryTerm_Synonym();

		/**
		 * The meta object literal for the '<em><b>Otherforms</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_TERM__OTHERFORMS = eINSTANCE.getGlossaryTerm_Otherforms();

		/**
		 * The meta object literal for the '<em><b>Termcategory</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_TERM__TERMCATEGORY = eINSTANCE.getGlossaryTerm_Termcategory();

		/**
		 * The meta object literal for the '<em><b>Termproperty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_TERM__TERMPROPERTY = eINSTANCE.getGlossaryTerm_Termproperty();

		/**
		 * The meta object literal for the '<em><b>Antonym</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__ANTONYM = eINSTANCE.getGlossaryTerm_Antonym();

		/**
		 * The meta object literal for the '{@link glossary.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossary.impl.GlossaryImpl
		 * @see glossary.impl.GlossaryPackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__TERMS = eINSTANCE.getGlossary_Terms();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY__TITLE = eINSTANCE.getGlossary_Title();

		/**
		 * The meta object literal for the '{@link glossary.TermInfluenceProperty <em>Term Influence Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossary.TermInfluenceProperty
		 * @see glossary.impl.GlossaryPackageImpl#getTermInfluenceProperty()
		 * @generated
		 */
		EEnum TERM_INFLUENCE_PROPERTY = eINSTANCE.getTermInfluenceProperty();

		/**
		 * The meta object literal for the '{@link glossary.TermCategory <em>Term Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see glossary.TermCategory
		 * @see glossary.impl.GlossaryPackageImpl#getTermCategory()
		 * @generated
		 */
		EEnum TERM_CATEGORY = eINSTANCE.getTermCategory();

	}

} //GlossaryPackage
