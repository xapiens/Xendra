package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.crypto.DCryptoStrength;
import org.kse.gui.error.DError;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CryptographyStrengthAction extends ExitAction {
	public CryptographyStrengthAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "CryptographyStrength");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","CryptographyStrength"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","CryptographyStrength"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			DCryptoStrength dCryptoStrength = new DCryptoStrength(getFrameMediator().getContainer().getFrame());
			dCryptoStrength.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dCryptoStrength.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
}
