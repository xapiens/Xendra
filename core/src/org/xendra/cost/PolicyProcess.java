package org.xendra.cost;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.MProcess;
import org.compiere.model.MRule;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.Constants;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PolicyProcess extends AbstractStep {
	private DataModel data;
	public PolicyProcess(DataModel data) {
		super(ResourceLoader.getString("materialpolicywizard", "process"),
				ResourceLoader.getString("materialpolicywizard",  "process_description"));
		this.data = data;
		setCanGoNext(true);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("materialpolicywizard", "process_description")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		
		Method method = null;
		
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("materialpolicywizard", "process"));
		JComboBox ProcessComboBox = new JComboBox();		
		typeLabel.setLabelFor(ProcessComboBox);               
		
		String query = "IsActive = 'Y'";
		List<MProcess> processlist = new Query(Env.getCtx(), MProcess.Table_Name, query, null).setOrderBy("name").list();
		for (MProcess process:processlist)
		{
			KeyNamePair kp = new KeyNamePair(process.getAD_Process_ID(), process.getName());
			ProcessComboBox.addItem(kp);
		}						
		try {
			method = ProcessComboBox.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {}
		String PolicyID = (String) data.getData(X_M_MaterialPolicy.COLUMNNAME_M_MaterialPolicy_ID);
		if (Integer.valueOf(PolicyID) > 0) {
			X_M_MaterialPolicy p = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
			.setParameters(Integer.valueOf(PolicyID)).first();
			String process = (String) p.getProperties().get("process");
			if (process == null) 
				process = "";
			if (process.length() > 0) {
				X_AD_Process proc = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_ID = ?", null)
					.setParameters(Integer.valueOf(process)).first();
				if (proc != null) {
					KeyNamePair kp = new KeyNamePair(proc.getAD_Process_ID(), proc.getName());
					ProcessComboBox.getModel().setSelectedItem(kp);					
				}
			}
		}
		data.registerDataLookup(MProcess.COLUMNNAME_AD_Process_ID,new DefaultDataLookup(ProcessComboBox, method, null));
		middlePanel.addLabel(typeLabel);
		middlePanel.addTextField(ProcessComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;		
	}
	public void prepareRendering() {
	}	
}
