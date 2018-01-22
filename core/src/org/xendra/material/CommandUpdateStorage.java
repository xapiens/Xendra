package org.xendra.material;

import java.io.OutputStream;

import org.compiere.model.Query;
import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_Transaction;
import org.compiere.util.Env;
import org.xendra.Constants;


public class CommandUpdateStorage extends StockCommandHandler {

	protected CommandUpdateStorage(StockWorker i, OutputStream o) {
		super(i, o);
	}

	@Override
//	public void execute() throws Exception {
//		int C_Period_ID = sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID);
//		if (C_Period_ID > 0)
//		{
//			//int AD_Table_ID = sw.getIntProperty(X_M_Transaction.COLUMNNAME_AD_Table_ID);
//			//int Record_ID = sw.getIntProperty(X_M_Transaction.COLUMNNAME_Record_ID);
//			MaterialManager mm = MaterialManager.getInstance();
//			mm.wakeupPolicy();
//			MaterialPolicy mp = mm.getPolicy();
//			mp.add(sw);
//		}
//	}

	public void execute() {
		int AD_Client_ID = sw.getIntProperty(Constants.COLUMNNAME_AD_Client_ID);
		int C_Period_ID = sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID);
		if (C_Period_ID > 0)
		{
			//int AD_Table_ID = sw.getIntProperty(X_M_Transaction.COLUMNNAME_AD_Table_ID);
			//int Record_ID = sw.getIntProperty(X_M_Transaction.COLUMNNAME_Record_ID);
			MaterialManager mm = MaterialManager.getInstance();
			mm.wakeupPolicy();
			MaterialPolicy mp = mm.getPolicy(AD_Client_ID);
			mp.add(sw);
		}		
	}

}
