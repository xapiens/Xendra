package org.xendra.cost;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Language;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class PolicyStartStep  extends AbstractStep {
	private DataModel data;
	public PolicyStartStep(DataModel data) {
		super(ResourceLoader.getString("materialpolicywizard", "startdate"),
				ResourceLoader.getString("materialpolicywizard", "startdate_description"));
		this.data = data;		
		setCanGoNext(true);		
	}
	@Override
	public void prepareRendering() {
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("materialpolicywizard", "startdate_description")));
		component.add(Box.createVerticalStrut(40));
		VDate fDate = new VDate("Date", false, false, true, DisplayType.Date, Msg.translate(Env.getCtx(), "Date"));
		WizardTextField middlePanel = new WizardTextField();
		LabelWithMnemonic startdateLabel = new LabelWithMnemonic(Msg.translate(Env.getCtx(), X_M_MaterialPolicy.COLUMNNAME_StartDate));
		middlePanel.addLabel(startdateLabel);
		Method method = null;
		try {			
			method = fDate.getClass().getMethod("getValue", null);
		} catch (NoSuchMethodException nsme) {}
		String PolicyID = (String) data.getData(X_M_MaterialPolicy.COLUMNNAME_M_MaterialPolicy_ID);
		if (Integer.valueOf(PolicyID) > 0) {
			X_M_MaterialPolicy p = new Query(Env.getCtx(), X_M_MaterialPolicy.Table_Name, "M_MaterialPolicy_ID = ?", null)
			.setParameters(Integer.valueOf(PolicyID)).first();
			fDate.setValue(p.getStartDate());
		}
		data.registerDataLookup(X_M_MaterialPolicy.COLUMNNAME_StartDate, new DefaultDataLookup(fDate, method, null));
		middlePanel.addTextField(fDate);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;

	}
		
}
