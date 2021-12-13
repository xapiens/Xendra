package org.xendra.pfe.gui.propertysheet;

import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.UIManager;

import org.compiere.model.persistence.X_AD_Column;

import com.l2fprod.common.beans.BaseBeanInfo;
import com.l2fprod.common.beans.editor.ComboBoxPropertyEditor;

public class TableBeanBeanInfo  extends BaseBeanInfo {
	public TableBeanBeanInfo() {
		super(TableBean.class);
		addProperty(X_AD_Column.COLUMNNAME_Name).setCategory("General");		
		addProperty("Value").setCategory("General").setPropertyEditorClass(TableTypeEditor.class);		
	}
	public static class TableTypeEditor extends ComboBoxPropertyEditor {
		  public TableTypeEditor() {
		    super();	    
		    setAvailableValues(new String[]{"Header","Lines",});
		    Icon[] icons = new Icon[2];
		    Arrays.fill(icons, UIManager.getIcon("Tree.openIcon"));
		    setAvailableIcons(icons);
		  }
		}	
}
