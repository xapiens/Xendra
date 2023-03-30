package org.xendra.printdocument;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.imageio.ImageIO;

import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.MDocType;
import org.compiere.model.MOrder;
import org.compiere.model.MPrinterDriver;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.model.persistence.X_C_Order;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Splash;
import org.compiere.util.Util;
import org.mvel2.MVEL;
import org.mvel2.compiler.ExecutableStatement;
import org.mvel2.templates.TemplateRuntime;
import org.xendra.printdocument.driver.Printer;
import org.xendra.printdocument.driver.PrinterDriver;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import escpos.EscPos;
import escpos.image.BitImageWrapper;
import escpos.image.Bitonal;
import escpos.image.BitonalThreshold;
import escpos.image.EscPosImage;

/**
 * Handles PrintJobs by writing them to File.
 * 
 * @author Chris Simoes
 */
public class PrintHandler implements HandlerInterface {
	static CLogger log = CLogger.getCLogger(PrintHandler.class);
	private Object DriverLock = new Object();
	private String m_Error;
	private static final int BLACK = 0xFF000000;
	private static final int WHITE = 0xFFFFFFFF;

	public PrintHandler() {
		super();
	}

	public boolean process(PrintJob printJob) {
		final String METHOD_NAME = "process(): ";
		boolean result = true;
		if (null != printJob 
				&& null != printJob.getControlFile()
				&& null != printJob.getDataFile())
		{
			ControlFile cf = printJob.getControlFile();
			DataFile df = printJob.getDataFile();

			Integer numberCopy = cf.getNumberCopy();

			FileOutputStream fop = null;
			try {
				PrintWorker pw = df.getContents();				
				X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
						.setParameters(cf.getA_MachinePrinter_ID()).first();
				MPrinterDriver printdriver = new Query(Env.getCtx(), MPrinterDriver.Table_Name, "A_PrinterDriver_ID = ?", null)
						.setParameters(mp.getA_PrinterDriver_ID()).first();
				int numberlines = cf.getNumberLines();
				if (mp == null)
				{
					throw new Exception("la definicion de impresora para el equipo no existe");
				}
				if (printdriver == null)
				{
					throw new Exception("no se definio un driver para la impresora");
				}
				String device = mp.getDeviceName();
				PrintDocument pd = pw.getPrintDocument();
				pd.initializeDriver(printdriver);
				Map context = new HashMap();
				context.put("pd", pd);
				context.put("Pretty", Pretty.class);
				context.put("Print", Print.class);
				ExecutableStatement stmt = (ExecutableStatement) MVEL.compileExpression(pd.getSource());
				MVEL.executeExpression(stmt, context);									
				pd.build();
				System.out.println(pd.getOutput());
				Bitonal algorithm = new BitonalThreshold(127);
				for (int i=0; i < numberCopy; i++)
				{
					//Printer driver = new Printer(mp.getDeviceName());
					fop = new FileOutputStream(mp.getDeviceName());
					EscPos escpos = new EscPos(fop);					
					Reader stream = new StringReader(pd.getOutput());
					BufferedReader in = new BufferedReader(stream);
					//Vector lines = new Vector();
					String line;
					int linecount = 0;
					while((line = in.readLine()) != null) { 
						//lines.addElement(line);				      
						if (pd.containsGraphic(linecount)) {
							String filename = pd.getGraphic(linecount);
							File file = new File(filename);
							if (file.exists()) {
								BufferedImage image = ImageIO.read(file); 
								EscPosImage escposImage = new EscPosImage(image, algorithm);
								BitImageWrapper imageWrapper = new BitImageWrapper();
								escpos.write(imageWrapper, escposImage);
							}
						}
						else if (pd.containQRCode(linecount)) {
							String qrcommand = pd.getQRCode(linecount);
							BufferedImage image = null;
							if (qrcommand.contains("qrcodeimage")) {
								String filename = (String) TemplateRuntime.eval(qrcommand, pd.getVariables());								
								try {
								    image = ImageIO.read(new File(filename));
									EscPosImage escposImage = new EscPosImage(image, algorithm);
									BitImageWrapper imageWrapper = new BitImageWrapper();
									escpos.write(imageWrapper, escposImage);
								} catch (IOException e) {
									e.printStackTrace();
								}								
							}
						}
						else if (line.startsWith("command")) {
							if (line.contains("paper_full_cut")) {
								escpos.cut(EscPos.CutMode.FULL);
							}
						}
						//else if (pd.containCommand(linecount)) {
						//	  	String command = pd.getCommand(linecount);
						//	  	if (command.equals("paper_full_cut")) {
						//	  		escpos.cut(EscPos.CutMode.FULL);
						//	  	}
						//}
						else {
							escpos.writeLF(line);
						}
						linecount++;
					}
					//escpos.cut(EscPos.CutMode.FULL);
					escpos.close();
					//escpos.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				m_Error = e.getMessage();
				result = false;
			}
			finally {				
				try {
					if (fop != null) {
						fop.flush();
						fop.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}

		} else {
			log.severe(METHOD_NAME + "The printJob or printJob.getControlFile() or printJob.getDataFile() were empty");
		}
		return result;
	}
	/**
	 * Writes the printJob to printer using the jobName and jobId.
	 * @param printJob the PrintJob we are processing
	 * @return the result of our work, true for success or false for non-success
	 */
	//public boolean process(PrintJob printJob, String Format)  {
	//	public boolean process2(PrintJob printJob)  {
	//		final String METHOD_NAME = "process(): ";
	//		boolean result = false;
	//		if(null != printJob 
	//				&& null != printJob.getControlFile()
	//				&& null != printJob.getDataFile()) 
	//		{
	//			ControlFile cf = printJob.getControlFile();
	//			DataFile df = printJob.getDataFile();
	//
	//			Integer numberCopy = cf.getNumberCopy();
	//
	//			//Boolean tryPrint = true;
	//			try {
	//				if (Format == null)
	//				{
	//					throw new Exception("El formato especificado para "+printJob.getName()+" no existe");
	//				}
	//				PrintWorker pw = df.getContents();				
	//				X_A_MachinePrinter mp = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "A_MachinePrinter_ID = ?", null)
	//				.setParameters(cf.getA_MachinePrinter_ID()).first();
	//				MPrinterDriver pd = new Query(Env.getCtx(), MPrinterDriver.Table_Name, "A_PrinterDriver_ID = ?", null)
	//				.setParameters(mp.getA_PrinterDriver_ID()).first();
	//				int numberlines = cf.getNumberLines();
	//				if (mp == null)
	//				{
	//					throw new Exception("la definicion de impresora para el equipo no existe");
	//				}
	//				if (pd == null)
	//				{
	//					throw new Exception("no se definio un driver para la impresora");
	//				}
	//				String device = mp.getDeviceName();
	//				//VelocityEngine ve = new VelocityEngine();
	//				//ve.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM, this);
	//
	////				VelocityContext context = new VelocityContext();		
	//				Enumeration en = pw.getProperty().keys();
	//				Map vars = new HashMap();
	//				while (en.hasMoreElements() )	
	//				{
	//					String key = (String) en.nextElement();
	//					Object value = pw.getProperty().get(key);
	////					context.put((String) key, value);
	//					vars.put(key, value); 
	//				}
	//				List<Vector> lines = pw.getPropertyLines();
	//				{
	//					for (Vector pname:lines)
	//					{
	//						String name = (String) pname.firstElement();
	////						//pname.remove(0);
	//						Vector content = (Vector) pname.clone();
	//						content.remove(0);
	////						context.put(name, content);
	//						vars.put(name, content);
	//					}
	//				}								
	//				vars.put(PrinterDriver.NL,"\n");				
	//				vars.put(PrinterDriver.beeper,pd.beeper());
	//				vars.put(PrinterDriver.line_space_24,pd.line_space_24());
	//				vars.put(PrinterDriver.line_space_30,pd.line_space_30());
	//				vars.put(PrinterDriver.image_mode,pd.image_mode());
	//				vars.put(PrinterDriver.hw_init,pd.hw_init());
	//				vars.put(PrinterDriver.cd_kick_2,pd.cd_kick_2());
	//				vars.put(PrinterDriver.cd_kick_5,pd.cd_kick_5());
	//				vars.put(PrinterDriver.paper_full_cut,pd.paper_full_cut());
	//				vars.put(PrinterDriver.paper_part_cut,pd.paper_part_cut());
	//				vars.put(PrinterDriver.txt_normal,pd.txt_normal());
	//				vars.put(PrinterDriver.txt_2height,pd.txt_2height());
	//				vars.put(PrinterDriver.txt_2width,pd.txt_2width());
	//				vars.put(PrinterDriver.txt_4square,pd.txt_4square());
	//				vars.put(PrinterDriver.txt_underl_off,pd.txt_underl_off());
	//				vars.put(PrinterDriver.txt_underl_on,pd.txt_underl_on());
	//				vars.put(PrinterDriver.txt_underl2_on,pd.txt_underl2_on());
	//				vars.put(PrinterDriver.txt_bold_off,pd.txt_bold_off());
	//				vars.put(PrinterDriver.txt_bold_on,pd.txt_bold_on());
	//				vars.put(PrinterDriver.txt_font_a,pd.txt_font_a());
	//				vars.put(PrinterDriver.txt_font_b,pd.txt_font_b());
	//				vars.put(PrinterDriver.txt_align_lt,pd.txt_align_lt());
	//				vars.put(PrinterDriver.txt_align_ct,pd.txt_align_ct());
	//				vars.put(PrinterDriver.txt_align_rt,pd.txt_align_rt());
	//				vars.put(PrinterDriver.charcode_pc437,pd.charcode_pc437());
	//				vars.put(PrinterDriver.charcode_jis,pd.charcode_jis());
	//				vars.put(PrinterDriver.charcode_pc850,pd.charcode_pc850());
	//				vars.put(PrinterDriver.charcode_pc860,pd.charcode_pc860());
	//				vars.put(PrinterDriver.charcode_pc863,pd.charcode_pc863());
	//				vars.put(PrinterDriver.charcode_weu,pd.charcode_weu());
	//				vars.put(PrinterDriver.charcode_greek,pd.charcode_greek());
	//				vars.put(PrinterDriver.charcode_hebrew,pd.charcode_hebrew());
	//				vars.put(PrinterDriver.charcode_pc1252,pd.charcode_pc1252());
	//				vars.put(PrinterDriver.charcode_pc866,pd.charcode_pc866());
	//				vars.put(PrinterDriver.charcode_pc852,pd.charcode_pc852());
	//				vars.put(PrinterDriver.charcode_pc858,pd.charcode_pc858());
	//				vars.put(PrinterDriver.charcode_thai42,pd.charcode_thai42());
	//				vars.put(PrinterDriver.charcode_thai11,pd.charcode_thai11());
	//				vars.put(PrinterDriver.charcode_thai13,pd.charcode_thai13());
	//				vars.put(PrinterDriver.charcode_thai14,pd.charcode_thai14());
	//				vars.put(PrinterDriver.charcode_thai16,pd.charcode_thai16());
	//				vars.put(PrinterDriver.charcode_thai17,pd.charcode_thai17());
	//				vars.put(PrinterDriver.charcode_thai18,pd.charcode_thai18());
	//				vars.put(PrinterDriver.barcode_txt_off,pd.barcode_txt_off());
	//				vars.put(PrinterDriver.barcode_txt_abv,pd.barcode_txt_abv()); 
	//				vars.put(PrinterDriver.barcode_txt_blw,pd.barcode_txt_blw()); 
	//				vars.put(PrinterDriver.barcode_txt_bth,pd.barcode_txt_bth()); 
	//				vars.put(PrinterDriver.barcode_font_a,pd.barcode_font_a()); 
	//				vars.put(PrinterDriver.barcode_font_b,pd.barcode_font_b()); 
	//				vars.put(PrinterDriver.barcode_height,pd.barcode_height()); 
	//				vars.put(PrinterDriver.barcode_width,pd.barcode_width()); 
	//				vars.put(PrinterDriver.barcode_upc_a,pd.barcode_upc_a()); 
	//				vars.put(PrinterDriver.barcode_upc_e,pd.barcode_upc_e()); 
	//				vars.put(PrinterDriver.barcode_ean13,pd.barcode_ean13()); 
	//				vars.put(PrinterDriver.barcode_ean8,pd.barcode_ean8()); 
	//				vars.put(PrinterDriver.barcode_code39,pd.barcode_code39()); 
	//				vars.put(PrinterDriver.barcode_itf,pd.barcode_itf()); 
	//				vars.put(PrinterDriver.barcode_nw7,pd.barcode_nw7()); 
	//				vars.put(PrinterDriver.pd_n50,pd.pd_n50()); 
	//				vars.put(PrinterDriver.pd_n37,pd.pd_n37()); 
	//				vars.put(PrinterDriver.pd_n25,pd.pd_n25()); 
	//				vars.put(PrinterDriver.pd_n12,pd.pd_n12()); 
	//				vars.put(PrinterDriver.pd_n0,pd.pd_n0()); 
	//				vars.put(PrinterDriver.pd_p50,pd.pd_p50()); 
	//				vars.put(PrinterDriver.pd_p37,pd.pd_p37()); 
	//				vars.put(PrinterDriver.pd_p25,pd.pd_p25()); 
	//				vars.put(PrinterDriver.pd_p12,pd.pd_p12()); 	
	//				vars.put("Util", Util.class);
	//				StringWriter writer = new StringWriter();
	////				Velocity.init();
	////				Velocity.evaluate(context, writer, "LOG", Format);
	//				String output = Format;
	//				try {
	//					output = (String) TemplateRuntime.eval(Format, vars);
	//				} catch (Exception ex) {
	//					ex.printStackTrace();
	//				}				
	//				for (int i=0; i < numberCopy; i++)
	//				{
	//					Printer driver = new Printer(mp.getDeviceName());		
	////					driver.output(writer.getBuffer().toString());
	//					driver.output(output);
	//					driver.close();
	//				}
	//				result=true;					
	//			} 
	//			catch(Exception e) {
	//				e.printStackTrace();
	//				m_Error = e.getMessage();
	//			}
	//
	//		} else {
	//			log.severe(METHOD_NAME + "The printJob or printJob.getControlFile() or printJob.getDataFile() were empty");
	//		}
	//		return result;
	//	}

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
					//controlFile.setC_PrinterDocumentFormat_ID(pw.getPrinterDocumentFormat_ID());

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
}
