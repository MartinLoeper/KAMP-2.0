/**
 */
package requirements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import requirements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsFactoryImpl extends EFactoryImpl implements RequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementsFactory init() {
		try {
			RequirementsFactory theRequirementsFactory = (RequirementsFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementsPackage.eNS_URI);
			if (theRequirementsFactory != null) {
				return theRequirementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementsPackage.REQ_REPOSITORY: return (EObject)createReqRepository();
			case RequirementsPackage.PROJECT_REQUIREMENT: return (EObject)createProjectRequirement();
			case RequirementsPackage.PROCESS_REQUIREMENT: return (EObject)createProcessRequirement();
			case RequirementsPackage.CONSTRAINT: return (EObject)createConstraint();
			case RequirementsPackage.FUNCTIONAL_REQUIREMENT: return (EObject)createFunctionalRequirement();
			case RequirementsPackage.QUALITY_REQUIREMENT: return (EObject)createQualityRequirement();
			case RequirementsPackage.PROJECT_REQUIREMENTS: return (EObject)createProjectRequirements();
			case RequirementsPackage.SYSTEM_REQUIREMENTS: return (EObject)createSystemRequirements();
			case RequirementsPackage.PROCESS_REQUIREMENTS: return (EObject)createProcessRequirements();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementsPackage.REQ_PRIORITY_ENUM:
				return createReqPriorityEnumFromString(eDataType, initialValue);
			case RequirementsPackage.REQ_STATUS_ENUM:
				return createReqStatusEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RequirementsPackage.REQ_PRIORITY_ENUM:
				return convertReqPriorityEnumToString(eDataType, instanceValue);
			case RequirementsPackage.REQ_STATUS_ENUM:
				return convertReqStatusEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqRepository createReqRepository() {
		ReqRepositoryImpl reqRepository = new ReqRepositoryImpl();
		return reqRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectRequirement createProjectRequirement() {
		ProjectRequirementImpl projectRequirement = new ProjectRequirementImpl();
		return projectRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequirement createProcessRequirement() {
		ProcessRequirementImpl processRequirement = new ProcessRequirementImpl();
		return processRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalRequirement createFunctionalRequirement() {
		FunctionalRequirementImpl functionalRequirement = new FunctionalRequirementImpl();
		return functionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirement createQualityRequirement() {
		QualityRequirementImpl qualityRequirement = new QualityRequirementImpl();
		return qualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectRequirements createProjectRequirements() {
		ProjectRequirementsImpl projectRequirements = new ProjectRequirementsImpl();
		return projectRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRequirements createSystemRequirements() {
		SystemRequirementsImpl systemRequirements = new SystemRequirementsImpl();
		return systemRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequirements createProcessRequirements() {
		ProcessRequirementsImpl processRequirements = new ProcessRequirementsImpl();
		return processRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqPriorityEnum createReqPriorityEnumFromString(EDataType eDataType, String initialValue) {
		ReqPriorityEnum result = ReqPriorityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReqPriorityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqStatusEnum createReqStatusEnumFromString(EDataType eDataType, String initialValue) {
		ReqStatusEnum result = ReqStatusEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReqStatusEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsPackage getRequirementsPackage() {
		return (RequirementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementsPackage getPackage() {
		return RequirementsPackage.eINSTANCE;
	}

} //RequirementsFactoryImpl
