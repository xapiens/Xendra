package org.xendra.security.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Method;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.MBPartner;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BPartner_Certificate;
import org.compiere.swing.CCheckBox;
import org.compiere.util.Env;
import org.xendra.security.util.ResourceLoader;
import org.xendra.security.api.SecurityConstants;

import com.l2fprod.common.swing.JDirectoryChooser;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class SendFilePathStep extends AbstractStep implements ActionListener  {
	protected DataModel data;
	private JButton picksendfilepath;
	private JLabel sendfilepathname = new JLabel();
	private CCheckBox passok = new CCheckBox();
	private JButton test = new JButton("test");
	private String m_directory;
	public SendFilePathStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "sendfilepathwizard", "sendfile"),
				ResourceLoader.getString("dialog", "sendfilepathwizard", "sendfile_description"));
		this.data = data;
		setCanGoNext(false);
	}
	public SendFilePathStep(MBPartner p, DataModel data) {
		super(ResourceLoader.getString("dialog", "sendfilepathwizard", "sendfile"),
				ResourceLoader.getString("dialog", "sendfilepathwizard", "sendfile_description"));
		X_C_BPartner_Certificate pc = new Query(Env.getCtx(), X_C_BPartner_Certificate.Table_Name, "C_BPartner_ID = ?", null)
				.setParameters(p.getC_BPartner_ID()).first();	
		String sendfilepath = (String) pc.getProperties().get(SecurityConstants.SENDFILESPATH);
		if (sendfilepath == null)
			sendfilepath  = "";
		sendfilepathname.setText(sendfilepath);
		this.data = data;
		setCanGoNext(false);
	}
	protected JComponent createComponent() {
		JComponent panel = new JPanel(new MigLayout());
		picksendfilepath = new JButton("...");
		picksendfilepath.addActionListener(this);
		passok.setEnabled(false);
		test.addActionListener(this);
		LabelWithMnemonic sendfiletext = new LabelWithMnemonic(ResourceLoader.getString("dialog", "sendfilepathwizard", "sendfile_text"));
		LabelWithMnemonic sendfilelabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "sendfilepathwizard", "sendfilelabel"));
		panel.add(sendfiletext, "wrap");
		panel.add(sendfilelabel);
		panel.add(sendfilepathname, "grow");
		panel.add(picksendfilepath,"wrap");
		panel.add(passok,"wrap");
		panel.add(test);			
		Method sendfilepathmethod = null;
		try {			
			sendfilepathmethod = sendfilepathname.getClass().getMethod("getText", null);			
		} catch (NoSuchMethodException nsme) {}    					
		data.registerDataLookup("SendFilePath", new DefaultDataLookup(sendfilepathname, sendfilepathmethod, null));
		return panel;		
	}
	public void prepareRendering() {
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(test)) {
			test();
		} else if (e.getSource().equals(picksendfilepath)){
			m_directory = "";
			File dir = selectDirectory(null, m_directory);			
			if (dir != null) {
				m_directory = dir.getAbsolutePath();
				if (!dir.exists()) {
					this.setCanGoNext(false);
				} else {				
					this.setCanGoNext(true);
				}
			} 
			setpicksendfilepath();
		}		
	}
	private void setpicksendfilepath() {
		sendfilepathname.setText(m_directory);
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
		passok.setSelected(false);
		setCanGoNext(false);
	}
	private void test() {
		setoff();
		File fileToStore = new File(sendfilepathname.getText());
		if (fileToStore.exists()) {
			passok.setSelected(true);
			setCanGoNext(true);			
		}
	}	
}
