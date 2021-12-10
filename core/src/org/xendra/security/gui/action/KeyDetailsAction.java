package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.text.MessageFormat;

import javax.crypto.SecretKey;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.gui.dialogs.DViewPrivateKey;
import org.kse.gui.dialogs.DViewPublicKey;
import org.kse.gui.dialogs.DViewSecretKey;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class KeyDetailsAction  extends SecurityColumbaAction {
	
	public KeyDetailsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "KeyDetails"));
		putValue(Constants.ID, "KeyDetails");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","KeyDetails"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","KeyDetails"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent e) {
		showKeySelectedEntry();
	}
	/**
	 * Show the key details of the selected KeyStore entry.
	 */
	public void showKeySelectedEntry() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);

			if (password == null) {
				return;
			}

			KeyStore keyStore = currentState.getKeyStore();

			Key key = keyStore.getKey(alias, password.toCharArray());

			if (key instanceof SecretKey) {
				SecretKey secretKey = (SecretKey) key;

				DViewSecretKey dViewSecretKey = new DViewSecretKey(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
						res.getString("KeyDetailsAction.SecretKeyDetailsEntry.Title"), alias), secretKey);
				dViewSecretKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dViewSecretKey.setVisible(true);
			} else if (key instanceof PrivateKey) {
				PrivateKey privateKey = (PrivateKey) key;

				DViewPrivateKey dViewPrivateKey = new DViewPrivateKey(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
						res.getString("KeyDetailsAction.PrivateKeyDetailsEntry.Title"), alias), privateKey,
						history.getExplicitProvider());
				dViewPrivateKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dViewPrivateKey.setVisible(true);
			} else if (key instanceof PublicKey) {
				PublicKey publicKey = (PublicKey) key;

				DViewPublicKey dViewPublicKey = new DViewPublicKey(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
						res.getString("KeyDetailsAction.PublicKeyDetailsEntry.Title"), alias), publicKey);
				dViewPublicKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dViewPublicKey.setVisible(true);
			}
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}	
}
