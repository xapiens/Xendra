package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.security.GeneralSecurityException;
import java.security.Key;
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
import org.kse.gui.error.DError;
import org.kse.gui.error.DProblem;
import org.kse.gui.error.Problem;
import org.kse.gui.password.DGetPassword;
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

public class CutAction extends SecurityColumbaAction  implements HistoryAction {
	public CutAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "cutaction"));
		//putValue(Constants.ID, "addcertificate");
		//putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","addCertificate"));
		//putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","addCertificate"));
		putValue(SMALL_ICON, ImageLoader.getResource("org.xendra.security", "cut.png"));
		//putValue(LARGE_ICON, ImageLoader.getResource("org.xendra.security", "addcertificate.png"));		
		((SecurityEditorFrameController) frameMediator).register(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		BufferEntry bufferEntry = bufferSelectedEntry();

		if (bufferEntry != null) {
			Buffer.populate(bufferEntry);
			//kseFrame.updateControls(true);
			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);
		}
	}

	private BufferEntry bufferSelectedEntry() {
		try {
			
			//KeyStoreHistory history = kseFrame.getActiveKeyStoreHistory();
			KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
			KeyStoreState currentState = history.getCurrentState();

			//String alias = kseFrame.getSelectedEntryAlias();
			String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

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
							res.getString("CutAction.NoCutKeyEntryWithPrivateKey.message"),
							res.getString("CutAction.Cut.Title"), JOptionPane.WARNING_MESSAGE);

					return null;
				}

				bufferEntry = new KeyBufferEntry(alias, true, key, password);
			} else if (KeyStoreUtil.isTrustedCertificateEntry(alias, keyStore)) {
				Certificate certificate = keyStore.getCertificate(alias);

				bufferEntry = new TrustedCertificateBufferEntry(alias, true, certificate);
			} else if (KeyStoreUtil.isKeyPairEntry(alias, keyStore)) {
				Password password = getEntryPassword(alias, currentState);

				if (password == null) {
					return null;
				}

				PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
				Certificate[] certificateChain = keyStore.getCertificateChain(alias);

				bufferEntry = new KeyPairBufferEntry(alias, true, privateKey, password, certificateChain);
			}

			KeyStoreState newState = currentState.createBasisForNextState(this);

			keyStore = newState.getKeyStore();

			keyStore.deleteEntry(alias);
			newState.removeEntryPassword(alias);

			currentState.append(newState);

			return bufferEntry;
		} catch (Exception ex) {
			DError.displayError(getFrameMediator().getContainer().getFrame(), ex);
			return null;
		}
	}

	/**
	 * Get an entry's password. Queries the KeyStore history first and, if the
	 * password is not found there, asks the user for it.
	 *
	 * @param alias
	 *            Entry alias
	 * @param state
	 *            KeyStore state
	 * @return Password or null if it could not be retrieved
	 */
	protected Password getEntryPassword(String alias, KeyStoreState state) {
		Password password = state.getEntryPassword(alias);

		if (password == null) {
			if (!KeyStoreType.resolveJce(state.getKeyStore().getType()).hasEntryPasswords()) {
				password = new Password((char[])null);
			} else {
				password = unlockEntry(alias, state);
			}
		}

		return password;
	}

	/**
	 * Unlock a key or key pair entry. Updates the KeyStore history with the
	 * password.
	 *
	 * @param alias
	 *            Entry's alias
	 * @param state
	 *            KeyStore state
	 * @return Key pair password if successful, null otherwise
	 */
	protected Password unlockEntry(String alias, KeyStoreState state) {
		try {
			KeyStore keyStore = state.getKeyStore();

			DGetPassword dGetPassword = new DGetPassword(getFrameMediator().getContainer().getFrame(), MessageFormat.format(
					res.getString("KeyStoreExplorerAction.UnlockEntry.Title"), alias));
			dGetPassword.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dGetPassword.setVisible(true);
			Password password = dGetPassword.getPassword();

			if (password == null) {
				return null;
			}

			keyStore.getKey(alias, password.toCharArray()); // Test password is correct

			state.setEntryPassword(alias, password);
			//kseFrame.updateControls(true);
			((SecurityEditorFrameController) getFrameMediator()).updateControls(true);
			return password;
		} catch (GeneralSecurityException ex) {
			String problemStr = MessageFormat.format(res.getString("KeyStoreExplorerAction.NoUnlockEntry.Problem"),
					alias);

			String[] causes = new String[] { res.getString("KeyStoreExplorerAction.PasswordIncorrectEntry.Cause") };

			Problem problem = new Problem(problemStr, causes, ex);

			DProblem dProblem = new DProblem(getFrameMediator().getContainer().getFrame(),
					res.getString("KeyStoreExplorerAction.ProblemUnlockingEntry.Title"),
					problem);
			dProblem.setLocationRelativeTo(getFrameMediator().getContainer().getFrame());
			dProblem.setVisible(true);

			return null;
		}
	}

	@Override
	public String getHistoryDescription() {		
		return (String) getValue(NAME);
	}
	
}
