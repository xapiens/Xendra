package org.xendra.xendrian;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MySessionListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent e) {
		System.out.println(String.format("MySessionListener requestDestroyed %s", e.getServletRequest().getRemoteAddr()));
	}

	public void requestInitialized(ServletRequestEvent e) {
		System.out.println(String.format("MySessionListener requestInitialized %s", e.getServletRequest().getRemoteAddr()));		
	}

}
