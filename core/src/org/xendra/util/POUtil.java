package org.xendra.util;

import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Client;
import org.compiere.util.Env;

public class POUtil {
	public static String getid(String tableName, int uid) {
		String id = "";
		PO po = new Query(Env.getCtx(), tableName, String.format("%s_ID = ?", tableName), null).setParameters(uid).first();
		if (po != null) {
			if (po.get_ColumnIndex(X_AD_Client.COLUMNNAME_Identifier) >= 0) {
				id = (String) po.get_Value(X_AD_Client.COLUMNNAME_Identifier);				
				if (id == null)
					id = "NSD";
			}			
		}
		return id;
	}
}
