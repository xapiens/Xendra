package org.xendra.ruleeditor.wizard.newsession;

import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.swing.CTextField;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.ruleeditor.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class SessionProperties extends AbstractStep {
	protected DataModel data;
	protected JComboBox sessionType;
	protected CTextField packagename;
	protected JComboBox EqualsBehavior;
	protected JComboBox EventProcessingMode;
	protected JCheckBox isdefault;
	private JComboBox RuleType;
	public SessionProperties(DataModel data) {		
		super(ResourceLoader.getString("dialog", "newsessionwizard","sessiondetails"),
				ResourceLoader.getString("dialog", "newsessionwizard","sessiondetails_description"));
		this.data = data;
		setCanGoNext(true);
		//
		Method methodtype = null;
		sessionType = new JComboBox();
		sessionType.addItem(new ValueNamePair("kiebase","Knowledge Base"));
		sessionType.addItem(new ValueNamePair("model", "Model"));
		sessionType.addItem(new ValueNamePair("listen", "Listen"));
		try {
			methodtype = sessionType.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(Constants.XML_ATTRIBUTE_TYPE, new DefaultDataLookup(sessionType, methodtype, null));		
		//
		Method methodpkg = null;
		packagename = new CTextField(20);
		try {
			methodpkg = packagename.getClass().getMethod("getText", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(Constants.XML_ATTRIBUTE_PACKAGE, new DefaultDataLookup(packagename, methodpkg, null));
		//
		Method method3 = null;
		RuleType = new JComboBox();
		RuleType.addItem(new ValueNamePair("R","JSR94RuleEngineAPI"));
		RuleType.addItem(new ValueNamePair("Q","SQL"));
		RuleType.addItem(new ValueNamePair("O","AspectOrientProgram"));		
		RuleType.addItem(new ValueNamePair("S","JSR223ScriptingAPIs"));
		RuleType.addItem(new ValueNamePair("L","Listener"));
		RuleType.addItem(new ValueNamePair("A","Acceptor"));
		try {
			method3 = RuleType.getClass().getMethod("getSelectedItem", null);			
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(X_AD_Rule.COLUMNNAME_RuleType, new DefaultDataLookup(RuleType, method3, null));		
		//
		Method method1 = null;
		EqualsBehavior = new JComboBox();
		EqualsBehavior.addItem("EQUALITY");
		EqualsBehavior.addItem("IDENTITY");
		try {
			method1 = EqualsBehavior.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(Constants.XML_ATTRIBUTE_EQUALSBEHAVIOR, new DefaultDataLookup(EqualsBehavior, method1, null));
		//
		Method method2 = null;
		EventProcessingMode = new JComboBox();
		EventProcessingMode.addItem("CLOUD");
		EventProcessingMode.addItem("STREAM");
		try {
			method2 = EventProcessingMode.getClass().getMethod("getSelectedItem", null);					
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(Constants.XML_ATTRIBUTE_EVENTPROCESSINGMODE, new DefaultDataLookup(EventProcessingMode, method2, null));
		// 
		Method defaultselected = null;
		isdefault = new JCheckBox("Default");
		isdefault.setSelected(false);				
		try {
			defaultselected = isdefault.getClass().getMethod("isSelected", null);			
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup(Constants.XML_ATTRIBUTE_DEFAULT, new DefaultDataLookup(isdefault, defaultselected, null));
	}
	
	public void prepareRendering() {
		// TODO Auto-generated method stub
		
	}
	
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newsessionwizard","sessiondetails_text")));
		component.add(Box.createVerticalStrut(40));
		
		WizardTextField panel4 = new WizardTextField();
		LabelWithMnemonic label4 = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newsessionwizard", "sessiontype"));
		panel4.addLabel(label4);
		panel4.addTextField(sessionType);
		panel4.addEmptyExample();
		component.add(panel4);
		
		WizardTextField panelpkg = new WizardTextField();
		LabelWithMnemonic labelpkg = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newsessionwizard", "packagename"));
		panelpkg.addLabel(labelpkg);
		panelpkg.addTextField(packagename);
		panelpkg.addEmptyExample();
		component.add(panelpkg);
		
		WizardTextField panel3 = new WizardTextField();
		LabelWithMnemonic label3 = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newsessionwizard", "ruletype"));
		panel3.addLabel(label3);
		panel3.addTextField(RuleType);
		panel3.addEmptyExample();
		component.add(panel3);
		
		WizardTextField middlePanel = new WizardTextField();
        LabelWithMnemonic sourceLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newsessionwizard", "equalsbehavior"));
        middlePanel.addLabel(sourceLabel);
		middlePanel.addTextField(EqualsBehavior);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		
		WizardTextField panel2 = new WizardTextField();
		LabelWithMnemonic label2 = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newsessionwizard", "eventprocessingmode"));
		panel2.addLabel(label2);
		panel2.addTextField(EventProcessingMode);
		panel2.addEmptyExample();
		component.add(panel2);

		// name of package
		
		// default
		WizardTextField paneldefault = new WizardTextField();
		LabelWithMnemonic label5 = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newsessionwizard", "isdefault"));
		paneldefault.addLabel(label5);
		paneldefault.addTextField(isdefault);
		paneldefault.addEmptyExample();
		component.add(paneldefault);
		
		return component;				
	}

}
