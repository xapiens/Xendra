package org.xendra.apps.form.kanban;

import java.awt.Cursor;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTargetContext;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ratheesh Ravindran
 * Ratheesh.Ravindran@gmail.com
 * http://crashingnhanging.blogspot.com
 */
public class FCPanelDropTargetListener implements DropTargetListener {

    private final BacklogContainerPanel rootPanel;
    
    private static final Cursor droppableCursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR),
            notDroppableCursor = Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR);

    public FCPanelDropTargetListener(BacklogContainerPanel sheet) {
        this.rootPanel = sheet;
    }

    public void dragEnter(DropTargetDragEvent dtde) {}
    
    public void dragOver(DropTargetDragEvent dtde) {
        if (!this.rootPanel.getCursor().equals(droppableCursor)) {
            this.rootPanel.setCursor(droppableCursor);
        }
    }
    
    public void dropActionChanged(DropTargetDragEvent dtde) {}
    
    public void dragExit(DropTargetEvent dte) {
        this.rootPanel.setCursor(notDroppableCursor);
    }

    public void drop(DropTargetDropEvent dtde) {
        
        this.rootPanel.setCursor(Cursor.getDefaultCursor());
        
        DataFlavor dragAndDropPanelFlavor = null;
        
        Object transferableObj = null;
        Transferable transferable = null;
        DropTargetContext dropContext = null;
        try {
            dragAndDropPanelFlavor = KanbanBoard.getDataFlavor();
            
            transferable = dtde.getTransferable();
            dropContext = dtde.getDropTargetContext();
            
            if (transferable.isDataFlavorSupported(dragAndDropPanelFlavor)) {
                transferableObj = dtde.getTransferable().getTransferData(dragAndDropPanelFlavor);
            } 
            
        } catch (Exception ex) { 
        	}
        
        if (transferableObj == null) {
            return;
        }
        
        FCPanel droppedPanel = (FCPanel)transferableObj;
        droppedPanel.setBounds(dtde.getLocation().x, dtde.getLocation().y, droppedPanel.getWidth(), droppedPanel.getHeight());
        BacklogContainerPanel targetPanel = (BacklogContainerPanel) dropContext.getDropTarget().getComponent();
        droppedPanel.getFc().setBackLogID(targetPanel.getId());
        targetPanel.addFC(droppedPanel);
        droppedPanel.getParent().getParent().validate();
        droppedPanel.getParent().getParent().repaint();
        KanbanBoard.setUnsavedChanges(true);
    }
} 

