/*
 * 
 */
package TraceMetamodelEli5.diagram.part;

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
public class TraceMetamodelEli5CreationWizard extends Wizard implements INewWizard {

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
	protected TraceMetamodelEli5.diagram.part.TraceMetamodelEli5CreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected TraceMetamodelEli5.diagram.part.TraceMetamodelEli5CreationWizardPage domainModelFilePage;

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
		setWindowTitle(TraceMetamodelEli5.diagram.part.Messages.TraceMetamodelEli5CreationWizardTitle);
		setDefaultPageImageDescriptor(TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewTraceMetamodelEli5Wizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new TraceMetamodelEli5.diagram.part.TraceMetamodelEli5CreationWizardPage(
				"DiagramModelFile", getSelection(), "tmelif_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage.setTitle(
				TraceMetamodelEli5.diagram.part.Messages.TraceMetamodelEli5CreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				TraceMetamodelEli5.diagram.part.Messages.TraceMetamodelEli5CreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new TraceMetamodelEli5.diagram.part.TraceMetamodelEli5CreationWizardPage(
				"DomainModelFile", getSelection(), "tmelif") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".tmelif_diagram".length()); //$NON-NLS-1$
					setFileName(TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "tmelif")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(
				TraceMetamodelEli5.diagram.part.Messages.TraceMetamodelEli5CreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				TraceMetamodelEli5.diagram.part.Messages.TraceMetamodelEli5CreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								TraceMetamodelEli5.diagram.part.Messages.TraceMetamodelEli5CreationWizardOpenEditorError,
								null, e.getStatus());
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
						TraceMetamodelEli5.diagram.part.Messages.TraceMetamodelEli5CreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				TraceMetamodelEli5.diagram.part.TraceMetamodelEli5DiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
