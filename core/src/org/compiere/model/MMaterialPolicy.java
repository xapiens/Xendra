package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.persistence.X_M_MaterialPolicy;
import org.compiere.server.MaterialProcessor;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.xendra.common.Lock;
import org.xendra.utils.Rotdash;

//with test as (select m_transaction_id, 
//case when m_inventoryline_id > 0 then 
//(select docstatus from m_inventory i join m_inventoryline il on i.m_inventory_id = il.m_inventory_id AND il.m_inventoryline_id = m_transaction.m_inventoryline_id)
//when m_inoutline_id > 0 then
//(select docstatus from m_inout io join m_inoutline iol on io.m_inout_id = iol.m_inout_id AND iol.m_inoutline_id = m_transaction.m_inoutline_id)
//when m_movementline_id > 0 then
//(select docstatus from m_movement m join m_movementline ml on m.m_movement_id = ml.m_movement_id AND ml.m_movementline_id = m_transaction.m_movementline_id)
//end as docstatus from m_transaction)
//update m_transaction set docstatus = test.docstatus from test where m_transaction.m_transaction_id = test.m_transaction_id

public class MMaterialPolicy extends X_M_MaterialPolicy implements Runnable {	

	private int m_frequencystart = 23;

	public void setFrequencyStartAt(int frequencystart) {
		if (frequencystart == 0)
			frequencystart = 23;
		m_frequencystart = frequencystart;		
	}

	public void setClient(MClient client) {
		m_client = client;		
	}

	public MMaterialPolicy(Properties ctx, int M_MaterialPolicy_ID,	String trxName) {
		super(ctx, M_MaterialPolicy_ID, trxName);
	}
	public MMaterialPolicy (Properties ctx, ResultSet rs, String trxName) {
		super (ctx, rs, trxName);
	}	
	private MClient m_client = null;
	float count = 0;
	float counttotal = 0;
	float percent = 0;
	float periodpercent = 0;
	int percentpoint = 0;
	protected final Lock lock = new Lock("policy");
	X_A_Machine machine = Env.getServerMaterial();
	private static HashMap<Integer, MMaterialPolicy> policies = new HashMap();
	protected CLogger	log = CLogger.getCLogger(getClass());
	private MaterialProcessor model;

	@Override
	public void run() {
		try {
			Rotdash rotdash = Rotdash.getInstance();
			String sql = String.format("SELECT MATERIALPOLICY(?,?,%s);", isSynchronized() ? "true" : "false");
			Object[] params = new Object[]{new BigDecimal(m_client.getAD_Client_ID()), new BigDecimal(getM_CostElement_ID())};
			String error = DB.getSQLValueString(null, sql, params);
			if (error == null) {
				error = "";
			}
			model.setSummary(error);
			model.sessionlog();
			rotdash.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setMaterialProcessor(MaterialProcessor materialProcessor) {
		model = materialProcessor;		
	}
}
