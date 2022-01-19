package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import javax.swing.JTabbedPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class TabStyleScrollAction extends SecurityColumbaAction  {
	public TabStyleScrollAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "TabStyleScroll"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","TabStyleScroll"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","TabStyleScroll"));
		putValue(Constants.ID, "TabStyleScroll");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
		((SecurityEditorFrameController) getFrameMediator()).setKeyStoreTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);        
	}
}
