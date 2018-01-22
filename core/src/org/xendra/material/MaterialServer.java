package org.xendra.material;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

import org.compiere.util.CLogger;
import org.xendra.Constants;
import org.xendra.common.Lock;

public class MaterialServer implements Runnable {
	private static MaterialServer INSTANCE = null;
	private static Lock mslock = new Lock("ms");	
	private static CLogger 	log = CLogger.getCLogger(MaterialServer.class);

	@Override
	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(Constants.materialport);			
			while(true) {
				Socket connection = serverSocket.accept();
				Runnable connectionHandler = new ConnectionHandler(connection);
				new Thread(connectionHandler).start();
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
	
	/**
	 * This class is a singleton.  
	 * @param printserver 
	 * @return the only instance of LPD.
	 */
	public static MaterialServer getInstance() {
		synchronized(mslock) {
			if (INSTANCE == null)
			{
				log.log(Level.WARNING, "starting Material Server");
				INSTANCE = new MaterialServer(); 
				Thread thread = new Thread(INSTANCE);
				thread.setName("MaterialServer");
				thread.start();											
			}
		}
		return INSTANCE;
	}	
}