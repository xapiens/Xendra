package org.xendra.newclient.wizard;

import java.lang.reflect.Method;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.compiere.apps.ADialog;
import org.compiere.model.persistence.X_AD_Certificate;
import org.compiere.swing.CPassword;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;


public class CertificateStep extends AbstractStep {
	protected DataModel data;
	private CPassword pass;
	private CPassword passconfirm;
	public CertificateStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "newclient", "certificate"),
    			ResourceLoader.getString("dialog", "newclient",   "certificate_description"));
    	this.data = data;
    	setCanGoNext(false);
	}
	protected JComponent createComponent() {
		LabelWithMnemonic passlabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "password"));
		LabelWithMnemonic passconfirmlabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "passwordconfirm"));
		JPanel panel = new JPanel(new MigLayout());
		panel.add(passlabel); 
		pass.setInputVerifier(new MyInputVerifier());
		passconfirm.setInputVerifier(new MyInputVerifier());
		panel.add(pass, "wrap");
		panel.add(passconfirmlabel);
		panel.add(passconfirm,"wrap");
		Method method = null;
		try {
			method = pass.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}    	
		data.registerDataLookup(X_AD_Certificate.COLUMNNAME_AD_Certificate_ID,new DefaultDataLookup(pass, method, null));
		component.add(panel);
		return component;
	}
	class MyInputVerifier extends InputVerifier {
	    @Override
	    public boolean verify(JComponent input) {	    	
	    	String pwd = String.valueOf(pass.getPassword());
	    	String pwdconf = String.valueOf(passconfirm.getPassword());
	        try {
	    		if (pwd.equals(pwdconf)) {
	    			setCanGoNext(true);		    			
	    			return true;
	    		}
	    		else
	    		{
	    			setCanGoNext(false);
	    			ADialog.error(0, null, "NotUnique", "Password don't match");
	    			return false;	    			
	    		}
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	}
	public void prepareRendering() {
	}	
}
