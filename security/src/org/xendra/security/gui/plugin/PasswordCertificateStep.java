package org.xendra.security.gui.plugin;


import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.swing.CPassword;
import org.xendra.core.resourceloader.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class PasswordCertificateStep extends AbstractStep {

	private CPassword password = new CPassword(20);
	private CPassword password2 = new CPassword(20);
	private DataModel data;
	public PasswordCertificateStep(DataModel data) {
		super(ResourceLoader.getString("certificate", "databasename"),
				ResourceLoader.getString("certificate",   "databasename_description"));
		this.data = data;
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("certificate", "clientname_text")));
		component.add(Box.createVerticalStrut(40));
		LabelWithMnemonic labelpassword1 = new LabelWithMnemonic(ResourceLoader.getString("certificate","password1"));
		LabelWithMnemonic labelpassword2 = new LabelWithMnemonic(ResourceLoader.getString("certificate","password2"));
		labelpassword1.setLabelFor(password);
		password.setInputVerifier(new PasswordInputVerifier());
		password2.setInputVerifier(new PasswordInputVerifier());
		JPanel panel = new JPanel(new MigLayout());
		panel.add(labelpassword1);    	
		panel.add(password, "wrap");
		panel.add(labelpassword2);
		panel.add(password2,"wrap");
		Method m = null;
		try {			
			m = password.getClass().getMethod("getPassword", null);
		}
		catch (NoSuchMethodException nsme) {
			
		}
		data.registerDataLookup(X_AD_User.COLUMNNAME_Password, new DefaultDataLookup(password, m, null));		
		component.add(panel);
		return component;
	}
	
	class PasswordInputVerifier extends InputVerifier {
		@Override
		public boolean verify(JComponent input) {
			setCanGoNext(false);			
			CPassword p = (CPassword) input;
			String pwd = String.valueOf(p.getPassword());
			String pwd2 = null;
			if (p.equals(password)) {
				pwd2 = String.valueOf(password2.getPassword());
				if (pwd.compareTo(pwd2) == 0) { 					
					setCanGoNext(true);
				}
			} else {
				pwd2 = String.valueOf(password.getPassword());
				if (pwd.compareTo(pwd2) == 0 && pwd2.length() > 0) {  					
					setCanGoNext(true);
				}
			}
			return true;
		}
	}
    public void prepareRendering() {
    }	
}
