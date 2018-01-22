package org.xendra.newclient.wizard;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.javaprog.ui.wizard.AbstractStep;
import net.miginfocom.swing.MigLayout;

import org.columba.core.base.SwingWorker;
import org.compiere.apps.ADialog;
import org.compiere.apps.ConfirmPanel;
import org.compiere.impexp.Field;
import org.compiere.impexp.ImpFormat;
import org.compiere.impexp.ImpFormatRow;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_ImpFormat;
import org.compiere.swing.CButton;
import org.compiere.swing.CComboBox;
import org.compiere.swing.CPanel;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.Msg;
import org.xendra.newclient.wizard.NewDatabase.Task;

public class FileImportPanel extends JPanel implements ActionListener {	
	private static final String s_none = "----";	//	no format indicator
	private JButton bFile = new JButton();
	private JLabel[] m_labels;
	private ImpFormat m_format;
	private File m_file;
	private int	m_record = -1;
	private JTextField[] m_fields;
	private JLabel record = new JLabel();
	private CComboBox fCharset;
	private JComboBox pickFormat = new JComboBox();
	private ArrayList<String>	m_data = new ArrayList<String>();
	private JTextArea rawData = new JTextArea();
	private JScrollPane rawDataPane = new JScrollPane();
	private CButton bOk = ConfirmPanel.createOKButton(Msg.getMsg(Env.getCtx(), "Ok"));
	private JLabel info = new JLabel();
	private CPanel previewPanel = new CPanel();
	private JScrollPane previewPane = new JScrollPane();
	private JLabel labelFormat = new JLabel();
	private JButton bPrevious = new JButton();
	private JButton bNext = new JButton();
	private boolean m_next = false;	
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

	public FileImportPanel(String Identifier) {				
		bFile.setText(Msg.getMsg(Env.getCtx(), "FileImportFile"));
		bFile.setToolTipText(Msg.getMsg(Env.getCtx(), "FileImportFileInfo"));
		bFile.addActionListener(this);
		//
		//pickFormat.addItem(s_none);
		List<X_AD_ImpFormat> impformats = new Query(Env.getCtx(), X_AD_ImpFormat.Table_Name, "", null).list();
		for (X_AD_ImpFormat impformat:impformats) {
			pickFormat.addItem(impformat);
		}
		pickFormat.setSelectedIndex(0);
		pickFormat.addActionListener(this);		
		//JComponent component = new JPanel(new MigLayout());
		fCharset = new CComboBox(Ini.getAvailableCharsets());
		fCharset.setSelectedItem(Ini.getCharset());
		fCharset.addActionListener(this);
		//
		labelFormat.setText(Msg.translate(Env.getCtx(), "AD_ImpFormat_ID"));
		//
		bNext.setToolTipText(Msg.getMsg(Env.getCtx(), "Next"));
		bNext.setMargin(new Insets(2, 2, 2, 2));
		bNext.setText(">");
		bNext.addActionListener(this);		
		//
		bPrevious.setToolTipText(Msg.getMsg(Env.getCtx(), "Previous"));
		bPrevious.setMargin(new Insets(2, 2, 2, 2));
		bPrevious.setText("<");
		bPrevious.addActionListener(this);		
		//
		rawData.setFont(new java.awt.Font("Monospaced", 0, 10));
		rawData.setColumns(80);
		rawData.setRows(5);
		rawDataPane.setViewportView(rawData);
		previewPane.setViewportView(previewPanel);
		previewPane.setPreferredSize(new Dimension(700,80));
		bOk.addActionListener(this);
		//
		setLayout(new MigLayout());
		add(bFile, "wrap");
		add(fCharset,"wrap");
		add(info);
		add(labelFormat);
		add(pickFormat);
		add(bPrevious);
		add(record);		
		add(bNext, "wrap");
		add(rawDataPane, "spanx 6,grow,wrap");
		add(previewPane,"spanx 6,grow,wrap");
		add(bOk);
		if (Identifier != null) {
			setFormat(Identifier);	
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if (e.getSource() == bFile)
		{
			cmd_loadFile();
			invalidate();
		}		
		else if (e.getSource().equals(fCharset)) {
			int record = m_record;
			cmd_reloadFile();
			m_record = record - 1;
			cmd_applyFormat(true);			
		}
		else if (e.getSource() == pickFormat)
		{
			cmd_loadFormat();
			invalidate();
			//m_frame.pack();
		}		
		else if (e.getSource() == bNext)
			cmd_applyFormat(true);
		else if (e.getSource() == bPrevious)
			cmd_applyFormat(false);
		else if (e.getSource() == bOk) { 
			Task tsk = new Task(null);
			tsk.start();
		}		
	}
	private void cmd_loadFile() {
		String directory = org.compiere.Xendra.getXendraHome() 
				+ File.separator + "data" 
				+ File.separator + "import";
		JFileChooser chooser = new JFileChooser(directory);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setMultiSelectionEnabled(false);
		chooser.setDialogTitle(Msg.getMsg(Env.getCtx(), "FileImportFileInfo"));
		if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION)
			return;
		m_file = chooser.getSelectedFile();
		bFile.setText(m_file.getName());
		cmd_reloadFile();
	}

