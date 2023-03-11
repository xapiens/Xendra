package org.xendra.efact.wizard.documenttax;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;
import org.compiere.model.MColumn;
import org.compiere.model.MDocType;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.util.Env;
import org.xendra.objectview.LookupEditor;
import org.xendra.objectview.LookupRenderer;

public class DocumentTaxPanel extends JPanel implements VetoableChangeListener  {
	private JTable List;
	public void set(ListModel pdtmodel) {
		this.removeAll();
		this.setLayout(new MigLayout("fill"));
		List = new JTable(new DocumentTaxModel(pdtmodel));
		List.setEnabled(true);
		int AD_Column_ID = MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_C_DocType_ID, null);
		MColumn col = MColumn.get(Env.getCtx(), AD_Column_ID);
		MLookup lookup = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editor = new LookupEditor(col.getName(),lookup);
		LookupRenderer render = new LookupRenderer(lookup);

		TableColumnModel tcm = List.getColumnModel();
		tcm.getColumn(DocumentTaxModel.NAME_COLUMN).setPreferredWidth(300);
		tcm.getColumn(DocumentTaxModel.NAME_COLUMN).setCellEditor(editor);
		tcm.getColumn(DocumentTaxModel.NAME_COLUMN).setCellRenderer(render);

		AD_Column_ID = MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_C_DocumentTax_ID, null);
		col = MColumn.get(Env.getCtx(),  AD_Column_ID);
		MLookup lookuppf = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editorpf = new LookupEditor(col.getName(), lookuppf);
		LookupRenderer renderpf = new LookupRenderer(lookuppf);

		tcm.getColumn(DocumentTaxModel.DOCUMENTTAX).setPreferredWidth(300);
		tcm.getColumn(DocumentTaxModel.DOCUMENTTAX).setCellEditor(editorpf);
		tcm.getColumn(DocumentTaxModel.DOCUMENTTAX).setCellRenderer(renderpf);		
				
		JScrollPane scrollPane = new JScrollPane(List);
		add(scrollPane);
	}

	public List<DocTypeDocumentTax> getModel()
	{
		DocumentTaxModel t = (DocumentTaxModel) List.getModel();
		return t.getDocucmentTaxModel();			
	}

	@Override
	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
	}
}