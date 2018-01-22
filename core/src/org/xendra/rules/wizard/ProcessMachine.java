package org.xendra.rules.wizard;

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
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.compiere.util.Util;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class ProcessMachine extends AbstractStep {

	private DataModel data;
	private JComboBox ProcessTypeComboBox;

	public ProcessMachine(DataModel data) {
		super(GlobalResourceLoader.getString("dialog","processwizard", "machine"),
				GlobalResourceLoader.getString("dialog","processwizard", "machine_description"));
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
		component.add(new MultiLineLabel(GlobalResourceLoader.getString("dialog", "processwizard", "machine_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField middlePanel = new WizardTextField();

		Method method = null;

		LabelWithMnemonic typeLabel = new LabelWithMnemonic(GlobalResourceLoader.getString("dialog", "processwizard", "machine"));
		ProcessTypeComboBox = new JComboBox();
		typeLabel.setLabelFor(ProcessTypeComboBox);
		List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y'", null)
			.list();
		for (X_A_Machine machine:machines)
		{
			Machine mach = new Machine(Env.getCtx(), machine.getA_Machine_ID(), null);
			ProcessTypeComboBox.addItem(mach);
			if (mach.getName().equals(Util.getLocalHostName()))
				ProcessTypeComboBox.setSelectedItem(mach);
		}
		
		try {
			method = ProcessTypeComboBox.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {
		}
		data.registerDataLookup(X_A_Machine.COLUMNNAME_A_Machine_ID,new DefaultDataLookup(ProcessTypeComboBox, method, null));        
		middlePanel.addTextField(ProcessTypeComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}
		
}
