package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequest;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.csr.pkcs10.Pkcs10Util;
import org.kse.crypto.csr.spkac.Spkac;
import org.kse.crypto.filetype.CryptoFileType;
import org.kse.crypto.filetype.CryptoFileUtil;
import org.kse.crypto.keypair.KeyPairType;
import org.kse.crypto.keypair.KeyPairUtil;
import org.kse.crypto.signing.SignatureType;
import org.kse.crypto.x509.X500NameUtils;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.crypto.x509.X509CertificateGenerator;
import org.kse.crypto.x509.X509CertificateVersion;
import org.kse.crypto.x509.X509ExtensionSet;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.FileChooserFactory;
import org.kse.gui.dialogs.sign.DSignCsr;
import org.kse.gui.error.DError;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SignCsrAction extends SecurityColumbaAction  {
	public SignCsrAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "signCsr"));
		putValue(Constants.ID, "signCsr");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","signCsr"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","signCsr"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FileOutputStream fos = null;
		File caReplyFile = null;

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
			Certificate[] certs = keyStore.getCertificateChain(alias);

			KeyPairType keyPairType = KeyPairUtil.getKeyPairType(privateKey);

			File csrFile = chooseCsrFile();
			if (csrFile == null) {
				return;
			}

			PKCS10CertificationRequest pkcs10Csr = null;
			Spkac spkacCsr = null;

			try {
				CryptoFileType fileType = CryptoFileUtil.detectFileType(new FileInputStream(csrFile));
				if (fileType == CryptoFileType.PKCS10_CSR) {
					pkcs10Csr = Pkcs10Util.loadCsr(new FileInputStream(csrFile));

					if (!Pkcs10Util.verifyCsr(pkcs10Csr)) {
						JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("SignCsrAction.NoVerifyPkcs10Csr.message"),
								res.getString("SignCsrAction.SignCsr.Title"), JOptionPane.WARNING_MESSAGE);
						return;
					}
				} else if (fileType == CryptoFileType.SPKAC_CSR) {
					spkacCsr = new Spkac(new FileInputStream(csrFile));

					if (!spkacCsr.verify()) {
						JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("SignCsrAction.NoVerifySpkacCsr.message"),
								res.getString("SignCsrAction.SignCsr.Title"), JOptionPane.WARNING_MESSAGE);
						return;
					}
				} else {
					JOptionPane
					.showMessageDialog(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
							res.getString("SignCsrAction.FileNotRecognisedType.message"), csrFile), res
							.getString("SignCsrAction.SignCsr.Title"), JOptionPane.WARNING_MESSAGE);
					return;
				}
			} catch (FileNotFoundException ex) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(res.getString("SignCsrAction.NotFile.message"), csrFile),
						res.getString("SignCsrAction.SignCsr.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			} catch (Exception ex) {
				String problemStr = MessageFormat.format(res.getString("SignCsrAction.NoOpenCsr.Problem"),
						csrFile.getName());

				String[] causes = new String[] { res.getString("SignCsrAction.NotCsr.Cause"),
						res.getString("SignCsrAction.CorruptedCsr.Cause") };

				Problem problem = new Problem(problemStr, causes, ex);

				DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(), res.getString("SignCsrAction.ProblemOpeningCsr.Title"),
						problem);
				dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dProblem.setVisible(true);

				return;
			}

			X509Certificate[] signingChain = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));
			X509Certificate signingCert = signingChain[0];

			PublicKey publicKey = null;
			X500Name subject = null;
			DSignCsr dSignCsr = null;
			Provider provider = history.getExplicitProvider();

			if (pkcs10Csr != null) {
				publicKey = new JcaPKCS10CertificationRequest(pkcs10Csr).getPublicKey();
				subject = pkcs10Csr.getSubject();

				dSignCsr = new DSignCsr(getFrameMediator().getContainer().getFrame(), pkcs10Csr, csrFile, privateKey, keyPairType, signingCert, provider);
			} else {
				publicKey = spkacCsr.getPublicKey();
				subject = spkacCsr.getSubject().getName();

				dSignCsr = new DSignCsr(getFrameMediator().getContainer().getFrame(), spkacCsr, csrFile, privateKey, keyPairType, signingCert, provider);
			}

			dSignCsr.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dSignCsr.setVisible(true);

			X509CertificateVersion version = dSignCsr.getVersion();
			SignatureType signatureType = dSignCsr.getSignatureType();
			Date validityStart = dSignCsr.getValidityStart();
			Date validityEnd = dSignCsr.getValidityEnd();
			BigInteger serialNumber = dSignCsr.getSerialNumber();
			caReplyFile = dSignCsr.getCaReplyFile();
			X509ExtensionSet extensions = dSignCsr.getExtensions();

			if (version == null) {
				return;
			}

			X500Name issuer = X500NameUtils.x500PrincipalToX500Name(signingCert.getSubjectX500Principal());

			// CA Reply is a cert with subject from CSR and issuer from signing cert's subject
			X509CertificateGenerator generator = new X509CertificateGenerator(version);
			X509Certificate caReplyCert = generator.generate(subject, issuer, validityStart, validityEnd, publicKey, privateKey,
					signatureType, serialNumber, extensions, provider);

			X509Certificate[] caReplyChain = new X509Certificate[signingChain.length + 1];

			caReplyChain[0] = caReplyCert;

			// Add all of the signing chain to the reply
			System.arraycopy(signingChain, 0, caReplyChain, 1, signingChain.length);

			byte[] caCertEncoded = X509CertUtil.getCertsEncodedPkcs7(caReplyChain);

			fos = new FileOutputStream(caReplyFile);
			fos.write(caCertEncoded);
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("SignJarAction.NoWriteFile.message"), caReplyFile),
					res.getString("SignCsrAction.SignCsr.Title"), JOptionPane.WARNING_MESSAGE);
			return;
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
			return;
		} finally {
			IOUtils.closeQuietly(fos);
		}

		JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("SignCsrAction.SignCsrSuccessful.message"),
				res.getString("SignCsrAction.SignCsr.Title"), JOptionPane.INFORMATION_MESSAGE);
	}

	private File chooseCsrFile() {
		JFileChooser chooser = FileChooserFactory.getCsrFileChooser();
		chooser.setCurrentDirectory(CurrentDirectory.get());
		chooser.setDialogTitle(res.getString("SignCsrAction.ChooseCsr.Title"));
		chooser.setMultiSelectionEnabled(false);

		int rtnValue = chooser.showDialog(getFrameMediator().getContainer().getFrame(), res.getString("SignCsrAction.ChooseCsr.button"));
		if (rtnValue == JFileChooser.APPROVE_OPTION) {
			File importFile = chooser.getSelectedFile();
			CurrentDirectory.updateForFile(importFile);
			return importFile;
		}
		return null;
	}
}
