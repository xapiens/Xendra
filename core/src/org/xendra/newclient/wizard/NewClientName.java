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
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.swing.CTextField;
import org.compiere.util.DB;
import org.xendra.Constants;
import org.xendra.newclient.i18n.ResourceLoader;
import org.xendra.utils.Sunat;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class NewClientName extends AbstractStep {
	protected DataModel data;
	private CTextField clientalias = new CTextField("Alias");
	private CTextField clientname = new CTextField("Empresa Nueva");
	private CTextField taxid = new CTextField();
	private CConnection m_cc;
	public NewClientName(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "clientname"),
				ResourceLoader.getString("dialog", "newclient",   "clientname_description"));		
		this.data = data;    
		this.setCanGoNext(false);
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "clientname_text")));
		component.add(Box.createVerticalStrut(40));
		LabelWithMnemonic psLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "clientname"));
		//clientname  = new CTextField(20);    	
		psLabel.setLabelFor(clientname);
		clientname.setInputVerifier(new ClientNameVerifier());
		WizardTextField middlePanel = new WizardTextField();		
		Method method = null;
		try {			
			method = clientname.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(Constants.COLUMNNAME_AD_Client_ID ,new DefaultDataLookup(clientname, method, null));
		middlePanel.addLabel(psLabel);
		middlePanel.addTextField(clientname);        			
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		//
		LabelWithMnemonic aliaslabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "alias"));
		aliaslabel.setLabelFor(clientalias);
		clientalias.setInputVerifier(new AliasNameVerifier());
		WizardTextField alias = new WizardTextField();
		Method methodalias = null;
		try {
			methodalias = clientalias.getClass().getMethod("getText", null);
		}
		catch (NoSuchMethodException nsme) {
			
		}
		data.registerDataLookup(X_AD_Client.COLUMNNAME_Value, new DefaultDataLookup(clientalias, methodalias, null));
		alias.addLabel(aliaslabel);
		alias.addTextField(clientalias);
		alias.addEmptyExample();
		component.add(alias);		
		//
		LabelWithMnemonic taxlabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "taxid"));
		taxlabel.setLabelFor(taxid);
		taxid.setInputVerifier(new TaxInputVerifier());
		WizardTextField taxPanel = new WizardTextField();		
		Method taxmethod = null;
		try {			
			taxmethod = taxid.getClass().getMethod("getText", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(X_C_BPartner.COLUMNNAME_TaxID,new DefaultDataLookup(taxid, method, null));
		taxPanel.addLabel(taxlabel);
		taxPanel.addTextField(taxid);        			
		taxPanel.addEmptyExample();
		component.add(taxPanel);		
		return component;
	}
	class AliasNameVerifier extends InputVerifier {
		@Override
		public boolean verify(JComponent input) {
			String text = ((CTextField) input ).getText();
			if (text == null)
				text = "";
			if (text.length() > 12) {
				ADialog.error(0, null, "Alias too long (Max 12 characteres)", text);
				return false;
			}
			else if (text.length() == 0) {
				ADialog.error(0, null, "Alias is mandatory", text);
				return false;				
			}
			else
			{
				setCanGoNext(true);
				return true;
			}
		}
	}
	class ClientNameVerifier extends InputVerifier {
	    @Override
	    public boolean verify(JComponent input) {
	        String text = ((CTextField) input).getText();
	        try {
	    		String SQL = String.format("UPDATE AD_CLient SET CreatedBy=0 WHERE Name='%s'", text);
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
	class TaxInputVerifier extends InputVerifier {
	    @Override
	    public boolean verify(JComponent input) {
	        String text = ((CTextField) input).getText();
	        try {
	        	Boolean result = Sunat.isValidRUC(text);
	    		setCanGoNext(result);
	    		return result;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	}	
	public void prepareRendering() {
	}	
}
