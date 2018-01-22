package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Calc_comisionitem0 
{
 
@XendraFunction(Name="calc_comisionitem",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="a542874e-4a89-ef68-ba6c-e7498a567488",
Arguments="payamount numeric, isocodepayment character, docpayedamount numeric, isocodedocpayed character, lineamount numeric, tcdolarsol numeric, tceurosol numeric, taxrate numeric, porcomision numeric",
Extension="",Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "a542874e-4a89-ef68-ba6c-e7498a567488";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("       declare totalPagadoSoles numeric;");
	sb.appendln("               totalItemSoles numeric;");
	sb.appendln("                               porComisionableITem numeric;");
	sb.appendln("BEGIN");
	sb.appendln("       -- Determinamos en soles el total pagado del documeno");
	sb.appendln("       -- Dado que este esta con igv le quitamos el mismo ya");
	sb.appendln("       -- que el igv no es comisionable.");
	sb.appendln("       if isoCodePayment = '$' then");
	sb.appendln("               totalPagadoSoles =");
	sb.appendln("round((payamount*100/(100.00+taxRate))*tcDolarSol,2);");
	sb.appendln("       elsif isoCodePayment = 'E' then");
	sb.appendln("               totalPagadoSoles =");
	sb.appendln("round((payamount*100/(100.00+taxRate))*tcEuroSol,2);");
	sb.appendln("       else");
	sb.appendln("               totalPagadoSoles = round(payamount*100/(100.00+taxRate),2);");
	sb.appendln("       end if;");
	sb.appendln("       -- Determinamos que porcentaje del  total representa el monto de la linea");
	sb.appendln("       -- Para eso primero llevaremos el monto del item a soles.");
	sb.appendln("       -- Elmonto de la linea no contiene el impuesto.");
	sb.appendln("       --if isoCodeDocPayed = '$' then");
	sb.appendln("       --      totalItemSoles = round(lineAmount*tcDolarSol,2);");
	sb.appendln("       --else if isoCodeDocPayed = 'E' then");
	sb.appendln("       --      totalItemSoles = round(lineAmount*tcEuroSol,2);");
	sb.appendln("       --else");
	sb.appendln("       --      totalItemSoles = round(lineAmount,2);");
	sb.appendln("       --end if;");
	sb.appendln("       -- Ahora determinamos el porcentaje del total que representa el item");
	sb.appendln("       -- (Esto es para el caso q el monto de pago no sea por el total).");
	sb.appendln("       -- Esta operacion se hace con el total delitem vs el total del documento");
	sb.appendln("       -- AMBAS ESTAN EN LA MISMA MONEDA , pero el docPAyedAmoutn incluye el tax.");
	sb.appendln("       porComisionableITem = round((lineAmount");
	sb.appendln("*100.0)/(docPayedAmount*100/(100.00+taxRate)),2);");
	sb.appendln("       -- ahora si la comision");
	sb.appendln("       -- El  total pagado en soles por el porecentaje del total que representa");
	sb.appendln("       -- el monto del item sera la base comisionable del item , a esto se le");
	sb.appendln("       -- aplicara el porcentaje de comision");
	sb.appendln("       return round");
	sb.appendln("(round(((totalPagadoSoles*porComisionableItem)/100.00),2)*porComision/100.00,2);");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=a542874e-4a89-ef68-ba6c-e7498a567488");
	return sb.toString();
}
}
