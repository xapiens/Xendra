package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Isaccesssopricelist0 
{
 
@XendraFunction(Name="isaccesssopricelist",Output="boolean",Owner="postgres",Language="plpgsql",
Identifier="6b6997fe-01ef-4478-a33a-ed9ae99288f2",
Arguments="pricelist_version_id numeric, role_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "6b6997fe-01ef-4478-a33a-ed9ae99288f2";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("ar RECORD;");
	sb.appendln("isHaveAccess BOOLEAN;");
	sb.appendln("BEGIN");
	sb.appendln("	isHaveAccess := false;");
	sb.appendln("	FOR ar IN ");
	sb.appendln("	select m_pricelist_version_id from m_pricelist_version plv, m_pricelist pl  ");
	sb.appendln("	WHERE plv.m_pricelist_id = pl.m_pricelist_id and ");
	sb.appendln("	case when pl.issopricelist='Y'  and (SELECT COALESCE(isonlysopricelistaccess,'N') FROM AD_ROLE WHERE AD_ROLE_ID = Role_ID) = 'Y'  THEN  ");
	sb.appendln("		true  ");
	sb.appendln("	ELSE  ");
	sb.appendln("		case when (SELECT COALESCE(isonlysopricelistaccess,'N') FROM AD_ROLE WHERE AD_ROLE_ID = Role_ID) = 'N' then ");
	sb.appendln("			true ");
	sb.appendln("		else ");
	sb.appendln("			false ");
	sb.appendln("		END  ");
	sb.appendln("	END");
	sb.appendln("	LOOP");
	sb.appendln("		if ar.m_pricelist_version_id = PriceList_Version_ID then");
	sb.appendln("			isHaveAccess := true;");
	sb.appendln("		end if;");
	sb.appendln("	END LOOP;");
	sb.appendln("	RETURN IsHaveAccess;");
	sb.appendln("	END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=6b6997fe-01ef-4478-a33a-ed9ae99288f2");
	return sb.toString();
}
}
