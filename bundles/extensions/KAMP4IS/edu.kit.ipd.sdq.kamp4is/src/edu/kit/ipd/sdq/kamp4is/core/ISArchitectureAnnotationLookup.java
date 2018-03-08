package edu.kit.ipd.sdq.kamp4is.core;

import java.util.ArrayList;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISAcceptanceTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBuildConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISIntegrationTestCaseAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISMetadataFileAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISReleaseConfiguration;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISSourceFileAggregation;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISThirdPartyComponentOrLibrary;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCase;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISUnitTestCaseAggregation;

public class ISArchitectureAnnotationLookup {

	public static List<ISSourceFile> lookUpISSourceFilesForComponent(ISArchitectureVersion version, 
			RepositoryComponent component) {
		List<ISSourceFile> sourceFiles = new ArrayList<ISSourceFile>();
		
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (ISSourceFile sourceFile : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getSourceFiles()) {
				if (sourceFile.getComponent()==component) {
					sourceFiles.add(sourceFile);
				}
			}
		}
		
		return sourceFiles;
	}

	public static ISSourceFileAggregation lookUpSourceFileAggregationForComponent(ISArchitectureVersion version, 
			RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (ISSourceFileAggregation sourceFileAggregation : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getSourceFileAggregations()) {
				if (sourceFileAggregation.getComponent()==component) {
					return sourceFileAggregation;
				}
			}
		}
		
		return null;
	}
	
	public static List<ISMetadataFile> lookUpMetadataFilesForComponent(ISArchitectureVersion version, 
			RepositoryComponent component) {
		List<ISMetadataFile> metadataFiles = new ArrayList<ISMetadataFile>();
		
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (ISMetadataFile metadataFile : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getMetadataFiles()) {
				if (metadataFile.getComponent()==component) {
					metadataFiles.add(metadataFile);
				}
			}
		}
		
		return metadataFiles;
	}

	public static ISMetadataFileAggregation lookUpMetadataFileAggregationForComponent(ISArchitectureVersion version, 
			RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getDevelopmentArtefactSpecification() != null) {
			for (ISMetadataFileAggregation metadataFileAggregation : version.getFieldOfActivityRepository().
					getDevelopmentArtefactSpecification().getMetadataFileAggregations()) {
				if (metadataFileAggregation.getComponent()==component) {
					return metadataFileAggregation;
				}
			}
		}
		
		return null;
	}

	public static ISUnitTestCaseAggregation lookUpUnitTestAggregationForProvidedRole(
			ISArchitectureVersion version, ProvidedRole providedRole) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (ISUnitTestCaseAggregation testAggregation : version.getFieldOfActivityRepository().
					getTestSpecification().getUnitTestCaseAggregations()) {
				if (testAggregation.getProvidedrole()==providedRole) {
					return testAggregation;
				}
			}
		}
		
		return null;
	}

	public static List<ISUnitTestCase> lookUpUnitTestCasesForProvidedRole(
			ISArchitectureVersion version,ProvidedRole providedRole) {
		List<ISUnitTestCase> testCases = new ArrayList<ISUnitTestCase>();
		
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (ISUnitTestCase testcase : version.getFieldOfActivityRepository().
					getTestSpecification().getUnitTestCases()) {
				if (testcase.getProvidedrole()==providedRole) {
					testCases.add(testcase);
				}
			}
		}
		
		return testCases;
	}

	public static ISIntegrationTestCaseAggregation lookUpIntegrationTestAggregationForAssemblyConnector(
			ISArchitectureVersion version, AssemblyConnector assemblyConnector) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (ISIntegrationTestCaseAggregation testAggregation : version.getFieldOfActivityRepository().
					getTestSpecification().getIntegrationTestCaseAggregations()) {
				if (testAggregation.getAssemblyConnector()==assemblyConnector) {
					return testAggregation;
				}
			}
		}
		
		return null;
	}

	public static List<ISIntegrationTestCase> lookUpIntegrationTestCasesForAssemblyConnector(
			ISArchitectureVersion version, AssemblyConnector assemblyConnector) {
		List<ISIntegrationTestCase> testCases = new ArrayList<ISIntegrationTestCase>();
		
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (ISIntegrationTestCase testcase : version.getFieldOfActivityRepository().
					getTestSpecification().getIntegrationTestCases()) {
				if (testcase.getAssemblyConnector()==assemblyConnector) {
					testCases.add(testcase);
				}
			}
		}
		
		return testCases;
	}

	public static ISAcceptanceTestCaseAggregation lookUpAcceptanceTestAggregationForProvidedRole(
			ISArchitectureVersion version, ProvidedRole providedRole) {
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (ISAcceptanceTestCaseAggregation testAggregation : version.getFieldOfActivityRepository().
					getTestSpecification().getAcceptanceTestCaseAggregations()) {
				if (testAggregation.getProvidedrole()==providedRole) {
					return testAggregation;
				}
			}
		}
		
		return null;
	}

	public static List<ISAcceptanceTestCase> lookUpAcceptanceTestCasesForProvidedRole(
			ISArchitectureVersion version, ProvidedRole providedRole) {
		List<ISAcceptanceTestCase> testCases = new ArrayList<ISAcceptanceTestCase>();
		
		if (version.getFieldOfActivityRepository().getTestSpecification() != null) {
			for (ISAcceptanceTestCase testcase : version.getFieldOfActivityRepository().
					getTestSpecification().getAcceptanceTestCases()) {
				if (testcase.getProvidedrole()==providedRole) {
					testCases.add(testcase);
				}
			}
		}
		return testCases;
	}

	public static ISThirdPartyComponentOrLibrary lookUpThirdPartyOrLibraryAnnotationForComponent(
			ISArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getBuildSpecification() != null) {
			for (ISThirdPartyComponentOrLibrary annotation : version.getFieldOfActivityRepository().
					getBuildSpecification().getThirdPartyComponentOrLibraries()) {
				if (annotation.getComponent() == component) {
					return annotation;
				}
			}
		}
		
		return null;
	}

	public static ISBuildConfiguration lookUpBuildConfigurationForComponent(
			ISArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getBuildSpecification() != null) {
			for (ISBuildConfiguration annotation : version.getFieldOfActivityRepository().
					getBuildSpecification().getBuildConfigurations()) {
				if (annotation.getComponent().contains(component)) {
					return annotation;
				}
			}
		}
		
		return null;
	}

	public static ISReleaseConfiguration lookUpReleaseConfigurationForComponent(
			ISArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getReleaseSpecification() != null) {
			for (ISReleaseConfiguration annotation : version.getFieldOfActivityRepository().
					getReleaseSpecification().getReleaseConfigurations()) {
				if (annotation.getComponents().contains(component)) {
					return annotation;
				}
			}
		}
		
		return null;
	}

	public static ISRuntimeInstanceAggregation lookUpRuntimeInstanceAggregation(
			ISArchitectureVersion version, RepositoryComponent component) {
		if (version.getFieldOfActivityRepository().getDeploymentSpecification() != null) {
			for (ISRuntimeInstanceAggregation annotation : version.getFieldOfActivityRepository().
					getDeploymentSpecification().getRuntimeInstanceAggregations()) {
				if (annotation.getComponents().contains(component)) {
					return annotation;
				}
			}
		}
		return null;
	}

	public static List<ISRuntimeInstance> lookUpRuntimeInstances(
			ISArchitectureVersion version, RepositoryComponent component) {
		List<ISRuntimeInstance> instances = new ArrayList<ISRuntimeInstance>();
		
		if (version.getFieldOfActivityRepository().getDeploymentSpecification() != null) {
			for (ISRuntimeInstance instance : version.getFieldOfActivityRepository().getDeploymentSpecification().
					getRuntimeInstances()) {
				if (instance.getComponents().contains(component)) {
					instances.add(instance);
				}
			}
		}
		
		return instances;
	}

}
