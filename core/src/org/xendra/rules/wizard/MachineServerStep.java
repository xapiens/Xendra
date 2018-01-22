package org.xendra.rules.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.model.reference.REF_ServerType;
import org.compiere.util.Env;
import org.compiere.util.ValueNamePair;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class MachineServerStep extends AbstractStep {
	
	private DataModel data;
	private JComboBox ProcessTypeComboBox;

	public MachineServerStep(DataModel data) {
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
		String where = "ServerType = ?";
		int count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where , null)
			.setParameters(REF_ServerType.MaterialServer).setClient_ID().count();
		if (count == 0)
			ProcessTypeComboBox.addItem(new ValueNamePair(REF_ServerType.MaterialServer, "Material Server"));
		count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
		.setParameters(REF_ServerType.ReplicationServer).setClient_ID().count();
		if (count == 0)
			ProcessTypeComboBox.addItem(new ValueNamePair(REF_ServerType.ReplicationServer, "Replication Server"));
		count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
		.setParameters(REF_ServerType.TransferenceServer).setClient_ID().count();
		if (count == 0)		
			ProcessTypeComboBox.addItem(new ValueNamePair(REF_ServerType.TransferenceServer, "Transference Server"));
		count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
		.setParameters(REF_ServerType.WebServer).setClient_ID().count();
		if (count == 0)				
			ProcessTypeComboBox.addItem(new ValueNamePair(REF_ServerType.WebServer, "Web Server Server"));
		count = new Query(Env.getCtx(), X_A_MachineServer.Table_Name, where, null)
		.setParameters(REF_ServerType.XendrianServer).setClient_ID().count();
		if (count == 0)						
			ProcessTypeComboBox.addItem(new ValueNamePair(REF_ServerType.XendrianServer, "Xendrian Server"));
		try {
			method = ProcessTypeComboBox.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {
		}
		data.registerDataLookup(X_A_MachineServer.COLUMNNAME_ServerType,new DefaultDataLookup(ProcessTypeComboBox, method, null));        
		middlePanel.addTextField(ProcessTypeComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}	
}
