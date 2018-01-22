package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Resetcostproduct0 
{
 
@XendraFunction(Name="resetcostproduct",Output="void",Owner="xendra",Language="plpgsql",
Identifier="23aed749-fbce-ee72-9d72-51b9d1187813",
Arguments="p_period_from numeric, p_periodto numeric, p_ad_client_id numeric, p_product_id numeric",
Extension="",Synchronized="2017-06-26 20:41:28.0")
	public static final String Identifier = "23aed749-fbce-ee72-9d72-51b9d1187813";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln(" ar record;");
	sb.appendln("BEGIN    ");
	sb.appendln("	WITH periods as (SELECT C_Period_ID FROM C_PERIOD ");
	sb.appendln("		WHERE C_PERIOD_ID >= p_period_from AND C_PERIOD_ID <= p_periodTo ");
	sb.appendln("		AND AD_Client_ID = p_AD_Client_ID)");
	sb.appendln("	UPDATE M_TRANSACTION SET PROCESSED = 'N' from periods ");
	sb.appendln("		WHERE M_PRODUCT_ID = p_product_id AND m_transaction.c_period_id in (periods.c_period_id);");
	sb.appendln("	WITH periods as (SELECT C_Period_ID FROM C_PERIOD ");
	sb.appendln("		WHERE C_PERIOD_ID >= p_period_from AND C_PERIOD_ID <= p_periodTo ");
	sb.appendln("		AND AD_Client_ID = p_AD_Client_ID)		");
	sb.appendln("	DELETE FROM M_CostCalc USING PERIODS WHERE M_PRODUCT_ID = p_product_id ");
	sb.appendln("		AND M_CostCalc.c_period_id in (periods.c_period_id);");
	sb.appendln("	WITH periods as (SELECT C_Period_ID FROM C_PERIOD ");
	sb.appendln("		WHERE C_PERIOD_ID >= p_period_from AND C_PERIOD_ID <= p_periodTo ");
	sb.appendln("		AND AD_Client_ID = p_AD_Client_ID)		");
	sb.appendln("	DELETE FROM M_StorageMonthly USING PERIODS WHERE M_PRODUCT_ID = p_product_id ");
	sb.appendln("		AND M_StorageMonthly.c_period_id in (periods.c_period_id);");
	sb.appendln("	WITH periods as (SELECT C_Period_ID FROM C_PERIOD ");
	sb.appendln("		WHERE C_PERIOD_ID >= p_period_from AND C_PERIOD_ID <= p_periodTo ");
	sb.appendln("		AND AD_Client_ID = p_AD_Client_ID)		");
	sb.appendln("	DELETE FROM M_Product_Costing USING PERIODS WHERE M_PRODUCT_ID = p_product_id ");
	sb.appendln("		AND M_Product_Costing.c_period_id in (periods.c_period_id);	");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-06-26 20:41:28.0");
	sb.appendln("@Identifier=23aed749-fbce-ee72-9d72-51b9d1187813");
	return sb.toString();
}
}
