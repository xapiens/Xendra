package org.xendra.chat;

import java.util.concurrent.CountDownLatch;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;
import org.zeromq.ZMQ.Poller;
import org.zeromq.ZMQ.Socket;

public class worker implements Runnable {
	private final CountDownLatch ready = new CountDownLatch(0);
	@Override
	public void run() {
		ZContext context = new ZContext();
		Socket sub  = context.createSocket(SocketType.SUB);
		sub.connect("tcp://localhost:5566");
		Poller poller = context.createPoller(2);
		poller.register(sub, ZMQ.Poller.POLLIN);
		while (true) {
			poller.poll();
		}		
		
	}

}
