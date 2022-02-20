package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.PublicKey;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.DViewPublicKey;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class KeyPairPublicKeyDetailsAction extends SecurityColumbaAction {

	public KeyPairPublicKeyDetailsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "keypairPublickeydetails"));
		//putValue(Constants.ID, "keypairPublickeydetails");
		//putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","keypairPublickeydetails"));
		//putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","keypairPublickeydetails"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "keypairpubkeydetails.png"));
		//putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "keypairpubkeydetails.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			KeyStore keyStore = currentState.getKeyStore();
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			PublicKey pubKey = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(keyStore
					.getCertificateChain(alias)))[0].getPublicKey();

			DViewPublicKey dViewPublicKey = new DViewPublicKey(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("KeyPairPublicKeyDetailsAction.PubKeyDetailsEntry.Title"), alias), pubKey);
			dViewPublicKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewPublicKey.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}		
	}
}
