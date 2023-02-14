package org.xendra.developer;

import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_City;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.replication.ReplicationEngine;

import java.io.File;
import java.util.List;
import java.util.logging.Level;

public class encode {
	private static CLogger log = CLogger.getCLogger(encode.class);
	
	public static void maindecode(String[] args) {
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		log.info("decode   $Revision: 1.0 $");
		log.info("----------------------------------");
		//	first parameter
		String directory = System.getProperty("user.home").concat("/model/");
		if (args.length > 0)
			directory = args[0];
		if (directory == null || directory.length() == 0)
		{
			System.err.println("No Directory");
			System.exit(1);
		}
		log.info("Directory: " + directory);
		String tableLike = "'%'";	//	All tables
		if (args.length > 1)
			tableLike = args[1];
		else 
		{			
			File dir = new File(directory);
			for (final File fileentry: dir.listFiles()) {
				if (!fileentry.isDirectory()) {
					tableLike = fileentry.getName();
					if (fileentry.getName().indexOf(".") > 0) {
						   tableLike = fileentry.getName().substring(0, fileentry.getName().lastIndexOf("."));
						} else {
						   tableLike = fileentry.getName();
						}
					break;
				}
			}
		}
		log.info("Table Like: " + tableLike);
		String where = "";
		if (args.length > 2)
			where = args[2];
		log.info("Where : " + where);
		try {
			String file = String.format("%s/%s.xml", directory, tableLike);			
			MTable table = MTable.get(Env.getCtx(), tableLike);			
			if (table != null) {
				List<PO> records = new Query(Env.getCtx(), tableLike, where, null).list();
				Util.writeToFile(ReplicationEngine.getInstance().decode(records), file);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public static void main(String[] args) {
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		log.info("Encode   $Revision: 1.0 $");
		log.info("----------------------------------");
		//	first parameter
		String directory = System.getProperty("user.home").concat("/model/");
		if (args.length > 0)
			directory = args[0];
		if (directory == null || directory.length() == 0)
		{
			System.err.println("No Directory");
			System.exit(1);
		}
		log.info("Directory: " + directory);
		String tableLike = "'%'";	//	All tables
		if (args.length > 1)
			tableLike = args[1];
		else 
		{			
			File dir = new File(directory);
			for (final File fileentry: dir.listFiles()) {
				if (!fileentry.isDirectory()) {
					tableLike = fileentry.getName();
					if (fileentry.getName().indexOf(".") > 0) {
						   tableLike = fileentry.getName().substring(0, fileentry.getName().lastIndexOf("."));
						} else {
						   tableLike = fileentry.getName();
						}
					break;
				}
			}
		}
		String file = String.format("%s/%s.xml", directory, tableLike);
		try {
			ReplicationEngine.getInstance().encode(new File(file));
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}
	public static void main2(String[] args) {	
		if (!org.compiere.Xendra.startup(false))
		{					
			log.log(Level.SEVERE, "can't connect to database");
			return;
		}
		//String tablename = "";
		//String file = "";
		//String tablename = X_A_PrinterDriver.Table_Name;
		String tablename = X_C_City.Table_Name;
		//String tablename = X_GL_Book.Table_Name;
		//String tablename = X_GL_BookLine.Table_Name;		
		//String tablename = X_GL_BookItem.Table_Name;
		//String tablename = X_GL_BookFile.Table_Name;
		//String tablename = X_AD_User.Table_Name;
		//String tablename = X_AD_User_Roles.Table_Name;
		//String tablename = X_AD_Plugin.Table_Name;
		//String tablename = X_C_StorePOPLine.Table_Name;
		//String tablename = X_C_InvoiceLine.Table_Name;
		//String tablename = X_AD_Column.Table_Name;
		//String file = "/home/americas/model/printerdriver.xml";
		//String file = "/home/americas/model/c_city.xml";
		//String file = "/home/americas/model/gl_book.xml";
		//String file = "/home/americas/model/gl_bookline.xml";
		//String file = "/home/americas/model/gl_bookitems.xml";
		//String file = "/home/americas/model/gl_bookfile.xml";
		//String file = "/home/americas/model/ad_column.xml";
		//String file = "/home/americas/model/ad_user.xml";
		//String file = "/home/americas/model/ad_user_roles.xml";
		//String file = "/home/americas/model/ad_plugin.xml";
		String file = "/home/xapiens/projects/Xendra/standard/fill/C_DocumentTax.xml";
		//String file = "/home/americas/model/invoice.xml";
		//File file = new File("/home/americas/model/storeposlines.xml");
		//
		//List<PO> bookitems = new Query(Env.getCtx(), tablename, "id = 'org.columba.core'", null).list();
		//List<PO> bookitems = new Query(Env.getCtx(), tablename, "isactive = 'Y'", null).list();
//		List<PO> partners = new Query(Env.getCtx(), tablename, "isactive = 'Y' AND c_bpartner_id in (2007826,2004481,2006518) ", null).list();
//		//List<PO> invoices = new Query(Env.getCtx(), tablename, "isactive = 'Y' AND c_invoice_id in (2524976,2524975,2524974,2524973,2524972,2524971,2524970,2524969,2524968,2524967) ", null).list();
//		//ReplicationEngine replication = new ReplicationEngine();
//		try {
//			PrintWriter out = new PrintWriter(new File(file).getAbsolutePath());
//			out.println(ReplicationEngine.getInstance().decode(partners));
//			out.close();			
//			//Util.writeToFile(replication.decode(poslines), file );
//		}		
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		//  ahora procesamos el stream
		try {
			ReplicationEngine.getInstance().encode(new File(file));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
