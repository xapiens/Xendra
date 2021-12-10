package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CloseOthersAction extends CloseAction {
	
	public CloseOthersAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "CloseOthers");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","CloseOthers"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","CloseOthers"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		// Get the currently active KeyStore - the one to keep open
		KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

		/*
		 * Keep closing the KeyStores while there are more open KeyStores than
		 * the active one and closing the last one was successful
		 */
		KeyStoreHistory[] histories = ((SecurityEditorFrameController) getFrameMediator()).getKeyStoreHistories();

		while (histories.length > 1) {
			// Active KeyStore's index may have changed since last loop
			// iteration
			int activeIndex = ((SecurityEditorFrameController) getFrameMediator()).findKeyStoreIndex(history.getCurrentState().getKeyStore());

			// Get index of next keyStore to close
			int nextCloseIndex = (activeIndex == 0) ? 1 : 0;

			if (!closeKeyStore(histories[nextCloseIndex])) {
				break;
			}

			histories = ((SecurityEditorFrameController) getFrameMediator()).getKeyStoreHistories();
		}		
	}
}
