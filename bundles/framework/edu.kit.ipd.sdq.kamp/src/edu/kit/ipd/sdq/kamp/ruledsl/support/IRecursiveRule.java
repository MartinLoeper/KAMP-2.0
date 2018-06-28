package edu.kit.ipd.sdq.kamp.ruledsl.support;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;

public interface IRecursiveRule<S extends EObject, A extends EObject, T extends AbstractArchitectureVersion<M>, M extends AbstractModificationRepository<?, ?>> extends IRule<S, A, T, M> {
}
