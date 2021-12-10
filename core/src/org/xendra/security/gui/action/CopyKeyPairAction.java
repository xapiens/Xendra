package org.xendra.security.gui.action;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CopyKeyPairAction extends CopyAction   {
	public CopyKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "copykeypair");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","copykeypair"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","copykeypair"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));				
		((SecurityEditorFrameController) frameMediator).register(this);
	}
}
