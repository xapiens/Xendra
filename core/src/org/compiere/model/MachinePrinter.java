package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_A_MachinePrinter;
import org.compiere.util.Env;


public class MachinePrinter extends X_A_MachinePrinter {

	public MachinePrinter(Properties ctx, int A_MachinePrinter_ID,	String trxName) {
		super(ctx, A_MachinePrinter_ID, trxName);
	}

	public MachinePrinter(Properties ctx, ResultSet rs,	String trxName) {
		super(ctx, rs, trxName);
	}

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer ("Printer[");
		X_A_Machine machine = new X_A_Machine(Env.getCtx(), this.getA_Machine_ID(), get_TrxName());
		sb.append (machine.getName()).append ("-").append (getQueueName()).append ("]");
		return sb.toString ();
	}	//	toString
}
