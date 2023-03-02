package org.xendra.printdocument;

import java.awt.EventQueue;
import java.io.*;
import java.net.*;

import org.compiere.apps.AEnv;
import org.compiere.apps.ALogin;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Splash;

/**
 * based in Line Printer Daemon (LPD).  
 */
public class LinePrinterServer implements Runnable {
	static CLogger log = CLogger.getCLogger(LinePrinterServer.class);
	
	private final static LinePrinterServer INSTANCE = new LinePrinterServer();
	
	/**
	 * Constructor for LPD.
	 */
	private LinePrinterServer() {
		super();
		log.fine("LPD(): STARTED");
		try {
			//Template t = ve.getTemplate("foo.vm");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * This class is a singleton.  
	 * @param printserver 
	 * @return the only instance of LPD.
	 */
	public static LinePrinterServer getInstance() {
		return INSTANCE;
	}

	/**
	 * The run method is implemented so this can be run in its own Thread if desired.
	 */
	public void run() {
		final String METHOD_NAME = "run(): ";
		ServerSocket serverSocket = null;
		LinePrinterCommands lpdCommands = new LinePrinterCommands();
		try {
			serverSocket = new ServerSocket(PrintConstants.port);			
			while(true) {
				log.fine(METHOD_NAME + "trying to accept() socket connection.");
				//Socket connection = serverSocket.accept();
				Socket connection = serverSocket.accept();
				log.fine(METHOD_NAME + "Connection opened.");
				PrintJob job = null;
				log.fine(METHOD_NAME + "Created a new PrintJob.");

				OutputStream os = null;
				ObjectInputStream ois = null;
				ByteArrayOutputStream baos = null;
				try {
					ois = new ObjectInputStream(connection.getInputStream());
					Object printwork = ois.readObject();					
					if (printwork instanceof PrintWorker)
					{
						PrintWorker obj = (PrintWorker) printwork;
						os = connection.getOutputStream();
						log.fine(METHOD_NAME + "Got InputStream.");
						lpdCommands.handleCommand(obj, os);						
					}
					else if (printwork instanceof PrintJob)
					{
						//lpdCommands.handleCommand(objx);
					}
				} catch(Exception e) {
					log.fine(METHOD_NAME + "ERROR in try 2");
					log.fine(METHOD_NAME + e.getMessage());
					e.printStackTrace();
				} finally {
					os.close();
					ois.close();
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(null != serverSocket) {
				try { serverSocket.close(); }
				catch(IOException e) {}
			}
		}
		
	}

	public static void main(String args[]) {
		log.fine("main(): STARTED");
		try {
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
						Queues queues = Queues.getInstance();
						final String rawQueueName = "factura";
						PrintJobTableModel pjtm = new PrintJobTableModel();
						PrintedJobTableModel pdjtm = new PrintedJobTableModel();
						X_A_MachinePrinter printer = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, "IsActive = 'Y'", null).first();
						PrintQueue rawQueue = queues.createQueueWithTableModel(printer, pjtm, pdjtm);
						pjtm.setPrintQueueDataModel(rawQueue);
						// start GUI
						PrintJobJFrame printJobJFrame = new PrintJobJFrame(pjtm); 
						printJobJFrame.setVisible(true);
						
						// Run the LPD spooler
						Thread lpdThread = new Thread(LinePrinterServer.getInstance());
						lpdThread.start();									
						// Setup the QueueMontior to process the rawQueue
						QueueMonitor rawQueueMonitor = new QueueMonitor(rawQueueName);
						Thread rawQueueMonitorThread = new Thread(rawQueueMonitor);
						rawQueueMonitorThread.start();						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});			
		} catch(Exception e) {
			log.severe(e.getMessage());
		}
		log.fine("main(): FINSHED");
	}
}
