/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2007 Dravio SAC. All Rights Reserved.                		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.xendra.pos.cardcomponent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

import org.compiere.apps.*;
import org.compiere.grid.ed.VLookup;
import org.compiere.grid.ed.VNumber;
import org.compiere.model.Lookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MCash;
import org.compiere.model.MCashBook;
import org.compiere.model.MCashLine;
import org.compiere.model.MClient;
import org.compiere.model.MClientInfo;
import org.compiere.model.MInvoice;
import org.compiere.model.MLookupFactory;
import org.compiere.model.MOrder;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.MUser;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_BPartner;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.model.reference.REF_C_CashTrxType;
import org.compiere.swing.*;
import org.compiere.util.*;
import org.mvel2.MVEL;
import org.mvel2.compiler.ExecutableStatement;

import org.xendra.pos.PosPanel;
import org.xendra.pos.wizard.MachineCreator;
import org.xendra.printdocument.DataSource;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintWorker;

public final class CollectionPanel extends CardComponentPanel implements VetoableChangeListener, ActionListener 
{	
	private static CLogger log = CLogger.getCLogger(CollectionPanel.class);

	private static final String A_EXIT = "Cancelar";
	private int m_WindowNo = 0;
	
	private AppsAction aFinish, aExit;
	private CButton bFinish, bExit;	
	private static final String A_FINISH = "Finish";
	private CPanel couponPanel = new CPanel();
	private CPanel customizePane = new CPanel(new GridBagLayout());
	private CPanel mainPanel = new CPanel();
	private VLookup pickPartner;
	private PosPanel pospanel;
	private VLookup pickBPartnerLocation;
		
	private JLabel  PayAmountLabel = new JLabel("Pago");
	private VNumber fAmtFrom = new VNumber("AmtFrom", false, false, true, DisplayType.Amount, Msg.translate(Env.getCtx(), "AmtFrom"));
	private JLabel lDeuda = new JLabel("0.00");
	private JLabel lSaldo = new JLabel("0.00");
	private boolean m_showdialoginfo = false;

	private BigDecimal m_debt = Env.ZERO;

	private BigDecimal m_balance = Env.ZERO;

	private BigDecimal m_Pay = Env.ZERO;
	
	private BigDecimal m_PayAvailable = Env.ZERO;

	private AGlassPane  m_glassPane = new AGlassPane();

	private String m_error = "";
	
	public CollectionPanel (PosPanel pos)
	{
		pospanel = pos;
		try
		{
	        java.util.Set<KeyStroke> forwardTab = new java.util.HashSet<KeyStroke>();
	        forwardTab.add(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
	        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardTab);
			jbInit();
		}
		catch(Exception e)
		{
			log.log(Level.SEVERE, "Find", e);
		}
	}

	private void jbInit() {		
		pickPartner = VLookup.createBPartner(m_WindowNo);
		pickPartner.setMandatory(true);
		pickPartner.addVetoableChangeListener(this);
		
		int AD_Column_ID = Util.getColumnID(MOrder.Table_ID, "C_BPartner_Location_ID");
		Lookup lookup = MLookupFactory.get (Env.getCtx(), m_WindowNo, 0, AD_Column_ID, DisplayType.TableDir);
		pickBPartnerLocation = new VLookup ("C_BPartner_Location_ID", true, false, true, lookup);
		pickBPartnerLocation.addVetoableChangeListener(this);
		
		fAmtFrom.addActionListener(this);
		
		StringBuffer sb = new StringBuffer();
		sb.append(Msg.translate(Env.getCtx(), "Finish"));
		sb.append(" [F10]");
		aFinish = new AppsAction (A_FINISH, KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0) , sb.toString());
		aFinish.setDelegate(this);
		bFinish = (CButton) aFinish.getButton();
		bFinish.setEnabled(false);
				
