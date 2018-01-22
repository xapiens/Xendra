package org.xendra.rules;

import javax.swing.tree.DefaultTreeModel;

import org.compiere.model.MRefList;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.util.Env;
import org.frapuccino.treetable.AbstractTreeTableModel;

public class NetworkModel  extends AbstractTreeTableModel {
	ProcessNode root;
	/**
	 * @param root
	 */
	public NetworkModel(String[] columns) {
		super(columns);

		root = new ProcessNode("root");
	}	
	public void setRoot(ProcessNode root) {
		this.root = root;
		
		tree.setRootNode(root);
		((DefaultTreeModel) tree.getModel()).nodeStructureChanged(root);

        fireTableDataChanged();
	}	
	//static protected String[] columnNames = { "Name", "Address","Process","Rule","Last Run","Next Run","Frequency Type","Frequency"};
	public Object getValueAt(int row, int column) {
		if (tree.getPathForRow(row).getLastPathComponent() instanceof ProcessNode)
		{
			ProcessNode node = (ProcessNode) tree.getPathForRow(row).getLastPathComponent();
			if (column == 1)
				return node.getRulename();
			if (column == 2)
				return node.getDatelastrun();
			if (column == 3)
				return node.getDatenextrun();
			if (column == 4)
			{
				String value = "";
				if (node.getFrequencyType() != null)
				{
					MRefList ft = MRefList.get(Env.getCtx(), X_AD_Scheduler.FREQUENCYTYPE_AD_Reference_ID, node.getFrequencyType(), null);
					value = ft.getName();
				}
				return value;
			}
			if (column == 5)
				return node.getFrequency();
			if (column == 6)
				return node.getTag();
		}
		return null;
	}	
	public Class getColumnClass(int c) {
		// first column is a tree
		if (c == 0)
			return tree.getClass();
		else
			return String.class;

	}	
}
