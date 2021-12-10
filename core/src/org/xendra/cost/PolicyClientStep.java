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
import org.compiere.model.MClient;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Language;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.model.persistence.X_M_MaterialProcessor;
import org.compiere.model.reference.REF_M_TransactionTransactionType;
import org.compiere.swing.CLabel;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;
import org.xendra.Constants;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class PolicyClientStep extends AbstractStep implements VetoableChangeListener {
	private DataModel data;	
	private CLabel clientName = new CLabel();
	private VLookup pickClient = null;
	public PolicyClientStep (DataModel data) {
		super(ResourceLoader.getString("materialpolicywizard", "client"),
				ResourceLoader.getString("materialpolicywizard", "client_description"));		
		this.data = data;		
		setCanGoNext(false);		
	}
	@Override
	protected JComponent createComponent() {
		
		clientName.setText(Msg.translate(Env.getCtx(), Constants.COLUMNNAME_AD_Client_ID));
		pickClient = Util.getLookup(X_AD_Org.Table_ID, Env.getWindowNo(null), Constants.COLUMNNAME_AD_Client_ID, DisplayType.TableDir, true, this);

        JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("materialpolicywizard", "client_description")));
        component.add(Box.createVerticalGlue());
		WizardTextField middlePanel = new WizardTextField();        
		LabelWithMnemonic queueNameLabel = new LabelWithMnemonic(Msg.translate(Env.getCtx(), Constants.COLUMNNAME_AD_Client_ID));
		middlePanel.addLabel(queueNameLabel);
		middlePanel.addTextField(pickClient);
		component.add(middlePanel);				
		Method method = null;
		try {			
			method = pickClient.getClass().getMethod("getValue", null);
		} catch (NoSuchMethodException nsme) {
		}		
		data.registerDataLookup(Constants.COLUMNNAME_AD_Client_ID,new DefaultDataLookup(pickClient, method, null));
		//
		String M_MaterialProcessor_ID = (String) data.getData(X_M_MaterialProcessor.COLUMNNAME_M_MaterialProcessor_ID);
		X_M_MaterialProcessor mp = new Query(Env.getCtx(), X_M_MaterialProcessor.Table_Name, "M_MaterialProcessor_ID = ?", null)
			.setParameters(Integer.valueOf(M_MaterialProcessor_ID)).first();
		MClient c = MClient.get(Env.getCtx(), mp.getAD_Client_ID());
		pickClient.setValue(c.getAD_Client_ID());
		return component;
	}
	@Override
	public void vetoableChange(PropertyChangeEvent e)
			throws PropertyVetoException {		
		Object value = e.getNewValue();		
		if (value == null)
			return;
		setCanGoNext(true);
	}
	@Override
	public void prepareRendering() {
	}
}
