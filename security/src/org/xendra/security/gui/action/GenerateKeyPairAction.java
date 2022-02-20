package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.util.Env;
import org.kse.crypto.Password;
import org.kse.crypto.keypair.KeyPairType;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DGenerateKeyPair;
import org.kse.gui.dialogs.DGenerateKeyPairCert;
import org.kse.gui.dialogs.DGeneratingKeyPair;
import org.kse.gui.dialogs.DGetAlias;
import org.kse.gui.error.DError;
import org.kse.gui.password.DGetNewPassword;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class GenerateKeyPairAction extends SecurityColumbaAction implements HistoryAction {

	public GenerateKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "generatekeypair"));
		//putValue(Constants.ID, "generatekeypair");
		putValue(NAME, ResourceLoader.getString("menu","mainframe","GenerateKeyPairAction"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security","genkeypair.png"));
		((SecurityEditorFrameController) frameMediator).register(this);		
	}

	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}	

	public void actionPerformed(ActionEvent e) {
		generateKeyPair(null, null, null);
	}
	public void generateKeyPair() {
		generateKeyPair(null, null, null);
	}

	/**
	 * Generate a key pair (with certificate) in the currently opened KeyStore.
	 *
	 * @param issuerCert
	 *                 Issuer certificate for signing the new certificate
	 * @param issuerCertChain
	 *                 Chain of issuer certificate
	 * @param issuerPrivateKey
	 *                 Issuer's private key for signing
	 * @return Alias of new key pair
	 */
	public String generateKeyPair(X509Certificate issuerCert, X509Certificate[] issuerCertChain, PrivateKey issuerPrivateKey) {

		String alias = "";
		try {
			int keyPairSize = applicationSettings.getGenerateKeyPairSize();
			KeyPairType keyPairType = applicationSettings.getGenerateKeyPairType();
			KeyStore activeKeyStore = ((SecurityEditorFrameController)getFrameMediator()).getActiveKeyStore();
			KeyStoreType activeKeyStoreType = KeyStoreType.resolveJce(activeKeyStore.getType());
			KeyStoreHistory history = ((SecurityEditorFrameController)getFrameMediator()).getActiveKeyStoreHistory();
			Provider provider = history.getExplicitProvider();

			DGenerateKeyPair dGenerateKeyPair = new DGenerateKeyPair(getFrameMediator().getContainer().getFrame(), activeKeyStoreType, keyPairType, keyPairSize);
			dGenerateKeyPair.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGenerateKeyPair.setVisible(true);

			if (!dGenerateKeyPair.isSuccessful()) {
				return "";
			}

			keyPairType = dGenerateKeyPair.getKeyPairType();
			DGeneratingKeyPair dGeneratingKeyPair;
			if (keyPairType != KeyPairType.EC) {
				keyPairSize = dGenerateKeyPair.getKeyPairSize();
				dGeneratingKeyPair = new DGeneratingKeyPair(getFrameMediator().getContainer().getFrame(), keyPairType, keyPairSize, provider);

				applicationSettings.setGenerateKeyPairSize(keyPairSize);
				applicationSettings.setGenerateKeyPairType(keyPairType);
			} else {
				String curveName = dGenerateKeyPair.getCurveName();
				dGeneratingKeyPair = new DGeneratingKeyPair(getFrameMediator().getContainer().getFrame(), keyPairType, curveName, provider);
			}

			dGeneratingKeyPair.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGeneratingKeyPair.startKeyPairGeneration();
			dGeneratingKeyPair.setVisible(true);

			KeyPair keyPair = dGeneratingKeyPair.getKeyPair();

			if (keyPair == null) {
				return "";
			}

			DGenerateKeyPairCert dGenerateKeyPairCert = new DGenerateKeyPairCert(getFrameMediator().getContainer().getFrame(),
					res.getString("GenerateKeyPairAction.GenerateKeyPairCert.Title"), keyPair, keyPairType,
					issuerCert, issuerPrivateKey, provider);
			dGenerateKeyPairCert.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGenerateKeyPairCert.setVisible(true);

			X509Certificate certificate = dGenerateKeyPairCert.getCertificate();

			if (certificate == null) {
				return "";
			}

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();
			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(),
					res.getString("GenerateKeyPairAction.NewKeyPairEntryAlias.Title"),
					X509CertUtil.getCertificateAlias(certificate));
			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			alias = dGetAlias.getAlias();

			if (alias == null) {
				return "";
			}

			if (keyStore.containsAlias(alias)) {
				String message = MessageFormat.format(res.getString("GenerateKeyPairAction.OverWriteEntry.message"),
						alias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("GenerateKeyPairAction.NewKeyPairEntryAlias.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return "";
				}
			}

			Password password = new Password((char[])null);
			KeyStoreType keyStoreType = KeyStoreType.resolveJce(activeKeyStore.getType());

			if (keyStoreType.hasEntryPasswords()) {
				DGetNewPassword dGetNewPassword = new DGetNewPassword(getFrameMediator().getContainer().getFrame(),
						res.getString("GenerateKeyPairAction.NewKeyPairEntryPassword.Title"),
						applicationSettings.getPasswordQualityConfig());
				dGetNewPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
				dGetNewPassword.setVisible(true);
				password = dGetNewPassword.getPassword();

				if (password == null) {
					return "";
				}
			}
			if (keyStore.containsAlias(alias)) {
				keyStore.deleteEntry(alias);
				newState.removeEntryPassword(alias);
			}

			// create new chain with certificates from issuer chain
			X509Certificate[] newCertChain = null;
			if (issuerCertChain != null) {
				newCertChain = new X509Certificate[issuerCertChain.length + 1];
				System.arraycopy(issuerCertChain, 0, newCertChain, 1, issuerCertChain.length);
				newCertChain[0] = certificate;
			} else {
				newCertChain = new X509Certificate[] { certificate };
			}

			keyStore.setKeyEntry(alias, keyPair.getPrivate(), password.toCharArray(), newCertChain);
			newState.setEntryPassword(alias, password);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("GenerateKeyPairAction.KeyPairGenerationSuccessful.message"),
					res.getString("GenerateKeyPairAction.GenerateKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}

		return alias;
	}


}
