package org.xendra.newclient.wizard;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.compiere.swing.CCheckBox;
import org.compiere.swing.CPassword;
import org.compiere.util.Ini;
import org.xendra.Constants;
import org.xendra.core.resourceloader.ResourceLoader;
import org.xendra.security.api.XendraKeyStore;
import com.l2fprod.common.swing.JDirectoryChooser;
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
	// checks of integrity
	private CCheckBox keystoreok = new CCheckBox();
	private CCheckBox passok = new CCheckBox();
	private CCheckBox accessok = new CCheckBox();
	private String m_directory;
	//private String filename = Ini.getProperty(XendraKeyStore.XENDRA_KEYSTORE);
	private String filename = null;
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
		keystoreok.setEnabled(false);
		passok.setEnabled(false);
		accessok.setEnabled(false);
		JComponent panel = new JPanel(new MigLayout());			
		panel.add(getkeystore());
		panel.add(pickkeystore);
		panel.add(keystoreok,"wrap");		
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
		if (e.getSource().equals(pickkeystore)) {
			File dir = selectDirectory(null, m_directory);
			if (dir != null) {
				m_directory = dir.getAbsolutePath();
				//filename = String.format("%s%s%s", m_directory, File.separator, Constants.KEYSTORE_NAME);				
				filename = String.format("%s%s%s", m_directory, File.separator, Constants.KEYSTORE_NAME);
				File f = new File(filename);
				if (!f.exists()) {
					if (ADialog.ask(0, null,"Keystore don't exists, create?")) {
						try {
							String pwd = String.valueOf(pass.getPassword());
							String pwdconf = String.valueOf(passconfirm.getPassword());        
							if (pwd.equals(pwdconf) && pwd.length() > 0) {
								KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
								char[] password = pwd.toCharArray();
								ks.load(null, password);
								// Store away the keystore.
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
		} else if (e.getSource().equals(test)) {
			test();
		}
	}	

	protected void setkeystore() {
		if (filename == null) {
			HashMap directories = (HashMap) data.getData("directories");
			JLabel keystore = (JLabel) directories.get(Constants.KEYSTORE);
			filename = String.format("%s%s%s", keystore.getText(), File.separator, Constants.KEYSTORE_NAME);
		}
		if (filename.length() == 0) {
			//m_directory = Ini.getXendraFolder(Constants.KEYSTORE, true);
			//if (!m_directory.endsWith(File.separator)) {
			//	m_directory += File.separator;
			//}
			//filename = String.format("%s%s", m_directory, Constants.KEYSTORE_NAME);
			//Ini.setProperty(XendraKeyStore.XENDRA_KEYSTORE, filename);
			keystorename.setText("");
		} else {
			File file = new File(filename);
			keystorename.setText(file.getAbsolutePath());			
		}
		//
	}

	protected JLabel getkeystore() {
		setkeystore();
		return keystorename;		
	}

	private void setoff() {
		keystoreok.setSelected(false);
		passok.setSelected(false);
		accessok.setSelected(false);
	}
	private void test() {
		setoff();
		File file = new File(filename);
		if (file.exists()) 
			keystoreok.setSelected(true);
		else {
			accessmsg.setText(String.format("%s don't exists", file));
		}
		String pwd = String.valueOf(pass.getPassword());
		String pwdconf = String.valueOf(passconfirm.getPassword());        
		if (pwd.equals(pwdconf) && pwd.length() > 0) {
			passok.setSelected(true);
		} else {
			accessmsg.setText("password vacio o no coinciden");
		}
		if (keystoreok.isSelected() && passok.isSelected()) {
			accessstore();
		}
		if (keystoreok.isSelected() && passok.isSelected() && accessok.isSelected()) {
			setCanGoNext(true);
		} else {
			setCanGoNext(false);
		}
	}

	public void accessstore() {
		try {
			File fileToStore = new File(filename);
			long size = fileToStore.length();
			KeyStore ks = KeyStore.getInstance("JKS");
			if (size == 0) {
				ks.load(null, pass.getPassword());
				FileOutputStream fos = new FileOutputStream(fileToStore.getAbsolutePath());
				ks.store(fos, pass.getPassword());
				fos.close();
			}			
			InputStream readStream = new FileInputStream(fileToStore);			
			ks.load(readStream, pass.getPassword());
			KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509","SunJSSE");
			kmf.init(ks, pass.getPassword());
			accessmsg.setText("acceso correcto");
			accessok.setSelected(true);
		} catch (Exception e) {
			accessmsg.setText(e.getMessage());
			e.printStackTrace();
		}
	}

	File selectDirectory(Component parent, String selectedFile) {
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
		accessory.setFont(UIManager.getFont("Tree.font"));
		chooser.setAccessory(accessory);
		int choice = chooser.showOpenDialog(parent);
		if (choice == JDirectoryChooser.APPROVE_OPTION) {
			File[] selectedFiles = chooser.getSelectedFiles();
			for (int i = 0, c = selectedFiles.length; i < c; i++) {				
				ret = selectedFiles[i];
			}
		}		 
		return ret;
	}
}