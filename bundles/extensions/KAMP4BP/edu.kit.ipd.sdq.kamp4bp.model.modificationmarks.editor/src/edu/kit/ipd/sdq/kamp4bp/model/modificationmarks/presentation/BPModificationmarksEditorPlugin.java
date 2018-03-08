/**
 */
package edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.presentation;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.provider.BpEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;

import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;

import de.uka.ipd.sdq.units.provider.UnitsEditPlugin;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ModificationmarksEditPlugin;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider.ISModificationmarksEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;

/**
 * This is the central singleton for the BPModificationmarks editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class BPModificationmarksEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BPModificationmarksEditorPlugin INSTANCE = new BPModificationmarksEditorPlugin();
	
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
	public BPModificationmarksEditorPlugin() {
		super
			(new ResourceLocator [] {
				BpEditPlugin.INSTANCE,
				ISModificationmarksEditPlugin.INSTANCE,
				ModificationmarksEditPlugin.INSTANCE,
				PalladioComponentModelEditPlugin.INSTANCE,
				IdentifierEditPlugin.INSTANCE,
				StoexEditPlugin.INSTANCE,
				UnitsEditPlugin.INSTANCE,
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
