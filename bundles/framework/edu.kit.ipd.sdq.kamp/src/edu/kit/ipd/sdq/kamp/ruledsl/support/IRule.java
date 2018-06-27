package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;

/**
 * The interface represents an entity which defines change propagation functionality.
 * Change propagates from source elements to affected elements via a lookup method.
 * The apply method is used in order to process the affected elements at the end of the analysis.
 * 
 * @author Martin Loeper
 *
 * @param <S> the type of source elements
 * @param <A> the type of affected elements
 * @param <V> the type of the architecture version
 * @param <M> the type of modification mark repository which is contained in the architecture version
 */
public interface IRule<S extends EObject, A extends EObject, T extends AbstractArchitectureVersion<M>, M extends AbstractModificationRepository<?, ?>> {
	void apply(Stream<S> sourceElements);
	Stream<CausingEntityMapping<A, EObject>> lookup(Stream<CausingEntityMapping<S, EObject>> sourceElements);

	void setArchitectureVersion(T architectureVersion);
	void setChangePropagationStepRegistry(ChangePropagationStepRegistry registry);
	ChangePropagationStepRegistry getChangePropagationStepRegistry();
	T getArchitectureVersion();	
}
