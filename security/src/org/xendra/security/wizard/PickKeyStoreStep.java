package org.xendra.security.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.util.HashMap;

import javax.net.ssl.KeyManagerFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.compiere.apps.ADialog;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.swing.CCheckBox;
import org.compiere.swing.CPassword;
import org.compiere.util.Env;
import org.compiere.util.SecureEngine;
import org.xendra.Constants;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.api.SecurityConstants;

import com.l2fprod.common.swing.JDirectoryChooser;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class PickKeyStoreStep extends AbstractStep  implements ActionListener {
	protected DataModel data;
	private CPassword pass = new CPassword(20);
	private CPassword passconfirm = new CPassword(20);
	private JButton pickkeystore;
	private JButton test = new JButton("test");
	private JLabel keystorename = new JLabel();
	private JLabel accessstore = new JLabel("acceso");	
	private JLabel accessmsg = new JLabel("");
	private CCheckBox passok = new CCheckBox();
	private CCheckBox accessok = new CCheckBox();
	private String m_directory;	
	private String filename = null;
	public PickKeyStoreStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "partnerwizard", "file"),
				ResourceLoader.getString("dialog", "partnerwizard", "file_description"));
		this.data = data;
		setCanGoNext(false);
	}	
	public PickKeyStoreStep(MBPartner p, DataModel data) {
		super(ResourceLoader.getString("dialog", "partnerwizard", "file"),
				ResourceLoader.getString("dialog", "partnerwizard", "file_description"));
		X_C_BPartner_Certificate pc = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(p.getC_BPartner_ID()).first();
		//
		String pwd = (String) pc.getProperties().get(SecurityConstants.PASSWORD);
		String pwdsecure = SecureEngine.decrypt(pwd);
		pass.setText(pwdsecure);
		passconfirm.setText(pwdsecure);
		//
		filename = (String) pc.getProperties().get(SecurityConstants.FILENAME);
		keystorename.setText(filename);
		this.data = data;
		setCanGoNext(false);
	}
	protected JComponent createComponent() {
		JComponent panel = new JPanel(new MigLayout());
		pickkeystore = new JButton("...");
		pickkeystore.addActionListener(this);
		test.addActionListener(this);
		passok.setEnabled(false);
		accessok.setEnabled(false);				
		LabelWithMnemonic passlabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "certificate", "password"));
		LabelWithMnemonic passconfirmlabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "certificate", "passwordconfirm"));
		panel.add(keystorename, "grow");
		panel.add(pickkeystore,"wrap");
		panel.add(passlabel);
		panel.add(pass, "wrap");
		panel.add(passconfirmlabel);
		panel.add(passconfirm);
		panel.add(passok,"wrap");
		panel.add(accessstore,"wrap");
		panel.add(accessmsg);
		panel.add(accessok, "skip 1,wrap");
		panel.add(test);		
		Method method = null;
		Method keystoremethod = null;
		try {			
			method = pass.getClass().getMethod("getPassword", null);
			keystoremethod = keystorename.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}    			
		data.registerDataLookup("StorePassword", new DefaultDataLookup(pass, method, null));
		data.registerDataLookup("KeyStorePath", new DefaultDataLookup(keystorename, keystoremethod, null));
		return panel;
	}

	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(test)) {
			test();
		} else if (e.getSource().equals(pickkeystore)){
			File dir = selectDirectory(null, m_directory);
			if (dir != null) {
				m_directory = dir.getAbsolutePath();
				filename = String.format("%s%s%s", m_directory, File.separator, Constants.KEYSTORE_NAME);
				File f = new File(filename);
				if (!f.exists()) {
					if (ADialog.ask(0, null, "KeyStore don't exists, create?")) {
						try {
							String pwd = String.valueOf(pass.getPassword());
							String pwdconf = String.valueOf(passconfirm.getPassword());
							if (pwd.equals(pwdconf) && pwd.length() > 0) {
								KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
								char[] password = pwd.toCharArray();
								ks.load(null, password);
								// Store away the keystore
								FileOutputStream fos = new FileOutputStream(filename);
								ks.store(fos, password);
								fos.close();
							}
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					} else {
						filename = null;
						this.setCanGoNext(false);
					}
				}
			}
			setkeystore();
		}
	}	

	private void setkeystore() {
		if (filename == null) {
			HashMap directories = (HashMap) data.getData("directories");
			JLabel keystore = (JLabel) directories.get(Constants.KEYSTORE);
			filename = String.format("%s%s%s",keystore.getText(), File.separator, Constants.KEYSTORE_NAME);
		}
		if (filename.length() == 0) {
			keystorename.setText("");
		} else {
			File file = new File(filename);
			keystorename.setText(file.getAbsolutePath());
		}

	}

	private File selectDirectory(JComponent parent, String selectedFile) {
		File ret = null;
		JDirectoryChooser chooser;
		chooser = new JDirectoryChooser();
		if (selectedFile != null) {
			chooser.setSelectedFile(new File(selectedFile));
		}
		JTextArea accessory = new JTextArea("seleccione la carpeta");
		accessory.setLineWrap(true);
		accessory.setWrapStyleWord(true);
		accessory.setEditable(false);
		accessory.setOpaque(false);
		accessory.setFont(UIManager.getFont("tree.Font"));
		chooser.setAccessory(accessory);
		int choice = chooser.showOpenDialog(parent);
		if (choice == JDirectoryChooser.APPROVE_OPTION) {
			File[] selectedFiles = chooser.getSelectedFiles();
			for (int i = 0, c = selectedFiles.length; i < c; i++) {
				ret = selectedFiles[i];
				break;
			}
		}
		return ret;		
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
				File fileToStore = new File(filename);
				if (fileToStore.exists()) {
					KeyStore ks = KeyStore.getInstance("JKS");
					InputStream readStream = new FileInputStream(fileToStore);			
					ks.load(readStream, pwd.toCharArray());
					KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
					kmf.init(ks, pwd.toCharArray());
					if (readStream != null) {
						readStream.close();
					}
				}
				accessok.setSelected(true);
				setCanGoNext(true);
			} else {
				accessmsg.setText("password vacio o no coinciden");
			}
		} catch (Exception e) {
			e.printStackTrace();
			setCanGoNext(false);
		}
		if (passok.isSelected() && accessok.isSelected()) {
			setCanGoNext(true);
		} else {
			setCanGoNext(false);
		}
	}
}
