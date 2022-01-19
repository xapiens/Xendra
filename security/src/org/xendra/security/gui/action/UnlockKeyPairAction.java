package org.xendra.security.gui.action;

import java.awt.event.ActionEvent;
import java.text.MessageFormat;

import javax.swing.JOptionPane;

import org.columba.api.gui.frame.IFrameMediator;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.kse.KSE;
import org.kse.crypto.Password;
import org.kse.utilities.history.KeyStoreHistory;
import org.kse.utilities.history.KeyStoreState;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.gui.frame.SecurityEditorFrameController;

public class UnlockKeyPairAction extends SecurityColumbaAction  {

	public UnlockKeyPairAction(IFrameMediator frameMediator) {
		super(frameMediator, ResourceLoader.getString("menu", "mainframe", "unlockkeypair"));
		putValue(Constants.ID, "unlockkeypair");
		putValue(SHORT_DESCRIPTION, ResourceLoader.getString("menu","mainframe","unlockkeypair"));
		putValue(TOOLBAR_NAME, ResourceLoader.getString("menu", "mainframe","unlockkeypair"));
		putValue(SMALL_ICON, ImageLoader.getSmallIcon(IconKeys.FOLDER_OPEN));
		putValue(LARGE_ICON, ImageLoader.getIcon(IconKeys.FOLDER_OPEN));		
		((SecurityEditorFrameController) frameMediator).register(this);
	}
	public void actionPerformed(ActionEvent e) {
        KeyStoreHistory history = ((SecurityEditorFrameController) getFrameMediator()).getActiveKeyStoreHistory();
        KeyStoreState currentState = history.getCurrentState();

        String alias = ((SecurityEditorFrameController) getFrameMediator()).getSelectedEntryAlias();

        Password password = currentState.getEntryPassword(alias);

        if (password != null) {
                JOptionPane.showMessageDialog(getFrameMediator().getContainer().getFrame(),
                                MessageFormat.format(res.getString("UnlockKeyPairAction.KeyPairAlreadyUnlocked.message"), alias),
                                KSE.getApplicationName(), JOptionPane.WARNING_MESSAGE);
                return;
        }

        unlockEntry(alias, currentState);		
	}
}
