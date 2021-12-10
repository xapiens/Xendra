package org.xendra.console;

import java.io.IOException;

import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;

public class ThreadRotDash implements Runnable {
	Label status = null;
	MultiWindowTextGUI gui = null;
	private boolean issync;
	private String message = "";
	ThreadRotDash(MultiWindowTextGUI gui, Label status) {
		this.status = status;
		this.gui = gui;
	}
	public void run() {
		char arr[] = { '/', '-', '\\', '|' };
		int i = 0;
		try {
			while (issync) {
				i++;
				i %= 4;
				status.setText(String.format("%s %s", this.message, Character.toString(arr[i])));
				gui.updateScreen();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}					
			}			
		} catch (IOException e2) {
			e2.printStackTrace();
		}									
	}
	public void start() {
		issync = true;		
	}
	public void stop() {
		issync = false;		
	}
	public void setMessage(String message) {
		this.message = message;		
	}
}
