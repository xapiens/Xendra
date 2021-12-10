package org.xendra.newclient.wizard;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.persistence.X_C_Bank;
import org.compiere.model.persistence.X_C_BankAccount;
import org.compiere.model.persistence.X_C_Currency;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.swing.CTextField;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.newclient.i18n.ResourceLoader;

public class BankStep extends AbstractStep {
	protected DataModel data;
	private CTextField bankname = new CTextField("BANCO");
	private CTextField bankaccount = new CTextField("");
	private VLookup currency; 
	public BankStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "newclient", "bankname"),
				ResourceLoader.getString("dialog", "newclient",   "bankname_description"));
		this.data = data;    
		this.setCanGoNext(false);		
	}	
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "bankname_text")));
		component.add(Box.createVerticalStrut(40));
		LabelWithMnemonic psLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "bankname"));
		psLabel.setLabelFor(bankname);
		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addLabel(psLabel);
		middlePanel.addTextField(bankname);        			
		middlePanel.addEmptyExample();		
		component.add(middlePanel);
		LabelWithMnemonic al = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "bankaccount"));
		bankaccount.setInputVerifier(new BankAccountInputVerifier());
		WizardTextField a = new WizardTextField();
		a.addLabel(al);
		a.addTextField(bankaccount);
		a.addEmptyExample();		
		component.add(a);
		currency = VLookup.create(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_C_Currency_ID, 0);
		JLabel cl = new JLabel(Msg.translate(Env.getCtx(), X_C_Currency.COLUMNNAME_C_Currency_ID));
		WizardTextField b = new WizardTextField();
		b.addLabel(cl);
		b.addTextField(currency);
		b.addEmptyExample();
		component.add(b);
		//
		Method method = null;
		Method methodaccount = null;
		Method methodcurrency = null;
		try {			
			method = bankname.getClass().getMethod("getText", null);
			methodaccount = bankaccount.getClass().getMethod("getText", null);
			methodcurrency = currency.getClass().getMethod("getValue", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup(X_C_Bank.COLUMNNAME_C_Bank_ID,new DefaultDataLookup(bankname, method, null));
		data.registerDataLookup(X_C_BankAccount.COLUMNNAME_AccountNo, new DefaultDataLookup(bankaccount, methodaccount, null));
		data.registerDataLookup(X_C_BankAccount.COLUMNNAME_IBAN, new DefaultDataLookup(currency, methodcurrency, null));
		return component;
	}
	public void prepareRendering() {
	}
	class BankAccountInputVerifier extends InputVerifier {
	    @Override
	    public boolean verify(JComponent input) {
	        String text = ((CTextField) input).getText();
	        try {
	        	if (text == null) 
	        		text = "";
	        	boolean result = text.length() > 0; 
	    		setCanGoNext(result);
	    		return result;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	}	
}