	private void cmd_reloadFile()
	{
		if (m_file == null)
			return;

		m_data.clear();
		rawData.setText("");
		try
		{
			//  see NaturalAccountMap
			Charset charset = (Charset)fCharset.getSelectedItem(); 
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(m_file), charset), 10240);
			//	not safe see p108 Network pgm
			String s = null;
			while ((s = in.readLine()) != null)
			{
				m_data.add(s);
				if (m_data.size() < 100)
				{
					rawData.append(s);
					rawData.append("\n");
				}
			}
			in.close();
			rawData.setCaretPosition(0);
		}
		catch (Exception e)
		{
			e.printStackTrace();			
		}
		int index = 1;	//	second line as first may be heading
		if (m_data.size() == 1)
			index = 0;
		int length = 0;
		if (m_data.size() > 0)
			length = m_data.get(index).toString().length();
		info.setText(Msg.getMsg(Env.getCtx(), "Records") + "=" + m_data.size()
				+ ", " + Msg.getMsg(Env.getCtx(), "Length") + "=" + length + "   ");
	}	//	cmd_loadFile

	private void cmd_applyFormat(boolean next) {
		if (m_format == null)
			return;

		//	set position
		if (next)
			m_record++;
		else
			m_record--;
		if (m_record < 0)
			m_record = 0;
		else if (m_record >= m_data.size())
			m_record = m_data.size() - 1;
		record.setText(" " + String.valueOf(m_record+1) + " ");
		//	Line Info
		//String[] lInfo = m_format.parseLine(m_data.get(m_record).toString(), false, true, false);	//	no label, trace, no ignore
		Field[] lInfo = m_format.parseLine(m_data.get(m_record).toString(), false, true, false);	//	no label, trace, no ignore
		int size = m_format.getRowCount();
		if (lInfo.length != size)
			for (int i = 0; i < size; i++)
			{
				m_fields[i].setText(lInfo[i].getName());
				m_fields[i].setCaretPosition(0);
			}		
	}

	private void setFormat(String identifier) {
		for (int i=0; i < pickFormat.getModel().getSize(); i++) {
			//String formatname = (String) pickFormat.getModel().getElementAt(i);
			X_AD_ImpFormat format = (X_AD_ImpFormat) pickFormat.getModel().getElementAt(i);
			if (format.getIdentifier().equals(identifier)) {
				//if (formatname.equals(format)) {
				pickFormat.setSelectedIndex(i);
				pickFormat.setEnabled(false);
				cmd_loadFormat();
				break;
			}
		}

	}
	/**
	 *	Load Format
	 */
	private void cmd_loadFormat()
	{
		//	clear panel
		previewPanel.removeAll();
		X_AD_ImpFormat format = (X_AD_ImpFormat) pickFormat.getSelectedItem();
		String formatName = format.getName();
		m_format = ImpFormat.load (format);
		if (m_format == null)
		{
			ADialog.error(0, this, "FileImportNoFormat", formatName);
			return;
		}

		//	pointers
		int size = m_format.getRowCount();
		m_labels = new JLabel[size];
		m_fields = new JTextField[size];
		for (int i = 0; i < size; i++)
		{
			ImpFormatRow row = m_format.getRow(i);
			m_labels[i] = new JLabel (row.getColumnName());
			previewPanel.add(m_labels[i], new GridBagConstraints(i, 0, 1, 1, 1.0, 1.0,
					GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(2, 2, 2, 2), 0, 0));
			//
			int length = row.getEndNo() - row.getStartNo();
			if (length <= 5)
				length = 5;
			else if (length > 20)
				length = 20;
			m_fields[i] = new JTextField (length);
			previewPanel.add(m_fields[i], new GridBagConstraints(i, 1, 1, 1, 1.0, 1.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		}
		m_record = -1;
		record.setText("-");
		previewPanel.invalidate();
		previewPanel.repaint();
	}	//	cmd_format

	public String getText() {		
		String file = "";
		if (m_file.exists())
			file = m_file.getAbsolutePath();		
		return file;
	}

	class Task extends SwingWorker {
		File m_file;
		int imported = 0;

		public Task(File file) {
			m_file = file;
		}

		public Object construct() {
			if (m_format == null)
			{
				ADialog.error(0, null, "FileImportNoFormat");
				return null;
			}

			//	For all rows - update/insert DB table
			int row = 0;			
			for (row = 0; row < m_data.size(); row++)
				if (m_format.updateDB(Env.getCtx(), m_data.get(row).toString(), null))
					imported++;
			//
			ADialog.info(0, null, "FileImportR/I", row + " / " + imported + "#");
			return null;
		}

		@Override
		public void finished() {
			if (imported > 0) {				
				m_next = true;
				changeSupport.firePropertyChange("sucessfully", false, true);
			}
		}
	}	
	public void addPropertyChangeListener(PropertyChangeListener l) {
		changeSupport.addPropertyChangeListener(l);
	}
}