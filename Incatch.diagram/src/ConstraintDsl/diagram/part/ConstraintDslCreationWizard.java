/*
 * 
 */
package ConstraintDsl.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class ConstraintDslCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected ConstraintDsl.diagram.part.ConstraintDslCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected ConstraintDsl.diagram.part.ConstraintDslCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ConstraintDsl.diagram.part.Messages.ConstraintDslCreationWizardTitle);
		setDefaultPageImageDescriptor(ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewConstraintDslWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new ConstraintDsl.diagram.part.ConstraintDslCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "cnt_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(ConstraintDsl.diagram.part.Messages.ConstraintDslCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				ConstraintDsl.diagram.part.Messages.ConstraintDslCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ConstraintDsl.diagram.part.ConstraintDslCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "cnt") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".cnt_diagram".length()); //$NON-NLS-1$
					setFileName(ConstraintDsl.diagram.part.ConstraintDslDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "cnt")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(ConstraintDsl.diagram.part.Messages.ConstraintDslCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				ConstraintDsl.diagram.part.Messages.ConstraintDslCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = ConstraintDsl.diagram.part.ConstraintDslDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ConstraintDsl.diagram.part.ConstraintDslDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								ConstraintDsl.diagram.part.Messages.ConstraintDslCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						ConstraintDsl.diagram.part.Messages.ConstraintDslCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ConstraintDsl.diagram.part.ConstraintDslDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
