package org.xendra.controls;

import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.UIManager;

import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.util.Env;

import com.l2fprod.common.beans.editor.ComboBoxPropertyEditor;

public  class LookupEditor extends ComboBoxPropertyEditor {
	public LookupEditor(String tablename, String columnname) {
		super();
		int AD_Column_ID = MColumn.getColumn_ID(tablename, columnname, null);
		MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
		Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, column.getAD_Reference_ID());
		Object[] values = lookup.getData(false, false, true, false).toArray();
		setAvailableValues(values);
		Icon[] icons = new Icon[values.length];
		Arrays.fill(icons, UIManager.getIcon("Tree.openIcon"));
		setAvailableIcons(icons);																				
	}
}
