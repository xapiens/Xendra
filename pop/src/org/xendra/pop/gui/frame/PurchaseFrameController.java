package org.xendra.pop.gui.frame;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

import org.columba.api.gui.frame.IDockable;
import org.columba.core.config.View;
//import org.columba.core.config.ViewItem;
import org.columba.core.gui.frame.DockFrameController;
import org.xendra.pop.gui.tree.TreeController;
import org.xendra.pop.util.ResourceLoader;

public class PurchaseFrameController extends DockFrameController 
	implements TreeSelectionListener  {

	protected TreeController tree;
	private IDockable treePanel;

	//public PurchaseFrameController(ViewItem viewItem) {
	public PurchaseFrameController(View viewItem) {
		super(viewItem);
		// control dashboard
		tree = new TreeController(this);
		registerDockables();
	}
	
	private void registerDockables() {
		JScrollPane treeScrollPane = new JScrollPane(tree.getView());
		treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		treePanel = registerDockable("purchase_foldertree", ResourceLoader.getString("global", "dockable_foldertree"), treeScrollPane, null);
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
	}

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
