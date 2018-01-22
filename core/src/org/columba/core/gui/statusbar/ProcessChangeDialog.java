package org.columba.core.gui.statusbar;

import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.ConfirmPanel;
import org.compiere.grid.ed.VCheckBox;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.grid.ed.VString;
import org.compiere.grid.ed.VText;
import org.compiere.model.Lookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process_Machine;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.persistence.X_C_AcctProcessor;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.rules.ProcessNode;

public class ProcessChangeDialog implements ActionListener, VetoableChangeListener {
	ProcessNode currentnode;
	ConfirmPanel confirmPanel = null; 	
	private JComboBox cbmachines;
	private VDate datenextrun = new VDate(DisplayType.DateTime);
	private VLookup frequencyType;
	private VLookup ServerType;
	private VString tag;
	private VCheckBox active;
	private VNumber frequency;
	private JDialog dialog;
	private JLabel nodeinfo = new JLabel();
	private boolean ischanged;

	public void initialize() {
		if (dialog != null)
			return;
		confirmPanel = new ConfirmPanel(true);
		confirmPanel.addActionListener(this);
		cbmachines = new JComboBox();
		active = new VCheckBox();
		frequencyType = getLookup(X_C_AcctProcessor.Table_ID, X_C_AcctProcessor.COLUMNNAME_FrequencyType,DisplayType.List, true);
		ServerType = getLookup(X_A_MachineServer.Table_ID, X_A_MachineServer.COLUMNNAME_ServerType, DisplayType.List, true);
		frequency = new VNumber();
		tag = new VString();
		cbmachines.addVetoableChangeListener(this);
		List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y' ", null)
		.setOrderBy(X_A_Machine.COLUMNNAME_Name)
		.list();
		for (X_A_Machine machine:machines)
		{
			cbmachines.addItem(new KeyNamePair(machine.getA_Machine_ID(), machine.getName()));
		}
		dialog = new JDialog();
		dialog.setModalityType(ModalityType.DOCUMENT_MODAL);
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout());
		panel.add(nodeinfo,"wrap, span 2");
		panel.add(new JLabel("new Server"));
		panel.add(cbmachines,"wrap");
		panel.add(new JLabel("Server Type"));
		panel.add(ServerType,"wrap");		
		panel.add(new JLabel("Next Run"));
		panel.add(datenextrun,"wrap");
		panel.add(new JLabel("Frequency Type"));
		panel.add(frequencyType,"wrap");		
		panel.add(new JLabel("Frequency"));
		panel.add(frequency,"wrap");
		panel.add(new JLabel("Tag"));
		panel.add(tag,"wrap");
		panel.add(new JLabel("Active"));
		panel.add(active, "wrap");
		panel.add(confirmPanel);		
		dialog.add(panel);		
		dialog.setLocationRelativeTo(null);			
	}

	private VLookup getLookup(int AD_Table_ID, String ColumnName, int DisplayType, boolean addvetoable) {
		int AD_Column_ID = Util.getColumnID(AD_Table_ID, ColumnName);
		Lookup lookup = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType);
		VLookup control = new VLookup (ColumnName, true, false, true, lookup);
		if (addvetoable)
			control.addVetoableChangeListener(this);
		return control;
	}


	public ProcessChangeDialog(ProcessNode selectedNode) {
		if (selectedNode == null)
			return;
		ischanged = false;
		initialize();
		currentnode = selectedNode;		
		cbmachines.getModel().setSelectedItem(new KeyNamePair(selectedNode.getA_Machine_ID(), selectedNode.getName()));
		nodeinfo.setText(currentnode.getInfo());
		datenextrun.setValue(currentnode.getDatenextrun());
		frequencyType.setValue(currentnode.getFrequencyType());
		frequency.setValue(currentnode.getFrequency());
		if (currentnode.getType().equals(ProcessNode.MachineServer))
		{
			ServerType.setReadWrite(true);
			ServerType.setValue(currentnode.getServerType());
		}
		else
		{
			ServerType.setReadWrite(false);
		}
		tag.setValue(currentnode.getTag());
		active.setValue(currentnode.isActive());
		dialog.pack();
		dialog.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals(ConfirmPanel.A_OK))
		{			
			dispose(true);
		}
		else if (cmd.equals(ConfirmPanel.A_CANCEL))
		{
			dispose(false);
		}				
	}

	private void dispose(boolean b) {		
		if (b)
		{
			KeyNamePair kp = (KeyNamePair) cbmachines.getSelectedItem();
			int machineid = currentnode.getA_Machine_ID();
			if (currentnode.getType().equals(ProcessNode.MachineServer))
			{
				PO po = new Query(Env.getCtx(), currentnode.getTableName(), String.format("%s_ID = ?", currentnode.getTableName()), null)
				.setParameters(currentnode.getRecord_ID()).first();
				if (po.get_ColumnIndex(X_A_Machine.COLUMNNAME_A_Machine_ID) > 0)
				{
					po.set_ValueOfColumn(X_A_Machine.COLUMNNAME_A_Machine_ID, kp.getKey());
					po.set_ValueOfColumn(X_A_MachineServer.COLUMNNAME_ServerType, ServerType.getValue());
					po.set_ValueOfColumn(Constants.COLUMNNAME_IsActive, active.isSelected());
					po.save();
					ischanged = true;
				}					
			}
			else if (currentnode.getTableName().length() >  0 && currentnode.getRecord_ID() > 0)
			{
				PO po = new Query(Env.getCtx(), currentnode.getTableName(), String.format("%s_ID = ?", currentnode.getTableName()), null)
				.setParameters(currentnode.getRecord_ID()).first();
				if (po.get_ColumnIndex(X_A_Machine.COLUMNNAME_A_Machine_ID) > 0)
				{
					po.set_ValueOfColumn(X_A_Machine.COLUMNNAME_A_Machine_ID, kp.getKey());
					po.set_ValueOfColumn(X_C_AcctProcessor.COLUMNNAME_DateNextRun, datenextrun.getValue());
					po.set_ValueOfColumn(X_C_AcctProcessor.COLUMNNAME_FrequencyType, frequencyType.getValue());
					po.set_ValueOfColumn(X_C_AcctProcessor.COLUMNNAME_Frequency, frequency.getValue());
					po.set_ValueOfColumn(Constants.COLUMNNAME_IsActive, active.isSelected());
					po.save();
					ischanged = true;
				}
			}
			else if (currentnode.getAD_Process_Machine() > 0)
			{
				X_AD_Process_Machine pm = new Query(Env.getCtx(), X_AD_Process_Machine.Table_Name, "AD_Process_Machine_ID = ?", null)
				.setParameters(currentnode.getAD_Process_Machine()).first();
				pm.setA_Machine_ID(kp.getKey());
				pm.save();
				if (currentnode.getAD_Scheduler_ID() != null)
				{
					X_AD_Scheduler scheduler = new Query(Env.getCtx(), X_AD_Scheduler.Table_Name, "AD_Scheduler_ID = ?", null)
					.setParameters(currentnode.getAD_Scheduler_ID()).first();
					if (scheduler != null)
					{
						BigDecimal freq = (BigDecimal) frequency.getValue();
						scheduler.setFrequency(freq.intValue());
						scheduler.setFrequencyType((String) frequencyType.getValue());
						scheduler.setTag((String) tag.getValue());
						scheduler.setIsActive(active.isSelected());
						scheduler.save();
					}
				}
				ischanged = true;
			}
		}
		dialog.setVisible(false);
	}

	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {
	}

	public boolean ischanged() {
		return ischanged;
	}
}