		sb = new StringBuffer(Msg.translate(Env.getCtx(), "Cancel"));
		sb.append(" [ESC]");		
		aExit = new AppsAction (A_EXIT, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), sb.toString());
		aExit.setDelegate(this);		
		bExit = (CButton) aExit.getButton();
		
		couponPanel.setLayout(new BorderLayout());
		
		CPanel PayPanel = new CPanel();
		PayPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Socio de Negocio")));		
		PayPanel.setLayout(new MigLayout());
		PayPanel.add(pickPartner,          "wrap");
		PayPanel.add(pickBPartnerLocation);

		customizePane.add(PayPanel,   new GridBagConstraints(0, 1, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));		
				
		CPanel conPanel = new CPanel();
		conPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Venta")));
		conPanel.setLayout(new MigLayout());		
		conPanel.add(new JLabel("Deuda:"),  		 "wrap");
		conPanel.add(lDeuda,         				 "wrap");
		conPanel.add(PayAmountLabel, 		 		 "wrap");
		conPanel.add(fAmtFrom,      		 		 "wrap");
		conPanel.add(new JLabel("Nuevo Saldo:"),   	 "wrap");
		conPanel.add(lSaldo);		
	
		customizePane.add(conPanel, new GridBagConstraints(0, 2, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));
		
		CPanel optionsPanel = new CPanel();
		optionsPanel.setBorder(BorderFactory.createTitledBorder(Msg.getMsg(Env.getCtx(), "Acciones")));
		optionsPanel.setLayout(new MigLayout());
		optionsPanel.add(bFinish);
		optionsPanel.add(bExit);		
		customizePane.add(optionsPanel, new GridBagConstraints(0, 3, 1, 1, 1.0, 0.0	,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 0, 2, 0), 0, 0));
		mainPanel.add(couponPanel,   BorderLayout.NORTH);
		mainPanel.add(customizePane, BorderLayout.CENTER);		
		this.add(mainPanel, BorderLayout.NORTH);
				
	}	
		
	private Boolean UpdateOrder() {
		Boolean OrderIsReady = true;		
		if (this.pickPartner.getValue() == null)
		{
			getPOSPanel().showErrorPanel(Msg.translate(Env.getCtx(), "C_BPartner"));
			OrderIsReady = false;
		}
				
		return OrderIsReady;
	}
	
	public void actionPerformed(ActionEvent e) {
		Component c = (Component)e.getSource();		
		
		if (c == fAmtFrom)
		{
			m_Pay = (BigDecimal) fAmtFrom.getValue();
			if (m_Pay == null)
				m_Pay = Env.ZERO;

			m_PayAvailable = m_Pay;

			m_balance = m_debt.subtract(m_Pay);
			DecimalFormat s_format = DisplayType.getNumberFormat(DisplayType.Amount);
			this.lSaldo.setText(s_format.format(m_balance));
			if (m_Pay.compareTo(Env.ZERO) > 0)
			{
				bFinish.setEnabled(true);
				bFinish.requestFocus();
			}	
			else
				bFinish.setEnabled(false);
		}

		if (c == bExit)
		{
			//dispose();
			Void();
			hideform();
		}
		if (c == bFinish)
		{			
			if (UpdateOrder())
			{
				getPOSPanel().setStatusLine("Generando pago...", false);				
				//setCoupons();
				process();			
				//dispose();
				Void();
				hideform();
			}
		}		
	}	
	
	public void Void() {		
		MClientInfo ci = MClientInfo.get(Env.getCtx());
		MBPartner partner = new Query(Env.getCtx(), X_C_BPartner.Table_Name, "C_BPartner_ID = ? ", null).setParameters(ci.getC_BPartnerCashTrx_ID()).first();						
		getPOSPanel().execute(partner);
		pickPartner.setValue(null);
		pickBPartnerLocation.setValue(null);
		fAmtFrom.setValue(null);
	}

	private void process() {
		//org.compiere.apps.SwingWorker worker = new org.compiere.apps.SwingWorker()
		//{
			
			//public Object construct()
		    //{
				String error = doTransaction();
				if (error.length() > 0)
					setError( error );
				//setInfo(getProcessMsg());
				if ( getErrorMsg() != null && getErrorMsg().length() > 0 )
				{
					if (m_showdialoginfo)
						ADialog.error(m_WindowNo, null , getErrorMsg() );
				}
				else
				{
					if (getInfo() != null && m_showdialoginfo) 
						ADialog.info(m_WindowNo, null, getInfo());
					getPOSPanel().setStatusLine(".", false);
				}						   
				//return Boolean.TRUE;
			//}
		//};
		//worker.start();		
	}
		
	public String doTransaction() 
	{ 
		String error = "";
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();			            
		try {						

			int C_Currency_ID = MClient.get(Env.getCtx()).getC_Currency_ID();
			int C_BPartner_ID = (Integer) pickPartner.getValue();
			int C_CashBook_ID = pospanel.getConfig().getC_CashBook_ID();
			Timestamp dateCollection = new Timestamp(System.currentTimeMillis());

			// abrimos la cajita
			MCashBook cb = new MCashBook(Env.getCtx(),C_CashBook_ID, trx.getTrxName());
			MCash cash = MCash.get(Env.getCtx(), cb.getC_CashBook_ID(), dateCollection , trx.getTrxName());
			if (cash.getC_Cash_ID() == 0) {
				cash = new MCash(cb,dateCollection );
				cash.save(trx.getTrxName());
			}			

			int PaymentNo = 0;

			// buscamos lo pendiente
			StringBuffer sql = new StringBuffer("SELECT i.DateInvoiced,i.DocumentNo,i.C_Invoice_ID,"); //  1..3
			sql.append( "c.ISO_Code,i.GrandTotal, ");                            //  4..5    Orig Currency
			sql.append( "currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID) AS ConvertedOpen , " );  //  7   #2  Converted Open
			sql.append( "i.MultiplierAP, i.c_bpartner_location_id, i.serial ");
			sql.append( " FROM C_Invoice_v i ");		//  corrected for CM/Split
			sql.append( " INNER JOIN C_Currency c ON (i.C_Currency_ID=c.C_Currency_ID) ");
			sql.append( " LEFT OUTER JOIN C_DocType_trl dt ON i.c_doctype_id = dt.c_doctype_id ");
			sql.append( " WHERE i.IsPaid='N' AND i.Processed='Y' ");
			sql.append(" AND i.IsSOTrx='Y'");
			sql.append(" AND i.C_BPartner_ID=? ORDER BY 1"); 
			log.fine("InvSQL=" + sql.toString());
			PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
			pstmt.setInt(1, C_Currency_ID);
			pstmt.setInt(2, C_BPartner_ID);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next() && m_PayAvailable.compareTo(Env.ZERO) > 0)
			{
				BigDecimal open = rs.getBigDecimal("ConvertedOpen");
				if (open == null)		//	no conversion rate
					open = Env.ZERO;				
				if (Env.ZERO.compareTo(open) != 0 && m_PayAvailable.compareTo(Env.ZERO) > 0)
				{
					int C_Invoice_ID = rs.getInt("C_Invoice_ID");
					MInvoice invoice = MInvoice.get(Env.getCtx(), C_Invoice_ID);
					MCashLine cashline = new MCashLine(cash);
					cashline.setC_Currency_ID(C_Currency_ID);
					cashline.setC_BPartner_ID(C_BPartner_ID);
					cashline.setC_Invoice_ID(C_Invoice_ID);
					if (invoice.getDescription() != null)
						cashline.setDescription(invoice
								.getDescription());
					cashline
					.setCashType(REF_C_CashTrxType.Invoice);

					if ( m_PayAvailable.compareTo(open) >= 0 )							
					{														
						cashline.setAmount(open);
						m_PayAvailable = m_PayAvailable.subtract(open);
					}			
					else
					{
						cashline.setAmount(m_PayAvailable);
						cashline.setIsPartialPayment(true);
						m_PayAvailable = Env.ZERO;
					}
					cashline.setIsCollection(true);
					cashline.save(trx.getTrxName());
					trx.commit();					
					PaymentNo++;
				}
			}
			rs.close();
			pstmt.close();

			if (PaymentNo > 0)
			{
				//
				MBPartner partner = MBPartner.get(Env.getCtx(), C_BPartner_ID);
				BigDecimal creditUsed = partner.getSO_CreditUsed();
				creditUsed = creditUsed.subtract(m_Pay);
				partner.setSO_CreditUsed(creditUsed);
				partner.save();
				//
				
				X_C_PrinterFormat pf = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
				.setParameters(X_C_POS.Table_ID, pospanel.getConfig().getC_POS_ID(), MachineCreator.POSCreditFormat).first();
				if (pf.getC_PrinterDocumentFormat_ID() > 0)
				{	
					MBPartner part = new MBPartner(Env.getCtx(), C_BPartner_ID, null);					
					DataSource.set(X_C_BPartner.COLUMNNAME_C_BPartner_ID, part.getName());															
					DataSource.set("Created", Env.getContextAsDate(Env.getCtx(), "#Date"));				
					//Calendar time = Calendar.getInstance();
					MUser user = MUser.get(Env.getCtx(), Env.getAD_User_ID(Env.getCtx()));
					DataSource.set(X_C_Order.COLUMNNAME_SalesRep_ID, user.getName());			
					DataSource.set(X_C_Order.COLUMNNAME_MachineSerial, pospanel.getConfig().getMachineSerial());					
					//					
					DecimalFormat s_format = DisplayType.getNumberFormat(DisplayType.Amount);
					DataSource.set("Debt",s_format.format(m_debt));
					//s_format = DisplayType.getNumberFormat(DisplayType.Amount);
					DataSource.set("Pay", s_format.format(m_Pay));
					DataSource.set("Balance", s_format.format(m_balance));
					X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), pf.getA_MachinePrinter_ID(), null);
					X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);
					PrintWorker pworker = new PrintWorker(machine);
					pworker.setNumberCopy(2);
					MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pf.getC_PrinterDocumentFormat_ID(), null);
					PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
					pd.setSource(pf.getSource());
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
				}				
				//return error;			
