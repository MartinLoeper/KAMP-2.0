package edu.kit.ipd.sdq.kamp4is.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Role;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.repository.SinkRole;

import de.uka.ipd.sdq.componentInternalDependencies.OperationToOperationDependency;
import de.uka.ipd.sdq.componentInternalDependencies.RoleToRoleDependency;
import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToInterfaceDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntercomponentPropagation;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISIntracomponentPropagation;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConnector;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;

/**
 * Abstract super class, parameterized to enable covariant attributes for different
 * kinds of propagation algorithms. Its also defines some sub-routines of the propagation 
 * algorithm, but not the algorithm itself.
 * 
 * @param S The type of the architecture version.
 * @param T The type of the ISChangePropagationDueToDataDependencies object.
 */
public abstract class AbstractISChangePropagationAnalysis<S extends ISArchitectureVersion, 
	T extends ISChangePropagationDueToDataDependencies> implements AbstractChangePropagationAnalysis<S> {
	
	private T changePropagationDueToDataDependencies;
	private Map<ProvidedRole, Set<Signature>> visitedProvidedRoles = 
			new HashMap<ProvidedRole, Set<Signature>>();
	
	/**
	 * Calculates the DataType -> Signature -> Interface propagation both for
	 * OperationInterfaces/OperationSignatures and EventGroups/EventTypes.
	 */
	protected void calculateAndMarkToInterfacePropagation(S version) {
		Collection<Signature> initialMarkedSignatures = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, Signature.class);
		Collection<DataType> initialMarkedDataTypes = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, DataType.class);
		
		Map<Interface, Set<Signature>> interfacesToBeMarked = ISArchitectureModelLookup.
				lookUpInterfacesAndSignaturesWithSignatures(version, initialMarkedSignatures);
		Map<Signature, Set<DataType>> signaturesToBeMarked = 
				new HashMap<Signature, Set<DataType>>();	
		ISArchitectureModelLookup.lookUpInterfacesAndSignaturesWithParametersOfTypes(version, 
				initialMarkedDataTypes, interfacesToBeMarked, signaturesToBeMarked);
		
		this.createAndAddInterfaceModifications(interfacesToBeMarked, signaturesToBeMarked,
				this.getChangePropagationDueToDataDependencies().getInterfaceModifications());
	}
	
	private void createAndAddInterfaceModifications(Map<Interface, Set<Signature>> 
			interfacesToBeMarked, Map<Signature, Set<DataType>> signaturesToBeMarked, 
			Collection<ISModifyInterface> targetCollection) {
		for (Map.Entry<Interface, Set<Signature>> interfaceToBeMarkedEntry : interfacesToBeMarked.entrySet()) {
			ISModifyInterface modifyInterface = ISModificationmarksFactory.eINSTANCE.createISModifyInterface();
			modifyInterface.setToolderived(true);
			modifyInterface.setAffectedElement(interfaceToBeMarkedEntry.getKey());
			modifyInterface.getCausingElements().addAll(interfaceToBeMarkedEntry.getValue());
			
			for (Signature signature: interfaceToBeMarkedEntry.getValue()) {
				// Mark only those signatures which are not initially marked
				if (signaturesToBeMarked.containsKey(signature)) {
					ISModifySignature modifySignature = ISModificationmarksFactory.eINSTANCE.createISModifySignature();
					modifySignature.setToolderived(true);
					modifySignature.setAffectedElement(signature);
					modifySignature.getCausingElements().addAll(signaturesToBeMarked.get(signature));
					modifyInterface.getSignatureModifications().add(modifySignature);
				}
			}
			
			targetCollection.add(modifyInterface);
		}
	}
	
	/**
	 * Calculates Interface -> Component/ProvidedRole/RequiredRole/Signature, 
	 * inter-component and intra-component propagation.
	 */
	public void calculateInterfaceAndComponentPropagation(S version) {
		// ISChangePropagationDueToInterfaceDependencies
		ISChangePropagationDueToInterfaceDependencies cp = ISModificationmarksFactory.
				eINSTANCE.createISChangePropagationDueToInterfaceDependencies();
		// Interface -> Signature
		calculateAndMarkInterfaceToSignaturePropagation(version, cp);
		// Interface -> Component/ProvidedRole/RequiredRole
		calculateAndMarkInterfaceToComponentPropagation(version, cp);
		if (!cp.eContents().isEmpty()) {
			version.getModificationMarkRepository().getChangePropagationSteps().add(cp);
		}
		
		// Variables for inter- and intra-component propagation
		Map<RequiredRole, Map<ProvidedRole, Set<Signature>>> 
				requiredRolesToBeAnalysedInNextIteration = new HashMap<RequiredRole, 
						Map<ProvidedRole,Set<Signature>>>();
		Map<ProvidedRole, Set<Signature>> providedRolesToBeAnalysedInNextIteration =
					new HashMap<ProvidedRole, Set<Signature>>();
		
		// first iteration of intra-component propagation RequiredRoles -> ProvidedRoles
		Set<RequiredRole> initiallyMarkedRequiredRoles = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, RequiredRole.class);
		Map<RequiredRole, Set<Signature>> markedRequiredRolesWithCauses = 
				ISArchitectureModelLookup.lookUpMarkedRequiredSignaturesForRequiredRoles(
						initiallyMarkedRequiredRoles, version);
		providedRolesToBeAnalysedInNextIteration = calculateInitialIntraComponentPropagation(
				markedRequiredRolesWithCauses, version);	
		
		// Add ProvidedRoles with different causes (seed modification, Signature -> Role)
		Collection<ProvidedRole> initiallyMarkedProvidedRoles = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, ProvidedRole.class);
		Map<ProvidedRole, Set<Signature>> markedProvidedRolesWithCauses = 
				ISArchitectureModelLookup.lookUpMarkedProvidedSignaturesForProvidedRoles(
						initiallyMarkedProvidedRoles, version);
		MapUtil.putOrAddToMap(providedRolesToBeAnalysedInNextIteration, markedProvidedRolesWithCauses);
		
		// Inter- and intra-component propagation alternatively
		do {
			// ProvidedRoles -> AssemblyConnectors -> RequiredRoles
			requiredRolesToBeAnalysedInNextIteration = calculateInterComponentPropagation(providedRolesToBeAnalysedInNextIteration, version);		
			// RequiredRoles -> ComponentInternalDependencies -> ProvidedRoles
			providedRolesToBeAnalysedInNextIteration = calculateIntraComponentPropagation(requiredRolesToBeAnalysedInNextIteration, version);
		} while (!providedRolesToBeAnalysedInNextIteration.isEmpty());
	}
	
	/**
	 * Calculates the Interface -> Signature propagation. Signatures are only marked 
	 * if the Interface was marked as SeedModification, but not if it got a mark in a 
	 * previous step.
	 */
	protected void calculateAndMarkInterfaceToSignaturePropagation(S version, 
			ISChangePropagationDueToInterfaceDependencies changePropagation) {	
		Collection<Interface> seedInterfaces = ArchitectureModelLookup.
				lookUpMarkedObjectsOfATypeInSeedModifications(version, Interface.class);				
		Map<Signature, Interface> signaturesToBeMarked = ISArchitectureModelLookup.
				lookUpSignaturesWithInterfaces(seedInterfaces);
		
		for (Map.Entry<Signature, Interface> signatureToBeMarkedEntry : 
				signaturesToBeMarked.entrySet()) {
			ISModifySignature modifySignature = ISModificationmarksFactory.eINSTANCE.createISModifySignature();
			modifySignature.setToolderived(true);
			modifySignature.setAffectedElement(signatureToBeMarkedEntry.getKey());
			modifySignature.getCausingElements().add(signatureToBeMarkedEntry.getValue());
			changePropagation.getSignatureModifications().add(modifySignature);
		}
	}
	
	/**
	 * Calculates the Interface -> Component/ProvidedRole/RequiredRole propagation. 
	 * Supported sub-types of ProvidedRole are OperationProvidedRole and SinkRole. 
	 * Supported sub-types of RequiredRole are OperationRequiredRole and SourceRole. 
	 */
	protected void calculateAndMarkInterfaceToComponentPropagation(S version,
			ISChangePropagationDueToInterfaceDependencies changePropagation) {	
		Collection<Interface> initialMarkedInterfaces = ArchitectureModelLookup.
				lookUpMarkedObjectsOfAType(version, Interface.class);	
		Map<RepositoryComponent, Set<Role>> componentsToBeMarked = 
				new HashMap<RepositoryComponent, Set<Role>>();
		Map<ProvidedRole, Interface> providedRolesToBeMarked = 
				new HashMap<ProvidedRole, Interface>();
		Map<RequiredRole, Interface> requiredRolesToBeMarked = 
				new HashMap<RequiredRole, Interface>();
		
		ISArchitectureModelLookup.lookUpComponentsAndRolesWithInterfaces(version, 
				initialMarkedInterfaces, componentsToBeMarked, providedRolesToBeMarked,
				requiredRolesToBeMarked);		
		this.createAndAddComponentModifications(changePropagation, componentsToBeMarked, 
				providedRolesToBeMarked, requiredRolesToBeMarked);
	}

	private void createAndAddComponentModifications(ISChangePropagationDueToInterfaceDependencies changePropagation,
			Map<RepositoryComponent, Set<Role>> componentsToBeMarked,
			Map<ProvidedRole, Interface> providedRolesToBeMarked,
			Map<RequiredRole, Interface> requiredRolesToBeMarked) {
		for(Map.Entry<RepositoryComponent, Set<Role>> componentToBeMarkedEntry: 
				componentsToBeMarked.entrySet()) {
			ISModifyComponent modifyComponent = ISModificationmarksFactory.eINSTANCE.createISModifyComponent();
			modifyComponent.setToolderived(true);
			modifyComponent.setAffectedElement(componentToBeMarkedEntry.getKey());
			
			for (Role roleToBeMarked: componentToBeMarkedEntry.getValue()) {
				if (roleToBeMarked instanceof ProvidedRole && 
						providedRolesToBeMarked.containsKey(roleToBeMarked)) {
					ISModifyProvidedRole modifyProvidedRole = ISModificationmarksFactory.eINSTANCE.createISModifyProvidedRole();
					modifyProvidedRole.setToolderived(true);
					modifyProvidedRole.setAffectedElement((ProvidedRole)roleToBeMarked);
					modifyProvidedRole.getCausingElements().add(providedRolesToBeMarked.get(roleToBeMarked));
					modifyComponent.getProvidedRoleModifications().add(modifyProvidedRole);
					modifyComponent.getCausingElements().add(roleToBeMarked);
				} else if (roleToBeMarked instanceof RequiredRole &&
						requiredRolesToBeMarked.containsKey(roleToBeMarked)) {
					ISModifyRequiredRole modifyRequiredRole = ISModificationmarksFactory.eINSTANCE.createISModifyRequiredRole();
					modifyRequiredRole.setToolderived(true);
					modifyRequiredRole.setAffectedElement((RequiredRole)roleToBeMarked);
					modifyRequiredRole.getCausingElements().add(requiredRolesToBeMarked.get(roleToBeMarked));
					modifyComponent.getRequiredRoleModifications().add(modifyRequiredRole);
					modifyComponent.getCausingElements().add(roleToBeMarked);
				}
			}
			
			if(!modifyComponent.getCausingElements().isEmpty()) {
				changePropagation.getComponentModifications().add(modifyComponent);
			}
		}
	}

	/**
	 * Quite similar to {@link #calculateIntraComponentPropagation(Map, ISArchitectureVersion)}
	 * (see there for more information) with only statement different: the call to
	 * "calculateRoleToRoleDependencies". While the "usual" intra-component propagation
	 * is based on RequiredRoles that are connected to ProvidedRoles of the previous
	 * inter-component propagation step, the initial intra-component propagation
	 * step starts with RequiredRoles whose modifications are caused by Signature
	 * modifications of the ISChangePropagationDueToDataDependencies or the 
	 * SeedModifications (and as the algorithm considers causes for modifications
	 * and they affect the Operation2Operation propagation, there have to be two
	 * different methods for the intra-component propagation).
	 */
	public Map<ProvidedRole, Set<Signature>> calculateInitialIntraComponentPropagation(
			Map<RequiredRole, Set<Signature>> requiredRolesToBeAnalyzed, S version) {
		Map<ProvidedRole, Set<Signature>> providedRolesToBeAnalysedInNextStep = 
				new HashMap<ProvidedRole, Set<Signature>>();
		Map<RequiredRole, List<RoleToRoleDependency>> dependenciesToBeMarked = 
				ISArchitectureModelLookup.lookUpInternalDependenciesWithRequiredRoles(version, 
						requiredRolesToBeAnalyzed.keySet());
		ISIntracomponentPropagation intracomponentPropagation = ISModificationmarksFactory.
				eINSTANCE.createISIntracomponentPropagation();
		Map<RepositoryComponent, ISModifyComponent> componentsMarkedInThisStep = 
				new HashMap<RepositoryComponent, ISModifyComponent>();
		
		for (Entry<RequiredRole, List<RoleToRoleDependency>> dependenciesToBeMarkedEntry : 
				dependenciesToBeMarked.entrySet()) {	
			RequiredRole requiredRole = dependenciesToBeMarkedEntry.getKey();
			if (requiredRole.getRequiringEntity_RequiredRole() instanceof RepositoryComponent) {
				ISModifyComponent modifyComponent = this.createComponentModificationForRequiredRole(
						requiredRole, componentsMarkedInThisStep, intracomponentPropagation);		
				ISModifyRequiredRole modifyRequiredRole = this.createRequiredRoleModification(
						requiredRole, requiredRolesToBeAnalyzed.get(requiredRole));
				modifyComponent.getRequiredRoleModifications().add(modifyRequiredRole);	
				this.calculateRoleToRoleDependencies(dependenciesToBeMarkedEntry.getValue(), 
						modifyComponent, providedRolesToBeAnalysedInNextStep, ISArchitectureModelLookup.
						lookUpMarkedRequiredSignaturesForRequiredRoleModification(modifyRequiredRole));
			}
		}
		
		if (!intracomponentPropagation.getComponentModifications().isEmpty()) {
			version.getModificationMarkRepository().getChangePropagationSteps().
					add(intracomponentPropagation);		
		}		
		return providedRolesToBeAnalysedInNextStep;
	}
	
	/**
	 * Affected RequiredRoles + ComponentInternalDependencies => affected ProvidedRoles. 
	 * The dependencies are not only considered on a role-to-role level as in the 
	 * original KAMP, but also operation-to-operation. RequiredRoles can be visited 
	 * multiple times, so all OperationToOperationDependecies are considered. When 
	 * determining the ProvidedRoles for the next propagation step (inter-component), 
	 * only those that have not been analyzed before or whose signatures got a new 
	 * modification mark are considered, so the algorithm terminates. If there are
	 * no new ProvidedRoles dependent on the RequiredRoles of a Component or there 
	 * are no new Signatures to be marked for already analyzed ProvidedRoles, an 
	 * IntraComponentPropagation element only containing one or multiple marked 
	 * RequiredRole(s) is created.
	 *
	 * @param requiredRolesToBeAnalyzed The RequiredRoles affected because of the 
	 * last inter-component propagation step. The parameter also stores the causing
	 * ProvidedRoles and even the signatures that were relevant in the last 
	 * propagation step.
	 * @return The ProvidedRoles detected in this propagation step together with the
	 * Signatures that caused the propagation.
	 */
	public Map<ProvidedRole, Set<Signature>> calculateIntraComponentPropagation(
			Map<RequiredRole, Map<ProvidedRole, Set<Signature>>> 
			requiredRolesToBeAnalyzed, S version) {
		Map<ProvidedRole, Set<Signature>> providedRolesToBeAnalysedInNextStep = 
				new HashMap<ProvidedRole, Set<Signature>>();
		Map<RequiredRole, List<RoleToRoleDependency>> dependenciesToBeMarked = 
				ISArchitectureModelLookup.lookUpInternalDependenciesWithRequiredRoles(version, 
						requiredRolesToBeAnalyzed.keySet());
		ISIntracomponentPropagation intracomponentPropagation = ISModificationmarksFactory.
				eINSTANCE.createISIntracomponentPropagation();
		Map<RepositoryComponent, ISModifyComponent> componentsMarkedInThisStep = 
				new HashMap<RepositoryComponent, ISModifyComponent>();
		
		for (Entry<RequiredRole, List<RoleToRoleDependency>> dependenciesToBeMarkedEntry : 
				dependenciesToBeMarked.entrySet()) {	
			RequiredRole requiredRole = dependenciesToBeMarkedEntry.getKey();
			if (requiredRole.getRequiringEntity_RequiredRole() instanceof RepositoryComponent) {
				ISModifyComponent modifyComponent = this.createComponentModificationForRequiredRole(
						requiredRole, componentsMarkedInThisStep, intracomponentPropagation);
				ISModifyRequiredRole modifyRequiredRole = this.createRequiredRoleModification(
						requiredRole, requiredRolesToBeAnalyzed.get(requiredRole));
				modifyComponent.getRequiredRoleModifications().add(modifyRequiredRole);
				this.calculateRoleToRoleDependencies(dependenciesToBeMarkedEntry.getValue(), 
						modifyComponent, providedRolesToBeAnalysedInNextStep, ISArchitectureModelLookup.
						lookUpMarkedRequiredSignaturesForRequiredRoleModification(modifyRequiredRole));
			}
		}
		
		if (!intracomponentPropagation.getComponentModifications().isEmpty()) {
			version.getModificationMarkRepository().getChangePropagationSteps().
					add(intracomponentPropagation);		
		}		
		return providedRolesToBeAnalysedInNextStep;
	}
	
	private ISModifyComponent createComponentModificationForRequiredRole(
			RequiredRole requiredRole, Map<RepositoryComponent, ISModifyComponent> 
			componentsMarkedInThisStep, ISIntracomponentPropagation intracomponentPropagation) {
		ISModifyComponent result = null;
		RepositoryComponent component = (RepositoryComponent) requiredRole.
				getRequiringEntity_RequiredRole();
		result = componentsMarkedInThisStep.get(component);		
		if (result == null) { // first time that RequiredRole 		
			result = ISModificationmarksFactory.eINSTANCE.createISModifyComponent();
			result.setToolderived(true);
			result.setAffectedElement(component);
			result.getCausingElements().add(requiredRole);			
			componentsMarkedInThisStep.put(component, result);
			intracomponentPropagation.getComponentModifications().add(result);
		} else {
			result.getCausingElements().add(requiredRole);
		}
	
		return result;
	}

	/**
	 * Creates a RequiredRole modification for the first intra-component propagation
	 * (marked Signatures from ChangePropagationDueToDataDependecies or 
	 * SeedModifications as causes).
	 */
	private ISModifyRequiredRole createRequiredRoleModification(RequiredRole requiredRole, 
			Set<? extends Signature> causingSignatures) {				
		ISModifyRequiredRole modifyRequiredRole = ISModificationmarksFactory.
				eINSTANCE.createISModifyRequiredRole();
		modifyRequiredRole.setToolderived(true);
		modifyRequiredRole.setAffectedElement(requiredRole);
		modifyRequiredRole.getCausingElements().addAll(causingSignatures);
		
		for(Signature causingSignature: causingSignatures) {
			ISModifySignature modifySignature = ISModificationmarksFactory.
					eINSTANCE.createISModifySignature();
			modifySignature.setToolderived(true);
			modifySignature.setAffectedElement(causingSignature);
			modifySignature.getCausingElements().add(causingSignature);
			modifyRequiredRole.getSignatureModifications().add(modifySignature);
		}	
		return modifyRequiredRole;
	}
	
	/**
	 * Creates a RequiredRole modification for the second, third etc. intra-component 
	 * propagation. Cause for the modification are marked ProvidedRoles from the last 
	 * inter-component propagation step. The different ProvidedRoles should all have 
	 * the same Interface as the RequiredRole, but the Signatures relevant for the 
	 * propagation might be different (possible duplicates are resolved).
	 */
	private ISModifyRequiredRole createRequiredRoleModification(RequiredRole requiredRole, 
			Map<ProvidedRole, Set<Signature>> causingProvidedRoles) {
		Map<Signature, ISModifySignature> markedSignatures = 
				new HashMap<Signature, ISModifySignature>();
		ISModifyRequiredRole modifyRequiredRole = ISModificationmarksFactory.
				eINSTANCE.createISModifyRequiredRole();
		modifyRequiredRole.setToolderived(true);
		modifyRequiredRole.setAffectedElement(requiredRole);
		
		for(Map.Entry<ProvidedRole, Set<Signature>> providedRolesEntry: 
			causingProvidedRoles.entrySet()) {
			modifyRequiredRole.getCausingElements().add(providedRolesEntry.getKey());
			for (Signature signatureToBeMarked: providedRolesEntry.getValue()) {
				// Only one modification mark per Signature per RequiredRole, even 
				// if it is marked for multiple causing ProvidedRoles
				if (!markedSignatures.containsKey(signatureToBeMarked)) {
					ISModifySignature modifySignature = ISModificationmarksFactory.
							eINSTANCE.createISModifySignature();
					modifySignature.setToolderived(true);
					modifySignature.setAffectedElement(signatureToBeMarked);
					modifyRequiredRole.getSignatureModifications().add(modifySignature);
					markedSignatures.put(signatureToBeMarked, modifySignature);
				}
				markedSignatures.get(signatureToBeMarked).getCausingElements().
						add(providedRolesEntry.getKey());
			}
		}	
		return modifyRequiredRole;
	}
	
	/**
	 * Calculates the propagation from role to role based on {@link RoleToRoleDependency}s. 
	 * All ProvidedRoles from the passed <code>dependencies</code> will be marked. 
	 * The {@link OperationToOperationDependency}s provide details: If at least 
	 * one OperationSignature of the RequiredRole is marked, the dependent 
	 * OperationSignatures of the ProvidedRole are added as children to 
	 * ISModifyProvidedRole. The method also looks for existing ProvidedRole 
	 * modifications and Signature modifications, so no duplicates are created. 
	 * If a ProvidedRole has been visited for the first time and/or a new 
	 * Signature modification has been found (using the OperationToOperationDependencies), 
	 * the ProvidedRole will be analyzed in the next step (inter-component propagation).
	 */
	protected void calculateRoleToRoleDependencies(Iterable<RoleToRoleDependency> dependencies, 
			ISModifyComponent modifyComponent, Map<ProvidedRole, Set<Signature>> 
			providedRolesToBeAnalysedInNextStep, Collection<Signature> markedSignatures) {
		for (RoleToRoleDependency r2rDependency: dependencies) {
			if (r2rDependency.getProvidedRole() instanceof OperationProvidedRole) {
				ISModifyProvidedRole modifyProvidedRole = ISArchitectureModelLookup.
						lookUpMarkedProvidedRoleForDependency(modifyComponent, r2rDependency);
				boolean newRoleMarked = false;
				if (modifyProvidedRole == null) {
					modifyProvidedRole = ISModificationmarksFactory.eINSTANCE.createISModifyProvidedRole();
					modifyProvidedRole.setToolderived(true);
					modifyProvidedRole.setAffectedElement(r2rDependency.getProvidedRole());
					newRoleMarked = true;
				}
				modifyProvidedRole.getCausingElements().add(r2rDependency.getRequiredRole());
				
				boolean newSignatureMarked = this.calculateOperationToOperationDependencies(r2rDependency, 
						markedSignatures, modifyProvidedRole);
				if (newRoleMarked && (newSignatureMarked || !this.getVisitedProvidedRoles().containsKey(
						r2rDependency.getProvidedRole()))) {
					modifyComponent.getProvidedRoleModifications().add(modifyProvidedRole);
				}
				if (newSignatureMarked) {
					//Role might be visited again, but new signature dependencies utilized
					Set<Signature> signaturesToBeAnalysed = new HashSet<Signature>();
					for (ISModifySignature signatureModification: modifyProvidedRole.getSignatureModifications()) {
						signaturesToBeAnalysed.add(signatureModification.getAffectedElement());
					}
					MapUtil.putOrAddToMap(providedRolesToBeAnalysedInNextStep, (OperationProvidedRole) 
							r2rDependency.getProvidedRole(), signaturesToBeAnalysed);
				} else if (!this.getVisitedProvidedRoles().containsKey(r2rDependency.getProvidedRole())) {
					//Role visited for first time, but no signature dependencies
					this.getVisitedProvidedRoles().put(r2rDependency.getProvidedRole(), 
							new HashSet<Signature>());
				}
			}else if (r2rDependency.getProvidedRole() instanceof SinkRole){
				ISModifyProvidedRole modifyProvidedRole = ISArchitectureModelLookup.
						lookUpMarkedProvidedRoleForDependency(modifyComponent, r2rDependency);
				boolean newRoleMarked = false;
				if (modifyProvidedRole == null) {
					modifyProvidedRole = ISModificationmarksFactory.eINSTANCE.createISModifyProvidedRole();
					modifyProvidedRole.setToolderived(true);
					modifyProvidedRole.setAffectedElement(r2rDependency.getProvidedRole());
					newRoleMarked = true;
				}
				modifyProvidedRole.getCausingElements().add(r2rDependency.getRequiredRole());
				
				boolean newSignatureMarked = this.calculateOperationToOperationDependencies(r2rDependency, 
						markedSignatures, modifyProvidedRole);
				if (newRoleMarked && (newSignatureMarked || !this.getVisitedProvidedRoles().containsKey(
						r2rDependency.getProvidedRole()))) {
					modifyComponent.getProvidedRoleModifications().add(modifyProvidedRole);
				}
				if (newSignatureMarked) {
					//Role might be visited again, but new signature dependencies utilized
					Set<Signature> signaturesToBeAnalysed = new HashSet<Signature>();
					for (ISModifySignature signatureModification: modifyProvidedRole.getSignatureModifications()) {
						signaturesToBeAnalysed.add(signatureModification.getAffectedElement());
					}
					MapUtil.putOrAddToMap(providedRolesToBeAnalysedInNextStep, (SinkRole) 
							r2rDependency.getProvidedRole(), signaturesToBeAnalysed);
				} else if (!this.getVisitedProvidedRoles().containsKey(r2rDependency.getProvidedRole())) {
					//Role visited for first time, but no signature dependencies
					this.getVisitedProvidedRoles().put(r2rDependency.getProvidedRole(), 
							new HashSet<Signature>());
				}
			}		
		}
	}
	
	/**
	 * Checks the OperationToOperationDependencies of the <code>r2rDependency</code>. If at least 
	 * one signature on the required side of an OperationToOperationDependency is marked, all the
	 * signatures on the provided side will be marked, too (and added to <code>modifyProvidedRole</code>).
	 * Already marked signatures of the provided role modification are not marked a second time, but
	 * additional causes for the modification are added.
	 *
	 * @return Have new signature modifications been added.
	 */
	protected boolean calculateOperationToOperationDependencies(RoleToRoleDependency r2rDependency,
			Collection<Signature> markedSignatures, ISModifyProvidedRole modifyProvidedRole) {
		boolean newSignatureMarked = false;
		
		for (OperationToOperationDependency o2oDependency: r2rDependency.getOperationToOperationDependency()) {
			List<Signature> markedRequiredSignatures = new LinkedList<Signature>(
					o2oDependency.getRequiredSignatures());
			markedRequiredSignatures.retainAll(markedSignatures);
			
			if (!markedRequiredSignatures.isEmpty()) {
				for (Signature providedSignatureToBeMarked: o2oDependency.getProvidedSignatures()) {
					ISModifySignature modifyProvidedSignature = ISArchitectureModelLookup.
							lookUpProvidedSignatureMarkForRoleModification(providedSignatureToBeMarked, 
									modifyProvidedRole);
					if (modifyProvidedSignature == null) {
						modifyProvidedSignature = ISModificationmarksFactory.eINSTANCE.
								createISModifySignature();
						modifyProvidedSignature.setToolderived(true);
						modifyProvidedSignature.setAffectedElement(providedSignatureToBeMarked);
						modifyProvidedRole.getSignatureModifications().add(modifyProvidedSignature);
						
						if (!this.getVisitedProvidedRoles().containsKey(modifyProvidedRole.getAffectedElement()) ||
								!this.getVisitedProvidedRoles().get(modifyProvidedRole.getAffectedElement()).
									contains(providedSignatureToBeMarked)) {
							MapUtil.putOrAddToMap(this.getVisitedProvidedRoles(), modifyProvidedRole.
									getAffectedElement(), providedSignatureToBeMarked);
							newSignatureMarked = true;
						}
					}
					for (Signature requiredSignature: markedRequiredSignatures) {
						if (!modifyProvidedSignature.getCausingElements().contains(requiredSignature)) {
							modifyProvidedSignature.getCausingElements().add(requiredSignature);
						}
					}
				}
			}					
		}
		
		return newSignatureMarked;
	}
	
	/**
	 * Affected ProvidedRoles + connectors => affected RequiredRoles of dependent components. 
	 * RequiredRoles can visited multiple times (also the already marked ones are analyzed in 
	 * the next iteration), so all OperationToOperationDependecies can be utilized. Be aware 
	 * that only the connectors are marked in this step, the RequiredRoles
	 * and affected Signatures will be marked in the intra-component propagation.
	 */
	public Map<RequiredRole, Map<ProvidedRole, Set<Signature>>> calculateInterComponentPropagation(
			Map<ProvidedRole, Set<Signature>> newProvidedRolesMarked, S version) {
		Map<RequiredRole, Map<ProvidedRole, Set<Signature>>> 
				requiredRolesToBeAnalysedInNextStep = new HashMap<RequiredRole, 
				Map<ProvidedRole,Set<Signature>>>();
		ISIntercomponentPropagation intercomponentPropagation = ISModificationmarksFactory.
				eINSTANCE.createISIntercomponentPropagation();
		
		for (Map.Entry<ProvidedRole, Set<Signature>> providedRoleEntry: 
				newProvidedRolesMarked.entrySet()) {
			List<AssemblyConnector> assemblyConnectors = ISArchitectureModelLookup.
					lookUpAssemblyConnectorsAttachedToProvidedRole(version, providedRoleEntry.getKey());			
			for (AssemblyConnector assemblyConnector : assemblyConnectors) {				
				this.createAndAddAssemblyConnectorModification(version, assemblyConnector, 
						intercomponentPropagation);
			}
			for (RequiredRole requiredRole: ISArchitectureModelLookup.
					lookUpRequiredRolesForAssemblyConnectors(assemblyConnectors)) {
				if (requiredRolesToBeAnalysedInNextStep.containsKey(requiredRole)) {
					// Add ProvidedRole as additional cause
					MapUtil.putOrAddToMap(requiredRolesToBeAnalysedInNextStep.get(requiredRole), 
							providedRoleEntry.getKey(), providedRoleEntry.getValue());
				} else {
					Map<ProvidedRole, Set<Signature>> causingProvidedRole = 
							new HashMap<ProvidedRole, Set<Signature>>();
					causingProvidedRole.put(providedRoleEntry.getKey(), providedRoleEntry.getValue());
					requiredRolesToBeAnalysedInNextStep.put(requiredRole, causingProvidedRole);
				}
			}		
		}
		
		if (!intercomponentPropagation.getConnectorModifications().isEmpty()) {
			version.getModificationMarkRepository().getChangePropagationSteps().add(intercomponentPropagation);
		}	
		return requiredRolesToBeAnalysedInNextStep;
	}
	
	private void createAndAddAssemblyConnectorModification(S version, 
			AssemblyConnector assemblyConnector, ISIntercomponentPropagation intercomponentPropagation) {	
		ISModifyConnector modifyAssemblyConnector = ISModificationmarksFactory.eINSTANCE.createISModifyConnector();
		modifyAssemblyConnector.setAffectedElement(assemblyConnector);
		modifyAssemblyConnector.setToolderived(true);
		modifyAssemblyConnector.getCausingElements().add(assemblyConnector.
				getProvidedRole_AssemblyConnector());
		intercomponentPropagation.getConnectorModifications().add(modifyAssemblyConnector);
	}
	
	protected T getChangePropagationDueToDataDependencies() {
		return changePropagationDueToDataDependencies;
	}

	protected void setChangePropagationDueToDataDependencies(T changePropagationDueToDataDependencies) {
		this.changePropagationDueToDataDependencies = changePropagationDueToDataDependencies;
	}

	protected Map<ProvidedRole, Set<Signature>> getVisitedProvidedRoles() {
		return visitedProvidedRoles;
	}

	protected void setVisitedProvidedRoles(Map<ProvidedRole, Set<Signature>> visitedProvidedRoles) {
		this.visitedProvidedRoles = visitedProvidedRoles;
	}
	
}
