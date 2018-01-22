package org.xendra.rules.wizard;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.util.ValueNamePair;
import org.xendra.rules.ProcessNode;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;

public class ProcessTypeStep extends AbstractStep implements StepModelCustomizer {
	
	private DataModel data;
	private JComboBox ProcessTypeComboBox;

	public ProcessTypeStep(DataModel data) {
		super(GlobalResourceLoader.getString("dialog","processwizard", "processtype"),
				GlobalResourceLoader.getString("dialog","processwizard", "processtype_description"));
		this.data = data;		
		setCanGoNext(true);
	}

	@Override
	public void prepareRendering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(GlobalResourceLoader.getString("dialog", "processwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField middlePanel = new WizardTextField();

		Method method = null;

		LabelWithMnemonic typeLabel = new LabelWithMnemonic(GlobalResourceLoader.getString("dialog", "processwizard", "type"));
		ProcessTypeComboBox = new JComboBox();
		typeLabel.setLabelFor(ProcessTypeComboBox);
		ProcessTypeComboBox.addItem(new ValueNamePair(ProcessNode.Process, "Process"));
		ProcessTypeComboBox.addItem(new ValueNamePair(ProcessNode.ServerProcess, "Server Process"));
		ProcessTypeComboBox.addItem(new ValueNamePair(ProcessNode.MachineServer, "Server Type"));
		try {
			method = ProcessTypeComboBox.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {
		}
		data.registerDataLookup(X_AD_Process.COLUMNNAME_AD_Process_ID,new DefaultDataLookup(ProcessTypeComboBox, method, null));        
		middlePanel.addTextField(ProcessTypeComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}
	
	@Override
	public Step[] getPendingSteps() {
		List<Step> steps = new ArrayList<Step>();
		steps.add(new ProcessMachine(data));
		ValueNamePair val = (ValueNamePair) ProcessTypeComboBox.getSelectedItem();
		if (val.getID().equals(ProcessNode.Process))
		{
			steps.add(new FinishStep());
		}
		else if (val.getID().equals(ProcessNode.ServerProcess))
		{
			steps.add(new FinishStep());
		}
		else if (val.getID().equals(ProcessNode.MachineServer))
		{
			steps.add(new MachineServerStep(data));
		}		
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}	
}
