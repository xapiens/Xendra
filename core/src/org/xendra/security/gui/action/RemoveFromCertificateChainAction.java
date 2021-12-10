package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.X509Certificate;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.error.DError;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class RemoveFromCertificateChainAction  extends SecurityColumbaAction implements HistoryAction {
	public RemoveFromCertificateChainAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "removefromcertificatechain"));
		putValue(Constants.ID, "removefromcertificatechain");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","removefromcertificatechain"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","removefromcertificatechain"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);

			if (password == null) {
				return;
			}

			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			Key privKey = keyStore.getKey(alias, password.toCharArray());

			X509Certificate[] certChain = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(keyStore
					.getCertificateChain(alias)));

			if (certChain.length == 1) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("RemoveFromCertificateChainAction.CannotRemoveOnlyCert.message"),
						res.getString("RemoveFromCertificateChainAction.RemoveFromCertificateChain.Title"),
						JOptionPane.WARNING_MESSAGE);
				return;
			}

			// Certificate to remove is the end one in the chain
			X509Certificate[] newCertChain = new X509Certificate[certChain.length - 1];

			System.arraycopy(certChain, 0, newCertChain, 0, newCertChain.length);

			keyStore.deleteEntry(alias);

			keyStore.setKeyEntry(alias, privKey, password.toCharArray(), newCertChain);

			currentState.append(newState);
			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("RemoveFromCertificateChainAction.RemoveFromCertificateChainSuccessful.message"),
					res.getString("RemoveFromCertificateChainAction.RemoveFromCertificateChain.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}

	}
}
