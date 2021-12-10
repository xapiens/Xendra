package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.KeyStore;
import java.security.PublicKey;
import java.text.MessageFormat;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.gui.dialogs.DViewPublicKey;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class TrustedCertificatePublicKeyDetailsAction extends SecurityColumbaAction {
	public TrustedCertificatePublicKeyDetailsAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "TrustedCertificatePublicKeyDetails"));
		putValue(Constants.ID, "TrustedCertificatePublicKeyDetails");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","TrustedCertificatePublicKeyDetails"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","TrustedCertificatePublicKeyDetails"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			KeyStore keyStore = currentState.getKeyStore();
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			PublicKey pubKey = keyStore.getCertificate(alias).getPublicKey();

			DViewPublicKey dViewPublicKey = new DViewPublicKey(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("TrustedCertificatePublicKeyDetailsAction.PubKeyDetailsEntry.Title"), alias), pubKey);
			dViewPublicKey.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dViewPublicKey.setVisible(true);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}

	}
}
