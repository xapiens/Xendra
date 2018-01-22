package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Betweendoublequotes0 
{
 
@XendraFunction(Name="betweendoublequotes",Output="text",Owner="xendra",Language="plpgsql",
Identifier="82882b34-8bc0-5858-70de-59dfbb3e238b",Arguments="_instring text, _pos numeric",
Extension="",Synchronized="2017-11-29 23:38:28.0")
	public static final String Identifier = "82882b34-8bc0-5858-70de-59dfbb3e238b";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE ");
	sb.appendln("_temp text;");
	sb.appendln("_token text := '\"'; ");
	sb.appendln("_tokentext text;");
	sb.appendln("_tokennumber numeric := 1;");
	sb.appendln("_start integer := 0;");
	sb.appendln("_end integer := 0;");
	sb.appendln("BEGIN");
	sb.appendln("_temp := _instring;");
	sb.appendln("while strpos(_temp, _token) > 0 loop");
	sb.appendln("	_start := strpos(_temp, _token)+1;	");
	sb.appendln("	_end := strpos(substr(_temp, _start), _token)-1;");
	sb.appendln("	_tokentext := substr(_temp, _start, _end);");
	sb.appendln("	_temp := substr(_temp, _start+_end+1);");
	sb.appendln("	if _tokennumber = _pos then");
	sb.appendln("	 return _tokentext;");
	sb.appendln("	end if;");
	sb.appendln("	_tokennumber :=  _tokennumber + 1;");
	sb.appendln("end loop;");
	sb.appendln("return '';");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-11-29 23:38:28.0");
	sb.appendln("@Identifier=82882b34-8bc0-5858-70de-59dfbb3e238b");
	return sb.toString();
}
}
