/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.util;

import edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.*;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsPackage
 * @generated
 */
public class BPFieldOfActivityAnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPFieldOfActivityAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPFieldOfActivityAnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPFieldOfActivityAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPFieldOfActivityAnnotationsSwitch<Adapter> modelSwitch =
		new BPFieldOfActivityAnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseBPFieldOfActivityAnnotationsRepository(BPFieldOfActivityAnnotationsRepository object) {
				return createBPFieldOfActivityAnnotationsRepositoryAdapter();
			}
			@Override
			public <T extends AbstractUserAction> Adapter caseBPUserActionAnnotation(BPUserActionAnnotation<T> object) {
				return createBPUserActionAnnotationAdapter();
			}
			@Override
			public Adapter caseBPGood(BPGood object) {
				return createBPGoodAdapter();
			}
			@Override
			public Adapter caseBPMessage(BPMessage object) {
				return createBPMessageAdapter();
			}
			@Override
			public Adapter caseBPOrganizationalUnit(BPOrganizationalUnit object) {
				return createBPOrganizationalUnitAdapter();
			}
			@Override
			public Adapter caseBPTrainingCourse(BPTrainingCourse object) {
				return createBPTrainingCourseAdapter();
			}
			@Override
			public Adapter caseBPBusinessProcessSpecification(BPBusinessProcessSpecification object) {
				return createBPBusinessProcessSpecificationAdapter();
			}
			@Override
			public Adapter caseISFieldOfActivityAnnotationsRepository(ISFieldOfActivityAnnotationsRepository object) {
				return createISFieldOfActivityAnnotationsRepositoryAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPFieldOfActivityAnnotationsRepository
	 * @generated
	 */
	public Adapter createBPFieldOfActivityAnnotationsRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation <em>BP User Action Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPUserActionAnnotation
	 * @generated
	 */
	public Adapter createBPUserActionAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood <em>BP Good</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPGood
	 * @generated
	 */
	public Adapter createBPGoodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage <em>BP Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPMessage
	 * @generated
	 */
	public Adapter createBPMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit <em>BP Organizational Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPOrganizationalUnit
	 * @generated
	 */
	public Adapter createBPOrganizationalUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse <em>BP Training Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPTrainingCourse
	 * @generated
	 */
	public Adapter createBPTrainingCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification <em>BP Business Process Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4bp.model.fieldofactivityannotations.BPBusinessProcessSpecification
	 * @generated
	 */
	public Adapter createBPBusinessProcessSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository
	 * @generated
	 */
	public Adapter createISFieldOfActivityAnnotationsRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BPFieldOfActivityAnnotationsAdapterFactory
