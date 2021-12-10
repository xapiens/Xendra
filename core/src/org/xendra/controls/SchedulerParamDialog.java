package org.xendra.controls;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.HashMap;

import javax.swing.JDialog;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.ConfirmPanel;
import org.compiere.grid.ed.VEditor;
import org.compiere.grid.ed.VEditorFactory;
import org.compiere.model.GridField;
import org.compiere.model.GridFieldVO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Process_Para;
import org.compiere.model.persistence.X_AD_Scheduler_Para;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.swing.CButton;
import org.compiere.util.Env;

public class SchedulerParamDialog extends JDialog implements VetoableChangeListener, ActionListener {
	private HashMap props;
	private VEditor vEditor;
	private CButton bOK = ConfirmPanel.createOKButton(true);
	
	public SchedulerParamDialog(HashMap props) {
		this.props = props;
		setModal(true);
	}
	
	public boolean init() {		
		X_AD_Process_Para pp = new Query(Env.getCtx(), X_AD_Process_Para.Table_Name, "AD_Process_Para_ID = ?", null)
		.setParameters(props.get(X_AD_Process_Para.COLUMNNAME_AD_Process_Para_ID)).first();
		if (pp != null) {
			X_AD_Val_Rule valrule = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "AD_Val_Rule_ID = ?", null)
			.setParameters(pp.getAD_Val_Rule_ID()).first();		

			GridFieldVO voF = GridFieldVO.createStdField(Env.getCtx(), 
					0, 0, 0, 0, false, false, false);
			voF.isProcess = true;
			voF.IsDisplayed = true;
			voF.IsReadOnly = false;
			voF.IsUpdateable = true;

			voF.AD_Table_ID = 0;
			voF.AD_Column_ID = pp.getAD_Process_Para_ID();
			voF.ColumnName = pp.getColumnName();
			voF.Header = pp.getName();
			voF.Description = pp.getDescription();
			voF.Help = pp.getHelp();
			voF.displayType = pp.getAD_Reference_ID();
			voF.IsMandatory = pp.isMandatory();
			voF.FieldLength = pp.getFieldLength();
			voF.DisplayLength = pp.getFieldLength();
			voF.DefaultValue = pp.getDefaultValue();
			voF.DefaultValue2 = pp.getDefaultValue2();
			voF.VFormat = pp.getVFormat();
			voF.ValueMin = pp.getValueMin();
			voF.ValueMax = pp.getValueMax();
			voF.isRange = pp.isRange();
			//
			voF.AD_Reference_Value_ID = pp.getAD_Reference_Value_ID();
			if (valrule != null) {
				voF.ValidationCode = valrule.getCode();
			}
			voF.ReadOnlyLogic = pp.getReadOnlyLogic();
			voF.DisplayLogic= pp.getDisplayLogic();

			voF = GridFieldVO.createParameter(voF);

			GridField mField = new GridField (voF);

			vEditor = VEditorFactory.getEditor(mField, false);
			vEditor.addVetoableChangeListener(this);

			mField.addPropertyChangeListener(vEditor);
			Object defaultObject = mField.getDefault();
			mField.setValue (defaultObject, true);

			JPanel panel = new JPanel(new MigLayout("fill"));
			panel.add((Component) vEditor, "wrap");
			panel.add(bOK);
			add(panel);
			bOK.addActionListener(this);
		}
		return true;
	}

	@Override
	public void vetoableChange(PropertyChangeEvent arg0)
			throws PropertyVetoException {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bOK)
		{						
			props.put(X_AD_Scheduler_Para.COLUMNNAME_ParameterDefault, vEditor.getValue());
			props.put(X_AD_Scheduler_Para.COLUMNNAME_ParameterDisplay, vEditor.getDisplay());				
			this.setVisible(false);
		}
	}

	public HashMap getProperties() {
		return props;
	}		
}