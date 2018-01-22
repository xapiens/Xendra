package org.xendra.printdocument;

import java.io.OutputStream;
import java.sql.ResultSet;
import java.util.Enumeration;

import org.compiere.model.persistence.X_A_PrinterDriver;
import org.compiere.model.persistence.X_C_PrinterDocumentPool;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.Constants;

import com.Verisign.payment.e;

public class CommandReceiveJob extends CommandHandler {

	protected CommandReceiveJob(PrintWorker i, OutputStream o) {
		super(i, o);		
	}

	public void execute() throws Exception {
		String error = "";
		final String METHOD_NAME = "execute(): ";				
		if(Util.isEmpty(pw.getQueueName())) {
			//throw new Exception(METHOD_NAME + "queueName passed in was empty for command=" + new String(is.getCommand()));
			error = "la cola asignada al servidor de impresion "+pw.getHostName()+" esta vacio";
		} 
		try {
			byte[] b = error.getBytes();
			os.write(b);				
			if (error.length() == 0)
			{
				//os.write(Constants.ACK); // write ACK to client
				// al recibir el trabajo de impresion, basado en el nombre de la cola obtenemos la referencia a la machineprinter
				// que contendra la ruta y el driver de impresora anexado a la cola (queue).
				PrintJob job = receivePrintJob(pw, os, Queues.getInstance().getDeviceName(pw.getQueueName()));
				Queues.getInstance().addPrintJob(pw.getQueueName(), job);
			}
		} catch(Exception e) {
			error = e.getMessage();
			byte[] b = error.getBytes();
			os.write(b);							
			e.printStackTrace();
		}
	}

	/**
	 * Does the work of receiving the print job.
	 * @param is
	 * @param os
	 * @return
	 * @throws LPDException
	 */
	private PrintJob receivePrintJob(PrintWorker is, OutputStream os, int A_MachinePrinter_ID) 
		throws Exception
	{
		PrintJob printJob = null;
		ControlFile controlFile = null;
		DataFile dataFile = null;	
		try
		{
			if (is.isPersist())
				save(is);
			controlFile = setControlFile(is,os,A_MachinePrinter_ID);
			dataFile = setDataFile(is,os);
		} catch(Exception ex) {
			ex.printStackTrace();
		}	
		if(null != controlFile && null != dataFile) {
			printJob = new PrintJob(controlFile, dataFile); 
		}
		return printJob;
	}

	private void save(PrintWorker is) {
		X_C_PrinterDocumentPool pdp = new X_C_PrinterDocumentPool(Env.getCtx(), 0, null);
		pdp.setQueueName(is.getQueueName());
		StringBuilder test = new StringBuilder();
		Enumeration en = is.getProperty().keys();
		while (en.hasMoreElements() )	
		{
			try 
			{					
				if (test.length() > 0)
					test.append(",");
				Object obj = en.nextElement();
				test.append((String) obj);		
				test.append("=>");
				Object value = is.getProperty().get(obj);
				test.append('"');
				test.append(value);
				test.append('"');
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		pdp.setEnvironment(test.toString());					
		pdp.setC_PrinterDocumentFormat_ID(is.getPrinterDocumentFormat_ID());
		pdp.save();							
	}

	private DataFile setDataFile(PrintWorker is, OutputStream os) {
		DataFile dataFile = new DataFile();
		dataFile.setHostName(is.getHostName());
		dataFile.setJobNumber("1");
		dataFile.setNumberCopy(is.getCount());
		dataFile.setContents(is);		
		return dataFile;
	}

	//private ControlFile setControlFile(PrintWorker is, OutputStream os, String devicename) {
	private ControlFile setControlFile(PrintWorker is, OutputStream os, int A_MachinePrinter_ID) {
		ControlFile controlFile = null;
		try {
			controlFile = new ControlFile();
			controlFile.setCount(String.valueOf(is.getCount()));
			controlFile.setJobNumber("1");
			controlFile.setHostName(is.getHostName());
			controlFile.setNumberCopy(is.getNumberCopy());
			controlFile.setType(is.getType());
			controlFile.setControlFileCommands(is.getContent());
			controlFile.setC_PrinterDocumentFormat_ID(is.getPrinterDocumentFormat_ID());
			controlFile.setA_MachinePrinter_ID(A_MachinePrinter_ID);
			controlFile.setNumberLines(is.getNumberLines());
			//controlFile.setDevicename(devicename);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		return controlFile;
	}
}
