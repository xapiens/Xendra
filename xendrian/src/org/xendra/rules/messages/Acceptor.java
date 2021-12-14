package org.xendra.rules.messages;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.compiere.server.XendraServer;
import org.compiere.util.Env;

public class Acceptor extends Thread {	
//	private ArrayList<XendraServer>	m_servers = new ArrayList<XendraServer>();
//	private MXendrianProcessor[] acctModels;
//	public void run() {    	
//		org.compiere.Xendra.startup(false);
//		try {
//			if (buildAcceptors())		
//			{
//				bootstrap();				
//			}
//			else
//			{
//				System.out.println("no se encontro acceptors para este equipo");
//			}
//			while (!Thread.currentThread().isInterrupted()) {
//			    try {
//			    	// doWork();
//			        sleep(1000);
//			    } catch (InterruptedException ex) {
//			        Thread.currentThread().interrupt();
//			    }
//			}			
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//
//	private boolean buildAcceptors() {
//		acctModels = MXendrianProcessor.getActive(Env.getCtx());
//		if (acctModels != null)
//			System.out.println("encontrado "+acctModels.length+" acceptors");
//		else 
//			System.out.println("no se encontro ningun acceptor");
//		return acctModels != null && acctModels.length > 0;		
//	}
//
//	private void bootstrap() {
//    	
//		for (int i = 0; i < acctModels.length; i++)
//		{
//			MXendrianProcessor pModel = acctModels[i];
//			System.out.println("loading acceptor processor "+pModel.getName());
//			XendraServer server = new XendrianProcessor(pModel);
//			server.start();
//			server.setPriority(Thread.NORM_PRIORITY-2);
//			m_servers.add(server);
//		}		    			
//	}
//	public static void main(String args[]) {
//        (new Acceptor()).start();
//    }
}
