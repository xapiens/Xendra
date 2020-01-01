package org.xendra.modeleditor.gui.propertysheet;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JPanel;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.compiere.grid.ed.VComboBox;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.model.persistence.X_AD_Val_Rule;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Msg;
import org.compiere.util.ValueNamePair;
import org.xendra.Constants;
import org.xendra.modeleditor.gui.sqleditor.SQLEditor;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class ValRuleDialog extends JDialog implements ActionListener {

	private static final String PICKVALRULE = "PVR";
	private static final String UPDATERULE = "UPR";
	private KeyNamePair valrule;
	private JTextField name;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private JCheckBox active;
	private SQLEditor code;
	private VComboBox type;
	private JButton btnUpdateValidationRule;

	public ValRuleDialog() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);		
		Components();
	}

	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);		
		mainPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("367px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(12dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("10px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		name = new JTextField();
		mainPanel.add(name, "3, 4, fill, default");
		name.setColumns(10);

		JButton button = new JButton("...");
		button.setActionCommand(PICKVALRULE);
		button.addActionListener(this);
		mainPanel.add(button, "5, 4");

		type = new VComboBox(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_EntityType);
		mainPanel.add(type, "3, 6, fill, default");


		code = new SQLEditor();
		JScrollPane scrollPane = new JScrollPane(code);
		mainPanel.add(scrollPane, "3, 8, fill, fill");
		scrollPane.setPreferredSize(new Dimension(200,100));

		active = new JCheckBox(Msg.translate(Env.getCtx(), Constants.COLUMNNAME_IsActive));
		mainPanel.add(active, "3, 10");

		btnUpdateValidationRule = new JButton("Update Validation Rule");
		btnUpdateValidationRule.setActionCommand(UPDATERULE);
		btnUpdateValidationRule.addActionListener(this);		
		mainPanel.add(btnUpdateValidationRule, "3, 12");

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBorder(new EmptyBorder(12, 12, 12, 12));		
		buttonPanel.setLayout(new GridLayout(1, 3, 6, 0));
		okButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "ok")); //$NON-NLS-1$ //$NON-NLS-2$
		okButton.setActionCommand("OK"); //$NON-NLS-1$
		okButton.addActionListener(this);		
		buttonPanel.add(okButton);
		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog", "global", "cancel")); //$NON-NLS-1$ //$NON-NLS-2$
		cancelButton.setActionCommand("CANCEL"); //$NON-NLS-1$
		cancelButton.addActionListener(this);		
		buttonPanel.add(cancelButton);

		getRootPane().registerKeyboardAction(this, "CANCEL", //$NON-NLS-1$
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);		
		//
		bottomPanel.add(buttonPanel, BorderLayout.EAST);

		if (valrule != null) {
			updateValRule();
		}
	}

	private void updateValRule() {
		X_AD_Val_Rule v = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "AD_Val_Rule_ID = ?", null)
		.setParameters(valrule.getKey()).first();
		name.setText(v.getName());		
		type.setValue(v.getEntityType());		
		active.setSelected(v.isActive());
		code.setCode(v.getCode());		
	}

	public ValRuleDialog(KeyNamePair valrule) {
		this.valrule = valrule;
		Components();
		pack();
		setLocationRelativeTo(null);					
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(PICKVALRULE)) {
			PickValRuleDialog dlg = new PickValRuleDialog(valrule);
			KeyNamePair newvalrule = dlg.getValRule();
			if (newvalrule != null && newvalrule != valrule) {
				KeyNamePair oldvalrule = valrule;
				valrule = newvalrule;				
				updateValRule();
			}			
		} else if (e.getActionCommand().equals(UPDATERULE)) {
			X_AD_Val_Rule v = new Query(Env.getCtx(), X_AD_Val_Rule.Table_Name, "AD_Val_Rule_ID = ?", null)
			.setParameters(valrule.getKey()).first();
			v.setName(name.getText());			
			ValueNamePair kp = (ValueNamePair) type.getSelectedItem();
			v.setEntityType(kp.getValue());
			v.setIsActive(active.isSelected());
			v.setCode(code.getCode());
			v.save();
		} else if (e.getActionCommand().equals("OK")) {			
			setVisible(false);
		} else if (e.getActionCommand().equals("CANCEL")) {
			valrule = null;
			setVisible(false);
		}
	}

	public KeyNamePair getValRule() {
		return valrule;
	}
}
