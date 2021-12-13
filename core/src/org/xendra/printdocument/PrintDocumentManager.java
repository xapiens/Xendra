package org.xendra.printdocument;

import java.util.HashMap;
import java.util.List;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.util.Env;
import org.compiere.util.Util;

public class PrintDocumentManager {

	private static PrintDocumentManager instance = new PrintDocumentManager();
	
	private PrintDocumentManager()
	{	
		build();
	}
	
	public static PrintDocumentManager getInstance() {
    	return instance;
    }
	private Queues queues;
	private HashMap<Integer, PrintJobTableModel> listpjtm = new HashMap<Integer, PrintJobTableModel>();
	private HashMap<Integer, PrintedJobTableModel> listpdjtm = new HashMap<Integer, PrintedJobTableModel>();
	private HashMap<Integer, String> m_QueueName = new HashMap<Integer, String>();
	private HashMap<Integer, PrintQueue> m_rawQueue = new HashMap<Integer, PrintQueue>();
	private String localhost = Util.getLocalHostName();	
	private Thread lpdThread;	
	private HashMap printers = new HashMap();
	
	public String getLocalHost()
	{
		return localhost;
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
				//size = printerlist.size();
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
						//m_QueueName.add(print.getQueueName());
						m_QueueName.put(print.getA_MachinePrinter_ID(), print.getQueueName());
						//PrintQueue rawQueue = queues.createQueueWithTableModel(print.getQueueName(),print.getDeviceName(), pjtm, pdjtm);
						PrintQueue rawQueue = queues.createQueueWithTableModel(print, pjtm, pdjtm);
						pjtm.setPrintQueueDataModel(rawQueue);
						pdjtm.setPrintedQueueDataModel(rawQueue);
						//listpjtm.add(pjtm);
						listpjtm.put(print.getA_MachinePrinter_ID(), pjtm);
						//listpdjtm.add(pdjtm);
						listpdjtm.put(print.getA_MachinePrinter_ID(), pdjtm);
						//m_rawQueue.add(rawQueue);
						m_rawQueue.put(print.getA_MachinePrinter_ID(), rawQueue);
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
		
	public X_A_MachinePrinter getMachinePrinter(Integer mpid) {
		X_A_MachinePrinter mp = null;
		if (printers.containsKey(mpid)) {
			mp = (X_A_MachinePrinter) printers.get(mpid);
		} 
		return mp;
	}
	
	public HashMap<Integer, String> getrawQueue()
	{
		return m_QueueName;
	}

	public HashMap<Integer, PrintJobTableModel>	getPrint()
	{
		return listpjtm;
	}
	
	public HashMap<Integer, PrintQueue> getQueueList() {
		return m_rawQueue;
	}
	public HashMap getPrinters() {
		return printers;
	}

	public HashMap<Integer, PrintedJobTableModel> getPrinted()
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
