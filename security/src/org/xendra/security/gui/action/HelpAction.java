package org.xendra.security.gui.action;

import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.util.ArrayList;

import javax.help.DefaultHelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.help.WindowPresentation;
import javax.swing.Action;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.LnfUtil;
import org.kse.gui.error.DError;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class HelpAction extends SecurityColumbaAction {

	private static final String START_ID = "introduction";
    private DefaultHelpBroker helpBroker;

	public HelpAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "Help"));
		putValue(Constants.ID, "Help");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Help"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Help"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		try {
			if (helpBroker != null) {
				if (helpBroker.isDisplayed()) {
					return; // Help already displayed
				}

				helpBroker.setDisplayed(true); // Help already created but
				// hidden - redisplay
				return;
			}
			createAndDisplayHelp();
		} catch (HelpSetException ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
	private void createAndDisplayHelp() throws HelpSetException {
		URL hsUrl = getClass().getResource(res.getString("HelpAction.HelpSet"));
		HelpSet hs = new HelpSet(getClass().getClassLoader(), hsUrl);

		if (LnfUtil.isDarculaAvailable()) {
			URL hsDarculaUrl = getClass().getResource(res.getString("HelpAction.DarculaHelpSet"));
			HelpSet hsDarcula = new HelpSet(getClass().getClassLoader(), hsDarculaUrl);
			hs.add(hsDarcula);
		}

		helpBroker = new DefaultHelpBroker(hs);

		WindowPresentation windowPresentation = helpBroker.getWindowPresentation();
		windowPresentation.createHelpWindow();

		// Make window immune to modal dialogs in application
		Window helpWindow = windowPresentation.getHelpWindow();
		helpWindow.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);

		// Set help icons - set lots of different sizes to give each OS the most
		// flexibility in choosing an icon for display
		ArrayList<Image> icons = new ArrayList<Image>();
		icons.add(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("HelpAction.image.16x16"))));
		icons.add(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("HelpAction.image.24x24"))));
		icons.add(Toolkit.getDefaultToolkit().createImage(
				getClass().getResource(res.getString("HelpAction.image.32x32"))));

		helpWindow.setIconImages(icons);

		helpBroker.setLocation(new Point(getFrameMediator().getContainer().getFrame().getX() + 25, getFrameMediator().getContainer().getFrame().getY() + 25));
		helpBroker.setSize(new Dimension(850, 600));
		helpBroker.setCurrentID(START_ID);

		helpBroker.setDisplayed(true);
	}

}
