package org.xendra.efact.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.MBankAccount;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_BP_DocType;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Invoice;
import org.compiere.util.Env;
import org.xendra.common.FinishStep;
import org.xendra.efact.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;
import net.javaprog.ui.wizard.Step;
import net.javaprog.ui.wizard.StepModelCustomizer;
import net.miginfocom.swing.MigLayout;

public class PartnerDocTypeStep extends AbstractStep implements StepModelCustomizer, ActionListener {			
	protected DataModel data;
	protected VLookup BPartnerDT = VLookup.create(X_C_BPartner.Table_Name, X_C_BPartner.COLUMNNAME_C_BP_DocType_ID, 0);
	protected optcheckbox isdetraction = new optcheckbox("detraccion", false);
	public PartnerDocTypeStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "documentwizard", "create"),
				ResourceLoader.getString("dialog", "documentwizard", "create_description"));
		this.data = data;
		setCanGoNext(false);		
	}
	
	public void prepareRendering() {
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (BPartnerDT.getValue() != null) {
			setCanGoNext(true);
		}		
	}

	@Override
	protected JComponent createComponent() {		
		Integer C_BPartner_ID = (Integer) data.getData(X_C_Invoice.COLUMNNAME_C_BPartner_ID);
		X_C_BPartner bp = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ?", null)
					.setParameters(C_BPartner_ID).first();	
		if (bp == null) {
			System.out.println("is null");
		}
		BPartnerDT.setValue(bp.getC_BP_DocType_ID());		
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "doctype", "partner")));
		component.add(Box.createVerticalStrut(40));		
		LabelWithMnemonic typeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "doctype", "type"));
		BPartnerDT.addActionListener(this);
		typeLabel.setLabelFor(BPartnerDT);
		WizardTextField middlePanel = new WizardTextField();
		Method method = null;				
		try {
			method = BPartnerDT.getClass().getMethod("getValue", null);
		} catch (NoSuchMethodException nsme) {}
		data.registerDataLookup( X_C_BPartner.COLUMNNAME_C_BP_DocType_ID, new DefaultDataLookup(BPartnerDT, method, null));
		middlePanel.addTextField(BPartnerDT);
		middlePanel.addEmptyExample();
		JPanel pan1 = new JPanel();
		pan1.setLayout(new MigLayout("flowy", "[75%, fill, grow]", "[fill, grow]"));		
		pan1.add(isdetraction);
		pan1.add(middlePanel);
		//component.add(middlePanel);
		component.add(pan1);
		return component;
	}
	public Step[] getPendingSteps() {
		List<Step> steps = new ArrayList<Step>();
		if (isdetraction.isSelected()) {
			steps.add(new DetractionStep(data));
		}
		steps.add(new DocTypeStep(data));
		steps.add(new DocumentTaxStep(data));
		steps.add(new TaxStep());
		steps.add(new FinishStep());
		Step[] list = new Step[steps.size()];
		steps.toArray(list);
		return list;
	}
}
class optcheckbox extends JCheckBox {
	public optcheckbox(String name, boolean ischeck) {
		setName(name);
		String text = ResourceLoader.getString("dialog", "machinewizard", name);
		setText(text);
		setSelected(ischeck);
	}
}
