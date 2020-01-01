package org.xendra.ruleeditor.wizard.newdecisiontable;

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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.Machine;
import org.compiere.model.persistence.X_C_Campaign;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.ruleeditor.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class NewDecisionTemplate extends AbstractStep implements ActionListener {
	protected DataModel data;
	private JTextField textdirectory;
	private JButton button;
	private JFileChooser chooser;
	private File file;		
	private JTextPane textPane;
	private JPanel mainPanel;
	public NewDecisionTemplate(DataModel data) {
		super(ResourceLoader.getString("dialog", "newdecisiontwizard", "template"),
				  ResourceLoader.getString("dialog", "newdecisiontwizard",   "template_description"));
			this.data = data;		
			setCanGoNext(true);    		
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "saleswizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));

		mainPanel = new JPanel(new MigLayout());
		textdirectory = new JTextField();
		textdirectory.setEditable(false);
		mainPanel.add(textdirectory,"grow");
	
		Machine machine = Env.getMachine();	
		String filename = (String) machine.getProperties().get(X_C_Campaign.COLUMNNAME_C_Campaign_ID);		
		textdirectory.setText(filename);
		button = new JButton("..."); //$NON-NLS-1$ //$NON-NLS-2$
		button.setActionCommand("PickFile");
		button.addActionListener(this);

		mainPanel.add(button, "wrap");
		textPane = new JTextPane();
		JScrollPane scroll = new JScrollPane(textPane);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);		
		mainPanel.add(scroll, "grow");
		component.add(mainPanel);

		Method method = null;
		try {
			method = textdirectory.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup("RuleTemplate",new DefaultDataLookup(textdirectory, method, null));
		//
		
		return component;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("PickFile")) {
			chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("DRT Drools Template", "drt");
			chooser.setFileFilter(filter);
			chooser.setCurrentDirectory(new File("."));
			int returnVal = chooser.showOpenDialog(null);
			if (returnVal != JFileChooser.APPROVE_OPTION) {
				return;
			}
			file = chooser.getSelectedFile();
			textdirectory.setText(file.getAbsolutePath());
			String template = Util.getStringFromFile(file);
			textPane.setText(template);
			mainPanel.validate();
		}		
	}
	public void prepareRendering() {
	}	
}
