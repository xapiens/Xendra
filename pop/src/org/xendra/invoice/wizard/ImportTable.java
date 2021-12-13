package org.xendra.invoice.wizard;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumn;
import org.compiere.minigrid.ROCellEditor;
import org.compiere.model.MColumn;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MOrderLine;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_UOM;
import org.compiere.model.persistence.X_M_Product;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.objectview.LookupEditor;
import org.xendra.objectview.LookupRenderer;

public class ImportTable extends JTable {
	public ImportTable() {
	}

	public ImportTable(ImportTableModel tm) {		
		super(tm);
		TableColumn tc = getColumn(Msg.getElement(Env.getCtx(), X_M_Product.COLUMNNAME_M_Product_ID));
        MColumn col = MColumn.getColumn(MOrderLine.Table_Name, MOrderLine.COLUMNNAME_M_Product_ID, null);
		MLookup lookup = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		tc.setCellEditor(new LookupEditor(col.getName(),lookup));
		tc.setCellRenderer(new LookupRenderer(lookup));
		//
		
		tc = getColumn(Msg.getElement(Env.getCtx(), MOrderLine.COLUMNNAME_QtyEntered));
		tc.setCellEditor(new ROCellEditor());
		//
		tc = getColumn(Msg.getElement(Env.getCtx(), X_C_UOM.COLUMNNAME_C_UOM_ID));
		col = MColumn.getColumn(X_C_OrderLine.Table_Name, X_C_OrderLine.COLUMNNAME_C_UOM_ID, null);
		lookup = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		tc.setCellEditor(new LookupEditor(col.getName(), lookup));
		tc.setCellRenderer(new LookupRenderer(lookup));
//		tc = getColumn(Msg.getElement(Env.getCtx(), X_C_Order.COLUMNNAME_TotalLines));
//		col = MColumn.getColumn(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_TotalLines, null);
//		lookup = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
//		tc.setCellEditor(new LookupEditor(col.getName(),lookup));
//		tc.setCellRenderer(new LookupRenderer(lookup));		
		
		getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				int row = getSelectedRow();
				Integer M_Product_ID = (Integer) getModel().getValueAt(row, 0);
				if (M_Product_ID != null) {
					Env.setContext(Env.getCtx(), getWindowNo(), "M_Product_ID", M_Product_ID);
				}													
			}
		});

	}
	
	private int getWindowNo() {
		return 0;
	}
}
