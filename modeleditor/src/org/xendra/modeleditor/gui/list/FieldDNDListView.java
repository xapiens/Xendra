package org.xendra.modeleditor.gui.list;

import java.awt.datatransfer.StringSelection;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.compiere.model.persistence.X_AD_Field;

public class FieldDNDListView extends FieldListView implements
	DropTargetListener, DragSourceListener, DragGestureListener, 
	ListSelectionListener {

	DropTarget dropTarget = null;
	DragSource dragSource = null;
	boolean acceptDrop = true;
	private X_AD_Field[] selection1;
	private X_AD_Field[] selection2;
	int index = -1;
	private boolean dndAction = false;
	
	public FieldDNDListView() {
		super();
		addListSelectionListener(this);
		dropTarget = new DropTarget(this, this);
		dragSource = DragSource.getDefaultDragSource();
		if (acceptDrop) {
			dragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY_OR_MOVE, this);
		} else {
			dragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY, this);
		}
	}
	
	
	public FieldDNDListView(FieldListModel model) {
		super(model);
		addListSelectionListener(this);
		dropTarget = new DropTarget(this, this);
		dragSource = new DragSource();	
		if (acceptDrop) {
			dragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY_OR_MOVE, this);
		} else {
			dragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY, this);
		}		
	}

	public void setAcceptDrop(boolean b) {
		acceptDrop = b;
	}
	
	/* 
	 * is invoked when you are dragging over the DropSize
	 */
	public void dragEnter(DropTargetDragEvent event) {
		// debug messages for diagnostics
		if (acceptDrop) {
			event.acceptDrag(DnDConstants.ACTION_COPY_OR_MOVE);
		} else {
			event.acceptDrag(DnDConstants.ACTION_COPY);
		}
	}
	
	@Override
	public void dragGestureRecognized(DragGestureEvent event) {
		if (!dndAction) {
			if (selection1 == null) {
				X_AD_Field[] items = new X_AD_Field[1];
				items[0] = (X_AD_Field) getSelectedValue();
				HeaderItemDNDManager.getInstance().setHeaderItemList(items);
			} else if (selection1.length != 0) {
				X_AD_Field[] items = new X_AD_Field[selection1.length];
				items = selection1;
				HeaderItemDNDManager.getInstance().setHeaderItemList(items);
			}
		} else {
			if (selection2.length != 0) {
				X_AD_Field[] items = new X_AD_Field[selection2.length];
				items = selection2;
				HeaderItemDNDManager.getInstance().setHeaderItemList(items);				
			} else {
				X_AD_Field[] items = new X_AD_Field[1];
				items[0] = (X_AD_Field) getSelectedValue();
				HeaderItemDNDManager.getInstance().setHeaderItemList(items);
			}
		}
		StringSelection text = new StringSelection("contact");
		dragSource.startDrag(event, DragSource.DefaultMoveDrop, text, this);
		clearSelection();
	}

	@Override
	public void dragDropEnd(DragSourceDropEvent event) {
		if (event.getDropSuccess()) {
			if (acceptDrop) {
				X_AD_Field[] items = HeaderItemDNDManager.getInstance().getHeaderItemList();
				for (int i = 0; i < items.length; i++) {
					((FieldListModel) getModel()).removeElement(items[i]);
				}
			}
		}
		
	}

	public void removeElement() {
		((FieldListModel) getModel()).removeElement((X_AD_Field) getSelectedValue());
	}
	
	public void valueChanged(ListSelectionEvent e) {
		if (dndAction) {
			Object[] list = getSelectedValues();
			selection1  = new X_AD_Field[list.length];
			for (int i = 0; i < list.length; i++) {
				selection1[i] = (X_AD_Field) list[i];
			}
		}
	}
	
	@Override
	public void dragExit(DragSourceEvent arg0) {				
	}

	@Override
	public void dragOver(DragSourceDragEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropActionChanged(DragSourceDragEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragExit(DropTargetEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dragOver(DropTargetDragEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drop(DropTargetDropEvent event) {
		if (!acceptDrop) {
			event.rejectDrop();
			clearSelection();
			return;
		}
		X_AD_Field[] rules = HeaderItemDNDManager.getInstance().getHeaderItemList();
		for (X_AD_Field rule:rules) {
			addElement(rule);
		}
		event.getDropTargetContext().dropComplete(true);
		clearSelection();
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent event) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dragEnter(DragSourceDragEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
}
