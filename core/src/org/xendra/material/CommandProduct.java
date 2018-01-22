package org.xendra.material;

import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class CommandProduct extends StockCommandHandler {	
	protected CommandProduct(StockWorker i, OutputStream o) {
		super(i, o);
	}

//	@Override
//	public void execute() throws Exception {
//		//Runnable runcommand = getRunnable(sw);
//		//m_executor.execute(runcommand);
//		//new Thread(runcommand).start();
//	}
	
//	private static Runnable getRunnable(final StockWorker sw) {
//		return new Runnable() {
//			@Override
//			public void run() {
//				try {
//					MaterialManager mm = MaterialManager.getInstance();
//					mm.add(sw);					
//				}
//				catch (Exception e)
//				{}
//			}
//		};
//	}

	@Override
	public void execute() {
		MaterialManager mm = MaterialManager.getInstance();
		mm.add(sw);							
	}
}