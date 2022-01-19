package org.xendra.security.gui.action;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.CryptoException;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.importexport.DExportCertificates;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class ExportTrustedCertificateAction extends SecurityColumbaAction {

	private X509Certificate certFromConstructor;

    /**
     * Construct action.
     *
     * @param kseFrame
     *            KeyStore Explorer frame
     */
	public ExportTrustedCertificateAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ExportTrustedCertificate"));
		putValue(Constants.ID, "ExportTrustedCertificate");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","ExportTrustedCertificate"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","ExportTrustedCertificate"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	
    /**
     * Construct action.
     *
     * @param kseFrame
     *            KeyStore Explorer frame
     * @param cert
     *            Certificate to be exported. If null, the currently selected keystore entry is used.
     */
    public ExportTrustedCertificateAction(IFrameMediator kseFrame, X509Certificate cert) {
            super(kseFrame, null);

            this.certFromConstructor = cert;

            putValue(LONG_DESCRIPTION, res.getString("ExportTrustedCertificateAction.statusbar"));
            putValue(NAME, res.getString("ExportTrustedCertificateAction.text"));
            putValue(SHORT_DESCRIPTION, res.getString("ExportTrustedCertificateAction.tooltip"));
            putValue(
                            SMALL_ICON,
                            new ImageIcon(Toolkit.getDefaultToolkit().createImage(
                                            getClass().getResource(res.getString("ExportTrustedCertificateAction.image")))));
    }
	
	public void actionPerformed(ActionEvent e) {
		File exportFile = null;

		try {
			DExportCertificates dExportCertificates = null;
			X509Certificate cert = null;
			if (certFromConstructor == null) {
				String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();
				dExportCertificates = new DExportCertificates(getFrameMediator().getContainer().getFrame(), alias, false);
				cert = getCertificate(alias);
			} else {
				cert = certFromConstructor;
				dExportCertificates = new DExportCertificates(getFrameMediator().getContainer().getFrame(), X509CertUtil.getCertificateAlias(cert), false);
			}

			dExportCertificates.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExportCertificates.setVisible(true);

			if (!dExportCertificates.exportSelected()) {
				return;
			}

			exportFile = dExportCertificates.getExportFile();

			boolean pemEncode = dExportCertificates.pemEncode();

			byte[] encoded = null;

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

			exportEncodedCertificate(encoded, exportFile);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("ExportTrustedCertificateAction.ExportCertificateSuccessful.message"),
					res.getString("ExportTrustedCertificateAction.ExportCertificate.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException ex) {
			String message = MessageFormat.format(res.getString("ExportTrustedCertificateAction.NoWriteFile.message"),
					exportFile);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("ExportTrustedCertificateAction.ExportCertificate.Title"),
					JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}

	private X509Certificate getCertificate(String alias) throws CryptoException {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStore keyStore = history.getCurrentState().getKeyStore();

			X509Certificate cert = X509CertUtil.convertCertificate(keyStore.getCertificate(alias));

			return cert;
		} catch (KeyStoreException ex) {
			String message = MessageFormat.format(
					res.getString("ExportTrustedCertificateAction.NoAccessEntry.message"), alias);
			throw new CryptoException(message, ex);
		}
	}

	private void exportEncodedCertificate(byte[] encoded, File exportFile) throws IOException {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(exportFile);
			fos.write(encoded);
		} finally {
			IOUtils.closeQuietly(fos);
		}
	}

}
