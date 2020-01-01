package org.xendra.modeleditor.gui.propertysheet;

import javax.swing.JDialog;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.l2fprod.common.swing.JDirectoryChooser;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import org.columba.core.gui.base.ButtonWithMnemonic;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.GlobalResourceLoader;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MTable;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;

public class ColumnDeveloperDialog extends JDialog implements ActionListener {
	private static File m_filename;
	private JTextField textField;
	private JTextField textdirectory;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private JButton  button;
	private JButton btnGeneratePoModel;
	private JPanel panel;
	private JLabel lblNewLabel;
	private VLookup VEntityType;
	private MTable table;
	/**
	 * @wbp.parser.constructor
	 */
	public ColumnDeveloperDialog() {
		Components();
	}
	public ColumnDeveloperDialog(Integer AD_Table_ID) {
		table = MTable.get(Env.getCtx(), AD_Table_ID);
		Components();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);				
	}
	private void Components() {
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(144dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(26dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(17dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblGeneratePoModel = new JLabel("Generate PO Model");
		mainPanel.add(lblGeneratePoModel, "2, 2");
		
		panel = new JPanel();
		mainPanel.add(panel, "2, 6, 5, 1, fill, fill");
		
		lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		int AD_Column_ID = MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_EntityType, null);
		MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
		Lookup LEntityType = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, column.getAD_Reference_ID());
		VEntityType = new VLookup (X_AD_Table.COLUMNNAME_EntityType, true, false, true, LEntityType);
		VEntityType.setValue("D");
		panel.add(VEntityType);
		
		textdirectory = new JTextField();
		textdirectory.setEditable(false);
		mainPanel.add(textdirectory, "2, 8, fill, default");
		textdirectory.setColumns(10);
		
		button = new JButton("..."); //$NON-NLS-1$ //$NON-NLS-2$
		button.setActionCommand("PickDirectory");
		button.addActionListener(this);
		 
		mainPanel.add(button, "4, 8");
		
		btnGeneratePoModel = new JButton("PO Model");
		btnGeneratePoModel.setActionCommand("GenModel");
		btnGeneratePoModel.setEnabled(false);
		btnGeneratePoModel.addActionListener(this);
		
		mainPanel.add(btnGeneratePoModel, "6, 8");
		
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
		cancelButton = new ButtonWithMnemonic(GlobalResourceLoader.getString("org.columba.core.i18n.dialog","global", "cancel")); //$NON-NLS-1$ //$NON-NLS-2$
		cancelButton.setActionCommand("CANCEL"); //$NON-NLS-1$
		cancelButton.addActionListener(this);		
		buttonPanel.add(cancelButton);
		
		getRootPane().registerKeyboardAction(this, "CANCEL", //$NON-NLS-1$
				KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
				JComponent.WHEN_IN_FOCUSED_WINDOW);		
		//
		bottomPanel.add(buttonPanel, BorderLayout.EAST);		
	}
	public ColumnDeveloperDialog(JFrame frame) {		
		super(frame, true);
		Components();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if (command.equals("PickDirectory")) {
			setfilename(selectDirectory(this, textdirectory.getText()));
		} else if (command.equals("CANCEL")) { //$NON-NLS-1$			
			setVisible(false);
		} else if (command.equals("GenModel")) {		
			String[] args = {getfilename().getAbsolutePath().concat("/"), 
							"org.compiere.model.persistence", 
							String.format("'%s'", VEntityType.getValue()),
							String.format("'%s'",table.getTableName())};
			org.xendra.developer.GenerateModelView.main(args);
		} else if (command.equals("OK")) { //$NON-NLS-1$
			setVisible(false);
		} 
	}
	
	static File selectDirectory(Component parent, String selectedFile) {
		File ret = null;
		JDirectoryChooser chooser;

		chooser = new JDirectoryChooser();
		if (selectedFile != null) {
			chooser.setSelectedFile(new File(selectedFile));
		}

		JTextArea accessory = new JTextArea("seleccione el folder donde desea generar el modelo");
		accessory.setLineWrap(true);
		accessory.setWrapStyleWord(true);
		accessory.setEditable(false);
		accessory.setOpaque(false);
		accessory.setFont(UIManager.getFont("Tree.font"));
		chooser.setAccessory(accessory);
		int choice = chooser.showOpenDialog(parent);
		if (choice == JDirectoryChooser.APPROVE_OPTION) {
			File[] selectedFiles = chooser.getSelectedFiles();
			for (int i = 0, c = selectedFiles.length; i < c; i++) {				
				ret = selectedFiles[i];
			}
		} 
		return ret;
	}
	private File getfilename() {
		return m_filename;
	}
	private void setfilename(File file) {
		m_filename = file;	
		if (m_filename != null) {
			textdirectory.setText(m_filename.getAbsolutePath());
			btnGeneratePoModel.setEnabled(true);			
		} else {
			textdirectory.setText("");
			btnGeneratePoModel.setEnabled(false);
		}
	}
}