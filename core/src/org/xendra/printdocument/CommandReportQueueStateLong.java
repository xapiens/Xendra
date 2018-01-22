package org.xendra.printdocument;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.simoes.util.StringUtil;
import org.xendra.Constants;

public class CommandReportQueueStateLong extends CommandHandler {
	static Logger log = Logger.getLogger(CommandReportQueueStateLong.class);
	protected CommandReportQueueStateLong(PrintWorker i,	OutputStream o) {
		super(i, o);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() throws Exception {
		final String METHOD_NAME = "execute(): ";
					
			//is.getCommand();
			String queueName = pw.getQueueName(); // parseCommand() should guarantee queue is not null
			try {
				// query queue for state
				List queueudPrintJobInfos = Queues.getInstance().listAllPrintJobs(queueName);
				// create a ASCII representation of the List
				StringBuffer sb = new StringBuffer();
				sb.append(StringUtil.createFixedLengthString("Job Id", Constants.JOB_ID_LENGTH));
				sb.append(StringUtil.createFixedLengthString("Name", Constants.JOB_NAME_LENGTH));
				sb.append(StringUtil.createFixedLengthString("Owner", Constants.JOB_OWNER_LENGTH));
				sb.append(StringUtil.createFixedLengthString("Date", Constants.JOB_DATE_LENGTH));
				sb.append(StringUtil.createFixedLengthString("Size", Constants.JOB_SIZE_LENGTH));
				sb.append("\n");

				Iterator iter = queueudPrintJobInfos.iterator();
				// create ASCII string
				while(iter.hasNext()) {
					QueuedPrintJobInfo queuedPrintJobInfo = (QueuedPrintJobInfo) iter.next();
					sb.append(queuedPrintJobInfo.getLongDescription());
					sb.append("\n");
				}				
					os.write(sb.toString().getBytes());
					os.flush();
					// close os connection (handled in LPDCommands.java)
				
			} catch(Exception e) {
				log.error(METHOD_NAME + e.getMessage());
				throw new Exception(e);
			}
	}
}
