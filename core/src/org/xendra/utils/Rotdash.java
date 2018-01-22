package org.xendra.utils;

import org.xendra.common.Lock;

public class Rotdash implements Runnable {
	char arr[] = { '/', '-', '\\', '|' };
	int i = 0;
	private boolean goahead = true;
	private boolean end = false;
	private int percent = 0;
	private String msg = "";
	private static Rotdash INSTANCE; 
	protected final Lock lock = new Lock("rotdash");
	public Rotdash()
	{
		
	}
	
	public static Rotdash getInstance()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new Rotdash();
			Thread thread = new Thread(INSTANCE);
			thread.start();
		}						
		else
			INSTANCE.start();
		return INSTANCE;
	}

	@Override
	public void run() {
		try {
			while (!end)
			{					
				synchronized(lock) {
					if (!goahead)
					{
						try {						
							lock.wait();
						} catch(Exception e) {}  // ignored on purpose													
					}
					if (percent > 0)
					{
						if (this.msg.length() > 0)
							System.out.print(String.format("%s %d%% %s\r",msg, percent,arr[i]));
						else
							System.out.print(String.format("%d%% %s\r",percent,arr[i]));
					}
					else					
					{
						if (this.msg.length() > 0)
							System.out.print(String.format("%s %s\r",msg, arr[i]));
						else
							System.out.print(String.format("%s\r",arr[i]));
					}
					i++;
					i %= 4;
					Thread.sleep(200);					
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	public void end() {
		setMessage("");
		end = true;				
	}
	public void stop() {
		goahead = false;
		setMessage("");
		if (getPercent() > 0)
			setPercent(0);
		System.out.println("");
	}
	public void start() {		
		if (!goahead)
		{			
			goahead = true;
			synchronized(lock) {					
				lock.notifyAll();
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rotdash rotdash = Rotdash.getInstance();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rotdash.stop();
	}
	public void setPercent(int percent) {
		this.percent = percent;		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
	}
	public int getPercent() {
		return percent;
	}
	public void setMessage(String msg) {
		this.msg = msg;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}		
	}
}
