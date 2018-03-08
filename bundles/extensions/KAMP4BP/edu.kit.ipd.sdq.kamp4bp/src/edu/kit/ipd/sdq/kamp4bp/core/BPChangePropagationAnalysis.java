package edu.kit.ipd.sdq.kamp4bp.core;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;
import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageFacade;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationStepRegistry;
import edu.kit.ipd.sdq.kamp.ruledsl.support.DefaultConfiguration;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IConfiguration;
import edu.kit.ipd.sdq.kamp.ruledsl.support.KampRuleLanguageFacade.KampLanguageService;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4is.core.AbstractISChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4is.core.ISArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPInterBusinessProcessPropagation;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAbstractUserAction;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyAcquireDeviceResourceAction;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyActorStep;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyDataObject;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyEntryLevelSystemCall;
import edu.kit.ipd.sdq.kamp4bp.model.modificationmarks.BPModifyReleaseDeviceResourceAction;
import edu.kit.ipd.sdq.kamp.ruledsl.support.IRuleProvider;

/**
 * The change propagation analysis of KAMP+IntBIIS
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * Elements which were already part of a seed population are not further investigated.
 * 
 * This approach includes all propagation steps from KAMP and adds some additional ones 
 * related to business processes (IntBIIS, usagemodel).
 */
public class BPChangePropagationAnalysis extends AbstractISChangePropagationAnalysis<BPArchitectureVersion, BPChangePropagationDueToDataDependencies> {
	
	private BPInterBusinessProcessPropagation interBusinessProcessPropagation;
	
	private Collection<DataType> markedDataTypes;
	private Collection<DataObject<?>> markedDataObjects;
	private IProject project;
	
	/**
	 * Creates a new instance of BPChangePropagationAnalysis which is aware of the location it is run.
	 * @param project the project in which the change propagation analysis is run
	 */
	public BPChangePropagationAnalysis(IProject project) {
		super();
		this.project = project;
	}

	@Override
	public void runChangePropagationAnalysis(BPArchitectureVersion version) {
		this.prepareAnalysis(version);
		
		// this is the standard behavior if no custom rules are registered
		boolean runPreconfiguredRules = true;
		
		try(KampLanguageService<IRuleProvider> languageService = KampRuleLanguageFacade.getInstance(this.project.getName(), IRuleProvider.class)) {
			IRuleProvider provider = languageService.getService();
			IConfiguration config = provider.getConfiguration();
			if(config == null) {
				config = new DefaultConfiguration();
			}
			
			// read configuration
			runPreconfiguredRules = config.areKampStandardRulesEnabled();
			
			// specify the ChangePropagationSteps which will be passed to the ruledsl engine
			ChangePropagationStepRegistry registry = KampRuleLanguageFacade.createChangePropagationStepRegistry();
			
//			registry.register(this.getChangePropagationDueToDataDependencies());
//			registry.register(this.getInterBusinessProcessPropagation());
			// better (but keep in mind that prepareAnalysis must be run beforehand):
			version.getModificationMarkRepository().getChangePropagationSteps().stream().forEach(s -> registry.register(s));
			
			// you may register your own propagation steps via:
			// version.getModificationMarkRepository().getChangePropagationSteps().add(...);, see an example in AbstractISChangePropagationAnalysis#calculateInterfaceAndComponentPropagation(S version)
			
			if(config.isKampDslEnabled()) {
				provider.applyAllRules(version, registry);
			}
		} catch (Exception e) {
			// should be only thrown if service is not available or bundle could not be installed
			e.printStackTrace();
		};

		if(runPreconfiguredRules) {
			this.calculateChangePropagationDueToDataDependencies(version);	
			//this.calculateInterfaceAndComponentPropagation(version);
			this.calculateInterBusinessProcessPropagation(version);
		}
	}
	
