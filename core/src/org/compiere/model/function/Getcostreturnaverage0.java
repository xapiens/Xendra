package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getcostreturnaverage0 
{
 
@XendraFunction(Name="getcostreturnaverage",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="f38a4c1a-53e1-4d14-be83-3d23c3286ba0",
Arguments="client_id numeric, org_id numeric, costelement_id numeric, m_product_id numeric, movementdate timestamp without time zone, alwaysreturnlastcost boolean, inputcost boolean, isreturn boolean, ad_table_id numeric, record_id numeric",
Extension="",Synchronized="2014-05-07 17:53:28.0")
	public static final String Identifier = "f38a4c1a-53e1-4d14-be83-3d23c3286ba0";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln(" DECLARE");
	sb.appendln("  _cost numeric := 0;");
	sb.appendln(" BEGIN");
	sb.appendln(" if inputCost  then");
	sb.appendln("   SELECT xendra.getavgcostforProductInput( Client_ID, ");
	sb.appendln("					    Org_ID, ");
	sb.appendln("					    CostElement_ID, ");
	sb.appendln("					    M_Product_ID, ");
	sb.appendln("					    AD_Table_ID,");
	sb.appendln("					    Record_ID) into _cost;");
	sb.appendln(" else");
	sb.appendln("   SELECT xendra.getAverageCost(Client_ID, Org_ID, CostElement_ID, M_Product_ID, MovementDate, alwaysreturnLastCost) ");
	sb.appendln("   into _cost;");
	sb.appendln(" end if;");
	sb.appendln(" return _cost;	");
	sb.appendln(" END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2014-05-07 17:53:28.0");
	sb.appendln("@Identifier=f38a4c1a-53e1-4d14-be83-3d23c3286ba0");
	return sb.toString();
}
}
