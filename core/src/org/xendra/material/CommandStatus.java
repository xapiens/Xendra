package org.xendra.material;

import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.xendra.common.Lock;

public class CommandStatus  {	
	protected final Lock lock = new Lock("status");
	protected boolean sleep = true;
	protected StatusWorker sw;
	//protected OutputStream os;	
	protected ObjectOutputStream os;
	//public CommandStatus(StatusWorker is, OutputStream os) {
	public CommandStatus(StatusWorker is, ObjectOutputStream os) {
		this.sw = is;
		this.os = os;		
	}
	
	public void execute() {
		MaterialManager mm = MaterialManager.getInstance();
		mm.register(this);								
		while (true)
		{			
			if (sleep)
			{
				synchronized(lock) {
					try {						
						lock.wait();
					} catch(Exception e) {}  // ignored on purpose																	
				}
			}
		}
	}

	public void stop() {
		sleep = false;
		synchronized(lock) {					
			lock.notifyAll();
		}		
	}
}
