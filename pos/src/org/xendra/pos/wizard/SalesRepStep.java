package org.xendra.pos.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MPOS;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.util.Env;
import org.xendra.pos.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class SalesRepStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private VLookup salesrep;
	public SalesRepStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "salesrep"),
				ResourceLoader.getString("dialog", "machinewizard", "salesrep_description"));
		this.data = data;
		setCanGoNext(false);
	}
	
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "salesrep_text")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		
		Method method = null;
		
		LabelWithMnemonic saleslabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "salesrep"));		
		salesrep = VLookup.create(X_C_POS.Table_Name, X_C_POS.COLUMNNAME_SalesRep_ID, 0);
		salesrep.addActionListener(this);		
		saleslabel.setLabelFor(salesrep);
		
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			MPOS posmodel = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null).setParameters(C_POS_ID).first();
			if (posmodel != null)
			{
				salesrep.setValue(posmodel.getSalesRep_ID());
			}			
		}
		try {
			method = salesrep.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_C_POS.COLUMNNAME_SalesRep_ID,new DefaultDataLookup(salesrep, method, null));
		middlePanel.addLabel(saleslabel);
		middlePanel.addTextField(salesrep);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;		
	}

	@Override
	public void prepareRendering() {
		
	}
		
	@Override
	public void actionPerformed(ActionEvent arg0) {
		setCanGoNext(true);		
	}	
}
