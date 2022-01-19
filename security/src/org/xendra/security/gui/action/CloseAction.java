package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CloseAction extends SaveAction  {
	public CloseAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "Close");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Close"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Close"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		closeActiveKeyStore();
	}
	/**
	 * Close the active KeyStore. Allow the user to save it if there are unsaved
	 * changes.
	 *
	 * @return True if the KeyStore is closed, false otherwise
	 */
	public boolean closeActiveKeyStore() {
		return closeKeyStore(((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory());
	}

	/**
	 * Close the supplied KeyStore. Allow the user to save it if there are
	 * unsaved changes.
	 *
	 * @param history
	 *            KeyStore history
	 * @return True if the KeyStore is closed, false otherwise
	 */
	public boolean closeKeyStore(KeyStoreHistory history) {
		KeyStoreState currentState = history.getCurrentState();

		if (needSave(currentState)) {
			((SecurityEditorFrameController) getFrameMediator()).focusOnKeyStore(currentState.getKeyStore());

			int wantSave = wantSave(history);

			if (wantSave == JOptionPane.YES_OPTION) {
				boolean saved = saveKeyStore(history);

				if (!saved) {
					return false;
				}

				// Current state may have changed with the addition of a
				// KeyStore password during
				// save
				currentState = history.getCurrentState();
			} else if ((wantSave == JOptionPane.CANCEL_OPTION) || (wantSave == JOptionPane.CLOSED_OPTION)) {
				return false;
			}
		}

		((SecurityEditorFrameController) getFrameMediator()).removeKeyStore(currentState.getKeyStore());
		((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

		return true;
	}
	private boolean needSave(KeyStoreState state) {
		if (state != null) {
			if (!state.isSavedState() && !state.isInitialState()) {
				return true;
			}
		}
		return false;
	}

	private int wantSave(KeyStoreHistory history) {
		String keyStoreName = history.getName();

		String message = MessageFormat.format(res.getString("CloseAction.WantSaveChanges.message"), keyStoreName);

		int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
				res.getString("CloseAction.WantSaveChanges.Title"), JOptionPane.YES_NO_CANCEL_OPTION);
		return selected;
	}

}
