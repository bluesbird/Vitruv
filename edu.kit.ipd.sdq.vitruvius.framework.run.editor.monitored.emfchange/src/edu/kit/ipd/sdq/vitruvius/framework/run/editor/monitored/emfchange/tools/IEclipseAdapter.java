package edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.tools;

import java.util.Set;

import org.eclipse.core.commands.IExecutionListener;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;

/**
 * {@link IEclipseAdapter} is an interface for accessing Eclipse facilities. This interface was
 * introduced to facilitate writing tests for the listener.
 */
public interface IEclipseAdapter {

    /**
     * @return The currently active workbench page.
     */
    public IWorkbenchPage getActiveWorkbenchPage();

    /**
     * @return The currently used {@link IEditorPart}.
     */
    public IEditorPart getActiveEditorPart();

    /**
     * Adds an {@link IExecutionListener} to the Eclipse workbench's command service.
     * 
     * @param iel
     *            The listener to be added.
     */
    public void addCommandServiceListener(IExecutionListener iel);

    /**
     * Removes an {@link IExecutionListener} from the Eclipse workbench's command service.
     * 
     * @param iel
     *            The listener to be removed.
     */
    void removeCommandServiceListener(IExecutionListener iel);

    /**
     * @return The set of currently active {@link IEditorPart}s.
     */
    public Set<IEditorPart> getCurrentlyActiveEditors();

    /**
     * Synchronously executes the given {@link Runnable} within Eclipse's SWT context.
     * 
     * @param r
     *            The {@link Runnable} to be executed.
     */
    public void executeSynchronous(Runnable r);

    /**
     * @return The Eclipse workbench.
     */
    IWorkbench getWorkbench();
}
