package org.xendra.pos.reports;

import java.awt.EventQueue;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.MPrinterDocumentFormat;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_POS;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.model.persistence.X_C_PrinterFormat;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Splash;
import org.xendra.pos.PosPanel;
import org.xendra.pos.wizard.MachineCreator;
import org.xendra.printdocument.ControlFile;
import org.xendra.printdocument.DataFile;
import org.xendra.printdocument.DataSource;
import org.xendra.printdocument.MVELParseFormat;
import org.xendra.printdocument.PrintDocument;
import org.xendra.printdocument.PrintHandler;
import org.xendra.printdocument.PrintJob;
import org.xendra.printdocument.PrintWorker;

public class CreditCardList {

	private int m_C_POS_ID;
	private Timestamp m_CashDate;
	private PosPanel pospanel;
	private static DecimalFormat s_format = DisplayType.getNumberFormat(DisplayType.Amount);;

	public CreditCardList(PosPanel pp, Timestamp CashDate)
	{
		pospanel = pp;
		m_C_POS_ID = getPOSPanel().getConfig().getC_POS_ID();
		m_CashDate = CashDate;
	}

	public String print() {
		String error = "";
		try {
			DataSource.clear("creditcardlist");
			String select = "SELECT * FROM v_cashcount WHERE C_POS_ID = ? AND date_trunc('day',dateinvoiced) = date_trunc('day',?::date) ";
			PreparedStatement pstmt = DB.prepareStatement(select.toString(), null);
			pstmt.setInt(1, m_C_POS_ID);
			pstmt.setTimestamp(2, (Timestamp) m_CashDate);
			ResultSet rs = pstmt.executeQuery();
			Boolean paycreated = false;
			Boolean creditcreated = false;
			Boolean cashcreated = false;
			while (rs.next())
			{				
				String type = rs.getString("type");
				if (type.equals("P")) {
					String cardname 	= rs.getString("cardname");					
					String cardtype 	= rs.getString("creditcardtype");
					String cardnumber 	= rs.getString("creditcardnumber");							 
					BigDecimal pay 		= rs.getBigDecimal("payamt");
					BigDecimal totalpay = rs.getBigDecimal("totalamt");
					if (totalpay.compareTo(BigDecimal.ZERO) > 0) {
						DataSource.setLine("cardname", cardname);
						DataSource.setLine("cardtype", "");
						DataSource.setLine("cardnumber", "");
						DataSource.setLine("Pay", totalpay);
					} else {
						DataSource.setLine("cardname", cardname);
						DataSource.setLine("cardtype", cardtype);
						DataSource.setLine("cardnumber", cardnumber);
						DataSource.setLine("Pay", pay);
					}
					paycreated = true;
				} else if (type.equals("B")) {
					String C_BPartner_ID = rs.getString("C_BPartner_ID");
					BigDecimal credit = rs.getBigDecimal("CreditAmt");
					BigDecimal totalcredit = rs.getBigDecimal("TotalAmt");
					if (totalcredit.compareTo(BigDecimal.ZERO) > 0) {
						DataSource.setLine("creditpartner", "");
						DataSource.setLine("creditamt", totalcredit);
					} else {
						DataSource.setLine("creditpartner", C_BPartner_ID);
						DataSource.setLine("creditamt", credit);
					}
					creditcreated = true;
				} else if (type.equals("C")) {
					String C_BPartner_ID = rs.getString("C_BPartner_ID");
					BigDecimal cash = rs.getBigDecimal("CashAmt");
					BigDecimal totalcash = rs.getBigDecimal("TotalAmt");
					if (totalcash.compareTo(BigDecimal.ZERO) > 0) {
						DataSource.set("TotalCash", totalcash);
					} else {
						DataSource.setLine("CashC_BPartner_ID", C_BPartner_ID);
						DataSource.setLine("CashAmt", cash);
					}
					cashcreated = true;
				}										
			}
			if (!paycreated) {
				DataSource.setLine("cardname", "");
				DataSource.setLine("cardtype", "");
				DataSource.setLine("cardnumber", "");
				DataSource.setLine("Pay", "");
			}
			if (!creditcreated) {
				DataSource.setLine("creditpartner", "");
				DataSource.setLine("creditamt", "");				
			} 
			if (!cashcreated) {
				DataSource.setLine("CashC_BPartner_ID", "");
				DataSource.setLine("CashAmt", "");				
			}
			X_C_PrinterFormat pf = new Query(Env.getCtx(), X_C_PrinterFormat.Table_Name, "AD_Table_ID = ? AND Record_ID = ? AND Value = ?", null)
			.setParameters(X_C_POS.Table_ID, pospanel.getConfig().getC_POS_ID(), MachineCreator.CreditCardList).first();
			X_A_MachinePrinter mp = new X_A_MachinePrinter(Env.getCtx(), pf.getA_MachinePrinter_ID(), null);
			X_A_Machine machine = new X_A_Machine(Env.getCtx(), mp.getA_Machine_ID(), null);

			MPrinterDocumentFormat pdf = new MPrinterDocumentFormat(Env.getCtx(), pf.getC_PrinterDocumentFormat_ID(), null);
			PrintDocument pd = MVELParseFormat.getInstance().parse(pdf);
			pd.setData(DataSource.getInstance());
			PrintWorker pw = new PrintWorker(machine);
			error = pw.setPrintDocument(pd);			
			error = pw.Print(PrintWorker.ReceiveJob);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return error;
	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					org.compiere.Xendra.startup(true);
					Splash splash = Splash.getSplash();
					ALogin login = new ALogin(splash);
					if (!login.initLogin())		//	no automatic login
					{
						//	Center the window
						try
						{
							AEnv.showCenterScreen(login);	//	HTML load errors
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
						if (!login.isConnected() || !login.isOKpressed())
							AEnv.exit(1);
					}		
					String where = "C_PrinterDocumentFormat_ID = ? ";
					X_C_PrinterDocumentFormat pdf = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, where, null)
					.setParameters(8)
					.first();

					PrintWorker obj = new PrintWorker(null);
					obj.AddProperty("CurrentTime", new Timestamp(System.currentTimeMillis()));
					obj.AddProperty(X_C_Order.COLUMNNAME_SerialToInvoice, "216");
					obj.AddProperty(X_C_Order.COLUMNNAME_DocumentNoToInvoice, "006338373");				
					obj.AddProperty(X_C_Order.COLUMNNAME_SalesRep_ID, "052lvi");
					obj.AddProperty(X_C_Order.COLUMNNAME_C_BPartner_ID,"CLIENTE VARIOS");
					obj.AddProperty(X_C_Order.COLUMNNAME_GrandTotal, new BigDecimal("1.20"));					
					obj.AddProperty(X_C_Order.COLUMNNAME_DifferenceAmt, new BigDecimal("0.00"));
					obj.AddProperty(X_C_Order.COLUMNNAME_PrinterSerial, "FFKAQ7090037");
					obj.AddProperty(X_C_Order.COLUMNNAME_MachineSerial, "C-006");					
					obj.AddProperty(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, "Contado");

					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_QtyEntered, "1");
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_M_Product_ID, "12 P.V.M. JR S/L SURTIDO 360 GR + 1 P.V.M.JR S/L CHOCO 360GR");
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, "Bot");
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_PriceEntered, new BigDecimal("0.50"));
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, new BigDecimal("0.50"));

					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_QtyEntered, "1");
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_M_Product_ID, "2 LADY SPEED STICK SPRAY SHOWER FRESH 100GR + 1 CEP.EXT.CLEA");
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, "Bot");
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_PriceEntered, new BigDecimal("0.70"));
					obj.AddPropertyLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, new BigDecimal("0.70"));

					String controlfile = 
							new String("C1\n"+
									"JJob name\n"+
									"LUser\n"+
									"Muser\n"+
									"NName\n"+
									"PName\n"+
									"Ttitle\n"+
									"H"+"192.168.1.10"+"\n");

					byte[] bytes = controlfile.getBytes();
					obj.setContents(bytes);

					OutputStream os = null;
					DataFile dataFile = new DataFile();
					dataFile.setHostName(obj.getHostName());
					dataFile.setJobNumber("1");
					dataFile.setContents(obj);		

					ControlFile controlFile = new ControlFile();
					controlFile.setCount(String.valueOf(obj.getCount()));
					controlFile.setJobNumber("1");
					controlFile.setHostName(obj.getHostName());
					controlFile.setType(obj.getType());
					controlFile.setControlFileCommands(obj.getContent());
					///controlFile.setC_PrinterDocumentFormat_ID(obj.getPrinterDocumentFormat_ID());
					PrintJob printJob = new PrintJob(controlFile, dataFile); 					
					PrintHandler ph = new PrintHandler();
					//ph.process(printJob, pdf.getFormat());
					ph.process(printJob);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}

	public PosPanel getPOSPanel()
	{
		return pospanel;
	}

}
