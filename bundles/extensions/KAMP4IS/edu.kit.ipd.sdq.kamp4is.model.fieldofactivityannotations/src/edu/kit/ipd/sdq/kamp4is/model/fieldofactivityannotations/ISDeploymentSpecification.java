/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getRuntimeInstances <em>Runtime Instances</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDeploymentSpecification()
 * @model
 * @generated
 */
public interface ISDeploymentSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Runtime Instances</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Instances</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDeploymentSpecification_RuntimeInstances()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISRuntimeInstance> getRuntimeInstances();

	/**
	 * Returns the value of the '<em><b>Runtime Instance Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Instance Aggregations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Instance Aggregations</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDeploymentSpecification_RuntimeInstanceAggregations()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ISRuntimeInstanceAggregation> getRuntimeInstanceAggregations();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDeploymentSpecification <em>Deployment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ISFieldOfActivityAnnotationsRepository)
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage#getISDeploymentSpecification_Parent()
	 * @see edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository#getDeploymentSpecification
	 * @model opposite="deploymentSpecification" required="true" transient="false"
	 * @generated
	 */
	ISFieldOfActivityAnnotationsRepository getParent();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ISFieldOfActivityAnnotationsRepository value);

} // ISDeploymentSpecification
