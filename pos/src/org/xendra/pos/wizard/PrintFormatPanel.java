package org.xendra.pos.wizard;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;

import net.miginfocom.swing.MigLayout;

import org.columba.core.gui.base.LabelWithMnemonic;
import org.columba.core.gui.base.WizardTextField;
import org.compiere.apps.ADialog;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MachinePrinter;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.util.Env;
import org.xendra.controls.CompileLog;
import org.xendra.controls.MVELEditor;
import org.xendra.pos.util.ResourceLoader;

public class PrintFormatPanel extends JPanel implements ActionListener {
	private MVELEditor mveleditor = new MVELEditor();
	private JComboBox cbPrintServer = new JComboBox();
	private CompileLog compilelog;
	private JSplitPane splitPane;
	private JPanel panel = new JPanel();
	private JPanel canvas = new JPanel();	
	private MPrinterDocumentFormat pdf;
	private JComboBox cbPrintDocumentFormat = new JComboBox();
	private X_C_PrinterFormat format;
	private Integer C_POS_ID = 0;
	private String formattype = "";
	public PrintFormatPanel() {

	}
	public void setC_POS_ID(int C_POS_ID) {
		this.C_POS_ID = C_POS_ID;
	}
	// MachineCreator.POSCreditFormat
	public void setFormatType(String formattype) {
		this.formattype = formattype;	
	}

	public void start() {		
		addFormat(ResourceLoader.getString("dialog","machinewizard","creditprintformat"));    		
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		//splitPane.setDividerLocation(150);
		splitPane.setLeftComponent(panel);
		this.setCanvas(panel.getPreferredSize().getWidth());		
		splitPane.setRightComponent(canvas);    		
		add(splitPane);    		
	}

	private void addFormat(String description ) {
		List<MachinePrinter> printers = Util.getPrinters();
		WizardTextField textfield = new WizardTextField();
		textfield.addLabel(new LabelWithMnemonic(description));
		X_A_MachinePrinter mp = null;
		String where = "AD_Table_ID = ? AND Record_ID = ? AND Value = ? ";
		format = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, where , null)
		.setParameters(X_C_POS.Table_ID, C_POS_ID, formattype).first();
		if (format != null) {
			mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
			.setParameters(format.getA_MachinePrinter_ID()).first();
			mveleditor.setCode(format.getSource());
		}
		List<MPrinterDocumentFormat> printdocformats = new Query(Env.getCtx(), MPrinterDocumentFormat.Table_Name, "IsActive = 'Y'", null)		
		.list();		
		for (MPrinterDocumentFormat printdocformat:printdocformats)
		{
			cbPrintDocumentFormat.addItem(printdocformat);
			if (format != null)
			{
				if (format.getC_PrinterDocumentFormat_ID() == printdocformat.getC_PrinterDocumentFormat_ID()) 
				{
					cbPrintDocumentFormat.setSelectedItem(printdocformat);
					pdf = printdocformat;
				}
			}			
		}
		if (pdf == null)
			cbPrintDocumentFormat.setSelectedItem(null);
		cbPrintDocumentFormat.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				pdf = (MPrinterDocumentFormat) cbPrintDocumentFormat.getSelectedItem();
				if (mveleditor.getCode().trim().length() > 0) {
					if (ADialog.ask(0, null, "Overwrite?")) {
						mveleditor.setCode(pdf.getSource());
					}
				} else {
					mveleditor.setCode(pdf.getSource());	
				}
			}
		});
		Method method = null;        
		try {
			method = cbPrintDocumentFormat.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {
		}			
		//data.registerDataLookup(formatname,new DefaultDataLookup(cbPrintDocumentFormat, method, null));                    
		textfield.addTextField(cbPrintDocumentFormat);
		panel.add(textfield,"push");
		//
		WizardTextField printertextfield = new WizardTextField();		
		Method printermethod = null;
		try {
			printermethod = cbPrintServer.getClass().getMethod("getSelectedItem", null);
		} catch (NoSuchMethodException nsme) {			
		}				
		cbPrintServer.addActionListener(this);
		//data.registerDataLookup(String.format("%s_Printer",formatname),new DefaultDataLookup(cbPrintServer, method, null));
		for (MachinePrinter printer:printers)
		{
			cbPrintServer.addItem(printer);
			if (mp != null) {
				if (printer.getA_MachinePrinter_ID() == mp.getA_MachinePrinter_ID()) {
					cbPrintServer.setSelectedItem(printer);
				}
			}			
		}    				
		printertextfield.addTextField(cbPrintServer);					
		panel.add(printertextfield,"wrap");		    			
	}

	public void setCanvas(double width) {		
		// canvas
		//canvas.setLayout(new BorderLayout());
		canvas.setLayout(new MigLayout("fill"));
		JToolBar toolBar = new JToolBar();
		JPanel toppanel = new JPanel();
		toppanel.add(toolBar);
		try {
			JButton btnSave = new JButton("save");
			btnSave.setActionCommand("save");
			btnSave.addActionListener(this);
			ImageIcon save = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pos", "save.png"))));
			btnSave.setIcon(save);
			JButton btnCompile = new JButton("compile");
			btnCompile.setActionCommand("compile");
			btnCompile.addActionListener(this);					
			ImageIcon compile = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pos", "system-run.png"))));
			btnCompile.setIcon(compile);
			toolBar.add(btnSave);
			toolBar.add(btnCompile);
			toppanel.add(toolBar);
			canvas.add(toppanel,"wrap");
			compilelog = new CompileLog();
			JSplitPane splitPane = new JSplitPane();
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			mveleditor.setPreferredSize(new Dimension((int) width,200));
			JScrollPane scrollPane = new JScrollPane(mveleditor);			
			splitPane.setLeftComponent(scrollPane);
			splitPane.setRightComponent(compilelog);
			canvas.add(splitPane,"pushx");
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("compile")) {
			compilelog.compile(pdf, mveleditor.getCode());
		}
		else if (e.getActionCommand().equals("save")) {
			if (format != null) {
				format.setSource(mveleditor.getCode());
				format.save();
			}
		}		
	}
	public MPrinterDocumentFormat getFormat() {
		return pdf;
	}
	public MachinePrinter getPrinter() {
		MachinePrinter mp = (MachinePrinter) cbPrintServer.getSelectedItem();
		return mp;
	}
}
