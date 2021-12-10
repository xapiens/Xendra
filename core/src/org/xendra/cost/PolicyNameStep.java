package org.xendra.cost;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.xendra.core.resourceloader.ResourceLoader;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Language;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.util.Env;
import org.compiere.util.Msg;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PolicyNameStep extends AbstractStep {
	private DataModel data;
	protected JTextField MaterialProcessorID = new JTextField();
	protected JTextField MaterialPolicyID = new JTextField();
	protected JTextField policyNameTextField = new JTextField();
	private Integer M_MaterialProcessor_ID;
	
	public PolicyNameStep(Integer M_MaterialProcessor_ID, DataModel data) {
		super(ResourceLoader.getString("materialpolicywizard", "materialpolicy"),
				ResourceLoader.getString("materialpolicywizard", "materialpolicy_description"));
		this.data = data;
		this.M_MaterialProcessor_ID = M_MaterialProcessor_ID;
		setCanGoNext(true);
	}
	protected JComponent createComponent() {
		//
		MaterialProcessorID.setText(String.valueOf(M_MaterialProcessor_ID));
		X_M_MaterialProcessor mp = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "M_MaterialProcessor_ID = ?", null)
			.setParameters(M_MaterialProcessor_ID).first();		
		X_M_MaterialPolicy policy = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialProcessor_ID = ?", null)
			.setParameters(M_MaterialProcessor_ID).first();
		MaterialPolicyID.setText(String.valueOf(0));
		if (policy == null) {
			policy = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "AD_Client_ID = ?", null)
				.setParameters(mp.getAD_Client_ID()).first();
			if (policy != null) {
				MaterialPolicyID.setText(String.valueOf(policy.getM_MaterialPolicy_ID()));
				policy.setM_MaterialProcessor_ID(mp.getM_MaterialProcessor_ID());
				policy.save();
			}
		} else {
			MaterialPolicyID.setText(String.valueOf(policy.getM_MaterialPolicy_ID()));
		}		
		if (policy != null) 
			policyNameTextField.setText(policy.getName());
		else {
			policyNameTextField.setText(mp.getName());
		}		
		//
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("materialpolicywizard", "materialpolicy_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField middlePanel = new WizardTextField();        
		
		
		LabelWithMnemonic queueNameLabel = new LabelWithMnemonic(Msg.translate(Env.getCtx(), X_AD_Language.COLUMNNAME_Name));
		middlePanel.addLabel(queueNameLabel);
		Method method = null;
		Method methodmproc = null;
		Method methodmp = null;
		try {
			method = policyNameTextField.getClass().getMethod("getText", null);
			methodmproc = MaterialProcessorID.getClass().getMethod("getText", null);
			methodmp = MaterialPolicyID.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_M_MaterialProcessor.COLUMNNAME_M_MaterialProcessor_ID,new DefaultDataLookup(MaterialProcessorID, methodmproc, null));
		data.registerDataLookup(X_M_MaterialPolicy.COLUMNNAME_M_MaterialPolicy_ID, new DefaultDataLookup(MaterialPolicyID, methodmp, null));
		data.registerDataLookup(X_M_MaterialPolicy.COLUMNNAME_Name, new DefaultDataLookup(policyNameTextField, method, null));
		queueNameLabel.setLabelFor(policyNameTextField);
		middlePanel.addTextField(policyNameTextField);

		middlePanel.addEmptyExample();

		component.add(middlePanel);
		return component;
	}

	public void prepareRendering() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				policyNameTextField.requestFocus();
			}
		});
	}
}	
