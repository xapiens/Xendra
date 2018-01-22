package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Boeopenatdate0 
{
 
@XendraFunction(Name="boeopenatdate",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="ab78d720-67ae-034f-35d0-37c50ebc2ec2",
Arguments="p_c_boe_id numeric, p_duedate timestamp with time zone",Extension="",
Synchronized="2015-11-24 01:27:28.0")
	public static final String Identifier = "ab78d720-67ae-034f-35d0-37c50ebc2ec2";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_Currency_ID NUMERIC(10);");
	sb.appendln("v_IsRenewed CHARACTER(1) = 'N';");
	sb.appendln("v_TotalOpenAmt  NUMERIC := 0;");
	sb.appendln("v_DateBOE TIMESTAMP;");
	sb.appendln("v_DateRenewedBOE TIMESTAMP;");
	sb.appendln("v_ISSoTrx CHARACTER(1);");
	sb.appendln("v_PaidAmt          NUMERIC := 0;");
	sb.appendln("v_Remaining         NUMERIC := 0;");
	sb.appendln("v_Factor NUMERIC := 0;");
	sb.appendln("v_Temp              NUMERIC := 0;");
	sb.appendln("v_Precision            NUMERIC := 0;");
	sb.appendln("v_Min            NUMERIC := 0;");
	sb.appendln("ar RECORD;");
	sb.appendln("s RECORD;");
	sb.appendln("v_DueDate timestamp with time zone := now();");
	sb.appendln("BEGIN");
	sb.appendln("IF (p_duedate IS NOT NULL) THEN");
	sb.appendln("v_DueDate := p_duedate;   --  SysDate");
	sb.appendln("v_DueDate := date_trunc( 'day', v_DueDate );");
	sb.appendln("END IF;");
	sb.appendln("-- leo datos incondicionalmente");
	sb.appendln("SELECT  COALESCE(DATEBOE,'2099-01-01'), COALESCE(GrandTotal,0),COALESCE(isrenewed,'N'),COALESCE(GrandTotal,0),COALESCE(iSSotrx,'Y'),COALESCE(C_Currency_ID,0)");
	sb.appendln("INTO  v_DateBOE, v_TotalOpenAmt,v_IsRenewed,v_TotalOpenAmt,v_ISSoTrx,v_Currency_ID");
	sb.appendln("FROM C_BOE ");
	sb.appendln("WHERE C_BOE_ID = p_C_BOE_ID;");
	sb.appendln("SELECT CASE WHEN v_ISSoTrx = 'Y' THEN 1 ELSE -1 END INTO v_Factor;");
	sb.appendln("v_DateBOE := date_trunc( 'day', v_DateBOE );");
	sb.appendln("-- De ser renovada el tratamiento es diferente , busco la fecha en que fue renovada");
	sb.appendln("-- y si esta fecha es mayor o igual a la de comparacion esta pendiente para");
	sb.appendln("-- la fecha solicitada por su total");
	sb.appendln("-- Si la fecha es menor a la solicitada entonces esta cancelada para la fecha");
	sb.appendln("-- de comparacion.");
	sb.appendln("if v_IsRenewed = 'Y' THEN");
	sb.appendln("    select --coalesce(b2.documentno,b.r_documentno) ,");
	sb.appendln("      coalesce(b2.dateboe,b.r_dateboe) into v_DateRenewedBOE ");
	sb.appendln("    from c_boe b ");
	sb.appendln("	left join c_boe b2 on b2.ref_boe_id=p_C_BOE_ID");
	sb.appendln("    where b.isrenewed='Y' and b.c_boe_id=p_C_BOE_ID");
	sb.appendln("    order by b.documentno");
	sb.appendln("    limit 1;");
	sb.appendln("    -- Si se encontro la fecha de renovacion se usa de lo contrario");
	sb.appendln("    -- no hay nada que hacer ya que debe haber un problema y retornamos 0");
	sb.appendln("    if (v_DateRenewedBOE IS NOT NULL) THEN");
	sb.appendln("	if (p_duedate < date_trunc( 'day',v_DateRenewedBOE)) THEN");
	sb.appendln("           -- Entonces el monto de la letra esta pendiente");
	sb.appendln("           return ROUND(COALESCE(v_TotalOpenAmt,0), 2);");
	sb.appendln("	END IF;");
	sb.appendln("    END IF;");
	sb.appendln("    RETURN 0;");
	sb.appendln("END IF;");
	sb.appendln("SELECT StdPrecision");
	sb.appendln("    INTO v_Precision");
	sb.appendln("    FROM C_Currency");
	sb.appendln("    WHERE C_Currency_ID = v_Currency_ID;");
	sb.appendln("SELECT 1/10^v_Precision INTO v_Min;");
	sb.appendln("-- Calculate Allocated Amount");
	sb.appendln("FOR ar IN");
	sb.appendln("SELECT a.AD_Client_ID, a.AD_Org_ID,");
	sb.appendln("al.Amount, al.DiscountAmt, al.WriteOffAmt,");
	sb.appendln("al.C_Currency_ID, a.DateTrx");
	sb.appendln("FROM C_AllocationLine al");
	sb.appendln("INNER JOIN C_AllocationHdr a ON (al.C_AllocationHdr_ID=a.C_AllocationHdr_ID)");
	sb.appendln("WHERE al.C_BOE_ID = p_C_BOE_ID AND date_trunc( 'day',a.DateTrx) >= v_DateBOE");
	sb.appendln("AND date_trunc( 'day',a.DateTrx) <= v_DueDate");
	sb.appendln("          AND   a.IsActive='Y'");
	sb.appendln("LOOP");
	sb.appendln("v_Temp := ar.Amount + ar.DisCountAmt + ar.WriteOffAmt;");
	sb.appendln("v_PaidAmt := v_PaidAmt");
	sb.appendln("-- Allocation");
	sb.appendln("+ currencyConvert(v_Temp, ar.C_Currency_ID, v_Currency_ID, ar.DateTrx, null,");
	sb.appendln("ar.AD_Client_ID, ar.AD_Org_ID) * v_Factor;");
	sb.appendln("RAISE NOTICE '   PaidAmt=% , Allocation= % ', v_PaidAmt, v_Temp;");
	sb.appendln("END LOOP;");
	sb.appendln("v_TotalOpenAmt := v_TotalOpenAmt - v_PaidAmt;");
	sb.appendln("-- Ignore Rounding");
	sb.appendln("IF (v_TotalOpenAmt > -v_Min AND v_TotalOpenAmt < v_Min) THEN");
	sb.appendln("v_TotalOpenAmt := 0;");
	sb.appendln("END IF;");
	sb.appendln("-- Round to currency precision");
	sb.appendln("v_TotalOpenAmt := ROUND(COALESCE(v_TotalOpenAmt,0), v_Precision);");
	sb.appendln("RETURN v_TotalOpenAmt;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2015-11-24 01:27:28.0");
	sb.appendln("@Identifier=ab78d720-67ae-034f-35d0-37c50ebc2ec2");
	return sb.toString();
}
}
