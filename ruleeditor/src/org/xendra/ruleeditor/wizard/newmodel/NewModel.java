package org.xendra.ruleeditor.wizard.newmodel;

import java.awt.BorderLayout;
import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.swing.CComboBox;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class NewModel extends AbstractStep {
	protected DataModel data;
    protected CComboBox model;

    public NewModel(DataModel data) {
		super(ResourceLoader.getString("dialog", "newmodelwizard", "identity"),
			  ResourceLoader.getString("dialog", "newmodelwizard",   "identity_description"));
		this.data = data;		
		setCanGoNext(true);    	
    }
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		model = new CComboBox();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newmodelwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));		
		String where = "isview = 'N' AND NOT right(UPPER(tablename),4) = '_TRL' AND NOT LEFT(UPPER(tablename),2) = '_I' AND NOT LEFT(UPPER(tablename),2) = 'T_'";
		List<X_AD_Table> tables = new Query(Env.getCtx(), X_AD_Table.Table_Name, where, null)
			.setOrderBy("TableName")
			.list();
		for (X_AD_Table table:tables) {
			KeyNamePair kp = new KeyNamePair(table.getAD_Table_ID(), table.getTableName());
			model.addItem(kp);
		}
		WizardTextField middlePanel = new WizardTextField();
		Method method = null;		
        try {
            method = model.getClass().getMethod("getSelectedItem", null);
        } catch (NoSuchMethodException nsme) {}
        data.registerDataLookup(X_AD_Table.COLUMNNAME_AD_Table_ID,new DefaultDataLookup(model, method, null));        
		middlePanel.addTextField(model);
        JPanel p = new JPanel(new BorderLayout());
        p.add(model);        
        middlePanel.add(p);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub	
	}            
}
