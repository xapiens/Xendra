package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class ShowHideToolBarAction extends SecurityColumbaAction  {
	public ShowHideToolBarAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ShowHideToolBar"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","ShowHideToolBar"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","ShowHideToolBar"));
		putValue(Constants.ID, "ShowHideToolBar");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
        //kseFrame.showHideToolBar();
        ((SecurityEditorFrameController) getFrameMediator()).showHideToolBar();
	}
}
