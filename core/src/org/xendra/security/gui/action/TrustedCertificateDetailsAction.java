package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DViewCertificate;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class TrustedCertificateDetailsAction extends SecurityColumbaAction {
	public TrustedCertificateDetailsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "TrustedCertificateDetails"));
		putValue(Constants.ID, "TrustedCertificateDetails");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","TrustedCertificateDetails"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","TrustedCertificateDetails"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		showCertificateSelectedEntry();
	}
    /**
     * Show the certificate details of the selected KeyStore entry.
     */
    public void showCertificateSelectedEntry() {
            try {
                    KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
                    KeyStore keyStore = history.getCurrentState().getKeyStore();
                    String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

                    X509Certificate[] certs = new X509Certificate[1];
                    certs[0] = X509CertUtil.convertCertificate(keyStore.getCertificate(alias));

                    DViewCertificate dViewCertificate = new DViewCertificate(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
                                    res.getString("TrustedCertificateDetailsAction.CertDetailsEntry.Title"), alias), certs,
                                    getFrameMediator(), DViewCertificate.EXPORT);
                    dViewCertificate.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
                    dViewCertificate.setVisible(true);
            } catch (Exception ex) {
                    DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
            }
    }	
}
