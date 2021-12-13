package org.xendra.pfe.wizard.export;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Table_Access;
import org.xendra.pfe.util.ResourceLoader;

import com.l2fprod.common.swing.JDirectoryChooser;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class ExportStep extends AbstractStep implements ActionListener  {
	private DataModel m_data;
	private JTextField textdirectory;
	private JButton button;
	private File m_filename;	
	public ExportStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "exportwizard", "identify"),
				ResourceLoader.getString("dialog", "exportwizard", "identify_description"));
		m_data = data;		
		setCanGoNext(true);
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "exportsessionwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));
			
		JPanel mainPanel = new JPanel(new MigLayout());
		textdirectory = new JTextField();
		textdirectory.setEditable(false);
		mainPanel.add(textdirectory);
		textdirectory.setColumns(40);
		
		button = new JButton("..."); //$NON-NLS-1$ //$NON-NLS-2$
		button.setActionCommand("PickDirectory");
		button.addActionListener(this);
		 
		mainPanel.add(button, "wrap");

		component.add(mainPanel);

		Method method = null;
        try {
            method = textdirectory.getClass().getMethod("getText", null);
        } catch (NoSuchMethodException nsme) {}
        m_data.registerDataLookup(X_AD_Table_Access.COLUMNNAME_IsCanExport,new DefaultDataLookup(textdirectory, method, null));        
		
		return component;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if (command.equals("PickDirectory")) {
			setfilename(selectDirectory(textdirectory.getText()));
		}		
		
	}
	
	private void setfilename(File file) {
		m_filename = file;	
		if (m_filename != null && m_filename.exists()) {
			textdirectory.setText(m_filename.getAbsolutePath());
			setCanGoNext(true);
		} else {
			textdirectory.setText("");
		}		
	}

	static File selectDirectory(String selectedFile) {
		File ret = null;
		JDirectoryChooser chooser;

		chooser = new JDirectoryChooser();
		if (selectedFile != null) {
			chooser.setSelectedFile(new File(selectedFile));
		}

		JTextArea accessory = new JTextArea("seleccione el folder");
		accessory.setLineWrap(true);
		accessory.setWrapStyleWord(true);
		accessory.setEditable(false);
		accessory.setOpaque(false);
		accessory.setFont(UIManager.getFont("Tree.font"));
		chooser.setAccessory(accessory);
		int choice = chooser.showOpenDialog(null);
		if (choice == JDirectoryChooser.APPROVE_OPTION) {
			File[] selectedFiles = chooser.getSelectedFiles();
			for (int i = 0, c = selectedFiles.length; i < c; i++) {				
				ret = selectedFiles[i];
			}
		} 
		return ret;
	}
	
    public void prepareRendering() {
    }	
}
