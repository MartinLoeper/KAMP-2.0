/**
 */
package archoptions.provider;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;
import de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin;
import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;
import effects.provider.EffectsEditPlugin;

import glossary.provider.GlossaryEditPlugin;

import namedelement.provider.NamedelementEditPlugin;

import options.provider.OptionsEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import qualities.provider.QualitiesEditPlugin;

import relations.provider.RelationsEditPlugin;

/**
 * This is the central singleton for the Archoptions edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ArchoptionsEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ArchoptionsEditPlugin INSTANCE = new ArchoptionsEditPlugin();

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
	public ArchoptionsEditPlugin() {
		super
		  (new ResourceLocator [] {
		     OptionsEditPlugin.INSTANCE,
		     EffectsEditPlugin.INSTANCE,
		     GlossaryEditPlugin.INSTANCE,
		     IdentifierEditPlugin.INSTANCE,
		     NamedelementEditPlugin.INSTANCE,
		     QualitiesEditPlugin.INSTANCE,
		     RelationsEditPlugin.INSTANCE,
		     DimensionsEditPlugin.INSTANCE,
		     DimensiontypesEditPlugin.INSTANCE,
		     UnitsEditPlugin.INSTANCE,
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
