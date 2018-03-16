package edu.kit.ipd.sdq.kamp.ruledsl.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ImportRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

import edu.kit.ipd.sdq.kamp.ruledsl.support.IRule;

public class KarlImportWizard extends Wizard implements INewWizard {
	private static final String KAMP_RULE_ANNOTATION_IMPORT = "edu.kit.ipd.sdq.kamp.ruledsl.runtime.KampRule";
	private static final String KAMP_CONFIGURATION_ANNOTATION_IMPORT = "edu.kit.ipd.sdq.kamp.ruledsl.runtime.KampConfiguration";
	private static final String KAMP_IRULE_INTERFACE = "edu.kit.ipd.sdq.kamp.ruledsl.support.IRule";
	private static final String KAMP_ICONFIGURATION_INTERFACE = "edu.kit.ipd.sdq.kamp.ruledsl.support.IConfiguration";
	private static WizardArtifact<KampRulePage> CUSTOM_RULE_ARTIFACT;
	private static WizardArtifact<?> CONFIGURATION_ARTIFACT;
	private ChooseArtifactTypePage artifactChooserPage;
	private NewClassWizardPage newClassWizardPage;
	private IStructuredSelection selection;
	private IPackageFragment srcPackage;
	private final java.util.List<WizardArtifact> artifacts = new ArrayList<>();

