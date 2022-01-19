package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.dialogs.DGetAlias;
import org.kse.gui.error.DError;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class RenameTrustedCertificateAction extends SecurityColumbaAction implements HistoryAction {
	public RenameTrustedCertificateAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "RenameTrustedCertificate"));
		putValue(Constants.ID, "RenameTrustedCertificate");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","RenameTrustedCertificate"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","RenameTrustedCertificate"));
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
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(),
					res.getString("RenameTrustedCertificateAction.NewEntryAlias.Title"), alias);
			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String newAlias = dGetAlias.getAlias();

			if (newAlias == null) {
				return;
			}

			if (newAlias.equalsIgnoreCase(alias)) {
				JOptionPane.showMessageDialog(
						getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(
								res.getString("RenameTrustedCertificateAction.RenameAliasIdentical.message"), alias),
								res.getString("RenameTrustedCertificateAction.RenameEntry.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			}

			if (keyStore.containsAlias(newAlias)) {
				String message = MessageFormat.format(
						res.getString("RenameTrustedCertificateAction.OverWriteEntry.message"), newAlias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("RenameTrustedCertificateAction.RenameEntry.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}

				keyStore.deleteEntry(newAlias);
				newState.removeEntryPassword(newAlias);
			}

			Certificate cert = keyStore.getCertificate(alias);
			keyStore.setCertificateEntry(newAlias, cert);

			keyStore.deleteEntry(alias);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
