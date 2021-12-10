package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.CryptoException;
import org.kse.crypto.Password;
import org.kse.gui.error.DError;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class SetPasswordAction extends SecurityColumbaAction implements HistoryAction {
	public SetPasswordAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "setpassword"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","setpassword"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","setpassword"));
		putValue(Constants.ID, "setpassword");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public String getHistoryDescription() {
		return res.getString("SetPasswordAction.History.text");
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (setKeyStorePassword()) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("SetPasswordAction.SetKeyStorePasswordSuccessful.message"),
						res.getString("SetPasswordAction.SetKeyStorePassword.Title"), JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
	/**
	 * Set the active KeyStore's password.
	 *
	 * @return True if successful
	 * @throws CryptoException
	 *             If problem occurred
	 */
	protected boolean setKeyStorePassword() throws CryptoException {
		KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

		KeyStoreState currentState = history.getCurrentState();
		KeyStoreState newState = currentState.createBasisForNextState(this);

		Password password = getNewKeyStorePassword();

		if (password == null) {
			return false;
		}

		newState.setPassword(password);

		currentState.append(newState);

		((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

		return true;
	}

}
