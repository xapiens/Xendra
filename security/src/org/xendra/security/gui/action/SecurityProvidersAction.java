package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.crypto.DProviderInfo;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class SecurityProvidersAction extends SecurityColumbaAction  {
	public SecurityProvidersAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "SecurityProviders"));
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","SecurityProviders"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","SecurityProviders"));
		putValue(Constants.ID, "SecurityProviders");
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.DOCUMENT_SAVE));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.DOCUMENT_SAVE));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
        DProviderInfo dProviderInfo = new DProviderInfo(getFrameMediator().getContainer().getFrame());
        dProviderInfo.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
        dProviderInfo.setVisible(true);		
	}
}
