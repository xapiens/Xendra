package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.dialogs.DProperties;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class PropertiesAction extends SecurityColumbaAction {
	public PropertiesAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "Properties"));
		putValue(Constants.ID, "Properties");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Properties"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Properties"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			DProperties dProperties = new DProperties(getFrameMediator().getContainer().getFrame(), history);
			dProperties.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dProperties.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
}
