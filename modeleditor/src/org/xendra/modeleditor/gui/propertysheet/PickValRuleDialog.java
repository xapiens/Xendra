package org.xendra.modeleditor.gui.propertysheet;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Enumeration;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

public class PickValRuleDialog extends JDialog implements ActionListener, TreeSelectionListener {
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private DefaultMutableTreeNode root;
	private JTree tree;
	private KeyNamePair valrule;
	public PickValRuleDialog(KeyNamePair valruleid) {
		setModal(true);
		Components();
		pickValRule(valruleid);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private void pickValRule(KeyNamePair valruleid) {
		if (valruleid != null) {			
			Enumeration en = root.preorderEnumeration();
			while (en.hasMoreElements())
			{				
				DefaultMutableTreeNode nd = (DefaultMutableTreeNode)en.nextElement();
				KeyNamePair kp = (KeyNamePair) nd.getUserObject();
				if (kp != null) {				
					if (valruleid.getKey() == kp.getKey()) {
						TreePath treePath = new TreePath(nd.getPath());
						tree.setSelectionPath(treePath);
						tree.makeVisible(treePath);       	//	expand it
						tree.scrollPathToVisible(treePath);																		
						break;	
					}					
				}
			}			
		}
	}
	
	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.NORTH);
		mainPanel.setLayout(new MigLayout("fill"));
		tree = new JTree();
		//tree.setCellRenderer(new MachineCellRenderer(true));
		//root = new MachineNode();
		root = new DefaultMutableTreeNode();
		List<X_AD_Val_Rule> valrules = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "IsActive = 'Y'", null)
			.setOrderBy("name").list();
		for (X_AD_Val_Rule valrule:valrules) {
			DefaultMutableTreeNode n = new DefaultMutableTreeNode();
			KeyNamePair kp = new KeyNamePair(valrule.getAD_Val_Rule_ID(), valrule.getName());
			n.setUserObject(kp);			
			root.add(n);
		}
		DefaultTreeModel model = new DefaultTreeModel(root);
		tree.setModel(model);
		tree.addTreeSelectionListener(this);
		JScrollPane scrollPane = new JScrollPane(tree);
		mainPanel.add(scrollPane, "grow");
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
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getPath();
		if (p == null)
			return;
		DefaultMutableTreeNode selectedFolder = (DefaultMutableTreeNode) p.getLastPathComponent();
		if (selectedFolder != null) {
				valrule = (KeyNamePair) selectedFolder.getUserObject();
		}				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if (command.equals("CANCEL")) { //$NON-NLS-1$
			valrule = null;
			setVisible(false);
		} else if (command.equals("OK")) { //$NON-NLS-1$
			setVisible(false);
		} 						
	}
	
	public KeyNamePair getValRule() {
		return valrule;
	}
	
}
