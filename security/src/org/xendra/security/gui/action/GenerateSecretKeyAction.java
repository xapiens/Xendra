package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.text.MessageFormat;

import javax.crypto.SecretKey;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.secretkey.SecretKeyType;
import org.kse.crypto.secretkey.SecretKeyUtil;
import org.kse.gui.dialogs.DGenerateSecretKey;
import org.kse.gui.dialogs.DGetAlias;
import org.kse.gui.error.DError;
import org.kse.gui.password.DGetNewPassword;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class GenerateSecretKeyAction extends SecurityColumbaAction implements HistoryAction {
	public GenerateSecretKeyAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "GenerateSecretKey"));
		//putValue(Constants.ID, "GenerateSecretKey");
		//putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","GenerateSecretKey"));
		putValue(NAME, ResourceLoader.getString("menu", "mainframe","GenerateSecretKey"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security","genseckey.png"));
		//putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}

	public void actionPerformed(ActionEvent arg0) {
		generateSecret();	
	}

	/**
	 * Generate a secret key in the currently opened KeyStore.
	 */
	public void generateSecret() {
		try {
			int secretKeySize = applicationSettings.getGenerateSecretKeySize();
			SecretKeyType secretKeyType = applicationSettings.getGenerateSecretKeyType();

			DGenerateSecretKey dGenerateSecretKey = new DGenerateSecretKey(getFrameMediator().getContainer().getFrame(), secretKeyType, secretKeySize);
			dGenerateSecretKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGenerateSecretKey.setVisible(true);

			if (!dGenerateSecretKey.isSuccessful()) {
				return;
			}

			secretKeySize = dGenerateSecretKey.getSecretKeySize();
			secretKeyType = dGenerateSecretKey.getSecretKeyType();

			applicationSettings.setGenerateSecretKeySize(secretKeySize);
			applicationSettings.setGenerateSecretKeyType(secretKeyType);

			SecretKey secretKey = SecretKeyUtil.generateSecretKey(secretKeyType, secretKeySize);

			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			DGetAlias dGetAlias = new DGetAlias(getFrameMediator().getContainer().getFrame(),
					res.getString("GenerateSecretKeyAction.NewSecretKeyEntryAlias.Title"), null);
			dGetAlias.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetAlias.setVisible(true);
			String alias = dGetAlias.getAlias();

			if (alias == null) {
				return;
			}

			if (keyStore.containsAlias(alias)) {
				String message = MessageFormat.format(res.getString("GenerateSecretKeyAction.OverWriteEntry.message"),
						alias);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("GenerateSecretKeyAction.NewSecretKeyEntryAlias.Title"),
						JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return;
				}
			}

			Password password = new Password((char[])null);
			KeyStoreType type = KeyStoreType.resolveJce(keyStore.getType());

			if (type.hasEntryPasswords()) {
				DGetNewPassword dGetNewPassword = new DGetNewPassword(getFrameMediator().getContainer().getFrame(),
						res.getString("GenerateSecretKeyAction.NewSecretKeyEntryPassword.Title"),
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

			keyStore.setKeyEntry(alias, secretKey, password.toCharArray(), null);
			newState.setEntryPassword(alias, password);
			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("GenerateSecretKeyAction.SecretKeyGenerationSuccessful.message"),
					res.getString("GenerateSecretKeyAction.GenerateSecretKey.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}	
}
