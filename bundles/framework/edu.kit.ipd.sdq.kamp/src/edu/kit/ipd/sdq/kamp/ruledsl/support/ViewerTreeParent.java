package edu.kit.ipd.sdq.kamp.ruledsl.support;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

public abstract class ViewerTreeParent extends ViewerTreeObject {
	public ViewerTreeParent(EObject assignedEObject) {
		super(assignedEObject);
	}
	
	public ViewerTreeParent() {
		super(null);
	}

	private ArrayList children = new ArrayList();
		
	public void addChild(ViewerTreeObject child) {
		children.add(child);
		child.setParent(this);
	}
	
//	public void removeChild(ViewerTreeObject child) {
//		children.remove(child);
//		child.setParent(null);
//	}
	
	public ViewerTreeObject [] getChildren() {
		return (ViewerTreeObject []) children.toArray(new ViewerTreeObject[children.size()]);
	}
	
	public boolean hasChildren() {
		return children.size()>0;
	}
}
