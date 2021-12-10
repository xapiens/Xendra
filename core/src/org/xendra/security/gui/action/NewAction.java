package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.dialogs.DNewKeyStoreType;
import org.kse.gui.error.DError;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class NewAction extends SecurityColumbaAction {
	private static int untitledCount = 0;
	public NewAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "new"));
		putValue(Constants.ID, "new");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","new"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","new"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			DNewKeyStoreType dNewKeyStoreType = new DNewKeyStoreType(getFrameMediator().getContainer().getFrame());
			dNewKeyStoreType.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dNewKeyStoreType.setVisible(true);

			KeyStoreType keyStoreType = dNewKeyStoreType.getKeyStoreType();

			if (keyStoreType == null) {
				return;
			}

			KeyStore newKeyStore = KeyStoreUtil.create(keyStoreType);

			untitledCount++;
			String untitled = MessageFormat.format(res.getString("NewAction.Untitled"), untitledCount);

			((SecurityEditorFrameController) frameMediator).addKeyStore(newKeyStore, untitled, null, null);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}

}
