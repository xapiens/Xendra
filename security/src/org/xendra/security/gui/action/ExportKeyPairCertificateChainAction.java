package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.dialogs.importexport.DExportCertificates;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.apache.commons.io.IOUtils;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.crypto.CryptoException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExportKeyPairCertificateChainAction extends SecurityColumbaAction {
	public ExportKeyPairCertificateChainAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ExportKeyPairCertificateChain"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "exportkeypaircertchain.png"));
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		File exportFile = null;

		try {
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			DExportCertificates dExportCertificates = new DExportCertificates(getFrameMediator().getContainer().getFrame(), alias, true);
			dExportCertificates.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExportCertificates.setVisible(true);

			if (!dExportCertificates.exportSelected()) {
				return;
			}

			exportFile = dExportCertificates.getExportFile();
			boolean pemEncode = dExportCertificates.pemEncode();
			boolean exportChain = dExportCertificates.exportChain();

			byte[] encoded = null;

			if (exportChain) {
				X509Certificate[] certChain = getCertificateChain(alias);

				if (dExportCertificates.exportFormatX509()) {
					encoded = X509CertUtil.getCertsEncodedX509Pem(certChain).getBytes();
				} else if (dExportCertificates.exportFormatPkcs7()) {
					if (pemEncode) {
						encoded = X509CertUtil.getCertsEncodedPkcs7Pem(certChain).getBytes();
					} else {
						encoded = X509CertUtil.getCertsEncodedPkcs7(certChain);
					}
				} else if (dExportCertificates.exportFormatPkiPath()) {
					encoded = X509CertUtil.getCertsEncodedPkiPath(certChain);
				} else if (dExportCertificates.exportFormatSpc()) {
					// SPC is just DER PKCS #7
					encoded = X509CertUtil.getCertsEncodedPkcs7(certChain);
				}
			} else {
				X509Certificate cert = getHeadCertificate(alias);
				if (dExportCertificates.exportFormatX509()) {
					if (pemEncode) {
						encoded = X509CertUtil.getCertEncodedX509Pem(cert).getBytes();
					} else {
						encoded = X509CertUtil.getCertEncodedX509(cert);
					}
				} else if (dExportCertificates.exportFormatPkcs7()) {
					if (pemEncode) {
						encoded = X509CertUtil.getCertEncodedPkcs7Pem(cert).getBytes();
					} else {
						encoded = X509CertUtil.getCertEncodedPkcs7(cert);
					}
				} else if (dExportCertificates.exportFormatPkiPath()) {
					encoded = X509CertUtil.getCertEncodedPkiPath(cert);
				} else if (dExportCertificates.exportFormatSpc()) {
					encoded = X509CertUtil.getCertEncodedPkcs7(cert); // SPC is just DER PKCS #7
				}
			}

			exportEncodedCertificates(encoded, exportFile);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("ExportKeyPairCertificateChainAction.ExportCertificateChainSuccessful.message"),
					res.getString("ExportKeyPairCertificateChainAction.ExportCertificateChain.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException ex) {
			String message = MessageFormat.format(
					res.getString("ExportKeyPairCertificateChainAction.NoWriteFile.message"), exportFile);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("ExportKeyPairCertificateChainAction.ExportCertificateChain.Title"),
					JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
	private X509Certificate getHeadCertificate(String alias) throws CryptoException {
		return X509CertUtil.orderX509CertChain(getCertificateChain(alias))[0];
	}

	private X509Certificate[] getCertificateChain(String alias) throws CryptoException {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStore keyStore = history.getCurrentState().getKeyStore();

			X509Certificate[] certChain = X509CertUtil.convertCertificates(keyStore.getCertificateChain(alias));

			return certChain;
		} catch (KeyStoreException ex) {
			String message = MessageFormat.format(
					res.getString("ExportKeyPairCertificateChainAction.NoAccessEntry.message"), alias);
			throw new CryptoException(message, ex);
		}
	}

	private void exportEncodedCertificates(byte[] encoded, File exportFile) throws IOException {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(exportFile);
			fos.write(encoded);
		} finally {
			IOUtils.closeQuietly(fos);
		}
	}

}
