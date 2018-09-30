package edu.kit.ipd.sdq.kamp.ruledsl.support;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;

public abstract class ViewerTreeObject implements IAdaptable, EcoreObjectContaining {
	private ViewerTreeParent parent;
	private EObject assignedEObject = null;
	
	public ViewerTreeObject(EObject assignedEObject) {
		this.assignEObject(assignedEObject);
	}
		
	public abstract String getName();
	
	// used for rendering in the tree viewer (e.g. icon)
	public void assignEObject(EObject eobj) {
		this.assignedEObject = eobj;
	}
	
	public void setParent(ViewerTreeParent parent) {
		this.parent = parent;
	}
	
	public ViewerTreeParent getParent() {
		return parent;
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	@Override
	public <T> T getAdapter(Class<T> key) {
		return null;
	}
	
	public EObject getEObject() {
		return this.assignedEObject;
	}
}