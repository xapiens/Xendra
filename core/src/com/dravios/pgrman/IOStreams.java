package com.dravios.pgrman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class IOStreams {
	private OutputStream os;
	private InputStream is;
	private String type;
	private String buffer = "";
	private boolean stopped;
	private boolean errorOccured = false;

	public IOStreams (InputStream is, OutputStream os, String type) {
		this.is = is;
		this.os = os;
		this.type = type;
	}
	public String readLine () {
		return buffer;
	}
	public boolean isStopped () {
		return stopped;
	}
	public boolean getErrorStatus () {
		return !errorOccured;
	}
	public void start() {
		InputStreamReader isr = new InputStreamReader (is);
		BufferedReader br = new BufferedReader (isr);
		stopped = false;		
		try {
		      BufferedReader reader = new BufferedReader(isr);
		      StringBuffer sb = new StringBuffer();
		      String str;
		      while((str = reader.readLine())!= null){
		         sb.append(str);
		      }
		      System.out.println(sb.toString());
			//
			String line = null;
			while (true) {
				if (!stopped) {
					line = br.readLine ();
					if (line != null) {
						if (line.indexOf ("Initialization Sequence Completed") != -1) {
							// Process process = runtimeEnv.exec(cmd);	
						}
					} else {
						break;
					}
				} else {
					break;
				}
				setbuffer(line);				
					System.out.println ("> " + line);
				if (line.indexOf ("[EHOSTUNREACH|EHOSTUNREACH]: No route to host (code=113)") != -1) {
					errorOccured = true;
					break;
				}
				if (line.indexOf ("AUTH: Received AUTH_FAILED control message") != -1) {
					errorOccured = true;
					break;
				}

				if (line.indexOf ("Exiting") != -1) {
					errorOccured = true;
					break;
				}
				// fill details bean
				if (line.indexOf("") != -1) {

				}

				try {
					Thread.sleep (100);
				} catch (InterruptedException sxc) {

				}
			}
		} catch (IOException ioe) {
			// ioe.printStackTrace ();
		}
		stopped = true;
	}
	
	private void setbuffer(String line) {
		buffer += line;
	}
	public void stop() {
		stopped = true;
	}
}
