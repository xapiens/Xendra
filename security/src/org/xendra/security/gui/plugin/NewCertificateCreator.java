package org.columba.core.gui.plugin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.commons.io.IOUtils;
import org.compiere.apps.ADialog;
import org.compiere.model.MStore;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Store;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.kse.crypto.CryptoException;
import org.kse.crypto.Password;
import org.kse.crypto.keypair.KeyPairType;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DGenerateKeyPair;
import org.kse.gui.dialogs.DGenerateKeyPairCert;
import org.kse.gui.dialogs.DGeneratingKeyPair;
import org.kse.gui.dialogs.DGetAlias;
import org.kse.gui.dialogs.importexport.DExportCertificates;
import org.kse.gui.dialogs.importexport.DExportKeyPair;
import org.kse.gui.error.DError;
import org.kse.gui.password.DGetNewPassword;
import org.kse.gui.password.PasswordQualityConfig;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;

import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.WizardModelEvent;
import net.javaprog.ui.wizard.WizardModelListener;

public class NewCertificateCreator implements WizardModelListener {
	DataModel data;
	File file;
	private KeyStore newKeyStore;
	private Password pw;
	private String alias;
	private static final String PREFS_NODE = "/org/kse";
	private static final String KSE3_PWDQUALENABLE = "kse3.pwdqualenable";
	private static final String KSE3_MINPWDQUALENFORCE = "kse3.minpwdqualenforce";
	private static final String KSE3_MINPWDQUAL = "kse3.minpwdqual";
	protected static ResourceBundle res = ResourceBundle.getBundle("org/kse/gui/actions/resources");
	public NewCertificateCreator(DataModel data, File file) {
		this.data = data;
		this.file = file;
	}

