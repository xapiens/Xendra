//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the 
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License 
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.

package org.columba.core.gui.statusbar;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.statusbar.process.ServerProperties;
import org.columba.core.help.HelpManager;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.frapuccino.swing.JTreeUtil;
import org.frapuccino.treetable.Tree;
import org.frapuccino.treetable.TreeTable;
import org.xendra.Constants;
import org.xendra.rules.ProcessNode;
import org.xendra.rules.NetworkModel;
import org.xendra.rules.ProcessManager;
import org.xendra.rules.ServerProcessInfo;
import org.xendra.rules.wizard.ProcessWizardLauncher;
import javax.swing.JSplitPane;

/**
 * Dialog showing all running Print tasks.
 * <p>
 * Lets the user cancel or print tasks.
 * 
 * @author xapiens
 */
public class ProcessManagerDialog extends JDialog implements ActionListener, /*TreeSelectionListener,*/ ListSelectionListener
{
	static protected String[] columnNames = { "Name","Rule","Last Run","Next Run","Frequency Type","Frequency","Tag"};
	private static ProcessManagerDialog instance;
	private ProcessManager pm;
	private ProcessNode root;
	private NetworkModel model;
	private TreeTable treeTable;
	private ProcessNode selectedNode;
	private ButtonWithMnemonic infoButton;
	private JScrollPane pane;
	protected ServerProperties propertysheet;


	public ProcessManagerDialog(ProcessManager processManager) {
		super((JFrame) null, "Process Manager", false);
		initComponents(processManager);
		pack();
		setLocationRelativeTo(null);
		pm = processManager;
	}

	public static ProcessManagerDialog createInstance(ProcessManager pm) {
		if (instance == null) {
			instance = new ProcessManagerDialog(pm);
		}
		if (!instance.isVisible()) {
			instance.setVisible(true);
		}
		instance.toFront();

		return instance;
	}

	private void updateModel(ProcessManager pm) {
		root = new ProcessNode();
		root.setName("root");
		for (X_A_Machine machine:pm.getMachines())
		{
			ProcessNode child = new ProcessNode(machine);
			child.settype(ProcessNode.Host);
			for (X_AD_Process_Machine procmachine:pm.getProcess(machine))
			{
				ProcessNode procchild = new ProcessNode(procmachine);
				procchild.settype(ProcessNode.Process);
				child.add(procchild);
			}				
			for (ServerProcessInfo procserverinfo:pm.getServerProcess(machine))
			{
				ProcessNode procchild = new ProcessNode(procserverinfo);
				procchild.settype(ProcessNode.ServerProcess);
				child.add(procchild);
			}
			for (X_A_MachineServer machineserver:pm.getMachineServers(machine))
			{
				ProcessNode procchild = new ProcessNode(machineserver);
				procchild.settype(ProcessNode.MachineServer);
				child.add(procchild);
			}
			if (child.getChildCount() > 0)
				root.add(child);
		}
		if (model == null)
		{			
			model = new NetworkModel(columnNames);
			model.setTree((Tree)treeTable.getTree());
		}
		model.setRoot(root);
		treeTable.setModel(model);
		JTreeUtil.expandAll(treeTable.getTree(), true);
		model.fireTableDataChanged();
	}

	public void initComponents(ProcessManager pm) {		
		treeTable = new TreeTable();		
		updateModel(pm);									
		treeTable.getSelectionModel().addListSelectionListener(this);
		pane = new JScrollPane(treeTable);		

		propertysheet = new ServerProperties();
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		JSplitPane splitPane = new JSplitPane();
		splitPane.setLeftComponent(pane);
		splitPane.setRightComponent(propertysheet);
		mainPanel.add(splitPane, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 6, 0));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		ButtonWithMnemonic addButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("", "global", "add"));
		addButton.setActionCommand(Constants.ADD);
		addButton.addActionListener(this);
		addButton.setEnabled(true);
		buttonPanel.add(addButton);

		infoButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("","global","info"));
		infoButton.setActionCommand(Constants.INFO);
		infoButton.addActionListener(this);
		infoButton.setEnabled(false);
		buttonPanel.add(infoButton);

		ButtonWithMnemonic closeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("", "global", "close"));
		closeButton.setActionCommand(Constants.CLOSE); //$NON-NLS-1$
		closeButton.addActionListener(this);
		buttonPanel.add(closeButton);

		ButtonWithMnemonic helpButton = new ButtonWithMnemonic(
				GlobalResourceLoader.getString("", "global", "help"));
		buttonPanel.add(helpButton);

		// associate with JavaHelp
		HelpManager.getInstance().enableHelpOnButton(helpButton,"organising_and_managing_your_email_3");
		HelpManager.getInstance().enableHelpKey(getRootPane(),"organising_and_managing_your_email_3");				
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
	}


	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals(Constants.CLOSE)) {
			setVisible(false);
		} else if (action.equals(Constants.CANCEL)) {

		} else if (action.equals("KILL")) {

		} else if (action.equals("REFRESH")) {
			//UpdatePendings();
		} else if (action.equals(Constants.ADD)) {
			ProcessWizardLauncher nn = new ProcessWizardLauncher();	
			nn.launchWizard();
			updateModel(pm);
		} else if (action.equals(Constants.INFO)) {
			ProcessChangeDialog pcd = new ProcessChangeDialog((ProcessNode) selectedNode);
			if (pcd.ischanged())
			{
				updateModel(pm);
			}
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int row = treeTable.getSelectedRow();
		if (row < 0)
			return;
		selectedNode =  (ProcessNode) treeTable.getTree().getPathForRow(row).getLastPathComponent();		
		if (selectedNode == null) {
			return;
		}
		infoButton.setEnabled(true);		
		propertysheet.setServerProperties(selectedNode);
	}	
}