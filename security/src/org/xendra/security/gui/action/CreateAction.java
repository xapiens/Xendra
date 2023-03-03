package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFileChooser;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.FileChooserFactory;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.gui.plugin.CertificateWizardLauncher;
import org.xendra.security.gui.plugin.NewKeyStoreLauncher;
import org.xendra.security.util.ResourceLoader;

public class CreateAction extends SecurityColumbaAction {
	public CreateAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "create"));
		putValue(Constants.ID, "create");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","create"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","create"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_NEW));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_NEW));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		NewKeyStoreLauncher nn = new NewKeyStoreLauncher();
		nn.launchWizard();					
	}
}
