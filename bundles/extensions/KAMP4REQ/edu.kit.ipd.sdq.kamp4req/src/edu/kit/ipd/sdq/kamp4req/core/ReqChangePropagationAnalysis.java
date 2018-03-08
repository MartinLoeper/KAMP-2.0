package edu.kit.ipd.sdq.kamp4req.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4bp.core.BPChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4is.core.AbstractISChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyDecision;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyOption;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModifyEntity;
import edu.kit.ipd.sdq.kamp4req.model.modificationmarks.ReqModificationmarksFactory;
import options.Option;
import relations.DependencyObject;
import relations.TraceableObject;
import requirements.Requirement;

/**
 * The change propagation analysis of KAMP+IntBIIS+Requirements:
 * <ol><li>determines a seed population of affected elements (architecture, business 
 * processes, requirements)</li>
 * <li>calculates propagation</li>
 * <li>generates internal modification marks for affected elements</li></ol>
 */
public class ReqChangePropagationAnalysis extends AbstractISChangePropagationAnalysis<ReqArchitectureVersion, BPChangePropagationDueToDataDependencies> {
	
	private BPChangePropagationAnalysis bpChangePropagationAnalysis;
	private ReqChangePropagationDueToSpecificationDependencies changePropagationDueToSpecificationDependencies;
	
	private Collection<Requirement> markedRequirements;
	private Collection<Decision> markedDecisions;
	private Collection<Option> markedOptions;
	private IProject project;
	
	/**
	 * Creates a new instance of BPChangePropagationAnalysis which is aware of the location it is run.
	 * @param project the project in which the change propagation analysis is run
	 */
	public ReqChangePropagationAnalysis(IProject project) {
		super();
		this.project = project;
	}
	
	@Override
	public void runChangePropagationAnalysis(ReqArchitectureVersion version) {
		// Create only one modification mark per element in this propagation step
		Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?, EObject>>();
		
		this.prepareAnalysis(version);	
		this.calculateRequirementsToArchitecturePropagation(version, elementsMarkedInThisStep);
		this.getBpChangePropagationAnalysis().runChangePropagationAnalysis(version);
	}
	
	private void prepareAnalysis(ReqArchitectureVersion version) {
		this.setBpChangePropagationAnalysis(new BPChangePropagationAnalysis(project));
		this.setReqChangePropagationDueToSpecificationDependencies(ReqModificationmarksFactory.
				eINSTANCE.createReqChangePropagationDueToSpecificationDependencies());
		version.getModificationMarkRepository().getChangePropagationSteps().add(
				this.getReqChangePropagationDueToSpecificationDependencies());
		this.setMarkedRequirements(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(
				version, Requirement.class));
		this.setMarkedDecisions(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(
				version, Decision.class));
		this.setMarkedOptions(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(
				version, Option.class));
	}
	
