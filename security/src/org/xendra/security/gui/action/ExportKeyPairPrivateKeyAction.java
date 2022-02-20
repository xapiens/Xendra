package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.CryptoException;
import org.kse.crypto.Password;
import org.kse.crypto.privatekey.MsPvkUtil;
import org.kse.crypto.privatekey.OpenSslPbeType;
import org.kse.crypto.privatekey.OpenSslPvkUtil;
import org.kse.crypto.privatekey.Pkcs8PbeType;
import org.kse.crypto.privatekey.Pkcs8Util;
import org.kse.gui.dialogs.importexport.DExportPrivateKeyOpenSsl;
import org.kse.gui.dialogs.importexport.DExportPrivateKeyPkcs8;
import org.kse.gui.dialogs.importexport.DExportPrivateKeyPvk;
import org.kse.gui.dialogs.importexport.DExportPrivateKeyType;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.apache.commons.io.IOUtils;


public class ExportKeyPairPrivateKeyAction extends SecurityColumbaAction {
	public ExportKeyPairPrivateKeyAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ExportKeyPairPrivateKey"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "keypairexportpvk.png"));
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

			DExportPrivateKeyType dExportPrivateKeyType = new DExportPrivateKeyType(getFrameMediator().getContainer().getFrame());
			dExportPrivateKeyType.setLocationRelativeTo(this.getFrameMediator().getContainer().getFrame());      
			dExportPrivateKeyType.setVisible(true);

			if (!dExportPrivateKeyType.exportTypeSelected()) {
				return;
			}

