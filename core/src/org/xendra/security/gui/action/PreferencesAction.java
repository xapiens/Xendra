package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.ApplicationSettings;
import org.kse.AuthorityCertificates;
import org.kse.gui.dialogs.DPreferences;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class PreferencesAction extends ExitAction {

	public PreferencesAction(IFrameMediator frameMediator) {
		super(frameMediator);
		putValue(Constants.ID, "Preferences");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Preferences"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Preferences"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		showPreferences();
	}

	/**
	 * Display the preferences dialog and store the user's choices.
	 */
	public void showPreferences() {
		ApplicationSettings applicationSettings = ApplicationSettings.getInstance();

		File caCertificatesFile = applicationSettings.getCaCertificatesFile();

		DPreferences dPreferences = new DPreferences(getFrameMediator().getContainer().getFrame(), applicationSettings.getUseCaCertificates(),
				caCertificatesFile, applicationSettings.getUseWindowsTrustedRootCertificates(),
				applicationSettings.getEnableImportTrustedCertTrustCheck(),
				applicationSettings.getEnableImportCaReplyTrustCheck(), applicationSettings.getPasswordQualityConfig(),
				applicationSettings.getDefaultDN());
		dPreferences.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
		dPreferences.setVisible(true);

		if (dPreferences.wasCancelled()) {
			return;
		}

		File tmpFile = dPreferences.getCaCertificatesFile();

		if (!tmpFile.equals(caCertificatesFile)) {
			AuthorityCertificates authorityCertificates = AuthorityCertificates.getInstance();
			authorityCertificates.setCaCertificates(null);
		}

		caCertificatesFile = tmpFile;

		applicationSettings.setCaCertificatesFile(caCertificatesFile);
		applicationSettings.setUseCaCertificates(dPreferences.getUseCaCertificates());
		applicationSettings.setUseWindowsTrustedRootCertificates(dPreferences.getUseWinTrustRootCertificates());
		applicationSettings.setEnableImportTrustedCertTrustCheck(dPreferences.getEnableImportTrustedCertTrustCheck());
		applicationSettings.setEnableImportCaReplyTrustCheck(dPreferences.getEnableImportCaReplyTrustCheck());
		applicationSettings.setPasswordQualityConfig(dPreferences.getPasswordQualityConfig());
		applicationSettings.setDefaultDN(dPreferences.getDefaultDN());
		UIManager.LookAndFeelInfo lookFeelInfo = dPreferences.getLookFeelInfo();
		applicationSettings.setLookAndFeelClass(lookFeelInfo.getClassName());

		boolean lookAndFeelDecorated = dPreferences.getLookFeelDecoration();
		applicationSettings.setLookAndFeelDecorated(lookAndFeelDecorated);

		if ((!lookFeelInfo.getClassName().equals(UIManager.getLookAndFeel().getClass().getName()))
				|| (lookAndFeelDecorated != JFrame.isDefaultLookAndFeelDecorated())) {
			// L&F changed - restart required for upgrade to take effect
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("PreferencesAction.LookFeelChanged.message"),
					res.getString("PreferencesAction.LookFeelChanged.Title"), JOptionPane.INFORMATION_MESSAGE);

					exitApplication(true);
		}
	}


}