	public KarlImportWizard(ISelection selection) {
		super();
		setHelpAvailable(false);
		setForcePreviousAndNextButtons(true);
		this.selection = (IStructuredSelection) selection;
		IProject project = extractSelection().getProject();
		CUSTOM_RULE_ARTIFACT = new WizardArtifact<KampRulePage>("Custom Rule", new KampRulePage(project), new Callable<Boolean>() {

			private void setupClassCreation() throws CoreException {
				String newClassName = getNewClassFileName();
				newClassWizardPage.setTypeName(newClassName, true);
				
				IProject project = extractSelection().getProject();
				IJavaProject jProject = getJavaProjects().stream().filter(p -> p.getProject().getName().equals(project.getName())).findAny().get();
				if(jProject == null) {
					IStatus status = new Status(Status.ERROR, "edu.kit.ipd.sdq.kamp.ruledsl.ui", "Project must be a JAVA project");
					throw new CoreException(status);
				}
				
				IPackageFragmentRoot root = jProject.getPackageFragmentRoot(jProject.getProject());
				newClassWizardPage.setPackageFragmentRoot(root, true);
				srcPackage = root.getPackageFragment("src");
				newClassWizardPage.setPackageFragment(srcPackage, true);
				newClassWizardPage.addSuperInterface(KAMP_IRULE_INTERFACE);
				newClassWizardPage.setMethodStubSelection(false, false, true, true);
			}
			
			private void addAnnotations(final ICompilationUnit cu) throws MalformedTreeException, BadLocationException, CoreException {

			     // parse compilation unit
			    final ASTParser parser = ASTParser.newParser(AST.JLS3);
			    parser.setSource(cu);
			    final CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);

			    // create a ASTRewrite
				final AST ast = astRoot.getAST();
			    final ASTRewrite rewriter = ASTRewrite.create(ast);
			
			    final ListRewrite listRewrite = rewriter.getListRewrite(astRoot, CompilationUnit.TYPES_PROPERTY);
			    final NormalAnnotation eventHandlerAnnotation = astRoot.getAST().newNormalAnnotation();
			    eventHandlerAnnotation.setTypeName(astRoot.getAST().newName("KampRule"));
			    
			    String ruleName = CUSTOM_RULE_ARTIFACT.getWizardPage().getRuleName();
			    IType superclass = CUSTOM_RULE_ARTIFACT.getWizardPage().getSuperclass();
			    String parentRuleName = CUSTOM_RULE_ARTIFACT.getWizardPage().getParentRuleName();
			    eventHandlerAnnotation.values().add(createAnnotationMember(ast, "enabled", CUSTOM_RULE_ARTIFACT.getWizardPage().getEnabledState()));
			    
			    if(parentRuleName != null && !parentRuleName.equals("")) {
			    	eventHandlerAnnotation.values().add(createAnnotationMember(ast, "disableAncestors", !CUSTOM_RULE_ARTIFACT.getWizardPage().getAncestorsEnabledState()));
			    	eventHandlerAnnotation.values().add(createAnnotationMember(ast, "parent", parentRuleName));
			    
			    	astRoot.accept(new ASTVisitor() {
			    		
			    		@Override
			    		public boolean visit(TypeDeclaration cNode) {
			    			// add constructor
			    	    	MethodDeclaration constructor = astRoot.getAST().newMethodDeclaration();
			    	    	constructor.setConstructor(true);
			    	    	constructor.setName(ast.newSimpleName(ruleName));
			    	    	Block block = ast.newBlock();
			    	    	SuperConstructorInvocation superInvocation = ast.newSuperConstructorInvocation();
			    	    	block.statements().add(superInvocation);
			    	    	constructor.setBody(block);
			    	    	SingleVariableDeclaration varDec = ast.newSingleVariableDeclaration();
			    	    	varDec.setName(ast.newSimpleName("parentRule"));
			    	    	varDec.setType(ast.newSimpleType(ast.newSimpleName(parentRuleName)));
			    	    	constructor.parameters().add(varDec);
			    	    	constructor.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			    	    	
			    	    	// add global variable parent rule
//			    	    	VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
//			    	    	fragment.setName(ast.newSimpleName("mParentRule"));
//			    	    	FieldDeclaration globalVarDecl = ast.newFieldDeclaration(fragment);
//			    	    	globalVarDecl.setType(ast.newSimpleType(ast.newSimpleName(parentRuleName)));
//			    	    	globalVarDecl.modifiers().add(ast.newModifier(ModifierKeyword.PRIVATE_KEYWORD));
			    	        
			    	        // add superclass if set in wizard
			    	        if(superclass != null) {
			    	        	rewriter.set(cNode, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY, ast.newName(superclass.getFullyQualifiedName()), null);
			    	        	
			    	        	try {
									IMethod[] methods = superclass.getMethods();
									for(IMethod m : methods) {
										if(m.isConstructor()) {
											if(m.getParameters().length == 1) {
												ILocalVariable var = m.getParameters()[0];
												if((Signature.getSignatureQualifier(var.getTypeSignature())
														+ "." + Signature.getSignatureSimpleName(var.getTypeSignature())).equals(IRule.class.getName())) {
													
													// constructor needs IRule argument
													superInvocation.arguments().add(ast.newSimpleName("parentRule"));
												}
											}
										}
									}
								} catch (JavaModelException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
			    	        }
			    	        
			    	        // persist constructor in AST tree
			    	        ListRewrite lrw = rewriter.getListRewrite(cNode, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
			    	        lrw.insertFirst(constructor, null);
//			    	        lrw.insertFirst(globalVarDecl, null);
			    	        
			    			return super.visit(cNode);
			    		}
					});
			    }
			    
			    listRewrite.insertAt(eventHandlerAnnotation, 0, null);
			    final TextEdit edits = rewriter.rewriteAST();
			
			    // apply the text edits to the compilation unit
			    final Document document = new Document(cu.getSource());
			    edits.apply(document);
			    
			    // add immport for annotation
			    ImportRewrite ir = ImportRewrite.create(cu, true);
				ir.addImport(KAMP_RULE_ANNOTATION_IMPORT);
				if(parentRuleName != null && !parentRuleName.equals("")) {
					ir.addImport("gen.rule." + parentRuleName);
				}
				
				final TextEdit importEdits = ir.rewriteImports(new NullProgressMonitor());
				importEdits.apply(document);
			
			    // this is the code for adding statements
			    cu.getBuffer().setContents((document.get()));
			    cu.save(null, true);
			}
			
			private String getNewClassFileName() {
				return CUSTOM_RULE_ARTIFACT.getWizardPage().getRuleName();
			}
			
			@Override
			public Boolean call() throws Exception {
				try {
					setupClassCreation();
					IRunnableWithProgress runnable = newClassWizardPage.getRunnable();
					runnable.run(null);
					ICompilationUnit compilationUnit = srcPackage.getCompilationUnit(getNewClassFileName() + ".java");
					addAnnotations(compilationUnit);
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(compilationUnit.getPath());
					IWorkbench wb = PlatformUI.getWorkbench();
					IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
					IWorkbenchPage page = win.getActivePage();
					IDE.openEditor(page, file, true);
					
					return true;
				} catch (InvocationTargetException | InterruptedException | MalformedTreeException | BadLocationException | CoreException e) {
					Platform.getLog(Platform.getBundle("edu.kit.ipd.sdq.kamp.ruledsl.ui")).log(new Status(Status.ERROR, "edu.kit.ipd.sdq.kamp.ruledsl.ui", "Exception", e));
				}
				
				return false;
			}
		});
		
		CONFIGURATION_ARTIFACT = new WizardArtifact("Configuration", null, new Callable<Boolean>() {

			private String getNewClassName() {
				// TODO check if already exists
				String name = "CustomConfiguration";
				int nameSuffix = 0;
				String cName= name;
				
				// check if file with this name already exists
				while(fileExists(cName + ".java")) {
					nameSuffix++;
					cName = name + nameSuffix;
				}
				
				return cName;
			}
			
			private boolean fileExists(String name) {
				IFolder srcFolder = extractSelection().getProject().getFolder("src");
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
			
			private void setupClassCreation(String newClassName) throws CoreException {
				newClassWizardPage.setTypeName(newClassName, true);
				
				IProject project = extractSelection().getProject();
				IJavaProject jProject = getJavaProjects().stream().filter(p -> p.getProject().getName().equals(project.getName())).findAny().get();
				if(jProject == null) {
					IStatus status = new Status(Status.ERROR, "edu.kit.ipd.sdq.kamp.ruledsl.ui", "Project must be a JAVA project");
					throw new CoreException(status);
				}
				
				IPackageFragmentRoot root = jProject.getPackageFragmentRoot(jProject.getProject());
				newClassWizardPage.setPackageFragmentRoot(root, true);
				srcPackage = root.getPackageFragment("src");
				newClassWizardPage.setPackageFragment(srcPackage, true);
				newClassWizardPage.addSuperInterface(KAMP_ICONFIGURATION_INTERFACE);
				newClassWizardPage.setMethodStubSelection(false, false, true, true);
			}
			
			private void addAnnotations(final ICompilationUnit cu) throws MalformedTreeException, BadLocationException, CoreException {

			     // parse compilation unit
			    final ASTParser parser = ASTParser.newParser(AST.JLS3);
			    parser.setSource(cu);
			    final CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);

			    // create a ASTRewrite
				final AST ast = astRoot.getAST();
			    final ASTRewrite rewriter = ASTRewrite.create(ast);
			
			    final ListRewrite listRewrite = rewriter.getListRewrite(astRoot, CompilationUnit.TYPES_PROPERTY);
			    final NormalAnnotation eventHandlerAnnotation = astRoot.getAST().newNormalAnnotation();
			    eventHandlerAnnotation.setTypeName(astRoot.getAST().newName("KampConfiguration"));
			    
			    listRewrite.insertAt(eventHandlerAnnotation, 0, null);
			    final TextEdit edits = rewriter.rewriteAST();
			
			    // apply the text edits to the compilation unit
			    final Document document = new Document(cu.getSource());
			    edits.apply(document);
			    
			    // add immport for annotation
			    ImportRewrite ir = ImportRewrite.create(cu, true);
				ir.addImport(KAMP_CONFIGURATION_ANNOTATION_IMPORT);
				
				final TextEdit importEdits = ir.rewriteImports(new NullProgressMonitor());
				importEdits.apply(document);
			
			    // this is the code for adding statements
			    cu.getBuffer().setContents((document.get()));
			    cu.save(null, true);
			}
			
			@Override
			public Boolean call() throws Exception {
				String className = getNewClassName();
				setupClassCreation(className);
				IRunnableWithProgress runnable = newClassWizardPage.getRunnable();
				runnable.run(null);
				ICompilationUnit compilationUnit = srcPackage.getCompilationUnit(className + ".java");
				addAnnotations(compilationUnit);
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(compilationUnit.getPath());
				IWorkbench wb = PlatformUI.getWorkbench();
				IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				IWorkbenchPage page = win.getActivePage();
				IDE.openEditor(page, file, true);
				
				return true;
			}
		});
		addArtifacts();
	}
	
	private void addArtifacts() {
		this.artifacts.add(CUSTOM_RULE_ARTIFACT);
		this.artifacts.add(CONFIGURATION_ARTIFACT);
	}
	
	private MemberValuePair createQualifiedAnnotationMember(final AST ast, final String name, final String value, final String value2) {
	    final MemberValuePair mV = ast.newMemberValuePair();
	    mV.setName(ast.newSimpleName(name));
	    final TypeLiteral typeLiteral = ast.newTypeLiteral();
	    final QualifiedType newQualifiedName = ast.newQualifiedType(ast.newSimpleType(ast.newSimpleName(value)), ast.newSimpleName(value2));
	    typeLiteral.setType(newQualifiedName);
	    mV.setValue(typeLiteral);
	    return mV;
	}
	
	private MemberValuePair createAnnotationMember(final AST ast, final String name, final String value) {
	
	    final MemberValuePair mV = ast.newMemberValuePair();
	    mV.setName(ast.newSimpleName(name));
	    final TypeLiteral typeLiteral = ast.newTypeLiteral();
	    typeLiteral.setType(ast.newSimpleType(ast.newSimpleName(value)));
	    mV.setValue(typeLiteral);
	    return mV;
	}
	
	private MemberValuePair createAnnotationMember(final AST ast, final String name, final boolean value) {
		
	    final MemberValuePair mV = ast.newMemberValuePair();
	    mV.setName(ast.newSimpleName(name));
	    final TypeLiteral typeLiteral = ast.newTypeLiteral();
	    mV.setValue(ast.newBooleanLiteral(value));
	    return mV;
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if(this.artifacts.stream().filter(p -> p.getWizardPage() == page).findAny().isPresent()) {
			return null;
		} else {
			if(page == artifactChooserPage) {
				WizardPage cWizardPage = artifactChooserPage.getSelectedArtifcat().getWizardPage();
				this.artifacts.stream().filter(a -> cWizardPage != a.getWizardPage()).filter(a -> a.getWizardPage() != null).forEach(a -> a.getWizardPage().setPageComplete(true));
				
				return cWizardPage;
			}
		}
		
		return super.getNextPage(page);
	}
	
	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		return super.getPreviousPage(page);
	}

