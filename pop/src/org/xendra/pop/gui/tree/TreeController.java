package org.xendra.pop.gui.tree;

import java.awt.event.MouseEvent;

import javax.swing.JComponent;

import org.columba.api.gui.focus.FocusManager;
import org.columba.api.gui.focus.FocusOwner;
import org.columba.core.gui.base.DoubleClickListener;
import org.xendra.pop.gui.frame.PurchaseFrameController;

public class TreeController extends DoubleClickListener implements FocusOwner {

	TreeView view;
	PurchaseFrameController frameController;

	public TreeController(PurchaseFrameController frameController) {
		super();
		this.frameController = frameController;
		view = new TreeView(frameController);
		view.addMouseListener(this);
		FocusManager.getInstance().registerComponent(this);
	}

	public TreeView getView() {
		return view;
	}

	@Override
	public void doubleClick(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean isCutActionEnabled() {		return false;	}
	public boolean isCopyActionEnabled() {		return false;	}
	public boolean isPasteActionEnabled() {		return false;	}
	public boolean isDeleteActionEnabled() {   return false;	}
	public boolean isSelectAllActionEnabled() {		return false; }
	public boolean isUndoActionEnabled() {		return false;}
	public boolean isRedoActionEnabled() {return false;	}
	public void cut() {}
	public void copy() {}
	public void paste() {}
	public void delete() {}
	public void undo() {}
	public void redo() {}
	public void selectAll() {}

	public JComponent getComponent() {
		return getView();
	}

}
