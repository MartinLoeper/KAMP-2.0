package edu.kit.ipd.sdq.kamp4bp.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.usagemodel.AbstractUserAction;
import org.palladiosimulator.pcm.usagemodel.Branch;
import org.palladiosimulator.pcm.usagemodel.BranchTransition;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.palladiosimulator.pcm.usagemodel.Loop;
import org.palladiosimulator.pcm.usagemodel.ScenarioBehaviour;
import org.palladiosimulator.pcm.usagemodel.Start;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.AcquireDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.Activity;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ActorStep;
import de.uhd.ifi.se.pcm.bppcm.bpusagemodel.ReleaseDeviceResourceAction;
import de.uhd.ifi.se.pcm.bppcm.datamodel.CollectionDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.CompositeDataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.DataObject;
import de.uhd.ifi.se.pcm.bppcm.datamodel.InnerDataObjectDeclaration;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.DeviceResource;
import de.uhd.ifi.se.pcm.bppcm.organizationenvironmentmodel.Role;
import edu.kit.ipd.sdq.kamp.util.MapUtil;

public class BPArchitectureModelLookup {
	
	public static List<AcquireDeviceResourceAction> lookUpAcquireDeviceResourceActionsWithDeviceResources(
			BPArchitectureVersion version, Collection<DeviceResource> deviceResources) {
		List<AcquireDeviceResourceAction> results = new LinkedList<AcquireDeviceResourceAction>();
		
		for (AbstractUserAction action: lookUpAllUserActions(version)) {
			if (action instanceof AcquireDeviceResourceAction && deviceResources.contains(
					((AcquireDeviceResourceAction) action).getPassiveresource_AcquireAction())) {
				results.add((AcquireDeviceResourceAction) action);
			}
		}
		
		return results;
	}
	
	public static Map<EntryLevelSystemCall, Set<DataType>> lookUpEntryLevelSystemCallsWithParameterOfTypes(
			BPArchitectureVersion version, Collection<DataType> datatypes) {	
		Map<EntryLevelSystemCall, Set<DataType>> results = 
				new HashMap<EntryLevelSystemCall, Set<DataType>>();
		
		for (AbstractUserAction action: lookUpAllUserActions(version)) {
			if (action instanceof EntryLevelSystemCall) {
				EntryLevelSystemCall entryLevelSystemCall = (EntryLevelSystemCall) action;
				OperationSignature signature = entryLevelSystemCall.
						getOperationSignature__EntryLevelSystemCall();			
				for (DataType datatype: datatypes) {
					for (Parameter parameter : signature.getParameters__OperationSignature()) {
						if (parameter.getDataType__Parameter().equals(datatype)) {
							MapUtil.putOrAddToMap(results, entryLevelSystemCall, datatype);
						}
					}
					if (datatype.equals(signature.getReturnType__OperationSignature())) {
						MapUtil.putOrAddToMap(results, entryLevelSystemCall, datatype);
					}
				}
			}
		}
		
		return results;
	}
	
	public static List<EntryLevelSystemCall> lookUpEntryLevelSystemCallsWithSignatures(
			BPArchitectureVersion version, Collection<OperationSignature> signatures) {
		List<EntryLevelSystemCall> results = new LinkedList<EntryLevelSystemCall>();
		
		for (AbstractUserAction action: lookUpAllUserActions(version)) {
			if (action instanceof EntryLevelSystemCall && signatures.contains(
					((EntryLevelSystemCall) action).getOperationSignature__EntryLevelSystemCall())) {
				results.add((EntryLevelSystemCall) action);
			}
		}
		
		return results;
	}
	
	public static Map<ActorStep, Set<DataObject<?>>> lookUpActorStepsWithDataObjects (
			BPArchitectureVersion version, Collection<DataObject<?>> dataObjects) {	
		Map<ActorStep, Set<DataObject<?>>> results = new HashMap<>();
		
		for (AbstractUserAction action: lookUpAllUserActions(version)) {
			if (action instanceof ActorStep) {
				collectActorStepsWithDataObjects(dataObjects, results, (ActorStep) action);
			}
		}
		
		return results;
	}
	
