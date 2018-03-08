/**
 */
package qualities.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualities.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qualities.QualitiesPackage
 * @generated
 */
public class QualitiesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualitiesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitiesSwitch() {
		if (modelPackage == null) {
			modelPackage = QualitiesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QualitiesPackage.RELIABILITY_COMPLIANCE: {
				ReliabilityCompliance reliabilityCompliance = (ReliabilityCompliance)theEObject;
				T result = caseReliabilityCompliance(reliabilityCompliance);
				if (result == null) result = caseReliability(reliabilityCompliance);
				if (result == null) result = caseQualityType(reliabilityCompliance);
				if (result == null) result = caseIdentifier(reliabilityCompliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.INSTALLABILITY: {
				Installability installability = (Installability)theEObject;
				T result = caseInstallability(installability);
				if (result == null) result = casePortability(installability);
				if (result == null) result = caseQualityType(installability);
				if (result == null) result = caseIdentifier(installability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.RELIABILITY: {
				Reliability reliability = (Reliability)theEObject;
				T result = caseReliability(reliability);
				if (result == null) result = caseQualityType(reliability);
				if (result == null) result = caseIdentifier(reliability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.CO_EXISTENCE: {
				CoExistence coExistence = (CoExistence)theEObject;
				T result = caseCoExistence(coExistence);
				if (result == null) result = casePortability(coExistence);
				if (result == null) result = caseQualityType(coExistence);
				if (result == null) result = caseIdentifier(coExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.OPERABILITY: {
				Operability operability = (Operability)theEObject;
				T result = caseOperability(operability);
				if (result == null) result = caseUsability(operability);
				if (result == null) result = caseQualityType(operability);
				if (result == null) result = caseIdentifier(operability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.STABILITY: {
				Stability stability = (Stability)theEObject;
				T result = caseStability(stability);
				if (result == null) result = caseMaintainability(stability);
				if (result == null) result = caseQualityType(stability);
				if (result == null) result = caseIdentifier(stability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.MAINTAINABILITY_COMPLIANCE: {
				MaintainabilityCompliance maintainabilityCompliance = (MaintainabilityCompliance)theEObject;
				T result = caseMaintainabilityCompliance(maintainabilityCompliance);
				if (result == null) result = caseMaintainability(maintainabilityCompliance);
				if (result == null) result = caseQualityType(maintainabilityCompliance);
				if (result == null) result = caseIdentifier(maintainabilityCompliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.PORTABILITY: {
				Portability portability = (Portability)theEObject;
				T result = casePortability(portability);
				if (result == null) result = caseQualityType(portability);
				if (result == null) result = caseIdentifier(portability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.MAINTAINABILITY: {
				Maintainability maintainability = (Maintainability)theEObject;
				T result = caseMaintainability(maintainability);
				if (result == null) result = caseQualityType(maintainability);
				if (result == null) result = caseIdentifier(maintainability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.MATURITY: {
				Maturity maturity = (Maturity)theEObject;
				T result = caseMaturity(maturity);
				if (result == null) result = caseReliability(maturity);
				if (result == null) result = caseQualityType(maturity);
				if (result == null) result = caseIdentifier(maturity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.ATTRACTIVENESS: {
				Attractiveness attractiveness = (Attractiveness)theEObject;
				T result = caseAttractiveness(attractiveness);
				if (result == null) result = caseUsability(attractiveness);
				if (result == null) result = caseQualityType(attractiveness);
				if (result == null) result = caseIdentifier(attractiveness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.ANALYZABILITY: {
				Analyzability analyzability = (Analyzability)theEObject;
				T result = caseAnalyzability(analyzability);
				if (result == null) result = caseMaintainability(analyzability);
				if (result == null) result = caseQualityType(analyzability);
				if (result == null) result = caseIdentifier(analyzability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.REPLACEABILITY: {
				Replaceability replaceability = (Replaceability)theEObject;
				T result = caseReplaceability(replaceability);
				if (result == null) result = casePortability(replaceability);
				if (result == null) result = caseQualityType(replaceability);
				if (result == null) result = caseIdentifier(replaceability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.RECOVERABILITY: {
				Recoverability recoverability = (Recoverability)theEObject;
				T result = caseRecoverability(recoverability);
				if (result == null) result = caseReliability(recoverability);
				if (result == null) result = caseQualityType(recoverability);
				if (result == null) result = caseIdentifier(recoverability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.UNDERSTANDABILITY: {
				Understandability understandability = (Understandability)theEObject;
				T result = caseUnderstandability(understandability);
				if (result == null) result = caseUsability(understandability);
				if (result == null) result = caseQualityType(understandability);
				if (result == null) result = caseIdentifier(understandability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.PORTABILITY_COMPLIANCE: {
				PortabilityCompliance portabilityCompliance = (PortabilityCompliance)theEObject;
				T result = casePortabilityCompliance(portabilityCompliance);
				if (result == null) result = casePortability(portabilityCompliance);
				if (result == null) result = caseQualityType(portabilityCompliance);
				if (result == null) result = caseIdentifier(portabilityCompliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.RESSOURCE_UTILIZATION: {
				RessourceUtilization ressourceUtilization = (RessourceUtilization)theEObject;
				T result = caseRessourceUtilization(ressourceUtilization);
				if (result == null) result = caseEfficiency(ressourceUtilization);
				if (result == null) result = caseQualityType(ressourceUtilization);
				if (result == null) result = caseIdentifier(ressourceUtilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.CHANGEABILITY: {
				Changeability changeability = (Changeability)theEObject;
				T result = caseChangeability(changeability);
				if (result == null) result = caseMaintainability(changeability);
				if (result == null) result = caseQualityType(changeability);
				if (result == null) result = caseIdentifier(changeability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.INTEROPERABILITY: {
				Interoperability interoperability = (Interoperability)theEObject;
				T result = caseInteroperability(interoperability);
				if (result == null) result = caseFunctionality(interoperability);
				if (result == null) result = caseQualityType(interoperability);
				if (result == null) result = caseIdentifier(interoperability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.FAULT_TOLERANCE: {
				FaultTolerance faultTolerance = (FaultTolerance)theEObject;
				T result = caseFaultTolerance(faultTolerance);
				if (result == null) result = caseReliability(faultTolerance);
				if (result == null) result = caseQualityType(faultTolerance);
				if (result == null) result = caseIdentifier(faultTolerance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.QUALITY_TYPE_REPOSITORY: {
				QualityTypeRepository qualityTypeRepository = (QualityTypeRepository)theEObject;
				T result = caseQualityTypeRepository(qualityTypeRepository);
				if (result == null) result = caseIdentifier(qualityTypeRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.ADAPTABILITY: {
				Adaptability adaptability = (Adaptability)theEObject;
				T result = caseAdaptability(adaptability);
				if (result == null) result = casePortability(adaptability);
				if (result == null) result = caseQualityType(adaptability);
				if (result == null) result = caseIdentifier(adaptability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.FUNCTIONALITY: {
				Functionality functionality = (Functionality)theEObject;
				T result = caseFunctionality(functionality);
				if (result == null) result = caseQualityType(functionality);
				if (result == null) result = caseIdentifier(functionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.TIME_BEHAVIOUR: {
				TimeBehaviour timeBehaviour = (TimeBehaviour)theEObject;
				T result = caseTimeBehaviour(timeBehaviour);
				if (result == null) result = caseEfficiency(timeBehaviour);
				if (result == null) result = caseQualityType(timeBehaviour);
				if (result == null) result = caseIdentifier(timeBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.SECURITY: {
				Security security = (Security)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = caseFunctionality(security);
				if (result == null) result = caseQualityType(security);
				if (result == null) result = caseIdentifier(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.ACCURACY: {
				Accuracy accuracy = (Accuracy)theEObject;
				T result = caseAccuracy(accuracy);
				if (result == null) result = caseFunctionality(accuracy);
				if (result == null) result = caseQualityType(accuracy);
				if (result == null) result = caseIdentifier(accuracy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.FUNCTIONALITY_COMPLIANCE: {
				FunctionalityCompliance functionalityCompliance = (FunctionalityCompliance)theEObject;
				T result = caseFunctionalityCompliance(functionalityCompliance);
				if (result == null) result = caseFunctionality(functionalityCompliance);
				if (result == null) result = caseQualityType(functionalityCompliance);
				if (result == null) result = caseIdentifier(functionalityCompliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.EFFICIENCY: {
				Efficiency efficiency = (Efficiency)theEObject;
				T result = caseEfficiency(efficiency);
				if (result == null) result = caseQualityType(efficiency);
				if (result == null) result = caseIdentifier(efficiency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.SAFETY: {
				Safety safety = (Safety)theEObject;
				T result = caseSafety(safety);
				if (result == null) result = caseQualityType(safety);
				if (result == null) result = caseIdentifier(safety);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.EFFICIENCY_COMPLIANCE: {
				EfficiencyCompliance efficiencyCompliance = (EfficiencyCompliance)theEObject;
				T result = caseEfficiencyCompliance(efficiencyCompliance);
				if (result == null) result = caseEfficiency(efficiencyCompliance);
				if (result == null) result = caseQualityType(efficiencyCompliance);
				if (result == null) result = caseIdentifier(efficiencyCompliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.SUITABILITY: {
				Suitability suitability = (Suitability)theEObject;
				T result = caseSuitability(suitability);
				if (result == null) result = caseFunctionality(suitability);
				if (result == null) result = caseQualityType(suitability);
				if (result == null) result = caseIdentifier(suitability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.LEARNABILITY: {
				Learnability learnability = (Learnability)theEObject;
				T result = caseLearnability(learnability);
				if (result == null) result = caseUsability(learnability);
				if (result == null) result = caseQualityType(learnability);
				if (result == null) result = caseIdentifier(learnability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.QUALITY_TYPE: {
				QualityType qualityType = (QualityType)theEObject;
				T result = caseQualityType(qualityType);
				if (result == null) result = caseIdentifier(qualityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.USABILITY: {
				Usability usability = (Usability)theEObject;
				T result = caseUsability(usability);
				if (result == null) result = caseQualityType(usability);
				if (result == null) result = caseIdentifier(usability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.PERFORMANCE: {
				Performance performance = (Performance)theEObject;
				T result = casePerformance(performance);
				if (result == null) result = caseQualityType(performance);
				if (result == null) result = caseIdentifier(performance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.TESTABILITY: {
				Testability testability = (Testability)theEObject;
				T result = caseTestability(testability);
				if (result == null) result = caseMaintainability(testability);
				if (result == null) result = caseQualityType(testability);
				if (result == null) result = caseIdentifier(testability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.USABILITY_COMPLIANCE: {
				UsabilityCompliance usabilityCompliance = (UsabilityCompliance)theEObject;
				T result = caseUsabilityCompliance(usabilityCompliance);
				if (result == null) result = caseUsability(usabilityCompliance);
				if (result == null) result = caseQualityType(usabilityCompliance);
				if (result == null) result = caseIdentifier(usabilityCompliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualitiesPackage.TEXT_QUALITY: {
				TextQuality textQuality = (TextQuality)theEObject;
				T result = caseTextQuality(textQuality);
				if (result == null) result = caseQualityType(textQuality);
				if (result == null) result = caseIdentifier(textQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliabilityCompliance(ReliabilityCompliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstallability(Installability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliability(Reliability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoExistence(CoExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperability(Operability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStability(Stability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintainability Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintainability Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainabilityCompliance(MaintainabilityCompliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortability(Portability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainability(Maintainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maturity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maturity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaturity(Maturity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attractiveness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attractiveness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttractiveness(Attractiveness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analyzability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analyzability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalyzability(Analyzability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replaceability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replaceability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceability(Replaceability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recoverability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recoverability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecoverability(Recoverability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Understandability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Understandability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderstandability(Understandability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Portability Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Portability Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortabilityCompliance(PortabilityCompliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource Utilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource Utilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessourceUtilization(RessourceUtilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changeability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changeability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeability(Changeability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interoperability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interoperability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteroperability(Interoperability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault Tolerance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault Tolerance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaultTolerance(FaultTolerance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Type Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Type Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityTypeRepository(QualityTypeRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptability(Adaptability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionality(Functionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBehaviour(TimeBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accuracy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accuracy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccuracy(Accuracy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functionality Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functionality Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalityCompliance(FunctionalityCompliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Efficiency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Efficiency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEfficiency(Efficiency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafety(Safety object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Efficiency Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Efficiency Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEfficiencyCompliance(EfficiencyCompliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suitability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suitability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuitability(Suitability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learnability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learnability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearnability(Learnability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityType(QualityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsability(Usability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformance(Performance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestability(Testability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usability Compliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usability Compliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsabilityCompliance(UsabilityCompliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextQuality(TextQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QualitiesSwitch
