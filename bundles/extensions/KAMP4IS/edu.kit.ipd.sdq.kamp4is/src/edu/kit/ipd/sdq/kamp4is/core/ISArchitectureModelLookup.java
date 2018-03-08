package edu.kit.ipd.sdq.kamp4is.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.EventGroup;
import org.palladiosimulator.pcm.repository.EventType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;
import edu.kit.ipd.sdq.kamp.util.MapUtil;

public class ISArchitectureModelLookup {

	public static List<AssemblyConnector> lookUpAssemblyConnectorsAttachedToProvidedRole(ISArchitectureVersion version,
			ProvidedRole providedRole) {
		List<AssemblyConnector> assemblyConnectors = new ArrayList<AssemblyConnector>();
		RepositoryComponent component = (RepositoryComponent) providedRole.getProvidingEntity_ProvidedRole();
		List<AssemblyContext> assemblyContexts = lookUpAssemblyContextsForRepositoryComponent(version, component);

		for (AssemblyContext assemblycontext : assemblyContexts) {
			for (Connector connector : assemblycontext.getParentStructure__AssemblyContext()
					.getConnectors__ComposedStructure()) {
				if (connector instanceof AssemblyConnector) {
					if (((AssemblyConnector) connector).getProvidedRole_AssemblyConnector() == providedRole)
						assemblyConnectors.add((AssemblyConnector) connector);
				}
			}
		}

		return assemblyConnectors;
	}

	public static List<AssemblyContext> lookUpAssemblyContextsForRepositoryComponent(ISArchitectureVersion version,
			RepositoryComponent component) {
		List<AssemblyContext> assemblyContexts = new ArrayList<AssemblyContext>();

		for (AssemblyContext assemblyContext : version.getSystem().getAssemblyContexts__ComposedStructure()) {
			if (assemblyContext.getEncapsulatedComponent__AssemblyContext() == component)
				assemblyContexts.add(assemblyContext);
		}

		assemblyContexts.addAll(lookUpAssemblyContextsInCompositeComponents(version, component));

		return assemblyContexts;
	}

	public static List<CompositeComponent> lookUpCompositeComponents(ISArchitectureVersion version) {
		List<CompositeComponent> compositeComponents = new ArrayList<CompositeComponent>();

		for (RepositoryComponent component : version.getRepository().getComponents__Repository()) {
			if (component instanceof CompositeComponent) {
				compositeComponents.add((CompositeComponent) component);
			}
		}

		return compositeComponents;
	}

	public static List<OperationRequiredRole> lookUpRequiredRolesForAssemblyConnectors(
			List<AssemblyConnector> assemblyConnectors) {
		List<OperationRequiredRole> results = new ArrayList<OperationRequiredRole>();

		for (AssemblyConnector assemblyConnector : assemblyConnectors) {
			results.add(assemblyConnector.getRequiredRole_AssemblyConnector());
		}

		return results;
	}

	private static List<AssemblyContext> lookUpAssemblyContextsInCompositeComponents(ISArchitectureVersion version,
			RepositoryComponent component) {
		List<AssemblyContext> assemblyContexts = new ArrayList<AssemblyContext>();

		List<CompositeComponent> compositeComponents = lookUpCompositeComponents(version);

		for (CompositeComponent compositeComponent : compositeComponents) {
			for (AssemblyContext assemblyContext : compositeComponent.getAssemblyContexts__ComposedStructure()) {
				if (assemblyContext.getEncapsulatedComponent__AssemblyContext() == component)
					assemblyContexts.add(assemblyContext);
			}
		}

		return assemblyContexts;
	}

	public static Map<Signature, Interface> lookUpSignaturesWithInterfaces(Collection<Interface> interfaces) {
		Map<Signature, Interface> results = new HashMap<Signature, Interface>();

		for (Interface interfac : interfaces) {
			if (interfac instanceof OperationInterface) {
				for (Signature signature : ((OperationInterface) interfac).getSignatures__OperationInterface()) {
					results.put(signature, interfac);
				}
			} else if (interfac instanceof EventGroup) {
				for (Signature signature : ((EventGroup) interfac).getEventTypes__EventGroup()) {
					results.put(signature, interfac);
				}
			}
		}

		return results;
	}

