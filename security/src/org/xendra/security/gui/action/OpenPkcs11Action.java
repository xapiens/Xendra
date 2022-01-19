package org.xendra.security.gui.action;

import static org.kse.crypto.keystore.KeyStoreType.PKCS11;

import java.awt.event.ActionEvent;
import java.security.AuthProvider;
import java.security.KeyStore;
import java.security.Provider;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.dialogs.DOpenPkcs11KeyStore;
import org.kse.gui.dialogs.PasswordCallbackHandler;
import org.kse.gui.error.DError;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class OpenPkcs11Action extends OpenAction {
	public OpenPkcs11Action(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "OpenPkcs11");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","OpenPkcs11"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","OpenPkcs11"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			DOpenPkcs11KeyStore dOpenPkcs11KeyStore = new DOpenPkcs11KeyStore(getFrameMediator().getContainer().getFrame());
			dOpenPkcs11KeyStore.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dOpenPkcs11KeyStore.setVisible(true);

			Provider selectedProvider = dOpenPkcs11KeyStore.getSelectedProvider();
			if (selectedProvider == null) {
				return;
			}

			KeyStore keyStore = KeyStore.getInstance(PKCS11.jce(), selectedProvider);

			// register password handler
			AuthProvider authProvider = (AuthProvider) selectedProvider;
			authProvider.setCallbackHandler(new PasswordCallbackHandler(getFrameMediator().getContainer().getFrame()));

			keyStore.load(null, null);

			((SecurityEditorFrameController) getFrameMediator()).addKeyStore(keyStore, selectedProvider.getName(), null, selectedProvider);

		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
}
