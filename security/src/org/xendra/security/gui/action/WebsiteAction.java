package org.xendra.security.gui.action;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.text.MessageFormat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.kse.KSE;
import org.kse.utilities.net.URLs;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class WebsiteAction extends SecurityColumbaAction  {
	private String websiteAddress;

	public enum Target {
		MAIN,
		GITHUB,
		ISSUE_TRACKER
	}

	public WebsiteAction(IFrameMediator frameMediator, Target target) {		
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "Website"));
		switch (target) {
		case GITHUB:
			setData(res.getString("WebsiteAction.GitHubProject.statusbar"),
					res.getString("WebsiteAction.GitHubProject.text"),
					res.getString("WebsiteAction.GitHubProject.tooltip"),
					res.getString("WebsiteAction.image"),
					URLs.GITHUB_PROJECT);
			break;
		case ISSUE_TRACKER:
			setData(res.getString("WebsiteAction.GitHubIssueTracker.statusbar"),
					res.getString("WebsiteAction.GitHubIssueTracker.text"),
					res.getString("WebsiteAction.GitHubIssueTracker.tooltip"),
					res.getString("WebsiteAction.image"),
					URLs.GITHUB_ISSUE_TRACKER);
			break;
		default:
		case MAIN:
			setData(res.getString("WebsiteAction.statusbar"),
					res.getString("WebsiteAction.text"),
					res.getString("WebsiteAction.tooltip"),
					res.getString("WebsiteAction.image"),
					URLs.KSE_WEB_SITE);
			break;
		}		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			Desktop.getDesktop().browse(URI.create(websiteAddress));
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					MessageFormat.format(res.getString("WebsiteAction.NoLaunchBrowser.message"), websiteAddress),
					KSE.getApplicationName(), JOptionPane.INFORMATION_MESSAGE);
		}		
	}
	private void setData(String longDescription, String name, String shortDescription, String image, String url) {
		putValue(LONG_DESCRIPTION, longDescription);
		putValue(NAME, name);
		putValue(SHORT_DESCRIPTION, shortDescription);
		putValue(SMALL_ICON,
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(getClass().getResource(image))));

		websiteAddress = url;
	}	
}
