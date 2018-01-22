package org.xendra.newclient.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_AD_Language;
import org.compiere.swing.CComboBox;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.xendra.newclient.i18n.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class LanguageStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private CComboBox fLanguage;
	private JComboBox salesrepComboBox;
	public LanguageStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "newclient", "language"),
    			ResourceLoader.getString("dialog", "newclient",   "language_description"));
    	this.data = data;		
	}
	protected JComponent createComponent() {
		JComponent component = new JPanel();
        component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
        component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newclient", "language_text")));
        component.add(Box.createVerticalStrut(40));
        
		WizardTextField middlePanel = new WizardTextField();
		
		Method method = null;
		
		LabelWithMnemonic saleslabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "newclient", "language"));
		salesrepComboBox = new JComboBox();
		salesrepComboBox.addActionListener(this);
		saleslabel.setLabelFor(salesrepComboBox);
		
		for (int i = 0; i < Language.getLanguageCount(); i++)
		{
			Language language = Language.getLanguage(i);
			salesrepComboBox.addItem(language);
			if (language.equals(Language.getBaseAD_Language())) {
				salesrepComboBox.setSelectedItem(language);
			}
		}
		try {
			method = salesrepComboBox.getClass().getMethod("getSelectedItem", null);
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_AD_Language.COLUMNNAME_AD_Language_ID,new DefaultDataLookup(salesrepComboBox, method, null));
		middlePanel.addLabel(saleslabel);
		middlePanel.addTextField(salesrepComboBox);
		middlePanel.addEmptyExample();
		component.add(middlePanel);
		return component;				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Language language = (Language) salesrepComboBox.getSelectedItem();		
		Env.getCtx().put(Env.LANGUAGE, language.getAD_Language());
	}
	public void prepareRendering() {
	}	
}
