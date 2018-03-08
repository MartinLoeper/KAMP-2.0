package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.provider;

import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.EventType;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.SinkRole;
import org.palladiosimulator.pcm.repository.SourceRole;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyEntity;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyProvidedRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyRequiredRole;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;

/**
 * @generated NOT
 */
public class ISLabelCustomizing {

	public static String customize(ISModifyEntity<?> modifyEntity) {
		if (modifyEntity.getAffectedElement() == null) {
			return "(Please select an element!)";
		} else {
			return "\"" + modifyEntity.getAffectedElement().getEntityName() + "\"";
		}
	}

	public static String customize(ISModifyProvidedRole modification) {
		if (modification.getAffectedElement() == null) {
			return "(Please select a provided role!)";
		} else if (modification.getAffectedElement() instanceof OperationProvidedRole) {
			OperationProvidedRole role = (OperationProvidedRole) modification.getAffectedElement();
			return "\"" + role.getProvidingEntity_ProvidedRole().getEntityName() + "->"
					+ role.getProvidedInterface__OperationProvidedRole().getEntityName() + "\"";
		} else if (modification.getAffectedElement() instanceof SinkRole) {
			SinkRole role = (SinkRole) modification.getAffectedElement();
			return "\"" + role.getProvidingEntity_ProvidedRole().getEntityName() + "->"
					+ role.getEventGroup__SinkRole().getEntityName() + "\"";
		} else {
			return modification.getAffectedElement().getEntityName();
		}
	}

	public static String customize(ISModifyRequiredRole modification) {
		if (modification.getAffectedElement() == null) {
			return "(Please select a required role!)";
		} else if (modification.getAffectedElement() instanceof OperationRequiredRole) {
			OperationRequiredRole role = (OperationRequiredRole) modification.getAffectedElement();
			return "\"" + role.getRequiringEntity_RequiredRole().getEntityName() + "->"
					+ role.getRequiredInterface__OperationRequiredRole().getEntityName() + "\"";
		} else if (modification.getAffectedElement() instanceof SourceRole) {
			SourceRole role = (SourceRole) modification.getAffectedElement();
			return "\"" + role.getRequiringEntity_RequiredRole().getEntityName() + "->"
					+ role.getEventGroup__SourceRole().getEntityName() + "\"";
		} else {
			return modification.getAffectedElement().getEntityName();
		}
	}

	public static String customize(ISModifyDataType modification) {
		if (modification.getAffectedElement() == null) {
			return "(Please select a DataType!)";
		} else {
			return "\"" + getDataTypeName(modification.getAffectedElement()) + "\"";
		}
	}

	public static String getDataTypeName(DataType dataType) {
		if (dataType == null) {
			return null;
		} else if (dataType instanceof NamedElement) {
			return ((NamedElement) dataType).getEntityName();
		} else if (dataType instanceof PrimitiveDataType) {
			return ((PrimitiveDataType) dataType).getType().toString();
		} else {
			return dataType.toString();
		}
	}

	public static String customize(ISModifySignature modification) {
		if (modification.getAffectedElement() == null) {
			return "(Please select a signature!)";
		} else if (modification.getAffectedElement() instanceof OperationSignature) {
			OperationSignature signature = (OperationSignature) modification.getAffectedElement();
			String result = "\"" + signature.getEntityName() + "(";
			for (Parameter parameter : signature.getParameters__OperationSignature()) {
				result += parameter.getParameterName() + ": " + getDataTypeName(parameter.getDataType__Parameter())
						+ ", ";
			}
			if (signature.getParameters__OperationSignature().size() > 0) {
				result = result.substring(0, result.length() - 2); // Remove ",
																	// "
			}
			String returnName = getDataTypeName(signature.getReturnType__OperationSignature());
			returnName = returnName == null ? "void" : returnName;
			result += ") : " + returnName + "\" [Interface: "
					+ signature.getInterface__OperationSignature().getEntityName() + "]";
			return result;
		} else if (modification.getAffectedElement() instanceof EventType) {
			EventType signature = (EventType) modification.getAffectedElement();
			String result = "\"" + signature.getEntityName() + "(";
			if (signature.getParameter__EventType() != null) {
				Parameter parameter = signature.getParameter__EventType();
				result += parameter.getParameterName() + ": " + getDataTypeName(parameter.getDataType__Parameter());
			}
			result += ")\" [EventGroup: " + signature.getEventGroup__EventType().getEntityName() + "]";
			return result;
		} else {
			return modification.getAffectedElement().getEntityName();
		}
	}

}
