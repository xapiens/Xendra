package org.xendra.process;

import java.util.logging.Level;

import org.compiere.model.MClient;
import org.compiere.model.MCostElement;
import org.compiere.model.MCurrency;
import org.compiere.model.MDocType;
import org.compiere.model.MInvoice;
import org.compiere.model.MJournal;
import org.compiere.model.MJournalBatch;
import org.compiere.model.MJournalLine;
import org.compiere.model.MPeriod;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.cost.CostAverageCalc;
import org.xendra.cost.ICostCalcMethod;

public class ReferencesUpdate extends SvrProcess {
	private int M_Product_ID;
	/** Last Summary */
	private StringBuffer m_summary = new StringBuffer();


	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("M_Product_ID"))
				M_Product_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}

	@Override
	protected String doIt() throws Exception {

		String sql = "update c_invoiceline il" +
		"set c_orderline_id = ml.c_orderline_id" +
		"from m_inoutline ml, c_invoice i" +
		"where il.m_inoutline_id = ml.m_inoutline_id" +
		"and i.c_invoice_id = il.c_invoice_id" +
		"and i.issotrx = 'Y'" +
		"and ml.isinvoiced = 'N'" +
		"and i.docstatus = 'CO'";
		
		int no = DB.executeUpdate(sql, null);
			
		sql = "update m_inoutline ml" +
		"set isinvoiced = 'Y'" +
		"from c_invoiceline il, c_invoice i" +
		"where il.m_inoutline_id = ml.m_inoutline_id" +
		"and i.c_invoice_id = il.c_invoice_id" +
		"and i.issotrx = 'Y'" +
		"and ml.isinvoiced = 'N'" +
		"and i.docstatus = 'CO'";
		
		no = DB.executeUpdate(sql, null);
		
		sql = "update c_orderline ol"+
		"set qtydelivered = (select sum(ml.movementqty)"+
		"from m_inoutline ml, m_inout m, c_orderline ol, c_order o"+
		"where ml.c_orderline_id = ol.c_orderline_id"+
		"and ol.c_order_id = o.c_order_id"+
		"and m.m_inout_id = ml.m_inout_id"+
		"and m.docstatus = 'CO'"+
		"and o.docstatus = 'CO'"+
		"and o.issotrx = 'Y'"+
		"and m.issotrx = 'Y')"+
		"from m_inoutline ml, c_order o, m_inout m"+
		"where ml.m_inoutline_id = ol.c_orderline_id"+
		"and o.c_order_id = ol.c_order_id"+
		"and m.m_inout_id = ml.m_inout_id"+
		"and m.docstatus = 'CO'"+
		"and o.docstatus = 'CO'"+
		"and o.issotrx = 'Y'"+
		"and m.issotrx = 'Y'";
		
		no = DB.executeUpdate(sql, null);
		
		sql = "update c_orderline ol" +
		"set qtyinvoiced = (select sum(il.qtyinvoiced)" +
		"from c_invoiceline il, c_invoice i, c_orderline ol, c_order o" +
		"where il.c_orderline_id = ol.c_orderline_id" +
		"and ol.c_order_id = o.c_order_id" +
		"and i.c_invoice_id = il.c_invoice_id" +
		"and i.docstatus = 'CO'" +
		"and o.docstatus = 'CO'" +
		"and o.issotrx = 'Y'" +
		"and i.issotrx = 'Y')" +
		"from c_invoiceline il, c_order o, c_invoice i" +
		"where il.c_orderline_id = ol.c_orderline_id" +
		"and o.c_order_id = ol.c_order_id" +
		"and i.c_invoice_id = il.c_invoice_id" +
		"and i.docstatus = 'CO'" +
		"and o.docstatus = 'CO'" +
		"and o.issotrx = 'Y'" +
		"and i.issotrx = 'Y'";
		
		no = DB.executeUpdate(sql, null);
		
		sql = "update c_orderline ol"+
		"set qtyreserved = qtyordered - qtydelivered"+
		"from c_order o"+
		"where o.c_order_id = ol.c_order_id"+
		"and o.docstatus = 'CO'"+
		"and o.issotrx = 'Y'";
		
		no = DB.executeUpdate(sql, null);

		return null;
	}

}
