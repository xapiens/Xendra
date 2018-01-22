package org.compiere.model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.compiere.model.persistence.X_A_Machine;
import org.compiere.util.Env;
import org.compiere.util.Trx;
import org.xendra.Constants;
import org.xendra.common.Lock;
import org.xendra.material.MaterialManager;
import org.xendra.material.QueuedStockJob;
import org.xendra.material.StockQueue;
import org.xendra.material.StockWorker;

public class MStorageThread extends Thread {
	private static MStorageThread m_storage;
	protected final Lock lock;	
	private StockQueue queue = new StockQueue();
	private X_A_Machine material = null;
	private MaterialManager mm = null;
	public MStorageThread() {
		lock = new Lock("queue");
		setName("StorageThread");
		material = Env.getServerMaterial();		
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized(lock) {
				while(0 == queue.getsize()) {
					try {
						lock.wait();
					} catch(InterruptedException e) {}  // ignored on purpose
				}
				try {					
					if (material != null)
					{
						QueuedStockJob currentJob = queue.getNextJob();
						StockWorker sw = currentJob.getStockWorker();						
						sw.setMachine(material);
						sw.Pull();																
						queue.remove(currentJob.getJobId());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}		
			}
		}
	}
	
	public void add(StockWorker sw)
	{
		synchronized(lock) {
			if (material != null)
			{
				queue.add(sw);			
				lock.notifyAll();
			}
		}		
	}

	public static MStorageThread getinstance() {
		if (m_storage == null)
		{
			m_storage = new MStorageThread();
			m_storage.start();
		}
		return m_storage;
	}
}