	public static List<IJavaProject> getJavaProjects() {
	      List<IJavaProject> projectList = new LinkedList<IJavaProject>();
	      try {
	         IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	         IProject[] projects = workspaceRoot.getProjects();
	         for(int i = 0; i < projects.length; i++) {
	            IProject project = projects[i];
	            if(project.isOpen() && project.hasNature(JavaCore.NATURE_ID)) {
	               projectList.add(JavaCore.create(project));
	            }
	         }
	      }
	      catch(CoreException ce) {
	         ce.printStackTrace();
	      }
	      return projectList;
	   }
	
	@Override
	public void addPages() {
		artifactChooserPage = new ChooseArtifactTypePage(this.selection, this.artifacts);
		newClassWizardPage = new NewClassWizardPage();
		addPage(artifactChooserPage);
		addPage(newClassWizardPage);
		
		// this page is never shown, it is set up using setupClassCreation and triggered via performFinish
		newClassWizardPage.setPageComplete(true);

		for(WizardArtifact<?> a : this.artifacts) {
			if(a.getWizardPage() != null)
				addPage(a.getWizardPage());
		}
	}

	@Override
	public boolean performFinish() {
		try {
			return this.artifactChooserPage.getSelectedArtifcat().performFinish();
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	private IResource extractSelection() {
	    Object element = this.selection.getFirstElement();
	    if (element instanceof IResource)
	        return (IResource) element;
	    if (!(element instanceof IAdaptable))
	        return null;
	    IAdaptable adaptable = (IAdaptable)element;
	    Object adapter = adaptable.getAdapter(IResource.class);
	    return (IResource) adapter;
	}
}