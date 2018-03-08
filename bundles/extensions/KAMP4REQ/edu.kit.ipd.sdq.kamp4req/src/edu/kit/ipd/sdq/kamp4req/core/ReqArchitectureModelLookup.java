package edu.kit.ipd.sdq.kamp4req.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import options.Option;
import pcmarchoptions.PCM_AllocateNeverTogether;
import pcmarchoptions.PCM_AllocateTogether;
import pcmarchoptions.PCM_ChangeDataType;
import pcmarchoptions.PCM_ChangeInterface;
import pcmarchoptions.PCM_ChangeRoles;
import pcmarchoptions.PCM_FunctionalityConnection;
import pcmarchoptions.PCM_IntroduceNewAdapter;
import pcmarchoptions.PCM_IntroduceNewComponent;
import pcmarchoptions.PCM_IntroduceNewDataType;
import pcmarchoptions.PCM_IntroduceNewInterface;
import pcmarchoptions.PCM_MergeComponents;
import pcmarchoptions.PCM_MoveComponents;
import pcmarchoptions.PCM_MultipleAllocation;
import pcmarchoptions.PCM_MultipleInstantiation;
import pcmarchoptions.PCM_NeverAllocateToSpecificNodes;
import pcmarchoptions.PCM_OnlySingleAllocation;
import pcmarchoptions.PCM_OnlySingleInstantiation;
import pcmarchoptions.PCM_ProvidedFunctionality;
import pcmarchoptions.PCM_RemoveDataType;
import pcmarchoptions.PCM_RemoveInterface;
import pcmarchoptions.PCM_ReplaceComponents;
import pcmarchoptions.PCM_RequiredFunctionality;
import pcmarchoptions.PCM_ReuseComponent;
import pcmarchoptions.PCM_SplitComponent;
import pcmbpoptions.PCM_ChangeEntity;
import pcmbpoptions.PCM_IntroduceNewEntity;
import pcmbpoptions.PCM_RemoveEntity;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.TriggerObject;
import requirements.Requirement;

public class ReqArchitectureModelLookup {
	
	public static Map<Requirement, Set<TriggerObject>> lookUpRequirementsTriggeringTriggerObjects(
			Collection<? extends TriggerObject> triggeredObjects) {
		Map<Requirement, Set<TriggerObject>> results = new HashMap<Requirement, Set<TriggerObject>>();
		
		for (TriggerObject triggeredObject: triggeredObjects) {
			for (TriggerObject trigger: triggeredObject.getTriggeredBy()) {
				if (trigger instanceof Requirement) {
					MapUtil.putOrAddToMap(results, (Requirement) trigger, triggeredObject);
				}
			}
		}
		
		return results;
	}
	