	@SuppressWarnings("unchecked")
	private void prepareAnalysis(BPArchitectureVersion version) {
		this.setChangePropagationDueToDataDependencies(BPModificationmarksFactory.eINSTANCE.
				createBPChangePropagationDueToDataDependencies());
		/* Link calculated data dependency propagation steps to propagation steps of version,
		 * so the already marked elements are up to date for all sub-steps of the algorithm*/	
		version.getModificationMarkRepository().getChangePropagationSteps().add(
				this.getChangePropagationDueToDataDependencies());
		this.setInterBusinessProcessPropagation(BPModificationmarksFactory.eINSTANCE.
				createBPInterBusinessProcessPropagation());
		version.getModificationMarkRepository().getChangePropagationSteps().add(
				this.getInterBusinessProcessPropagation());
		
		// Store marked model elements to reduce model traversal in calculation methods
		//double cast to avoid type-mismatch
		this.setMarkedDataObjects((Collection<DataObject<?>>)(Object)ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, DataObject.class));
		this.setMarkedDataTypes(ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, DataType.class));
	}
	
	/**
	 * Calculates the DataType-/DataObject-related changes.
	 */
	public void calculateChangePropagationDueToDataDependencies(BPArchitectureVersion version) {
		// Create only one modification mark per element in this propagation step (affects only
		// DataTypes and DataObjects which could be marked by multiple sub-steps)
		Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?,EObject>>();
		
//		// 1 DataType -> Composite/CollectionDataType
//		calculateAndMarkDataTypeToDataTypePropagation(version, elementsMarkedInThisStep);		
//		// 2 DataType -> DataObject
//		calculateAndMarkDataTypeToDataObjectPropagation(version, elementsMarkedInThisStep);	
//		// 3 DataObject -> Composite/CollectionDataObject
//		calculateAndMarkDataObjectToDataObjectPropagation(version, elementsMarkedInThisStep);
//		// 4 DataObject -> ActorStep
//		calculateAndMarkDataObjectToActorStepPropagation(version);	
//		// 5 DataObject -> DataType
//		calculateAndMarkDataObjectToDataTypePropagation(version, elementsMarkedInThisStep);	
//		// 6 DataType -> Composite/CollectionDataType
		// calculateAndMarkDataTypeToDataTypePropagation(version, elementsMarkedInThisStep);	
		// 7 DataType -> EntryLevelSystemCall
		calculateAndMarkDataTypeToEntryLevelSystemCallPropagation(version);	
//		// 8 DataType/EntryLevelSystemCall/Signature -> Interface
//		calculateAndMarkToInterfacePropagation(version);
		
		//If no at all changes: remove top-level element from tree
		if (this.getChangePropagationDueToDataDependencies().eContents().isEmpty()) {			
			version.getModificationMarkRepository().getChangePropagationSteps().remove(
					this.getChangePropagationDueToDataDependencies());	
		}
	}
	
	/**
	 * Calculates the business process step-related changes.
	 */
	public void calculateInterBusinessProcessPropagation(BPArchitectureVersion version) {
		// Create only one modification mark per element in this propagation step
		Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?,EObject>>();
		
//		// 1 Role (OrganizationEnvironmentModel) -> ActorStep
//		calculateAndMarkRoleToActorStepPropagation(version, elementsMarkedInThisStep);
//		// 2 ActorStep -> ActorStep/EntryLevelSystemCall
//		calculateAndMarkActorStepToActorStepAndELSCPropagation(version, elementsMarkedInThisStep);
//		// 3 DeviceResource -> Acquire-/ReleaseDeviceResourceAction and actions between
//		calculateAndMarkDeviceResourceToDeviceResourceActionPropagation(version, elementsMarkedInThisStep);
		// 4 Signature -> EntryLevelSystemCall
		calculateAndMarkSignatureToEntryLevelSystemCallPropagation(version, elementsMarkedInThisStep);
		
		//If no at all changes: remove top-level element from tree
		if (this.getInterBusinessProcessPropagation().eContents().isEmpty()) {			
			version.getModificationMarkRepository().getChangePropagationSteps().remove(
					this.getInterBusinessProcessPropagation());	
		}
	}
	
	protected void calculateAndMarkDataTypeToDataTypePropagation(BPArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		 Map<DataType, Set<DataType>> dataTypesToBeMarked = BPArchitectureModelLookup.
				lookUpCompositeAndCollectionDataTypesOfDataTypes(version, this.getMarkedDataTypes());

		 for(Map.Entry<DataType, Set<DataType>> dataTypeToBeMarkedEntry: 
			 	dataTypesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(dataTypeToBeMarkedEntry.getKey())) {
				for(DataType cause: dataTypeToBeMarkedEntry.getValue()) {
					if (!elementsMarkedInThisStep.get(dataTypeToBeMarkedEntry.getKey()).
							getCausingElements().contains(cause)) {
						elementsMarkedInThisStep.get(dataTypeToBeMarkedEntry.getKey()).
							getCausingElements().add(cause);	
					}
				}
			} else {
				ISModifyDataType modifyDataType = ISModificationmarksFactory.eINSTANCE.createISModifyDataType();
				modifyDataType.setToolderived(true);
				modifyDataType.setAffectedElement(dataTypeToBeMarkedEntry.getKey());
				modifyDataType.getCausingElements().addAll(dataTypeToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(dataTypeToBeMarkedEntry.getKey(), modifyDataType);
				this.getMarkedDataTypes().add(dataTypeToBeMarkedEntry.getKey());
				this.getChangePropagationDueToDataDependencies().getDatatypeModifications().
						add(modifyDataType);
			}
		 }
	}

	protected void calculateAndMarkDataTypeToEntryLevelSystemCallPropagation(BPArchitectureVersion version) {			
		Map<EntryLevelSystemCall, Set<DataType>> elscsToBeMarked = BPArchitectureModelLookup.
				lookUpEntryLevelSystemCallsWithParameterOfTypes(version, 
						this.getMarkedDataTypes());

		for (Map.Entry<EntryLevelSystemCall, Set<DataType>> elscToBeMarkedEntry : 
				elscsToBeMarked.entrySet()) {
			BPModifyEntryLevelSystemCall modifyELSC = BPModificationmarksFactory.eINSTANCE.createBPModifyEntryLevelSystemCall();
			modifyELSC.setToolderived(true);
			modifyELSC.setAffectedElement(elscToBeMarkedEntry.getKey());
			modifyELSC.getCausingElements().addAll(elscToBeMarkedEntry.getValue());
			this.getChangePropagationDueToDataDependencies().getEntryLevelSystemCallModifications().
					add(modifyELSC);
		}
	}
	
	protected void calculateAndMarkDataTypeToDataObjectPropagation(BPArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {	
		Map<DataObject<?>, Set<DataType>> dataObjectsToBeMarked = BPArchitectureModelLookup.
				lookUpDataObjectsWithDataTypes(version, this.getMarkedDataTypes());

		for (Map.Entry<DataObject<?>, Set<DataType>> dataObjectToBeMarkedEntry : 
				dataObjectsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(dataObjectToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(dataObjectToBeMarkedEntry.getKey()).
						getCausingElements().addAll(dataObjectToBeMarkedEntry.getValue());
			} else {
				BPModifyDataObject modifyDataObject = BPModificationmarksFactory.eINSTANCE.createBPModifyDataObject();
				modifyDataObject.setToolderived(true);
				modifyDataObject.setAffectedElement(dataObjectToBeMarkedEntry.getKey());
				modifyDataObject.getCausingElements().addAll(dataObjectToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(dataObjectToBeMarkedEntry.getKey(), modifyDataObject);
				this.getMarkedDataObjects().add(dataObjectToBeMarkedEntry.getKey());
				this.getChangePropagationDueToDataDependencies().getDataObjectModifications().
						add(modifyDataObject);
			}
		}
	}

	protected void calculateAndMarkDataObjectToDataObjectPropagation(BPArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		Map<DataObject<?>, Set<DataObject<?>>> dataObjectsToBeMarked = BPArchitectureModelLookup.
				lookUpCompositeAndCollectionDataObjectsWithDataObjects(version, this.getMarkedDataObjects());
		
		for (Map.Entry<DataObject<?>, Set<DataObject<?>>> dataObjectToBeMarkedEntry: 
				dataObjectsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(dataObjectToBeMarkedEntry.getKey())) {
				for(DataObject<?> cause: dataObjectToBeMarkedEntry.getValue()) {
					if (!elementsMarkedInThisStep.get(dataObjectToBeMarkedEntry.getKey()).
							getCausingElements().contains(cause)) {
						elementsMarkedInThisStep.get(dataObjectToBeMarkedEntry.getKey()).
							getCausingElements().add(cause);	
					}
				}
			} else {
				BPModifyDataObject modifyDataObject = BPModificationmarksFactory.eINSTANCE.createBPModifyDataObject();
				modifyDataObject.setToolderived(true);
				modifyDataObject.setAffectedElement(dataObjectToBeMarkedEntry.getKey());
				modifyDataObject.getCausingElements().addAll(dataObjectToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(dataObjectToBeMarkedEntry.getKey(), modifyDataObject);
				this.getMarkedDataObjects().add(dataObjectToBeMarkedEntry.getKey());
				this.getChangePropagationDueToDataDependencies().getDataObjectModifications().
						add(modifyDataObject);
			}
		 }
	}
	
	protected void calculateAndMarkDataObjectToActorStepPropagation(BPArchitectureVersion version){			
		Map<ActorStep, Set<DataObject<?>>> actorStepsToBeMarked = BPArchitectureModelLookup.
				lookUpActorStepsWithDataObjects(version, this.getMarkedDataObjects());
		
		for (Map.Entry<ActorStep, Set<DataObject<?>>> actorStepToBeMarkedEntry : 
				actorStepsToBeMarked.entrySet()) {
			this.getChangePropagationDueToDataDependencies().getActorStepModifications().add(
					this.createActorStepModification(actorStepToBeMarkedEntry.getKey(), 
							actorStepToBeMarkedEntry.getValue()));
		}
	}
	
	protected void calculateAndMarkDataObjectToDataTypePropagation(BPArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {			
		Map<DataType, Set<DataObject<?>>> dataTypesToBeMarked = BPArchitectureModelLookup.
				lookUpDataTypesWithDataObjects(version, this.getMarkedDataObjects());
		filterCircularCauses(dataTypesToBeMarked, elementsMarkedInThisStep);
		
		for(Map.Entry<DataType, Set<DataObject<?>>> dataTypeToBeMarkedEntry: 
		 		dataTypesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(dataTypeToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(dataTypeToBeMarkedEntry.getKey()).
						getCausingElements().addAll(dataTypeToBeMarkedEntry.getValue());
			} else {
				ISModifyDataType modifyDataType = ISModificationmarksFactory.eINSTANCE.createISModifyDataType();
				modifyDataType.setToolderived(true);
				modifyDataType.setAffectedElement(dataTypeToBeMarkedEntry.getKey());
				modifyDataType.getCausingElements().addAll(dataTypeToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(dataTypeToBeMarkedEntry.getKey(), modifyDataType);
				this.getMarkedDataTypes().add(dataTypeToBeMarkedEntry.getKey());
				this.getChangePropagationDueToDataDependencies().getDatatypeModifications().
						add(modifyDataType);
			}
		}
	}
	
	/**
	 * There is a DataType -> DataObject and a DataObject -> DataType step. If a DataObject was
	 * only marked as modified because of a marked DataType, then it would be not correct to mark 
	 * the DataType again based on the DataObject modification (circular cause). This does not 
	 * apply if the DataObject was also changed out of different reasons, because in that case 
	 * those reasons might be interesting for the DataType, too.
	 */
	private static void filterCircularCauses(Map<DataType, Set<DataObject<?>>> objectsToBeMarked,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		Map<DataType, Set<DataObject<?>>> circularMarks = new HashMap<DataType, Set<DataObject<?>>>();
		for (Map.Entry<DataType, Set<DataObject<?>>> objectsToBeMarkedEntry: objectsToBeMarked.entrySet()) {
			for (DataObject<?> causingObject: objectsToBeMarkedEntry.getValue()) {
				if (elementsMarkedInThisStep.containsKey(causingObject) &&
						elementsMarkedInThisStep.get(causingObject).getCausingElements().
						contains(objectsToBeMarkedEntry.getKey())) {
					MapUtil.putOrAddToMap(circularMarks, objectsToBeMarkedEntry.getKey(), causingObject);
				}
			}
		}
		MapUtil.removeAllFromMap(objectsToBeMarked, circularMarks);
	}
	
	/**
	 * Calculates the propagation from DataTypes and EntryLevelSystemCalls and initially marked
	 * Signatures (OperationSignature, EventType) to Interfaces (OperationInterface, EventGroup). 
	 * All three have to be considered simultaneously, as they might affect different Signatures 
	 * of the same Interface.
	 */
	@Override
	protected void calculateAndMarkToInterfacePropagation(BPArchitectureVersion version) {	
		Collection<Signature> initialMarkedSignatures = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, Signature.class);
		Collection<EntryLevelSystemCall> initialMarkedELSCs = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, EntryLevelSystemCall.class);
		
		Map<Signature, Set<DataType>> dtSignaturesToBeMarked = new HashMap<Signature, Set<DataType>>();
		Map<Signature, EntryLevelSystemCall> elSignaturesToBeMarked = 
				new HashMap<Signature, EntryLevelSystemCall>();
		Map<Interface, Set<Signature>> interfacesToBeMarked = ISArchitectureModelLookup.
				lookUpInterfacesAndSignaturesWithSignatures(version, initialMarkedSignatures);	
		ISArchitectureModelLookup.lookUpInterfacesAndSignaturesWithParametersOfTypes(version, 
				this.getMarkedDataTypes(), interfacesToBeMarked, dtSignaturesToBeMarked);
		BPArchitectureModelLookup.lookUpInterfacesAndSignaturesWithEntryLevelSystemCalls(version, 
				initialMarkedELSCs, interfacesToBeMarked, elSignaturesToBeMarked);
			
		this.createAndAddInterfaceModifications(interfacesToBeMarked, dtSignaturesToBeMarked,
				elSignaturesToBeMarked, this.getChangePropagationDueToDataDependencies().
				getInterfaceModifications());
	}
	
	private void createAndAddInterfaceModifications(Map<Interface, Set<Signature>> 
			interfacesToBeMarked, Map<Signature, Set<DataType>> dtSignaturesToBeMarked,
			Map<Signature, EntryLevelSystemCall> elSignaturesToBeMarked,
			Collection<ISModifyInterface> targetCollection) {
		for (Map.Entry<Interface, Set<Signature>> interfaceToBeMarkedEntry : interfacesToBeMarked.entrySet()) {
			ISModifyInterface modifyInterface = ISModificationmarksFactory.eINSTANCE.createISModifyInterface();
			modifyInterface.setToolderived(true);
			modifyInterface.setAffectedElement(interfaceToBeMarkedEntry.getKey());
			modifyInterface.getCausingElements().addAll(interfaceToBeMarkedEntry.getValue());
			
			for (Signature signature: interfaceToBeMarkedEntry.getValue()) {
				// Mark only those signatures which are not initially marked
				if (dtSignaturesToBeMarked.containsKey(signature) || 
						elSignaturesToBeMarked.containsKey(signature)) {
					ISModifySignature modifySignature = ISModificationmarksFactory.eINSTANCE.createISModifySignature();
					modifySignature.setToolderived(true);
					modifySignature.setAffectedElement(signature);
					if (dtSignaturesToBeMarked.containsKey(signature)) {
						modifySignature.getCausingElements().addAll(dtSignaturesToBeMarked.get(signature));
					}
					if (elSignaturesToBeMarked.containsKey(signature)) {
						modifySignature.getCausingElements().add(elSignaturesToBeMarked.get(signature));
					}
					modifyInterface.getSignatureModifications().add(modifySignature);
				}
			}
			
			targetCollection.add(modifyInterface);
		}
	}
	
	protected void calculateAndMarkRoleToActorStepPropagation(BPArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		Collection<Role> markedRoles = ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Role.class);
		Collection<ActorStep> actorStepsToBeMarked = BPArchitectureModelLookup.
				lookUpActorStepsWithRoles(version, markedRoles);
		
		for (ActorStep actorStepToBeMarked: actorStepsToBeMarked) {
			if (elementsMarkedInThisStep.containsKey(actorStepToBeMarked)) {
				elementsMarkedInThisStep.get(actorStepToBeMarked).getCausingElements().add(
						actorStepToBeMarked.getResponsibleRole());
			} else {
				BPModifyActorStep modifyActorStep = this.createActorStepModification(
						actorStepToBeMarked, Collections.singleton(actorStepToBeMarked.getResponsibleRole()));
				this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
						add(modifyActorStep);
			}
		}
	}
	
	private BPModifyActorStep createActorStepModification(ActorStep actorStep, 
			Collection<? extends Entity> causes) {
		BPModifyActorStep modifyActorStep = BPModificationmarksFactory.eINSTANCE.createBPModifyActorStep();
		modifyActorStep.setToolderived(true);
		modifyActorStep.setAffectedElement(actorStep);
		modifyActorStep.getCausingElements().addAll(causes);
		return modifyActorStep;
	}
	
	protected void calculateAndMarkActorStepToActorStepAndELSCPropagation(BPArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		Collection<ActorStep> markedActorSteps = ArchitectureModelLookup.lookUpMarkedObjectsOfAType(
				version, ActorStep.class);
		Map<AbstractUserAction, List<ActorStep>> userActionsToBeMarked = BPArchitectureModelLookup.
				lookUpUserActionsAfterMarkedActorSteps(markedActorSteps, version);
		
		for (Map.Entry<AbstractUserAction, List<ActorStep>> userActionToBeMarkedEntry: 
				userActionsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(userActionToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(userActionToBeMarkedEntry.getKey()).
						getCausingElements().addAll(userActionToBeMarkedEntry.getValue());
			} else if (userActionToBeMarkedEntry.getKey() instanceof ActorStep) {
				BPModifyActorStep modifyActorStep = this.createActorStepModification(
						(ActorStep) userActionToBeMarkedEntry.getKey(), 
						userActionToBeMarkedEntry.getValue());
				elementsMarkedInThisStep.put(userActionToBeMarkedEntry.getKey(), modifyActorStep);
				this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
						add(modifyActorStep);
			} else if (userActionToBeMarkedEntry.getKey() instanceof EntryLevelSystemCall) {
				EntryLevelSystemCall userActionToBeMarked = (EntryLevelSystemCall) 
						userActionToBeMarkedEntry.getKey();		
				BPModifyEntryLevelSystemCall modifyEntryLevelSystemCall = BPModificationmarksFactory.
						eINSTANCE.createBPModifyEntryLevelSystemCall();
				modifyEntryLevelSystemCall.setToolderived(true);
				modifyEntryLevelSystemCall.setAffectedElement(userActionToBeMarked);
				modifyEntryLevelSystemCall.getCausingElements().addAll(userActionToBeMarkedEntry.getValue());
				elementsMarkedInThisStep.put(userActionToBeMarked, modifyEntryLevelSystemCall);
				this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
						add(modifyEntryLevelSystemCall);
			}
		}
	}
	
	/**
	 * Calculates the propagation from DeviceResources to the corresponding acquire/release
	 * actions and all actions in between (where the resource is in use).
	 */
	protected void calculateAndMarkDeviceResourceToDeviceResourceActionPropagation(
			BPArchitectureVersion version, Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {		
		// Calculate propagation DeviceResource -> DeviceResourceActions
		Collection<DeviceResource> markedDeviceResources = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, DeviceResource.class);
		Collection<AcquireDeviceResourceAction> acquireDeviceResourceActionsToBeMarked = BPArchitectureModelLookup.
				lookUpAcquireDeviceResourceActionsWithDeviceResources(version, markedDeviceResources);
		Collection<ReleaseDeviceResourceAction> releaseDeviceResourceActionsToBeMarked = BPArchitectureModelLookup.
				lookUpReleaseDeviceResourceActionsWithDeviceResources(version, markedDeviceResources);
		Map<AcquireDeviceResourceAction, BPModifyAcquireDeviceResourceAction> acquireActionModifications = 
				this.calculateAndMarkDeviceResourceToAcquireDeviceResourceActionPropagation(
						acquireDeviceResourceActionsToBeMarked, elementsMarkedInThisStep);
		Map<ReleaseDeviceResourceAction, BPModifyReleaseDeviceResourceAction> releaseActionModifications = 
				this.calculateAndMarkDeviceResourceToReleaseDeviceResourceActionPropagation(
						releaseDeviceResourceActionsToBeMarked, elementsMarkedInThisStep);
		
		//Calculate propagation to other steps where resource is in use
		calculateAndMarkPropagationFromAcquireDeviceResourceActions(acquireActionModifications, 
				releaseActionModifications, elementsMarkedInThisStep);
		calculateAndMarkPropagationFromReleaseDeviceResourceActions(releaseActionModifications);
	}
	
	protected Map<AcquireDeviceResourceAction, BPModifyAcquireDeviceResourceAction> 
			calculateAndMarkDeviceResourceToAcquireDeviceResourceActionPropagation(
					Collection<AcquireDeviceResourceAction> deviceResourceActionsToBeMarked,
					Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		Map<AcquireDeviceResourceAction, BPModifyAcquireDeviceResourceAction> results = 
				new HashMap<AcquireDeviceResourceAction, BPModifyAcquireDeviceResourceAction>();

		for (AcquireDeviceResourceAction deviceResourceActionToBeMarked : deviceResourceActionsToBeMarked) {
			if (elementsMarkedInThisStep.containsKey(deviceResourceActionToBeMarked)) {
				elementsMarkedInThisStep.get(deviceResourceActionToBeMarked).getCausingElements().
						add(deviceResourceActionToBeMarked.getPassiveresource_AcquireAction());
			} else {
				BPModifyAcquireDeviceResourceAction modifyDeviceResourceAction = 
						BPModificationmarksFactory.eINSTANCE.createBPModifyAcquireDeviceResourceAction();
				modifyDeviceResourceAction.setToolderived(true);
				modifyDeviceResourceAction.setAffectedElement(deviceResourceActionToBeMarked);
				modifyDeviceResourceAction.getCausingElements().add(deviceResourceActionToBeMarked.
						getPassiveresource_AcquireAction());
				
				elementsMarkedInThisStep.put(deviceResourceActionToBeMarked, modifyDeviceResourceAction);
				results.put(deviceResourceActionToBeMarked, modifyDeviceResourceAction);
			}
		}
		
		return results;
	}
	
	protected Map<ReleaseDeviceResourceAction, BPModifyReleaseDeviceResourceAction> 
			calculateAndMarkDeviceResourceToReleaseDeviceResourceActionPropagation(
					Collection<ReleaseDeviceResourceAction> deviceResourceActionsToBeMarked,
					Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {	
		Map<ReleaseDeviceResourceAction, BPModifyReleaseDeviceResourceAction> results 
			= new HashMap<ReleaseDeviceResourceAction, BPModifyReleaseDeviceResourceAction>();

		for (ReleaseDeviceResourceAction deviceResourceActionToBeMarked : deviceResourceActionsToBeMarked) {
			if (elementsMarkedInThisStep.containsKey(deviceResourceActionToBeMarked)) {
				elementsMarkedInThisStep.get(deviceResourceActionToBeMarked).getCausingElements().
						add(deviceResourceActionToBeMarked.getPassiveresource_ReleaseAction());
			} else {
				BPModifyReleaseDeviceResourceAction modifyDeviceResourceAction = 
						BPModificationmarksFactory.eINSTANCE.createBPModifyReleaseDeviceResourceAction();
				modifyDeviceResourceAction.setToolderived(true);
				modifyDeviceResourceAction.setAffectedElement(deviceResourceActionToBeMarked);	
				modifyDeviceResourceAction.getCausingElements().add(deviceResourceActionToBeMarked.
						getPassiveresource_ReleaseAction());
				
				elementsMarkedInThisStep.put(deviceResourceActionToBeMarked, modifyDeviceResourceAction);
				results.put(deviceResourceActionToBeMarked, modifyDeviceResourceAction);
			}
		}
		
		return results;
	}
	
	/**
	 * Searches and marks the resource propagation from the acquire over all intermediate steps
	 * to the corresponding release (which has to be an indirect successor). If no release is 
	 * found, only the acquire action is marked. If a release is found, its modification 
	 * is used and removed from the <code>releaseActionModifications</code> list.
	 */
	protected void calculateAndMarkPropagationFromAcquireDeviceResourceActions(
			Map<AcquireDeviceResourceAction, BPModifyAcquireDeviceResourceAction> acquireActionModifications,
			Map<ReleaseDeviceResourceAction, BPModifyReleaseDeviceResourceAction> releaseActionModifications,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {		
		while(!acquireActionModifications.isEmpty()) {			
			// Modification marks for acquire action and resource
			BPModifyAcquireDeviceResourceAction modifyAcquireAction = 
					acquireActionModifications.values().iterator().next();
			this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
					add(modifyAcquireAction);
			
			// Find corresponding release and actions between
			Collection<AcquireDeviceResourceAction> processedAcquireActions = 
					new LinkedList<AcquireDeviceResourceAction>();
			Collection<ReleaseDeviceResourceAction> processedReleaseActions =
					new LinkedList<ReleaseDeviceResourceAction>();
			List<AbstractUserAction> actionsUpToRelease = BPArchitectureModelLookup.
					lookUpUserActionsUpToReleaseDeviceResource(modifyAcquireAction.getAffectedElement(), 
							processedAcquireActions, processedReleaseActions);
			if (actionsUpToRelease != null) {
				ReleaseDeviceResourceAction releaseAction = (ReleaseDeviceResourceAction) 
						actionsUpToRelease.remove(actionsUpToRelease.size() - 1);
				this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
						add(releaseActionModifications.get(releaseAction));
				
				// Modification marks for actions between
				for (AbstractUserAction actionWithDeviceResource: actionsUpToRelease) {
					if (elementsMarkedInThisStep.containsKey(actionWithDeviceResource)) {
						elementsMarkedInThisStep.get(actionWithDeviceResource).getCausingElements().
								add(releaseAction.getPassiveresource_ReleaseAction());
						elementsMarkedInThisStep.get(actionWithDeviceResource).getCausingElements().
								add(modifyAcquireAction.getAffectedElement());
					} else {
						BPModifyAbstractUserAction<AbstractUserAction> modifyActionWithDeviceResource = 
								BPModificationmarksFactory.eINSTANCE.createBPModifyAbstractUserAction();
						modifyActionWithDeviceResource.setToolderived(true);
						modifyActionWithDeviceResource.setAffectedElement(actionWithDeviceResource);
						modifyActionWithDeviceResource.getCausingElements().add(releaseAction.
								getPassiveresource_ReleaseAction());
						modifyActionWithDeviceResource.getCausingElements().add(modifyAcquireAction.
								getAffectedElement());
						
						elementsMarkedInThisStep.put(actionWithDeviceResource, 
								modifyActionWithDeviceResource);
						this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
								add(modifyActionWithDeviceResource);
					}
				}
			} else { //Create modification without affected element (warning in workplan)
				BPModifyReleaseDeviceResourceAction modifyReleaseAction = 
						BPModificationmarksFactory.eINSTANCE.createBPModifyReleaseDeviceResourceAction();
				modifyReleaseAction.setToolderived(true);
				modifyReleaseAction.getCausingElements().add(modifyAcquireAction.getAffectedElement().
						getPassiveresource_AcquireAction());
				this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
						add(modifyReleaseAction);
			}
			
			//Multiple acquires and releases might have been processed; remove them
			MapUtil.removeAllFromMap(acquireActionModifications, processedAcquireActions);
			MapUtil.removeAllFromMap(releaseActionModifications, processedReleaseActions);
		}
	}
	
	/**
	 * Marks the resource propagations for release actions without an acquire (so only
	 * the release is marked). There is no backwards search for corresponding acquire actions, 
	 * as {@link #calculateAndMarkPropagationFromAcquireDeviceResourceActions(List, List)}
	 * should be used for a forwards search first (before calling this method).
	 */
	protected void calculateAndMarkPropagationFromReleaseDeviceResourceActions(
			Map<ReleaseDeviceResourceAction, BPModifyReleaseDeviceResourceAction> releaseActionModifications) {		
		while(!releaseActionModifications.isEmpty()) {
			BPModifyReleaseDeviceResourceAction modifyReleaseAction = releaseActionModifications.remove(0);
			this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
					add(modifyReleaseAction);
			//Create modification without affected element (warning in workplan)
			BPModifyAcquireDeviceResourceAction modifyAcquireAction = 
					BPModificationmarksFactory.eINSTANCE.createBPModifyAcquireDeviceResourceAction();
			modifyAcquireAction.setToolderived(true);
			modifyAcquireAction.getCausingElements().add(modifyAcquireAction.getAffectedElement().
					getPassiveresource_AcquireAction());
			this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
					add(modifyAcquireAction);
		}
	}
	
	protected void calculateAndMarkSignatureToEntryLevelSystemCallPropagation(BPArchitectureVersion version,
			Map<EObject, AbstractModification<?,EObject>> elementsMarkedInThisStep) {
		Collection<OperationSignature> markedSignatures = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, OperationSignature.class);
		Collection<EntryLevelSystemCall> entryLevelSystemCallsToBeMarked = BPArchitectureModelLookup.
				lookUpEntryLevelSystemCallsWithSignatures(version, markedSignatures);

		for (EntryLevelSystemCall eLSCToBeMarked: entryLevelSystemCallsToBeMarked) {
			if (elementsMarkedInThisStep.containsKey(eLSCToBeMarked)) {
				elementsMarkedInThisStep.get(eLSCToBeMarked).getCausingElements().add(
						eLSCToBeMarked.getOperationSignature__EntryLevelSystemCall());
			} else {
				BPModifyEntryLevelSystemCall modifyEntryLevelSystemCall = BPModificationmarksFactory.eINSTANCE.createBPModifyEntryLevelSystemCall();
				modifyEntryLevelSystemCall.setToolderived(true);
				modifyEntryLevelSystemCall.setAffectedElement(eLSCToBeMarked);
				modifyEntryLevelSystemCall.getCausingElements().add(
						eLSCToBeMarked.getOperationSignature__EntryLevelSystemCall());
				
				elementsMarkedInThisStep.put(eLSCToBeMarked, modifyEntryLevelSystemCall);		
				this.getInterBusinessProcessPropagation().getAbstractUserActionModifications().
						add(modifyEntryLevelSystemCall);
			}
		}
	}
	
	protected BPInterBusinessProcessPropagation getInterBusinessProcessPropagation() {
		return interBusinessProcessPropagation;
	}

	protected void setInterBusinessProcessPropagation(BPInterBusinessProcessPropagation interBusinessProcessPropagation) {
		this.interBusinessProcessPropagation = interBusinessProcessPropagation;
	}

	protected Collection<DataType> getMarkedDataTypes() {
		return markedDataTypes;
	}

	protected void setMarkedDataTypes(Collection<DataType> markedDataTypes) {
		this.markedDataTypes = markedDataTypes;
	}

	protected Collection<DataObject<?>> getMarkedDataObjects() {
		return markedDataObjects;
	}

	protected void setMarkedDataObjects(Collection<DataObject<?>> markedDataObjects) {
		this.markedDataObjects = markedDataObjects;
	}

}
