package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class ExportAsciiAction extends SecurityColumbaAction {
	public ExportAsciiAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "exportAscii"));
		putValue(Constants.ID, "exportascii");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","exportAscii"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","exportAscii"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "certificateascii.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "certificateascii.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((SecurityEditorFrameController) frameMediator).actionPerformed(e);
	}
}