			if (dExportPrivateKeyType.exportPkcs8()) {
				exportAsPkcs8(privateKey, alias);
			} else if (dExportPrivateKeyType.exportPvk()) {
				exportAsPvk(privateKey, alias);
			} else {
				exportAsOpenSsl(privateKey, alias);
			}
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
	private void exportAsPkcs8(PrivateKey privateKey, String alias) throws CryptoException, IOException {
		File exportFile = null;

		try {
			DExportPrivateKeyPkcs8 dExportPrivateKeyPkcs8 = new DExportPrivateKeyPkcs8(getFrameMediator().getContainer().getFrame(), alias,
					applicationSettings.getPasswordQualityConfig());
			dExportPrivateKeyPkcs8.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExportPrivateKeyPkcs8.setVisible(true);

			if (!dExportPrivateKeyPkcs8.exportSelected()) {
				return;
			}

			exportFile = dExportPrivateKeyPkcs8.getExportFile();
			boolean pemEncode = dExportPrivateKeyPkcs8.pemEncode();
			boolean encrypt = dExportPrivateKeyPkcs8.encrypt();

			Pkcs8PbeType pbeAlgorithm = null;
			Password exportPassword = null;

			if (encrypt) {
				pbeAlgorithm = dExportPrivateKeyPkcs8.getPbeAlgorithm();
				exportPassword = dExportPrivateKeyPkcs8.getExportPassword();
			}

			byte[] encoded = getPkcs8EncodedPrivateKey(privateKey, pemEncode, pbeAlgorithm, exportPassword);

			exportEncodedPrivateKey(encoded, exportFile);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyPkcs8Successful.message"),
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyPkcs8.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException ex) {
			String message = MessageFormat.format(res.getString("ExportKeyPairPrivateKeyAction.NoWriteFile.message"),
					exportFile);
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyPkcs8.Title"),
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private void exportAsPvk(PrivateKey privateKey, String alias) throws CryptoException, IOException {
		File exportFile = null;

		try {
			DExportPrivateKeyPvk dExportPrivateKeyPvk = new DExportPrivateKeyPvk(getFrameMediator().getContainer().getFrame(), alias, privateKey,
					applicationSettings.getPasswordQualityConfig());
			dExportPrivateKeyPvk.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExportPrivateKeyPvk.setVisible(true);

			if (!dExportPrivateKeyPvk.exportSelected()) {
				return;
			}

			exportFile = dExportPrivateKeyPvk.getExportFile();
			int keyType = dExportPrivateKeyPvk.getKeyType();
			boolean encrypt = dExportPrivateKeyPvk.encrypt();

			boolean strongEncryption = false;
			Password exportPassword = null;

			if (encrypt) {
				strongEncryption = dExportPrivateKeyPvk.useStrongEncryption();
				exportPassword = dExportPrivateKeyPvk.getExportPassword();
			}

			byte[] encoded = getPvkEncodedPrivateKey(privateKey, keyType, exportPassword, strongEncryption);

			exportEncodedPrivateKey(encoded, exportFile);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyPvkSuccessful.message"),
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyPvk.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException ex) {
			String message = MessageFormat.format(res.getString("ExportKeyPairPrivateKeyAction.NoWriteFile.message"),
					exportFile);
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyPvk.Title"),
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private void exportAsOpenSsl(PrivateKey privateKey, String alias) throws CryptoException, IOException {
		File exportFile = null;

		try {
			DExportPrivateKeyOpenSsl dExportPrivateKeyOpenSsl = new DExportPrivateKeyOpenSsl(getFrameMediator().getContainer().getFrame(), alias,
					applicationSettings.getPasswordQualityConfig());
			dExportPrivateKeyOpenSsl.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExportPrivateKeyOpenSsl.setVisible(true);

			if (!dExportPrivateKeyOpenSsl.exportSelected()) {
				return;
			}

			exportFile = dExportPrivateKeyOpenSsl.getExportFile();
			boolean pemEncode = dExportPrivateKeyOpenSsl.pemEncode();
			boolean encrypt = dExportPrivateKeyOpenSsl.encrypt();

			OpenSslPbeType pbeAlgorithm = null;
			Password exportPassword = null;

			if (encrypt) {
				pbeAlgorithm = dExportPrivateKeyOpenSsl.getPbeAlgorithm();
				exportPassword = dExportPrivateKeyOpenSsl.getExportPassword();
			}

			byte[] encoded = getOpenSslEncodedPrivateKey(privateKey, pemEncode, pbeAlgorithm, exportPassword);

			exportEncodedPrivateKey(encoded, exportFile);
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyOpenSslSuccessful.message"),
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyOpenSsl.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException ex) {
			String message = MessageFormat.format(res.getString("ExportKeyPairPrivateKeyAction.NoWriteFile.message"),
					exportFile);
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message,
					res.getString("ExportKeyPairPrivateKeyAction.ExportPrivateKeyOpenSsl.Title"),
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private byte[] getPkcs8EncodedPrivateKey(PrivateKey privateKey, boolean pemEncode, Pkcs8PbeType pbeAlgorithm,
			Password password) throws CryptoException, IOException {
		byte[] encoded = null;

		if (pemEncode) {
			if ((pbeAlgorithm != null) && (password != null)) {
				encoded = Pkcs8Util.getEncryptedPem(privateKey, pbeAlgorithm, password).getBytes();
			} else {
				encoded = Pkcs8Util.getPem(privateKey).getBytes();
			}
		} else {
			if ((pbeAlgorithm != null) && (password != null)) {
				encoded = Pkcs8Util.getEncrypted(privateKey, pbeAlgorithm, password);
			} else {
				encoded = Pkcs8Util.get(privateKey);
			}
		}

		return encoded;
	}
	private byte[] getPvkEncodedPrivateKey(PrivateKey privateKey, int keyType, Password password,
			boolean strongEncryption) throws CryptoException, IOException {
		byte[] encoded = null;

		if (password != null) {
			if (privateKey instanceof RSAPrivateCrtKey) {
				encoded = MsPvkUtil.getEncrypted((RSAPrivateCrtKey) privateKey, keyType, password, strongEncryption);
			} else {
				encoded = MsPvkUtil.getEncrypted((DSAPrivateKey) privateKey, password, strongEncryption);
			}
		} else {
			if (privateKey instanceof RSAPrivateCrtKey) {
				encoded = MsPvkUtil.get((RSAPrivateCrtKey) privateKey, keyType);
			} else {
				encoded = MsPvkUtil.get((DSAPrivateKey) privateKey);
			}
		}

		return encoded;
	}

	private byte[] getOpenSslEncodedPrivateKey(PrivateKey privateKey, boolean pemEncoded, OpenSslPbeType pbeAlgorithm,
			Password password) throws CryptoException, IOException {
		byte[] encoded = null;

		if (pemEncoded) {
			if ((pbeAlgorithm != null) && (password != null)) {
				encoded = OpenSslPvkUtil.getEncrypted(privateKey, pbeAlgorithm, password).getBytes();
			} else {
				encoded = OpenSslPvkUtil.getPem(privateKey).getBytes();
			}
		} else {
			encoded = OpenSslPvkUtil.get(privateKey);
		}

		return encoded;
	}
	private void exportEncodedPrivateKey(byte[] encoded, File exportFile) throws IOException {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(exportFile);
			fos.write(encoded);
		} finally {
			IOUtils.closeQuietly(fos);
		}
	}	
}
