package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;

public interface IRuleProvider<T extends AbstractArchitectureVersion<M>, M extends AbstractModificationRepository<?, ?>> {
	ChangePropagationResult applyAllRules(T version, ChangePropagationStepRegistry registry);
	void register(KampRuleStub ruleClass) throws RegistryException;
	long getNumberOfRegisteredRules();
	void runEarlyHook(BiConsumer<Set<IRule<EObject, EObject, T, M>>, List<RuleBlock>> instances);
	void setConfiguration(IConfiguration config);
	IConfiguration getConfiguration();
	
	static MultiStatus createMultiStatus(String msg, Throwable t) {
        List<Status> childStatuses = new ArrayList<>();
        StackTraceElement[] stackTraces = t.getStackTrace();

        for (StackTraceElement stackTrace: stackTraces) {
            Status status = new Status(IStatus.ERROR, KampRuleLanguageUtil.BUNDLE_NAME + ".xxxxxxxx", stackTrace.toString());
            childStatuses.add(status);
        }

        MultiStatus ms = new MultiStatus(KampRuleLanguageUtil.BUNDLE_NAME + ".xxxxxxxx",
                IStatus.ERROR, childStatuses.toArray(new Status[] {}), t.toString(), t);
        
        return ms;
    }
}
