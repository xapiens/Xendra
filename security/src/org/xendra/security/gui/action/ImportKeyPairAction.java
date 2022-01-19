package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DGetAlias;
import org.kse.gui.dialogs.importexport.DImportKeyPairOpenSsl;
import org.kse.gui.dialogs.importexport.DImportKeyPairPkcs12;
import org.kse.gui.dialogs.importexport.DImportKeyPairPkcs8;
import org.kse.gui.dialogs.importexport.DImportKeyPairPvk;
import org.kse.gui.dialogs.importexport.DImportKeyPairType;
import org.kse.gui.error.DError;
import org.kse.gui.password.DGetNewPassword;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class ImportKeyPairAction extends SecurityColumbaAction implements HistoryAction {
	public ImportKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ImportKeyPair"));
		putValue(Constants.ID, "ImportKeyPair");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","ImportKeyPair"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","ImportKeyPair"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}

	public void actionPerformed(ActionEvent arg0) {
		DImportKeyPairType dImportKeyPairType = new DImportKeyPairType(getFrameMediator().getContainer().getFrame());
		dImportKeyPairType.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
		dImportKeyPairType.setVisible(true);

		if (!dImportKeyPairType.importTypeSelected()) {
			return;
		}

		if (dImportKeyPairType.importPkcs12()) {
			importKeyPairPkcs12();
		} else if (dImportKeyPairType.importPkcs8()) {
			importKeyPairPkcs8();
		} else if (dImportKeyPairType.importPvk()) {
			importKeyPairPvk();
		} else {
			importKeyPairOpenSsl();
		}		
	}
	private void importKeyPairPkcs12() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			DImportKeyPairPkcs12 dImportKeyPairPkcs12 = new DImportKeyPairPkcs12(getFrameMediator().getContainer().getFrame());
			dImportKeyPairPkcs12.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dImportKeyPairPkcs12.setVisible(true);

			PrivateKey privKey = dImportKeyPairPkcs12.getPrivateKey();
			X509Certificate[] certs = dImportKeyPairPkcs12.getCertificateChain();

			if ((privKey == null) || (certs == null)) {
				return;
			}

			X509Certificate[] x509Certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"),
					X509CertUtil.getCertificateAlias(x509Certs[0]));
			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String alias = dGetAlias.getAlias();

			if (alias == null) {
				return;
			}

			if (keyStore.containsAlias(alias)) {
				String message = MessageFormat.format(res.getString("ImportKeyPairAction.OverWriteEntry.message"),
						alias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}
			}

			Password password = new Password((char[])null);
			KeyStoreType type = KeyStoreType.resolveJce(keyStore.getType());

			if (type.hasEntryPasswords()) {
				DGetNewPassword dGetNewPassword = new DGetNewPassword(getFrameMediator().getContainer().getFrame(),
						res.getString("ImportKeyPairAction.NewKeyPairEntryPassword.Title"),
						applicationSettings.getPasswordQualityConfig());
				dGetNewPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dGetNewPassword.setVisible(true);
				password = dGetNewPassword.getPassword();

				if (password == null) {
					return;
				}
			}

			if (keyStore.containsAlias(alias)) {
				keyStore.deleteEntry(alias);
				newState.removeEntryPassword(alias);
			}

			keyStore.setKeyEntry(alias, privKey, password.toCharArray(), x509Certs);
			newState.setEntryPassword(alias, password);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.KeyPairImportSuccessful.message"),
					res.getString("ImportKeyPairAction.ImportKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}

	private void importKeyPairPkcs8() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			DImportKeyPairPkcs8 dImportKeyPairPkcs8 = new DImportKeyPairPkcs8(getFrameMediator().getContainer().getFrame());
			dImportKeyPairPkcs8.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dImportKeyPairPkcs8.setVisible(true);

			PrivateKey privateKey = dImportKeyPairPkcs8.getPrivateKey();
			Certificate[] certs = dImportKeyPairPkcs8.getCertificateChain();

			if ((privateKey == null) || (certs == null)) {
				return;
			}

			X509Certificate[] x509Certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"),
					X509CertUtil.getCertificateAlias(x509Certs[0]));

			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String alias = dGetAlias.getAlias();

			if (alias == null) {
				return;
			}

			if (keyStore.containsAlias(alias)) {
				String message = MessageFormat.format(res.getString("ImportKeyPairAction.OverWriteEntry.message"),
						alias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}
			}

			Password password = new Password((char[])null);
			KeyStoreType type = KeyStoreType.resolveJce(keyStore.getType());

			if (type.hasEntryPasswords()) {
				DGetNewPassword dGetNewPassword = new DGetNewPassword(getFrameMediator().getContainer().getFrame(),
						res.getString("ImportKeyPairAction.NewKeyPairEntryPassword.Title"),
						applicationSettings.getPasswordQualityConfig());
				dGetNewPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dGetNewPassword.setVisible(true);
				password = dGetNewPassword.getPassword();

				if (password == null) {
					return;
				}
			}

			if (keyStore.containsAlias(alias)) {
				keyStore.deleteEntry(alias);
				newState.removeEntryPassword(alias);
			}

			keyStore.setKeyEntry(alias, privateKey, password.toCharArray(), x509Certs);
			newState.setEntryPassword(alias, password);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.KeyPairImportSuccessful.message"),
					res.getString("ImportKeyPairAction.ImportKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
	private void importKeyPairPvk() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			DImportKeyPairPvk dImportKeyPairPvk = new DImportKeyPairPvk(getFrameMediator().getContainer().getFrame());
			dImportKeyPairPvk.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dImportKeyPairPvk.setVisible(true);

			PrivateKey privateKey = dImportKeyPairPvk.getPrivateKey();
			Certificate[] certs = dImportKeyPairPvk.getCertificateChain();

			if ((privateKey == null) || (certs == null)) {
				return;
			}

			X509Certificate[] x509Certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"),
					X509CertUtil.getCertificateAlias(x509Certs[0]));

			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String alias = dGetAlias.getAlias();

			if (alias == null) {
				return;
			}

			if (keyStore.containsAlias(alias)) {
				String message = MessageFormat.format(res.getString("ImportKeyPairAction.OverWriteEntry.message"),
						alias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}
			}

			Password password = new Password((char[])null);
			KeyStoreType type = KeyStoreType.resolveJce(keyStore.getType());

			if (type.hasEntryPasswords()) {
				DGetNewPassword dGetNewPassword = new DGetNewPassword(getFrameMediator().getContainer().getFrame(),
						res.getString("ImportKeyPairAction.NewKeyPairEntryPassword.Title"),
						applicationSettings.getPasswordQualityConfig());
				dGetNewPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dGetNewPassword.setVisible(true);
				password = dGetNewPassword.getPassword();

				if (password == null) {
					return;
				}
			}

			if (keyStore.containsAlias(alias)) {
				keyStore.deleteEntry(alias);
				newState.removeEntryPassword(alias);
			}

			keyStore.setKeyEntry(alias, privateKey, password.toCharArray(), x509Certs);
			newState.setEntryPassword(alias, password);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.KeyPairImportSuccessful.message"),
					res.getString("ImportKeyPairAction.ImportKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
	private void importKeyPairOpenSsl() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			DImportKeyPairOpenSsl dImportKeyPairOpenSsl = new DImportKeyPairOpenSsl(getFrameMediator().getContainer().getFrame());
			dImportKeyPairOpenSsl.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dImportKeyPairOpenSsl.setVisible(true);

			PrivateKey privateKey = dImportKeyPairOpenSsl.getPrivateKey();
			Certificate[] certs = dImportKeyPairOpenSsl.getCertificateChain();

			if ((privateKey == null) || (certs == null)) {
				return;
			}

			X509Certificate[] x509Certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"),
					X509CertUtil.getCertificateAlias(x509Certs[0]));

			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String alias = dGetAlias.getAlias();

			if (alias == null) {
				return;
			}

			if (keyStore.containsAlias(alias)) {
				String message = MessageFormat.format(res.getString("ImportKeyPairAction.OverWriteEntry.message"),
						alias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("ImportKeyPairAction.NewKeyPairEntryAlias.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}
			}

			Password password = new Password((char[])null);
			KeyStoreType type = KeyStoreType.resolveJce(keyStore.getType());

			if (type.hasEntryPasswords()) {
				DGetNewPassword dGetNewPassword = new DGetNewPassword(getFrameMediator().getContainer().getFrame(),
						res.getString("ImportKeyPairAction.NewKeyPairEntryPassword.Title"),
						applicationSettings.getPasswordQualityConfig());
				dGetNewPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dGetNewPassword.setVisible(true);
				password = dGetNewPassword.getPassword();

				if (password == null) {
					return;
				}
			}

			if (keyStore.containsAlias(alias)) {
				keyStore.deleteEntry(alias);
				newState.removeEntryPassword(alias);
			}

			keyStore.setKeyEntry(alias, privateKey, password.toCharArray(), x509Certs);
			newState.setEntryPassword(alias, password);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("ImportKeyPairAction.KeyPairImportSuccessful.message"),
					res.getString("ImportKeyPairAction.ImportKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}


}
