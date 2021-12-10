package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DGetAlias;
import org.kse.gui.error.DError;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class RenameKeyPairAction extends SecurityColumbaAction  implements HistoryAction {
	public RenameKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "RenameKeyPair"));
		putValue(Constants.ID, "RenameKeyPair");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","RenameKeyPair"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","RenameKeyPair"));
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
			
			Key privateKey = keyStore.getKey(alias, password.toCharArray());

			Certificate[] certs = keyStore.getCertificateChain(alias);
			certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(), res.getString("RenameKeyPairAction.NewEntryAlias.Title"), alias);
			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String newAlias = dGetAlias.getAlias();

			if (newAlias == null) {
				return;
			}

			if (newAlias.equalsIgnoreCase(alias)) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(res.getString("RenameKeyPairAction.RenameAliasIdentical.message"), alias),
						res.getString("RenameKeyPairAction.RenameEntry.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			}

			if (keyStore.containsAlias(newAlias)) {
				String message = MessageFormat.format(res.getString("RenameKeyPairAction.OverWriteEntry.message"),
						newAlias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("RenameKeyPairAction.RenameEntry.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}

				keyStore.deleteEntry(newAlias);
				newState.removeEntryPassword(newAlias);
			}

			keyStore.setKeyEntry(newAlias, privateKey, password.toCharArray(), certs);
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
