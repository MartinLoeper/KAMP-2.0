/**
 */
package glossary.provider;


import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

import glossary.GlossaryPackage;
import glossary.GlossaryTerm;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link glossary.GlossaryTerm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryTermItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTermItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTermPropertyDescriptor(object);
			addDefinitionPropertyDescriptor(object);
			addSynonymPropertyDescriptor(object);
			addOtherformsPropertyDescriptor(object);
			addTermcategoryPropertyDescriptor(object);
			addTermpropertyPropertyDescriptor(object);
			addAntonymPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Term feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTermPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_term_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_term_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__TERM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_definition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_definition_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__DEFINITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Synonym feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSynonymPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_synonym_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_synonym_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__SYNONYM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Otherforms feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOtherformsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_otherforms_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_otherforms_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__OTHERFORMS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Termcategory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTermcategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_termcategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_termcategory_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__TERMCATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Termproperty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTermpropertyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_termproperty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_termproperty_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__TERMPROPERTY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Antonym feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntonymPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_antonym_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_antonym_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__ANTONYM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns GlossaryTerm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GlossaryTerm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GlossaryTerm)object).getTerm();
		return label == null || label.length() == 0 ?
			getString("_UI_GlossaryTerm_type") :
			getString("_UI_GlossaryTerm_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GlossaryTerm.class)) {
			case GlossaryPackage.GLOSSARY_TERM__TERM:
			case GlossaryPackage.GLOSSARY_TERM__DEFINITION:
			case GlossaryPackage.GLOSSARY_TERM__OTHERFORMS:
			case GlossaryPackage.GLOSSARY_TERM__TERMCATEGORY:
			case GlossaryPackage.GLOSSARY_TERM__TERMPROPERTY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GlossaryEditPlugin.INSTANCE;
	}

}
