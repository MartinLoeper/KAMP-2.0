package edu.kit.ipd.sdq.kamp.ruledsl.support.lookup;

import java.util.Collection;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.architecture.CrossReferenceProvider;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.ruledsl.support.CausingEntityMapping;

public class BackwardReferenceInstanceLookup<I extends EObject, O extends EObject> extends EntityConversionLookup<I, O> {
	private static String LOOKUP_NAME = "Backward Reference at Instance ";
	private final Function<O, Boolean> predicate;
	private final Class<O> targetClass;
	private final AbstractArchitectureVersion<AbstractModificationRepository<?, ?>> version;
	
	public BackwardReferenceInstanceLookup(boolean addCausingEntities, Class<O> targetClass, Function<O, Boolean> predicate, AbstractArchitectureVersion<AbstractModificationRepository<?, ?>> version) {
		super(addCausingEntities, LOOKUP_NAME + predicate.toString());
		
		this.predicate = predicate;
		this.targetClass = targetClass;
		this.version = version;
	}

	@Override
	protected Transition<I, O> convert(CausingEntityMapping<I, EObject> sourceMapping) {
		if(!(version instanceof CrossReferenceProvider)) {
			throw new UnsupportedOperationException("The given ArchitectureVersion does not support following backreferences. It must implement CrossReferenceProvider to do so.");
		}
		
		CrossReferenceProvider crossReferenceProvider = (CrossReferenceProvider) version;
		ECrossReferenceAdapter crossReferenceAdapter = crossReferenceProvider.getECrossReferenceAdapter();
		
		if(crossReferenceAdapter == null) {
			throw new UnsupportedOperationException("The given ArchitectureVersion returns null as crossReferenceAdapter which is not allowed.");
		}
		
		I affectedElement = sourceMapping.getAffectedElement();
		Set<EObject> causingEntities = sourceMapping.getCausingEntities();
		
		Collection<Setting> settings = crossReferenceAdapter.getInverseReferences(affectedElement, true);
		
		Set<CausingEntityMapping<O, EObject>> referencingEntities = settings
				.stream()
				.filter(
					// check if class which is referenced by the feature is matching
					setting -> this.targetClass.isAssignableFrom(setting.getEObject().getClass())

					// check if the given predicate matches for this element
					&& this.predicate.apply(this.targetClass.cast(setting.getEObject()))
				)
				.map(Setting::getEObject)
				.filter(distinctByEqualityHelper())
				.map(new Function<EObject, CausingEntityMapping<O, EObject>>() {

					@Override
					public CausingEntityMapping<O, EObject> apply(EObject obj) {
						CausingEntityMapping<O, EObject> newMapping = new CausingEntityMapping<>(targetClass.cast(obj), causingEntities);
						if(isCausingEntitySelectionEnabled()) {
							newMapping.addCausingEntityDistinct(affectedElement);
						}
							
						return newMapping;
					}	
				}).collect(Collectors.toSet());
		
		return new Transition<>(sourceMapping, referencingEntities);
	}
}