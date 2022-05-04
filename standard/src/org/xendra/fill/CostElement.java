package org.xendra.fill;

import java.util.logging.Level;

import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_M_CostElement;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.replication.ReplicationEngine;

import java.util.List;

public class CostElement {
	private static CLogger log = CLogger.getCLogger(CostElement.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (!org.compiere.Xendra.startup(false))
		{					
			log.log(Level.SEVERE, "can't connect to database");
			return;
		}
		//
		List<PO> costelements = new Query(Env.getCtx(), X_M_CostElement.Table_Name, "m_costelement_id = 1000066", null).list();
		//ReplicationEngine replication = new ReplicationEngine();
		try {
			Util.writeToFile(ReplicationEngine.getInstance().decode(costelements), "/home/americas/model/m_costelement.xml");
		}		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//  ahora procesamos el stream
//		File file = new File("/home/americas/model/storeposlines.xml");
//		try {
//			Replication replication = new Replication();
//			replication.encode(file);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
