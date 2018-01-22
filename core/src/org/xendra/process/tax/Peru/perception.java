package org.xendra.process.tax.Peru;

import java.sql.Timestamp;
import java.util.logging.Level;

import org.compiere.model.MBOE;
import org.compiere.model.MInvoice;
import org.compiere.process.DocAction;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;

public class perception extends SvrProcess {

	private Timestamp p_Date_From = null;
	private Timestamp p_Date_To = null;
	private String p_Destination = "";
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
		
			if (name.equals("DateFrom")) {
				p_Date_From = (Timestamp)para[i].getParameter();
				p_Date_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("Destination")) {
				p_Destination = (String) para[i].getParameter();
			}
		}		
	}
	
	protected String doIt () throws Exception
	{
		// " copy (select * from perception where date(field9) between date('01-07-2013') and date('31-07-2013'))
		// TO '/opt/PostgreSQL/9.2/sampl.txt' WITH DELIMITER AS '|' "
		//
		return null;
	}
	
}
