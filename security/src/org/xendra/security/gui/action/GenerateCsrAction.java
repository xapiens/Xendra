package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.CryptoException;
import org.kse.crypto.Password;
import org.kse.crypto.csr.CsrType;
import org.kse.crypto.csr.pkcs10.Pkcs10Util;
import org.kse.crypto.csr.spkac.Spkac;
import org.kse.crypto.csr.spkac.SpkacSubject;
import org.kse.crypto.keypair.KeyPairType;
import org.kse.crypto.keypair.KeyPairUtil;
import org.kse.crypto.signing.SignatureType;
import org.kse.crypto.x509.X500NameUtils;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.dialogs.DGenerateCsr;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class GenerateCsrAction extends SecurityColumbaAction {
	public GenerateCsrAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "GenerateCsr"));
		putValue(Constants.ID, "GenerateCsr");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","GenerateCsr"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","GenerateCsr"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		File csrFile = null;
		FileOutputStream fos = null;

		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();
			Provider provider = history.getExplicitProvider();

			String alias = ((SecurityEditorFrameController)getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);

			if (password == null) {
				return;
			}

			KeyStore keyStore = currentState.getKeyStore();

			PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());

			String keyPairAlg = privateKey.getAlgorithm();
			KeyPairType keyPairType = KeyPairUtil.getKeyPairType(privateKey);

			if (keyPairType == null) {
				throw new CryptoException(MessageFormat.format(
						res.getString("GenerateCsrAction.NoCsrForKeyPairAlg.message"), keyPairAlg));
			}

			// determine dir of current keystore as proposal for CSR file location
			String path = CurrentDirectory.get().getAbsolutePath();
			File keyStoreFile = history.getFile();
			if (keyStoreFile != null) {
				path = keyStoreFile.getAbsoluteFile().getParent();
			}

			DGenerateCsr dGenerateCsr = new DGenerateCsr(getFrameMediator().getContainer().getFrame(), alias, privateKey, keyPairType, path, provider);
			dGenerateCsr.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGenerateCsr.setVisible(true);
			if (!dGenerateCsr.generateSelected()) {
				return;
			}

			CsrType format = dGenerateCsr.getFormat();
			SignatureType signatureType = dGenerateCsr.getSignatureType();
			String challenge = dGenerateCsr.getChallenge();
			String unstructuredName = dGenerateCsr.getUnstructuredName();
			boolean useCertificateExtensions = dGenerateCsr.isAddExtensionsWanted();
			csrFile = dGenerateCsr.getCsrFile();

			X509Certificate firstCertInChain = X509CertUtil.orderX509CertChain(X509CertUtil
					.convertCertificates(keyStore.getCertificateChain(alias)))[0];

			fos = new FileOutputStream(csrFile);

			if (format == CsrType.PKCS10) {
				String csr = Pkcs10Util.getCsrEncodedDerPem(Pkcs10Util.generateCsr(firstCertInChain, privateKey,
						signatureType, challenge, unstructuredName, useCertificateExtensions, provider));

				fos.write(csr.getBytes());
			} else {
				SpkacSubject subject = new SpkacSubject(X500NameUtils.x500PrincipalToX500Name(firstCertInChain
						.getSubjectX500Principal()));
				PublicKey publicKey = firstCertInChain.getPublicKey();

				// TODO handle other providers (PKCS11 etc)
				Spkac spkac = new Spkac(challenge, signatureType, subject, publicKey, privateKey);

				spkac.output(fos);
			}
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("GenerateCsrAction.NoWriteFile.message"), csrFile),
					res.getString("GenerateCsrAction.GenerateCsr.Title"), JOptionPane.WARNING_MESSAGE);
			return;
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
			return;
		} finally {
			IOUtils.closeQuietly(fos);
		}

		JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("GenerateCsrAction.CsrGenerationSuccessful.message"),
				res.getString("GenerateCsrAction.GenerateCsr.Title"), JOptionPane.INFORMATION_MESSAGE);
	}
}
