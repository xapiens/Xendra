package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore;
import java.security.PrivateKey;

import java.security.cert.Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.crypto.x509.X509CertUtil;
import org.kse.gui.dialogs.importexport.DExportKeyPair;
import org.kse.gui.error.DError;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class ExportKeyPairAction  extends SecurityColumbaAction {
	public ExportKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "exportkeypair"));
		putValue(Constants.ID, "exportkeypair");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","exportkeypair"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","exportkeypair"));
		putValue(SMALL_ICON, ImageLoader.getSmallIconFromResource("org.xendra.security", "addcertificate.png"));
		putValue(LARGE_ICON, ImageLoader.getLargeIconFromResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		File exportFile = null;

		try {
			KeyStoreHistory history = ((SecurityEditorFrameController)getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			String alias = ((SecurityEditorFrameController)getFrameMediator()).getSelectedEntryAlias();

			Password password = getEntryPassword(alias, currentState);

			if (password == null) {
				return;
			}

			KeyStore keyStore = currentState.getKeyStore();

			PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
			Certificate[] certificates = keyStore.getCertificateChain(alias);

			DExportKeyPair dExportKeyPair = new DExportKeyPair(getFrameMediator().getContainer().getFrame(), alias,
					applicationSettings.getPasswordQualityConfig());
			dExportKeyPair.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dExportKeyPair.setVisible(true);

			if (!dExportKeyPair.exportSelected()) {
				return;
			}

			exportFile = dExportKeyPair.getExportFile();
			Password exportPassword = dExportKeyPair.getExportPassword();

			KeyStore pkcs12 = KeyStoreUtil.create(KeyStoreType.PKCS12);
			certificates = X509CertUtil.orderX509CertChain(X509CertUtil.convertCertificates(certificates));
			pkcs12.setKeyEntry(alias, privateKey, exportPassword.toCharArray(), certificates);

			KeyStoreUtil.save(pkcs12, exportFile, exportPassword);

			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), res.getString("ExportKeyPairAction.ExportKeyPairSuccessful.message"),
					res.getString("ExportKeyPairAction.ExportKeyPair.Title"), JOptionPane.INFORMATION_MESSAGE);
		} catch (FileNotFoundException ex) {
			String message = MessageFormat.format(res.getString("ExportKeyPairAction.NoWriteFile.message"), exportFile);
			JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(), message, res.getString("ExportKeyPairAction.ExportKeyPair.Title"),
					JOptionPane.WARNING_MESSAGE);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
