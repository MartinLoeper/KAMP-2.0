package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider;

import org.eclipse.emf.common.notify.Adapter;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.EventType;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.repository.provider.CollectionDataTypeItemProvider;
import org.palladiosimulator.pcm.repository.provider.CompositeDataTypeItemProvider;
import org.palladiosimulator.pcm.repository.provider.EventGroupItemProvider;
import org.palladiosimulator.pcm.repository.provider.EventTypeItemProvider;
import org.palladiosimulator.pcm.repository.provider.OperationInterfaceItemProvider;
import org.palladiosimulator.pcm.repository.provider.OperationProvidedRoleItemProvider;
import org.palladiosimulator.pcm.repository.provider.OperationRequiredRoleItemProvider;
import org.palladiosimulator.pcm.repository.provider.OperationSignatureItemProvider;
import org.palladiosimulator.pcm.repository.provider.RepositoryItemProviderAdapterFactory;
import org.palladiosimulator.pcm.repository.provider.SinkRoleItemProvider;
import org.palladiosimulator.pcm.repository.provider.SourceRoleItemProvider;

// Provide better labels in the tree editor then Palladio does by default (only shows ids, not name)
// Similar code also in the ComponentInternalDependenciesEditor
/**
 * @generated NOT
 */
public class ISModificationmarksRepositoryItemProviderAdapterFactory extends RepositoryItemProviderAdapterFactory {
	
	@Override
	public Adapter createOperationProvidedRoleAdapter() {
		if (operationProvidedRoleItemProvider == null) {
			operationProvidedRoleItemProvider = new OperationProvidedRoleItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForProvidedRole((ProvidedRole)object);
				}
			};
		}

		return operationProvidedRoleItemProvider;
	}
	
	@Override
	public Adapter createSinkRoleAdapter() {
		if (sinkRoleItemProvider == null) {
			sinkRoleItemProvider = new SinkRoleItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForProvidedRole((ProvidedRole) object);
				}
			};
		}

		return sinkRoleItemProvider;
	}
	
	private static String createLabelForProvidedRole(ProvidedRole role) {
		String parentName = role.getProvidingEntity_ProvidedRole().getEntityName();							
		String label = parentName + "->" + role.getEntityName();
		return role.eClass().getName() + " " + label;
	}
	
	@Override
	public Adapter createOperationRequiredRoleAdapter() {
		if (operationRequiredRoleItemProvider == null) {
			operationRequiredRoleItemProvider = new OperationRequiredRoleItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForRequiredRole((RequiredRole) object);
				}
			};
		}

		return operationRequiredRoleItemProvider;
	}
	
	@Override
	public Adapter createSourceRoleAdapter() {
		if (sourceRoleItemProvider == null) {
			sourceRoleItemProvider = new SourceRoleItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForRequiredRole((RequiredRole) object);
				}
			};
		}

		return sourceRoleItemProvider;
	}
	
	private static String createLabelForRequiredRole(RequiredRole role) {
		String parentName = role.getRequiringEntity_RequiredRole().getEntityName();							
		String label = parentName + "->" + role.getEntityName();
		return role.eClass().getName() +  " " + label;
	}
	
	@Override
	public Adapter createCompositeDataTypeAdapter() {
		if (compositeDataTypeItemProvider == null) {
			compositeDataTypeItemProvider = new CompositeDataTypeItemProvider(this){
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}

		return compositeDataTypeItemProvider;
	}

	@Override
	public Adapter createCollectionDataTypeAdapter() {
		if (collectionDataTypeItemProvider == null) {
			collectionDataTypeItemProvider = new CollectionDataTypeItemProvider(this){
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}

		return collectionDataTypeItemProvider;
	}
	
	@Override
	public Adapter createOperationInterfaceAdapter() {
		if (operationInterfaceItemProvider == null) {
			operationInterfaceItemProvider = new OperationInterfaceItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}

		return operationInterfaceItemProvider;
	}
	
	@Override
	public Adapter createEventGroupAdapter() {
		if (eventGroupItemProvider == null) {
			eventGroupItemProvider = new EventGroupItemProvider(this) {
				@Override
				public String getText(Object object) {
					return createLabelForEntity((Entity) object);
				}
			};
		}

		return eventGroupItemProvider;
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
	
	@Override
	public Adapter createEventTypeAdapter() {
		if (eventTypeItemProvider == null) {
			eventTypeItemProvider = new EventTypeItemProvider(this) {
				@Override
				public String getText(Object object) {
					EventType signature = (EventType) object;
					String result = signature.eClass().getName() + " " + 
							signature.getEntityName() + "(";
					if (signature.getParameter__EventType() != null) {
						Parameter parameter = signature.getParameter__EventType();
						result += parameter.getParameterName() + ": " + getDataTypeName(
								parameter.getDataType__Parameter());
					}
					result += ") [EventGroup: " + signature.getEventGroup__EventType().
							getEntityName() + "]";
					return result;
				}
			};
		}

		return eventTypeItemProvider;
	}
	
	private static String createLabelForEntity(Entity entity) {
		return entity.eClass().getName() + " " + entity.getEntityName();
	}
	
	private static String getDataTypeName(DataType dataType) {
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
