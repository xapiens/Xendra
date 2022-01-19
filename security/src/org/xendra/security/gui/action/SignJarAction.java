package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.KSE;
import org.kse.crypto.Password;
import org.kse.crypto.digest.DigestType;
import org.kse.crypto.keypair.KeyPairType;
import org.kse.crypto.keypair.KeyPairUtil;
import org.kse.crypto.signing.JarSigner;
import org.kse.crypto.signing.SignatureType;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.sign.DSignJar;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SignJarAction extends SecurityColumbaAction {
	public SignJarAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "signJar"));
		putValue(Constants.ID, "signJar");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","signJar"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","signJar"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
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
			Provider provider = history.getExplicitProvider();

			PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
			X509Certificate[] certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(keyStore
					.getCertificateChain(alias)));

			KeyPairType keyPairType = KeyPairUtil.getKeyPairType(privateKey);

			DSignJar dSignJar = new DSignJar(getFrameMediator().getContainer().getFrame(), privateKey, keyPairType, alias, provider);
			dSignJar.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dSignJar.setVisible(true);

			SignatureType signatureType = dSignJar.getSignatureType();
			String signatureName = dSignJar.getSignatureName();
			File inputJarFile = dSignJar.getInputJar();
			File outputJarFile = dSignJar.getOutputJar();
			String tsaUrl = dSignJar.getTimestampingServerUrl();

			if (signatureType == null) {
				return;
			}

			String signer = KSE.getFullApplicationName();

			DigestType digestType = dSignJar.getDigestType();
			if (inputJarFile.equals(outputJarFile)) {
				JarSigner.sign(inputJarFile, privateKey, certs, signatureType, signatureName, signer, digestType,
						tsaUrl, provider);
			} else {
				JarSigner.sign(inputJarFile, outputJarFile, privateKey, certs, signatureType, signatureName, signer,
						digestType, tsaUrl, provider);
			}

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("SignJarAction.SignJarSuccessful.message"),
					res.getString("SignJarAction.SignJar.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
