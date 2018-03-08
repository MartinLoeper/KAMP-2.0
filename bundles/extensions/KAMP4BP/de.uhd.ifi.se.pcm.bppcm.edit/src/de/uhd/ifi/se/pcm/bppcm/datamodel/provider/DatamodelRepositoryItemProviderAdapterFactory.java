package de.uhd.ifi.se.pcm.bppcm.datamodel.provider;

import org.eclipse.emf.common.notify.Adapter;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.provider.CollectionDataTypeItemProvider;
import org.palladiosimulator.pcm.repository.provider.CompositeDataTypeItemProvider;
import org.palladiosimulator.pcm.repository.provider.RepositoryItemProviderAdapterFactory;

/**
 * Creates meaningful labels for CompositeDataType/CollectionDataType values in the 
 * editor (properties view). Default: only id shown. A better solution would be changing
 * the ItemProviders in Palladio itself; this class is only a workaround.
 */
public class DatamodelRepositoryItemProviderAdapterFactory extends RepositoryItemProviderAdapterFactory {

	@Override
	public Adapter createCompositeDataTypeAdapter() {
		if (compositeDataTypeItemProvider == null) {
			compositeDataTypeItemProvider = new CompositeDataTypeItemProvider(this){
				@Override
				public String getText(Object object) {
					return CompositeDataType.class.getSimpleName() + " \""
							+ ((CompositeDataType)object).getEntityName() + "\"";
				}
			};
		}

		return compositeDataTypeItemProvider;
	}

	@Override
	public Adapter createCollectionDataTypeAdapter() {
		if (collectionDataTypeItemProvider == null) {
			collectionDataTypeItemProvider = new CollectionDataTypeItemProvider(this){
				@Override
				public String getText(Object object) {
					return CollectionDataType.class.getSimpleName() + " \"" 
							+ ((CollectionDataType)object).getEntityName() + "\"";
				}
			};
		}

		return collectionDataTypeItemProvider;
	}

}