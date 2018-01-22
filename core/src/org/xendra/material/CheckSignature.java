package org.xendra.material;

import java.io.IOException;
import java.io.OutputStream;

import org.compiere.model.persistence.X_C_Period;
import org.compiere.model.persistence.X_M_Product;
import org.xendra.Constants;

public class CheckSignature extends StockCommandHandler {


	protected CheckSignature(StockWorker sw, OutputStream os) {
		super(sw, os);
	}

//	@Override
//	public void execute() throws Exception {
//		Integer M_Product_ID = sw.getIntProperty(X_M_Product.COLUMNNAME_M_Product_ID);
//		Integer C_Period_ID = sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID);
//		//String trx = sw.getStringProperty(Constants.Transaction);
//		MaterialManager mm = MaterialManager.getInstance();		 
//		boolean changed = mm.signatureChanged(C_Period_ID, M_Product_ID);
//		String result = changed ? "True" : "False";
//		byte[] b = result.getBytes();
//		os.write(b);
//	}
	
	public void execute() {
		Integer M_Product_ID = sw.getIntProperty(X_M_Product.COLUMNNAME_M_Product_ID);
		Integer C_Period_ID = sw.getIntProperty(X_C_Period.COLUMNNAME_C_Period_ID);
		Integer AD_Client_ID = sw.getIntProperty(Constants.COLUMNNAME_AD_Client_ID);
		//String trx = sw.getStringProperty(Constants.Transaction);
		MaterialManager mm = MaterialManager.getInstance();		 
		boolean changed = mm.signatureChanged(AD_Client_ID, C_Period_ID, M_Product_ID);
		String result = changed ? "True" : "False";
		byte[] b = result.getBytes();
		try {
			os.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
