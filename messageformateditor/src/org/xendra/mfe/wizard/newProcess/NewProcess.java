package org.xendra.mfe.wizard.newProcess;

import java.lang.reflect.Method;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.MColumn;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.persistence.X_AD_MessageFormat;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_AD_Scheduler;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.CLogMgt;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.mfe.util.ResourceLoader;
import org.xendra.model.AbstractFolder;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class NewProcess extends AbstractStep {
	private DataModel m_data;
	protected AbstractFolder m_node;
	protected JTextField value;
	protected VLookup accesslevel;
	protected VNumber frequency;
	protected VNumber keeplogdays;
	protected VLookup frequencytype;	
	protected JTextField name;
	protected JTextField queuename;
	public NewProcess(DataModel data, AbstractFolder node) {
		super(ResourceLoader.getString("dialog","newprocesswizard","identify"),
				ResourceLoader.getString("dialog", "newprocesswizard", "identity_description"));
		m_data = data;
		m_node = node;
		setCanGoNext(true);
	}
	protected JComponent createComponent() {				
		String debug = "";
		if (CLogMgt.DEBUG)  
			debug = "debug";
		JComponent component = new JPanel(new MigLayout(debug));
		value = new JTextField(20);
		//
		int AD_Column_ID = MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_AccessLevel, null);		
		MLookup lookupConversionType = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.List);
		accesslevel = new VLookup("C_DocTypeTarget_ID", false, false, true, lookupConversionType);
		//
		AD_Column_ID = MColumn.getColumn_ID(X_AD_Scheduler.Table_Name, X_AD_Scheduler.COLUMNNAME_FrequencyType, null);
		MLookup lkfreqtype = MLookupFactory.get(Env.getCtx(), 0, 0, AD_Column_ID, DisplayType.List);
		frequencytype = new VLookup("Frequency_Type", false, false, true, lkfreqtype);
		
		frequency = new VNumber();
		keeplogdays = new VNumber();	
		name = new JTextField(20);
		queuename = new JTextField(20);
		Method methodvalue = null;
		Method methodaccesslevel = null;
		Method methodname = null;
		Method methodfreq = null;
		Method methodfreqtype = null;
		Method methodkeeplogdays = null;
		Method methodqueuename = null;
		try {			
			methodvalue = value.getClass().getMethod("getText", null);
			methodaccesslevel = accesslevel.getClass().getMethod("getValue", null);
			methodfreqtype = frequencytype.getClass().getMethod("getValue", null);
			methodfreq = frequency.getClass().getMethod("getValue", null);
			methodkeeplogdays = keeplogdays.getClass().getMethod("getValue", null);
			methodname = name.getClass().getMethod("getText", null);									
			methodqueuename = queuename.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}		
		
		m_data.registerDataLookup(X_AD_Process.COLUMNNAME_Value, new DefaultDataLookup(value, methodvalue, null));
		m_data.registerDataLookup(X_AD_Process.COLUMNNAME_AccessLevel, new DefaultDataLookup(accesslevel, methodaccesslevel, null));
		m_data.registerDataLookup(X_AD_Scheduler.COLUMNNAME_FrequencyType, new DefaultDataLookup(frequencytype, methodfreqtype, null));
		m_data.registerDataLookup(X_AD_Scheduler.COLUMNNAME_Frequency, new DefaultDataLookup(frequency, methodfreq, null));		
		m_data.registerDataLookup(X_AD_Scheduler.COLUMNNAME_KeepLogDays, new DefaultDataLookup(keeplogdays, methodkeeplogdays, null));
		m_data.registerDataLookup(X_AD_Process.COLUMNNAME_Name, new DefaultDataLookup(name, methodname, null));
		m_data.registerDataLookup(X_AD_MessageFormat.COLUMNNAME_QueueName, new DefaultDataLookup(queuename, methodqueuename, null));
		component.add(new JLabel(Msg.getMsg(Env.getCtx(), X_AD_Process.COLUMNNAME_Value)));
		component.add(value,"wrap");
		component.add(new JLabel(Msg.getMsg(Env.getCtx(), X_AD_Process.COLUMNNAME_AccessLevel)));
		component.add(accesslevel,"wrap");
		component.add(new JLabel(Msg.getMsg(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_FrequencyType)));
		component.add(frequencytype, "wrap");
		component.add(new JLabel(Msg.getMsg(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_Frequency)));
		component.add(frequency, "wrap");
		component.add(new JLabel(Msg.getMsg(Env.getCtx(), X_AD_Scheduler.COLUMNNAME_KeepLogDays)));
		component.add(keeplogdays, "wrap");
		component.add(new JLabel(Msg.getMsg(Env.getCtx(), X_AD_Process.COLUMNNAME_Name)));
		component.add(name, "wrap");
		component.add(new JLabel(Msg.getMsg(Env.getCtx(), X_AD_MessageFormat.COLUMNNAME_QueueName)));
		component.add(queuename, "wrap");
		return component;		
	}
	public void prepareRendering() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				name.requestFocus();
			}
		});
	}	
}