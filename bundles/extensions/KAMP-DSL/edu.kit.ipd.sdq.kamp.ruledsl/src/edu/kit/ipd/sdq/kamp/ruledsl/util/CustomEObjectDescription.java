package edu.kit.ipd.sdq.kamp.ruledsl.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;

public class CustomEObjectDescription extends EObjectDescription {
	private final QualifiedName name;
	
	public CustomEObjectDescription(QualifiedName simpleName, QualifiedName qualifiedName, EObject element, Map<String, String> userData) {
		super(qualifiedName, element, userData);
		this.name = simpleName;
	}
	
	@Override
	public QualifiedName getName() {
		return this.name;
	}

}
