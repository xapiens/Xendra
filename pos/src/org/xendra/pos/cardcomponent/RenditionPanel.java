package org.xendra.pos.cardcomponent;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import org.compiere.apps.ADialog;
import org.compiere.apps.AppsAction;
import org.compiere.grid.ed.VDate;
import org.compiere.grid.ed.VNumber;
import org.compiere.minigrid.MiniTable;
import org.compiere.model.MCash;
import org.compiere.model.MCashBook;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.swing.CButton;
import org.compiere.swing.CPanel;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.mvel2.MVEL;
import org.mvel2.compiler.ExecutableStatement;
import org.xendra.pos.PosPanel;
import org.xendra.pos.cash.CashCount;
import org.xendra.pos.cash.CashCountItem;
import org.xendra.pos.reports.CreditCardList;
import org.xendra.pos.reports.PrintLineCanceledList;
import org.xendra.pos.wizard.MachineCreator;
import org.xendra.printdocument.DataSource;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintWorker;

public class RenditionPanel extends CardComponentPanel implements ActionListener, TableModelListener, VetoableChangeListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 230690042456588548L;
	private static final String A_EXIT = "Cancelar";
	private AppsAction aExit;
	private CButton    bExit;	
	private VDate  searchcashdate = new VDate();
	private MiniTable  gridClosedCash = new MiniTable();
	private VNumber inputBeginningBalance = new VNumber();

	private CashCount m_cashcount;
	private PosPanel pospanel;		

	private int m_WindowNo = 0;

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm aa");
	private String CASHCALC = "CashCalc";
	private String CASHOPEN = "CashOpen";
	private String PRINT = "Print";
	private String PRINTCARD = "Card";
	private String VOIDED = "Voided";

	public RenditionPanel(PosPanel pp)
	{
		pospanel = pp;		
		//m_cashcount = new CashCount(getPOSPanel().getConfig().getC_CashBook_ID());
		m_cashcount = new CashCount();
		searchcashdate.setValue(new Timestamp(System.currentTimeMillis()));
		searchcashdate.addVetoableChangeListener(this);		
		inputBeginningBalance.setValue(BigDecimal.ZERO);
		// inicializar la ventana de cierre de caja
		setmtClosedCash(true);
		m_cashcount.initialize(gridClosedCash);
		JScrollPane scrollclosedCash = new JScrollPane();
		scrollclosedCash.getViewport().add(gridClosedCash);
		CPanel panel = new CPanel(new MigLayout());
		String title = String.format("Cierre %s al", pp.getConfig().getName().trim());
		panel.add(new JLabel(title,JLabel.RIGHT));
		panel.add(searchcashdate,"wrap");
		panel.add(new JLabel("Monto de inicio ",JLabel.RIGHT));
		panel.add(inputBeginningBalance,"wrap");
		panel.add(getButton(CASHCALC, 	Msg.translate(Env.getCtx(), "CashCalc"), Env.getImageIcon2("Process16")));
		panel.add(getButton(CASHOPEN, 	Msg.translate(Env.getCtx(),"Cash Open"), Env.getImageIcon2("Cash16")));
		panel.add(getButton(PRINT, 		Msg.translate(Env.getCtx(), "Print"), Env.getImageIcon2("Print16")), "wrap");
		panel.add(getButton(PRINTCARD, 		Msg.translate(Env.getCtx(), "Card"), Env.getImageIcon2("Credit16")));
		panel.add(getButton(VOIDED, 	Msg.translate(Env.getCtx(), "Voided"), Env.getImageIcon2("Online16")));

		StringBuffer sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();
		panel.add(bExit, "wrap");
		//panel.add(scrollclosedCash, "span");
		panel.add(gridClosedCash, "span");
		add(panel);
	}

	private Component getButton(String command, String text, ImageIcon img) {
		CButton button = new CButton();
		button.setIcon(img);
		button.setText(text);		
		button.setVerticalTextPosition(AbstractButton.BOTTOM);
		button.setHorizontalTextPosition(AbstractButton.CENTER);
		button.setActionCommand(command);
		button.addActionListener(this);
		return button;
	}

	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();
		try {
			if (e.getActionCommand().equals(CASHCALC))
			{			
				getPOSPanel().getFrame().setBusy(true);
				org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
				{
					public Object construct()
					{					
						cmd_process();
						return Boolean.TRUE;
					}

					private void cmd_process() {						
						m_cashcount.calculate(getPOSPanel().getConfig().getC_POS_ID(), 
								(Timestamp) searchcashdate.getValue() , 
								getPOSPanel().getConfig().getC_CashBook_ID(),
								getPOSPanel().getWorkShift().getKey());
						m_cashcount.refresh(gridClosedCash);						
						getPOSPanel().getFrame().setBusy(false);
					}
				};
				worker.start();			
			}
			if (e.getActionCommand().equals(CASHOPEN))
			{
				getPOSPanel().getFrame().setBusy(true);
				org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
				{
					public Object construct()
					{					
						cmd_process();
						return Boolean.TRUE;
					}

					private void cmd_process() {
						BigDecimal BeginningBalance = (BigDecimal) inputBeginningBalance.getValue();
						Integer C_CashBook_ID = getPOSPanel().getConfig().getC_CashBook_ID();
						MCashBook cb = new MCashBook(Env.getCtx(), C_CashBook_ID, null);		
						MCash cash = MCash.get(Env.getCtx(), cb
								.getC_CashBook_ID(), (Timestamp) searchcashdate.getValue(), null);
						if (cash.getBeginningBalance().compareTo(Env.ZERO) == 0)
						{
							cash.setBeginningBalance(BeginningBalance);
							cash.save();
						}												
						getPOSPanel().getFrame().setBusy(false);
					}
				};
				worker.start();			

			}
			if (e.getActionCommand().equals(PRINT))
			{		
				String error = "";
				X_C_PrinterFormat pf = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
				.setParameters(X_C_POS.Table_ID, pospanel.getConfig().getC_POS_ID(), MachineCreator.CashCount).first();
				if (pf.getC_PrinterDocumentFormat_ID() > 0) {
					DataSource.clear("Rendition");
					DataSource.set("Created", Env.getContextAsDate(Env.getCtx(), "#Date"));
					DataSource.set("TotalCountSystem",m_cashcount.getTotalComputer());
					DataSource.set("TotalCountHuman", m_cashcount.getTotalHuman());
					DataSource.set("TotalCountDiff", m_cashcount.getTotalDiff());
					DataSource.set("CashDate", (Timestamp)searchcashdate.getValue());
					DataSource.set("MachineSerial", pospanel.getConfig().getMachineSerial());
					List<CashCountItem> items = m_cashcount.getLines();
					for (CashCountItem item:items) {
						DataSource.setLine("Name", item.getDescription());
						DataSource.setLine("CountSystem", item.getAmountInSystem());
						DataSource.setLine("CountDiff", item.getDiff());						
					}
					//
					X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), pf.getA_MachinePrinter_ID(), null);
					X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
					PrintWorker pworker = new PrintWorker(machine);
					MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pf.getC_PrinterDocumentFormat_ID(), null);
					PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
					pd.setSource(pf.getSource());
					pd.setData(DataSource.getInstance());
					Map context = new HashMap();
					context.put("pd", pd);
					context.put("source", DataSource.getInstance());			
					ExecutableStatement stmt = (ExecutableStatement) MVEL.compileExpression(pd.getSource());
					MVEL.executeExpression(stmt, context);
					pd.setSource("");
					error = pworker.setPrintDocument(pd);						
					if (error.length() > 0) {
						//throw new Exception(error);
					}
					pworker.setQueueName(mp.getQueueName());
					error = pworker.Print(PrintWorker.ReceiveJob);
					if (error.length() > 0)
						ADialog.error(m_WindowNo,null,error);																		
				}				
				//BalanceCash cc = new BalanceCash(pf);
				//cc.setTotalComputer(m_cashcount.getTotalComputer().setScale(2, BigDecimal.ROUND_HALF_UP));
				//cc.setTotalHuman(m_cashcount.getTotalHuman().setScale(2, BigDecimal.ROUND_HALF_UP));
				//cc.setTotalDiff(m_cashcount.getTotalDiff().setScale(2, BigDecimal.ROUND_HALF_UP));
				//String created = formatter.format(new Timestamp(System.currentTimeMillis()));
				//String cashDate = formatter.format(searchcashdate.getValue());
				//cc.setCreated(created);
				//cc.setCashDate(cashDate);
				//cc.setMachineSerial(pospanel.getConfig().getMachineSerial());
				//cc.setLines(m_cashcount.getLines());
				//error = cc.print();
				//if (error.length() > 0)
				//	ADialog.error(m_WindowNo,null,error);																		
			}
			if (e.getActionCommand().equals(PRINTCARD))
			{				
				getPOSPanel().getFrame().setBusy(true);
				org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
				{
					public Object construct()
					{					
						cmd_process();
						return Boolean.TRUE;
					}

					private void cmd_process() {
						X_C_PrinterFormat pf = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
						.setParameters(X_C_POS.Table_ID, pospanel.getConfig().getC_POS_ID(), MachineCreator.CreditCardList).first();
						if (pf != null && pf.getC_PrinterDocumentFormat_ID() > 0) {
							CreditCardList pcl = new CreditCardList(getPOSPanel(), (Timestamp) searchcashdate.getValue());
							String error = pcl.print();
							getPOSPanel().getFrame().setBusy(false);
							if (error.length() > 0)
								ADialog.error(m_WindowNo,null,error);	
						}
					}
				};
				worker.start();							
			}
			if (e.getActionCommand().equals(VOIDED))
			{
				getPOSPanel().getFrame().setBusy(true);
				org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
				{
					public Object construct()
					{					
						cmd_process();
						return Boolean.TRUE;
					}

					private void cmd_process() {
						X_C_PrinterFormat format = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
						.setParameters(X_C_POS.Table_ID,getPOSPanel().getConfig().getC_POS_ID(), MachineCreator.VoidCanceledList).first();								

						MPrinterDocumentFormat pf = new Query(Env.getCtx(), MPrinterDocumentFormat.Table_Name, "C_PrinterDocumentFormat_ID = ?", null)
						.setParameters(format.getC_PrinterDocumentFormat_ID()).first();

						String error = "";
						if (pf != null)
						{
							PrintLineCanceledList plcl = new PrintLineCanceledList(getPOSPanel(), (Timestamp) searchcashdate.getValue());
							error = plcl.print(format);						
						}
						else
						{
							error = "Format not found";
						}
						getPOSPanel().getFrame().setBusy(false);
						if (error.length() > 0)
							ADialog.error(m_WindowNo,null,error);									
					}
				};
				worker.start();							
			}
			if (c == bExit)
			{
				hideform();			
			}
		}
		catch (Exception ex)
		{			
			ADialog.error(m_WindowNo, this,ex.getMessage());
		}
	}

	public void hideform()
	{
		this.getPOSPanel().enableEnvironment();
		setVisible(false);		
	}	//	dispose	

	private void setmtClosedCash(boolean initialize) {

		if (initialize)
		{
			gridClosedCash.addColumn(Msg.translate(Env.getCtx(), "Documento"));
			gridClosedCash.addColumn(Msg.translate(Env.getCtx(), "Amount"));
			gridClosedCash.addColumn(Msg.translate(Env.getCtx(), "Amount"));
			gridClosedCash.addColumn(Msg.translate(Env.getCtx(), "Diff"));
			DefaultTableModel model =  (DefaultTableModel)gridClosedCash.getModel();
			model.addTableModelListener(this);
			gridClosedCash.setModel(model);
			//			
			//			//
			int i = 0;
			gridClosedCash.setColumnClass(i++, String.class, true);           //  0-Document Type
			gridClosedCash.setColumnClass(i++, BigDecimal.class, false);       // 1-Amount
			gridClosedCash.setColumnClass(i++, BigDecimal.class, true);       //  2-Amount System
			gridClosedCash.setColumnClass(i++, BigDecimal.class, true);       //  3-Diff
			gridClosedCash.autoSize();
		}		

	}

	public void tableChanged(TableModelEvent e) {
		int row = e.getFirstRow();
		int col = e.getColumn();		
		if (e.getSource().equals(gridClosedCash.getModel()))
		{
		}
	}

	public PosPanel getPOSPanel()
	{
		return pospanel;
	}

	@Override
	public void vetoableChange(PropertyChangeEvent evt)
			throws PropertyVetoException {
		if (evt.getSource().equals(searchcashdate)) {
			m_cashcount.initialize(gridClosedCash);
		}		
	}
}