	/**
	 * Finds
	 * <ul>
	 * <li>OperationInterfaces whose OperationSignatures have a parameter or
	 * return type contained in the passed <code>dataTypes</code> collection.
	 * </li>
	 * <li>EventGroups whose EventTypes have a parameter contained in the passed
	 * <code>dataTypes</code> collection.</li>
	 * </ul>
	 * <code>affectedInterfaces</code> and <code>affectedSignatures</code> both
	 * act as a kind of return type (yes, that's a horrible programming style,
	 * but allows performing one model traversal less).
	 */
	public static void lookUpInterfacesAndSignaturesWithParametersOfTypes(ISArchitectureVersion version,
			Collection<DataType> dataTypes, Map<Interface, Set<Signature>> affectedInterfaces,
			Map<Signature, Set<DataType>> affectedSignatures) {
		for (Interface interfac : version.getRepository().getInterfaces__Repository()) {
			for (DataType dataType : dataTypes) {
				if (interfac instanceof OperationInterface) {
					OperationInterface operationInterface = (OperationInterface) interfac;
					for (OperationSignature signature : operationInterface.getSignatures__OperationInterface()) {
						checkSignatureForDatatype(signature, operationInterface, dataType, affectedInterfaces,
								affectedSignatures);
					}
				} else if (interfac instanceof EventGroup) {
					EventGroup eventGroup = (EventGroup) interfac;
					for (EventType signature : eventGroup.getEventTypes__EventGroup()) {
						if (signature.getParameter__EventType() != null) {
							checkDataTypeForDataType(signature.getParameter__EventType().getDataType__Parameter(),
									signature, interfac, dataType, affectedInterfaces, affectedSignatures);
						}
					}
				}
			}
		}
	}

	protected static void checkSignatureForDatatype(OperationSignature signature, OperationInterface interfac,
			DataType dataType, Map<Interface, Set<Signature>> affectedInterfaces,
			Map<Signature, Set<DataType>> affectedSignatures) {
		for (Parameter parameter : signature.getParameters__OperationSignature()) {
			checkDataTypeForDataType(parameter.getDataType__Parameter(), signature, interfac, dataType,
					affectedInterfaces, affectedSignatures);
		}
		checkDataTypeForDataType(signature.getReturnType__OperationSignature(), signature, interfac, dataType,
				affectedInterfaces, affectedSignatures);
	}

	protected static void checkDataTypeForDataType(DataType typeToCheck, Signature signature, Interface interfac,
			DataType targetType, Map<Interface, Set<Signature>> affectedInterfaces,
			Map<Signature, Set<DataType>> affectedSignatures) {
		if (targetType != null && targetType.equals(typeToCheck)) {
			MapUtil.putOrAddToMap(affectedSignatures, signature, targetType);
			MapUtil.putOrAddToMap(affectedInterfaces, interfac, signature);
		}
	}

	/**
	 * Finds
	 * <ul>
	 * <li>OperationInterfaces whose OperationSignatures contain at least one of
	 * the passed <code>signatures</code>.</li>
	 * <li>EventGroups whose EventTypes contain at least one of the passed
	 * <code>signatures</code>.</li>
	 * </ul>
	 */
	public static Map<Interface, Set<Signature>> lookUpInterfacesAndSignaturesWithSignatures(
			ISArchitectureVersion version, Collection<Signature> signatures) {
		Map<Interface, Set<Signature>> results = new HashMap<>();

		for (Interface interfac : version.getRepository().getInterfaces__Repository()) {
			Set<Signature> matchingSignatures = new HashSet<Signature>(signatures);
			if (interfac instanceof OperationInterface) {
				OperationInterface operationInterface = (OperationInterface) interfac;
				matchingSignatures.retainAll(operationInterface.getSignatures__OperationInterface());
				MapUtil.putOrAddToMap(results, operationInterface, matchingSignatures);
			} else if (interfac instanceof EventGroup) {
				EventGroup eventGroup = (EventGroup) interfac;
				matchingSignatures.retainAll(eventGroup.getEventTypes__EventGroup());
				MapUtil.putOrAddToMap(results, eventGroup, matchingSignatures);
			}
		}

		return results;
	}

	/**
	 * Finds components and their roles which have an interface contained in the
	 * <code>interfaces</code> collection. The method used the parameters
	 * <code>affectedComponents</code>, <code>affectedProvidedRoles</code> and
	 * <code>affectedRequiredRoles</code> as return types,
	 */
	public static void lookUpComponentsAndRolesWithInterfaces(ISArchitectureVersion version,
			Collection<Interface> interfaces, Map<RepositoryComponent, Set<Role>> affectedComponents,
			Map<ProvidedRole, Interface> affectedProvidedRoles, Map<RequiredRole, Interface> affectedRequiredRoles) {
		for (RepositoryComponent component : version.getRepository().getComponents__Repository()) {
			for (Interface interfac : interfaces) {
				for (ProvidedRole providedRole : component.getProvidedRoles_InterfaceProvidingEntity()) {
					if ((providedRole instanceof OperationProvidedRole && interfac.equals(
							((OperationProvidedRole) providedRole).getProvidedInterface__OperationProvidedRole()))
							|| (providedRole instanceof SinkRole
									&& interfac.equals(((SinkRole) providedRole).getEventGroup__SinkRole()))) {
						MapUtil.putOrAddToMap(affectedComponents, component, providedRole);
						affectedProvidedRoles.put(providedRole, interfac);
					}
				}
				for (RequiredRole requiredRole : component.getRequiredRoles_InterfaceRequiringEntity()) {
					if ((requiredRole instanceof OperationRequiredRole && interfac.equals(
							((OperationRequiredRole) requiredRole).getRequiredInterface__OperationRequiredRole()))
							|| (requiredRole instanceof SourceRole
									&& interfac.equals(((SourceRole) requiredRole).getEventGroup__SourceRole()))) {
						MapUtil.putOrAddToMap(affectedComponents, component, requiredRole);
						affectedRequiredRoles.put(requiredRole, interfac);
					}
				}
			}
		}
	}

