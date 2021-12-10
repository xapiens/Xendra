package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CutTrustedCertificateAction extends CutAction {
	public CutTrustedCertificateAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "CutTrustedCertificate");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","CutTrustedCertificate"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","CutTrustedCertificate"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}	
}
