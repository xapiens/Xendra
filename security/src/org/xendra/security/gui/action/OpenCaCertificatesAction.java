package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.security.KeyStore;

import javax.swing.Action;
import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.kse.AuthorityCertificates;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.dialogs.DNewKeyStoreType;
import org.kse.gui.error.DError;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class OpenCaCertificatesAction extends OpenAction {
	public OpenCaCertificatesAction(IFrameMediator frameMediator) {
		super(frameMediator);
	}
	public void actionPerformed(ActionEvent arg0) {
		File caCertificatesFile = applicationSettings.getCaCertificatesFile();

		if (caCertificatesFile.isFile()) {
			openKeyStore(caCertificatesFile, AuthorityCertificates.CACERTS_DEFAULT_PWD);
			return;
		}

		int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(),
				res.getString("OpenCaCertificatesAction.NoCaCertificatesKeyStoreCreate.message"),
				res.getString("OpenCaCertificatesAction.OpenCaCertificatesKeyStore.Title"), JOptionPane.YES_NO_OPTION);

		if (selected != JOptionPane.YES_OPTION) {
			return;
		}

		try {
			DNewKeyStoreType dNewKeyStoreType = new DNewKeyStoreType(getFrameMediator().getContainer().getFrame());
			dNewKeyStoreType.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dNewKeyStoreType.setVisible(true);

			KeyStoreType keyStoreType = dNewKeyStoreType.getKeyStoreType();

			if (keyStoreType == null) {
				return;
			}

			Password password = getNewKeyStorePassword();

			if (password == null) {
				return;
			}

			KeyStore caCertificatesKeyStore = KeyStoreUtil.create(keyStoreType);
			KeyStoreUtil.save(caCertificatesKeyStore, caCertificatesFile, password);			
			((SecurityEditorFrameController) getFrameMediator()).addKeyStore(caCertificatesKeyStore, caCertificatesFile, password);
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
		}
	}
}
