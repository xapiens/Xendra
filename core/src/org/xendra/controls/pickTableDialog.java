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
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;

import javax.swing.JScrollPane;
import javax.swing.JTree;
import net.miginfocom.swing.MigLayout;

public class pickTableDialog extends JDialog implements ActionListener, TreeSelectionListener {
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private AbstractFolder root;
	private String m_id = "";
	private JTree tree;
	private static int m_AD_Table_ID;
	private static pickTableDialog INSTANCE;
	public static int getAD_Table_ID() {
		return m_AD_Table_ID;
	}
	public static void setAD_Table_ID(int var) {
		m_AD_Table_ID = var;
	}
	public pickTableDialog(String identifier) {
		setModal(true);
		Components();
		pickIdentifier(identifier);
		pack();
		setLocationRelativeTo(null);							
	}
	private void pickIdentifier(String var) {
		if (var== null)
			var = "";
		if (var.length() > 0) {
			X_AD_Table table = new Query(Env.getCtx(), X_AD_Column.Table_Name, "Identifier = ?", null)
			.setParameters(var).first();
			if (table != null) {				
					setAD_Table_ID(table.getAD_Table_ID());
					Enumeration en = root.preorderEnumeration();
					while (en.hasMoreElements())
					{
						AbstractFolder nd = (AbstractFolder)en.nextElement();
						Element fe = nd.getNode();
						if (fe.getName().equals("table") && fe.getAttributeValue("uid").equals(String.valueOf(getAD_Table_ID()))) {
							TreePath treePath = new TreePath(nd.getPath());
							tree.setSelectionPath(treePath);
							tree.makeVisible(treePath);       	//	expand it
							tree.scrollPathToVisible(treePath);												
							break;
						}
					}
			}
		} else {
			// esta vacio , por tanto nos vamos a la tabla de otro campo que este por ahi
			if (getAD_Table_ID() > 0) {
				X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
				.setParameters(getAD_Table_ID()).first();
				Enumeration en = root.preorderEnumeration();
				AbstractFolder nd = null;
				while (en.hasMoreElements())
				{
					nd = (AbstractFolder)en.nextElement();
					Element fe = nd.getNode();
					if (fe.getName().equals("table") && fe.getAttributeValue("uid").equals(String.valueOf(getAD_Table_ID()))) {
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
		tree.setCellRenderer(new PickTableCellRenderer(true));
		Element r = new Element("root");
		root = new AbstractFolder(r);
		List<X_AD_Table> tables = new Query(Env.getCtx(), X_AD_Table.Table_Name, "IsActive = 'Y' AND isview = 'N' AND NOT right(tablename,4) = '_Trl'", null).setOrderBy("tablename").list();
		for (X_AD_Table table:tables) {
			Element e = new Element("table");
			e.setAttribute("uid", String.valueOf(table.getAD_Table_ID()));
			e.setAttribute("name", table.getTableName());
			AbstractFolder tablenode = new AbstractFolder(e);			
			root.add(tablenode);
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
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if (command.equals("CANCEL")) { //$NON-NLS-1$
			m_id = "";
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
		AbstractFolder selectedFolder = (AbstractFolder) p.getLastPathComponent();
		if (selectedFolder != null) {
			if (selectedFolder.getNode().getName().equals("table")) {
				Element t = selectedFolder.getNode();				
				setAD_Table_ID(Integer.valueOf(t.getAttributeValue("uid")));
				m_id = selectedFolder.getNode().getAttributeValue("uid");
				setTitle(selectedFolder.getNode().getAttributeValue("name"));
			}
		}				
	}
	public X_AD_Table getTable() {
		X_AD_Table c = null;
		String var = "";
		if (m_id == null)
			m_id = "";
		if (m_id.length() > 0) {
			c = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
			.setParameters(Integer.valueOf(m_id)).first();
		}
		return c;
	}	
	public static pickTableDialog getInstance(String var) {
		if (INSTANCE == null) {
			INSTANCE = new pickTableDialog(var);
		} else {
			INSTANCE.pickIdentifier(var);
		}		
		INSTANCE.setVisible(true);
		return INSTANCE;
	}	
}
