package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.Key;
import java.security.KeyStore;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.gui.dialogs.DGetAlias;
import org.kse.gui.error.DError;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class RenameKeyAction  extends SecurityColumbaAction  implements HistoryAction {
	public RenameKeyAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "RenameKey"));
		putValue(Constants.ID, "RenameKey");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","RenameKey"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","RenameKey"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}
	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);

			if (password == null) {
				return;
			}

			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			Key key = keyStore.getKey(alias, password.toCharArray());

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(), res.getString("RenameKeyAction.NewEntryAlias.Title"), alias);
			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String newAlias = dGetAlias.getAlias();

			if (newAlias == null) {
				return;
			}

			if (newAlias.equalsIgnoreCase(alias)) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(res.getString("RenameKeyAction.RenameAliasIdentical.message"), alias),
						res.getString("RenameKeyAction.RenameEntry.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			}

			if (keyStore.containsAlias(newAlias)) {
				String message = MessageFormat
						.format(res.getString("RenameKeyAction.OverWriteEntry.message"), newAlias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("RenameKeyAction.RenameEntry.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}

				keyStore.deleteEntry(newAlias);
				newState.removeEntryPassword(newAlias);
			}

			keyStore.setKeyEntry(newAlias, key, password.toCharArray(), null);
			newState.setEntryPassword(newAlias, new Password(password));

			keyStore.deleteEntry(alias);
			newState.removeEntryPassword(alias);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
