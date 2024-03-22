/*
 * 
 */
package ConfigDsl.diagram.part;

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
public class ConfigDslCreationWizard extends Wizard implements INewWizard {

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
	protected ConfigDsl.diagram.part.ConfigDslCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected ConfigDsl.diagram.part.ConfigDslCreationWizardPage domainModelFilePage;

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
		setWindowTitle(ConfigDsl.diagram.part.Messages.ConfigDslCreationWizardTitle);
		setDefaultPageImageDescriptor(ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewConfigDslWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new ConfigDsl.diagram.part.ConfigDslCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "cd_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(ConfigDsl.diagram.part.Messages.ConfigDslCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				ConfigDsl.diagram.part.Messages.ConfigDslCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ConfigDsl.diagram.part.ConfigDslCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"cd") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".cd_diagram".length()); //$NON-NLS-1$
					setFileName(ConfigDsl.diagram.part.ConfigDslDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "cd")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(ConfigDsl.diagram.part.Messages.ConfigDslCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(ConfigDsl.diagram.part.Messages.ConfigDslCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = ConfigDsl.diagram.part.ConfigDslDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ConfigDsl.diagram.part.ConfigDslDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								ConfigDsl.diagram.part.Messages.ConfigDslCreationWizardOpenEditorError, null,
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
						ConfigDsl.diagram.part.Messages.ConfigDslCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ConfigDsl.diagram.part.ConfigDslDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
