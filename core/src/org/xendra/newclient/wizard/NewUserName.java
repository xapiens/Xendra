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
import org.compiere.model.persistence.X_AD_User;
import org.compiere.swing.CTextField;
import org.compiere.util.DB;
import org.xendra.newclient.i18n.ResourceLoader;
import org.xendra.newclient.wizard.NewAdminName.MyInputVerifier;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class NewUserName extends AbstractStep {
	protected DataModel data;
	private CTextField username = new CTextField("clientUser");
	
	public NewUserName(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "username"),
				ResourceLoader.getString("dialog", "newclient",   "username_description"));		
		this.data = data;       		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "username_text")));
		component.add(Box.createVerticalStrut(40));
		LabelWithMnemonic psLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "username"));
		//clientname  = new CTextField(20);    	
		psLabel.setLabelFor(username);
		username.setInputVerifier(new MyInputVerifier());
		WizardTextField middlePanel = new WizardTextField();		
		Method method = null;
		try {			
			method = username.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(X_AD_User.COLUMNNAME_AD_User_ID ,new DefaultDataLookup(username, method, null));                    
		middlePanel.addTextField(username);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;
	}
	class MyInputVerifier extends InputVerifier {
	    @Override
	    public boolean verify(JComponent input) {
	        String text = ((CTextField) input).getText();
	        try {
	    		String SQL = String.format("UPDATE AD_User SET CreatedBy=0 WHERE Name='%s'", text);
	    		if (DB.executeUpdate(SQL, null) != 0) {
	    			setCanGoNext(false);	
	    			ADialog.error(0, null, "NotUnique", text);
	    			return false;
	    		}
	    		else
	    		{
	    			setCanGoNext(true);			
	    			return true;	    			
	    		}
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	}		
	public void prepareRendering() {
	}	
}
