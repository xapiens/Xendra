package org.xendra.newclient.wizard;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import org.compiere.model.MStore;
import org.compiere.util.Ini;
import org.compiere.util.SecureEngine;
import org.xendra.Constants;
import org.xendra.core.resourceloader.ResourceLoader;
import com.l2fprod.common.swing.JDirectoryChooser;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class DirectoriesStep extends AbstractStep implements ActionListener  {
	private DataModel data;	
	private JComponent panel;
	HashMap<String, JLabel> paths = new HashMap<String, JLabel>();
	HashMap<String, JButton> buttons = new HashMap<String, JButton>();
	public DirectoriesStep(DataModel data) {
		super(ResourceLoader.getString("certificate", "directories"),
				ResourceLoader.getString("certificate",   "directories_description"));
		set(Constants.PLUGINS);
		set(Constants.KEYSTORE);
		set(Constants.TRASH);
		set(Constants.STORE);
		set(Constants.REPLICATION);
		set(Constants.REPORTS);
		set(Constants.DOWNLOAD);
		set(Constants.INSTALLED);
		this.data = data;		
	}
	
	public void prepareRendering() {

	}
	protected JComponent createComponent() {
		panel = new JPanel(new MigLayout());
		panel.add(new JLabel("keystore"));
		panel.add(paths.get(Constants.KEYSTORE));
		panel.add(buttons.get(Constants.KEYSTORE), "wrap");
		panel.add(new JLabel("plugins"));
		panel.add(paths.get(Constants.PLUGINS));
		panel.add(buttons.get(Constants.PLUGINS),"wrap");		
		panel.add(new JLabel("store"));
		panel.add(paths.get(Constants.STORE));
		panel.add(buttons.get(Constants.STORE),"wrap");		
		panel.add(new JLabel("trash"));
		panel.add(paths.get(Constants.TRASH));
		panel.add(buttons.get(Constants.TRASH),"wrap");
		panel.add(new JLabel("replication"));
		panel.add(paths.get(Constants.REPLICATION));
		panel.add(buttons.get(Constants.REPLICATION), "wrap");
		panel.add(new JLabel("reports"));
		panel.add(paths.get(Constants.REPORTS));
		panel.add(buttons.get(Constants.REPORTS), "wrap");
		panel.add(new JLabel("download"));
		panel.add(paths.get(Constants.DOWNLOAD));
		panel.add(buttons.get(Constants.DOWNLOAD), "wrap");
		panel.add(new JLabel("installed"));
		panel.add(paths.get(Constants.INSTALLED));
		panel.add(buttons.get(Constants.INSTALLED));
		Method method = null;
		try {			
			method = this.getClass().getMethod("getDir", null);
		} 
		catch (NoSuchMethodException nsme) {
		}			    	
		data.registerDataLookup("directories",new DefaultDataLookup(this, method, null));		
		return panel;
	}
	
	public HashMap getDir() {
		return paths;
	}

	private void set(String dir) {
		String path = Ini.getXendraFolder(dir, true);
		paths.put(dir, new JLabel(path));
		JButton btn = new JButton("...");
		btn.setActionCommand(dir);
		btn.addActionListener(this);
		buttons.put(dir, btn);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton btn = (JButton) e.getSource();
			String actiondir = btn.getActionCommand();
			String path = paths.get(actiondir).getText();
			File dir = selectDirectory(null, path);
			if (dir != null) {				
				JLabel lbl = (JLabel) paths.get(actiondir);
				lbl.setText(dir.getAbsolutePath());				
				//HashMap properties = Env.getMachine().getProperties();
				//properties.put(actiondir, dir.getAbsolutePath());
				//Env.getMachine().setProperties(properties);
				//Env.getMachine().save();
			}			
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
