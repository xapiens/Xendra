package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.AuthorityCertificates;
import org.kse.crypto.CryptoException;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreLoadException;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.error.DError;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.kse.gui.password.DGetPassword;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class AuthorityCertificatesAction extends SecurityColumbaAction {
	
	
	public AuthorityCertificatesAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "authoritycertificates"));
		putValue(Constants.ID, "authoritycertificates");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","authoritycertificates"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","authoritycertificates"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * Get CA Certificates KeyStore.
	 *
	 * @return KeyStore or null if unavailable
	 */
	protected KeyStore getCaCertificates() {
		AuthorityCertificates authorityCertificates = AuthorityCertificates.getInstance();

		KeyStore caCertificates = null;

		if (applicationSettings.getUseCaCertificates()) {
			caCertificates = authorityCertificates.getCaCertificates();

			if (caCertificates == null) {
				caCertificates = loadCaCertificatesKeyStore();

				if (caCertificates != null) {
					authorityCertificates.setCaCertificates(caCertificates);
				}
			}
		}

		return caCertificates;
	}

	/**
	 * Get Windows Trusted Root Certificates KeyStore.
	 *
	 * @return KeyStore or null if unavailable
	 * @throws CryptoException
	 *             If a problem occurred getting the KeyStore
	 */
	protected KeyStore getWindowsTrustedRootCertificates() throws CryptoException {
		AuthorityCertificates authorityCertificates = AuthorityCertificates.getInstance();

		KeyStore windowsTrustedRootCertificates = null;

		if (applicationSettings.getUseWindowsTrustedRootCertificates()) {
			windowsTrustedRootCertificates = authorityCertificates.getWindowsTrustedRootCertificates();
		}

		return windowsTrustedRootCertificates;
	}
	private KeyStore loadCaCertificatesKeyStore() {
		File caCertificatesFile = applicationSettings.getCaCertificatesFile();

		KeyStore caCertificatesKeyStore = null;
		try {

			// first try to open cacerts with default password
			try {
				Password password = new Password(AuthorityCertificates.CACERTS_DEFAULT_PWD.toCharArray());
				caCertificatesKeyStore = KeyStoreUtil.load(caCertificatesFile, password);
				if (caCertificatesFile != null) {
					return caCertificatesKeyStore;
				}
			} catch (KeyStoreLoadException ex) {
				// not default password, continue with password dialog
			}

			DGetPassword dGetPassword = new DGetPassword(frameMediator.getContainer().getFrame(),
					res.getString("AuthorityCertificatesAction.CaCertificatesKeyStorePassword.Title")
					);
			dGetPassword.setLocationRelativeTo(frameMediator.getContainer().getFrame());
			dGetPassword.setVisible(true);
			Password password = dGetPassword.getPassword();

			if (password == null) {
				return null;
			}

			try {
				caCertificatesKeyStore = KeyStoreUtil.load(caCertificatesFile, password);
			} catch (KeyStoreLoadException ex) {
				String problemStr = MessageFormat.format(
						res.getString("AuthorityCertificatesAction.NoOpenCaCertificatesKeyStore.Problem"),
						ex.getKeyStoreType(), caCertificatesFile.getName());

				String[] causes = new String[] {
						res.getString("AuthorityCertificatesAction.PasswordIncorrectKeyStore.Cause"),
						res.getString("AuthorityCertificatesAction.CorruptedKeyStore.Cause") };

				Problem problem = new Problem(problemStr, causes, ex);

				DProblem dProblem = new DProblem(frameMediator.getContainer().getFrame(),
						res.getString("AuthorityCertificatesAction.ProblemOpeningCaCertificatesKeyStore.Title"),
						problem);
				dProblem.setLocationRelativeTo(frameMediator.getContainer().getFrame());
				dProblem.setVisible(true);

				return null;
			}

			if (caCertificatesKeyStore == null) {
				JOptionPane.showMessageDialog(frameMediator.getContainer().getFrame(), MessageFormat.format(
						res.getString("AuthorityCertificatesAction.FileNotRecognisedType.message"),
						caCertificatesFile.getName()), res
						.getString("AuthorityCertificatesAction.OpenCaCertificatesKeyStore.Title"),
						JOptionPane.WARNING_MESSAGE);
				return null;
			}

			return caCertificatesKeyStore;
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(frameMediator.getContainer().getFrame(), MessageFormat.format(
					res.getString("AuthorityCertificatesAction.NoReadFile.message"), caCertificatesFile), res
					.getString("AuthorityCertificatesAction.OpenCaCertificatesKeyStore.Title"),
					JOptionPane.WARNING_MESSAGE);
			return null;
		} catch (Exception ex) {
			DError.displayError(frameMediator.getContainer().getFrame(), ex);
			return null;
		}
	}    
}
