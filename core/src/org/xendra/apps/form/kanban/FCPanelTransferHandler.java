package org.xendra.apps.form.kanban;

import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceMotionListener;

import javax.swing.JComponent;
import javax.swing.TransferHandler;



/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class FCPanelTransferHandler extends TransferHandler implements DragSourceMotionListener {

    public FCPanelTransferHandler() {
        super();
    }

    @Override()
    public Transferable createTransferable(JComponent c) {
    	if (! (c instanceof FCPanel)) {
            return null;
        }
        return (FCPanel) c;
    }

    public void dragMouseMoved(DragSourceDragEvent dsde) {}

    @Override()
    public int getSourceActions(JComponent c) {
        
    	int handle = TransferHandler.NONE;
    	if (c instanceof FCPanel) {
    		handle = TransferHandler.COPY;
        }
        
        return handle;
    }
}