//				X_C_PrinterFormat pf = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
//					.setParameters(X_C_POS.Table_ID, pospanel.getConfig().getC_POS_ID(), MachineCreator.Collection).first();
//				if (pf.getC_PrinterDocumentFormat_ID() > 0)
//				{
//					DataSource.set("Balance", m_balance);
//					DataSource.set("Debt", m_debt);
//					DataSource.set("Pay", m_Pay);
//					//Collection cr = new Collection(pf);
//					//cr.setC_BPartner_ID(partner.getC_BPartner_ID());
//					//cr.setMachineSerial(pospanel.getConfig().getMachineSerial());
//					//cr.setBalance(m_balance);
//					//cr.setDebt(m_debt); 
//					//cr.setPay(m_Pay);
//					error = cr.print();
//				}
//				else
//				{
//					error = "se debe configurar un formato de impresion en el Terminal del PDV para la cobranza";
//					throw new Exception(error);
//				}
			}
			else
			{
				error = "no se encontro documento pendiente de pago";
				throw new Exception(error);
			}
		}
		catch (Exception e) {
			trx.rollback();
			error = e.getMessage();
		} finally {
			trx.close();
		}				
		return error;
	}
	
	public String getErrorMsg() { return m_error ; }
	
	public void setError(String error) { m_error = error;}
	
	public String getProcessMsg() { return null; }
	
	public void setInfo(String info) {}
	
	public String getInfo() {return null;}
	
	public void vetoableChange (PropertyChangeEvent e)
	{
		int C_Currency_ID = MClient.get(Env.getCtx()).getC_Currency_ID();
		String name = e.getPropertyName();
		Object value = e.getNewValue();
		log.config(name + "=" + value);
		if (value == null)
			return;

		//  BPartner
		if (name.equals("C_BPartner_ID"))
		{					
			getPOSPanel().getFrame().setBusy(true);
			Env.setContext(Env.getCtx(), m_WindowNo, "C_BPartner_ID", value.toString() );
			pickBPartnerLocation.refresh();
			pickBPartnerLocation.requestFocus();
			
			StringBuffer sql = new StringBuffer("SELECT SUM(currencyConvert(invoiceOpen(C_Invoice_ID,C_InvoicePaySchedule_ID),0,i.C_Currency_ID,?,i.DateInvoiced,i.C_ConversionType_ID,i.AD_Client_ID,i.AD_Org_ID)) AS ConvertedOpen  " );  //  7   #2  Converted Open
			sql.append( " FROM C_Invoice_v i ");		//  corrected for CM/Split
			sql.append( " WHERE i.IsPaid='N' AND i.Processed='Y' ");
			sql.append(" AND i.IsSOTrx='Y'");
			sql.append(" AND i.C_BPartner_ID=?"); 
			log.fine("InvSQL=" + sql.toString());
			try
			{				
				PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, C_Currency_ID);
				pstmt.setInt(2, (Integer) value);
				ResultSet rs = pstmt.executeQuery();
				if (rs.next())
				{
					m_debt = rs.getBigDecimal(1);
					if (m_debt == null)
						m_debt = Env.ZERO;
				}
				rs.close();
				pstmt.close();
				BigDecimal payInProcess = Env.ZERO;
				// create index in cashline by c_bpartner for improve performance
				sql = new StringBuffer("SELECT SUM(currencyConvert(cl.amount,0,cl.c_Currency_ID,?,c.statementdate,cl.c_conversiontype_id,cl.ad_client_id, cl.ad_org_id)) as converted ");
				sql.append(" FROM c_cashline cl join c_cash c ON cl.c_cash_id=c.c_cash_id ");
				sql.append(" WHERE cl.c_bpartner_id = ? AND cl.processed='N' AND cl.iscollection='Y'");
				pstmt = DB.prepareStatement(sql.toString(), null);
				pstmt.setInt(1, C_Currency_ID);
				pstmt.setInt(2, (Integer) value);
				rs = pstmt.executeQuery();
				if (rs.next())
				{
					payInProcess = rs.getBigDecimal(1);
					if (payInProcess == null)
						payInProcess = Env.ZERO;
				}
				rs.close();
				pstmt.close();
				if (payInProcess.compareTo(Env.ZERO) > 0)
				{
					m_debt = m_debt.subtract(payInProcess);
				}
			}
			catch (SQLException ex)
			{
				log.log(Level.SEVERE, sql.toString(), ex);
			}			
			getPOSPanel().getFrame().setBusy(false);
			DecimalFormat s_format = DisplayType.getNumberFormat(DisplayType.Amount);
			
			lDeuda.setText(s_format.format(m_debt));
		}
	}   //  vetoableChange
		
	public void setBusy (boolean busy)
	{
		if (busy == m_glassPane.isVisible())
			return;
		log.info("Busy=" + busy);
		m_glassPane.setMessage(null);
		if (busy)			
			m_glassPane.setBusyTimer(1000);
		else
			m_glassPane.setBusyTimer(0);
	}   //  setBusy

	public void dispose()
	{
		//pospanel.m_collectionDialog = null;
		//super.dispose();
	}	//	dispose	

	public void hideform()
	{
		getPOSPanel().enableEnvironment();
		setVisible(false);		
	}	//	dispose	
	
	public PosPanel getPOSPanel()
	{
		return pospanel;
	}

	@Override
	public void selection() {
		pickPartner.grabFocus();
	}	

}
