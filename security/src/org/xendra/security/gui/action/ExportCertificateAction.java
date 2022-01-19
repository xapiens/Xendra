package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class ExportCertificateAction extends SecurityColumbaAction {
	public ExportCertificateAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "exportCertificate"));
		putValue(Constants.ID, "exportcertificate");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","exportCertificate"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","exportCertificate"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "certificateexport.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "certificateexport.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((SecurityEditorFrameController) frameMediator).actionPerformed(e);
	}
}
