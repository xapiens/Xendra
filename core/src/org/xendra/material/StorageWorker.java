package org.xendra.material;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.persistence.X_A_Machine;
import org.xendra.Constants;

public class StorageWorker implements Serializable, Cloneable {
	public static final String NotReserved = "NotReserved";
	Properties props = new Properties();
	private String command = "command";
//	private Integer M_Product_ID;
//	private Integer M_AttributeSetInstance_ID;
//	private Integer M_Locator_ID;
//	private Integer M_Warehouse_ID;
	private X_A_Machine machine;
	private boolean m_IsConnect = false;
	private String HostName;
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
//	public Integer getM_Product_ID() {
//		return M_Product_ID;
//	}
//	public void setM_Product_ID(Integer m_Product_ID) {
//		M_Product_ID = m_Product_ID;
//	}
//	public Integer getM_AttributeSetInstance_ID() {
//		return M_AttributeSetInstance_ID;
//	}
//	public void setM_AttributeSetInstance_ID(Integer m_AttributeSetInstance_ID) {
//		M_AttributeSetInstance_ID = m_AttributeSetInstance_ID;
//	}
//	public Integer getM_Locator_ID() {
//		return M_Locator_ID;
//	}
//	public void setM_Locator_ID(Integer m_Locator_ID) {
//		M_Locator_ID = m_Locator_ID;
//	}	
//	public Integer getM_Warehouse_ID() {
//		return M_Warehouse_ID;
//	}
//	public void setM_Warehouse_ID(Integer m_Warehouse_ID) {
//		M_Warehouse_ID = m_Warehouse_ID;
//	}
	public X_A_Machine getMachine() {
		return machine;
	}
	public void setMachine(X_A_Machine machine) {
		this.machine = machine;
	}
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostName) {
		HostName = hostName;
	}
	public String Pull(String job) {
		String error = "";
		try {
			if (machine == null)
				throw new Exception("Material Server is not ready");
			if (!m_IsConnect )
			{
				error = connect();					
			}				
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(machine.getName(), Constants.materialport), 1000);															
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			setCommand(job);
			oos.writeObject(this);
			int value = in.read();
			while (value != -1)
			{
				char c = (char)value;
				error += String.valueOf(c);
				value = in.read();
			}			
			in.close();
			oos.close();
		}
		catch (Exception e)
		{
			error = e.getMessage();
		}
		return error;
	}		
	public String connect() {		
		//errorqueue = "";
		String error = execute(StockWorker.IsAlive);
		if (error.length() == 0)
			m_IsConnect = true;
		return error;
	}
	public String execute(String command) {
		String msg = "";
		try 
		{
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(machine.getName(),Constants.materialport), 1000);				
			setHostName(machine.getName());
			setCommand(command);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(this);
			int value = in.read();
			while (value != -1)
			{
				 char c = (char)value;
				 msg += String.valueOf(c);
				 value = in.read();
			}
			in.close();
			oos.close();																		            	
		}
		catch (Exception e)
		{				
			msg = "MAC Address "+machine.getMac_Address()+" Test Print Server -"+machine.getName()+"/"+e.getMessage();				
		}
		return msg;		
	}	
}
