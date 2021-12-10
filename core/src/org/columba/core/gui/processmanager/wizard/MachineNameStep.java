package org.columba.core.gui.processmanager.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.swing.CTextField;
import org.compiere.util.CLogMgt;
import org.compiere.util.Env;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class MachineNameStep extends AbstractStep implements ActionListener {

	private DataModel data;
	private CTextField machinename = new CTextField(20);
	private JButton locate = new JButton("...");
	
	public MachineNameStep(DataModel data) {
		super(GlobalResourceLoader.getString("dialog","machinewizard", "name"),
				GlobalResourceLoader.getString("dialog","machinewizard", "name_description"));
		this.data = data;		
		setCanGoNext(false);
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(GlobalResourceLoader.getString("dialog", "machinewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField middlePanel = new WizardTextField();

		Method method = null;
		try {			
			method = machinename.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {
		}		
		data.registerDataLookup(X_A_Machine.COLUMNNAME_A_Machine_ID,new DefaultDataLookup(machinename, method, null));				
		JPanel panel = new JPanel();
		if (CLogMgt.DEBUG)
			panel.setLayout(new MigLayout("debug"));
		else
			panel.setLayout(new MigLayout(""));
		panel.add(machinename);
		panel.add(locate);
		locate.addActionListener(this);
		locate.setActionCommand("locate");
		middlePanel.addTextField(panel);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("locate")) {
			String name = machinename.getText();
			X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, "Name = ?", null)
				.setParameters(name).first();
			if (machine != null) 
				setCanGoNext(false);
			else
				setCanGoNext(true);
		}				
	}

	@Override
	public void prepareRendering() {
		
	}	
}
