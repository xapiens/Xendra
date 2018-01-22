package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_BPartnerWSOToInvoice implements ValRule 
{
 	@XendraValRule(Name="C_BPartner w SO to invoice",
		AD_Val_Rule_ID=135,
		Description="BPartners with invoices to be invoiced",
		Type="S",
		EntityType="D",
		Identifier="dfe21b17-ad57-8f56-fdff-d3dbbe690d7e",
		Synchronized="2012-09-19 17:23:37.0")
	public static final String Identifier = "dfe21b17-ad57-8f56-fdff-d3dbbe690d7e";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("C_BPartner.IsSummary='N'  AND EXISTS (SELECT * FROM C_Order o INNER JOIN C_OrderLine l ON (o.C_Order_ID=l.C_Order_ID)");
	sb.append("WHERE C_BPartner.C_BPartner_ID=o.C_BPartner_ID AND o.DocStatus NOT IN ('DR','IP') AND l.QtyOrdered <> l.QtyInvoiced AND o.IsSOTrx='Y')");
	return sb.toString();
}
}
