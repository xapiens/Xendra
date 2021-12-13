package org.xendra.pos.wizard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumnModel;
import net.miginfocom.swing.MigLayout;
import org.columba.core.gui.base.SingleSideEtchedBorder;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.model.MColumn;
import org.compiere.model.MLookup;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_DocType;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.util.Env;
import org.xendra.controls.CompileLog;
import org.xendra.controls.MVELEditor;
import org.xendra.objectview.LookupEditor;
import org.xendra.objectview.LookupRenderer;

public class DocTypePrintFormatPanel extends JPanel implements VetoableChangeListener, ActionListener  {
	private JTable List;
	private JPanel canvas = new JPanel();
	private CompileLog compilelog; 
	private JSplitPane splitPane;
	private MVELEditor mveleditor = new MVELEditor();
	private MPrinterDocumentFormat pdf;
	public void set(ListModel pdtmodel,int C_POS_ID) {
		this.removeAll();
		this.setLayout(new MigLayout("fill"));
		List = new JTable(new FormatPrinterModel(pdtmodel, C_POS_ID));
		List.getSelectionModel().addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						int row = List.getSelectedRow();
						FormatPrinterModel xx = (FormatPrinterModel) List.getModel();
						DocTypePrintFormat qqq = xx.getDocTypePrintModel().get(row);
						// definir el folder MPrinterDocumentFormat antes de continuar 
						pdf = new Query(Env.getCtx(), MPrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
							.setParameters(qqq.getPOSPrinterDocumentFormat_ID()).first();						
						String xxqwwed = qqq.getSource();						
						mveleditor.setCode(xxqwwed);
						compilelog.clear();
					}
				});
		List.setEnabled(true);
		int AD_Column_ID = MColumn.getColumn_ID(X_C_Order.Table_Name, X_C_Order.COLUMNNAME_C_DocType_ID, null);
		MColumn col = MColumn.get(Env.getCtx(), AD_Column_ID);
		MLookup lookup = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editor = new LookupEditor(col.getName(),lookup);
		LookupRenderer render = new LookupRenderer(lookup);

		TableColumnModel tcm = List.getColumnModel();
		tcm.getColumn(FormatPrinterModel.NAME_COLUMN).setPreferredWidth(300);
		tcm.getColumn(FormatPrinterModel.NAME_COLUMN).setCellEditor(editor);
		tcm.getColumn(FormatPrinterModel.NAME_COLUMN).setCellRenderer(render);

		AD_Column_ID = MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_C_PrinterDocumentFormat_ID, null);
		col = MColumn.get(Env.getCtx(),  AD_Column_ID);
		MLookup lookuppf = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editorpf = new LookupEditor(col.getName(), lookuppf);
		LookupRenderer renderpf = new LookupRenderer(lookuppf);
		int WindowNo = Env.getWindowNo(this);

		tcm.getColumn(FormatPrinterModel.POSFORMAT).setPreferredWidth(300);
		tcm.getColumn(FormatPrinterModel.POSFORMAT).setCellEditor(editorpf);
		tcm.getColumn(FormatPrinterModel.POSFORMAT).setCellRenderer(renderpf);		
		Env.setContext(Env.getCtx(), String.format("%s|A_MACHINE_ID",WindowNo), Env.getMachine().getA_Machine_ID());
		
		AD_Column_ID = MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_AD_MessageFormat_ID, null);
		col = MColumn.get(Env.getCtx(), AD_Column_ID);
		MLookup lookupms = MLookupFactory.get(Env.getCtx(), 0, 0, col.getAD_Column_ID(), col.getAD_Reference_ID());
		LookupEditor editorms = new LookupEditor(col.getName(), lookupms);
		LookupRenderer renderms = new LookupRenderer(lookupms);
		
		tcm.getColumn(FormatPrinterModel.MESSAGEFORMAT).setPreferredWidth(300);
		tcm.getColumn(FormatPrinterModel.MESSAGEFORMAT).setCellEditor(editorms);
		tcm.getColumn(FormatPrinterModel.MESSAGEFORMAT).setCellRenderer(renderms);						
		
		AD_Column_ID = MColumn.getColumn_ID(X_C_DocType.Table_Name, X_C_DocType.COLUMNNAME_A_MachinePrinter_ID, null);
		col = MColumn.get(Env.getCtx(), AD_Column_ID);
		MLookup lookupps = MLookupFactory.get(Env.getCtx(), 0, -1, col.getAD_Column_ID(), col.getAD_Reference_ID());

		LookupEditor editorps = new LookupEditor(col.getName(), lookupps);
		LookupRenderer renderps = new LookupRenderer(lookupps);
		tcm.getColumn(FormatPrinterModel.POSPRINTER).setPreferredWidth(300);
		tcm.getColumn(FormatPrinterModel.POSPRINTER).setCellEditor(editorps);
		tcm.getColumn(FormatPrinterModel.POSPRINTER).setCellRenderer(renderps);
		JScrollPane scrollPane = new JScrollPane(List);
		scrollPane.getViewport().setBackground(Color.white);
		setcanvas();
		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(scrollPane);
		splitPane.setRightComponent(canvas);
		splitPane.setDividerLocation(100);
		add(splitPane);
	}

	protected void setcanvas() {
		canvas.setLayout(new BorderLayout());
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
			canvas.add(toppanel,BorderLayout.NORTH);
			//mveleditor = new MVELEditor();
			compilelog = new CompileLog();
			JSplitPane splitPane = new JSplitPane();
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setLeftComponent(mveleditor);
			splitPane.setRightComponent(compilelog);
			splitPane.setDividerLocation(100);
			canvas.add(splitPane, BorderLayout.CENTER);
			JPanel bottomPanel = new JPanel();
			bottomPanel.setBorder(new SingleSideEtchedBorder(SwingConstants.TOP));
			canvas.add(bottomPanel, BorderLayout.SOUTH);
			bottomPanel.setLayout(new BorderLayout(0, 0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<DocTypePrintFormat> getModel()
	{
		FormatPrinterModel t = (FormatPrinterModel) List.getModel();
		return t.getDocTypePrintModel();			
	}

	@Override
	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("compile")) {
			compilelog.compile(pdf, mveleditor.getCode());
		}
		else if (e.getActionCommand().equals("save")) {
			int row = List.getSelectedRow();
			FormatPrinterModel xx = (FormatPrinterModel) List.getModel();
			DocTypePrintFormat qqq = xx.getDocTypePrintModel().get(row);
			qqq.setSource(mveleditor.getCode());			
		}
	}
}
