package edu.kit.ipd.sdq.kamp.ruledsl.ui.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.WorkingCopyOwner;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.ui.dialogs.FilteredTypesSelectionDialog;
import org.eclipse.jdt.ui.dialogs.ITypeInfoFilterExtension;
import org.eclipse.jdt.ui.dialogs.ITypeInfoRequestor;
import org.eclipse.jdt.ui.dialogs.TypeSelectionExtension;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class KampRulePage extends WizardPage {
	private Text text;
	private Combo combo;
	private Button enabledCheckBox;
	private Button ancestorsEnabledCheckBox;
	private final IProject project;
	private Text text_1;
	private IType superclass = null;

	protected KampRulePage(IProject project) {
		super("configureKampRule");
		setMessage("Set up your custom rule.");
		setTitle("Configure Custom Rule");
		this.project = project;
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblParent = new Label(container, SWT.NONE);
		lblParent.setText("Parent");
		
		combo = new Combo(container, SWT.NONE);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		combo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = combo.getSelectionIndex();
				if(index >= 0) {
					String name = "Custom" + combo.getItem(index);
					int nameSuffix = 0;
					String cName= name;
					
					// check if file with this name already exists
					while(fileExists(cName + ".java")) {
						nameSuffix++;
						cName = name + nameSuffix;
					}
					
					text.setText(cName);
					setPageComplete(true);
				}
			}
			
			private boolean fileExists(String name) {
				IFolder srcFolder = project.getFolder("src");
				if(srcFolder == null) {
					try {
						srcFolder.create(true, true, new NullProgressMonitor());
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return false;
				}
				
				return srcFolder.getFile(name).exists();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name*");
		
		text = new Text(container, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(!text.getText().isEmpty()) {
					setPageComplete(true);
				} else {
					setPageComplete(false);
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) { }
		});
		
		Label lblSuperclass = new Label(container, SWT.NONE);
		lblSuperclass.setText("Superclass");
		
		text_1 = new Text(container, SWT.BORDER);
		text_1.setEditable(false);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text_1.addMouseListener(new MouseListener() {

			@Override
			public void mouseUp(MouseEvent e) {
				IType type = chooseSuperClass();
				
				if(type != null) {
					superclass = type;
					text_1.setText(type.getFullyQualifiedName());
				} else {
					superclass = null;
					text_1.setText("");
				}
			}
			
			@Override
			public void mouseDown(MouseEvent e) { }
			
			@Override
			public void mouseDoubleClick(MouseEvent e) { }
		});
		
		Label lblEnabled = new Label(container, SWT.NONE);
		lblEnabled.setText("Enabled");
		try {
			searchForRules().forEach(i -> combo.add(i));
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		enabledCheckBox = new Button(container, SWT.CHECK);
		enabledCheckBox.setSelection(true);
		
		Label lblAncestor = new Label(container, SWT.NONE);
		lblAncestor.setText("Ancestors Enabled");
		
		ancestorsEnabledCheckBox = new Button(container, SWT.CHECK);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblrequired = new Label(container, SWT.NONE);
		lblrequired.setFont(SWTResourceManager.getFont("Segoe UI", 6, SWT.ITALIC));
		lblrequired.setText("*required");
		new Label(container, SWT.NONE);
		setPageComplete(false);
	}
	
	public IType getSuperclass() {
		return this.superclass;
	}
	
	protected IType chooseSuperClass() {
			IJavaElement project= JavaCore.create(this.project);
			if (project == null) {
				return null;
			}
	
			System.err.println(Platform.getBundle("edu.kit.ipd.sdq.kamp.ruledsl").getLocation());
			IJavaElement[] elements= new IJavaElement[] { project };
			IJavaSearchScope scope= SearchEngine.createWorkspaceScope();
			
			TypeSelectionExtension extension = new TypeSelectionExtension() {
				
				@Override
				public ITypeInfoFilterExtension getFilterExtension() {
					
					return new ITypeInfoFilterExtension() {
						
						@Override
						public boolean select(ITypeInfoRequestor typeInfoRequestor) {
							
							return typeInfoRequestor.getPackageName().startsWith("edu.kit.ipd.sdq.kamp.ruledsl.runtime.rule");
						}
					};
				}
			};
	
			FilteredTypesSelectionDialog dialog= new FilteredTypesSelectionDialog(getShell(), false,
				getWizard().getContainer(), scope, IJavaSearchConstants.CLASS, extension);
			dialog.setTitle("Superclass Selection");
			dialog.setMessage("Choose a type:");
			dialog.setInitialPattern("");
	
			if (dialog.open() == Window.OK) {
				return (IType) dialog.getFirstResult();
			}
			return null;
		}
	
	private List<String> searchForRules() throws JavaModelException {
		List<String> rules = new ArrayList<>();
		IPackageFragmentRoot root = JavaCore.create(this.project).getPackageFragmentRoot(this.project);
		IPackageFragment pck = root.getPackageFragment("gen.rule");
		if(pck == null) {
			return rules;
		}
		
		ICompilationUnit[] units = pck.getCompilationUnits();
		Stream.of(units).map(u -> u.getElementName().replace(".java", "")).forEach(s -> rules.add(s));
		
		// TODO check if file implements IRule interface
		
		return rules;
	}
	
	public boolean getAncestorsEnabledState() {
		return ancestorsEnabledCheckBox.getSelection();
	}
	
	public boolean getEnabledState() {
		return enabledCheckBox.getSelection();
	}
	
	public String getRuleName() {
		return text.getText();
	}
	
	public String getParentRuleName() {
		return combo.getText();
	}

	@Override
	public void setPageComplete(boolean complete) {
		super.setPageComplete(complete);
	}
}
