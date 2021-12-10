package org.xendra.cost;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MColumn;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process;
import org.compiere.model.persistence.X_M_CostElement;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PolicyCostElementStep extends AbstractStep implements VetoableChangeListener {
	private DataModel data;
	public PolicyCostElementStep(DataModel data) {
		super(ResourceLoader.getString("materialpolicywizard", "costelement"),
				ResourceLoader.getString("materialpolicywizard", "costelement_description"));
		this.data = data;		
		setCanGoNext(false);				
	}
	@Override
	public void prepareRendering() {
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("materialpolicywizard", "costelement_description")));
		component.add(Box.createVerticalStrut(40));
        MColumn col = MColumn.getColumn(MAcctSchema.Table_Name, MAcctSchema.COLUMNNAME_M_CostElement_ID, null);
		MLookup lookup = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		WizardTextField middlePanel = new WizardTextField();
		VLookup pickCostElement = new VLookup();
		pickCostElement.setLookup(MAcctSchema.COLUMNNAME_M_CostElement_ID, false, false, true, lookup);
		pickCostElement.addVetoableChangeListener(this);
		LabelWithMnemonic costelementLabel = new LabelWithMnemonic(Msg.translate(Env.getCtx(), MAcctSchema.COLUMNNAME_M_CostElement_ID));
		middlePanel.addLabel(costelementLabel);
		Method method = null;
		try {						
			method = pickCostElement.getClass().getMethod("getValue", null);			
		} catch (NoSuchMethodException nsme) {}
		String PolicyID = (String) data.getData(X_M_MaterialPolicy.COLUMNNAME_M_MaterialPolicy_ID);
		if (Integer.valueOf(PolicyID) > 0) {
			X_M_MaterialPolicy p = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
			.setParameters(Integer.valueOf(PolicyID)).first();			
			X_M_CostElement ce = new Query(Env.getCtx(), X_M_CostElement.Table_Name, "M_CostElement_ID = ?", null)
			.setParameters(Integer.valueOf(p.getM_CostElement_ID())).first();
			if (ce != null) {
				pickCostElement.setValue(ce.getM_CostElement_ID());
			}
		}
		data.registerDataLookup(X_M_MaterialPolicy.COLUMNNAME_M_CostElement_ID, new DefaultDataLookup(pickCostElement, method, null));
		middlePanel.addTextField(pickCostElement);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;
	}
	@Override
	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
		Object value = evt.getNewValue();		
		if (value == null)
			return;
		setCanGoNext(true);		
	}
}