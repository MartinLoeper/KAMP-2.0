package edu.kit.ipd.sdq.kamp.ruledsl.runtime.rule;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Stopwatch;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRule;

/**
 * This standard (helper) rule is used to measure the time of a given rule.
 *
 * @author Martin Löper
 *
 */
public class StopwatchRule<S extends EObject, A extends EObject, T extends AbstractArchitectureVersion<M>, M extends AbstractModificationRepository<?, ?>> implements IRule<S, A, T, M> {
	private final Stopwatch stopwatch;
	private final IRule<S, A, T, M> rule;
	private final long iterations;
	private T architectureVersion;
	private ChangePropagationStepRegistry changePropagationStepRegistry;
	
	/**
	 * Creates a Stopwatch (wrapper) rule for the given {@code rule}.
	 * @param rule the rule which will be observed
	 */
	public StopwatchRule(IRule<S, A, T, M> rule) {
		this(rule, 1);
	}
	
	/**
	 * Creates a Stopwatch (wrapper) rule for the given {@code rule}.
	 * @param rule the rule which will be observed
	 * @param iterations the number of times the {@link IRule#apply(AbstractArchitectureVersion, ChangePropagationStepRegistry, AbstractChangePropagationAnalysis)} method of {@code rule} is called
	 */
	public StopwatchRule(IRule<S, A, T, M> rule, long iterations) {
		this.stopwatch = Stopwatch.createUnstarted();
		this.rule = rule;
		this.iterations = iterations;
	}
	
	@Override
	public void apply(Stream<CausingEntityMapping<A, EObject>> sourceElements) {
		
		this.stopwatch.start();
		
		for(long i=0; i < this.iterations; i++) {
			this.rule.apply(sourceElements);
		}
		
		this.stopwatch.stop();
	}
	
	/**
	 * Returns the elapsed time in the given time format.
	 * @see Stopwatch#elapsed(TimeUnit)
	 * @param timeUnit the time unit which is used to express the elapsed time
	 * @return the elapsed time in the given time unit
	 */
	public long getElapsedTime(TimeUnit timeUnit) {
		return this.stopwatch.elapsed(timeUnit);
	}
	
	/**
	 * Returns the elapsed time per iteration in the given time format.
	 * This essentially divides the total time by the number of iterations.
	 * @param timeUnit timeUnit the time unit which is used to express the elapsed time
	 * @return the elapsed time per iteration in the given time unit
	 */
	public long getElapsedTimePerIteration(TimeUnit timeUnit) {
		return this.stopwatch.elapsed(timeUnit) / this.iterations;
	}
	
	/**
	 * Returns the elapsed time in a human readable format.
	 * @see Stopwatch#toString()
	 * @return the elapsed time (human readable)
	 */
	public String getElapsedTimeAsString() {
		return this.stopwatch.toString();
	}

	@Override
	public Stream<CausingEntityMapping<A, EObject>> lookup(Stream<CausingEntityMapping<S, EObject>> sourceElements) {
		this.stopwatch.start();
		
		Set<CausingEntityMapping<A, EObject>> elements = this.rule.lookup(sourceElements).collect(Collectors.toSet());
		
		this.stopwatch.stop();
		
		return elements.stream();
	}

	@Override
	public void setArchitectureVersion(T architectureVersion) {
		this.architectureVersion = architectureVersion;
	}

	@Override
	public void setChangePropagationStepRegistry(ChangePropagationStepRegistry registry) {
		this.changePropagationStepRegistry = registry;
	}

	@Override
	public ChangePropagationStepRegistry getChangePropagationStepRegistry() {
		return this.changePropagationStepRegistry;
	}

	@Override
	public T getArchitectureVersion() {
		return this.architectureVersion;
	}

	@Override
	public int getPosition() {
		// we take the position of the observed rule
		return this.rule.getPosition();
	}

	@Override
	public Class<S> getSourceElementClass() {
		return this.rule.getSourceElementClass();
	}

	@Override
	public Class<A> getAffectedElementClass() {
		return this.rule.getAffectedElementClass();
	}
}
