package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.error.DError;
import org.kse.gui.jar.DJarInfo;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class JarsAction extends SecurityColumbaAction {
	public JarsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "Jars"));
		putValue(Constants.ID, "Jars");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Jars"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Jars"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			DJarInfo dJarInfo = new DJarInfo(getFrameMediator().getContainer().getFrame());
			dJarInfo.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dJarInfo.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
}
