package org.columba.core.gui.processmanager.wizard;

import java.beans.PropertyChangeListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.model.persistence.X_A_Machine;

import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.Step;
import net.miginfocom.swing.MigLayout;

public class MachineConfirmStep extends AbstractStep {
	private DataModel data;
	public MachineConfirmStep(DataModel data) {
		super(GlobalResourceLoader.getString("dialog","machinewizard", "confirm"),
				GlobalResourceLoader.getString("dialog","machinewizard", "confirm_description"));
		this.data = data;		
		setCanGoNext(true);
	}
	
	@Override
	public void prepareRendering() {
		
	}
	
	@Override
	protected JComponent createComponent() {
		JComponent component = new JPanel(new MigLayout());
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(GlobalResourceLoader.getString("dialog", "machinewizard", "identity_text")));
		component.add(Box.createVerticalStrut(40));

		WizardTextField middlePanel = new WizardTextField();
		middlePanel.addExample(new JLabel(String.format("va a crear el equipo %s", data.getData(X_A_Machine.COLUMNNAME_A_Machine_ID))));
		component.add(middlePanel);
		return component;


	}
}
