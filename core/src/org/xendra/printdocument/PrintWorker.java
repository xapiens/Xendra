package org.xendra.printdocument;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_C_PrinterDocumentFormat;
import org.compiere.util.Env;
import org.xendra.xendrian.FormatMessage;

public class PrintWorker implements Serializable {
	private static final long serialVersionUID = 3557312904264004437L;
	public static final String PrintJob = "PrintJob";
	public static final String ReceiveJob = "ReceiveJob";
	public static final String ReportQueueStateShort = "ReportQueueStateShort";
	public static final String ReportQueueStateLong = "ReportQueueStateLong";
	public static final String RemovePrintJob = "RemovePrintJob";
	public static final String IsAlive = "isAlive";
	public static final String getQueues = "getQueues";
	private Integer C_PrinterDocumentFormat_ID = 0;
	private Integer NumberLines = 0;
	private String command = "command";
	private Hashtable props = new Hashtable();	
	private List<Vector> propsline = new ArrayList<Vector>();
	private List<String> queues = new ArrayList<String>();
	private String QueueName = "";
	private int count = 1;
	private String HostName;
	private Integer NumberCopy = 1;
	private String m_type;
	private byte[] content;
	private Boolean m_persist = false;
	private X_A_Machine machine;
	private String Name = "printer job";
	private boolean m_IsConnect = false;

	public String getJobName() {
		return Name;
	}

	public void setJobName(String name) {
		Name = name;
	}

	public PrintWorker() {
		
	}

	public PrintWorker(X_A_Machine ps) {
		setPrintServer(ps);
	}

	public void setPrintServer(X_A_Machine ps) {
		machine = ps; 
	}
	
	public String Print(String job)
	{
		String error = "";
		if (!m_IsConnect )
		{
			error = connect();
		}
		if (error.length() == 0)
		{
			try {
				if (this.getPrinterDocumentFormat_ID() == 0)
					throw new Exception("no hay print document format");

				Socket socket = new Socket();
				socket.connect(new InetSocketAddress(machine.getName(), PrintConstants.port), 1000);															
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				String controlfile = 
						new String("C1\n"+
								"J"+getJobName()+"\n"+
								"LUser\n"+
								"Muser\n"+
								"N"+Name+"\n"+
								"PName\n"+
								"Ttitle\n"+
								"H"+machine.getName()+"\n");
				byte[] bytes = controlfile.getBytes();
				setCommand(job);
				setContents(bytes);
				setType("PRINT");													
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
		}
		return error;
	}

	public void AddProperty(String name, Object value)
	{
		if (!props.containsKey(name))
		{
			if (value == null)
				props.put(name, "");
			else
				props.put(name, value);			
		}
	}	

	public Hashtable getProperty()
	{
		return props;
	}

	public void AddPropertyLine(String name, Object value)
	{
		boolean found = false;
		for (Vector pname:propsline)
		{
			if (pname.firstElement().equals(name))
			{
				pname.add(value);		
				found = true;
				break;
			}
		}
		if (!found)
		{
			Vector elem = new Vector();
			elem.add(name);
			elem.add(value);
			propsline.add(elem);			
		}
	}

	public List<Vector> getPropertyLines()
	{
		return propsline;
	}
	
	public Integer getPrinterDocumentFormat_ID() {
		return C_PrinterDocumentFormat_ID;
	}

	public String setPrinterDocumentFormat_ID(Integer format) {		
		String errordocformat = "";
		X_C_PrinterDocumentFormat pdf = new Query(Env.getCtx(), X_C_PrinterDocumentFormat.Table_Name,"C_PrinterDocumentFormat_ID = ?", null)
		.setParameters(format).first();		
		if (pdf != null)
		{
			if (pdf.getFormat() == null)
				errordocformat = "la definicion de formato es nula";
			else if (pdf.getFormat().length() == 0)
				errordocformat = "la definicion de formato esta vacia";
			else 
				C_PrinterDocumentFormat_ID = format;
		}		
		else
			errordocformat = "no existe la definicion de formato";
		return errordocformat;
	}
	
	public Integer getNumberLines() {
		return NumberLines;
	}

	public void setNumberLines(Integer numberLines) {
		NumberLines = numberLines;
	}	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getQueueName() {
		return QueueName;
	}
	public void setQueueName(String name) {
		QueueName = name;		
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count)
	{
		this.count = count;
	}
	public String getHostName() {
		return HostName;
	}
	public void setHostName(String hostname)
	{
		HostName = hostname;
	}
	public Integer getNumberCopy() {
		return NumberCopy;
	}
	public void setNumberCopy(Integer a) {
		NumberCopy = a;
	}
	public void setContents(byte[] bytes) {
		content = bytes;
	}
	public byte[] getContent() {
		return content;
	}
	public void setType(String type)
	{
		m_type = type;
	}
	public String getType() {
		return m_type;
	}
	public void persist(boolean persist) {
		m_persist = persist;		
	}
	public boolean isPersist()
	{
		return m_persist;
	}
	public String connect() {		
		//errorqueue = "";
		String error = execute(PrintWorker.IsAlive);
		if (error.length() == 0)
		{
			queues.clear();
			String[] lqueues = execute(PrintWorker.getQueues).split(",");			
			for (String q:lqueues)
				queues.add(q);
			
			if (QueueName.isEmpty())
			{
				if (this.queues.size() == 1)
				{
					QueueName = queues.get(0);
					m_IsConnect = true;
				}
				else
					error  += "el servidor de impresion tiene mas de una cola, no es posible dejar de especificar una cola";
			}
			else
			{
				if (!queues.contains(QueueName))
					error += "la cola especificada no existe en el servidor de impresion";
				else
					m_IsConnect = true;
			}								
		}		
		return error;
	}
	public String execute(String command) {
		String msg = "";
		try 
		{
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress(machine.getName(),PrintConstants.port), 1000);				
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
	public void setAttribute(FormatMessage s, String group, String id) {
		AddProperty(id, s.getProperty(group, id));		
	}
	public void setAttribute(FormatMessage s, String group, String id, boolean getName) {
		AddProperty(id, s.getProperty(group, id, true));
	}
	public void setAttributeLine(FormatMessage s, String group, String id) {
		AddPropertyLine(id, s.getProperty(group, id));
	}
	public void setAttributeLine(FormatMessage s, String group, String id, boolean getName) {
		AddPropertyLine(id, s.getProperty(group, id, getName));
	}
}
