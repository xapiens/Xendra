package org.columba.core.gui.plugin.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.compiere.model.MRole;
import org.compiere.swing.CCheckBox;
import org.compiere.swing.CPassword;
import org.compiere.util.SecureEngine;
import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.xendra.api.XendrianServer;
import org.xendra.core.resourceloader.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class StoreStep extends AbstractStep implements ActionListener {
	private DataModel data;
	private CPassword pass = new CPassword(20);
	private CPassword passconfirm = new CPassword(20);
	private JButton pickkeystore;
	private JButton test = new JButton("test");
	private JLabel keystorename = new JLabel();
	private JLabel accessstore = new JLabel("acceso");	
	private JLabel accessmsg = new JLabel("");
	private CCheckBox passok = new CCheckBox();
	private CCheckBox accessok = new CCheckBox();
	public StoreStep(DataModel data) {
		super(ResourceLoader.getString("certificate", "keystore"),
				ResourceLoader.getString("certificate",   "keystore_description"));
		this.data = data;		
		this.setCanGoNext(false);
	}

	@Override
	protected JComponent createComponent() {
		pickkeystore = new JButton("...");
		pickkeystore.addActionListener(this);
		test.addActionListener(this);
		passok.setEnabled(false);
		accessok.setEnabled(false);
		JComponent panel = new JPanel(new MigLayout());			
		LabelWithMnemonic passlabel = new LabelWithMnemonic(ResourceLoader.getString("certificate", "password"));
		LabelWithMnemonic passconfirmlabel = new LabelWithMnemonic(ResourceLoader.getString("certificate", "passwordconfirm"));		
		panel.add(passlabel);
		panel.add(pass, "wrap");
		panel.add(passconfirmlabel);
		panel.add(passconfirm);
		panel.add(passok,"wrap");
		panel.add(accessstore,"wrap");
		panel.add(accessmsg);
		panel.add(accessok, "skip 1,wrap");
		panel.add(test);
		Method methodpass = null;
		Method method = null;
		try {			
			method = pass.getClass().getMethod("getPassword", null);
		} catch (NoSuchMethodException nsme) {}    			
		data.registerDataLookup("StorePassword", new DefaultDataLookup(pass, method, null));
		return panel;
	}

	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(test)) {
			test();
		}
	}	
	private void setoff() {
		//keystoreok.setSelected(false);
		passok.setSelected(false);
		accessok.setSelected(false);
	}
	private void test() {
		setoff();		
		try {
			String pwd = String.valueOf(pass.getPassword());
			String pwdconf = String.valueOf(passconfirm.getPassword());        
			if (pwd.equals(pwdconf) && pwd.length() > 0) {
				passok.setSelected(true);
				String pwdsecure = SecureEngine.encrypt(pwd);
				String x = new XendrianServer().setServlet("store").setType("createstore").setRole(MRole.getDefault().getIdentifier()).setPassword(pwdsecure).start();
				//String x = Util.navigateWebServer(String.format("store?type=createstore&role=%s&password=%s", MRole.getDefault().getIdentifier(), pwdsecure));
				SAXBuilder builder = new SAXBuilder();
				InputStream stream = new ByteArrayInputStream(x.getBytes("UTF-8"));				
				Document doc = builder.build(stream);
				String error = doc.getRootElement().getChild("error").getText();
				if (error.length() == 0) {
					accessok.setSelected(true);
					accessmsg.setText("acceso correcto");
				} else {
					accessmsg.setText(error);
					accessok.setSelected(false);
				}
			} else {
				accessmsg.setText("password vacio o no coinciden");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//if (keystoreok.isSelected() && passok.isSelected()) {
		//	accessstore();
		//}
		//if (keystoreok.isSelected() && passok.isSelected() && accessok.isSelected()) {
		if (passok.isSelected() && accessok.isSelected()) {
			setCanGoNext(true);
		} else {
			setCanGoNext(false);
		}
	}
}