package org.xendra.pos.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.xendra.pos.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class MessageServerStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	
	public MessageServerStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "messageserver"),
				ResourceLoader.getString("dialog", "machinewizard",   "messageserver_description"));
		this.data = data;		
		setCanGoNext(false);		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "messageserver_text")));
		component.add(Box.createVerticalStrut(40));
		JComboBox cbMachineMessageServer = new JComboBox();
		cbMachineMessageServer.addActionListener(this);
		String where = "servertype = ? and array_length(akeys(properties), 1) > 0";
		Integer MsgID = 0;
		if (Env.getMachine().getProperties().containsKey(REF_ServerType.MessageServer)) {
			String var = (String) Env.getMachine().getProperties().get(REF_ServerType.MessageServer);
			MsgID = Integer.valueOf(var);
		}
		List<X_A_MachineServer> machineservers = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
			.setParameters(REF_ServerType.MessageServer).list();		
		for (X_A_MachineServer machineserver:machineservers) {
			String machineid = (String) machineserver.getProperties().get(X_A_Machine.COLUMNNAME_A_Machine_ID);
			X_A_Machine m = new Query(Env.getCtx(), X_A_Machine.Table_Name, "A_Machine_ID = ?", null)
			.setParameters(Integer.valueOf(machineid)).first();					
			KeyNamePair kp = new KeyNamePair(machineserver.getA_MachineServer_ID(), m.getName());
			cbMachineMessageServer.addItem(kp);
			if (machineserver.getA_MachineServer_ID() == MsgID) {
				cbMachineMessageServer.setSelectedItem(kp);
			}
		}
		WizardTextField POSListPanel = new WizardTextField();
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "type"));
		typeLabel.setLabelFor(cbMachineMessageServer);
		POSListPanel.addTextField(cbMachineMessageServer);
		POSListPanel.addEmptyExample();
		component.add(POSListPanel);
		Method method = null;		
		
		try {			
			method = cbMachineMessageServer.getClass().getMethod("getSelectedItem", null);
		}
		catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(REF_ServerType.MessageServer,new DefaultDataLookup(cbMachineMessageServer, method, null));
		return component;
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setCanGoNext(true);
	}	
}
