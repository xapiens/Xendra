package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.about.DSystemInformation;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SystemInformationAction  extends SecurityColumbaAction  {
	public SystemInformationAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "SystemInformation"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","SystemInformation"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","SystemInformation"));
		putValue(Constants.ID, "saveas");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
        DSystemInformation dSystemInformation = new DSystemInformation(getFrameMediator().getContainer().getFrame());
        dSystemInformation.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
        dSystemInformation.setVisible(true);		
	}

}
