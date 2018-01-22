package org.xendra.process;

import org.compiere.model.MInvoice;
import org.compiere.model.reference.REF__DocumentStatus;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.*;

import java.util.logging.*;

import org.xendra.annotations.*;

@XendraProcess(value="InvoiceDelete",
name="Delete Invoice",
description="",
help="",
Identifier="577f59e1-6356-42ee-ebc5-16b8902ee708",
classname="org.xendra.process.InvoiceDelete",
updated="2015-06-20 10:10:12")	
public class InvoiceDelete extends SvrProcess {
	@XendraProcessParameter(Name="Invoice",
			                ColumnName="C_Invoice_ID",
			                Description="Invoice Identifier",
			                Help="The Invoice Document.",
			                AD_Reference_ID=DisplayType.Search,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=10,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="a97add6d-1167-ac81-4f00-654a797e87e2")
	private int m_C_Invoice_ID;

	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Invoice_ID"))
				m_C_Invoice_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}
	protected String doIt () throws Exception
	{
		MInvoice invoice = new MInvoice(getCtx(), m_C_Invoice_ID, get_TrxName());
		if (!invoice.getDocStatus().equals(REF__DocumentStatus.Drafted)) {
			return "@Error@: Must be drafted first";
		}
		
		invoice.setC_Order_ID(0);
		if (!invoice.save()) {
			return "@Error@: Could not save invoice";
		}
		
		if (!invoice.delete(true)) {
			return "@Error@: Could not delete invoice";
		}
		return null;
	}
	
}
