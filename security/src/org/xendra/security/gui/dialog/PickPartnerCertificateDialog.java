package org.xendra.security.gui.dialog;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.xendra.security.wizard.CreateCertificatePartnerWizardLauncher;
import org.xendra.security.wizard.ModifyCertificatePartnerWizardLauncher;

import com.Verisign.payment.e;

import java.util.Enumeration;
import java.util.List;

import net.miginfocom.swing.MigLayout;

public class PickPartnerCertificateDialog extends JDialog implements ActionListener, TreeSelectionListener {
	private ButtonWithMnemonic newButton;
	private ButtonWithMnemonic changeButton;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;	
	private JTree tree;
	private PartnerNode root;
	private MBPartner m_id;
	public PickPartnerCertificateDialog(MBPartner partner) {
		setModal(true);
		Components();
		pickIdentifier(partner);
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
		tree.setCellRenderer(new PartnerCellRenderer(true));
		root = new PartnerNode();
		List<MBPartner> partners = new Query(Env.getCtx(), 
				MBPartner.Table_Name, 
				"EXISTS (select 1 from C_BPartner_Certificate cbc where C_BPartner_ID = C_BPartner.C_BPartner_ID)", null)
				.list();
		for (MBPartner partner:partners) {
			PartnerNode n = new PartnerNode();
			n.setPartner(partner);
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
		JPanel optPanel = new JPanel();
		optPanel.setBorder(new EmptyBorder(12, 12, 12, 12));
		optPanel.setLayout(new GridLayout(1,3, 6, 0));
		newButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog",  "global", "new"));
		newButton.setActionCommand("NEW");
		newButton.addActionListener(this);;
		optPanel.add(newButton);
		changeButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "change"));
		changeButton.setActionCommand("CHANGE");
		changeButton.addActionListener(this);;
		changeButton.setEnabled(false);
		optPanel.add(changeButton);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(12, 12, 12, 12));
		buttonPanel.setLayout(new GridLayout(1,3, 6,0));
		okButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog","global","ok")); //$NON-NLS-1$ //$NON-NL$-2$
		okButton.setActionCommand("OK"); // $NON-NLS-1$
		okButton.addActionListener(this);
		buttonPanel.add(okButton);
		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "cancel")); //$NON-NLS-1$ //$NON-NL$-2$
		cancelButton.setActionCommand("CANCEL");
		cancelButton.addActionListener(this);		
		buttonPanel.add(cancelButton);
		getRootPane().registerKeyboardAction(this, "CANCEL", // $NON-NLS-1$
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);
		//
		bottomPanel.add(optPanel, BorderLayout.WEST);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);					
	}

	private void pickIdentifier(MBPartner var) {
		if (var != null) {
			Enumeration en = root.preorderEnumeration();
			while (en.hasMoreElements()) {
				PartnerNode pn = (PartnerNode) en.nextElement();
				MBPartner p = pn.getPartner();
				if (p != null) {
					if (p.getC_BPartner_ID() == p.getC_BPartner_ID()) {
						TreePath treepath = new TreePath(pn.getPath());
						tree.setSelectionPath(treepath);
						tree.makeVisible(treepath);
						tree.scrollPathToVisible(treepath);
						break;
					}
				}
			}
		}
	}

	public MBPartner getPartner() {
		return m_id;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("CANCEL")) {
			m_id = null;
			setVisible(false);
		} else if (command.equals("OK")) {
			setVisible(false);
		} else if (command.equals("NEW")) {
			CreateCertificatePartnerWizardLauncher nn = new CreateCertificatePartnerWizardLauncher();
			nn.launchWizard();								
		} else if (command.equals("CHANGE")) {
			ModifyCertificatePartnerWizardLauncher nn = new ModifyCertificatePartnerWizardLauncher();
			nn.launchWizard(m_id);
		}
	}
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		TreePath p = e.getPath();
		if (p == null)
			return;
		PartnerNode selectedFolder = (PartnerNode) p.getLastPathComponent();
		if (selectedFolder != null) {
			m_id = selectedFolder.getPartner();
			changeButton.setEnabled(true);
		}
	}	
}
