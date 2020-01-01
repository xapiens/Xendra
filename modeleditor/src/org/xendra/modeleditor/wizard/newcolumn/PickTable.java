package org.xendra.modeleditor.wizard.newcolumn;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MTable;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.util.Env;
import org.xendra.modeleditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PickTable extends AbstractStep {
	protected DataModel data;	
	protected String tableid;
	protected VLookup table = null;
	public PickTable(DataModel data, String tableid) {		
		super(ResourceLoader.getString("dialog", "picktableizard", "identity"),
				ResourceLoader.getString("dialog", "picktablewizard",   "identity_description"));
		this.tableid = tableid;
		this.data = data;		
		setCanGoNext(true);
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "picktablewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));
		addElement(component);						
		return component;		
	}

	private void addElement(JComponent component) {
		WizardTextField textfield = new WizardTextField();		
		try {
			MTable defaulttable = MTable.get(Env.getCtx(), Integer.valueOf(tableid));			
			table = VLookup.create(X_AD_Process.Table_Name, X_AD_Column.COLUMNNAME_AD_Table_ID, 0);
			table.setValue(defaulttable.getAD_Table_ID());
			Method method = table.getClass().getMethod("getValue", null);
			data.registerDataLookup(X_AD_Column.COLUMNNAME_AD_Table_ID, new DefaultDataLookup(table, method, null));			
			textfield.addLabel(new JLabel("Table"));
			textfield.addTextField(table);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			component.add(textfield);
		}		
	}
	public void prepareRendering() {
	}
}
