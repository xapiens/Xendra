package org.columba.core.gui.plugin;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.gui.processmanager.ServerSheetPage.ClientEditor;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.apps.ADialog;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.Constants;

public class PickClientDialog extends JDialog implements ActionListener, VetoableChangeListener {
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private KeyNamePair clientid;
	
	public PickClientDialog(KeyNamePair clientid) {
		setModal(true);
		this.clientid = clientid;
		Components();		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		int AD_Column_ID = MColumn.getColumn_ID(X_C_Order.Table_Name, Constants.COLUMNNAME_AD_Client_ID, null);
		MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
		Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, column.getAD_Reference_ID());		
		VLookup curr = VLookup.create(X_AD_Client.Table_Name, Constants.COLUMNNAME_AD_Client_ID, 0);
		curr.addVetoableChangeListener(this);
		mainPanel.setLayout(new MigLayout("fill"));
		mainPanel.add(curr, "grow");
		getContentPane().add(mainPanel, BorderLayout.NORTH);
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(12, 12, 12, 12));
		buttonPanel.setLayout(new GridLayout(1, 3, 6, 0));
		okButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "ok")); //$NON-NLS-1$ //$NON-NLS-2$
		okButton.setActionCommand("OK"); //$NON-NLS-1$
		okButton.addActionListener(this);
		buttonPanel.add(okButton);
		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "cancel")); //$NON-NLS-1$ //$NON-NLS-2$
		cancelButton.setActionCommand("CANCEL"); //$NON-NLS-1$
		cancelButton.addActionListener(this);		
		buttonPanel.add(cancelButton);
		getRootPane().registerKeyboardAction(this, "CANCEL", //$NON-NLS-1$
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);		
		//
		bottomPanel.add(buttonPanel, BorderLayout.EAST);						
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if (command.equals("CANCEL")) { //$NON-NLS-1$
			clientid = null;
			setVisible(false);
		} else if (command.equals("OK")) { //$NON-NLS-1$
			setVisible(false);
		} 						
	}
	@Override
	public void vetoableChange(PropertyChangeEvent evt)	throws PropertyVetoException {
		Integer key = (Integer) evt.getNewValue();
		clientid = new KeyNamePair(key, evt.getPropertyName());		
	}
	
	public KeyNamePair getClient() {
		return clientid;
	}
}
