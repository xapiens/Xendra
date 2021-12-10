package com.dravios.pgrman;

public class pgrman {
	Manager manager = null;
	private IOStreams ios;
	public pgrman() {
		manager = new Manager();
	}
	public String backup() {
		String result = "";
		manager.backup();
		if (manager.getErrorStatus()) {
			ios = new IOStreams (manager.getInputStream(), manager.getOutputStream(), "NET");		
			ios.start ();		
			result = ios.readLine();
			ios.stop();
		} else {
			result = manager.getErrorMessage();
		}
		return result;		
	}
	public String show() {
		String result = "";
		manager.show();
		if (manager.getErrorStatus()) {
			ios = new IOStreams (manager.getInputStream(), manager.getOutputStream(), "NET");		
			ios.start ();		
			result = ios.readLine();
			ios.stop();
		} else {
			result = manager.getErrorMessage();
		}
		return result;		
		//final Command ocm = new CommandExecution ();
		//ocm.connect ();
		//ios = new IOStreams (ocm.getInputStream(), ocm.getOutputStream(), "NET");			
		//ios.start ();							
	}
}
