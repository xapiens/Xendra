package org.xendra.material;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
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

import javax.swing.JTable;

import org.compiere.model.persistence.X_A_Machine;
import org.xendra.Constants;
import org.xendra.printdocument.ControlFile;
import org.xendra.printdocument.DataFile;
import org.xendra.printdocument.PrintJob;

public class StatusWorker extends Thread implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7325320161677084599L;
	Properties props = new Properties();
	private X_A_Machine machine;
	//private mymodel m_model;
	private JTable m_table;
	boolean goahead = true;
	
	public void setMachine(X_A_Machine machine) {
		this.machine = machine;		
	}
//	public String Pull()
//	{			
//		//return error;
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
	
	public void addProperty(String name, Object value) {
		props.put(name, value);		
	}	

	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("StatusWorker=");
			//.append(getCommand());
		Iterator it = props.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry map = (Map.Entry) it.next();
			sb.append(String.format("%s=%s", map.getKey(), map.getValue()));
		}
		return sb.toString ();
	}	//	toString
	
	public void settable(JTable table) {
		m_table = table;
	}
//	public void setmodel(mymodel model) {
//		m_model = model;		
//	}
	@Override
	public void run() {
		String error = "";
		try {
			if (machine == null)
				throw new Exception("Material Server is not ready");
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(machine.getName(), Constants.materialport), 1000);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(this);
			ObjectInputStream iis = new ObjectInputStream(socket.getInputStream());
			Object mem = iis.readObject();			
			while (goahead)
			{
				if (mem instanceof CostMap)
				{
					
					((mymodel) m_table.getModel()).setHeaders(CostMap.getHeaders());
					((mymodel) m_table.getModel()).setdata(CostMap.getData());
				}
			}
			iis.close();
			oos.close();							
		}
		catch (Exception e)
		{			
			List<String> errorheader = new ArrayList<String>();
			errorheader.add("no conexion");
			mymodel xcxx = (mymodel) m_table.getModel();
			xcxx.setHeaders(errorheader);			
			m_table.setModel(xcxx);			
			m_table.validate();
			error = e.getMessage();			
		}		
	}
}