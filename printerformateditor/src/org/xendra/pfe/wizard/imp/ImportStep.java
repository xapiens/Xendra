package org.xendra.pfe.wizard.imp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Table_Access;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.xendra.pfe.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class ImportStep extends AbstractStep implements ActionListener {
	private DataModel m_data;
	private JTextField textdirectory;
	private JButton button;
	private File m_file;		
	public ImportStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "importwizard", "identify"),
				ResourceLoader.getString("dialog", "importtwizard", "identify_description"));
		m_data = data;		
		setCanGoNext(true);
	}
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "importsessionwizard", "identity_text")));
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
			String directory = org.compiere.Xendra.getXendraHome();
			JFileChooser chooser = new JFileChooser(directory);
			chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			chooser.setMultiSelectionEnabled(false);
			chooser.setDialogTitle(Msg.getMsg(Env.getCtx(), "FileImportFileInfo"));
			if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION)
				return;
			m_file = chooser.getSelectedFile();
			textdirectory.setText(m_file.getAbsolutePath());		}		
		
	}
    public void prepareRendering() {
    }	
}
