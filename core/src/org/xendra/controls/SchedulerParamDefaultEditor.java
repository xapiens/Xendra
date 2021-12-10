package org.xendra.controls;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Scheduler_Para;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;
import com.l2fprod.common.beans.editor.FixedButton;
import com.l2fprod.common.swing.LookAndFeelTweaks;
import com.l2fprod.common.swing.renderer.DefaultCellRenderer;

public class SchedulerParamDefaultEditor extends AbstractPropertyEditor implements VetoableChangeListener {
	protected JTextField textfield;
	private JButton button;

	private HashMap props = new HashMap();

	public SchedulerParamDefaultEditor() {	
		editor = new JPanel(new BorderLayout(0, 0));
		((JPanel)editor).add("Center", textfield = new JTextField());
		((JPanel)editor).add("East", button = new FixedButton());
		textfield.setBorder(LookAndFeelTweaks.EMPTY_BORDER);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap p = new HashMap();
				p.put(X_AD_Process_Para.COLUMNNAME_AD_Process_Para_ID, props.get(X_AD_Process_Para.COLUMNNAME_AD_Process_Para_ID));
				p.put(X_AD_Scheduler_Para.COLUMNNAME_ParameterDisplay, props.get(X_AD_Scheduler_Para.COLUMNNAME_ParameterDisplay));
				p.put(X_AD_Scheduler_Para.COLUMNNAME_ParameterDefault, props.get(X_AD_Scheduler_Para.COLUMNNAME_ParameterDefault));
				SchedulerParamDialog pd = new SchedulerParamDialog (p);				
				if (!pd.init())
					return;
				pd.pack();
				pd.setVisible(true);
				props = pd.getProperties();
			}
		});			
	}

	public Object getValue() {
		return props;
	}
	
	public void setValue(Object value) {
		if (value != null) {
			props = (HashMap) value;
			String var = (String) props.get(X_AD_Scheduler_Para.COLUMNNAME_ParameterDisplay);
			textfield.setText(var);
		}
	}

	public static class CellRenderer extends DefaultCellRenderer implements TableCellRenderer
	{
		HashMap process = new HashMap();
		public void setValue(Object value) {
			process = (HashMap) value;
			String var = (String) process.get(X_AD_Scheduler_Para.COLUMNNAME_ParameterDisplay);
			setText(var);
		}
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
			setValue(value);
			return this;
		}
	}
	
	@Override
	public void vetoableChange(PropertyChangeEvent arg0)
			throws PropertyVetoException {
	} 
}