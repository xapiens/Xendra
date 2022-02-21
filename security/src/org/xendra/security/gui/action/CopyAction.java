package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreUtil;
import org.kse.gui.error.DError;
import org.kse.utilities.buffer.Buffer;
import org.kse.utilities.buffer.BufferEntry;
import org.kse.utilities.buffer.KeyBufferEntry;
import org.kse.utilities.buffer.KeyPairBufferEntry;
import org.kse.utilities.buffer.TrustedCertificateBufferEntry;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class CopyAction extends SecurityColumbaAction  {
	public CopyAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "copy"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "copy.png"));
		((SecurityEditorFrameController) frameMediator).register(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BufferEntry bufferEntry = bufferSelectedEntry();

		if (bufferEntry != null) {
			Buffer.populate(bufferEntry);
			((SecurityEditorFrameController)getFrameMediator()).updateControls(false);
		}
	}
	private BufferEntry bufferSelectedEntry() {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController)getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			String alias = ((SecurityEditorFrameController)getFrameMediator()).getSelectedEntryAlias();

			if (alias == null) {
				return null;
			}

			BufferEntry bufferEntry = null;

			KeyStore keyStore = currentState.getKeyStore();

			if (KeyStoreUtil.isKeyEntry(alias, keyStore)) {
				Password password = getEntryPassword(alias, currentState);

				if (password == null) {
					return null;
				}

				Key key = keyStore.getKey(alias, password.toCharArray());

				if (key instanceof PrivateKey) {
					JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
							res.getString("CopyAction.NoCopyKeyEntryWithPrivateKey.message"),
							res.getString("CopyAction.Copy.Title"), JOptionPane.WARNING_MESSAGE);

					return null;
				}

				bufferEntry = new KeyBufferEntry(alias, false, key, password);
			} else if (KeyStoreUtil.isTrustedCertificateEntry(alias, keyStore)) {
				Certificate certificate = keyStore.getCertificate(alias);

				bufferEntry = new TrustedCertificateBufferEntry(alias, false, certificate);
			} else if (KeyStoreUtil.isKeyPairEntry(alias, keyStore)) {
				Password password = getEntryPassword(alias, currentState);

				if (password == null) {
					return null;
				}

				PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
				Certificate[] certificateChain = keyStore.getCertificateChain(alias);

				bufferEntry = new KeyPairBufferEntry(alias, false, privateKey, password, certificateChain);
			}

			return bufferEntry;
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
			return null;
		}
	}
}
