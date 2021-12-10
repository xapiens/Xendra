package org.columba.core.gui.processmanager.wizard;

import java.lang.reflect.Method;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.MProcess;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class ProcessStep extends AbstractStep {
	private DataModel data;
	public ProcessStep(DataModel data) {
		super(ResourceLoader.getString("processwizard", "process"),
				ResourceLoader.getString("processwizard",  "process_description"));
		this.data = data;
		setCanGoNext(true);		
	}	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("processwizard", "process_description")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField middlePanel = new WizardTextField();
		
		Method method = null;
		
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("processwizard", "process"));
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
