package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.PrivateKey;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SignNewKeyPairAction extends SecurityColumbaAction {
	public SignNewKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "SignNewKeyPair"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "signnewkeypair.png"));
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			// get alias of selected (signing) key entry
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);
			if (password == null) {
				return;
			}

			KeyStore keyStore = currentState.getKeyStore();
			PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
			Certificate[] certs = keyStore.getCertificateChain(alias);

			X509Certificate[] signingCertChain = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));
			X509Certificate signingCert = signingCertChain[0];

			GenerateKeyPairAction generateKeyPairAction = new GenerateKeyPairAction(((SecurityEditorFrameController) getFrameMediator()));
			generateKeyPairAction.generateKeyPair(signingCert, signingCertChain, privateKey);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
