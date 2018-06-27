package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;

public interface IRuleProvider<T extends AbstractArchitectureVersion<M>, M extends AbstractModificationRepository<?, ?>> {
	void applyAllRules(T version, ChangePropagationStepRegistry registry);
	void register(KampRuleStub ruleClass) throws RegistryException;
	long getNumberOfRegisteredRules();
	void runEarlyHook(Consumer<Set<IRule<?, ?, T, M>>> instances);
	void setConfiguration(IConfiguration config);
	IConfiguration getConfiguration();
}
