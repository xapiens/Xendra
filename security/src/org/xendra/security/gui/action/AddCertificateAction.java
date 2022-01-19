package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class AddCertificateAction extends SecurityColumbaAction {
	public AddCertificateAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "addCertificate"));
		putValue(Constants.ID, "addcertificate");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","addCertificate"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","addCertificate"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((SecurityEditorFrameController) frameMediator).actionPerformed(e);
	}
}
