package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.gui.plugin.NewRepositoryLauncher;
import org.xendra.security.util.ResourceLoader;

public class CreateRepositoryAction extends SecurityColumbaAction {
	public CreateRepositoryAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "createrepository"));
		putValue(Constants.ID, "createrepository");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","createrepository"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","createrepository"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_NEW));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_NEW));		
		((SecurityEditorFrameController) frameMediator).register(this);		
	}
	public void actionPerformed(ActionEvent e) {
		NewRepositoryLauncher nn = new NewRepositoryLauncher();
		nn.launchWizard();			
	}
}
