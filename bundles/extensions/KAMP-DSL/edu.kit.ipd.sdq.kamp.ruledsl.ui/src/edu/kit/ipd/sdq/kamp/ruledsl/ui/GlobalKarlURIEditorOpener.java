package edu.kit.ipd.sdq.kamp.ruledsl.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;

public class GlobalKarlURIEditorOpener extends GlobalURIEditorOpener {
	@Override
	public IEditorPart open(URI uri, boolean select) {
		IEditorPart editorPart = super.open(uri, select);
		Job job = new Job("Searching for the EObject") {
		     protected IStatus run(IProgressMonitor monitor) {
		    	 	monitor.beginTask("Traversing the TreeViewer", IProgressMonitor.UNKNOWN);
	    	 		String idToBeSelected = uri.fragment();
			 		if (editorPart instanceof IViewerProvider) {
			 			IViewerProvider provider = (IViewerProvider) editorPart;
			 			Viewer viewer = provider.getViewer();
			 			if(viewer instanceof TreeViewer) {
			 				TreeViewer treeViewer = ((TreeViewer) viewer);
			 		
			 			    if(treeViewer.getContentProvider() instanceof ITreeContentProvider) {
			 			    	ITreeContentProvider treeContentProvider = (ITreeContentProvider) treeViewer.getContentProvider();
			 			    	List<Object> allItems = new ArrayList<Object>();
			 			    	Display.getDefault().asyncExec(new Runnable() {
		 			    	 		public void run() {
					 			    	for(TreeItem item : treeViewer.getTree().getItems()) {
					 			    		getAllItems(item.getData(), treeContentProvider, allItems);
					 			    	}
					 			    	Optional<EObject> element = allItems.stream().filter(o -> o != null).map(o -> EObject.class.cast(o)).filter(o -> {
					 			    		String id = EcoreUtil.getID(o);
					 			    		return idToBeSelected.equals(id);
					 			    	}).findAny();
					 			    	if(element.isPresent()) {
					 			    		EObject eObj = element.get();
			 			    	 			treeViewer.expandToLevel(eObj, 0);
			 			    				treeViewer.refresh();
			 			    				IStructuredSelection sel = new StructuredSelection(eObj); 
			 			    				treeViewer.setSelection(sel, true); 
			 			    				
			 			    				// open properties view
			 			    				/* TODO UNCOMMENT ONCE PERFORMANCE BUG FIXED
			 			    				IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			 			    				IViewPart viewPart = activePage.findView(IPageLayout.ID_PROP_SHEET);

	 			    						if (viewPart != null) {
	 			    							activePage.bringToTop(viewPart);
	 			    						} else {
	 			    							try {
	 			    								viewPart = activePage.showView(IPageLayout.ID_PROP_SHEET);
												} catch (PartInitException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
	 			    						}
	 			    						
	 			    						// highlight the id field
	 			    						if(viewPart != null) {
	 			    							if(viewPart instanceof PropertySheet) {
	 			    								// TODO
	 			    							}
	 			    						}
	 			    						*/
					 			    	} else {
					 			    		System.err.println("Could not find element with following id in tree: " + idToBeSelected);
					 			    	}
		 			    	 		}
		 			    	 	});
			 			    	monitor.done();
			 			    }    	
			 			}
			 		}
		           return Status.OK_STATUS;
		        }
		     };
		job.setPriority(Job.INTERACTIVE);
		job.setUser(true);
		job.schedule();

		return editorPart;
	}

	private static void getAllItems(Object currentItem, ITreeContentProvider treeContentProvider, List<Object> allItems)
	{
	    Object[] children = treeContentProvider.getChildren(currentItem);

	    for(int i = 0; i < children.length; i++)
	    {
	        allItems.add(children[i]);
	        getAllItems(children[i], treeContentProvider, allItems);
	    }
	}
}
