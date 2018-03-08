package edu.kit.ipd.sdq.kamp4is.core;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToDataDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;

/**
 * The change propagation analysis of KAMP
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * - elements which were already part of a seed population are not further investigated
 * 
 * 
 * @author stammel
 *
 */
public class ISChangePropagationAnalysis  extends AbstractISChangePropagationAnalysis<ISArchitectureVersion, ISChangePropagationDueToDataDependencies> {
	
	@Override
	public void runChangePropagationAnalysis(ISArchitectureVersion version) {
		// I. DataType -> Signature -> Interface 
		this.setChangePropagationDueToDataDependencies(ISModificationmarksFactory.eINSTANCE.createISChangePropagationDueToDataDependencies());
		calculateAndMarkToInterfacePropagation(version);

		if (!this.getChangePropagationDueToDataDependencies().eContents().isEmpty()) {	
			version.getModificationMarkRepository().getChangePropagationSteps().add(this.getChangePropagationDueToDataDependencies());	
		}
		
		//All other steps
		this.calculateInterfaceAndComponentPropagation(version);	
	}

}
