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
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.Constants;
import org.xendra.pos.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class OrgStep extends AbstractStep implements ActionListener  {
	protected DataModel data;
	private VLookup org;
	public OrgStep(DataModel data) { 
		super(ResourceLoader.getString("dialog", "machinewizard", "org"),
				ResourceLoader.getString("dialog", "machinewizard", "org_description"));
		this.data = data;
		setCanGoNext(false);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "org_text")));
		component.add(Box.createVerticalStrut(40));		
		Method method = null;
		LabelWithMnemonic orgname = new LabelWithMnemonic(Msg.translate(Env.getCtx(), Constants.COLUMNNAME_AD_Org_ID));		
		org = VLookup.create(X_C_Invoice.Table_Name, Constants.COLUMNNAME_AD_Org_ID, 0);
		org.addActionListener(this);
		orgname.setLabelFor(org);

		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			X_C_POS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
				.setParameters(C_POS_ID).first();
			if (pos != null) {
				if (pos.getC_CashBook_ID() > 0) {
					org.setValue(pos.getAD_Org_ID());										
				}				
			}
		}
		try {			
			method = org.getClass().getMethod("getValue", null);			
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(Constants.COLUMNNAME_AD_Org_ID,new DefaultDataLookup(org, method, null));

		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addLabel(orgname);
		middlePanel.addTextField(org);		
		middlePanel.addEmptyExample();
		component.add(middlePanel);		
		return component;
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setCanGoNext(true);		
	}
}
