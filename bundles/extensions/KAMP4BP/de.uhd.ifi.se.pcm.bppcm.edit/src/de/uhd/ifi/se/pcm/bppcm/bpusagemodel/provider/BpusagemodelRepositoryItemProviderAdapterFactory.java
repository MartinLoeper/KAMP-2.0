package de.uhd.ifi.se.pcm.bppcm.bpusagemodel.provider;

import org.eclipse.emf.common.notify.Adapter;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.provider.OperationProvidedRoleItemProvider;
import org.palladiosimulator.pcm.repository.provider.OperationSignatureItemProvider;
import org.palladiosimulator.pcm.repository.provider.RepositoryItemProviderAdapterFactory;

/**
 * Creates meaningful labels for Signature and OperationProvidedRole values in the 
 * editor (properties view of EntryLevelSystemCall). Default of Palladio: only id 
 * shown. A better solution would be changing the ItemProviders in Palladio itself; 
 * this class is only a workaround.
 */
public class BpusagemodelRepositoryItemProviderAdapterFactory extends RepositoryItemProviderAdapterFactory {

	@Override
	public Adapter createOperationProvidedRoleAdapter() {
		if (operationProvidedRoleItemProvider == null) {
			operationProvidedRoleItemProvider = new OperationProvidedRoleItemProvider(this) {
				@Override
				public String getText(Object object) {
					OperationProvidedRole role = (OperationProvidedRole)object;
					String parentName = role.getProvidingEntity_ProvidedRole().getEntityName();							
					String label = parentName + "->" + role.getEntityName();
					return role.eClass().getName() + " " + label;
				}
			};
		}

		return operationProvidedRoleItemProvider;
	}
	
	@Override
	public Adapter createOperationSignatureAdapter() {
		if (operationSignatureItemProvider == null) {
			operationSignatureItemProvider = new OperationSignatureItemProvider(this) {
				@Override
				public String getText(Object object) {
					OperationSignature signature = (OperationSignature) object;
					String result = signature.eClass().getName() + " " 
								+ signature.getEntityName() + "(";
					for (Parameter parameter: signature.getParameters__OperationSignature()) {
						result += parameter.getParameterName() + ": " + getDataTypeName(
								parameter.getDataType__Parameter()) + ", ";
					}
					if (signature.getParameters__OperationSignature().size() > 0) {
						result = result.substring(0, result.length() - 2); // Remove ", "
					}
					String returnName = getDataTypeName(signature.getReturnType__OperationSignature());
					returnName = returnName == null ? "void" : returnName;
					result += ") : " + returnName + " [Interface: " 
							+ signature.getInterface__OperationSignature().getEntityName() + "]";
					return result;	
				}
			};
		}

		return operationSignatureItemProvider;
	}
	
	public String getDataTypeName(DataType dataType) {
		if (dataType == null) {
			return null;
		} else if (dataType instanceof NamedElement) {
			return ((NamedElement)dataType).getEntityName();
		} else if (dataType instanceof PrimitiveDataType) {
			return ((PrimitiveDataType) dataType).getType().toString();
		} else {
			return dataType.toString();
		}
	}

}