package org.xendra.security.gui.action;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.text.MessageFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.KSE;
import org.kse.gui.dialogs.DCheckUpdate;
import org.kse.gui.error.DError;
import org.kse.utilities.net.URLs;
import org.kse.version.Version;
import org.kse.version.VersionException;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CheckUpdateAction  extends SecurityColumbaAction {
	public CheckUpdateAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "CheckUpdate"));
		putValue(Constants.ID, "CheckUpdate");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","CheckUpdate"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","CheckUpdate"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		DCheckUpdate dCheckUpdate = new DCheckUpdate(getFrameMediator().getContainer().getFrame());
		dCheckUpdate.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
		dCheckUpdate.startCheck();
		dCheckUpdate.setVisible(true);

		Version latestVersion = dCheckUpdate.getLatestVersion();

		if (latestVersion == null) {
			return;
		}

		compareVersions(latestVersion, false);

	}
	public void compareVersions(Version latestVersion, boolean autoUpdateCheck) {

		// abort auto update check if not time yet
		if (autoUpdateCheck) {
			if (!applicationSettings.isAutoUpdateCheckEnabled()) {
				return;
			}
			Date lastCheck = applicationSettings.getAutoUpdateCheckLastCheck();
			Date now = new Date();
			int checkInterval = applicationSettings.getAutoUpdateCheckInterval();
			if (TimeUnit.MILLISECONDS.toDays(now.getTime() - lastCheck.getTime()) < checkInterval) {
				return;
			}
		}

		try {
			Version currentVersion = KSE.getApplicationVersion();

			if (currentVersion.compareTo(latestVersion) >= 0) {
				if (!autoUpdateCheck) {
					JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
							res.getString("CheckUpdateAction.HaveLatestVersion.message"), currentVersion), KSE
							.getApplicationName(), JOptionPane.INFORMATION_MESSAGE);
				}
			} else {

				int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
						res.getString("CheckUpdateAction.NewerVersionAvailable.message"), latestVersion), KSE
						.getApplicationName(), JOptionPane.YES_NO_OPTION);

				if (selected == JOptionPane.YES_OPTION) {
					try {
						Desktop.getDesktop().browse(URI.create(URLs.DOWNLOADS_WEB_ADDRESS));
					} catch (IOException ex) {
						JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
								res.getString("CheckUpdateAction.NoLaunchBrowser.message"),
								URLs.DOWNLOADS_WEB_ADDRESS), KSE.getApplicationName(), JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		} catch (VersionException ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}

}
