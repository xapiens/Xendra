package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.crypto.keystore.MsCapiStoreType;
import org.kse.gui.error.DError;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

/**
 * Action to open the PKCS11 KeyStore. If it does not exist provide the
 * user with the option of creating it.
 *
 */
public class OpenMsCapiAction extends OpenAction {
	public OpenMsCapiAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "OpenMsCapi");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","OpenMsCapi"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","OpenMsCapi"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		try {

			KeyStore openedKeyStore = KeyStoreUtil.loadMsCapiStore(MsCapiStoreType.PERSONAL);

			// https://bugs.openjdk.java.net/browse/JDK-6407454
			// "The SunMSCAPI provider doesn't support access to the RSA keys that it generates.
			// Users of the keytool utility must omit the SunMSCAPI provider from the -provider option and
			// applications must not specify the SunMSCAPI provider."

			((SecurityEditorFrameController) getFrameMediator()).addKeyStore(openedKeyStore, res.getString("OpenMsCapiAction.TabTitle"), null, null);

		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
}
