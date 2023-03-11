package org.xendra.efact.wizard.tax;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.table.TableColumnModel;

import org.compiere.model.MColumn;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_InvoiceTax;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_Tax;
import org.compiere.util.Env;
import org.xendra.objectview.LookupEditor;
import org.xendra.objectview.LookupRenderer;

import net.miginfocom.swing.MigLayout;

public class TaxPanel extends JPanel implements VetoableChangeListener {
	private JTable List;
	public void set(ListModel pdtmodel) {
		this.removeAll();
		this.setLayout(new MigLayout("fill"));
		List = new JTable(new ConstrainTaxModel(pdtmodel));
		List.setEnabled(true);
		int AD_Column_ID = MColumn.getColumn_ID(X_C_InvoiceTax.Table_Name, X_C_InvoiceTax.COLUMNNAME_C_Tax_ID, null);
		MColumn col = MColumn.get(Env.getCtx(), AD_Column_ID);
		MLookup lookup = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editor = new LookupEditor(col.getName(),lookup);
		LookupRenderer render = new LookupRenderer(lookup);

		TableColumnModel tcm = List.getColumnModel();
		tcm.getColumn(ConstrainTaxModel.NAME_COLUMN).setPreferredWidth(300);
		tcm.getColumn(ConstrainTaxModel.NAME_COLUMN).setCellEditor(editor);
		tcm.getColumn(ConstrainTaxModel.NAME_COLUMN).setCellRenderer(render);

		AD_Column_ID = MColumn.getColumn_ID(X_C_Tax.Table_Name, X_C_Tax.COLUMNNAME_TaxTypeCode, null);
		col = MColumn.get(Env.getCtx(),  AD_Column_ID);
		MLookup lookuppa = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editorpa = new LookupEditor(col.getName(), lookuppa);
		LookupRenderer renderpa = new LookupRenderer(lookuppa);

		tcm.getColumn(ConstrainTaxModel.TYPECODE).setPreferredWidth(300);
		tcm.getColumn(ConstrainTaxModel.TYPECODE).setCellEditor(editorpa);
		tcm.getColumn(ConstrainTaxModel.TYPECODE).setCellRenderer(renderpa);		

		AD_Column_ID = MColumn.getColumn_ID(X_C_Tax.Table_Name, X_C_Tax.COLUMNNAME_TaxID, null);
		col = MColumn.get(Env.getCtx(),  AD_Column_ID);
		MLookup lookuppb = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editorpb = new LookupEditor(col.getName(), lookuppb);
		LookupRenderer renderpb = new LookupRenderer(lookuppb);

		tcm.getColumn(ConstrainTaxModel.TAXID).setPreferredWidth(300);
		tcm.getColumn(ConstrainTaxModel.TAXID).setCellEditor(editorpb);
		tcm.getColumn(ConstrainTaxModel.TAXID).setCellRenderer(renderpb);		
		
		AD_Column_ID = MColumn.getColumn_ID(X_C_Tax.Table_Name, X_C_Tax.COLUMNNAME_ECE_5153, null);
		col = MColumn.get(Env.getCtx(),  AD_Column_ID);
		MLookup lookuppc = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editorpc = new LookupEditor(col.getName(), lookuppc);
		LookupRenderer renderpc = new LookupRenderer(lookuppc);

		tcm.getColumn(ConstrainTaxModel.ECE5153).setPreferredWidth(300);
		tcm.getColumn(ConstrainTaxModel.ECE5153).setCellEditor(editorpc);
		tcm.getColumn(ConstrainTaxModel.ECE5153).setCellRenderer(renderpc);		

		AD_Column_ID = MColumn.getColumn_ID(X_C_Tax.Table_Name, X_C_Tax.COLUMNNAME_ECE_5305, null);
		col = MColumn.get(Env.getCtx(),  AD_Column_ID);
		MLookup lookuppd = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editorpd = new LookupEditor(col.getName(), lookuppd);
		LookupRenderer renderpd = new LookupRenderer(lookuppd);

		tcm.getColumn(ConstrainTaxModel.ECE5305).setPreferredWidth(300);
		tcm.getColumn(ConstrainTaxModel.ECE5305).setCellEditor(editorpd);
		tcm.getColumn(ConstrainTaxModel.ECE5305).setCellRenderer(renderpd);		

		JScrollPane scrollPane = new JScrollPane(List);
		add(scrollPane);
	}

	public List<ConstrainTax> getModel()
	{
		ConstrainTaxModel t = (ConstrainTaxModel) List.getModel();
		return t.getConstrainTaxModel();			
	}

	@Override
	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
	}	
}
