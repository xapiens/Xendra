package org.xendra.modeleditor.gui.propertysheet;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.TransferHandler;
import javax.swing.table.TableCellRenderer;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;

/**
 * FilePropertyEditor. <br>
 *  
 */
public class TableDeveloperEditor extends AbstractPropertyEditor {

	protected JTextField textfield;
	private JButton button;
	private Integer table_id;

	public TableDeveloperEditor() {
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);    
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableDeveloperDialog dlg = new TableDeveloperDialog(table_id);    	  
			}
		});

		textfield.setTransferHandler(new FileTransferHandler());
	}

	class FileTransferHandler extends TransferHandler {    
		public boolean canImport(JComponent comp, DataFlavor[] transferFlavors) {
			for (int i = 0, c = transferFlavors.length; i < c; i++) {
				if (transferFlavors[i].equals(DataFlavor.javaFileListFlavor)) {
					return true;
				}
			}
			return false;
		}
		public boolean importData(JComponent comp, Transferable t) {
			try {
				List list = (List)t.getTransferData(DataFlavor.javaFileListFlavor);
				if (list.size() > 0) {
					File oldFile = (File)getValue();
					File newFile = (File)list.get(0);
					String text = newFile.getAbsolutePath();
					textfield.setText(text);
					firePropertyChange(oldFile, newFile);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
	}

	public Object getValue() {
		return table_id;
	}

	public void setValue(Object value) {
		table_id = (Integer) value;
		X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(table_id).first();		
		String clazz = String.format("%s %s",table.getClass().getPackage(),table.getTableName());        
		textfield.setText(clazz);
	}

	public static class CellRenderer extends DefaultCellRenderer  implements TableCellRenderer
	{
		Integer table_id;
	    public void setValue(Object value)
	    {
			table_id = (Integer) value;
			X_AD_Table table = new Query(Env.getCtx(), X_AD_Table.Table_Name, "AD_Table_ID = ?", null)
				.setParameters(table_id).first();
			String clazz = String.format("%s %s",table.getClass().getPackage(),table.getTableName());
	        setText(clazz);
	    }
	    
	    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	    {
	        setValue(value);
	        return this;
	    }
	}
}