	private static void collectActorStepsWithDataObjects(Collection<DataObject<?>> dataObjects,
			Map<ActorStep, Set<DataObject<?>>> results, ActorStep actorStep) {	
		for (DataObject<?> dataObject: dataObjects) {
			if (actorStep.getInputDataObjects().contains(dataObject) || 
					actorStep.getOutputDataObjects().contains(dataObject)) {
				if (!results.containsKey(actorStep)) {
					results.put(actorStep, new HashSet<DataObject<?>>());
				}
				results.get(actorStep).add(dataObject);
			}
		}
	}
	
	public static List<ActorStep> lookUpActorStepsWithRoles(BPArchitectureVersion version, 
			Collection<Role> roles) {
		List<ActorStep> results = new LinkedList<ActorStep>();
		
		for (AbstractUserAction action: lookUpAllUserActions(version)) {
			if (action instanceof ActorStep) {
				ActorStep actorStep = (ActorStep) action;
				if (roles.contains(actorStep.getResponsibleRole())) {
					results.add(actorStep);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Finds AbstractUserActions (to be marked) after already marked ActorSteps. The 
	 * algorithm is<ul>
	 * <li>recursive: If a newly found AbstractUserAction is also an ActorStep, it might 
	 * trigger another mark, it is considered to be marked for the rest of the algorithm.</li>
	 * <li>indirect: It doesn't matter if there are other steps between the marked 
	 * ActorSteps and the AbstractUserActions that should be marked.</li>
	 * <li>based on semantics: Returned are not all subsequent AbstractUserActions, but<ol>
	 * <li>ActorSteps where at least one of their inputDataObjects equals or is contained 
	 * in at least one of the outputDataObjects of a previous ActorStep.</li>
	 * <li>EntryLevelSystemCalls where at least one of their operation's parameter types 
	 * equals or is a super type of at least one type of the outputDataObjects of a 
	 * previous ActorStep.</li></ol></li>
	 * <li>aware of loops and branches: Loops are integrated into the branch as if there
	 * were no loops, ActorSteps of branches are considered for AbstractUserActions within 
	 * the same branch or before/after the branch element.</li>
	 * </ul>
	 *
	 * @return AbstractUserActiond to be marked as key, the ActorSteps which are the reason for 
	 * the mark as values.
	 */
	public static Map<AbstractUserAction, List<ActorStep>> lookUpUserActionsAfterMarkedActorSteps(
			Collection<ActorStep> initiallyMarkedActorSteps, BPArchitectureVersion version) {
		Map<AbstractUserAction, List<ActorStep>> results = new HashMap<AbstractUserAction, List<ActorStep>>();
		Map<DataObject<?>, Set<DataObject<?>>> dataObjectContainerMap =
				lookUpAllDataObjectsWithContainers(version);
		
		for (Entry<String, UsageModel> usageModelEntry: version.getUsageModels().entrySet()) {
			for (UsageScenario usageScenario: usageModelEntry.getValue().getUsageScenario_UsageModel()) {
				results.putAll(lookUpUserActionsAfterMarkedActorSteps(initiallyMarkedActorSteps,
						new LinkedList<ActorStep>(), usageScenario.getScenarioBehaviour_UsageScenario(),
						dataObjectContainerMap));
			}
		}
		
		return results;
	}
	
	/**
	 * Traverses the current ScenarioBehavior from start to end. Depending on the type of
	 * user Action, another method is called (UserAction for direct analysis found or 
	 * "composite" user actions that have to be looked into). Be aware that the 
	 * <code>precedingMarkedActorSteps</code> are updated in sub-routines, so the propagation 
	 * is recursive.
	 */
	private static Map<AbstractUserAction, List<ActorStep>> lookUpUserActionsAfterMarkedActorSteps(
			Collection<ActorStep> initiallyMarkedActorSteps, 
			Collection<ActorStep> precedingMarkedActorSteps, 
			ScenarioBehaviour scenarioBehaviour, 
			Map<DataObject<?>, Set<DataObject<?>>> dataObjectContainerMap) {
		Map<AbstractUserAction, List<ActorStep>> results = new HashMap<AbstractUserAction, List<ActorStep>>();
		
		AbstractUserAction currentUserAction = lookUpStartInScenarioBehavior(scenarioBehaviour);
		while (currentUserAction != null) {
			if (currentUserAction instanceof Loop) {
				results.putAll(lookUpUserActionsAfterMarkedActorSteps(initiallyMarkedActorSteps, 
						precedingMarkedActorSteps,  ((Loop) currentUserAction).getBodyBehaviour_Loop(), 
						dataObjectContainerMap));
			} else if (currentUserAction instanceof Branch) {
				results.putAll(lookUpUserActionsAfterMarkedActorSteps(initiallyMarkedActorSteps, 
						precedingMarkedActorSteps, (Branch) currentUserAction, dataObjectContainerMap));
			} else if (currentUserAction instanceof ActorStep) {
				collectActorStepWithDependency(initiallyMarkedActorSteps, precedingMarkedActorSteps, 
						(ActorStep) currentUserAction, results);
			} else if (currentUserAction instanceof EntryLevelSystemCall) {
				collectEntryLevelSystemCallWithDependency(precedingMarkedActorSteps, 
						(EntryLevelSystemCall) currentUserAction, dataObjectContainerMap, results);
			}
			currentUserAction = currentUserAction.getSuccessor();
		}
		
		return results;
	}
	
	private static Start lookUpStartInScenarioBehavior(ScenarioBehaviour scenarioBehaviour) {
		Start result = null;
		
		for (AbstractUserAction userAction: scenarioBehaviour.getActions_ScenarioBehaviour()) {
			if (userAction instanceof Start) {
				result = (Start) userAction;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * Traverses all branches (in the model actually called BranchTransitions) and applies
	 * the algorithm to their ScenarioBehaviors. The method guarantees that ActorSteps in
	 * parallel branches have no effect on each other, but are only influenced by their
	 * predecessors. After all branches have been processed, the newly marked ActorSteps 
	 * from each are one added to <code>precedingMarkedActorSteps</code> and therefore 
	 * can influence all user actions after the "Branch" element.
	 */
	private static Map<AbstractUserAction, List<ActorStep>> lookUpUserActionsAfterMarkedActorSteps(
			Collection<ActorStep> initiallyMarkedActorSteps, 
			Collection<ActorStep> precedingMarkedActorSteps, 
			Branch branch, Map<DataObject<?>, Set<DataObject<?>>> dataObjectContainerMap) {
		Map<AbstractUserAction, List<ActorStep>> results = new HashMap<AbstractUserAction, List<ActorStep>>();
		List<ActorStep> markedActorStepsInAllBranches = new LinkedList<ActorStep>();
		
		for (BranchTransition branchTransition: branch.getBranchTransitions_Branch()) {
			List<ActorStep> markedActorStepsInCurrentBranch = new LinkedList<ActorStep>(
					precedingMarkedActorSteps);
			results.putAll(lookUpUserActionsAfterMarkedActorSteps(initiallyMarkedActorSteps, 
					markedActorStepsInCurrentBranch, branchTransition.
					getBranchedBehaviour_BranchTransition(), dataObjectContainerMap));
			// Keep only newly marked ones
			markedActorStepsInCurrentBranch.removeAll(precedingMarkedActorSteps);
			markedActorStepsInAllBranches.addAll(markedActorStepsInCurrentBranch);
		}
		
		precedingMarkedActorSteps.addAll(markedActorStepsInAllBranches);
		return results;
	}
	
	/**
	 * Checks all <code>precedingMarkedActorSteps</code> if at least one of their outputDataObjects
	 * is an inputDataObject (or contained in at least one inputDataObject) of the 
	 * <code>currentActorStep</code>. If yes, the current step together with its relevant predecessors 
	 * is added to the <code>userActionsToBeMarked</code> (even if it is already marked). Furthermore, 
	 * <code>precedingMarkedActorSteps</code> is updated if either the <code>currentActorStep</code> 
	 * should be marked or is contained in <code>initiallyMarkedActorSteps</code>.
	 */
	private static void collectActorStepWithDependency(Collection<ActorStep> initiallyMarkedActorSteps, 
			Collection<ActorStep> precedingMarkedActorSteps, ActorStep currentActorStep, 
			Map<AbstractUserAction, List<ActorStep>> userActionsToBeMarked) {
		List<ActorStep> relevantPredecessorsForCurrentStep = new LinkedList<ActorStep>();
		
		for (ActorStep precedingActorStep: precedingMarkedActorSteps) {
			List<DataObject<?>> sharedDataObjects = new ArrayList<DataObject<?>>(
					precedingActorStep.getOutputDataObjects());
			sharedDataObjects.retainAll(lookUpContainedDataObjects(
					currentActorStep.getInputDataObjects()));
			if (!sharedDataObjects.isEmpty()) {
				relevantPredecessorsForCurrentStep.add(precedingActorStep);
			}
		}
		
		if (!relevantPredecessorsForCurrentStep.isEmpty() || 
				initiallyMarkedActorSteps.contains(currentActorStep)) {
			precedingMarkedActorSteps.add(currentActorStep);
			if (!relevantPredecessorsForCurrentStep.isEmpty()) {
				userActionsToBeMarked.put(currentActorStep, relevantPredecessorsForCurrentStep);
			}
		}
	}
	
	/**
	 * Checks all <code>precedingMarkedActorSteps</code> if at least one DataType of their 
	 * outputDataObjects (or the DataType of a Composite-/CollectionDataObject containing 
	 * an outputDataObject) equals a parameter's DataType of the operation of the 
	 * <code>currentELSC</code>. If yes, the <code>currentELSC</code> together with its 
	 * relevant preceding ActorSteps is added to the <code>userActionsToBeMarked</code>.
	 */
	private static void collectEntryLevelSystemCallWithDependency(Collection<ActorStep> 
			precedingMarkedActorSteps, EntryLevelSystemCall currentELSC,
			Map<DataObject<?>, Set<DataObject<?>>> dataObjectContainerMap,
			Map<AbstractUserAction, List<ActorStep>> userActionsToBeMarked) {
		List<ActorStep> relevantPredecessorsForCurrentStep = new LinkedList<ActorStep>();
		
		for (ActorStep precedingActorStep: precedingMarkedActorSteps) {
			Set<DataObject<?>> outputAndContainerDataObjects = new HashSet<DataObject<?>>(
					precedingActorStep.getOutputDataObjects());
			for (DataObject<?> outputDataObject: precedingActorStep.getOutputDataObjects()) {
				outputAndContainerDataObjects.addAll(dataObjectContainerMap.get(outputDataObject));
			}
			OuterLoop: for (DataObject<?> currentOutputDataObject: outputAndContainerDataObjects) {
				for (Parameter currentELSCParameter: currentELSC.getOperationSignature__EntryLevelSystemCall().
						getParameters__OperationSignature()) {
					if (currentOutputDataObject.getDataTypes().contains(
							currentELSCParameter.getDataType__Parameter())) {
						relevantPredecessorsForCurrentStep.add(precedingActorStep);
						break OuterLoop;
					}
				}
			}
		}
		
		if (!relevantPredecessorsForCurrentStep.isEmpty()) {
			userActionsToBeMarked.put(currentELSC, relevantPredecessorsForCurrentStep);
		}
	}
	
	public static List<DataObject<?>> lookUpAllDataObjects(BPArchitectureVersion version) {	
		List<DataObject<?>> result = new ArrayList<DataObject<?>>();
		result.addAll(version.getDataModel().getDataObjects());
		return result;
	}
	
	/**
	 * Returns a map with all DataObjects of the passed <code>version</code> as keys and
	 * their container DataObjects (Composite-/CollectionDataObjects which contain a certain 
	 * DataObject; container is not meant in an EMF sense, the EReferences to inner DataObjects
	 * are no containment references) as values. The method considers indirect/recursive 
	 * relationships as well, so not only the containers are found, but also the containers 
	 * of the containers etc.
	 */
	public static Map<DataObject<?>, Set<DataObject<?>>> lookUpAllDataObjectsWithContainers(
			BPArchitectureVersion version) {
		Map<DataObject<?>, Set<DataObject<?>>> result = new HashMap<DataObject<?>, 
				Set<DataObject<?>>>();
		List<DataObject<?>> dataObjectsToVisit = new LinkedList<DataObject<?>>(
				lookUpAllDataObjects(version));
		for (DataObject<?> dataObject: dataObjectsToVisit) {
			result.put(dataObject, new HashSet<DataObject<?>>());
		}
		
		while (!dataObjectsToVisit.isEmpty()) {
			DataObject<?> currentDataObject = dataObjectsToVisit.remove(0);
			for (DataObject<?> parentDataObject: result.get(currentDataObject)) {
				result.get(currentDataObject).addAll(result.get(parentDataObject));
			}
			if (currentDataObject instanceof CollectionDataObject) {
				for (DataObject<?> innerDataObject: ((CollectionDataObject)currentDataObject).
						getInnerDataObjects()) {
					result.get(innerDataObject).add(currentDataObject);
					if (!innerDataObject.equals(currentDataObject) && 
							!result.containsKey(innerDataObject)) {
						dataObjectsToVisit.add(innerDataObject);
					}
				}
			} else if (currentDataObject instanceof CompositeDataObject) {
				for (InnerDataObjectDeclaration innerDataObjectDeclaration: ((CompositeDataObject) 
						currentDataObject).getInnerDataObjectDeclarations()) {
					result.get(innerDataObjectDeclaration.getDataObject()).add(currentDataObject);
					if (!innerDataObjectDeclaration.getDataObject().equals(currentDataObject) &&
							!result.containsKey(innerDataObjectDeclaration.getDataObject())) {
						dataObjectsToVisit.add(innerDataObjectDeclaration.getDataObject());
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Returns the passed DataObjects unified with their contained DataObjects 
	 * (recursive, no duplicates). Nearly a top-down version of 
	 * {@link #lookUpCompositeAndCollectionDataObjectsWithDataObjects(BPArchitectureVersion, Collection)}
	 * (difference: this method also returns the passed dataObjects).
	 */
	public static Set<DataObject<?>> lookUpContainedDataObjects(
			Collection<DataObject<?>> dataObjects) {
		Set<DataObject<?>> results = new HashSet<DataObject<?>>();
		List<DataObject<?>> dataObjectsToVisit = new LinkedList<DataObject<?>>(dataObjects);
		
		while(!dataObjectsToVisit.isEmpty()) {
			DataObject<?> currentDataObject = dataObjectsToVisit.remove(0);
			results.add(currentDataObject);
			if (currentDataObject instanceof CompositeDataObject) {
				for (InnerDataObjectDeclaration innerDataObjectDeclaration: 
						((CompositeDataObject) currentDataObject).getInnerDataObjectDeclarations()) {
					if (!dataObjectsToVisit.contains(innerDataObjectDeclaration.getDataObject()) &&
							!results.contains(innerDataObjectDeclaration.getDataObject())) {
						dataObjectsToVisit.add(innerDataObjectDeclaration.getDataObject());
					}
				}
			} else if (currentDataObject instanceof CollectionDataObject) {
				for (DataObject<?> innerDataObject: ((CollectionDataObject) currentDataObject).
						getInnerDataObjects()) {
					if (!dataObjectsToVisit.contains(innerDataObject) && 
							!results.contains(innerDataObject)) {
						dataObjectsToVisit.add(innerDataObject);
					}
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Recursive lookup of Composite- and CollectionDataObjects containing certain
	 * DataObjects. Duplicates are eliminated. The logic is quite similar to
	 * {@link #lookUpAllDataTypes(BPArchitectureVersion)}, apart from the "collection" 
	 * case (all inner objects have to be checked, not just the inner type).
	 */
	public static Map<DataObject<?>, Set<DataObject<?>>> lookUpCompositeAndCollectionDataObjectsWithDataObjects(
			BPArchitectureVersion version, Collection<DataObject<?>> dataObjects) {
		Map<DataObject<?>, Set<DataObject<?>>> results = new HashMap<DataObject<?>, Set<DataObject<?>>>();
		List<DataObject<?>> allDataObjects = BPArchitectureModelLookup.lookUpAllDataObjects(version);
		List<DataObject<?>> dataObjectsToVisit = new LinkedList<DataObject<?>>(dataObjects);
		
		while (!dataObjectsToVisit.isEmpty()) {
			DataObject<?> simpleDataObject = dataObjectsToVisit.remove(0);
			for (DataObject<?> resultCandidate: allDataObjects) {
				if (resultCandidate instanceof CompositeDataObject) {
					CompositeDataObject complexDataObject = (CompositeDataObject) resultCandidate;
					for (InnerDataObjectDeclaration innerDeclaration: complexDataObject.
							getInnerDataObjectDeclarations()) {
						if (innerDeclaration.getDataObject().equals(simpleDataObject)) {
							if (!dataObjectsToVisit.contains(complexDataObject) &&
									!results.containsKey(complexDataObject)) { //Analyze only once
								dataObjectsToVisit.add(complexDataObject); 
							}
							MapUtil.putOrAddToMap(results, resultCandidate, simpleDataObject);					
						}
					}
				} else if (resultCandidate instanceof CollectionDataObject) {
					CollectionDataObject complexDataObject = (CollectionDataObject) resultCandidate;
					for (DataObject<?> innerDataObject: complexDataObject.getInnerDataObjects()) {
						if (innerDataObject.equals(simpleDataObject)) {
							if (!dataObjectsToVisit.contains(complexDataObject) &&
									!results.containsKey(complexDataObject)) { //Analyze only once
								dataObjectsToVisit.add(complexDataObject);
							}
							MapUtil.putOrAddToMap(results, resultCandidate, simpleDataObject);
						}
					}
				}
			}
		}
		
		return results;
	}
	
	public static Map<DataObject<?>, Set<DataType>> lookUpDataObjectsWithDataTypes(
			BPArchitectureVersion version, Collection<DataType> datatypes) {
		Map<DataObject<?>, Set<DataType>> results = new HashMap<DataObject<?>, Set<DataType>>();
		
		for (DataObject<?> dataObject: version.getDataModel().getDataObjects()) {
			for (DataType dataType: datatypes) {
				if (dataObject.getDataTypes().contains(dataType)) {
					MapUtil.putOrAddToMap(results, dataObject, dataType);
				}
			}
		}
		
		return results;
	}
	
	public static Map<DataType, Set<DataObject<?>>> lookUpDataTypesWithDataObjects(
			BPArchitectureVersion version, Collection<DataObject<?>> dataObjects) {
		Map<DataType, Set<DataObject<?>>> results = new HashMap<DataType, Set<DataObject<?>>>();
		
		for (DataType dataType: version.getRepository().getDataTypes__Repository()) {
			for (DataObject<?> dataObject: dataObjects) {
				if (dataObject.getDataTypes().contains(dataType)) {
					MapUtil.putOrAddToMap(results, dataType, dataObject);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Recursive lookup of Composite- and CollectionDataTypes containing certain
	 * DataTypes. Duplicates are eliminated.
	 */
	public static Map<DataType, Set<DataType>> lookUpCompositeAndCollectionDataTypesOfDataTypes(
			BPArchitectureVersion version, Collection<DataType> dataTypes) {
		Map<DataType, Set<DataType>> results = new HashMap<DataType, Set<DataType>>();
		List<DataType> allDataTypes = BPArchitectureModelLookup.lookUpAllDataTypes(version);
		List<DataType> dataTypesToVisit = new LinkedList<DataType>(dataTypes);
		
		while (!dataTypesToVisit.isEmpty()) {
			DataType simpleDataType = dataTypesToVisit.remove(0);		
			for (DataType resultCandidate: allDataTypes) {
				if (resultCandidate instanceof CompositeDataType) {
					CompositeDataType complexDataType = (CompositeDataType) resultCandidate;
					for (InnerDeclaration innerDeclaration: complexDataType.
							getInnerDeclaration_CompositeDataType()) {
						if (innerDeclaration.getDatatype_InnerDeclaration().equals(simpleDataType)) {
							if (!dataTypesToVisit.contains(complexDataType) && 
									!results.containsKey(complexDataType)) { //Analyze only once
								dataTypesToVisit.add(complexDataType); 
							}
							MapUtil.putOrAddToMap(results, complexDataType, simpleDataType);
						}
					}
				} else if (resultCandidate instanceof CollectionDataType) {
					CollectionDataType complexDataType = (CollectionDataType) resultCandidate;
					if (complexDataType.getInnerType_CollectionDataType().equals(simpleDataType)) {
						if (!dataTypesToVisit.contains(complexDataType) &&
								!results.containsKey(complexDataType)) { //Analyze only once
							dataTypesToVisit.add(complexDataType);
						}
						MapUtil.putOrAddToMap(results, complexDataType, simpleDataType);
					}
				}
			}
		}
		
		return results;
	}
	
	public static List<ReleaseDeviceResourceAction> lookUpReleaseDeviceResourceActionsWithDeviceResources(
			BPArchitectureVersion version, Collection<DeviceResource> deviceResources) {
		List<ReleaseDeviceResourceAction> results = new LinkedList<ReleaseDeviceResourceAction>();
		
		for (AbstractUserAction action: lookUpAllUserActions(version)) {
			if (action instanceof ReleaseDeviceResourceAction && deviceResources.contains(
					((ReleaseDeviceResourceAction) action).getPassiveresource_ReleaseAction())) {
				results.add((ReleaseDeviceResourceAction) action);
			}
		}
		
		return results;
	}
	
	/**
	* Returns all DataTypes from the repository in a new list (so adding, removing etc.
	* is possible without changing the repository itself).
	*/
	public static List<DataType> lookUpAllDataTypes(BPArchitectureVersion version) {	
		List<DataType> result = new LinkedList<DataType>();
		result.addAll(version.getRepository().getDataTypes__Repository());
		return result;
	}
	
	/**
	 * Finds Interfaces that have a Signature which is part of an
	 * EntryLevelSystemCall. Both <code>affectedInterfaces</code> and
	 * <code>affectedSignatures</code> act as return type to show the 
	 * cause-effect-relationship.
	 */
	public static void lookUpInterfacesAndSignaturesWithEntryLevelSystemCalls(
			BPArchitectureVersion version, Collection<EntryLevelSystemCall> entryLevelSystemCalls,
			Map<Interface, Set<Signature>> affectedInterfaces, 
			Map<Signature, EntryLevelSystemCall> affectedSignatures) {
		for (Interface interfac : version.getRepository().getInterfaces__Repository()) {
			if (interfac instanceof OperationInterface) {
				OperationInterface operationInterface = (OperationInterface)interfac;
				Map<Signature, EntryLevelSystemCall> matchingSignatures = 
						new HashMap<Signature, EntryLevelSystemCall>();
				for (EntryLevelSystemCall elsc: entryLevelSystemCalls) {
					matchingSignatures.put(elsc.getOperationSignature__EntryLevelSystemCall(), elsc);
				}
				MapUtil.retainAll(matchingSignatures, operationInterface.getSignatures__OperationInterface());
				MapUtil.putOrAddToMap(affectedInterfaces, operationInterface, matchingSignatures.keySet());
				affectedSignatures.putAll(matchingSignatures);
			}
		}
	}
	
	/**
	 * Recursive method. The architecture version cannot only have multiple usage scenarios with lists
	 * of top-level user actions, but those scenarios might also contain activities, branches and loops 
	 * that have nested user actions.
	 */
	public static List<AbstractUserAction> lookUpAllUserActions(BPArchitectureVersion version) {		
		List<AbstractUserAction> results = new LinkedList<AbstractUserAction>();
		
		for (Entry<String, UsageModel> usageModelEntry: version.getUsageModels().entrySet()) {
			for (UsageScenario usageScenario: usageModelEntry.getValue().getUsageScenario_UsageModel()) {
				results.addAll(lookUpAllUserActions(usageScenario.getScenarioBehaviour_UsageScenario()));
			}
		}
		
		return results;
	}
	
	public static List<AbstractUserAction> lookUpAllUserActions(ScenarioBehaviour scenarioBehaviour) {		
		List<AbstractUserAction> results = new LinkedList<AbstractUserAction>();
		
		for (AbstractUserAction abstractUserAction: scenarioBehaviour.getActions_ScenarioBehaviour()) {
			results.addAll(lookUpAllUserActions(abstractUserAction));
		}
		
		return results;
	}
	
	public static List<AbstractUserAction> lookUpAllUserActions(AbstractUserAction action) {		
		List<AbstractUserAction> results = new LinkedList<AbstractUserAction>();
		
		results.add(action);		
		if (action instanceof Activity) {
			results.addAll(lookUpAllUserActions(((Activity) action).getScenario()));
		} else if (action instanceof Branch) {
			for (BranchTransition branchTransition: ((Branch) action).getBranchTransitions_Branch()) {
				results.addAll(lookUpAllUserActions(branchTransition.getBranchedBehaviour_BranchTransition()));
			}
		} else if (action instanceof Loop) {
			results.addAll(lookUpAllUserActions(((Loop) action).getBodyBehaviour_Loop()));
		}

		return results;
	}
	
	/**
	 * Returns a list of all user actions after the passed <code>acquireDeviceResourceAction</code> 
	 * up to (and including) the corresponding ReleaseDeviceResourceAction. Only successors on the 
	 * same level are considered, no {@link Branch}es and no actions encapsulated in 
	 * {@link Activity}s. If there is no release, <code>null</code> will be returned.<br> 
	 * The method supports multiple acquire actions for the same resource: It maintains a counter 
	 * of the open acquire actions (without release) for the particular resource and will return 
	 * successfully only if the number of acquires and releases is equal. As multiple acquires and 
	 * releases could be processed, they are also added to collections as pseudo-return types, so 
	 * the calling method can ignore them. If the method does not return successfully, only the 
	 * initial acquire actions is considered as processed.
	 */
	public static List<AbstractUserAction> lookUpUserActionsUpToReleaseDeviceResource(
			AcquireDeviceResourceAction acquireDeviceResourceAction, Collection<AcquireDeviceResourceAction> 
			acquireActionsProcessed, Collection<ReleaseDeviceResourceAction> releaseActionsProcessed) {
		List<AbstractUserAction> results = new LinkedList<AbstractUserAction>();		
		AbstractUserAction currentAction = acquireDeviceResourceAction.getSuccessor();
		int numOpenAcquiresForThatResource = 1;
		acquireActionsProcessed.add(acquireDeviceResourceAction);
		
		while(currentAction != null) {
			results.add(currentAction);
			if (currentAction instanceof AcquireDeviceResourceAction && 
					((AcquireDeviceResourceAction) currentAction).getPassiveresource_AcquireAction().
					equals(acquireDeviceResourceAction.getPassiveresource_AcquireAction())) {
				numOpenAcquiresForThatResource++;
				acquireActionsProcessed.add((AcquireDeviceResourceAction) currentAction);
			}
			if (currentAction instanceof ReleaseDeviceResourceAction && 
					((ReleaseDeviceResourceAction) currentAction).getPassiveresource_ReleaseAction().
					equals(acquireDeviceResourceAction.getPassiveresource_AcquireAction())) {
				numOpenAcquiresForThatResource--;
				releaseActionsProcessed.add((ReleaseDeviceResourceAction) currentAction);
			}			
			if (numOpenAcquiresForThatResource == 0) {
				return results;
			}
			currentAction = currentAction.getSuccessor();
		}
		
		//Count of acquires and releases not matching
		acquireActionsProcessed.clear();
		acquireActionsProcessed.add(acquireDeviceResourceAction);
		releaseActionsProcessed.clear();
		return null;
	}

}
