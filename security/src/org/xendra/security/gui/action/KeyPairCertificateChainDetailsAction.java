package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DViewCertificate;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class KeyPairCertificateChainDetailsAction extends SecurityColumbaAction  {

	public KeyPairCertificateChainDetailsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "KeyPairCertificateChainDetails"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security","certdetails.png"));
		((SecurityEditorFrameController) frameMediator).register(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		showCertificateSelectedEntry();
	}
	/**
	 * Show the certificate details of the selected KeyStore entry.
	 */
	public void showCertificateSelectedEntry() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController)getFrameMediator()).getActiveKeyStoreHistory();
			KeyStore keyStore = history.getCurrentState().getKeyStore();
			String alias = ((SecurityEditorFrameController)getFrameMediator()).getSelectedEntryAlias();

			X509Certificate[] certs = X509CertUtil.convertCertificates(keyStore.getCertificateChain(alias));

			DViewCertificate dViewCertificate = new DViewCertificate(frameMediator.getContainer().getFrame(), MessageFormat.format(
					res.getString("KeyPairCertificateChainDetailsAction.CertDetailsEntry.Title"), alias), certs,
					frameMediator, DViewCertificate.EXPORT);
			dViewCertificate.setLocationRelativeTo(frameMediator.getContainer().getFrame());
			dViewCertificate.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(frameMediator.getContainer().getFrame(), ex);
		}
	}	
}
