package org.xendra.material;

import java.io.OutputStream;


public class StockIsAlive extends StockCommandHandler {

	protected StockIsAlive(StockWorker sw, OutputStream os) {
		super(sw, os);
	}

//	@Override
//	public void execute() throws Exception {
//		final String METHOD_NAME = "execute(): ";
//		String error = "";
//		try {					
//			byte[] b = error.getBytes();
//			os.write(b);			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

	@Override
	public void execute() {
		final String METHOD_NAME = "execute(): ";
		String error = "";
		try {					
			byte[] b = error.getBytes();
			os.write(b);			
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
