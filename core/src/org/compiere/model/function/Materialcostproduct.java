package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Materialcostproduct 
{
 
@XendraFunction(Name="materialcostproduct",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="545184e6-8e14-d2af-4047-dd020866d30d",
Arguments="client_id numeric, product_id numeric",Extension="",
Synchronized="2023-04-04 06:58:00.0")
	public static final String Identifier = "545184e6-8e14-d2af-4047-dd020866d30d";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	_startdate TIMESTAMP;");
	sb.appendln("	_periodstart timestamp;");
	sb.appendln("	_periodend timestamp;");
	sb.appendln("	_resultcost  numeric;");
	sb.appendln("	_HASHCOUNT NUMERIC;");
	sb.appendln("	_CARDINGCOUNT NUMERIC;");
	sb.appendln("	_productcostingcount NUMERIC;");
	sb.appendln("	_count NUMERIC;");
	sb.appendln("	_idperiodend numeric;");
	sb.appendln("	P RECORD;");
	sb.appendln("	AR RECORD;	");
	sb.appendln("	_CHKCARDING VARCHAR;");
	sb.appendln("	costelement_id NUMERIC;");
	sb.appendln("	COSTELEMENT xendra.m_costelement%ROWTYPE;");
	sb.appendln("BEGIN");
	sb.appendln("	SELECT STARTDATE into _startdate FROM M_MATERIALPOLICY WHERE AD_CLIENT_ID = Client_ID;");
	sb.appendln("	raise notice 'ad_client % start date %', Client_ID,  _startdate;");
	sb.appendln("	SELECT * into COSTELEMENT from xendra.M_COSTELEMENT WHERE ad_client_id = client_id;");
	sb.appendln("	if _periodstart isnull then");
	sb.appendln("	   SELECT startdate into _periodstart from c_period where date(_startdate) BETWEEN startdate AND enddate AND AD_Client_ID = Client_ID;");
	sb.appendln("	END IF;	");
	sb.appendln("	select enddate,c_period_id into _periodend,_idperiodend from c_period where date(now()) BETWEEN startdate AND enddate AND AD_Client_ID = Client_ID;	");
	sb.appendln("	if _periodend isnull then");
	sb.appendln("		select enddate,c_period_id into _periodend,_idperiodend from c_period where startdate = (select max(startdate) from c_period where ad_client_id = client_id);");
	sb.appendln("	end if;			  ");
	sb.appendln("	_count = 0;");
	sb.appendln("	-- obtener desde donde comenzamos ");
	sb.appendln("	for ar in select c_period_id from c_period where startdate >= _periodstart ");
	sb.appendln("		AND enddate <= _periodend ");
	sb.appendln("		AND ad_client_id = client_id order by startdate");
	sb.appendln("	LOOP		");
	sb.appendln("	      SELECT COUNT(*)  INTO _cardingcount FROM M_CARDING WHERE m_product_id = Product_ID and c_period_id = ar.c_period_id and iscosted = 'N';");
	sb.appendln("	      IF COALESCE(_cardingcount,0) > 0 THEN ");
	sb.appendln("		RAISE NOTICE 'NO ESTA OK EL CARDING CON PRODUCT_COSTING COSTAVGMONTH(% % % %)',CLIENT_ID,PRODUCT_ID, COSTELEMENT.M_COSTELEMENT_ID, AR.C_PERIOD_ID;");
	sb.appendln("		select costavgmonth(client_id, product_id, COSTELEMENT.m_costelement_id ,ar.c_period_id) into _resultcost;");
	sb.appendln("		_count := _count + 1;");
	sb.appendln("		--RAISE NOTICE 'result from CA % %', product_id, _resultcost;");
	sb.appendln("	      else ");
	sb.appendln("	        --RAISE NOTICE 'productcostingcount % cardingcount %',_productcostingcount, _cardingcount;");
	sb.appendln("		RAISE NOTICE 'CARDING PARA % % % YA PROCESADO',CLIENT_ID,PRODUCT_ID, AR.C_PERIOD_ID;");
	sb.appendln("	      END IF;");
	sb.appendln("	END LOOP;		");
	sb.appendln("	_CHKCARDING := '';");
	sb.appendln("	RETURN _count;");
	sb.appendln("END");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2023-04-04 06:58:00.0");
	sb.appendln("@Identifier=545184e6-8e14-d2af-4047-dd020866d30d");
	return sb.toString();
}
}
