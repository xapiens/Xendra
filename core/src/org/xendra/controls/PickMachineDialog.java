package org.xendra.controls;

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
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.gui.processmanager.MachineCellRenderer;
import org.columba.core.gui.processmanager.folder.MachineNode;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;

public class PickMachineDialog extends JDialog implements ActionListener, TreeSelectionListener {
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private JTree tree;
	private MachineNode root;
	private X_A_Machine m_id;
	
	public PickMachineDialog(X_A_Machine machine) {
		setModal(true);
		Components();
		pickIdentifier(machine);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.NORTH);
		mainPanel.setLayout(new MigLayout("fill"));
		tree = new JTree();
		tree.setCellRenderer(new MachineCellRenderer(true));
		root = new MachineNode();
		List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y'", null)
			.list();
		for (X_A_Machine machine:machines) {
			MachineNode n = new MachineNode();
			n.setMachine(machine);
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

	private void pickIdentifier(X_A_Machine var) {
		if (var != null) {
			Enumeration en = root.preorderEnumeration();
			while (en.hasMoreElements())
			{
				MachineNode nd = (MachineNode)en.nextElement();
				X_A_Machine m = nd.getMachine();
				if (m != null) {				
					if (m.getA_Machine_ID() == var.getA_Machine_ID()) {
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
	
	public X_A_Machine getMachine() {
		return m_id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if (command.equals("CANCEL")) { //$NON-NLS-1$
			m_id = null;
			setVisible(false);
		} else if (command.equals("OK")) { //$NON-NLS-1$
			setVisible(false);
		} 				
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getPath();
		if (p == null)
			return;
		MachineNode selectedFolder = (MachineNode) p.getLastPathComponent();
		if (selectedFolder != null) {
				m_id = selectedFolder.getMachine();
		}				
	}


}