	@Override
	public void stepShown(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardCanceled(WizardModelEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void wizardFinished(WizardModelEvent e) {		
		char[] pwdchar = (char[]) data.getData(X_AD_User.COLUMNNAME_Password);		
		try {
			initialiseSecurity();
			if (!file.exists()) { 
				newKeyStore = KeyStoreUtil.create(KeyStoreType.JKS);
				pw = new Password(pwdchar);			
				generateKeyPair(null, null, null);
				KeyStoreUtil.save(newKeyStore, file, pw);
			}
			else 
			{
				pw = new Password(pwdchar);
				newKeyStore = KeyStoreUtil.load(file, pw);
				Enumeration<String> aliases = newKeyStore.aliases();
				while (aliases.hasMoreElements()) {
					alias = aliases.nextElement();
				}
			}
			
			
			DExportCertificates dExportCertificates = new DExportCertificates(null, alias, true);
			dExportCertificates.setLocationRelativeTo(null);
			dExportCertificates.setVisible(true);

			while (!dExportCertificates.exportSelected()) {
				ADialog.error(0, null, Msg.translate(Env.getAD_Language(Env.getCtx()), "CertificateMandatory"));
				dExportCertificates.setVisible(true);
			}

			File exportFile = dExportCertificates.getExportFile();
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
			MStore store = new Query(Env.getCtx(), X_AD_Store.Table_Name, "IsDefault = ?",null)
			.setParameters(Constants.YES).first();			
			if (store == null) {
				store = new MStore(Env.getCtx(), 0, null);				
			}
			store.save();
			HashMap map = store.getProperties();
			map.put("CERTIFICATE", exportFile.getAbsoluteFile());
			map.put("ALIAS", alias);
			JOptionPane.showMessageDialog(null,
					res.getString("ExportKeyPairCertificateChainAction.ExportCertificateChainSuccessful.message"),
					res.getString("ExportKeyPairCertificateChainAction.ExportCertificateChain.Title"),
					JOptionPane.INFORMATION_MESSAGE);
			
//			X_AD_Certificate certificate = new Query(Env.getCtx(), X_AD_Certificate.Table_Name, "Alias = ?", null)
//				.setParameters(alias).first();
//			if (certificate == null) {
//				certificate = new X_AD_Certificate(Env.getCtx(), 0, null);
//				certificate.setAlias(alias);				
//			}			
//			String doc2 = new String(encoded);
//			certificate.setCertificate(doc2);
//			certificate.save();			
			//
			PrivateKey privateKey = (PrivateKey) newKeyStore.getKey(alias, pw.toCharArray());
			Certificate[] certificates = newKeyStore.getCertificateChain(alias);

			Preferences preferences = getUnderlyingPreferences();
			PasswordQualityConfig  passwordQualityConfig = new PasswordQualityConfig(preferences.getBoolean(KSE3_PWDQUALENABLE, false),
					preferences.getBoolean(KSE3_MINPWDQUALENFORCE, false), preferences.getInt(KSE3_MINPWDQUAL, 60));			
			
			DExportKeyPair dExportKeyPair = new DExportKeyPair(null, alias, passwordQualityConfig);
			dExportKeyPair.setLocationRelativeTo(null);
			dExportKeyPair.setVisible(true);

			if (!dExportKeyPair.exportSelected()) {
				return;
			}

			exportFile = dExportKeyPair.getExportFile();
			Password exportPassword = dExportKeyPair.getExportPassword();

			KeyStore pkcs12 = KeyStoreUtil.create(KeyStoreType.PKCS12);
			certificates = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certificates));
			pkcs12.setKeyEntry(alias, privateKey, exportPassword.toCharArray(), certificates);

			KeyStoreUtil.save(pkcs12, exportFile, exportPassword);
						
			map.put("PKCS12", exportFile.getAbsoluteFile());			
			store.setProperties(map);
			store.setIsDefault(true);
			store.save();

			JOptionPane.showMessageDialog(null, res.getString("ExportKeyPairAction.ExportKeyPairSuccessful.message"),
					res.getString("ExportKeyPairAction.ExportKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);			
			
		} catch (Exception ex) {		
			ex.printStackTrace();
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
	private X509Certificate getHeadCertificate(String alias) throws CryptoException {
		return X509CertUtil.orderX509CertChain(getCertificateChain(alias))[0];
	}

	private X509Certificate[] getCertificateChain(String alias) throws CryptoException {
		try {
			//KeyStoreHistory history = kseFrame.getActiveKeyStoreHistory();
			///KeyStore keyStore = history.getCurrentState().getKeyStore();

			X509Certificate[] certChain = X509CertUtil.convertCertificates(newKeyStore.getCertificateChain(alias));

			return certChain;
		} catch (KeyStoreException ex) {
			String message = MessageFormat.format(
					res.getString("ExportKeyPairCertificateChainAction.NoAccessEntry.message"), alias);
			throw new CryptoException(message, ex);
		}
	}
	
	@Override
	public void wizardModelChanged(WizardModelEvent e) {
		// TODO Auto-generated method stub

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

		alias = "";
		try {
			//int keyPairSize = applicationSettings.getGenerateKeyPairSize();
			int keyPairSize = 2048;
			KeyPairType keyPairType = KeyPairType.RSA;
			///KeyStore activeKeyStore = 
			KeyStoreType activeKeyStoreType = KeyStoreType.resolveJce(newKeyStore.getType());
			//KeyStoreHistory history = kseFrame.getActiveKeyStoreHistory();
			//Provider provider = history.getExplicitProvider();
			Provider provider = null;

			DGenerateKeyPair dGenerateKeyPair = new DGenerateKeyPair(null, activeKeyStoreType, keyPairType, keyPairSize);
			dGenerateKeyPair.setLocationRelativeTo(null);
			dGenerateKeyPair.setVisible(true);

			if (!dGenerateKeyPair.isSuccessful()) {
				return "";
			}

			keyPairType = dGenerateKeyPair.getKeyPairType();
			DGeneratingKeyPair dGeneratingKeyPair;

			if (keyPairType != KeyPairType.EC) {
				keyPairSize = dGenerateKeyPair.getKeyPairSize();
				dGeneratingKeyPair = new DGeneratingKeyPair(null, keyPairType, keyPairSize, provider);

				//applicationSettings.setGenerateKeyPairSize(keyPairSize);
				//applicationSettings.setGenerateKeyPairType(keyPairType);
			} else {
				String curveName = dGenerateKeyPair.getCurveName();
				dGeneratingKeyPair = new DGeneratingKeyPair(null, keyPairType, curveName, provider);
			}

			//dGeneratingKeyPair.setLocationRelativeTo(null);
			dGeneratingKeyPair.startKeyPairGeneration();
			dGeneratingKeyPair.setVisible(true);

			KeyPair keyPair = dGeneratingKeyPair.getKeyPair();

			if (keyPair == null) {
				return "";
			}

			DGenerateKeyPairCert dGenerateKeyPairCert = new DGenerateKeyPairCert(null,
					res.getString("GenerateKeyPairAction.GenerateKeyPairCert.Title"), keyPair, keyPairType,
					issuerCert, issuerPrivateKey, provider);
			dGenerateKeyPairCert.setLocationRelativeTo(null);
			dGenerateKeyPairCert.setVisible(true);

			X509Certificate certificate = dGenerateKeyPairCert.getCertificate();

			if (certificate == null) {
				return "";
			}

			//KeyStoreState currentState = history.getCurrentState();
			//KeyStoreState newState = currentState.createBasisForNextState(this);

			//KeyStore keyStore = newState.getKeyStore();

			DGetAlias dGetAlias = new DGetAlias(null,
					res.getString("GenerateKeyPairAction.NewKeyPairEntryAlias.Title"),
					X509CertUtil.getCertificateAlias(certificate));
			dGetAlias.setLocationRelativeTo(null);
			dGetAlias.setVisible(true);
			alias = dGetAlias.getAlias();

			if (alias == null) {
				return "";
			}

			//if (keyStore.containsAlias(alias)) {
			if (newKeyStore.containsAlias(alias)) {
				String message = MessageFormat.format(res.getString("GenerateKeyPairAction.OverWriteEntry.message"),
						alias);

				int selected = JOptionPane.showConfirmDialog(null, message,
						res.getString("GenerateKeyPairAction.NewKeyPairEntryAlias.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return "";
				}
			}

			//Password password = new Password((char[])null);
						
			//KeyStoreType keyStoreType = KeyStoreType.resolveJce(activeKeyStore.getType());
			//PasswordQualityConfig pwdquality = new PasswordQualityConfig(true, false, 2);

			//if (keyStoreType.hasEntryPasswords()) {
//			if (activeKeyStoreType.hasEntryPasswords()) {
//				DGetNewPassword dGetNewPassword = new DGetNewPassword(null,
//						res.getString("GenerateKeyPairAction.NewKeyPairEntryPassword.Title"),
//						passwordQualityConfig);
//				dGetNewPassword.setLocationRelativeTo(null);
//				dGetNewPassword.setVisible(true);
//				password = dGetNewPassword.getPassword();
//
//				if (password == null) {
//					return "";
//				}
//			}

			if (newKeyStore.containsAlias(alias)) {
				newKeyStore.deleteEntry(alias);
				//newState.removeEntryPassword(alias);
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

			newKeyStore.setKeyEntry(alias, keyPair.getPrivate(), pw.toCharArray(), newCertChain);
			//newState.setEntryPassword(alias, password);

			//currentState.append(newState);

			//kseFrame.updateControls(true);

			JOptionPane.showMessageDialog(null,
					res.getString("GenerateKeyPairAction.KeyPairGenerationSuccessful.message"),
					res.getString("GenerateKeyPairAction.GenerateKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError((JFrame) null, ex);
		}

		return alias;
	}
	
	private Preferences getUnderlyingPreferences() {
		// Get underlying Java preferences
		Preferences preferences = Preferences.userRoot().node(PREFS_NODE);
		return preferences;
	}	
	
	private static void initialiseSecurity() throws ClassNotFoundException, InstantiationException,
	IllegalAccessException {

		// Add BouncyCastle provider
		Class<?> bcProvClass = Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
		Provider bcProv = (Provider) bcProvClass.newInstance();
		Security.addProvider(bcProv);
	}
	

}
