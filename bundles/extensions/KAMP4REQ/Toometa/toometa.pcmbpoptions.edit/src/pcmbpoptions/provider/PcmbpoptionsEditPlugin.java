/**
 */
package pcmbpoptions.provider;

import archoptions.provider.ArchoptionsEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;

import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;

import effects.provider.EffectsEditPlugin;

import glossary.provider.GlossaryEditPlugin;

import namedelement.provider.NamedelementEditPlugin;

import options.provider.OptionsEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

import qualities.provider.QualitiesEditPlugin;

import relations.provider.RelationsEditPlugin;

/**
 * This is the central singleton for the Pcmbpoptions edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PcmbpoptionsEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PcmbpoptionsEditPlugin INSTANCE = new PcmbpoptionsEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcmbpoptionsEditPlugin() {
		super
		  (new ResourceLocator [] {
		     ArchoptionsEditPlugin.INSTANCE,
		     DimensionsEditPlugin.INSTANCE,
		     DimensiontypesEditPlugin.INSTANCE,
		     EffectsEditPlugin.INSTANCE,
		     GlossaryEditPlugin.INSTANCE,
		     IdentifierEditPlugin.INSTANCE,
		     NamedelementEditPlugin.INSTANCE,
		     OptionsEditPlugin.INSTANCE,
		     PalladioComponentModelEditPlugin.INSTANCE,
		     ProbabilityFunctionEditPlugin.INSTANCE,
		     QualitiesEditPlugin.INSTANCE,
		     RelationsEditPlugin.INSTANCE,
		     StoexEditPlugin.INSTANCE,
		     UnitsEditPlugin.INSTANCE,
		     de.uka.ipd.sdq.units.provider.UnitsEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
