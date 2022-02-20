package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;
import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.CryptoException;
import org.kse.crypto.publickey.OpenSslPubUtil;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.importexport.DExportPublicKeyOpenSsl;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class ExportKeyPairPublicKeyAction extends SecurityColumbaAction {

	public ExportKeyPairPublicKeyAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ExportKeyPairPublicKey"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "keypairexportpub.png"));
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		File exportFile = null;

		try {
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			DExportPublicKeyOpenSsl dExportPublicKey = new DExportPublicKeyOpenSsl(this.getFrameMediator().getContainer().getFrame(), alias);
			dExportPublicKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExportPublicKey.setVisible(true);

			if (!dExportPublicKey.exportSelected()) {
				return;
			}

			exportFile = dExportPublicKey.getExportFile();
			boolean pemEncode = dExportPublicKey.pemEncode();

			PublicKey publicKey = getPublicKey(alias);

			byte[] encoded = null;

			if (pemEncode) {
				encoded = OpenSslPubUtil.getPem(publicKey).getBytes();
			} else {
				encoded = OpenSslPubUtil.get(publicKey);
			}

			exportEncodedPublicKey(encoded, exportFile);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("ExportKeyPairPublicKeyAction.ExportPublicKeyOpenSslSuccessful.message"),
					res.getString("ExportKeyPairPublicKeyAction.ExportPublicKeyOpenSsl.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException ex) {
			String message = MessageFormat.format(res.getString("ExportKeyPairPublicKeyAction.NoWriteFile.message"),
					exportFile);
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("ExportKeyPairPublicKeyAction.ExportPublicKeyOpenSsl.Title"),
					JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
	private PublicKey getPublicKey(String alias) throws CryptoException {
		return X509CertUtil.orderX509CertChain(getCertificateChain(alias))[0].getPublicKey();
	}

	private X509Certificate[] getCertificateChain(String alias) throws CryptoException {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStore keyStore = history.getCurrentState().getKeyStore();

			X509Certificate[] certChain = X509CertUtil.convertCertificates(keyStore.getCertificateChain(alias));

			return certChain;
		} catch (KeyStoreException ex) {
			String message = MessageFormat.format(res.getString("ExportKeyPairPublicKeyAction.NoAccessEntry.message"),
					alias);
			throw new CryptoException(message, ex);
		}
	}

	private void exportEncodedPublicKey(byte[] encoded, File exportFile) throws IOException {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(exportFile);
			fos.write(encoded);
		} finally {
			IOUtils.closeQuietly(fos);
		}
	}

}
