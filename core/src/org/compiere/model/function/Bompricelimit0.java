package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Bompricelimit0 
{
 
@XendraFunction(Name="bompricelimit",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="c7a502f1-b25c-a9a3-d1c7-5f83e7de1fc2",
Arguments="product_id numeric, pricelist_version_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "c7a502f1-b25c-a9a3-d1c7-5f83e7de1fc2";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	v_Price	NUMERIC;");
	sb.appendln("	v_ProductPrice	NUMERIC;");
	sb.appendln("	bom RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("	--	Try to get price from PriceList directly");
	sb.appendln("	SELECT	COALESCE (SUM(PriceLimit), 0)");
	sb.appendln("      	INTO	v_Price");
	sb.appendln("   	FROM	M_ProductPrice");
	sb.appendln("	WHERE M_PriceList_Version_ID=PriceList_Version_ID AND M_Product_ID=Product_ID;");
	sb.appendln("	--	No Price - Check if BOM");
	sb.appendln("	IF (v_Price = 0) THEN");
	sb.appendln("		FOR bom IN  ");
	sb.appendln("			SELECT b.M_ProductBOM_ID, b.BOMQty, p.IsBOM");
	sb.appendln("			FROM M_Product_BOM b, M_Product p");
	sb.appendln("			WHERE b.M_ProductBOM_ID=p.M_Product_ID");
	sb.appendln("		  	AND b.M_Product_ID=Product_ID");
	sb.appendln("		LOOP");
	sb.appendln("			v_ProductPrice := bomPriceLimit (bom.M_ProductBOM_ID, PriceList_Version_ID);");
	sb.appendln("			v_Price := v_Price + (bom.BOMQty * v_ProductPrice);");
	sb.appendln("		END LOOP;");
	sb.appendln("	END IF;");
	sb.appendln("	--");
	sb.appendln("	RETURN v_Price;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=c7a502f1-b25c-a9a3-d1c7-5f83e7de1fc2");
	return sb.toString();
}
}
