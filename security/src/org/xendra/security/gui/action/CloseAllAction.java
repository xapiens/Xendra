package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CloseAllAction extends CloseAction {
	public CloseAllAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","CloseAll"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","CloseAll"));
		putValue(Constants.ID, "CloseAll");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent e) {
		closeAllKeyStores();
	}
	/**
	 * Close all keyStores.
	 *
	 * @return True if all KeyStores closed, false otherwise
	 */
	protected boolean closeAllKeyStores() {
		KeyStoreHistory[] histories = ((SecurityEditorFrameController) getFrameMediator()).getKeyStoreHistories();

		while (histories.length > 0) {
			if (!closeKeyStore(histories[0])) {
				break;
			}

			histories = ((SecurityEditorFrameController) getFrameMediator()).getKeyStoreHistories();
		}

		return histories.length == 0;

	}	
}
