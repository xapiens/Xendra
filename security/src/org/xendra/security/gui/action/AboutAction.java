package org.xendra.security.gui.action;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.KSE;
import org.kse.gui.LnfUtil;
import org.kse.gui.about.DAbout;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class AboutAction extends SecurityColumbaAction {
	public AboutAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "About"));
		putValue(Constants.ID, "About");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","About"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","About"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		showAbout();
	}
	/**
	 * Display the about dialog.
	 */
	public void showAbout() {
		Object[] tickerItems = { res.getString("AboutAction.Copyright"), res.getString("AboutAction.Acknowledgement1"),
				res.getString("AboutAction.Acknowledgement2"), res.getString("AboutAction.Acknowledgement3"),
				res.getString("AboutAction.Acknowledgement4"), res.getString("AboutAction.Acknowledgement5"),
				res.getString("AboutAction.Acknowledgement6"), res.getString("AboutAction.Acknowledgement7"),
				LnfUtil.isDarculaAvailable() ? res.getString("AboutAction.Acknowledgement8") : "",
		};

		URL aboutDialogImageURL = AboutAction.class.getResource(res.getString("AboutAction.About.image"));
		DAbout dAbout = new DAbout(getFrameMediator().getContainer().getFrame(),
				MessageFormat.format(res.getString("AboutAction.About.Title"), KSE.getApplicationName()),
				res.getString("AboutAction.License"),
				Toolkit.getDefaultToolkit().createImage(aboutDialogImageURL), tickerItems);
		dAbout.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
		dAbout.setVisible(true);
	}
}
