package org.xendra.efact.wizard;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Method;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.columba.core.gui.base.MultiLineLabel;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.model.persistence.X_C_SPOT;
import org.xendra.efact.util.ResourceLoader;
import net.javaprog.ui.wizard.AbstractStep;
import net.javaprog.ui.wizard.DataModel;
import net.javaprog.ui.wizard.DefaultDataLookup;

public class SpotStep extends AbstractStep {
	protected DataModel data;
	protected spnfield minamt = new spnfield(this, "Min",1,0,1000);
	protected spnfield rate = new spnfield(this, "Rate",1,0,100);
	public SpotStep(DataModel data) {
    	super(ResourceLoader.getString("dialog", "machinewizard", "doctypeprintformat"),
    			ResourceLoader.getString("dialog", "machinewizard",   "doctypeprintformat_description"));
    	this.data = data;
    	setCanGoNext(false);		
	}
	@Override
	protected JComponent createComponent() {		
		JComponent component = new JPanel();
		component.setLayout(new BoxLayout(component, BoxLayout.Y_AXIS));
		component.add(new MultiLineLabel(ResourceLoader.getString("dialog", "partnerwizard", "create_text")));
		component.add(Box.createVerticalStrut(40));

		add(component, rate, X_C_SPOT.COLUMNNAME_C_RetentionRate);
		add(component, minamt, X_C_SPOT.COLUMNNAME_C_RetentionMinAmt);
		return component;
	}
	@Override
	public void prepareRendering() {
		
	}
		
	private void add(JComponent component, spnfield spinner,String id) {
		WizardTextField textfield = new WizardTextField();
		try {
			Method method = spinner.getClass().getMethod("getValue", null);
			data.registerDataLookup(id, new DefaultDataLookup(spinner, method, null));
			textfield.addLabel(spinner.getLabel());
			textfield.addTextField(spinner);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			component.add(textfield);
		}
	}
	public void setCanGoNext(Boolean next) {		
		super.setCanGoNext(next);				
	}

}
class spnfield extends JSpinner {
	JLabel labelname = new JLabel();
	private SpotStep m_spotStep;
	public spnfield(SpotStep spotStep, String name, int value, int min, int max) {
		m_spotStep = spotStep;
		this.addChangeListener(new SpinnerListener(this));
		setName(name);
		String text = ResourceLoader.getString("dialog", "machinewizard", name);
		labelname.setText(text);
		labelname.setLabelFor(this);
		setModel(new SpinnerNumberModel(value, min, max, 1));
	}
	public JLabel getLabel() {
		return labelname;
	}
	public SpotStep getSpotStep() {
		return m_spotStep;
	}
}
class SpinnerListener implements ChangeListener {
	
	private spnfield rate;

	public SpinnerListener(spnfield spnfield) {
		rate = spnfield;
	}

	public void stateChanged(ChangeEvent evt) {
		Integer value = (Integer) rate.getModel().getValue();
		if (value >= 1) {
			rate.getSpotStep().setCanGoNext(true);		
		}
	}
}
