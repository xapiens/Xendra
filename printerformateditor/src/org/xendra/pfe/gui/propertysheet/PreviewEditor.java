package org.xendra.pfe.gui.propertysheet;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import org.compiere.apps.AEnv;
import org.compiere.apps.search.Info;
import org.compiere.apps.search.InfoInvoice;
import org.compiere.model.MQuery;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.util.Env;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class PreviewEditor extends AbstractPropertyEditor {
	protected JTextField textfield;
	private JButton button;
	private String m_Header;
	public PreviewEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		//textfield.setTransferHandler(new FileTransferHandler());		
	}
	public Object getValue() {
		return m_Header;
	}

	public void setValue(Object value) {
		m_Header = (String) value;
		//String clazz = String.format("%s %s",table.getClass().getPackage(),table.getTableName());        
		textfield.setText(m_Header);
	}
	public static class CellRenderer extends DefaultCellRenderer
	  implements TableCellRenderer
	{
		private String m_Header;
	    public void setValue(Object value)
	    {
	    	m_Header = (String) value;
			X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "TableName = ?", null)
				.setParameters(m_Header).first();
			if (table != null) {
				String clazz = String.format("%s %s",table.getClass().getPackage(),table.getTableName());
				setText(clazz);
			}
	    }
	    
	    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	    {
	        setValue(value);
	        return this;
	    }
	}	
}
