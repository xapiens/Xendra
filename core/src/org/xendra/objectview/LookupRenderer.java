package org.xendra.objectview;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import org.compiere.apps.graph.GraphUtil;
import org.compiere.model.MLookup;
import org.compiere.util.KeyNamePair;
import org.xendra.plaf.XendraPLAF;

public class LookupRenderer extends DefaultTableCellRenderer
{
	MLookup look;
	Object previousValue;
	public LookupRenderer(MLookup lookup) {
		look = lookup;
	}

	public Component getTableCellRendererComponent (JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int col)
	{
		Component c = null;
		Object currentDisplay = null;
		c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
		c.setFont(table.getFont());		

		//  Background & Foreground
		Color bg = XendraPLAF.getFieldBackground_Normal();
		Color fg = XendraPLAF.getTextColor_Normal();

		boolean ro = !table.isCellEditable(row, col); 
		if (ro)
		{
			bg = XendraPLAF.getFieldBackground_Inactive();
			if (isSelected && !hasFocus)
				bg = bg.darker();
		}
		else
		{
			fg = XendraPLAF.getTextColor_OK();		//	Blue
		}
		if (table instanceof ObjectView) {
			int cCode = ((ObjectView)table).getColorCode(row);
			if (cCode < 0)
				bg = XendraPLAF.getTextColor_Issue();		//	Red
		}
		if (isSelected)
		{
			//	Windows is white on blue
			bg = table.getSelectionBackground();
			//bg = Color.red;
			fg = table.getSelectionForeground();
			if (hasFocus)
				//bg = GraphUtil.brighter(bg, .9);
				bg = GraphUtil.brighter(bg, 1);
		}
		//  Set Color
		c.setBackground(bg);
		c.setForeground(fg);
		if (table instanceof ObjectView) {
			ObjectViewModel adapter = ((ObjectView) table).getDataModel();
			if (adapter == null)
			{
				System.out.println("ObjectView.LookupRenderer->adapter is null");
			}
			RowBase rowview = (RowBase) adapter.getRowObject(row);
			if (rowview != null)
			{
				IObjetViewColumn[] columns = adapter.getColumns();
				DefaultTableViewColumn dtv = (DefaultTableViewColumn) columns[col];
				currentDisplay = dtv.getDisplay(rowview, col, value);
				if (currentDisplay == null)
				{
					currentDisplay = look.getDisplay(value);
					dtv.setDisplay(rowview, col, value, currentDisplay);
				}
				super.setValue(currentDisplay);
			}
		} else if (table instanceof JTable) {
			Object val = table.getValueAt(row, col);
			KeyNamePair kp = (KeyNamePair) look.get(val);
			if (kp != null)
			currentDisplay = kp.getName();
			super.setValue(currentDisplay);
		}
		return c;
	}
}
