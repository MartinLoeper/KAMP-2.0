package edu.kit.ipd.sdq.kamp4is.core;

import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.Signature;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISTestCase;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;

public enum ISActivityElementType implements AbstractActivityElementType {
	// PCM-related
	CONNECTOR(Connector.class),
	COMPONENT(RepositoryComponent.class),
	COMPOSITEDATATYPE(CompositeDataType.class),
	COLLECTIONDATATYPE(CollectionDataType.class),
	DATATYPE(DataType.class),
	INTERFACE(Interface.class), 
	PROVIDEDROLE(ProvidedRole.class),
	REQUIREDROLE(RequiredRole.class),
	SIGNATURE(Signature.class),
	// PCM-related sub-activity
	COMPOSITEDATATYPE_INNERDECLARATION(InnerDeclaration.class),
	PROVIDEDOPERATION(Signature.class),
	REQUIREDOPERATION(Signature.class),
	// annotation-related
	SOURCECODEFILES(ISSourceFile.class),
	METADATAFILES(ISMetadataFile.class),
	BUILDCONFIGURATION(ISBuildConfiguration.class),
	TESTCASE(ISTestCase.class), 
	RELEASECONFIGURATION(ISReleaseConfiguration.class),
	DEPLOYMENTCONFIGURATION(ISDeploymentSpecification.class);
	
	private final Class<?> clazz;
	private final String name;
	
	private ISActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public static ISActivityElementType[] topLevelPCMActivityElementTypes() {
		return new ISActivityElementType[]{CONNECTOR, COMPONENT, COMPOSITEDATATYPE,
				COLLECTIONDATATYPE, DATATYPE, INTERFACE, PROVIDEDROLE, 
				REQUIREDROLE, SIGNATURE};
	}
}
