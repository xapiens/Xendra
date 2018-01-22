package org.xendra.printdocument;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.Constants;

public class PrintDocumentManager {

	private static PrintDocumentManager instance = new PrintDocumentManager();
	//private boolean Initialized = false;
	
//	public boolean isInitialized()
//	{
//		return Initialized;
//	}
	
	private PrintDocumentManager()
	{	
		build();
	}
	
	public static PrintDocumentManager getInstance() {
    	return instance;
    }
	private Queues queues;
	private List<PrintJobTableModel> listpjtm = new ArrayList<PrintJobTableModel>();
	private List<PrintedJobTableModel> listpdjtm = new ArrayList<PrintedJobTableModel>();
	private List<String> m_QueueName = new ArrayList<String>();
	private List<PrintQueue> m_rawQueue = new ArrayList<PrintQueue>();	
	private String localhost = Util.getLocalHostName();
	private int size = 0;
	private Thread lpdThread;
	private Hashtable<Integer, X_A_MachinePrinter> printers = new Hashtable();
	
	public String getLocalHost()
	{
		return localhost;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void build()
	{
		List<X_A_MachinePrinter> printerlist = null;
		try {			
			String where = "A_Machine_ID = ? AND isActive = 'Y'";
			printerlist = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, where, null)
			.setParameters(Env.getMachine().getA_Machine_ID()).list();
			queues = Queues.getInstance();
			
			if (printerlist.size() > 0)
			{
				size = printerlist.size();
				if (lpdThread == null)
				{
					lpdThread = new Thread(LinePrinterServer.getInstance());
					lpdThread.setName("LinePrinterServer");
					lpdThread.start();
				}
			}
			for (X_A_MachinePrinter print:printerlist)
			{
				try {
					if (!printers.containsKey(print.getA_MachinePrinter_ID()))
					{							
						PrintJobTableModel pjtm = new PrintJobTableModel();
						PrintedJobTableModel pdjtm = new PrintedJobTableModel();
						m_QueueName.add(print.getQueueName());
						//PrintQueue rawQueue = queues.createQueueWithTableModel(print.getQueueName(),print.getDeviceName(), pjtm, pdjtm);
						PrintQueue rawQueue = queues.createQueueWithTableModel(print, pjtm, pdjtm);
						pjtm.setPrintQueueDataModel(rawQueue);
						pdjtm.setPrintedQueueDataModel(rawQueue);
						listpjtm.add(pjtm);
						listpdjtm.add(pdjtm);				
						m_rawQueue.add(rawQueue); 
						QueueMonitor rawQueueMonitor = new QueueMonitor(print.getQueueName());
						Thread rawQueueMonitorThread = new Thread(rawQueueMonitor);
						rawQueueMonitorThread.setName("QueueMonitor -"+print.getQueueName());
						rawQueueMonitorThread.start();
						printers.put(print.getA_MachinePrinter_ID(), print);
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}				
			}			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
		
//	public void build()
//	{
//		List<X_A_MachinePrinter>  printers = checkAndcreatePrintServer();		
//		if (buildPrintDocumentServer(printers))
//		{
//			Initialized = true;
//		}		
//	}
//
//	public static List<X_A_MachinePrinter> checkAndcreatePrintServer()
//	{
//		List<X_A_MachinePrinter> printers = null;
//		try {			
//			String where = "A_Machine_ID = ? AND isActive = 'Y'";
//			printers = new Query(Env.getCtx(), X_A_MachinePrinter.Table_Name, where, null)
//			.setParameters(Env.getMachine().getA_Machine_ID()).list();
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//		//
//		return printers;
//	}
//	
//	private boolean buildPrintDocumentServer(List<X_A_MachinePrinter> printerlist) {			
//		if (printerlist == null)
//			return false;
//		queues = Queues.getInstance();
//		if (printerlist.size() > 0)
//		{
//			size = printerlist.size();
//			if (lpdThread == null)
//			{
//				lpdThread = new Thread(LinePrinterServer.getInstance());
//				lpdThread.setName("LinePrinterServer");
//				lpdThread.start();
//			}
//		}
//		for (X_A_MachinePrinter print:printerlist)
//		{
//			try {
//				if (!printers.contains(print.getA_MachinePrinter_ID()))
//				{							
//					PrintJobTableModel pjtm = new PrintJobTableModel();
//					PrintedJobTableModel pdjtm = new PrintedJobTableModel();
//					m_QueueName.add(print.getQueueName());
//					//PrintQueue rawQueue = queues.createQueueWithTableModel(print.getQueueName(),print.getDeviceName(), pjtm, pdjtm);
//					PrintQueue rawQueue = queues.createQueueWithTableModel(print, pjtm, pdjtm);
//					pjtm.setPrintQueueDataModel(rawQueue);
//					pdjtm.setPrintedQueueDataModel(rawQueue);
//					listpjtm.add(pjtm);
//					listpdjtm.add(pdjtm);				
//					m_rawQueue.add(rawQueue); 
//					QueueMonitor rawQueueMonitor = new QueueMonitor(print.getQueueName());
//					Thread rawQueueMonitorThread = new Thread(rawQueueMonitor);
//					rawQueueMonitorThread.setName("QueueMonitor -"+print.getQueueName());
//					rawQueueMonitorThread.start();
//					printers.put(print.getA_MachinePrinter_ID(), print);
//				}
//			}
//			catch (Exception e)
//			{
//				e.printStackTrace();
//			}				
//		}
//		return printerlist.size() > 0;
//	}
	
	public List<String> getrawQueue()
	{
		return m_QueueName;
	}
	
	public List<PrintJobTableModel>	getPrint()
	{
		return listpjtm;
	}

	public List<PrintQueue> getQueueList()
	{
		return m_rawQueue;
	}
	public List<PrintedJobTableModel> getPrinted()
	{
		return listpdjtm; 
	}
	public X_A_Machine getMachine()
	{
		String where = "mac_address = ?";		
		X_A_Machine machine = new Query(Env.getCtx(), X_A_Machine.Table_Name, where, null)
		.setParameters(Util.getLocalMacAddress()).first();		
		return machine; 
	}
}
