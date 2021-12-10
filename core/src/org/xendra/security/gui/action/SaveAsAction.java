package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.util.Env;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.FileChooserFactory;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SaveAsAction extends SecurityColumbaAction  {
	public SaveAsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "saveas"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","saveas"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","saveas"));
		putValue(Constants.ID, "saveas");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
		saveKeyStoreAs(((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory());
	}

	/**
	 * Save the supplied opened KeyStore to disk to what may be a different file
	 * from the one it was opened from (if any).
	 *
	 * @param history
	 *            KeyStore history
	 * @return True if the KeyStore is saved to disk, false otherwise
	 */
	protected boolean saveKeyStoreAs(KeyStoreHistory history) {
		File saveFile = null;

		try {
			KeyStoreState currentState = history.getCurrentState();

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

			JFileChooser chooser = FileChooserFactory.getKeyStoreFileChooser();
			chooser.setCurrentDirectory(Env.getMachine().getKeyStoreFolder());
			chooser.setDialogTitle(res.getString("SaveAsAction.SaveKeyStoreAs.Title"));
			chooser.setMultiSelectionEnabled(false);

			int rtnValue = chooser.showSaveDialog(getFrameMediator().getContainer().getFrame());
			if (rtnValue != JFileChooser.APPROVE_OPTION) {
				return false;
			}
			saveFile = chooser.getSelectedFile();
			CurrentDirectory.updateForFile(saveFile);
			if (saveFile.isFile()) {
				String message = MessageFormat.format(res.getString("SaveAsAction.OverWriteFile.message"), saveFile);

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), message,
						res.getString("SaveAsAction.SaveKeyStoreAs.Title"), JOptionPane.YES_NO_OPTION);
				if (selected != JOptionPane.YES_OPTION) {
					return false;
				}
			}

			if (isKeyStoreFileOpen(saveFile)) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("SaveAsAction.NoSaveKeyStoreAlreadyOpen.message"),
						res.getString("SaveAsAction.SaveKeyStoreAs.Title"), JOptionPane.WARNING_MESSAGE);
				return false;
			}

			KeyStoreUtil.save(currentState.getKeyStore(), saveFile, password);

			currentState.setPassword(password);
			history.setFile(saveFile);
			currentState.setAsSavedState();

			((SecurityEditorFrameController) getFrameMediator()).updateControls(false);

			((SecurityEditorFrameController) getFrameMediator()).addRecentFile(saveFile);

			return true;
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("SaveAsAction.NoWriteFile.message"), saveFile),
					res.getString("SaveAsAction.SaveKeyStoreAs.Title"), JOptionPane.WARNING_MESSAGE);
			return false;
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
			return false;
		}
	}
}
