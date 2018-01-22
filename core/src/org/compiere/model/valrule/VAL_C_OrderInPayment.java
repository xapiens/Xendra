package org.compiere.model.valrule;


import org.xendra.annotations.*;
import org.compiere.model.ValRule;

public class VAL_C_OrderInPayment implements ValRule 
{
 	@XendraValRule(Name="C_Order in Payment",
		AD_Val_Rule_ID=218,
		Description="Waiting Payment or Standard Order with ininvoiced lines",
		Type="S",
		EntityType="D",
		Identifier="773fb461-6147-eb1c-65bb-f69991e6cc6c",
		Synchronized="2012-01-17 10:34:00.0")
	public static final String Identifier = "773fb461-6147-eb1c-65bb-f69991e6cc6c";

	public static final String getCode() 
{
 	StringBuilder sb = new StringBuilder();
 	sb.append("(C_Order.DocStatus='WP' OR (C_Order.DocStatus='CO' AND EXISTS (SELECT * FROM C_DocType dt WHERE C_Order.C_DocType_ID=dt.C_DocType_ID AND dt.DocSubType='SO') AND EXISTS (SELECT * FROM C_OrderLine ol WHERE C_Order.C_Order_ID=ol.C_Order_ID AND ol.QtyInvoiced<>ol.QtyOrdered)))");
	return sb.toString();
}
}
