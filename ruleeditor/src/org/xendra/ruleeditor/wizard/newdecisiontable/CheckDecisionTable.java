package org.xendra.ruleeditor.wizard.newdecisiontable;

import java.awt.Dimension;
import java.io.File;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import org.columba.core.gui.base.MultiLineLabel;
import org.compiere.model.persistence.X_AD_Plugin;
import org.compiere.model.persistence.X_C_Campaign;
import org.drools.decisiontable.ExternalSpreadsheetCompiler;
import org.kie.internal.io.ResourceFactory;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class CheckDecisionTable extends AbstractStep {
	protected DataModel data;
	private JTextPane textPane;

	public CheckDecisionTable(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "campaign"),
				ResourceLoader.getString("dialog", "machinewizard",   "campaign_description"));
		this.data = data;
	}

	public void prepareRendering() {
	}
	

	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		try {
			String error = "";
			String filedecisiontable = (String) data.getData(X_C_Campaign.COLUMNNAME_C_Campaign_ID);
			String fileruletemplate = (String) data.getData("RuleTemplate");
			
			final ExternalSpreadsheetCompiler converter = new ExternalSpreadsheetCompiler();
			String baseDRL = null;
			try {						
				baseDRL = converter.compile(ResourceFactory.newFileResource(new File(filedecisiontable)).getInputStream(), 
						ResourceFactory.newFileResource(new File(fileruletemplate)).getInputStream(), 4, 0);				
			} catch (Exception e) {
				error = e.getMessage();
			}						
			component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
			component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "superuser_text")));
			component.add(Box.createVerticalStrut(40));
			textPane = new JTextPane();
			textPane.setText(baseDRL);
			JScrollPane scroll = new JScrollPane(textPane);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setPreferredSize(new Dimension(250, 155));
			scroll.setMinimumSize(new Dimension(10, 100));
			component.add(scroll);
			Method method = null;
			try {
				method = textPane.getClass().getMethod("getText", null);
			} catch (NoSuchMethodException nsme) {}		
			data.registerDataLookup(X_AD_Plugin.COLUMNNAME_Source,new DefaultDataLookup(textPane, method, null));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return component;
	}
	
}
