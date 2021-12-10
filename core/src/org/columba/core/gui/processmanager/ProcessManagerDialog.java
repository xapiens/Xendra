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
package org.columba.core.gui.processmanager;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.gui.processmanager.folder.ProcessNode;
import org.columba.core.gui.processmanager.folder.RootNode;
import org.columba.core.gui.processmanager.wizard.MachineWizardLauncher;
import org.columba.core.help.HelpManager;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.frapuccino.swing.JTreeUtil;
import org.frapuccino.treetable.Tree;
import org.frapuccino.treetable.TreeTable;
import org.xendra.Constants;
import javax.swing.JSplitPane;

/**
 * Dialog showing all running Print tasks.
 * <p>
 * Lets the user cancel or print tasks.
 * 
 * @author xapiens
 */
public class ProcessManagerDialog extends JDialog implements ActionListener, ListSelectionListener
{
	private static final String REFRESH = "REFRESH";
	static protected String[] columnNames = { "Name","Rule","Last Run","Next Run","Frequency Type","Frequency","Tag"};
	private static ProcessManagerDialog instance;
	private RootNode root;
	private NetworkModel model;
	private TreeTable treeTable;
	private ProcessNode selectedNode;	
	private JScrollPane pane;
	protected ServerSheetPage propertysheet;


	public ProcessManagerDialog() {
		super((JFrame) null, "Process Manager", false);
		initComponents();
		pack();
		setLocationRelativeTo(null);
	}

	public static ProcessManagerDialog createInstance() {
		if (instance == null) {
			instance = new ProcessManagerDialog();
		}
		if (!instance.isVisible()) {
			instance.setVisible(true);
		}
		instance.toFront();

		return instance;
	}

	public void updateModel() {
		root = new RootNode();
		root.setName("root");
		if (model == null)
		{			
			model = new NetworkModel(columnNames);
			model.setTree((Tree)treeTable.getTree());
		}
		model.setRoot(root);
		treeTable.setModel(model);
		treeTable.getTree().setCellRenderer(new ProcessTreeRenderer(treeTable));
		treeTable.addMouseListener(new TableMouseListener(this, treeTable));
		JTreeUtil.expandAll(treeTable.getTree(), true);
		model.fireTableDataChanged();
	}

	public void initComponents() {		
		treeTable = new TreeTable();		
		updateModel();									
		treeTable.getSelectionModel().addListSelectionListener(this);
		pane = new JScrollPane(treeTable);		

		propertysheet = new ServerSheetPage(this);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		JSplitPane splitPane = new JSplitPane();
		splitPane.setLeftComponent(pane);
		splitPane.setRightComponent(propertysheet);
		mainPanel.add(splitPane, BorderLayout.CENTER);
		getContentPane().add(mainPanel);
		//
		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 3, 6, 0));
		panel.setBorder(new EmptyBorder(12, 12, 12, 12));
		bottomPanel.add(panel, BorderLayout.WEST);
		JButton refreshButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("", "global", "refresh"));
		refreshButton.setActionCommand(REFRESH);
		refreshButton.addActionListener(this);		
		panel.add(refreshButton);
		
		JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 6, 0));
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));

		JButton addButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("", "global", "add"));
		addButton.setActionCommand(Constants.ADD);
		addButton.addActionListener(this);
		buttonPanel.add(addButton);
		
		JButton closeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("global", "global", "close"));
		closeButton.setActionCommand(Constants.CLOSE);
		closeButton.addActionListener(this);
		buttonPanel.add(closeButton);

		ButtonWithMnemonic helpButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("global", "global", "help"));
		buttonPanel.add(helpButton);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		getRootPane().setDefaultButton(closeButton);
		getRootPane().registerKeyboardAction(this, "CLOSE",
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);

		// associate with JavaHelp
		HelpManager.getInstance().enableHelpOnButton(helpButton, "extending_columba_1");
		HelpManager.getInstance().enableHelpKey(getRootPane(),
				"extending_columba_1");				
	}


	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		if (action.equals(Constants.CLOSE)) {
			setVisible(false);
		} else if (action.equals(Constants.CANCEL)) {

		} else if (action.equals("KILL")) {

		} else if (action.equals(REFRESH)) {
			updateModel();
		} else if (action.equals(Constants.ADD)) {
			MachineWizardLauncher nn = new MachineWizardLauncher();	
			nn.launchWizard();
			updateModel();
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
		propertysheet.setServerProperties(selectedNode);
	}	
}