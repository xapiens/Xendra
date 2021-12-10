package org.xendra.chat;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ.Socket;

public class Server implements Runnable {
	public static boolean loaded = false;
	@Override
	public void run() {
		ZContext context = new ZContext();
		Socket pub  = context.createSocket(SocketType.PUB);
		pub.bind("tcp://*:5566");
		Socket pull = context.createSocket(SocketType.PULL);
		pull.bind("tcp://*:5567");
		while (true) {
			String message = pull.recvStr();
			System.out.println(message);
			pub.send(message);
		}		
	}
	public static void getInstance() {
		if (!loaded) {
			Thread thread = new Thread(new Server());
			thread.start();
			loaded = true;
		}
	}
}
