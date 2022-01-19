package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.crypto.Password;
import org.kse.crypto.keystore.KeyStoreType;
import org.kse.gui.error.DError;
import org.kse.utilities.buffer.Buffer;
import org.kse.utilities.buffer.BufferEntry;
import org.kse.utilities.buffer.KeyBufferEntry;
import org.kse.utilities.buffer.KeyPairBufferEntry;
import org.kse.utilities.buffer.TrustedCertificateBufferEntry;
import org.kse.utilities.history.HistoryAction;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.gui.frame.SecurityEditorFrameController;
import org.xendra.security.util.ResourceLoader;

public class PasteAction extends SecurityColumbaAction  implements HistoryAction {
	public PasteAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "Paste"));
		putValue(Constants.ID, "Paste");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","Paste"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","Paste"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	@Override
	public String getHistoryDescription() {
		return (String) getValue(NAME);
	}
	public void actionPerformed(ActionEvent e) {
		BufferEntry bufferEntry = Buffer.interrogate();

		if (bufferEntry != null) {
			boolean success = pasteEntry(bufferEntry);

			if (success) {
				((SecurityEditorFrameController) getFrameMediator()).updateControls(true);
			}
		}		
	}
	private boolean pasteEntry(BufferEntry bufferEntry) {
		try {
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();

			KeyStoreState currentState = history.getCurrentState();
			KeyStoreState newState = currentState.createBasisForNextState(this);

			KeyStore keyStore = newState.getKeyStore();

			String alias = bufferEntry.getName();

			if (keyStore.containsAlias(alias)) {
				if (bufferEntry.isCut()) {
					int selected = JOptionPane.showConfirmDialog(getFrameMediator().getContainer().getFrame(),
							MessageFormat.format(res.getString("PasteAction.PasteExistsReplace.message"), alias),
							res.getString("PasteAction.Paste.Title"), JOptionPane.YES_NO_OPTION);

					if (selected != JOptionPane.YES_OPTION) {
						return false;
					}

					keyStore.deleteEntry(alias);
					newState.removeEntryPassword(alias);
				} else {
					alias = getUniqueEntryName(alias, keyStore);
				}
			}

			if (bufferEntry instanceof KeyBufferEntry) {
				KeyStoreType keyStoreType = KeyStoreType.resolveJce(keyStore.getType());

				if (!keyStoreType.supportsKeyEntries()) {
					JOptionPane.showMessageDialog(
							getFrameMediator().getContainer().getFrame(),
							MessageFormat.format(res.getString("PasteAction.NoPasteKeyEntry.message"),
									keyStoreType.friendly()), res.getString("PasteAction.Paste.Title"),
									JOptionPane.WARNING_MESSAGE);

					return false;
				}

				KeyBufferEntry keyBufferEntry = (KeyBufferEntry) bufferEntry;

				Key key = keyBufferEntry.getKey();

				Password password = keyBufferEntry.getPassword();

				keyStore.setKeyEntry(alias, key, password.toCharArray(), null);

				newState.setEntryPassword(alias, password);
			} else if (bufferEntry instanceof KeyPairBufferEntry) {
				KeyPairBufferEntry keyPairBufferEntry = (KeyPairBufferEntry) bufferEntry;

				PrivateKey privateKey = keyPairBufferEntry.getPrivateKey();
				Password password = keyPairBufferEntry.getPassword();

				Certificate[] certificateChain = keyPairBufferEntry.getCertificateChain();

				keyStore.setKeyEntry(alias, privateKey, password.toCharArray(), certificateChain);

				newState.setEntryPassword(alias, password);
			} else {
				TrustedCertificateBufferEntry certBufferEntry = (TrustedCertificateBufferEntry) bufferEntry;

				keyStore.setCertificateEntry(alias, certBufferEntry.getTrustedCertificate());
			}

			if (bufferEntry.isCut()) {
				Buffer.clear();
			}

			currentState.append(newState);

			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);

			return true;
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
			return false;
		}
	}

	private String getUniqueEntryName(String name, KeyStore keyStore) throws KeyStoreException {
		// Get unique KeyStore entry name based on the one supplied, ie *
		// "<name> (n)" where n is a
		// number.
		int i = 1;
		while (true) {
			String tryName = MessageFormat.format("{0} ({1})", name, i);
			if (!keyStore.containsAlias(tryName)) {
				return tryName;
			}
			i++;
		}
	}
}
