package org.xendra.printdocument;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.*;

import org.apache.log4j.Logger;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Msg;

/**
 *  como PrintJobTableModel pero solo para documentos impresos.
 */
public class PrintedJobTableModel extends AbstractTableModel {
	static Logger log = Logger.getLogger(PrintedJobTableModel.class);
 
    private PrintQueue printQueue;
    private String[] headers = {Msg.translate(Env.getCtx(), "JobName"), 
    							Msg.translate(Env.getCtx(), "JobNumber"), 
    							Msg.translate(Env.getCtx(), "Date"),
    							Msg.translate(Env.getCtx(), "Owner")};

    private SimpleDateFormat format = DisplayType.getDateFormat(DisplayType.Date);	

    // Default Construtor.          
    public PrintedJobTableModel() {
		super();
    }
    
    /**
     * This method must be called prior to using this DataModel.
     * The data for our Model is really stored in a {@link PrintQueue}.
     * @param pq the PrintQueue that holds our real printJob data.
     */
    public void setPrintedQueueDataModel(PrintQueue pq) {
    	printQueue = pq;
    }
  
	public int getRowCount() {
		System.out.println(printQueue.listPrintedJobs().size());
		return printQueue.listPrintedJobs().size();
	}
	
	public int getColumnCount() {
		return headers.length;
	}
	
	public String getColumnName(int column) {
		String result = new String();
		if(column >= 0 && column < getColumnCount()) {
			result = headers[column];
		}
		return result;
	}
	
	public Object getValueAt(int row, int column) {
		final String METHOD_NAME = "getValueAt(): "; 
		Object result = null;
		List printedJobs = printQueue.listPrintedJobs();
		// error checking
		if(row >= getRowCount()) {
			log.warn(METHOD_NAME + "requested row: " + row + ", only " + getRowCount() + " rows available");
			log.warn(METHOD_NAME + "The PrintJob was removed from the queue before we could show it.");
			//throw new ArrayIndexOutOfBoundsException("requested row: " + row + ", only " + getRowCount() + " rows available");
		} else if(column >= getColumnCount()) {
			log.warn(METHOD_NAME + "The PrintJob was removed from the queue before we could show it.");
			log.warn(METHOD_NAME + "requested column: " + column + ", only " + getColumnCount() + " columns available");
			//throw new ArrayIndexOutOfBoundsException("requested column: " + column + ", only " + getColumnCount() + " columns available");
		} else {
			// get row
			QueuedPrintJobInfo qpji = (QueuedPrintJobInfo) printedJobs.get(row); 
			
			// get column data
			switch(column) {
				case 0: // job name 
					result = qpji.getName();
					break;
				case 1: // print job number 
					result = String.valueOf(qpji.getId());
					break;
				case 2: // date 
					result = format.format(qpji.getTimeStamp());					
					break;
				case 3: // owner 
					result = qpji.getOwner();
					break;
				default:
					throw new ArrayIndexOutOfBoundsException("requested column: " + column + ", only " + getColumnCount() + " columns available");
			}
		}			
		return result;
	}    
}