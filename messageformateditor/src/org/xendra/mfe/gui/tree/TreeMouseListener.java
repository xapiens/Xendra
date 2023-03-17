package org.xendra.mfe.gui.tree;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingUtilities;
import javax.swing.tree.TreePath;

public 	class TreeMouseListener extends MouseAdapter {
	private boolean isTreePopupEvent;
	private TreeController tree;

	public TreeMouseListener(TreeController tree) {
		this.tree = tree;
	}

	/**
	 * @see java.awt.event.MouseAdapter#mousePressed(java.awt.event.MouseEvent)
	 */
	public void mousePressed(MouseEvent event) {
		if (event.isPopupTrigger()) {
			processPopup(event);
		}
	}

	/**
	 * @see java.awt.event.MouseAdapter#mouseReleased(java.awt.event.MouseEvent)
	 */
	public void mouseReleased(MouseEvent event) {
		if (event.isPopupTrigger()) {
			processPopup(event);
		}
	}

	/**
	 * @see java.awt.event.MouseAdapter#mouseClicked(java.awt.event.MouseEvent)
	 */
	public void mouseClicked(MouseEvent event) {
		// if mouse button was pressed twice times
		if (event.getClickCount() == 2) {
			// get selected row

		}
	}

	protected void processPopup(final MouseEvent event) {

		isTreePopupEvent = true;

		Point point = event.getPoint();
		TreePath path = tree.getView().getClosestPathForLocation(point.x, point.y);
		tree.getView().setSelectionPath(path);

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				tree.getPopupMenu(event.getComponent()).show(event.getComponent(), event.getX(), event.getY());
				isTreePopupEvent = false;
			}
		});
	}
}
