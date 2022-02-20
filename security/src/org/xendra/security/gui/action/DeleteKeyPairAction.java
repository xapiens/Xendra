package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.error.DError;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class DeleteKeyPairAction extends SecurityColumbaAction implements HistoryAction {
	public DeleteKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "DeleteKeyPair"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "delete.png"));
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}	

	public void actionPerformed(ActionEvent e) {
		deleteSelectedEntry();
	}
	/**
	 * Let the user delete the selected KeyStore entry.
	 */
	public void deleteSelectedEntry() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			String message = MessageFormat.format(res.getString("DeleteKeyPairAction.ConfirmDelete.message"), alias);
			int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("DeleteKeyPairAction.DeleteEntry.Title"), JOptionPane.YES_NO_OPTION);

			if (selected != JOptionPane.YES_OPTION) {
				return;
			}

			keyStore.deleteEntry(alias);

			newState.removeEntryPassword(alias);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}