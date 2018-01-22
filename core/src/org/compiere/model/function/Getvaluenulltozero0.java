package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getvaluenulltozero0 
{
 
@XendraFunction(Name="getvaluenulltozero",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="de0eea4f-b6e9-e33a-a198-8d9a29b56a62",Arguments="value numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "de0eea4f-b6e9-e33a-a198-8d9a29b56a62";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	result		NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("	IF (value IS NULL) THEN");
	sb.appendln("	    result := 0;");
	sb.appendln("	ELSE");
	sb.appendln("	    result := value;");
	sb.appendln("	END IF;");
	sb.appendln("	RETURN result;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=de0eea4f-b6e9-e33a-a198-8d9a29b56a62");
	return sb.toString();
}
}
