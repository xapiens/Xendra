package org.xendra.xendrian;

import java.util.ArrayList;
import java.util.Iterator;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZFrame;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Poller;
import org.zeromq.ZMsg;

public class ChatServer implements Runnable {
	private final static int HEARTBEAT_LIVENESS = 3;
	private final static int HEARTBEAT_INTERVAL = 1000;
	private final static String PPP_READY = "\001";
	private final static String PPP_HEARTBEAT = "\002";
	public ChatServer() {
	}
    public static ChatServer getInstance() {
    	if (instance == null) {
    		instance = new ChatServer();
    		Thread t = new Thread(instance);
    		t.start();
    	}
    	return instance;
    }
    public static ChatServer instance;
    
	@Override
	public void run() {
        try (ZContext context = new ZContext()) {
            //ZMQ.Socket pub = context.createSocket(SocketType.PUB);
        	ZMQ.Socket pub = context.createSocket(SocketType.ROUTER);
            pub.bind("tcp://*:5566");
            ZMQ.Socket pull = context.createSocket(SocketType.PULL);
            pull.bind("tcp://*:5567");            
            
            ArrayList<Worker> workers = new ArrayList<Worker>();            
            long heartbeat_at = System.currentTimeMillis() + HEARTBEAT_INTERVAL;
            
        	Poller poller = context.createPoller(2);
        	poller.register(pub, Poller.POLLIN);
        	poller.register(pull, Poller.POLLIN);
            while (!Thread.currentThread().isInterrupted()) {
            	boolean workersAvailable = workers.size() > 0;
            	int rc = poller.poll(HEARTBEAT_INTERVAL);
            	if (rc == -1) 
            		break;
            	if (poller.pollin(0)) {
            		ZMsg msg = ZMsg.recvMsg(pub);
            		if (msg == null) 
            			break; // Interrupted
            		ZFrame address = msg.unwrap();
            		Worker worker = new Worker(address);
            		worker.ready(workers);
            		if (msg.size() == 1) {
            			ZFrame frame = msg.getFirst();
            			String data = new String(frame.getData(), ZMQ.CHARSET);
            			if (!data.equals(PPP_READY) && !data.equals(PPP_HEARTBEAT)) {
            				System.out.println("E: invalid message from worker");
            				msg.dump(System.out);
            			}
            			msg.destroy();
            		}
            		else msg.send(pub);
            	} 
            	if (workersAvailable && poller.pollin(1)) {            		
            		ZMsg msg = ZMsg.recvMsg(pull);
            		if (msg == null)
            			break; // interrupted;
            		msg.push(Worker.next(workers));
            		msg.send(pub);
            	}
            	if (System.currentTimeMillis() >= heartbeat_at) {
            		for (Worker worker : workers) {
            			worker.address.send(pub, ZFrame.REUSE + ZFrame.MORE);
            			ZFrame frame = new ZFrame(PPP_HEARTBEAT);
            			frame.send(pub, 0);
            		}
            		long now = System.currentTimeMillis();
            		heartbeat_at = now + HEARTBEAT_INTERVAL;            			
            	}
            	Worker.purge(workers);
            	//String string = new String(pull.recv(0), ZMQ.CHARSET).trim();
            	//pub.send(string);             	            	
            }
            Worker.purge(workers);
        } catch (Exception ex) {
        	ex.printStackTrace();
        }			
	}
	private static class Worker {
		ZFrame address; 	// Address of worker
		String identity; 	// Printable identity
		long expiry;  		// Expires at this time
		protected Worker(ZFrame address) {
			this.address = address;
			identity = new String(address.getData(), ZMQ.CHARSET);
			expiry = System.currentTimeMillis() + HEARTBEAT_INTERVAL * HEARTBEAT_LIVENESS;
		}
		protected void ready(ArrayList<Worker> workers) {
			Iterator<Worker> it = workers.iterator();
			while (it.hasNext()) {
				Worker worker = it.next();
				if (identity.equals(worker.identity)) {
					it.remove();
					break;
				}						
			}
			workers.add(this);
		}
		
		protected static ZFrame next(ArrayList<Worker> workers) 
		{
			Worker worker = workers.remove(0);
			assert ( worker != null);
			ZFrame frame = worker.address;
			return frame;
		}
		
		protected static void purge(ArrayList<Worker> workers) {
			Iterator<Worker> it = workers.iterator();
			while (it.hasNext()) {
				Worker worker = it.next();
				if (System.currentTimeMillis() < worker.expiry) {
					break;
				}
				it.remove();
			}
		}
	}
}