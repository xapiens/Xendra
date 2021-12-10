package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.security.KeyStore;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.dialogs.DNewKeyStoreType;
import org.kse.gui.error.DError;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class OpenDefaultAction extends OpenAction {
	public OpenDefaultAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "OpenDefault");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","OpenDefault"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","OpenDefault"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		File defaultKeyStoreFile = new File(System.getProperty("user.home"), ".keystore");

		if (defaultKeyStoreFile.isFile()) {
			openKeyStore(defaultKeyStoreFile);
			return;
		}

		int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(),
				res.getString("OpenDefaultAction.NoDefaultKeyStoreCreate.message"),
				res.getString("OpenDefaultAction.OpenDefaultKeyStore.Title"), JOptionPane.YES_NO_OPTION);

		if (selected != JOptionPane.YES_OPTION) {
			return;
		}

		try {
			DNewKeyStoreType dNewKeyStoreType = new DNewKeyStoreType(getFrameMediator().getContainer().getFrame());
			dNewKeyStoreType.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dNewKeyStoreType.setVisible(true);

			KeyStoreType keyStoreType = dNewKeyStoreType.getKeyStoreType();

			if (keyStoreType == null) {
				return;
			}

			Password password = getNewKeyStorePassword();

			if (password == null) {
				return;
			}

			KeyStore defaultKeyStore = KeyStoreUtil.create(keyStoreType);
			KeyStoreUtil.save(defaultKeyStore, defaultKeyStoreFile, password);

			((SecurityEditorFrameController) getFrameMediator()).addKeyStore(defaultKeyStore, defaultKeyStoreFile, password);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
