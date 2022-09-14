package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.persistence.X_S_DocHeader;

public class MDocHeader extends X_S_DocHeader {
	public MDocHeader(Properties ctx, int S_DogLog_ID, String trxName) {
		super(ctx, S_DogLog_ID, trxName);
	}
	
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MDocHeader(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}

	public void setInvoice(MInvoice invoice) {
		set_ValueNoCheck ("AD_Client_ID", invoice.getAD_Client_ID());
		set_ValueNoCheck ("AD_Org_ID", invoice.getAD_Org_ID());
		setC_Invoice_ID(invoice.getC_Invoice_ID());
		setC_BPartner_ID(invoice.getC_BPartner_ID());						
		setInvoiceOperationTypeCode(invoice.getInvoiceOperationTypeCode());					
		setC_BPartner_Location_ID(invoice.getC_BPartner_Location_ID());
		setC_Currency_ID(invoice.getC_Currency_ID());
		setC_DocType_ID(invoice.getC_DocType_ID());
		setDateInvoiced(invoice.getDateInvoiced());
		setGrandTotal(invoice.getGrandTotal());						
		setAdditionalInformation(invoice.getAdditionalInformation());						
		setSerial(invoice.getSerial());		
	}	
}
