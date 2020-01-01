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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.List;

import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import org.compiere.grid.ed.VLookup;
import org.compiere.model.Lookup;
import org.compiere.model.MColumn;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Table;
import org.compiere.util.Env;
import org.xendra.developer.ReferencetoAnnotation;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class TableDeveloperDialog extends JDialog implements ActionListener {
	private static File m_filename;
	private ButtonWithMnemonic okButton;
	private ButtonWithMnemonic cancelButton;
	private JButton btnGeneratePoModel;
	private JButton btnReference;
	private JPanel panel;
	private JLabel lblNewLabel;
	private VLookup VEntityType;
	private MTable table;
	private JTextPane processlog;
	private JScrollPane scrollPane;
	private String m_directory = "";

	private PrintStream old;
	private ByteArrayOutputStream baos;
	private JButton btnEncode;
	/**
	 * @wbp.parser.constructor
	 */
	public TableDeveloperDialog() {
		Components();
	}
	public TableDeveloperDialog(Integer AD_Table_ID) {
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
				ColumnSpec.decode("max(69dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(117dlu;default):grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(26dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(26dlu;default):grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(104dlu;default):grow"),}));

		JLabel lblTable = new JLabel("Generate PO Model");
		mainPanel.add(lblTable, "2, 2");

		panel = new JPanel();
		mainPanel.add(panel, "2, 4, 5, 1, fill, fill");

		lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);

		int AD_Column_ID = MColumn.getColumn_ID(X_AD_Table.Table_Name, X_AD_Table.COLUMNNAME_EntityType, null);
		MColumn column = MColumn.get(Env.getCtx(), AD_Column_ID);
		Lookup LEntityType = MLookupFactory.get (Env.getCtx(), 0, 0, AD_Column_ID, column.getAD_Reference_ID());
		VEntityType = new VLookup (X_AD_Table.COLUMNNAME_EntityType, true, false, true, LEntityType);
		VEntityType.setValue("D");
		panel.add(VEntityType);

		btnGeneratePoModel = new JButton("PO Model");
		btnGeneratePoModel.setActionCommand("GenModel");
		btnGeneratePoModel.addActionListener(this);

		mainPanel.add(btnGeneratePoModel, "2, 6");

		btnReference = new JButton("Reference");
		btnReference.setActionCommand("Reference"); 
		btnReference.addActionListener(this);
		mainPanel.add(btnReference, "4, 6");

		btnEncode = new JButton("Encode Data");
		btnEncode.addActionListener(this);
		btnEncode.setActionCommand("Encode");
		mainPanel.add(btnEncode, "6, 6");

		processlog = new JTextPane();		
		processlog.setEditable(false);

		scrollPane = new JScrollPane(processlog);
		mainPanel.add(scrollPane, "2, 10, 5, 1, fill, fill");


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
	}
	public TableDeveloperDialog(JFrame frame) {		
		super(frame, true);
		Components();
		pack();
		setLocationRelativeTo(null);
		setVisible(true);		
	}

	public void startcapture() {
		baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);
		old = System.out;
		System.setOut(ps);
	} 	

	public String stopcapture() {
		System.out.flush();
		System.setOut(old);
		return baos.toString();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();	
		if (command.equals("CANCEL")) { //$NON-NLS-1$			
			setVisible(false);
		} else if (command.equals("Reference")) {
			GenerateReferences(selectDirectory(this, m_directory));
		} else if (command.equals("GenModel")) {
			setGenerateModel(selectDirectory(this, m_directory));
		} else if (command.equals("Encode")) {
			setEncode(selectDirectory(this, m_directory));
		} else if (command.equals("OK")) { //$NON-NLS-1$
			setVisible(false);
		} 
	}
	private void GenerateReferences(File selectDirectory) {
		List<X_AD_Column> columns = new Query(Env.getCtx(), X_AD_Column.Table_Name, "AD_Table_ID = ?", null)
		.setParameters(table.getAD_Table_ID()).list();			
		for (X_AD_Column column:columns) {
			if (column.getAD_Reference_Value_ID() > 0) {
				String[] args = {selectDirectory.getAbsolutePath().concat("/"),
						String.valueOf(column.getAD_Reference_Value_ID())};
				startcapture();
				ReferencetoAnnotation.main(args);					
				processlog.setText(stopcapture());
			}
		}					
	}
	private void setGenerateModel(File selectDirectory) {
		//
		String[] args = {selectDirectory.getAbsolutePath().concat("/"), 
				"org.compiere.model.persistence", 
				String.format("'%s'", VEntityType.getValue()),
				String.format("'%s'",table.getTableName())};
		startcapture();
		org.xendra.developer.GenerateModelView.main(args);
		processlog.setText(stopcapture());
	}
	private void setEncode(File selectDirectory) {
		String[] args = {selectDirectory.getAbsolutePath().concat("/"),
				table.getTableName()};
		startcapture();
		org.xendra.developer.encode.main(args);		
		processlog.setText(stopcapture());
	}

	File selectDirectory(Component parent, String selectedFile) {
		File ret = null;
		JDirectoryChooser chooser;
		chooser = new JDirectoryChooser();
		if (selectedFile != null) {
			chooser.setSelectedFile(new File(selectedFile));
		}
		JTextArea accessory = new JTextArea("seleccione la carpeta donde desea generar el modelo");
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
		m_directory = selectedFile;
		return ret;
	}
}