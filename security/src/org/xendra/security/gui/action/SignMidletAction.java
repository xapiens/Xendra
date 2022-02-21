package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keypair.KeyPairType;
import org.kse.crypto.signing.MidletSigner;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.sign.DSignMidlet;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SignMidletAction extends SecurityColumbaAction {

	public SignMidletAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "signMidlet"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "signmidlet.png"));
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);

			if (password == null) {
				return;
			}

			KeyStore keyStore = currentState.getKeyStore();

			PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
			X509Certificate[] certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(keyStore
					.getCertificateChain(alias)));

			if (!privateKey.getAlgorithm().equals(KeyPairType.RSA.jce())) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("SignMidletAction.ReqRsaKeyPairMidletSigning.message"),
						res.getString("SignMidletAction.SignMidlet.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			}

			DSignMidlet dSignMidlet = new DSignMidlet(getFrameMediator().getContainer().getFrame());
			dSignMidlet.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dSignMidlet.setVisible(true);

			File inputJadFile = dSignMidlet.getInputJad();
			File outputJadFile = dSignMidlet.getOutputJad();
			File jarFile = dSignMidlet.getJar();

			if (inputJadFile == null) {
				return;
			}

			if (inputJadFile.equals(outputJadFile)) {
				MidletSigner.sign(inputJadFile, jarFile, (RSAPrivateKey) privateKey, certs, 1);
			} else {
				MidletSigner.sign(inputJadFile, outputJadFile, jarFile, (RSAPrivateKey) privateKey, certs, 1);
			}

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("SignMidletAction.SignMidletSuccessful.message"),
					res.getString("SignMidletAction.SignMidlet.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
