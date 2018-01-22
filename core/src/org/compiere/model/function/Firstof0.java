package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Firstof0 
{
 
@XendraFunction(Name="firstof",Output="date",Owner="xendra",Language="plpgsql",
Identifier="6b81c499-d093-58dc-39a2-f8ae16d504fb",
Arguments="timestamp without time zone, character varying",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "6b81c499-d093-58dc-39a2-f8ae16d504fb";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("datepart VARCHAR;");
	sb.appendln("datetime TIMESTAMP WITHOUT TIME ZONE;");
	sb.appendln("BEGIN");
	sb.appendln("	datepart = $2;");
	sb.appendln("	IF $2 IN ('') THEN");
	sb.appendln("		datepart = 'millennium';");
	sb.appendln("	ELSEIF $2 IN ('') THEN");
	sb.appendln("		datepart = 'century';");
	sb.appendln("	ELSEIF $2 IN ('') THEN");
	sb.appendln("		datepart = 'decade';");
	sb.appendln("	ELSEIF $2 IN ('IYYY','IY','I') THEN");
	sb.appendln("		datepart = 'year';");
	sb.appendln("	ELSEIF $2 IN ('SYYYY','YYYY','YEAR','SYEAR','YYY','YY','Y') THEN");
	sb.appendln("		datepart = 'year';");
	sb.appendln("	ELSEIF $2 IN ('Q') THEN");
	sb.appendln("		datepart = 'quarter';");
	sb.appendln("	ELSEIF $2 IN ('MONTH','MON','MM','RM') THEN");
	sb.appendln("		datepart = 'month';");
	sb.appendln("	ELSEIF $2 IN ('IW') THEN");
	sb.appendln("		datepart = 'week';");
	sb.appendln("	ELSEIF $2 IN ('W') THEN");
	sb.appendln("		datepart = 'week';");
	sb.appendln("	ELSEIF $2 IN ('DDD','DD','J') THEN");
	sb.appendln("		datepart = 'day';");
	sb.appendln("	ELSEIF $2 IN ('DAY','DY','D') THEN");
	sb.appendln("		datepart = 'day';");
	sb.appendln("	ELSEIF $2 IN ('HH','HH12','HH24') THEN");
	sb.appendln("		datepart = 'hour';");
	sb.appendln("	ELSEIF $2 IN ('MI') THEN");
	sb.appendln("		datepart = 'minute';");
	sb.appendln("	ELSEIF $2 IN ('') THEN");
	sb.appendln("		datepart = 'second';");
	sb.appendln("	ELSEIF $2 IN ('') THEN");
	sb.appendln("		datepart = 'milliseconds';");
	sb.appendln("	ELSEIF $2 IN ('') THEN");
	sb.appendln("		datepart = 'microseconds';");
	sb.appendln("	END IF;");
	sb.appendln("	datetime = date_trunc(datepart, $1); ");
	sb.appendln("RETURN cast(datetime as date);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=6b81c499-d093-58dc-39a2-f8ae16d504fb");
	return sb.toString();
}
}
