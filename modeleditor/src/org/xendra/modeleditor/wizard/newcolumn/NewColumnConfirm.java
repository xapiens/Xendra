package org.xendra.modeleditor.wizard.newcolumn;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MRefList;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Element;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.ValueNamePair;
import org.xendra.modeleditor.util.ResourceLoader;
import org.xendra.modeleditor.wizard.common.components;
import org.xendra.modeleditor.wizard.common.spnfield;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.miginfocom.swing.MigLayout;

public class NewColumnConfirm extends AbstractStep {
	
	protected DataModel data;
	protected JLabel columnname = new JLabel();
	protected JLabel referencename = new JLabel();
	protected JLabel entitytypename = new JLabel();
	protected JLabel referencevaluename = new JLabel();
	protected JLabel fieldlengthname = new JLabel();
	protected JLabel fieldversionname = new JLabel();
	public NewColumnConfirm(DataModel data) {		
		super(ResourceLoader.getString("dialog", "newcolumninfowizard", "identity"),
				ResourceLoader.getString("dialog", "newcolumninfowizard",   "identity_description"));
		this.data = data;		
		setCanGoNext(true);
	}

	@Override
	public void prepareRendering() {
		setColumnName((String) data.getData(X_AD_Column.COLUMNNAME_Name));
		VLookup ref = (VLookup) components.getInstance().getControls().get(X_AD_Column.COLUMNNAME_AD_Reference_ID);
		referencename.setText(ref.getDisplay());
		VLookup etref = (VLookup) components.getInstance().getControls().get(X_AD_Column.COLUMNNAME_EntityType);
		entitytypename.setText(etref.getDisplay());
		VLookup refval = (VLookup) components.getInstance().getControls().get(X_AD_Column.COLUMNNAME_AD_Reference_Value_ID);
		referencevaluename.setText(refval.getDisplay());
		spnfield fieldlength = (spnfield) components.getInstance().getControls().get(X_AD_Column.COLUMNNAME_FieldLength);
		fieldlengthname.setText(String.valueOf(fieldlength.getValue()));
		spnfield fieldversion = (spnfield) components.getInstance().getControls().get(X_AD_Column.COLUMNNAME_Version);
		fieldversionname.setText(String.valueOf(fieldversion.getValue()));
	}
	
	private void setColumnName(String name) {
		columnname.setText(name);
	}

	private void setReference(String reference) {
		referencename.setText(name);
	}
	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "newcolumnwizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));
		WizardTextField textfield = new WizardTextField();		
		textfield.addLabel(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_Description)));
		JPanel pan = new JPanel();
		pan.setLayout(new MigLayout());
		pan.add(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_Name)));
		pan.add(columnname, "wrap");
		pan.add(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_EntityType)));
		pan.add(entitytypename, "wrap");
		pan.add(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_AD_Reference_ID)));		
		pan.add(referencename, "wrap");
		pan.add(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_AD_Reference_Value_ID)));
		pan.add(referencevaluename, "wrap");
		pan.add(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_FieldLength)));
		pan.add(fieldlengthname, "wrap");
		pan.add(new JLabel(Msg.translate(Env.getCtx(), X_AD_Column.COLUMNNAME_Version)));
		pan.add(fieldversionname, "wrap");
		textfield.addTextField(pan);			
		textfield.addExample(new JLabel("explication"));	
		component.add(textfield);
		return component;		
	}
}