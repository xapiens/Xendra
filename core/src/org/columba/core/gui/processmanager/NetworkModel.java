package org.columba.core.gui.processmanager;

import java.sql.Timestamp;

import javax.swing.tree.DefaultTreeModel;

import org.columba.core.gui.processmanager.folder.ProcessNode;
import org.columba.core.gui.processmanager.folder.ServerProcessNode;
import org.columba.core.gui.processmanager.folder.SchedulerNode;
import org.compiere.model.MColumn;
import org.compiere.model.MRefList;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.ValueNamePair;
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
			if (column == 1) {
				String var = "";
				if (node.getAD_Rule_ID() != null) {
					KeyNamePair kp = (KeyNamePair) node.getAD_Rule_ID();
					var = kp.getName();
//					X_AD_Rule r = new Query(Env.getCtx(), X_AD_Rule.Table_Name, "AD_Rule_ID = ?", null)
//					.setParameters(node.getAD_Rule_ID()).first();
//					if (r != null) {
//						var = r.getName();
//					}
				}	
				return var;
			}
			if (column == 2)
			{
				Timestamp datelastrun = null;
				if (node instanceof ServerProcessNode) {
					datelastrun = ((ServerProcessNode) node).getDatelastrun();
				}  else if (node instanceof SchedulerNode) {
					datelastrun = ((SchedulerNode) node).getDatelastrun();
				}
				return datelastrun;
			}			
			if (column == 3) {
				Timestamp datenextrun = null;
				if (node instanceof ServerProcessNode) {
					datenextrun = ((ServerProcessNode) node).getDatenextrun();
				}  else if (node instanceof SchedulerNode) {
					datenextrun = ((SchedulerNode) node).getDatenextrun();
				}
				return datenextrun;
			}
			if (column == 4) {				
				String value = "";
				if (node instanceof ServerProcessNode) {
					String frequencytype = ((ServerProcessNode) node).getFrequencyType(); 
					if ( frequencytype != null)
					{
						MColumn col = MColumn.getbyIdentifier("eab331af-e52f-9774-f3a4-ded1b2a3d376", null);											
						MRefList ft = MRefList.get(Env.getCtx(), col.getAD_Reference_Value_ID(), frequencytype, null);
						value = ft.getName();
					}
				} else if (node instanceof SchedulerNode) {
					ValueNamePair frequencytype = (ValueNamePair) ((SchedulerNode) node).getFrequencyType(); 
					if ( frequencytype != null)
					{
						value = frequencytype.getName();
						//MRefList ft = MRefList.get(Env.getCtx(), X_AD_Scheduler.FREQUENCYTYPE_AD_Reference_ID, frequencytype, null);
						//value = ft.getName();
					}					
				}
				return value;
			}
			if (column == 5) {
				Integer frequency = 0;
				if (node instanceof SchedulerNode) {
					frequency = ((SchedulerNode) node).getFrequency(); 
				}
				return frequency;
			}
			if (column == 6) {
				String tag = "";
				if (node instanceof SchedulerNode) {
					tag = ((SchedulerNode) node).getTag();
				}
				return tag;
			}
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
