package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.gui.action.AbstractColumbaAction;
import org.kse.ApplicationSettings;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.kse.gui.password.DGetNewPassword;
import org.kse.gui.password.DGetPassword;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SecurityColumbaAction extends AbstractColumbaAction {

	protected ApplicationSettings applicationSettings;
	/** Resource bundle */
	protected static ResourceBundle res = ResourceBundle.getBundle("org/kse/gui/actions/resources");

	public SecurityColumbaAction(IFrameMediator frameMediator, String name) {
		super(frameMediator, name);
		this.frameMediator = frameMediator;
	}	
	//	public SecurityColumbaAction(IFrameMediator frameMediator) {
	//		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "authoritycertificates"));
	//		putValue(Constants.ID, "authoritycertificates");
	//		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","authoritycertificates"));
	//		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","authoritycertificates"));
	//		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
	//		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
	//		setEnabled(true);
	//		((SecurityEditorFrameController) frameMediator).register(this);
	//	}

	/**
	 * Open a certificate file.
	 *
	 * @param certificateFile
	 *            The certificate file
	 * @return The certificates found in the file or null if open failed
	 */
	protected X509Certificate[] openCertificate(File certificateFile) {
		try {
			FileInputStream is = new FileInputStream(certificateFile);
			return openCertificate(is, certificateFile.getName());
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(frameMediator.getContainer().getFrame(),
					MessageFormat.format(res.getString("KeyStoreExplorerAction.NoReadFile.message"), certificateFile),
					res.getString("KeyStoreExplorerAction.OpenCertificate.Title"), JOptionPane.WARNING_MESSAGE);
			return null;
		}
	}

	/**
	 * Open a certificate input stream.
	 *
	 * @param certificateFile
	 *            The certificate file
	 * @return The certificates found in the file or null if open failed
	 */
	protected X509Certificate[] openCertificate(InputStream is, String name) {

		try {
			X509Certificate[] certs = X509CertUtil.loadCertificates(is);

			if (certs.length == 0) {
				JOptionPane.showMessageDialog(frameMediator.getContainer().getFrame(),
						MessageFormat.format(res.getString("KeyStoreExplorerAction.NoCertsFound.message"), name),
						res.getString("KeyStoreExplorerAction.OpenCertificate.Title"), JOptionPane.WARNING_MESSAGE);
			}

			return certs;
		} catch (Exception ex) {
			String problemStr = MessageFormat.format(res.getString("KeyStoreExplorerAction.NoOpenCert.Problem"), name);

			String[] causes = new String[] { res.getString("KeyStoreExplorerAction.NotCert.Cause"),
					res.getString("KeyStoreExplorerAction.CorruptedCert.Cause") };

			Problem problem = new Problem(problemStr, causes, ex);

			DProblem dProblem = new DProblem(frameMediator.getContainer().getFrame(), res.getString("KeyStoreExplorerAction.ProblemOpeningCert.Title"),
					problem);
			dProblem.setLocationRelativeTo(frameMediator.getContainer().getFrame());
			dProblem.setVisible(true);

			return null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	
    /**
     * Get an entry's password. Queries the KeyStore history first and, if the
     * password is not found there, asks the user for it.
     *
     * @param alias
     *            Entry alias
     * @param state
     *            KeyStore state
     * @return Password or null if it could not be retrieved
     */
	protected Password getEntryPassword(String alias, KeyStoreState state) {
		Password password = state.getEntryPassword(alias);

		if (password == null) {
			if (!KeyStoreType.resolveJce(state.getKeyStore().getType()).hasEntryPasswords()) {
				password = new Password((char[])null);
			} else {
				password = unlockEntry(alias, state);
			}
		}

		return password;
	}


	protected Password unlockEntry(String alias, KeyStoreState state) {
		try {
			KeyStore keyStore = state.getKeyStore();

			DGetPassword dGetPassword = new DGetPassword(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("KeyStoreExplorerAction.UnlockEntry.Title"), alias));
			dGetPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetPassword.setVisible(true);
			Password password = dGetPassword.getPassword();

			if (password == null) {
				return null;
			}

			keyStore.getKey(alias, password.toCharArray()); // Test password is correct

			state.setEntryPassword(alias, password);
			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);			
			return password;
		} catch (GeneralSecurityException ex) {
			String problemStr = MessageFormat.format(res.getString("KeyStoreExplorerAction.NoUnlockEntry.Problem"),
					alias);

			String[] causes = new String[] { res.getString("KeyStoreExplorerAction.PasswordIncorrectEntry.Cause") };

			Problem problem = new Problem(problemStr, causes, ex);

			DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(),
					res.getString("KeyStoreExplorerAction.ProblemUnlockingEntry.Title"),
					problem);
			dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dProblem.setVisible(true);

			return null;
		}
	}


    /**
     * Is the supplied KeyStore file open?
     *
     * @param keyStoreFile
     *            KeyStore file
     * @return True if it is
     */
    protected boolean isKeyStoreFileOpen(File keyStoreFile) {
            KeyStoreHistory[] histories = ((SecurityEditorFrameController) getFrameMediator()).getKeyStoreHistories();

            for (int i = 0; i < histories.length; i++) {
                    File f = histories[i].getFile();

                    if (f != null && f.equals(keyStoreFile)) {
                            return true;
                    }
            }

            return false;
    }

	/**
	 * Get a new KeyStore password.
	 *
	 * @return The new KeyStore password, or null if none entered by the user
	 */
	protected Password getNewKeyStorePassword() {
		DGetNewPassword dGetNewPassword = new DGetNewPassword(getFrameMediator().getContainer().getFrame(),
				res.getString("KeyStoreExplorerAction.SetKeyStorePassword.Title"),
				ApplicationSettings.getInstance().getPasswordQualityConfig());
		dGetNewPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
		dGetNewPassword.setVisible(true);

		Password password = dGetNewPassword.getPassword();

		return password;
	}
}