	public static Map<ProvidedRole, Set<Signature>> lookUpMarkedProvidedSignaturesForProvidedRoles(
			Collection<ProvidedRole> providedRoles, ISArchitectureVersion version) {
		Map<ProvidedRole, Set<Signature>> results = new HashMap<ProvidedRole, Set<Signature>>();

		Set<Signature> markedSignatures = ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version,
				Signature.class);
		for (ProvidedRole providedRole : providedRoles) {
			if (providedRole instanceof OperationProvidedRole) {
				Set<Signature> providedSignatures = new HashSet<Signature>(((OperationProvidedRole) providedRole)
						.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface());
				providedSignatures.retainAll(markedSignatures);
				results.put(providedRole, providedSignatures);
			} else if (providedRole instanceof SinkRole) {
				Set<Signature> providedSignatures = new HashSet<Signature>(
						((SinkRole) providedRole).getEventGroup__SinkRole().getEventTypes__EventGroup());
				providedSignatures.retainAll(markedSignatures);
				results.put(providedRole, providedSignatures);
			}
		}

		return results;
	}

	public static ISModifySignature lookUpProvidedSignatureMarkForRoleModification(Signature signature,
			ISModifyProvidedRole modifyProvidedRole) {
		for (ISModifySignature modifySignature : modifyProvidedRole.getSignatureModifications()) {
			if (signature.equals(modifySignature.getAffectedElement())) {
				return modifySignature;
			}
		}
		return null;
	}

	public static Map<RequiredRole, Set<Signature>> lookUpMarkedRequiredSignaturesForRequiredRoles(
			Collection<RequiredRole> requiredRoles, ISArchitectureVersion version) {
		Map<RequiredRole, Set<Signature>> results = new HashMap<RequiredRole, Set<Signature>>();

		Set<Signature> markedSignatures = ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version,
				Signature.class);
		for (RequiredRole requiredRole : requiredRoles) {
			if (requiredRole instanceof OperationRequiredRole) {
				Set<Signature> requiredSignatures = new HashSet<Signature>(((OperationRequiredRole) requiredRole)
						.getRequiredInterface__OperationRequiredRole().getSignatures__OperationInterface());
				requiredSignatures.retainAll(markedSignatures);
				results.put(requiredRole, requiredSignatures);
			} else if (requiredRole instanceof SourceRole) {
				Set<Signature> requiredSignatures = new HashSet<Signature>(
						((SourceRole) requiredRole).getEventGroup__SourceRole().getEventTypes__EventGroup());
				requiredSignatures.retainAll(markedSignatures);
				results.put(requiredRole, requiredSignatures);
			}
		}

		return results;
	}

	public static Set<Signature> lookUpMarkedRequiredSignaturesForRequiredRoleModification(
			ISModifyRequiredRole modifyRequiredRole) {
		Set<Signature> requiredSignatures = new HashSet<Signature>();
		for (ISModifySignature modifySignature : modifyRequiredRole.getSignatureModifications()) {
			requiredSignatures.add(modifySignature.getAffectedElement());
		}
		return requiredSignatures;
	}

	public static Map<RequiredRole, List<RoleToRoleDependency>> lookUpInternalDependenciesWithRequiredRoles(
			ISArchitectureVersion version, Collection<RequiredRole> requiredRoles) {
		Map<RequiredRole, List<RoleToRoleDependency>> results = new HashMap<RequiredRole, List<RoleToRoleDependency>>();

		if (version.getComponentInternalDependencyRepository() != null) {
			for (RoleToRoleDependency dependency : version.getComponentInternalDependencyRepository()
					.getDependencies()) {
				if (requiredRoles.contains(dependency.getRequiredRole())) {
					if (!results.containsKey(dependency.getRequiredRole())) {
						results.put(dependency.getRequiredRole(), new LinkedList<RoleToRoleDependency>());
					}
					results.get(dependency.getRequiredRole()).add(dependency);
				}
			}
		}

		return results;
	}

	public static ISModifyProvidedRole lookUpMarkedProvidedRoleForDependency(ISModifyComponent modifyComponent,
			RoleToRoleDependency roleToRoleDependency) {
		for (ISModifyProvidedRole modifyProvidedRole : modifyComponent.getProvidedRoleModifications()) {
			if (modifyProvidedRole.getAffectedElement().equals(roleToRoleDependency.getProvidedRole())) {
				return modifyProvidedRole;
			}
		}
		return null;
	}

}
