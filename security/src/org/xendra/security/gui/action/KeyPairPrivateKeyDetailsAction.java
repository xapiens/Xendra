package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.gui.dialogs.DViewPrivateKey;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class KeyPairPrivateKeyDetailsAction extends SecurityColumbaAction {

	public KeyPairPrivateKeyDetailsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "KeyPairPrivateKeyDetails"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "privkeydetails.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController)getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);

			if (password == null) {
				return;
			}

			KeyStore keyStore = currentState.getKeyStore();

			PrivateKey privKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());

			DViewPrivateKey dViewPrivateKey = new DViewPrivateKey(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("KeyPairPrivateKeyDetailsAction.PrivKeyDetailsEntry.Title"), alias), privKey,
					history.getExplicitProvider());
			dViewPrivateKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewPrivateKey.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
}
