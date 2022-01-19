package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.dialogs.DExamineSsl;
import org.kse.gui.dialogs.DExaminingSsl;
import org.kse.gui.dialogs.DViewCertificate;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.ssl.SslConnectionInfos;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class ExamineSslAction  extends SecurityColumbaAction {
	public ExamineSslAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "ExamineSsl"));
		putValue(Constants.ID, "ExamineClipboard");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","ExamineSsl"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","ExamineSsl"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			DExamineSsl dExamineSsl = new DExamineSsl(getFrameMediator().getContainer().getFrame(), getFrameMediator());
			dExamineSsl.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExamineSsl.setVisible(true);

			String sslHost = dExamineSsl.getSslHost();
			int sslPort = dExamineSsl.getSslPort();
			boolean useClientAuth = dExamineSsl.useClientAuth();
			KeyStoreHistory ksh = dExamineSsl.getKeyStore();

			if (dExamineSsl.wasCancelled()) {
				return;
			}

			DExaminingSsl dExaminingSsl = new DExaminingSsl(getFrameMediator().getContainer().getFrame(), sslHost, sslPort, useClientAuth, ksh);
			dExaminingSsl.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExaminingSsl.startExamination();
			dExaminingSsl.setVisible(true);

			SslConnectionInfos sslInfos = dExaminingSsl.getSSLConnectionInfos();

			if (sslInfos == null || sslInfos.getServerCertificates() == null) {
				return;
			}

			DViewCertificate dViewCertificate = new DViewCertificate(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("ExamineSslAction.CertDetailsSsl.Title"), sslHost, Integer.toString(sslPort)),
					sslInfos.getServerCertificates(), getFrameMediator(), DViewCertificate.IMPORT);
			dViewCertificate.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewCertificate.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
