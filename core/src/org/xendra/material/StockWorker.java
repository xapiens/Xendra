package org.xendra.material;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.compiere.model.persistence.X_A_Machine;
import org.xendra.Constants;
import org.xendra.printdocument.ControlFile;
import org.xendra.printdocument.DataFile;
import org.xendra.printdocument.PrintJob;

public class StockWorker implements Serializable, Cloneable {

	Properties props = new Properties();
	public static final String Product = "Product";
	public static final String Document = "Document";
	public static final String Goals = "goals";
	public static final String Status = "status";
	public static final String UpdateStorage = "updatestorage";
	public static final String NotReserved = "NotReserved";
	public static final String IsAlive = "isAlive";
	//public static final String EndOfPeriod = "EndofPeriod";
	public static final String CheckSignature = "CheckSignature";
	private String command = "command";
	private X_A_Machine machine;
	//private boolean m_IsConnect = false;
	//private String HostName;	


	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	//	public int getM_Product_ID() {		
	//		return M_Product_ID;
	//	}	
	//	public void setM_Product_ID(Integer M_Product_ID) {
	//		this.M_Product_ID = M_Product_ID;	
	//	}
	//	public void setM_AttributeSetInstance_ID(Integer M_AttributeSetInstance_ID) {
	//		this.M_AttributeSetInstance_ID = M_AttributeSetInstance_ID;		
	//	}
	//	public int getM_AttributeSetInstance_ID() {
	//		return M_AttributeSetInstance_ID;
	//	}	
	//	public void LastCosted(Timestamp LastCosted) {
	//		this.LastCosted = LastCosted;		
	//	}
	public void setMachine(X_A_Machine machine) {
		this.machine = machine;		
	}
	public String Pull()
	{			
		String error = "";
		try {
			if (machine == null)
				throw new Exception("Material Server is not ready");
//			if (!m_IsConnect )
//			{
//				error = connect();					
//			}				
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(machine.getName(), Constants.materialport), 1000);															
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//			setCommand(job);
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
			error = String.format("%s %s",machine.getName(), e.getMessage());
		}
		return error;
	}

//	public String connect() {		
//		//errorqueue = "";
//		String error = execute(StockWorker.IsAlive);
//		if (error.length() == 0)
//			m_IsConnect = true;
//		return error;
//	}
//	public String execute(String command) {
//		String msg = "";
//		try 
//		{
//			Socket socket = new Socket();
//			socket.connect(new InetSocketAddress(machine.getName(),Constants.materialport), 1000);				
//			setHostName(machine.getName());
//			setCommand(command);
//			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
//			oos.writeObject(this);
//			int value = in.read();
//			while (value != -1)
//			{
//				char c = (char)value;
//				msg += String.valueOf(c);
//				value = in.read();
//			}
//			in.close();
//			oos.close();																		            	
//		}
//		catch (Exception e)
//		{				
//			msg = "MAC Address "+machine.getMac_Address()+" Test Print Server -"+machine.getName()+"/"+e.getMessage();				
//		}
//		return msg;		
//	}
//	public String getHostName() {
//		return HostName;
//	}
//	public void setHostName(String hostname)
//	{
//		HostName = hostname;
//	}	
	public Object clone() {
		final String METHOD_NAME = "clone()";
		StockWorker result = null;
		try {
			result = (StockWorker)super.clone();
		} catch(CloneNotSupportedException e) {
			throw new InternalError(METHOD_NAME + e.getMessage());
		}
		return result;
	}

	public List<Integer> getListProperty(String PropertyName)
	{
		List<Integer> list = null;
		Object value = props.get(PropertyName);
		if (value instanceof Integer)
		{
			Integer propval = (Integer) props.get(PropertyName);
			list = new ArrayList<Integer>();
			list.add(propval);
		}
		else if (value instanceof List)
		{	
			list = (List<Integer>) props.get(PropertyName);
		}
		return list;
	}
		
	public Integer getIntProperty(String PropertyName)
	{
		Integer intvalue = 0;
		Object value = props.get(PropertyName);
		if (value instanceof Integer)
		{
			intvalue = (Integer) value;
		}
		else if (value instanceof String)
		{
			intvalue = Integer.valueOf((String) value);
		}
		return intvalue;
	}
	
	public String getStringProperty(String PropertyName) {
		String result = "";
		Object value = props.get(PropertyName);
		if (value instanceof String)
			result = (String) value;
		return result;
	}	
	
	public Boolean getBooleanProperty(String name) {
		Boolean result = false;
		Object value = props.get(name);
		if (value instanceof Boolean)
			result = (Boolean) value;
		return result;
	}
	
	public void addProperty(String name, Object value) {
		props.put(name, value);		
	}	

	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("StockWriter=")
			.append(getCommand());
		Iterator it = props.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry map = (Map.Entry) it.next();
			sb.append(String.format("%s=%s", map.getKey(), map.getValue()));
		}
		return sb.toString ();
	}	//	toString
}