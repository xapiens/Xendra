package org.xendra.console;

import java.util.ArrayList;
import java.util.List;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_CostElement;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.util.Env;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Borders;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.ComboBox;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.table.Table;

public class EditPolicy implements Runnable {
	Table<String> table;
	List<Integer> ids;
	MultiWindowTextGUI gui;
	public EditPolicy(Table<String> table, MultiWindowTextGUI gui, List<Integer> ids) {
		this.table = table;
		this.gui = gui;				
		this.ids = ids;		
	}

	@Override
	public void run() {
		int id = ids.get(table.getSelectedRow()); 
		final X_M_MaterialPolicy mp = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
		.setParameters(id).first();
		
		final List<Integer> cesindex = new ArrayList<Integer>();
		final BasicWindow window = new BasicWindow();
		final ComboBox<String> comboBox = new ComboBox<String>();
		List<X_M_CostElement> ces = new Query(Env.getCtx(), X_M_CostElement.Table_Name, "AD_Client_ID = ?", null)
		.setParameters(mp.getAD_Client_ID())
		.list();
		for (X_M_CostElement ce:ces) {			
			comboBox.addItem(ce.getName());	
			cesindex.add(ce.getM_CostElement_ID());
		}
		Panel props = new Panel();
		props.setLayoutManager(new GridLayout(2));
		props.addComponent(new Label("Policy"));
		props.addComponent(comboBox);
		Panel panel = new Panel();
		panel.addComponent(props);
		panel.addComponent(new Button("Ok", new Runnable() {
			@Override
			public void run() {
				Integer index = comboBox.getSelectedIndex();
				mp.setM_CostElement_ID(cesindex.get(index));
				mp.save();
				window.close();
			}						
		}));		
		panel.addComponent(new Button("Cancel", new Runnable() {
			@Override
			public void run() {
				window.close();
			}						
		}));				
		window.setComponent(panel.withBorder(Borders.singleLine("Edit")));
		gui.addWindowAndWait(window);		
	}

}
