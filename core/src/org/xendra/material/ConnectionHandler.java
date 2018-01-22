package org.xendra.material;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ConnectionHandler implements Runnable {

	private Socket m_connection;

	public ConnectionHandler(Socket connection) {
		m_connection = connection;
	}

	@Override
	public void run() {
		try {
			StockCommands lpdCommands = new StockCommands();
			StorageCommands storagecommands = new StorageCommands();		
			OutputStream os = null;
			ObjectInputStream ois = null;
			ByteArrayOutputStream baos = null;
			try {
				ois = new ObjectInputStream(m_connection.getInputStream());
				Object printwork = ois.readObject();					
				if (printwork instanceof StockWorker)
				{
					StockWorker obj = (StockWorker) printwork;
					os = m_connection.getOutputStream();
					lpdCommands.handleCommand(obj, os);						
				}
				else if (printwork instanceof StorageWorker)
				{
					StorageWorker obj = (StorageWorker) printwork;
					os = m_connection.getOutputStream();
					storagecommands.handleCommand(obj, os);
				}
				else if (printwork instanceof StatusWorker)
				{
					StatusWorker obj = (StatusWorker) printwork;
					//os = m_connection.getOutputStream();					
					ObjectOutputStream oos = new ObjectOutputStream(m_connection.getOutputStream());
					//CommandStatus result = new CommandStatus(obj, os);
					CommandStatus result = new CommandStatus(obj, oos);
					result.execute();
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if (os != null)
					os.close();
				if (ois != null)					
					ois.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
		}				
	}

}