	public void calculateRequirementsToArchitecturePropagation(ReqArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {		
		// 1 Requirement -> Requirement (depend)
		Map<Requirement, Set<DependencyObject>> requirementsToBeMarked = ReqArchitectureModelLookup.
				lookUpObjectsDependOnObjects(this.getMarkedRequirements(), Requirement.class);
		this.createAndAddRequirementModifications(requirementsToBeMarked, elementsMarkedInThisStep);		
		// 2 Requirement -> Decision/Option (trigger, resolve, couldResolve)
		calculateAndMarkRequirementToDecisionAndOptionPropagation(elementsMarkedInThisStep);
		// 3 Decision -> Decision (depend)
		Map<Decision, Set<DependencyObject>> decisionsToBeMarked = ReqArchitectureModelLookup.
				lookUpObjectsDependOnObjects(this.getMarkedDecisions(), Decision.class);
		this.createAndAddDecisionModifications(decisionsToBeMarked, elementsMarkedInThisStep);		
		// 4 Option -> Option (depend)
		Map<Option, Set<DependencyObject>> optionsToBeMarked = ReqArchitectureModelLookup.
				lookUpObjectsDependOnObjects(this.getMarkedOptions(), Option.class);
		this.createAndAddOptionModifications(optionsToBeMarked, elementsMarkedInThisStep);
		// 5 Decision -> Architecture/Business process (select an option)
		calculateAndMarkDecisionToArchitectureAndBusinessProcessPropagation(version, elementsMarkedInThisStep);
		// 6 Option -> Architecture/Business process
		calculateAndMarkOptionToArchitectureAndBusinessProcessPropagation(version, elementsMarkedInThisStep);
		
		//Remove step if it contains no element
		if (this.getReqChangePropagationDueToSpecificationDependencies().eContents().isEmpty()) {
			version.getModificationMarkRepository().getChangePropagationSteps().remove(
					this.getReqChangePropagationDueToSpecificationDependencies());
		}
	}
	
	protected void calculateAndMarkRequirementToDecisionAndOptionPropagation(
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Requirement -> Decision (trigger, resolve, couldResolve)
		Map<Decision, Set<EObject>> decisionsToBeMarked = new HashMap<Decision, Set<EObject>>();
		MapUtil.putOrAddToMap(decisionsToBeMarked, ReqArchitectureModelLookup.
				lookUpDecisionsTriggeredByTriggerObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(decisionsToBeMarked, ReqArchitectureModelLookup.
				lookUpDecisionsResolvingResolveObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(decisionsToBeMarked, ReqArchitectureModelLookup.
				lookUpDecisionsCouldBeResolvingResolveObjects(this.getMarkedRequirements()));
		this.createAndAddDecisionModifications(decisionsToBeMarked, elementsMarkedInThisStep);
		// II Requirement -> Option (trigger, resolve, couldResolve)
		Map<Option, Set<EObject>> optionsToBeMarked = new HashMap<Option, Set<EObject>>();
		MapUtil.putOrAddToMap(optionsToBeMarked, ReqArchitectureModelLookup.
				lookUpOptionsTriggeredByTriggerObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(optionsToBeMarked, ReqArchitectureModelLookup.
				lookUpOptionsResolvingResolveObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(optionsToBeMarked, ReqArchitectureModelLookup.
				lookUpOptionsCouldBeResolvingResolveObjects(this.getMarkedRequirements()));
		this.createAndAddOptionModifications(optionsToBeMarked, elementsMarkedInThisStep);	
	}
	
	protected void calculateAndMarkDecisionToArchitectureAndBusinessProcessPropagation(
			ReqArchitectureVersion version, Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Decision -> DataType
		Map<DataType, Set<Decision>> dataTypesToBeMarked = ReqArchitectureModelLookup.
				lookUpDataTypesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddDataTypeModifications(dataTypesToBeMarked, elementsMarkedInThisStep);
		// II Decision -> Interface
		Map<OperationInterface, Set<Decision>> interfacesToBeMarked = ReqArchitectureModelLookup.
				lookUpInterfacesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddInterfaceModifications(interfacesToBeMarked, elementsMarkedInThisStep);
		// III Decision -> Component
		Map<RepositoryComponent, Set<Decision>> componentsToBeMarked = ReqArchitectureModelLookup.
				lookUpComponentsReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddComponentModifications(componentsToBeMarked, elementsMarkedInThisStep);
		// IV Decision -> PCM Entity
		Map<Entity, Set<Decision>> entitiesToBeMarked = ReqArchitectureModelLookup.
				lookUpEntitiesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddEntityModifications(entitiesToBeMarked, elementsMarkedInThisStep);
	}
	
	protected void calculateAndMarkOptionToArchitectureAndBusinessProcessPropagation(
			ReqArchitectureVersion version, Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Option -> DataType
		Map<DataType, Set<Option>> dataTypesToBeMarked = ReqArchitectureModelLookup.
				lookUpDataTypesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddDataTypeModifications(dataTypesToBeMarked, elementsMarkedInThisStep);
		// II Option -> Interface
		Map<OperationInterface, Set<Option>> interfacesToBeMarked = ReqArchitectureModelLookup.
				lookUpInterfacesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddInterfaceModifications(interfacesToBeMarked, elementsMarkedInThisStep);
		// III Option -> Component
		Map<RepositoryComponent, Set<Option>> componentsToBeMarked = ReqArchitectureModelLookup.
				lookUpComponentsReferencedByOptions(version, this.getMarkedOptions());
		createAndAddComponentModifications(componentsToBeMarked, elementsMarkedInThisStep);
		// IV Option -> PCM Entity
		Map<Entity, Set<Option>> entitiesToBeMarked = ReqArchitectureModelLookup.
				lookUpEntitiesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddEntityModifications(entitiesToBeMarked, elementsMarkedInThisStep);
	}
	
	private <T extends TraceableObject> void createAndAddDataTypeModifications(
			Map<DataType, Set<T>> dataTypesToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<DataType, Set<T>> dataTypeToBeMarkedEntry: dataTypesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(dataTypeToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(dataTypeToBeMarkedEntry.getKey()).
						getCausingElements().addAll(dataTypeToBeMarkedEntry.getValue());
			} else {
				ISModifyDataType modifyDataType = ISModificationmarksFactory.eINSTANCE.createISModifyDataType();
				modifyDataType.setToolderived(true);
				modifyDataType.setAffectedElement(dataTypeToBeMarkedEntry.getKey());
				modifyDataType.getCausingElements().addAll(dataTypeToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(dataTypeToBeMarkedEntry.getKey(), modifyDataType);
				this.getReqChangePropagationDueToSpecificationDependencies().
						getDataTypeModifications().add(modifyDataType);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddInterfaceModifications(
			Map<OperationInterface, Set<T>> interfacesToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<OperationInterface, Set<T>> interfaceToBeMarkedEntry: 
				interfacesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(interfaceToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(interfaceToBeMarkedEntry.getKey()).
						getCausingElements().addAll(interfaceToBeMarkedEntry.getValue());
			} else {
				ReqModifyEntity modifyInterface = ReqModificationmarksFactory.eINSTANCE.createReqModifyEntity();
				modifyInterface.setToolderived(true);
				modifyInterface.setAffectedElement(interfaceToBeMarkedEntry.getKey());
				modifyInterface.getCausingElements().addAll(interfaceToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(interfaceToBeMarkedEntry.getKey(), modifyInterface);
				this.getReqChangePropagationDueToSpecificationDependencies().
						getEntityModifications().add(modifyInterface);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddComponentModifications(
			Map<RepositoryComponent, Set<T>> componentsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<RepositoryComponent, Set<T>> componentToBeMarkedEntry:
				componentsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(componentToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(componentToBeMarkedEntry.getKey()).
						getCausingElements().addAll(componentToBeMarkedEntry.getValue());
			} else {
				ReqModifyEntity modifyComponent = ReqModificationmarksFactory.eINSTANCE.createReqModifyEntity();
				modifyComponent.setToolderived(true);
				modifyComponent.setAffectedElement(componentToBeMarkedEntry.getKey());
				modifyComponent.getCausingElements().addAll(componentToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(componentToBeMarkedEntry.getKey(), modifyComponent);
				this.getReqChangePropagationDueToSpecificationDependencies().
						getEntityModifications().add(modifyComponent);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddEntityModifications(
			Map<Entity, Set<T>> entitysToBeMarked, Map<EObject, 
			AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Entity, Set<T>> entityToBeMarkedEntry: entitysToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(entityToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(entityToBeMarkedEntry.getKey()).
						getCausingElements().addAll(entityToBeMarkedEntry.getValue());
			} else {
				ReqModifyEntity modifyEntity = ReqModificationmarksFactory.eINSTANCE.createReqModifyEntity();
				modifyEntity.setToolderived(true);
				modifyEntity.setAffectedElement(entityToBeMarkedEntry.getKey());
				modifyEntity.getCausingElements().addAll(entityToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(entityToBeMarkedEntry.getKey(), modifyEntity);
				this.getReqChangePropagationDueToSpecificationDependencies().
						getEntityModifications().add(modifyEntity);
			}
		}
	}
	
	private <S extends EObject> void createAndAddRequirementModifications(Map<Requirement, Set<S>> requirementsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(requirementsToBeMarked, elementsMarkedInThisStep);
		for(Map.Entry<Requirement, Set<S>> requirementToBeMarkedEntry: 
				requirementsToBeMarked.entrySet()) {
			Requirement requirement = requirementToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(requirement)) {
				elementsMarkedInThisStep.get(requirement).getCausingElements().
					addAll(requirementToBeMarkedEntry.getValue());
			} else {
				ReqModifyRequirement modifyRequirement = ReqModificationmarksFactory.
						eINSTANCE.createReqModifyRequirement();
				modifyRequirement.setToolderived(true);
				modifyRequirement.setAffectedElement(requirement);
				modifyRequirement.getCausingElements().addAll(requirementToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(requirement, modifyRequirement);
				this.getMarkedRequirements().add(requirement);
				this.getReqChangePropagationDueToSpecificationDependencies().
					getRequirementModifications().add(modifyRequirement);
			}
		}
	}
	
	private <S extends EObject> void createAndAddDecisionModifications(Map<Decision, Set<S>> decisionsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(decisionsToBeMarked, elementsMarkedInThisStep);
		for(Map.Entry<Decision, Set<S>> decisionToBeMarkedEntry: 
				decisionsToBeMarked.entrySet()) {
			Decision decision = decisionToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(decision)) {
				elementsMarkedInThisStep.get(decision).getCausingElements().
					addAll(decisionToBeMarkedEntry.getValue());
			} else {
				ReqModifyDecision modifyDecision = ReqModificationmarksFactory.eINSTANCE.createReqModifyDecision();
				modifyDecision.setToolderived(true);
				modifyDecision.setAffectedElement(decision);
				modifyDecision.getCausingElements().addAll(decisionToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(decision, modifyDecision);
				this.getMarkedDecisions().add(decision);
				this.getReqChangePropagationDueToSpecificationDependencies().
					getDecisionModifications().add(modifyDecision);
			}
		}
	}
	
	private <S extends EObject> void createAndAddOptionModifications(Map<Option, Set<S>> optionsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(optionsToBeMarked, elementsMarkedInThisStep);
		for(Map.Entry<Option, Set<S>> optionToBeMarkedEntry: 
				optionsToBeMarked.entrySet()) {
			Option option = optionToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(option)) {
				elementsMarkedInThisStep.get(option).getCausingElements().
					addAll(optionToBeMarkedEntry.getValue());
			} else {
				ReqModifyOption modifyOption = ReqModificationmarksFactory.eINSTANCE.createReqModifyOption();
				modifyOption.setToolderived(true);
				modifyOption.setAffectedElement(option);
				modifyOption.getCausingElements().addAll(optionToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(option, modifyOption);
				this.getMarkedOptions().add(option);
				this.getReqChangePropagationDueToSpecificationDependencies().
					getOptionModifications().add(modifyOption);
			}
		}
	}
	
	/**
	 * The specification propagation is calculated forwards and backwards. If an 
	 * element 2 was marked because of an element 1 in the forward propagation, it
	 * would be misleading to create a modification of element 1 just because of the 
	 * opposite reference from element 2 in the backward propagation (king of circular 
	 * reference). Therefore, this method checks all causes for a potentially
	 * modified element and finds out if these causes belong the existing 
	 * modifications that were caused by the potentially modified element. If so, 
	 * the cause is removed (and if there are no causes left, then the whole entry).
	 */
	private static <S extends EObject, T extends TraceableObject> void filterCircularCauses(
			Map<T, Set<S>> objectsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		Map<T, Set<S>> circularMarks = new HashMap<T, Set<S>>();
		for (Map.Entry<T, Set<S>> objectsToBeMarkedEntry: 
				objectsToBeMarked.entrySet()) {
			for (S causingObject: objectsToBeMarkedEntry.getValue()) {
				if (elementsMarkedInThisStep.containsKey(causingObject) &&
						elementsMarkedInThisStep.get(causingObject).getCausingElements().
						contains(objectsToBeMarkedEntry.getKey())) {
					MapUtil.putOrAddToMap(circularMarks, objectsToBeMarkedEntry.getKey(), causingObject);
				}
			}
		}
		MapUtil.removeAllFromMap(objectsToBeMarked, circularMarks);
	}
	
	private BPChangePropagationAnalysis getBpChangePropagationAnalysis() {
		return bpChangePropagationAnalysis;
	}

	private void setBpChangePropagationAnalysis(BPChangePropagationAnalysis bpChangePropagationAnalysis) {
		this.bpChangePropagationAnalysis = bpChangePropagationAnalysis;
	}

	private ReqChangePropagationDueToSpecificationDependencies getReqChangePropagationDueToSpecificationDependencies() {
		return changePropagationDueToSpecificationDependencies;
	}

	private void setReqChangePropagationDueToSpecificationDependencies(
			ReqChangePropagationDueToSpecificationDependencies changePropagationDueToSpecificationDependencies) {
		this.changePropagationDueToSpecificationDependencies = changePropagationDueToSpecificationDependencies;
	}

	private Collection<Requirement> getMarkedRequirements() {
		return markedRequirements;
	}

	private void setMarkedRequirements(Collection<Requirement> markedRequirements) {
		this.markedRequirements = markedRequirements;
	}

	private Collection<Decision> getMarkedDecisions() {
		return markedDecisions;
	}

	private void setMarkedDecisions(Collection<Decision> markedDecisions) {
		this.markedDecisions = markedDecisions;
	}

	private Collection<Option> getMarkedOptions() {
		return markedOptions;
	}

	private void setMarkedOptions(Collection<Option> markedOptions) {
		this.markedOptions = markedOptions;
	}

}
