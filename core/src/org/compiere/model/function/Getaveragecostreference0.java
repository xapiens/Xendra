package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getaveragecostreference0 
{
 
@XendraFunction(Name="getaveragecostreference",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="ebb93110-d675-4cf9-8414-b8b33b901ebd",
Arguments="client_id numeric, costelement_id numeric, product_id numeric, datemov timestamp without time zone",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "ebb93110-d675-4cf9-8414-b8b33b901ebd";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Cost NUMERIC := 0;");
	sb.appendln("lastcost timestamp;");
	sb.appendln("BEGIN");
	sb.appendln("	SELECT cost into v_Cost FROM m_costcalc ");
	sb.appendln("	WHERE m_product_id = product_id AND m_costelement_id = costelement_id AND datemov between date_trunc('day',movementdate) AND date_trunc('day',omovementdate);");
	sb.appendln("	IF  v_Cost is null THEN");
	sb.appendln("		-- como no esta dentro de un rango de lote");
	sb.appendln("		-- veamos si truncando funka");
	sb.appendln("		SELECT cost into v_Cost FROM m_costcalc ");
	sb.appendln("		WHERE m_product_id = product_id AND m_costelement_id = costelement_id and date_trunc('day',datemov) between date_trunc('day',movementdate) AND date_trunc('day',omovementdate);");
	sb.appendln("		IF  v_Cost is null THEN	");
	sb.appendln("			RAISE notice '% % no encontro un costo referencial ',product_id, datemov;");
	sb.appendln("		END IF;");
	sb.appendln("	END IF;");
	sb.appendln("	RETURN COALESCE(v_Cost,0);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=ebb93110-d675-4cf9-8414-b8b33b901ebd");
	return sb.toString();
}
}
