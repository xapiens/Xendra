package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class UndoAction extends SecurityColumbaAction  {
	public UndoAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "Undo"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Undo"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Undo"));
		putValue(Constants.ID, "Undo");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			history.getCurrentState().setPreviousStateAsCurrentState();

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
