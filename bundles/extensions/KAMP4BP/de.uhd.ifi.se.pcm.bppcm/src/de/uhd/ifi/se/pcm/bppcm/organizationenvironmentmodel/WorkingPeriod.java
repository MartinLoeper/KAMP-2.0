/**
 */
package de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodStartTimePoint <em>Period Start Time Point</em>}</li>
 *   <li>{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodEndTimePoint <em>Period End Time Point</em>}</li>
 * </ul>
 *
 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getWorkingPeriod()
 * @model
 * @generated
 */
public interface WorkingPeriod extends EObject, Identifier {
	/**
	 * Returns the value of the '<em><b>Period Start Time Point</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Start Time Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Start Time Point</em>' attribute.
	 * @see #setPeriodStartTimePoint(double)
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getWorkingPeriod_PeriodStartTimePoint()
	 * @model default="0.0"
	 * @generated
	 */
	double getPeriodStartTimePoint();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodStartTimePoint <em>Period Start Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Start Time Point</em>' attribute.
	 * @see #getPeriodStartTimePoint()
	 * @generated
	 */
	void setPeriodStartTimePoint(double value);

	/**
	 * Returns the value of the '<em><b>Period End Time Point</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period End Time Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period End Time Point</em>' attribute.
	 * @see #setPeriodEndTimePoint(double)
	 * @see de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.OrganizationenvironmentmodelPackage#getWorkingPeriod_PeriodEndTimePoint()
	 * @model default="0.0"
	 * @generated
	 */
	double getPeriodEndTimePoint();

	/**
	 * Sets the value of the '{@link de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.WorkingPeriod#getPeriodEndTimePoint <em>Period End Time Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period End Time Point</em>' attribute.
	 * @see #getPeriodEndTimePoint()
	 * @generated
	 */
	void setPeriodEndTimePoint(double value);

} // WorkingPeriod
