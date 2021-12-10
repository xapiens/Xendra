package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class SaveAllAction extends SaveAction {
	public SaveAllAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","SaveAll"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","SaveAll"));
		putValue(Constants.ID, "SaveAll");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory[] histories = ((SecurityEditorFrameController) getFrameMediator()).getKeyStoreHistories();

			for (int i = 0; i < histories.length; i++) {
				KeyStoreHistory history = histories[i];
				KeyStoreState currentState = history.getCurrentState();

				// Does KeyStore require saving and has file been saved before?
				if (!currentState.isSavedState()) {
					if (!saveKeyStore(history)) {
						break;
					}
				}
			}
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
