package org.xendra.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import org.compiere.apps.ADialog;
import org.compiere.model.MPriceList;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.model.persistence.X_M_PriceList;
import org.compiere.util.Env;
import org.compiere.util.Msg;

public class PriceListCtrl extends JPanel implements ActionListener {
	private List<ActionListener> listeners = new ArrayList<ActionListener>();
	TreeComboBox pricelist = null;
	public PriceListCtrl(boolean IsSOTrx) {		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(Msg.translate(Env.getCtx(), X_M_PriceList.COLUMNNAME_M_PriceList_ID));
		List<MPriceList> pl = new Query(Env.getCtx(), MPriceList.Table_Name, "IsActive = 'Y' AND IsSOPriceList = ?", null)
		.setParameters(IsSOTrx)
		.list();
		for (MPriceList p:pl) {
			PriceListNode plnode = new PriceListNode(p);
			root.add(plnode);
			List<MPriceListVersion> plvs = new Query(Env.getCtx(), MPriceListVersion.Table_Name, "M_PriceList_ID = ? AND IsActive = 'Y'", null)
			.setParameters(p.getM_PriceList_ID()).list();
			for (MPriceListVersion plv:plvs) {

				PriceListVersionNode plvnode = new PriceListVersionNode(plv);
				plnode.add(plvnode);
			}
		}
		JTree tree = new JTree(root);			
		pricelist = new TreeComboBox(tree);
		//pricelist.addVetoableChangeListener(this);
		pricelist.addActionListener(this);
		add(pricelist);
	}

	public MPriceList getMPriceList() {
		MPriceList pl = null;
		Object var = pricelist.getModel().getSelectedItem();
		if (var instanceof PriceListNode) {
			pl = ((PriceListNode) var).getPriceList();
		} else if (var instanceof PriceListVersionNode) {
			MPriceListVersion plv = null;
			plv = ((PriceListVersionNode) var).getPriceListVersion();
			pl = new Query(Env.getCtx(), MPriceList.Table_Name, "M_PriceList_ID = ? ", null)
				.setParameters(plv.getM_PriceList_ID()).first();
		}
		return pl;
	}

	public MPriceListVersion getMPriceListVersion() {
		MPriceListVersion plv = null;
		Object var = pricelist.getModel().getSelectedItem();
		if (var instanceof PriceListVersionNode) {
			plv = ((PriceListVersionNode) var).getPriceListVersion();
		}
		return plv;
	}

	public Integer getM_PriceList_Version_ID() {
		Integer PriceListVersionID = 0;
		Object pl = pricelist.getModel().getSelectedItem();
		if (pl != null) {
			if (pl instanceof PriceListVersionNode) {
				PriceListVersionID = ((PriceListVersionNode) pl).getPriceListVersion().getM_PriceList_Version_ID(); 
			} else if (pl instanceof PriceListNode){
				PriceListNode plnode = ((PriceListNode) pl); 
				int count = plnode.getChildCount();
				if (count > 0) {
					PriceListVersionNode plvnode = (PriceListVersionNode) plnode.getChildAt(0);
					PriceListVersionID = plvnode.getPriceListVersion().getM_PriceList_Version_ID();
				}
			}
		}
		return PriceListVersionID;
	}

	public int getM_PriceList_ID() {
		Integer M_PriceList_ID = 0;
		Object pl = pricelist.getModel().getSelectedItem();
		if (pl instanceof PriceListNode) {
			M_PriceList_ID = ((PriceListNode) pl).getPriceList().getM_PriceList_ID(); 
		} else if (pl instanceof PriceListVersionNode) {
			M_PriceList_ID = ((PriceListVersionNode) pl).getPriceListVersion().getM_PriceList_ID();
		}
		return M_PriceList_ID;
	}

	public void setSelectedItem(Object var) {
		pricelist.getModel().setSelectedItem(var);
	}


	public void setReadWrite(boolean b) {
		//pricelist.setEditable(b);
		pricelist.setEnabled(b);
	}

	public void setM_PriceList_ID(int M_PriceList_ID) {
		boolean found = false;
		int size = pricelist.getModel().getSize();
		for (int i = 1; i < size; i++ ) {
			Object item = pricelist.getModel().getElementAt(i);
			if (item instanceof PriceListNode) {
				if (((PriceListNode) item).getPriceList().getM_PriceList_ID() == M_PriceList_ID) {
					PriceListNode pln = (PriceListNode) item;
					if (pln.getChildCount() > 0) {						
						pricelist.getModel().setSelectedItem(pln.getChildAt(0));
						found = true;
					}
					break;
				}
			}
		}
		if (!found)
			pricelist.setSelectedItem(null);
	}

	public void addListener(ActionListener actionListener) {
		if (!listeners.contains(actionListener))
			listeners.add(actionListener);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		TreeComboBox c  = (TreeComboBox) e.getSource();
		if (c.getSelectedItem() instanceof  PriceListVersionNode) {
			ActionEvent x = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, e.getActionCommand());
			for (ActionListener o:listeners) {
				o.actionPerformed(x);
			}						
		}
	}
}

class PriceListNode extends DefaultMutableTreeNode {
	MPriceList m_pl = null;	
	PriceListNode(MPriceList pl) {
		super(String.format("%s %s", pl.getName(), pl.isTaxIncluded() ? "+"+Msg.translate(Env.getCtx(), X_C_Tax.COLUMNNAME_C_Tax_ID):""));		
		m_pl = pl;			
	}
	public MPriceList getPriceList() {
		return m_pl;
	}
}

class PriceListVersionNode extends DefaultMutableTreeNode {
	MPriceListVersion m_plv = null;
	PriceListVersionNode(MPriceListVersion plv) {
		super(String.format("%s %s",plv.getName(), plv.getValidFrom()));
		m_plv = plv;
	}
	public MPriceListVersion getPriceListVersion() {		
		return m_plv;
	}
}