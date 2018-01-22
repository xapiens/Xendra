package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Acctbalance0 
{
 
@XendraFunction(Name="acctbalance",Output="numeric",Owner="xendra",Language="plpgsql",
Identifier="4a888684-cf28-4db4-7f34-9c0096f93a87",
Arguments="p_account_id numeric, p_amtdr numeric, p_amtcr numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "4a888684-cf28-4db4-7f34-9c0096f93a87";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("v_balance NUMERIC;");
	sb.appendln("v_AccountType   xendra.C_ElementValue.AccountType%TYPE;");
	sb.appendln("v_AccountSign   xendra.C_ElementValue.AccountSign%TYPE;");
	sb.appendln("BEGIN");
	sb.appendln("    v_balance := p_AmtDr - p_AmtCr;");
	sb.appendln("    -- ");
	sb.appendln("    IF (p_Account_ID > 0) THEN");
	sb.appendln("        SELECT AccountType, AccountSign");
	sb.appendln("          INTO v_AccountType, v_AccountSign");
	sb.appendln("        FROM C_ElementValue");
	sb.appendln("        WHERE C_ElementValue_ID=p_Account_ID;");
	sb.appendln("   --   DBMS_OUTPUT.PUT_LINE('Type=' || v_AccountType || ' - Sign=' || v_AccountSign);");
	sb.appendln("        --  Natural Account Sign");
	sb.appendln("        IF (v_AccountSign='N') THEN");
	sb.appendln("            IF (v_AccountType IN ('A','E')) THEN");
	sb.appendln("                v_AccountSign := 'D';");
	sb.appendln("            ELSE");
	sb.appendln("                v_AccountSign := 'C';");
	sb.appendln("            END IF;");
	sb.appendln("        --  DBMS_OUTPUT.PUT_LINE('Type=' || v_AccountType || ' - Sign=' || v_AccountSign);");
	sb.appendln("        END IF;");
	sb.appendln("        --  Debit Balance");
	sb.appendln("        IF (v_AccountSign = 'C') THEN");
	sb.appendln("            v_balance := p_AmtCr - p_AmtDr;");
	sb.appendln("        END IF;");
	sb.appendln("    END IF;");
	sb.appendln("    --");
	sb.appendln("    RETURN v_balance;");
	sb.appendln("EXCEPTION WHEN OTHERS THEN");
	sb.appendln("    -- In case Acct not found");
	sb.appendln("    RETURN  p_AmtDr - p_AmtCr;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=4a888684-cf28-4db4-7f34-9c0096f93a87");
	return sb.toString();
}
}
