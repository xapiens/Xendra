package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getfactorcomisionable0 
{
 
@XendraFunction(Name="getfactorcomisionable",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="a61cef7b-1076-e929-695c-3d7a914bc110",
Arguments="payamount numeric, isocodepayment character, docpayedamount numeric, isocodedocpayed character, tcdolarsol numeric, tceurosol numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "a61cef7b-1076-e929-695c-3d7a914bc110";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("       declare factor numeric;");
	sb.appendln("BEGIN");
	sb.appendln("	if isocodepayment = isocodedocpayed");
	sb.appendln("	then");
	sb.appendln("		factor = round((payamount*100.00)/docpayedamount,2);");
	sb.appendln("	elseif isocodepayment = '$'");
	sb.appendln("		then");
	sb.appendln("			if isocodedocpayed = 'E'");
	sb.appendln("			then");
	sb.appendln("				factor=round(((payamount*tcdolarsol)*100.00)/(docpayedamount*tceurosol),2);");
	sb.appendln("			else");
	sb.appendln("				factor=round(((payamount*tcdolarsol)*100.00)/docpayedamount,2);");
	sb.appendln("			end if;");
	sb.appendln("	elseif  isocodepayment = 'E'");
	sb.appendln("		then");
	sb.appendln("			if isocodedocpayed = '$'");
	sb.appendln("			then");
	sb.appendln("				factor=round(((payamount*tceurosol)*100.00)/(docpayedamount*tcdolarsol),2);");
	sb.appendln("			else");
	sb.appendln("				factor=round(((payamount*tceurosol)*100.00)/docpayedamount,2);");
	sb.appendln("			end if;");
	sb.appendln("	elseif isocodepayment = 'S/.'");
	sb.appendln("		then");
	sb.appendln("			if isocodedocpayed = '$'");
	sb.appendln("			then");
	sb.appendln("				factor=round((payamount*100.00)/(docpayedamount*tcdolarsol),2);");
	sb.appendln("			else");
	sb.appendln("				factor=round((payamount*100.00)/(docpayedamount*tceurosol ),2);");
	sb.appendln("			end if;");
	sb.appendln("	end if;");
	sb.appendln("	return factor;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=a61cef7b-1076-e929-695c-3d7a914bc110");
	return sb.toString();
}
}
