package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.X509Certificate;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.CurrentDirectory;
import org.kse.gui.FileChooserFactory;
import org.kse.gui.error.DError;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class AppendToCertificateChainAction extends SecurityColumbaAction implements HistoryAction {
	public AppendToCertificateChainAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "AppendToCertificateChain"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "appendcert.png"));
		((SecurityEditorFrameController) frameMediator).register(this);
	}
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

			// Certificate to append to is the end one in the chain
			X509Certificate certToAppendTo = certChain[certChain.length - 1];

			if (X509CertUtil.isCertificateSelfSigned(certToAppendTo)) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("AppendToCertificateChainAction.CannotAppendCertSelfSigned.message"),
						res.getString("AppendToCertificateChainAction.AppendToCertificateChain.Title"),
						JOptionPane.WARNING_MESSAGE);
				return;
			}

			File certFile = chooseAppendCertificateFile();
			if (certFile == null) {
				return;
			}

			X509Certificate[] certs = openCertificate(certFile);
			if ((certs == null) || (certs.length == 0)) {
				return;
			}

			if (certs.length > 1) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("AppendToCertificateChainAction.NoMultipleAppendCert.message"),
						res.getString("AppendToCertificateChainAction.AppendToCertificateChain.Title"),
						JOptionPane.WARNING_MESSAGE);
				return;
			}

			X509Certificate certToAppend = certs[0];

			if (!X509CertUtil.verifyCertificate(certToAppendTo, certToAppend)) {
				JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
						res.getString("AppendToCertificateChainAction.AppendCertNotSigner.message"),
						res.getString("AppendToCertificateChainAction.AppendToCertificateChain.Title"),
						JOptionPane.WARNING_MESSAGE);
				return;
			}

			X509Certificate[] newCertChain = new X509Certificate[certChain.length + 1];

			System.arraycopy(certChain, 0, newCertChain, 0, certChain.length);
			newCertChain[newCertChain.length - 1] = certToAppend;

			keyStore.deleteEntry(alias);

			keyStore.setKeyEntry(alias, privKey, password.toCharArray(), newCertChain);

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
					res.getString("AppendToCertificateChainAction.AppendToCertificateChainSuccessful.message"),
					res.getString("AppendToCertificateChainAction.AppendToCertificateChain.Title"),
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}

	}

	private File chooseAppendCertificateFile() {
		JFileChooser chooser = FileChooserFactory.getX509FileChooser();
		chooser.setCurrentDirectory(CurrentDirectory.get());
		chooser.setDialogTitle(res.getString("AppendToCertificateChainAction.AppendToCertificateChain.Title"));
		chooser.setMultiSelectionEnabled(false);

		int rtnValue = chooser.showDialog(getFrameMediator().getContainer().getFrame(),
				res.getString("AppendToCertificateChainAction.AppendCertificate.button"));
		if (rtnValue == JFileChooser.APPROVE_OPTION) {
			File openFile = chooser.getSelectedFile();
			CurrentDirectory.updateForFile(openFile);
			return openFile;
		}
		return null;
	}

	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);		
	}
}
