package org.xendra.newclient.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.apps.ADialog;
import org.compiere.db.CConnection;
import org.compiere.model.persistence.X_AD_User;
import org.compiere.model.persistence.X_C_ValidCombination;
import org.compiere.swing.CPassword;
import org.compiere.swing.CTextField;
import org.compiere.util.DB;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class DatabaseAccessStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private JButton cmd;
	private CTextField superusername;
	private CPassword superuserpass;	
	private CTextField username;
	private CPassword userpass;
	private String m_dbname;
	private CConnection m_cc;
	public DatabaseAccessStep(DataModel data, String dbname, CConnection cc) {
		super(ResourceLoader.getString("dialog", "newclient", "superuser"),
				ResourceLoader.getString("dialog", "newclient",   "superuser_description"));
		setCanGoNext(false);	
		m_cc = cc;
		m_dbname = dbname;
		this.data = data;       		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "superuser_text")));
		component.add(Box.createVerticalStrut(40));
		superusername = new CTextField(20);
		superuserpass = new CPassword(20);
		username = new CTextField(20);
		userpass = new CPassword(20);
		cmd = new JButton("test");
		cmd.addActionListener(this);
		LabelWithMnemonic superusernamelabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "superusername"));
		LabelWithMnemonic superuserpasslabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "superuserpassword"));
		//
		LabelWithMnemonic usernamelabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient","username"));
		LabelWithMnemonic userpasslabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient","userpassword"));
		JPanel panel = new JPanel(new MigLayout());
		panel.add(superusernamelabel);    	
		panel.add(superusername, "wrap");
		panel.add(superuserpasslabel);
		panel.add(superuserpass,"wrap");
		panel.add(usernamelabel);
		panel.add(username, "wrap");
		panel.add(userpasslabel);
		panel.add(userpass);
		panel.add(cmd);
		Method method = null;
		try {
			method = superusername.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}    	
		data.registerDataLookup(X_AD_User.COLUMNNAME_AD_User_ID,new DefaultDataLookup(superusername, method, null));
		Method m = null;
		try {
			m = superuserpass.getClass().getMethod("getPassword", null);			
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_AD_User.COLUMNNAME_Password, new DefaultDataLookup(superuserpass, m, null));
		Method mu = null;
		try  {
			mu = username.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_C_ValidCombination.COLUMNNAME_UserElement1_ID, new DefaultDataLookup(username, mu, null));
		Method mup = null;
		try {
			mup = userpass.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_C_ValidCombination.COLUMNNAME_UserElement2_ID, new DefaultDataLookup(userpass, mup, null));
		component.add(panel);
		return component;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(cmd)) {
			int no = DB.getSQLValue(null, String.format("SELECT 1 FROM pg_database WHERE datname = '%s'",m_dbname));
			if (no < 0) {
				// validate user
				setCanGoNext(false);
				String user = username.getText();
				String pwd = String.valueOf(userpass.getPassword());
				CConnection user_cc = CConnection.get(m_cc.getDbHost(), m_cc.getDbPort(), m_cc.getDbName(), user, pwd);
				DB.setDBTarget(user_cc);
				Exception ex = user_cc.testDatabase(true); 
				if (ex == null) {				
					// validate superuser
					String superuser = superusername.getText();
					String superpwd = String.valueOf(superuserpass.getPassword());
					CConnection new_cc = CConnection.get(m_cc.getDbHost(), m_cc.getDbPort(), m_cc.getDbName(), superuser, superpwd);
					DB.setDBTarget(new_cc);
					ex = new_cc.testDatabase(true); 
					if (ex == null) {
						setCanGoNext(true);									
					}				
				}
			} else {
				ADialog.error(0, null, ResourceLoader.getString("dialog", "newclient", "DatabaseExists"));
			}
		}		
	}
	public void prepareRendering() {
	}	
}
