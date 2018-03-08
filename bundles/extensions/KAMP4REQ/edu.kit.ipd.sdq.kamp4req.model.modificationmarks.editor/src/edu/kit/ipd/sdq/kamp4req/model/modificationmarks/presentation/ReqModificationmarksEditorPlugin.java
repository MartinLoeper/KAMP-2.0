/**
 */
package edu.kit.ipd.sdq.kamp4req.model.modificationmarks.presentation;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.provider.BpEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;

import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;

import decisions.provider.DecisionsEditPlugin;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ModificationmarksEditPlugin;

import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.provider.BPModificationmarksEditPlugin;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider.ISModificationmarksEditPlugin;

import effects.provider.EffectsEditPlugin;

import glossary.provider.GlossaryEditPlugin;

import namedelement.provider.NamedelementEditPlugin;

import options.provider.OptionsEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

import qualities.provider.QualitiesEditPlugin;

import relations.provider.RelationsEditPlugin;

import requirements.provider.RequirementsEditPlugin;

/**
 * This is the central singleton for the ReqModificationmarks editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ReqModificationmarksEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ReqModificationmarksEditorPlugin INSTANCE = new ReqModificationmarksEditorPlugin();
	
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
	public ReqModificationmarksEditorPlugin() {
		super
			(new ResourceLocator [] {
				BpEditPlugin.INSTANCE,
				BPModificationmarksEditPlugin.INSTANCE,
				DecisionsEditPlugin.INSTANCE,
				DimensionsEditPlugin.INSTANCE,
				DimensiontypesEditPlugin.INSTANCE,
				EffectsEditPlugin.INSTANCE,
				GlossaryEditPlugin.INSTANCE,
				ISModificationmarksEditPlugin.INSTANCE,
				ModificationmarksEditPlugin.INSTANCE,
				NamedelementEditPlugin.INSTANCE,
				OptionsEditPlugin.INSTANCE,
				PalladioComponentModelEditPlugin.INSTANCE,
				QualitiesEditPlugin.INSTANCE,
				RelationsEditPlugin.INSTANCE,
				RequirementsEditPlugin.INSTANCE,
				UnitsEditPlugin.INSTANCE,
				IdentifierEditPlugin.INSTANCE,
				StoexEditPlugin.INSTANCE,
				de.uka.ipd.sdq.units.provider.UnitsEditPlugin.INSTANCE,
				ProbabilityFunctionEditPlugin.INSTANCE,
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
	public static class Implementation extends EclipseUIPlugin {
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
