package edu.kit.ipd.sdq.kamp.ruledsl.viewer.views;

import edu.kit.ipd.sdq.kamp.ruledsl.support.ViewerTreeObject;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ViewerTreeParent;
import edu.kit.ipd.sdq.kamp.ruledsl.support.ChangePropagationResult;
import edu.kit.ipd.sdq.kamp.ruledsl.support.EcoreObjectContaining;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.*;
import org.eclipse.ui.ide.IDE;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import javax.inject.Inject;

public class KampRuleLanguageView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "edu.kit.ipd.sdq.kamp.ruledsl.viewer.views.KampRuleLanguageView";

	@Inject IWorkbench workbench;
	
	private ViewerTreeParent invisibleRoot = new ViewerTreeParent() {

		@Override
		public String getName() {
			return "<invisible root>";
		}
		
	};
	
	public void update(ChangePropagationResult result) {
		invisibleRoot.addChild(result);
		this.viewer.refresh();
	}
	
	private TreeViewer viewer;
//	private DrillDownAdapter drillDownAdapter;
//	private Action action1;
//	private Action action2;
//	private Action doubleClickAction;

	class ViewContentProvider implements ITreeContentProvider {
		
		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}
		public Object getParent(Object child) {
			if (child instanceof ViewerTreeObject) {
				return ((ViewerTreeObject)child).getParent();
			}
			return null;
		}
		public Object [] getChildren(Object parent) {
			if (parent instanceof ViewerTreeParent) {
				return ((ViewerTreeParent)parent).getChildren();
			}
			return new Object[0];
		}
		public boolean hasChildren(Object parent) {
			if (parent instanceof ViewerTreeParent)
				return ((ViewerTreeParent)parent).hasChildren();
			return false;
		}
	}
	
	public static final QualifiedName IMAGE_CACHE_KEY = new QualifiedName("org.eclipse.ui", "WorkbenchFileImage"); 

	class ViewLabelProvider extends LabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}
		
		public Image getImage(Object obj) {
			
			if(obj instanceof EcoreObjectContaining) {
//				EcoreObjectContaining EobjContaining = (EcoreObjectContaining) obj;
//				EObject eobj = EobjContaining.getEObject();
//				if(eobj != null) {
//					ImageDescriptor imgDesc = new org.eclipse.emf.edit.ui.util.EditUIMarkerHelper() {
//						public ImageDescriptor getImage(Object datum) {
//							ImageDescriptor cached;
//							IFile file = super.getFile(datum);
//							try {
//								cached = (ImageDescriptor) file.getSessionProperty(IMAGE_CACHE_KEY);
//								if (cached != null) {
//									return cached;
//								}
//							} catch (CoreException e) {
//								// ignore - not having a cached image descriptor is not fatal
//							}
//							IContentType contentType = IDE.guessContentType(file);
//	
//					        ImageDescriptor image = PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor(file.getName(), contentType);
//					        if (image == null) {
//								image = PlatformUI.getWorkbench().getSharedImages()
//					                    .getImageDescriptor(ISharedImages.IMG_OBJ_FILE);
//							}
//					        return image;
//						}
//					}.getImage(eobj);
//					return imgDesc.createImage();
//				}
			}
			
			String imageKey = ISharedImages.IMG_DEF_VIEW;
			if (obj instanceof ViewerTreeParent)
			   imageKey = ISharedImages.IMG_DEF_VIEW;
			return workbench.getSharedImages().getImage(imageKey);
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		// drillDownAdapter = new DrillDownAdapter(viewer);
		
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setInput(getViewSite());
		viewer.setLabelProvider(new ViewLabelProvider());

		// Create the help context id for the viewer's control
		workbench.getHelpSystem().setHelp(viewer.getControl(), "edu.kit.ipd.sdq.kamp.ruledsl.viewer.viewer");
		getSite().setSelectionProvider(viewer);
		//makeActions();
		//hookContextMenu();
		hookDoubleClickAction();
		//contributeToActionBars();
	}

//	private void hookContextMenu() {
//		MenuManager menuMgr = new MenuManager("#PopupMenu");
//		menuMgr.setRemoveAllWhenShown(true);
//		menuMgr.addMenuListener(new IMenuListener() {
//			public void menuAboutToShow(IMenuManager manager) {
//				KampRuleLanguageView.this.fillContextMenu(manager);
//			}
//		});
//		Menu menu = menuMgr.createContextMenu(viewer.getControl());
//		viewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, viewer);
//	}

//	private void contributeToActionBars() {
//		IActionBars bars = getViewSite().getActionBars();
//		fillLocalPullDown(bars.getMenuManager());
//		fillLocalToolBar(bars.getToolBarManager());
//	}

//	private void fillLocalPullDown(IMenuManager manager) {
//		//manager.add(action1);
//		//manager.add(new Separator());
//		//manager.add(action2);
//	}

//	private void fillContextMenu(IMenuManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
//		// Other plug-ins can contribute there actions here
//		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
//	}
	
//	private void fillLocalToolBar(IToolBarManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
//	}

//	private void makeActions() {
//		action1 = new Action() {
//			public void run() {
//				//showMessage("Action 1 executed");
//			}
//		};
//		action1.setText("Action 1");
//		action1.setToolTipText("Action 1 tooltips");
//		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
//			getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
//		
//		action2 = new Action() {
//			public void run() {
//				//showMessage("Action 2 executed");
//			}
//		};
//		action2.setText("Action 2");
//		action2.setToolTipText("Action 2 tooltip");
//		action2.setImageDescriptor(workbench.getSharedImages().
//				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
//		doubleClickAction = new Action() {
//			public void run() {
//				IStructuredSelection selection = viewer.getStructuredSelection();
//				Object obj = selection.getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
//			}
//		};
//	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				ISelection selection = event.getSelection();

	            if( selection instanceof ITreeSelection )
	            {
	            	ITreeSelection selectedItem = (ITreeSelection) selection;
	                TreePath[] paths= ((ITreeSelection)selection).getPathsFor(selectedItem.getFirstElement());

	                for (int i= 0; i < paths.length; i++) 
	                {
	                    viewer.setExpandedState(paths[i], !viewer.getExpandedState(paths[i]));
	                }
	            }
			}
		});
	}
	
//	private void showMessage(String message) {
//		MessageDialog.openInformation(
//			viewer.getControl().getShell(),
//			"CPRL Query Result",
//			message);
//	}

	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}
