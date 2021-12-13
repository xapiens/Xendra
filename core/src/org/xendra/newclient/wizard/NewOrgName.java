package org.xendra.newclient.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.apps.ADialog;
import org.compiere.db.CConnection;
import org.compiere.model.persistence.X_AD_Org;
import org.compiere.swing.CTextField;
import org.compiere.util.DB;
import org.xendra.Constants;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class NewOrgName extends AbstractStep {
	protected DataModel data;
	private CTextField orgname = new CTextField("Organization");
	private CConnection m_cc;
	public NewOrgName(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "orgname"),
				ResourceLoader.getString("dialog", "newclient",   "orgname_description"));		
		this.data = data;       		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "orgname_text")));
		component.add(Box.createVerticalStrut(40));
		LabelWithMnemonic psLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "orgname"));
		psLabel.setLabelFor(orgname);
		WizardTextField middlePanel = new WizardTextField();		
		Method method = null;
		try {			
			method = orgname.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(Constants.COLUMNNAME_AD_Org_ID ,new DefaultDataLookup(orgname, method, null));
		middlePanel.addLabel(psLabel);
		middlePanel.addTextField(orgname);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);

		return component;
	}
	public void prepareRendering() {
	}	
}
