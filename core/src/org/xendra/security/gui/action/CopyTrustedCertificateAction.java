package org.xendra.security.gui.action;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CopyTrustedCertificateAction extends CopyAction {
	public CopyTrustedCertificateAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "CutTrustedCertificate");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","CopyTrustedCertificate"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","CopyTrustedCertificate"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}	
}
