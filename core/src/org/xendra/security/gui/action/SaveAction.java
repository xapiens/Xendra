package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class SaveAction extends SaveAsAction {
	public SaveAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","save"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","save"));
		putValue(Constants.ID, "save");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//((SecurityEditorFrameController) frameMediator).actionPerformed(e);
		saveKeyStore(((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory());
	}
	/**
	 * Save the supplied KeyStore back to the file it was originally opened
	 * from.
	 *
	 * @param history
	 *            KeyStore history
	 * @return True if the KeyStore is saved to disk, false otherwise
	 */
	protected boolean saveKeyStore(KeyStoreHistory history) {
		File saveFile = null;

		try {
			KeyStoreState currentState = history.getCurrentState();

			//kseFrame.focusOnKeyStore(currentState.getKeyStore());
			((SecurityEditorFrameController) getFrameMediator()).focusOnKeyStore(currentState.getKeyStore());

			saveFile = history.getFile();

			if (saveFile == null) {
				return saveKeyStoreAs(history);
			}

			Password password = currentState.getPassword();

			if (password == null) {
				SetPasswordAction setPasswordAction = new SetPasswordAction(getFrameMediator());

				if (setPasswordAction.setKeyStorePassword()) {
					currentState = history.getCurrentState();
					password = currentState.getPassword();
				} else {
					return false;
				}
			}
			KeyStoreUtil.save(currentState.getKeyStore(), saveFile, password);

			currentState.setPassword(password);
			currentState.setAsSavedState();

			((SecurityEditorFrameController) getFrameMediator()).updateControls(false);

			return true;
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("SaveAction.NoWriteFile.message"), saveFile),
					res.getString("SaveAction.SaveKeyStore.Title"), JOptionPane.WARNING_MESSAGE);
			return false;
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
			return false;
		}
	}

}