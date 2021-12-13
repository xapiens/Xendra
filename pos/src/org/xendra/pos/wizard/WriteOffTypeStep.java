package org.xendra.pos.wizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Machine;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.util.Env;
import org.xendra.pos.util.ResourceLoader;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class WriteOffTypeStep extends AbstractStep implements ActionListener {
	protected DataModel data;
	private VLookup writeofftype;

	public WriteOffTypeStep(DataModel data) {
		super(ResourceLoader.getString("dialog", "machinewizard", "writeofftype"),
				ResourceLoader.getString("dialog", "machinewizard", "writeofftype_description"));
		this.data = data;
		setCanGoNext(false);
	}
	public void prepareRendering() {
	}

	protected JComponent createComponent() {
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "machinewizard", "writeofftype_text")));
		component.add(Box.createVerticalStrut(40));

		Method method = null;
		Method methoddoctype = null;
		LabelWithMnemonic writeofftypeLabel = new LabelWithMnemonic(ResourceLoader.getString("dialog", "machinewizard", "writeofftype"));		
		writeofftype = VLookup.create(X_C_POS.Table_Name, X_C_POS.COLUMNNAME_WriteOffType, 0);
		writeofftype.addActionListener(this);
		writeofftypeLabel.setLabelFor(writeofftype);
				
		Machine machine = Env.getMachine();
		Integer C_POS_ID = machine.getIntProperty(X_C_POS.COLUMNNAME_C_POS_ID);
		if (C_POS_ID > 0) {
			X_C_POS pos = new Query(Env.getCtx(), X_C_POS.Table_Name, "C_POS_ID = ?", null)
				.setParameters(C_POS_ID).first();
			if (pos != null) {
				writeofftype.setValue(pos.getWriteOffType());
			}
		}		
		try {			
			method = writeofftype.getClass().getMethod("getValue", null);			
		} 
		catch (NoSuchMethodException nsme) {}		
		data.registerDataLookup(X_C_POS.COLUMNNAME_WriteOffType,new DefaultDataLookup(writeofftype, method, null));

		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addLabel(writeofftypeLabel);
		middlePanel.addTextField(writeofftype);
		middlePanel.addExample(new JLabel(ResourceLoader.getString("dialog", "machinewizard", "writeofftypeexample")));
		component.add(middlePanel);				
		
		return component;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		if (writeofftype.getValue() != null) {
			setCanGoNext(true);
		}
	}

}
