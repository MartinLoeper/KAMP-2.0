package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.provider;

import org.eclipse.emf.common.notify.Adapter;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.usagemodel.provider.BranchItemProvider;
import org.palladiosimulator.pcm.usagemodel.provider.EntryLevelSystemCallItemProvider;
import org.palladiosimulator.pcm.usagemodel.provider.LoopItemProvider;
import org.palladiosimulator.pcm.usagemodel.provider.ScenarioBehaviourItemProvider;
import org.palladiosimulator.pcm.usagemodel.provider.StartItemProvider;
import org.palladiosimulator.pcm.usagemodel.provider.StopItemProvider;
import org.palladiosimulator.pcm.usagemodel.provider.UsagemodelItemProviderAdapterFactory;

public class EnhancedUsagemodelItemProviderAdapterFactory extends UsagemodelItemProviderAdapterFactory {

	private static String createLabelForEntity(Entity entity) {
		return entity.eClass().getName() + " \"" + entity.getEntityName() + "\"";
	}
	
	@Override
	public Adapter createEntryLevelSystemCallAdapter() {
		if (entryLevelSystemCallItemProvider == null) {
			entryLevelSystemCallItemProvider = new EntryLevelSystemCallItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}	
		return entryLevelSystemCallItemProvider;
	}
	
	@Override
	public Adapter createScenarioBehaviourAdapter() {
		if (scenarioBehaviourItemProvider == null) {
			scenarioBehaviourItemProvider = new ScenarioBehaviourItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}	
		return scenarioBehaviourItemProvider;
	}
	
	@Override
	public Adapter createBranchAdapter() {
		if (branchItemProvider == null) {
			branchItemProvider = new BranchItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}	
		return branchItemProvider;
	}
	
	@Override
	public Adapter createLoopAdapter() {
		if (loopItemProvider == null) {
			loopItemProvider = new LoopItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}	
		return loopItemProvider;
	}
	
	@Override
	public Adapter createStartAdapter() {
		if (startItemProvider == null) {
			startItemProvider = new StartItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}	
		return startItemProvider;
	}
	
	@Override
	public Adapter createStopAdapter() {
		if (stopItemProvider == null) {
			stopItemProvider = new StopItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}	
		return stopItemProvider;
	}
}