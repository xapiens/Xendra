package org.xendra.newclient.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_C_Bank;
import org.compiere.model.persistence.X_C_Charge;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class ChargeNameStep extends AbstractStep {
	protected DataModel data;
	private CTextField chargename = new CTextField(Msg.translate(Env.getAD_Language(Env.getCtx()), "Standard"));
	public ChargeNameStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "chargename"),
				ResourceLoader.getString("dialog", "newclient",   "chargename_description"));
		this.data = data;    
		this.setCanGoNext(true);		
	}	
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "chargename_text")));
		component.add(Box.createVerticalStrut(40));
		LabelWithMnemonic psLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "chargename"));
		psLabel.setLabelFor(chargename);
		WizardTextField middlePanel = new WizardTextField();		
		Method method = null;
		try {			
			method = chargename.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(X_C_Charge.COLUMNNAME_C_Charge_ID,new DefaultDataLookup(chargename, method, null));
		middlePanel.addLabel(psLabel);
		middlePanel.addTextField(chargename);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;
	}
	public void prepareRendering() {
	}
}
