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
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.Machine;
import org.compiere.model.persistence.X_C_Campaign;
import org.compiere.util.Env;
import org.drools.decisiontable.ExternalSpreadsheetCompiler;
import org.kie.internal.io.ResourceFactory;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class NewDecisionTable extends AbstractStep implements ActionListener {
	protected DataModel data;
	private JTextField textdirectory;
	private JButton button;
	private JFileChooser chooser;
	private File file;		
	public NewDecisionTable(DataModel data) {
		super(ResourceLoader.getString("dialog", "newdtwizard", "identity"),
				  ResourceLoader.getString("dialog", "newdtwizard",   "identity_description"));
			this.data = data;		
			setCanGoNext(true);    		
	}

	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "saleswizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));

		JPanel mainPanel = new JPanel(new MigLayout());
		textdirectory = new JTextField();
		textdirectory.setEditable(false);
		mainPanel.add(textdirectory);
		textdirectory.setColumns(40);

		Machine machine = Env.getMachine();	
		String filename = (String) machine.getProperties().get(X_C_Campaign.COLUMNNAME_C_Campaign_ID);		
		textdirectory.setText(filename);
		button = new JButton("..."); //$NON-NLS-1$ //$NON-NLS-2$
		button.setActionCommand("PickFile");
		button.addActionListener(this);

		mainPanel.add(button, "wrap");

		component.add(mainPanel);

		Method method = null;
		try {
			method = textdirectory.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_C_Campaign.COLUMNNAME_C_Campaign_ID,new DefaultDataLookup(textdirectory, method, null));        		
		return component;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("PickFile")) {
			chooser = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter("XLS Campain", "xls");
			chooser.setFileFilter(filter);
			chooser.setCurrentDirectory(new File("."));
			int returnVal = chooser.showOpenDialog(null);
			if (returnVal != JFileChooser.APPROVE_OPTION) {
				return;
			}
			file = chooser.getSelectedFile();
			//String error = iscampaign(file);
			//if (error.length() > 0) {
			//	Window w = ActiveWindowTracker.findActiveWindow();
			//	ADialog.error(Env.getWindowNo(w), null, error);	        	
			//} else {	        
				textdirectory.setText(file.getAbsolutePath());
			//}
		}		
	}
	
	private String iscampaign(File file) {
		System.out.println("XX");
		String error = "";
		File file2 = new File("/home/americas/projects/drools/price.drt");
		final ExternalSpreadsheetCompiler converter = new ExternalSpreadsheetCompiler();
		String baseDRL = null;
		try {						
			baseDRL = converter.compile(ResourceFactory.newFileResource(file).getInputStream(), 
					ResourceFactory.newFileResource(file2).getInputStream(), 4, 0);			
			//DecisionTableConfiguration dtconf = KnowledgeBuilderFactory.newDecisionTableConfiguration();
			//dtconf.setInputType(DecisionTableInputType.XLS);
			//KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
			//knowledgeBuilder.add(ResourceFactory.newFileResource(file), ResourceType.DTABLE, dtconf);
			//if (knowledgeBuilder.hasErrors()) {
			//				throw new RuntimeException(knowledgeBuilder.getErrors().toString());
			//}
		} catch (Exception e) {
			error = e.getMessage();
		}
		return error;
	}
	public void prepareRendering() {
	}	
}
