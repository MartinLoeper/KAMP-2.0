/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPFieldOfActivityAnnotationsFactoryImpl extends EFactoryImpl implements BPFieldOfActivityAnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPFieldOfActivityAnnotationsFactory init() {
		try {
			BPFieldOfActivityAnnotationsFactory theBPFieldOfActivityAnnotationsFactory = (BPFieldOfActivityAnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(BPFieldOfActivityAnnotationsPackage.eNS_URI);
			if (theBPFieldOfActivityAnnotationsFactory != null) {
				return theBPFieldOfActivityAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPFieldOfActivityAnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPFieldOfActivityAnnotationsFactoryImpl() {
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
			case BPFieldOfActivityAnnotationsPackage.BP_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY: return createBPFieldOfActivityAnnotationsRepository();
			case BPFieldOfActivityAnnotationsPackage.BP_GOOD: return createBPGood();
			case BPFieldOfActivityAnnotationsPackage.BP_MESSAGE: return createBPMessage();
			case BPFieldOfActivityAnnotationsPackage.BP_ORGANIZATIONAL_UNIT: return createBPOrganizationalUnit();
			case BPFieldOfActivityAnnotationsPackage.BP_TRAINING_COURSE: return createBPTrainingCourse();
			case BPFieldOfActivityAnnotationsPackage.BP_BUSINESS_PROCESS_SPECIFICATION: return createBPBusinessProcessSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPFieldOfActivityAnnotationsRepository createBPFieldOfActivityAnnotationsRepository() {
		BPFieldOfActivityAnnotationsRepositoryImpl bpFieldOfActivityAnnotationsRepository = new BPFieldOfActivityAnnotationsRepositoryImpl();
		return bpFieldOfActivityAnnotationsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPGood createBPGood() {
		BPGoodImpl bpGood = new BPGoodImpl();
		return bpGood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMessage createBPMessage() {
		BPMessageImpl bpMessage = new BPMessageImpl();
		return bpMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPOrganizationalUnit createBPOrganizationalUnit() {
		BPOrganizationalUnitImpl bpOrganizationalUnit = new BPOrganizationalUnitImpl();
		return bpOrganizationalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPTrainingCourse createBPTrainingCourse() {
		BPTrainingCourseImpl bpTrainingCourse = new BPTrainingCourseImpl();
		return bpTrainingCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPBusinessProcessSpecification createBPBusinessProcessSpecification() {
		BPBusinessProcessSpecificationImpl bpBusinessProcessSpecification = new BPBusinessProcessSpecificationImpl();
		return bpBusinessProcessSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPFieldOfActivityAnnotationsPackage getBPFieldOfActivityAnnotationsPackage() {
		return (BPFieldOfActivityAnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPFieldOfActivityAnnotationsPackage getPackage() {
		return BPFieldOfActivityAnnotationsPackage.eINSTANCE;
	}

} //BPFieldOfActivityAnnotationsFactoryImpl
