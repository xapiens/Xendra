package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.util.Env;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.KseRestart;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class ExitAction extends CloseAllAction {
	public ExitAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "exit");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","exit"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","exit"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		exitApplication();
	}

	/**
	 * Exit the application.
	 */
	public void exitApplication() {
		exitApplication(false);
	}

	/**
	 * Exit the application and optionally restart.
	 *
	 * @param restart
	 *            Restart application if true
	 */
	public void exitApplication(boolean restart) {
		// Will any KeyStores be closed by exit?
		boolean keyStoresClosed = (((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory() != null);

		if (!closeAllKeyStores()) {
			return;
		}

		// Save dynamic application settings
		applicationSettings.setSizeAndPosition(((SecurityEditorFrameController) getFrameMediator()).getSizeAndPosition(keyStoresClosed));
		applicationSettings.setRecentFiles(((SecurityEditorFrameController) getFrameMediator()).getRecentFiles());
		applicationSettings.setCurrentDirectory(Env.getMachine().getKeyStoreFolder());
		applicationSettings.save();

		if (restart) {
			KseRestart.restart();
		}

		System.exit(0);
	}	
}
