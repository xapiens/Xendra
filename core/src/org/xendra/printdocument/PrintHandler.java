package org.xendra.printdocument;

import java.awt.EventQueue;
import java.io.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.MPrinterDriver;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
//import org.compiere.model.persistence.X_C_POSLog;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.Env;
import org.compiere.util.Splash;
import org.xendra.printdocument.driver.Printer;
import org.xendra.printdocument.driver.PrinterDriver;

/**
 * Handles PrintJobs by writing them to File.
 * 
 * @author Chris Simoes
 */
public class PrintHandler implements HandlerInterface {
	static Logger log = Logger.getLogger(PrintHandler.class);
	private Object DriverLock = new Object();
	private String m_Error;

	public PrintHandler() {
		super();
	}
	
	/**
	 * Writes the printJob to printer using the jobName and jobId.
	 * @param printJob the PrintJob we are processing
	 * @return the result of our work, true for success or false for non-success
	 */
	public boolean process(PrintJob printJob, String Format)  {
		final String METHOD_NAME = "process(): ";
		boolean result = false;
		if(null != printJob 
			&& null != printJob.getControlFile()
			&& null != printJob.getDataFile()) 
		{
			ControlFile cf = printJob.getControlFile();
			DataFile df = printJob.getDataFile();
						
			Integer numberCopy = cf.getNumberCopy();
						
			//Boolean tryPrint = true;
			try {
				if (Format == null)
				{
					throw new Exception("El formato especificado para "+printJob.getName()+" no existe");
				}
				PrintWorker pw = df.getContents();				
				X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
					.setParameters(cf.getA_MachinePrinter_ID()).first();
				MPrinterDriver pd = new Query(Env.getCtx(), MPrinterDriver.Table_Name, "A_PrinterDriver_ID = ?", null)
					.setParameters(mp.getA_PrinterDriver_ID()).first();
				int numberlines = cf.getNumberLines();
				if (mp == null)
				{
					throw new Exception("la definicion de impresora para el equipo no existe");
				}
				if (pd == null)
				{
					throw new Exception("no se definio un driver para la impresora");
				}
				String device = mp.getDeviceName();
				VelocityEngine ve = new VelocityEngine();
				ve.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM, this);
				//try {					
					VelocityContext context = new VelocityContext();		
					Enumeration en = pw.getProperty().keys();
					while (en.hasMoreElements() )	
					{
						Object key = en.nextElement();
						Object value = pw.getProperty().get(key);
						context.put((String) key, value);
					}
					List<Vector> lines = pw.getPropertyLines();
					{
						for (Vector pname:lines)
						{
							String name = (String) pname.firstElement();
							//pname.remove(0);
							Vector content = (Vector) pname.clone();
							content.remove(0);
							context.put(name, content);
						}
					}												
					context.put("formatter", new Formatter());					
					context.put(ParseFormat.NL,"\n");					
					context.put(ParseFormat.FONT_CONDENSED, pd.getFontCondensed());
					context.put(ParseFormat.FONT_NORMAL, pd.getFontNormal());
					context.put(ParseFormat.FONT_BOLD, pd.getFontBold());
					context.put(ParseFormat.CASHDRAWEROPEN, pd.getCashdrawerOpen());
					context.put(ParseFormat.PAPERCUT, pd.getPaperCut());
					context.put(ParseFormat.PAGEFEED, pd.getPageFeed());
					context.put(ParseFormat.LINEFEED, pd.getLineFeed());	
					context.put(ParseFormat.NUMBEROFLINES, numberlines);
					StringWriter writer = new StringWriter();
					Velocity.init();
					Velocity.evaluate(context, writer, "LOG", Format);
					for (int i=0; i < numberCopy; i++)
					{
						Printer driver = new Printer(mp.getDeviceName());		
						//driver.setDriver(pd);
						//driver.cashdraweropen();	
						driver.output(writer.getBuffer().toString());
						//driver.paperCut();
						//driver.lineFeed();
						driver.close();
					}
					result=true;					
				//} catch (Exception e) {
				//	e.printStackTrace();
				//}				
			} 
			catch(Exception e) {
				e.printStackTrace();
				m_Error = e.getMessage();
			}
			
		} else {
			log.error(METHOD_NAME + "The printJob or printJob.getControlFile() or printJob.getDataFile() were empty");
		}
		return result;
	}
	
	public String getError()
	{
		return m_Error;
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
					MOrder order = new MOrder(Env.getCtx(), 0, null);
					// 322078 79
					MDocType dt = new MDocType(Env.getCtx(), 1001308, null);
					
					X_C_PrinterDocumentFormat pdf = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name, "", null).first();
					String format = pdf.getFormat();
					PrintWorker pw = new PrintWorker();
					pw.AddProperty("CurrentTime", new Timestamp(System.currentTimeMillis()));
					pw.AddProperty(X_C_Order.COLUMNNAME_SerialToInvoice, "216");
					pw.AddProperty(X_C_Order.COLUMNNAME_DocumentNoToInvoice, "006338373");				
					pw.AddProperty(X_C_Order.COLUMNNAME_SalesRep_ID, "052lvi");
					pw.AddProperty(X_C_Order.COLUMNNAME_C_BPartner_ID,"CLIENTE VARIOS");
					pw.AddProperty(X_C_Order.COLUMNNAME_GrandTotal, new BigDecimal("1.20"));					
					//obj.AddProperty(X_C_POSLog.COLUMNNAME_DifferenceAmt, new BigDecimal("0.00"));
					//obj.AddProperty(X_C_POSLog.COLUMNNAME_PrinterSerial, "FFKAQ7090037");
					//obj.AddProperty(X_C_POSLog.COLUMNNAME_MachineSerial, "C-006");					
					pw.AddProperty(X_C_Order.COLUMNNAME_C_PaymentTerm_ID, "Contado");
					
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_QtyEntered, "1");
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_M_Product_ID, "12 P.V.M. JR S/L SURTIDO 360 GR + 1 P.V.M.JR S/L CHOCO 360GR");
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, "Bot");
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_PriceEntered, new BigDecimal("0.50"));
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, new BigDecimal("0.50"));
					
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_QtyEntered, "1");
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_M_Product_ID, "2 LADY SPEED STICK SPRAY SHOWER FRESH 100GR + 1 CEP.EXT.CLEA");
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_C_UOM_ID, "Bot");
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_PriceEntered, new BigDecimal("0.70"));
					pw.AddPropertyLine(X_C_OrderLine.COLUMNNAME_LineNetAmt, new BigDecimal("0.70"));

					String controlfile = 
							new String("C1\n"+
									"JJob name\n"+
									"LUser\n"+
									"Muser\n"+
									"NName\n"+
									"PName\n"+
									"Ttitle\n"+
									"HHost\n");
									//"Icount\n"+
									//"Sdevice inode\n"+							
									//"Ufile\n"+
									//"Wwidth\n"+
									//"1file\n"+
									//"2file\n"+
									//"3file\n"+
									//"4file\n"+
									//"cfile\n"+
									//"dfile\n"+
									//"ffile\n"+
									//"gfile\n"+
									//"lfile\n"+
									//"nfile\n"+
									//"ofile\n"+
									//"pfile\n"+
									//"rfile\n"+
									//"tfile\n"+
									//"vfile\n");

			        //System.out.println("controlfile[" + controlfile + "]");
			        byte[] bytes = controlfile.getBytes();
					pw.setContents(bytes);
					
					
					OutputStream os = null;
					DataFile dataFile = new DataFile();
					dataFile.setHostName(pw.getHostName());
					dataFile.setJobNumber("1");
					dataFile.setContents(pw);		

					ControlFile controlFile = new ControlFile();
					controlFile.setCount(String.valueOf(pw.getCount()));
					controlFile.setJobNumber("1");
					controlFile.setHostName(pw.getHostName());
					controlFile.setType(pw.getType());
					controlFile.setControlFileCommands(pw.getContent());
					controlFile.setC_PrinterDocumentFormat_ID(pw.getPrinterDocumentFormat_ID());
					
					PrintJob printJob = new PrintJob(controlFile, dataFile); 					
					PrintHandler ph = new PrintHandler();
					ph.process(printJob, pdf.getFormat());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}
}
