package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Averagecostmaterial0 
{
 
@XendraFunction(Name="averagecostmaterial",Output="void",Owner="xendra",Language="plpgsql",
Identifier="7d1e7d90-3566-8a31-0839-3ed6fa064ab7",
Arguments="client_id numeric, costelement_id numeric",Extension="",
Synchronized="2017-07-31 17:22:28.0")
	public static final String Identifier = "7d1e7d90-3566-8a31-0839-3ed6fa064ab7";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("	_startdate timestamp;");
	sb.appendln("	_periodstart timestamp;");
	sb.appendln("	products record;");
	sb.appendln("	_period_id_end numeric;");
	sb.appendln("	_loadperiod_id numeric;");
	sb.appendln("	_existinarray boolean;");
	sb.appendln("	_productreset numeric[];");
	sb.appendln("	_productcost numeric[];");
	sb.appendln("	_productrecost numeric[];");
	sb.appendln("	_recoststatus numeric[];");
	sb.appendln("	_resultcost  numeric;");
	sb.appendln("	_productid numeric;");
	sb.appendln("	_inventoryid numeric;");
	sb.appendln("	_processperiod_id  numeric;");
	sb.appendln("BEGIN");
	sb.appendln("	-- Configure");
	sb.appendln("	SELECT m_inventory_id,");
	sb.appendln("	       loadperiod_id,");
	sb.appendln("	       processperiod_id,");
	sb.appendln("	       startdate ");
	sb.appendln("	       into ");
	sb.appendln("	       _inventoryid,");
	sb.appendln("	       _loadperiod_id,");
	sb.appendln("	       _processperiod_id,");
	sb.appendln("	       _startdate");
	sb.appendln("	FROM m_materialpolicy where ad_client_id = Client_ID;");
	sb.appendln("	if _loadperiod_id ISNULL THEN");
	sb.appendln("	   return;");
	sb.appendln("	end if;");
	sb.appendln("	if _processperiod_id ISNULL THEN");
	sb.appendln("	  update m_transaction set processed = 'N' where ad_client_id = Client_ID;");
	sb.appendln("	  DELETE FROM M_COSTCALC where ad_client_id = Client_ID;");
	sb.appendln("	  DELETE FROM M_STORAGEMONTHLY where ad_client_id = Client_ID;");
	sb.appendln("	  DELETE FROM M_PRODUCT_COSTING where ad_client_id = Client_ID;	");
	sb.appendln("	  IF NOT _inventoryid ISNULL THEN");
	sb.appendln("	     SELECT movementdate into _periodstart FROM M_INVENTORY where m_inventory_id = _inventoryid;		  ");
	sb.appendln("	  end if;");
	sb.appendln("	  if _periodstart isnull then");
	sb.appendln("	     SELECT startdate into _periodstart ");
	sb.appendln("	     from c_period where date(_startdate) BETWEEN startdate AND enddate AND AD_Client_ID = Client_ID;	   ");
	sb.appendln("	  END IF;	");
	sb.appendln("	  --select c_period_id into _processperiod_id from c_period where startdate >= _periodstart and _periodstart < enddate AND AD_Client_ID = Client_ID;	  ");
	sb.appendln("	   select c_period_id into _processperiod_id from c_period where _periodstart between startdate and enddate AND AD_Client_ID = Client_ID;	  ");
	sb.appendln("	else");
	sb.appendln("	  select c_period_id into _period_id_end from c_period where date(now()) BETWEEN startdate AND enddate AND AD_Client_ID = Client_ID;		  ");
	sb.appendln("	  IF _processperiod_id < _period_id_end AND _processperiod_id < _loadperiod_id THEN ");
	sb.appendln("	     SELECT c_period_id into _processperiod_id from c_period where startdate = (select enddate+1 from c_period where c_period_id = (select processperiod_id FROM m_materialpolicy where ad_client_id = Client_ID))");
	sb.appendln("	     AND AD_Client_ID = Client_ID;");
	sb.appendln("	  END IF;");
	sb.appendln("	END IF;	");
	sb.appendln("	FOR products in select distinct m_product_id ");
	sb.appendln("		FROM m_product where  COALESCE(discontinued,'N')='N' ");
	sb.appendln("			AND COALESCE(ISCOSTABLE,'N')='Y' ");
	sb.appendln("			AND ad_client_id = client_id ");
	sb.appendln("	LOOP	");
	sb.appendln("	    SELECT case when products.m_product_id = ANY(_productcost) then true else false end into _existinarray;   		");
	sb.appendln("	    IF NOT _existinarray THEN");
	sb.appendln("	      _productcost := array_append(_productcost,products.m_product_id);");
	sb.appendln("	    END IF;");
	sb.appendln("	END LOOP;");
	sb.appendln("	raise notice 'cantidad productos %', array_length(_productcost,1);	");
	sb.appendln("	for i in array_lower(_productcost,1)..array_upper(_productcost,1)");
	sb.appendln("	LOOP	");
	sb.appendln("	    select costaveragemonth(client_id, _productcost[i], costelement_id ,_processperiod_id) into _resultcost;");
	sb.appendln("	    if (_resultcost != 0) then");
	sb.appendln("		raise notice 'product cost  % failed with result %', _productcost[i], _resultcost;");
	sb.appendln("		SELECT case when _productcost[i] = ANY(_productrecost) then true else false end into _existinarray;   		");
	sb.appendln("		IF NOT _existinarray THEN");
	sb.appendln("		  _productrecost := array_append(_productrecost,_productcost[i]);");
	sb.appendln("		  _recoststatus := array_append(_recoststatus,_resultcost);");
	sb.appendln("		END IF;			");
	sb.appendln("	    end if;");
	sb.appendln("	END LOOP;");
	sb.appendln("	IF array_length(_productrecost,1) > 0 THEN");
	sb.appendln("		for i in array_lower(_productrecost,1)..array_upper(_productrecost,1)");
	sb.appendln("		LOOP	");
	sb.appendln("		    if _recoststatus[i] != 0 then");
	sb.appendln("		    select costaveragemonth(client_id, _productrecost[i], costelement_id ,_processperiod_id) into _resultcost;");
	sb.appendln("		    _recoststatus[i] := _resultcost;");
	sb.appendln("		    if (_resultcost != 0) then			");
	sb.appendln("			raise notice 'product recost  % in period % failed with result %', _productrecost[i], _processperiod_id, _resultcost;			    		");
	sb.appendln("		    end if;");
	sb.appendln("		    end if;");
	sb.appendln("		END LOOP;					");
	sb.appendln("		_productrecost := '{}';");
	sb.appendln("		_recoststatus := '{}';			");
	sb.appendln("	END IF;		");
	sb.appendln("	UPDATE M_MATERIALPOLICY SET processperiod_id = _processperiod_id WHERE AD_Client_ID = Client_ID;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2017-07-31 17:22:28.0");
	sb.appendln("@Identifier=7d1e7d90-3566-8a31-0839-3ed6fa064ab7");
	return sb.toString();
}
}