	public static Map<Decision, Set<TriggerObject>> lookUpDecisionsTriggeredByTriggerObjects(
			Collection<? extends TriggerObject> triggers) {
		Map<Decision, Set<TriggerObject>> results = new HashMap<Decision, Set<TriggerObject>>();
		
		for (TriggerObject trigger: triggers) {
			for (TriggerObject triggeredObject : trigger.getTriggerOf()) {
				if (triggeredObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) triggeredObject, trigger);
				}
			}
		}
		
		return results;
	}
	
	public static Map<Option, Set<TriggerObject>> lookUpOptionsTriggeredByTriggerObjects(
			Collection<? extends TriggerObject> triggers) {
		Map<Option, Set<TriggerObject>> results = new HashMap<Option, Set<TriggerObject>>();
		
		for (TriggerObject trigger: triggers) {
			for (TriggerObject triggeredObject : trigger.getTriggerOf()) {
				if (triggeredObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) triggeredObject, trigger);
				}
			}
		}
		
		return results;
	}
	
	public static Map<Decision, Set<ResolveObject>> lookUpDecisionsResolvingResolveObjects(
			Collection<? extends ResolveObject> objectsToBeResolved) {
		Map<Decision, Set<ResolveObject>> results = new HashMap<Decision, Set<ResolveObject>>();
		
		for (ResolveObject objectToBeResolved: objectsToBeResolved) {
			for (ResolveObject resolvingObject : objectToBeResolved.getResolvedBy()) {
				if (resolvingObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) resolvingObject, objectToBeResolved);
				}
			}
		}
		
		return results;
	}
	
	public static Map<Option, Set<ResolveObject>> lookUpOptionsResolvingResolveObjects(
			Collection<? extends ResolveObject> objectsToBeResolved) {
		Map<Option, Set<ResolveObject>> results = new HashMap<Option, Set<ResolveObject>>();

		for (ResolveObject objectToBeResolved : objectsToBeResolved) {
			for (ResolveObject resolvingObject : objectToBeResolved.getResolvedBy()) {
				if (resolvingObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) resolvingObject, objectToBeResolved);
				}
			}
		}

		return results;
	}
	
	public static Map<Decision, Set<CouldResolveObject>> lookUpDecisionsCouldBeResolvingResolveObjects(
			Collection<? extends CouldResolveObject> objectsToBeResolved) {
		Map<Decision, Set<CouldResolveObject>> results = new HashMap<Decision, Set<CouldResolveObject>>();
		
		for (CouldResolveObject objectToBeResolved: objectsToBeResolved) {
			for (CouldResolveObject resolvingObject : objectToBeResolved.getCouldBeResolvedBy()) {
				if (resolvingObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) resolvingObject, objectToBeResolved);
				}
			}
		}
		
		return results;
	}
	
	public static Map<Option, Set<CouldResolveObject>> lookUpOptionsCouldBeResolvingResolveObjects(
			Collection<? extends CouldResolveObject> objectsToBeResolved) {
		Map<Option, Set<CouldResolveObject>> results = new HashMap<Option, Set<CouldResolveObject>>();
		
		for (CouldResolveObject objectToBeResolved: objectsToBeResolved) {
			for (CouldResolveObject resolvingObject : objectToBeResolved.getCouldBeResolvedBy()) {
				if (resolvingObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) resolvingObject, objectToBeResolved);
				}
			}
		}
		
		return results;
	}
	
	public static Map<DataType, Set<Decision>> lookUpDataTypesReferencedByDecisions(
			ReqArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<DataType, Set<Decision>> results = new HashMap<DataType, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof Option) {
					for (DataType dataType : version.getRepository().getDataTypes__Repository()) {
						if (isDataTypeReferencedByOption(dataType, (Option) selection)) {
							MapUtil.putOrAddToMap(results, dataType, decision);
						}
					}
				}
			}
		}
		
		return results;
	}
	
	public static Map<DataType, Set<Option>> lookUpDataTypesReferencedByOptions(
			ReqArchitectureVersion version, Collection<? extends Option> options) {
		Map<DataType, Set<Option>> results = new HashMap<DataType, Set<Option>>();
		
		for (Option option: options) {
			for (DataType dataType : version.getRepository().getDataTypes__Repository()) {
				if (isDataTypeReferencedByOption(dataType, option)) {
					MapUtil.putOrAddToMap(results, dataType, option);
				}
			}
		}
		
		return results;
	} 
	
	private static boolean isDataTypeReferencedByOption(DataType dataType, Option option) {
		return isDataTypeReferencedByIntroduceOption(dataType, option)
				|| isDataTypeReferencedByChangeOption(dataType, option)
				|| isDataTypeReferencedByRemoveOption(dataType, option);
	}

	private static boolean isDataTypeReferencedByIntroduceOption(DataType dataType, Option option) {	
		if (option instanceof PCM_IntroduceNewDataType) {
			PCM_IntroduceNewDataType pcmOption = (PCM_IntroduceNewDataType) option;
			return pcmOption.getDataTypes().contains(dataType);
		} else {
			return false;
		}
	}
	
	private static boolean isDataTypeReferencedByChangeOption(DataType dataType, Option option) {
		if (option instanceof PCM_ChangeDataType) {
			PCM_ChangeDataType pcmOption = (PCM_ChangeDataType) option;
			//consider only the old ones, not the new ones (forward propagation)
			return (pcmOption.getOldDataTypes().contains(dataType));
		} else {
			return false;
		}
	}
	
	private static boolean isDataTypeReferencedByRemoveOption(DataType dataType, Option option) {
		if (option instanceof PCM_RemoveDataType) {
			PCM_RemoveDataType pcmOption = (PCM_RemoveDataType) option;
			return pcmOption.getDataTypes().contains(dataType);
		} else {
			return false;
		}
	}
	
	public static Map<OperationInterface, Set<Decision>> lookUpInterfacesReferencedByDecisions(
			ReqArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<OperationInterface, Set<Decision>> results = new HashMap<OperationInterface, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof Option) {
					for (Interface interfac : version.getRepository().getInterfaces__Repository()) {
						if (interfac instanceof OperationInterface && isInterfaceReferencedByOption(
								(OperationInterface) interfac, (Option) selection)) {
							MapUtil.putOrAddToMap(results, (OperationInterface) interfac, decision);
						}
					}
				}
			}
		}
		
		return results;
	}
	
	public static Map<OperationInterface, Set<Option>> lookUpInterfacesReferencedByOptions(
			ReqArchitectureVersion version, Collection<? extends Option> options) {
		Map<OperationInterface, Set<Option>> results = new HashMap<OperationInterface, Set<Option>>();
		
		for (Option option: options) {
			for (Interface interfac : version.getRepository().getInterfaces__Repository()) {
				if (interfac instanceof OperationInterface && isInterfaceReferencedByOption(
						(OperationInterface) interfac, option)) {
					MapUtil.putOrAddToMap(results, (OperationInterface)interfac, option);
				}
			}
		}
		
		return results;
	}
	
	private static boolean isInterfaceReferencedByOption(OperationInterface interfac, 
			Option option) {
		return isInterfaceReferencedByIntroduceOption(interfac, option)
				|| isInterfaceReferencedByChangeOption(interfac, option)
				|| isInterfaceReferencedByRemoveOption(interfac, option);
	}

	private static boolean isInterfaceReferencedByIntroduceOption(OperationInterface interfac, 
			Option option) {	
		if (option instanceof PCM_IntroduceNewInterface) {
			PCM_IntroduceNewInterface pcmOption = (PCM_IntroduceNewInterface) option;
			return pcmOption.getInterfaces().contains(interfac);
		} else {
			return false;
		}
	}
	
	private static boolean isInterfaceReferencedByChangeOption(OperationInterface interfac, 
			Option option) {
		if (option instanceof PCM_ChangeDataType) {
			PCM_ChangeInterface pcmOption = (PCM_ChangeInterface) option;
			//consider only the old ones, not the new ones (forward propagation)
			return pcmOption.getOldInterfaces().contains(interfac);
		} else {
			return false;
		}
	}
	
	private static boolean isInterfaceReferencedByRemoveOption(OperationInterface interfac, 
			Option option) {
		if (option instanceof PCM_RemoveInterface) {
			PCM_RemoveInterface pcmOption = (PCM_RemoveInterface) option;
			return pcmOption.getInterfaces().contains(interfac);
		} else {
			return false;
		}
	}
	
	public static Map<RepositoryComponent, Set<Decision>> lookUpComponentsReferencedByDecisions(
			ReqArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<RepositoryComponent, Set<Decision>> results = new HashMap<RepositoryComponent, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof Option) {
					for (RepositoryComponent component : version.getRepository().getComponents__Repository()) {
						if (isComponentReferencedByOption(component, (Option) selection)) {
							MapUtil.putOrAddToMap(results, component, decision);
						}
					}
				}
			}
		}
		
		return results;
	}
	
	public static Map<RepositoryComponent, Set<Option>> lookUpComponentsReferencedByOptions(
			ReqArchitectureVersion version, Collection<? extends Option> options) {
		Map<RepositoryComponent, Set<Option>> results = new HashMap<RepositoryComponent, Set<Option>>();
		
		for (Option option: options) {
			for (RepositoryComponent repositoryComponent : version.getRepository().getComponents__Repository()) {
				if (isComponentReferencedByOption(repositoryComponent, option)) {
					MapUtil.putOrAddToMap(results, repositoryComponent, option);
				}
			}
		}
		
		return results;
	}
	
	private static boolean isComponentReferencedByOption(RepositoryComponent component, 
			Option option) {
		return isComponentReferencedByFunctionalityConnectionOption(component, option)
				|| isComponentReferencedByRequiredFunctionalityOption(component, option)
				|| isComponentReferencedByProvidedFunctionalityOption(component, option)
				|| isComponentReferencedByOnlySingleAllocationOption(component, option)
				|| isComponentReferencedByAllocateTogetherOption(component, option)
				|| isComponentReferencedByAllocateNeverTogetherOption(component, option)
				|| isComponentReferencedByMultipleAllocationOption(component, option)
				|| isComponentReferencedByNeverAllocateToSpecificNodesOption(component, option)
				|| isComponentReferencedByMoveComponentsOption(component, option)
				|| isComponentReferencedByChangeRolesOption(component, option)
				|| isComponentReferencedByMultipleInstantiationOption(component, option)
				|| isComponentReferencedByOnlySingleInstantiationOption(component, option)
				|| isComponentReferencedByReplaceComponentsOption(component, option)
				|| isComponentReferencedByBanComponentOption(component, option)
				|| isComponentReferencedByReuseComponentOption(component, option)
				|| isComponentReferencedBySplitComponentOption(component, option)
				|| isComponentReferencedByMergeComponentOption(component, option)
				|| isComponentReferencedByIntroduceNewComponentOption(component, option)
				|| isComponentReferencedByIntroduceNewAdapterOption(component, option);
	}

	private static boolean isComponentReferencedByFunctionalityConnectionOption(
			RepositoryComponent repositoryComponent, Option option) {
		// TODO maybe interface / signature instead of component?
		if (option instanceof PCM_FunctionalityConnection) {
			PCM_FunctionalityConnection pcmOption = (PCM_FunctionalityConnection) option;
			return pcmOption.getConnector() != null 
					&& ((pcmOption.getConnector().getProvidingAssemblyContext_AssemblyConnector().
							getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)) 
					|| (pcmOption.getConnector().getRequiringAssemblyContext_AssemblyConnector().
							getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)));
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByRequiredFunctionalityOption(
			RepositoryComponent repositoryComponent, Option option) {
		// TODO maybe interface / signature instead of component?
		if (option instanceof PCM_RequiredFunctionality) {
			PCM_RequiredFunctionality pcmOption = (PCM_RequiredFunctionality) option;
			Collection<RequiredRole> commonRequiredRoles = new ArrayList<RequiredRole>(
					repositoryComponent.getRequiredRoles_InterfaceRequiringEntity());
			commonRequiredRoles.retainAll(pcmOption.getRequiredRoles());
			return !commonRequiredRoles.isEmpty();
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByProvidedFunctionalityOption(
			RepositoryComponent repositoryComponent, Option option) {
		// TODO maybe interface / signature instead of component?
		if (option instanceof PCM_ProvidedFunctionality) {
			PCM_ProvidedFunctionality pcmOption = (PCM_ProvidedFunctionality) option;
			Collection<ProvidedRole> commonProvidedRoles = new ArrayList<ProvidedRole>(
					repositoryComponent.getProvidedRoles_InterfaceProvidingEntity());
			commonProvidedRoles.retainAll(pcmOption.getProvidedRoles());
			return !commonProvidedRoles.isEmpty();
		} else {
			return false;
		}
	}
	
	private static boolean isComponentReferencedByOnlySingleAllocationOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_OnlySingleAllocation) {
			PCM_OnlySingleAllocation pcmOption = (PCM_OnlySingleAllocation)option;
			for (AllocationContext allocationContext: pcmOption.getAllocationContexts()) {
				if (allocationContext.getAssemblyContext_AllocationContext().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)) {
					return true;
				}
			}
		} 
		return false;
	}

	private static boolean isComponentReferencedByAllocateTogetherOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_AllocateTogether) {
			PCM_AllocateTogether pcmOption = (PCM_AllocateTogether)option;
			for (AllocationContext pcmOptionAllocationContext : pcmOption.getAllocationContexts()) {
				if (pcmOptionAllocationContext.getAssemblyContext_AllocationContext().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByAllocateNeverTogetherOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_AllocateNeverTogether) {
			PCM_AllocateNeverTogether pcmOption = (PCM_AllocateNeverTogether)option;
			for (AllocationContext pcmOptionAllocationContext : pcmOption.getAllocationContexts()) {
				if (pcmOptionAllocationContext.getAssemblyContext_AllocationContext().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByMultipleAllocationOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_MultipleAllocation) {
			PCM_MultipleAllocation pcmOption = (PCM_MultipleAllocation)option;
			for (AllocationContext pcmOptionAllocationContext : pcmOption.getAllocationContexts()) {
				if (pcmOptionAllocationContext.getAssemblyContext_AllocationContext().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByNeverAllocateToSpecificNodesOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_NeverAllocateToSpecificNodes) {
			PCM_NeverAllocateToSpecificNodes pcmOption = (PCM_NeverAllocateToSpecificNodes)option;
			for (AllocationContext pcmOptionAllocationContext : pcmOption.getAllocationContexts()) {
				if (pcmOptionAllocationContext.getAssemblyContext_AllocationContext().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByMoveComponentsOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_MoveComponents) {
			PCM_MoveComponents pcmOption = (PCM_MoveComponents)option;
			for (AllocationContext pcmOptionAllocationContext : pcmOption.getAllocationContexts()) {
				if (pcmOptionAllocationContext.getAssemblyContext_AllocationContext().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByChangeRolesOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_ChangeRoles) {
			PCM_ChangeRoles pcmOption = (PCM_ChangeRoles)option;
			return pcmOption.getAssemblyContext() != null && pcmOption.getAssemblyContext().
					getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent);
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByMultipleInstantiationOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_MultipleInstantiation) {
			PCM_MultipleInstantiation pcmOption = (PCM_MultipleInstantiation)option;
			for (AssemblyContext pcmOptionAssemblyContext : pcmOption.getAssemblyContexts()) {
				if (pcmOptionAssemblyContext.getEncapsulatedComponent__AssemblyContext().
						equals(repositoryComponent)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByOnlySingleInstantiationOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_OnlySingleInstantiation) {
			PCM_OnlySingleInstantiation pcmOption = (PCM_OnlySingleInstantiation)option;
			for (AssemblyContext assemblyContext: pcmOption.getAssemblyContexts()) {
				if (assemblyContext.getEncapsulatedComponent__AssemblyContext().
						equals(repositoryComponent)) {
					return true;
				}
			}
		} 
		return false;
	}

	private static boolean isComponentReferencedByReplaceComponentsOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_ReplaceComponents) {
			PCM_ReplaceComponents pcmOption = (PCM_ReplaceComponents)option;
			for (AssemblyContext assemblyContext: pcmOption.getContextsReplacedWith()) {
				if (assemblyContext.getEncapsulatedComponent__AssemblyContext().
						equals(repositoryComponent)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isComponentReferencedByBanComponentOption(
			RepositoryComponent repositoryComponent, Option option) {
		// TODO maybe nothing to do here, because no reference on assembly context, 
		// only string with context name
		return false;
	}

	private static boolean isComponentReferencedByReuseComponentOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_ReuseComponent) {
			PCM_ReuseComponent pcmOption = (PCM_ReuseComponent)option;
			for (AssemblyContext assemblyContext: pcmOption.getAssemblyContexts()) {
				if (assemblyContext.getEncapsulatedComponent__AssemblyContext().
						equals(repositoryComponent)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean isComponentReferencedBySplitComponentOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_SplitComponent) {
			PCM_SplitComponent pcmOption = (PCM_SplitComponent)option;
			for (AssemblyContext pcmOptionAssemblyContext : pcmOption.getFinalContexts()) {
				if (pcmOptionAssemblyContext.getEncapsulatedComponent__AssemblyContext().
						equals(repositoryComponent)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByMergeComponentOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_MergeComponents) {
			PCM_MergeComponents pcmOption = (PCM_MergeComponents)option;
			return pcmOption.getFinalContext() != null && pcmOption.getFinalContext().
					getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent);
		} else {
			return false;
		}
	}

	private static boolean isComponentReferencedByIntroduceNewComponentOption(
			RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_IntroduceNewComponent) {
			PCM_IntroduceNewComponent pcmOption = (PCM_IntroduceNewComponent)option;
			for (AssemblyContext assemblyContext: pcmOption.getAssemblyContexts()) {
				if (assemblyContext.getEncapsulatedComponent__AssemblyContext().
						equals(repositoryComponent)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private static boolean isComponentReferencedByIntroduceNewAdapterOption(RepositoryComponent repositoryComponent, Option option) {
		if (option instanceof PCM_IntroduceNewAdapter) {
			PCM_IntroduceNewAdapter pcmOption = (PCM_IntroduceNewAdapter)option;
			return ((pcmOption.getContextBeingAdapted() != null && pcmOption.getContextBeingAdapted().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent))
					|| (pcmOption.getAdapterContext() != null && pcmOption.getAdapterContext().
						getEncapsulatedComponent__AssemblyContext().equals(repositoryComponent)));
		} else {
			return false;
		}
	}
	
	/**
	 * Finds all DependencyObjects that are directly or indirectly (transitive closure) 
	 * dependent on at least on of the DependencyObject passed as a parameter and that 
	 * have a certain type (or one of its sub-types). The causing objects are the values
	 * of the map, the affected objects are the keys.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends DependencyObject> Map<T, Set<DependencyObject>> lookUpObjectsDependOnObjects(
			Collection<? extends DependencyObject> sourceDependencyObjects, Class<T> dependencyObjectsClass) {
		Map<T, Set<DependencyObject>> results = new HashMap<T, Set<DependencyObject>>();
		List<DependencyObject> dependenciesToVisit = new LinkedList<DependencyObject>(
				sourceDependencyObjects);
		
		while(!dependenciesToVisit.isEmpty()) {
			DependencyObject sourceDependencyObject = dependenciesToVisit.remove(0);
			for (DependencyObject targetDependencyObject: sourceDependencyObject.getHasDependents()) {
				if (dependencyObjectsClass.isAssignableFrom(targetDependencyObject.getClass())) {
					// Analyze each object only once, but always update causes
					if (!dependenciesToVisit.contains(targetDependencyObject) && 
							!results.containsKey(targetDependencyObject)) {
						dependenciesToVisit.add(targetDependencyObject);
					}
					MapUtil.putOrAddToMap(results, (T) targetDependencyObject, sourceDependencyObject);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Finds all DependencyObjects which at least one of the DependencyObjects passed 
	 * as a parameter directly or indirectly (transitive closure) depends on and that 
	 * have a certain type (or one of its sub-types). The causes (dependent objects) are
	 * stored as the value of the map, the affected objects are the keys.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends DependencyObject> Map<T, Set<DependencyObject>> lookUpObjectsAnotherObjectDependsOn(
			Collection<? extends DependencyObject> targetDependencyObjects, Class<T> dependencyObjectClass) {
		Map<T, Set<DependencyObject>> results = new HashMap<T, Set<DependencyObject>>();
		List<DependencyObject> dependenciesToVisit = new LinkedList<DependencyObject>(
				targetDependencyObjects);
		
		while(!dependenciesToVisit.isEmpty()) {
			DependencyObject targetDependencyObject = dependenciesToVisit.remove(0);
			for (DependencyObject sourceDependencyObject: targetDependencyObject.getDependsOn()) {
				if (dependencyObjectClass.isAssignableFrom(sourceDependencyObject.getClass())) {
					// Analyze each object only once, but always update causes
					if (!dependenciesToVisit.contains(sourceDependencyObject) && 
							!results.containsKey(sourceDependencyObject)) {
						dependenciesToVisit.add(sourceDependencyObject);
					}
					MapUtil.putOrAddToMap(results, (T) sourceDependencyObject, targetDependencyObject);
				}
			}
		}
		
		return results;
	}
	
	public static Map<Entity, Set<Decision>> lookUpEntitiesReferencedByDecisions(
			ReqArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Entity, Set<Decision>> results = new HashMap<Entity, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof PCM_IntroduceNewEntity) {
					for (Entity entity: ((PCM_IntroduceNewEntity) selection).getEntities()) {
						MapUtil.putOrAddToMap(results, entity, decision);
					}
				} else if (selection instanceof PCM_ChangeEntity) {
					for (Entity entity: ((PCM_ChangeEntity) selection).getOldEntities()) {
						MapUtil.putOrAddToMap(results, entity, decision);
					}
				} else if (selection instanceof PCM_RemoveEntity) {
					for (Entity entity: ((PCM_RemoveEntity) selection).getEntities()) {
						MapUtil.putOrAddToMap(results, entity, decision);
					}
				}
			}
		}
		
		return results;
	}
	
	public static Map<Entity, Set<Option>> lookUpEntitiesReferencedByOptions(
			ReqArchitectureVersion version, Collection<? extends Option> options) {
		Map<Entity, Set<Option>> results = new HashMap<Entity, Set<Option>>();
		
		for (Option option: options) {
			if (option instanceof PCM_IntroduceNewEntity) {
				for (Entity entity: ((PCM_IntroduceNewEntity) option).getEntities()) {
					MapUtil.putOrAddToMap(results, entity, option);
				}
			} else if (option instanceof PCM_ChangeEntity) {
				for (Entity entity: ((PCM_ChangeEntity) option).getOldEntities()) {
					MapUtil.putOrAddToMap(results, entity, option);
				}
			} else if (option instanceof PCM_RemoveEntity) {
				for (Entity entity: ((PCM_RemoveEntity) option).getEntities()) {
					MapUtil.putOrAddToMap(results, entity, option);
				}
			} 
		}
		
		return results;
	}

}
