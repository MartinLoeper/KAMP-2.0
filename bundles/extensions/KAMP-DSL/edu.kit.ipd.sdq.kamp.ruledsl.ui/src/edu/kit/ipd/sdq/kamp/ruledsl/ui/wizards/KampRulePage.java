package edu.kit.ipd.sdq.kamp.ruledsl.ui.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
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
					text.setText("Custom" + combo.getItem(index));
					setPageComplete(true);
					
					// TODO: check if file does not already exist  and add a number
				}
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
	
	private List<String> searchForRules() throws JavaModelException {
		List<String> rules = new ArrayList<>();
		IPackageFragmentRoot root = JavaCore.create(this.project).getPackageFragmentRoot(this.project);
		IPackageFragment pck = root.getPackageFragment("gen.rule");
		if(pck == null) {
			return rules;
		}
		
		ICompilationUnit[] units = pck.getCompilationUnits();
		Stream.of(units).map(u -> u.getElementName().replace(".java", "")).forEach(s -> rules.add(s));
		
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
