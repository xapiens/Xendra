package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;

import java.security.cert.Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import static java.awt.Dialog.ModalityType.DOCUMENT_MODAL;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.error.DError;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.kse.gui.password.DChangePassword;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SetKeyPairPasswordAction extends SecurityColumbaAction  implements HistoryAction {

	public SetKeyPairPasswordAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "SetKeyPairPassword"));
		putValue(Constants.ID, "SetKeyPairPassword");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","SetKeyPairPassword"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","SetKeyPairPassword"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	
	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}	


	public void actionPerformed(ActionEvent e) {
		String alias = null;

		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();
			alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			Password oldPassword = newState.getEntryPassword(alias);

			DChangePassword dChangePassword = new DChangePassword(getFrameMediator().getContainer().getFrame(), DOCUMENT_MODAL,
					res.getString("SetKeyPairPasswordAction.SetKeyPairPassword.Title"), oldPassword,
					applicationSettings.getPasswordQualityConfig());
			dChangePassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dChangePassword.setVisible(true);

			if (oldPassword == null) {
				oldPassword = dChangePassword.getOldPassword();
			}
			Password newPassword = dChangePassword.getNewPassword();

			if ((oldPassword == null) || (newPassword == null)) {
				return;
			}

			// Change the password by recreating the entry
			Certificate[] certs = keyStore.getCertificateChain(alias);
			certs = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certs));

			Key privateKey = keyStore.getKey(alias, oldPassword.toCharArray());

			keyStore.deleteEntry(alias);
			newState.removeEntryPassword(alias);

			keyStore.setKeyEntry(alias, privateKey, newPassword.toCharArray(), certs);
			if (currentState.getEntryPassword(alias) == null) {
				currentState.setEntryPassword(alias, oldPassword);
			}

			newState.setEntryPassword(alias, newPassword);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane
			.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("SetKeyPairPasswordAction.SetKeyPairPasswordSuccessful.message"),
					res.getString("SetKeyPairPasswordAction.SetKeyPairPassword.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (GeneralSecurityException ex) {
			String problemStr = MessageFormat.format(
					res.getString("SetKeyPairPasswordAction.NoSetPasswordKeyPairEntry.Problem"), alias);

			String[] causes = new String[] {
					res.getString("SetKeyPairPasswordAction.PasswordIncorrectKeyPairEntry.Cause"),
					res.getString("SetKeyPairPasswordAction.NotSupportedAlgorithmKeyPairEntry.Cause") };

			Problem problem = new Problem(problemStr, causes, ex);

			DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(),
					res.getString("SetKeyPairPasswordAction.ProblemSettingPasswordKeyPairEntry.Title"),
					problem);
			dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dProblem.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
