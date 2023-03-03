package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.text.MessageFormat;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.util.Env;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreLoadException;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.FileChooserFactory;
import org.kse.gui.error.DError;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.kse.gui.password.DGetPassword;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.wizard.CreateCertificatePartnerWizardLauncher;

public class OpenAction extends SecurityColumbaAction {
	public OpenAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "Open"));
		putValue(Constants.ID, "Open");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Open"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Open"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		JFileChooser chooser = FileChooserFactory.getKeyStoreFileChooser();
		chooser.setCurrentDirectory(CurrentDirectory.get());
		chooser.setDialogTitle(res.getString("OpenAction.OpenKeyStore.Title"));
		chooser.setMultiSelectionEnabled(false);

		int rtnValue = chooser.showOpenDialog(getFrameMediator().getContainer().getFrame());
		if (rtnValue == JFileChooser.APPROVE_OPTION) {
			File openFile = chooser.getSelectedFile();
			CurrentDirectory.updateForFile(openFile);

			openKeyStore(openFile);
		}		
	}
	/**
	 * Open the supplied KeyStore file from disk.
	 *
	 * @param keyStoreFile
	 *            The KeyStore file
	 */
	public void openKeyStore(File keyStoreFile) {
		openKeyStore(keyStoreFile, null);
	}

	/**
	 * Open the supplied KeyStore file from disk.
	 *
	 * @param keyStoreFile
	 *            The KeyStore file
	 */
	public void openKeyStore(File keyStoreFile, String defaultPassword) {
		try {
			if (!keyStoreFile.isFile()) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(res.getString("OpenAction.NotFile.message"), keyStoreFile),
						res.getString("OpenAction.OpenKeyStore.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			}

			if (isKeyStoreFileOpen(keyStoreFile)) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
						res.getString("OpenAction.NoOpenKeyStoreAlreadyOpen.message"), keyStoreFile), res
						.getString("OpenAction.OpenKeyStore.Title"), JOptionPane.WARNING_MESSAGE);
				return;
			}

			// use (optional) default password for first try
			Password password = (defaultPassword != null) ? new Password(defaultPassword.toCharArray()) : null;

			KeyStore openedKeyStore = null;
			boolean firstTry = true;
			while (true) {
				// show password dialog if no default password was passed or if last try to unlock ks has failed
				if (password == null) {
					password = showPasswordDialog(keyStoreFile);
				}

				// user did not enter password -> abort
				if (password == null) {
					return;
				}

				// try to load keystore
				try {
					openedKeyStore = KeyStoreUtil.load(keyStoreFile, password);
					break;
				} catch (KeyStoreLoadException klex) {

					// show error message only after first try with default password or if no default password set
					if (defaultPassword == null || !firstTry) {

						int tryAgainChoice = showErrorMessage(keyStoreFile, klex);
						if (tryAgainChoice == JOptionPane.NO_OPTION) {
							return;
						}
					}
				}

				// failure, reset password
				password.nullPassword();
				password = null;
				firstTry = false;
			}

			if (openedKeyStore == null) {
				JOptionPane.showMessageDialog(
						getFrameMediator().getContainer().getFrame(),
						MessageFormat.format(res.getString("OpenAction.FileNotRecognisedType.message"),
								keyStoreFile.getName()), res.getString("OpenAction.OpenKeyStore.Title"),
								JOptionPane.WARNING_MESSAGE);
				return;
			}

			//kseFrame.addKeyStore(openedKeyStore, keyStoreFile, password);
			((SecurityEditorFrameController) getFrameMediator()).addKeyStore(openedKeyStore, keyStoreFile, password);
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("OpenAction.NoReadFile.message"), keyStoreFile),
					res.getString("OpenAction.OpenKeyStore.Title"), JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}

	private Password showPasswordDialog(File keyStoreFile) {
		DGetPassword dGetPassword = new DGetPassword(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
				res.getString("OpenAction.UnlockKeyStore.Title"), keyStoreFile.getName()));
		dGetPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
		dGetPassword.setVisible(true);
		return dGetPassword.getPassword();
	}

	private int showErrorMessage(File keyStoreFile, KeyStoreLoadException klex) {
		String problemStr = MessageFormat.format(res.getString("OpenAction.NoOpenKeyStore.Problem"),
				klex.getKeyStoreType().friendly(), keyStoreFile.getName());

		String[] causes = new String[] { res.getString("OpenAction.PasswordIncorrectKeyStore.Cause"),
				res.getString("OpenAction.CorruptedKeyStore.Cause") };

		Problem problem = new Problem(problemStr, causes, klex);

		DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(),
				res.getString("OpenAction.ProblemOpeningKeyStore.Title"), problem);
		dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
		dProblem.setVisible(true);

		int choice = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), res.getString("OpenAction.TryAgain.message"),
				res.getString("OpenAction.TryAgain.Title"), JOptionPane.YES_NO_OPTION);
		return choice;
	}	
}
