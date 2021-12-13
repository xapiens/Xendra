package com.dravios.openvpn;

import java.awt.TrayIcon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class IOStreams  {
	private OutputStream os;
	private InputStream is;
	private String type;
	private String user;
	private String password;
	private boolean stopped;
	private boolean errorOccured = false;
	private String buffer;
	private config m_config;
	private Object command;
	private Runtime runtimeEnv  = Runtime.getRuntime ();
	private TrayIcon m_trayIcon;	

	IOStreams (InputStream is, OutputStream os, String type) {
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

	public void setLoginData (final String usern, final String passwordn) {
		user = usern;
		password = passwordn;
	}

//	public void setOwnedControl (Text c) {
//		control = c;
//	}

	public void start() {
		InputStreamReader isr = new InputStreamReader (is);
		BufferedReader br = new BufferedReader (isr);
		stopped = false;		
		try {
			//
			String line = null;

			while (true) {
				if (!stopped) {
					line = br.readLine ();
					if (line != null) {
						if (line.indexOf ("Initialization Sequence Completed") != -1) {
							String cmd = m_config.getcmd();
							if (cmd == null)
								cmd = "";
							if (cmd.length() > 0)
							{
								Process process = runtimeEnv.exec(cmd);	
							}							
							m_trayIcon.setImage(VpnClient.createImage(VpnClient.enabled,"conectado"));
							/* synchronized (control) {
                                Oast.swtf.swtFrameShell.getDisplay ().asyncExec (new Runnable () {
                                    public void run () { if (control != null) control.append ("> Initialization Sequence Completed\n"); } } );
                            } */
//							SwtFrame.notifyFinalizers (new FinalizedEvent (this));

							// break;
						}
					} else {
						break;
					}
				} else {
					break;
				}

				buffer = line;
//				synchronized (control) {
//					Oast.getSwtFrame().swtFrameShell.getDisplay().asyncExec (new Runnable () {
//						@Override
//						public void run () { if (!stopped && control != null) {
//							control.append ("> " + buffer + "\n");
//						} } } );
//				}

				//if (Oast.getConfigurationManager ().isDebugOpenVPN ()) {
					System.out.println ("> " + line);
				//}

				if (line.indexOf ("[EHOSTUNREACH|EHOSTUNREACH]: No route to host (code=113)") != -1) {
//					Oast.showErrorMessage ("No route to host");
//					Oast.getOastConnection ().setCurrentStatus (Oast.CONNECTION_ERROR);
//					Oast.getOastConnection ().setStatusMessage (Oast.CONNECTION_ERROR,
//							Oast.getOastConnection ().getStatusMessage (Oast.CONNECTION_ERROR) + ": No route to host");
					errorOccured = true;
					break;
				}

				/*                if (line.indexOf ("Connection reset") != -1) {
                    Oast.showErrorMessage ("Connection reset");
                    Oast.getOastConnection ().setCurrentStatus (Oast.CONNECTION_ERROR);
                    Oast.getOastConnection ().setStatusMessage (Oast.CONNECTION_ERROR,
                    Oast.getOastConnection ().getStatusMessage (Oast.CONNECTION_ERROR) + ": Connection reset");
                    Oast.getSwtFrame().swtFrameShell.getDisplay ().asyncExec (new Runnable () {
                        public void run () {
                            Oast.setDisconnected ();
                        }
                    });

                    errorOccured = true;
                    // break;
                }
				 */
				if (line.indexOf ("AUTH: Received AUTH_FAILED control message") != -1) {
//					Oast.getOastConnection ().setCurrentStatus (Oast.CONNECTION_ERROR);
//					Oast.getOastConnection ().setStatusMessage (Oast.CONNECTION_ERROR,
//							Oast.getOastConnection ().getStatusMessage (Oast.CONNECTION_ERROR) + ": Authorization failed");
					errorOccured = true;
//					Oast.showErrorMessage ("Authentication failed. Incorrect username/password or your subscription has expired");
					break;
				}

				if (line.indexOf ("Exiting") != -1) {
					errorOccured = true;
					break;
				}

				if (line.indexOf ("Need password(s)") != -1) {
					loginToManagement();
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

	public void loginToManagement() {
		PrintWriter output;
		int retries = 0;
		boolean success = false;

		while ((retries < 10) && (!success)) {
			Socket ClientSocket = null;
			try {
				ClientSocket = new Socket ("127.0.0.1", m_config .getManagementPort());
				InputStream sin = ClientSocket.getInputStream ();
				OutputStream sout = ClientSocket.getOutputStream ();
				InputStreamReader insr = new InputStreamReader (sin);
				BufferedReader reader = new BufferedReader (insr);
				String s = null;
				//char [] input = password.toCharArray ();
				//String pw = "";

				output = new PrintWriter (sout, true);
				while ((s = reader.readLine ()) != null && !stopped) {
					if (s.indexOf ("PASSWORD:Need 'Auth' username/password") != -1) {
						output.println ("username Auth " + user);
						if (reader.readLine ().indexOf ("SUCCESS") != -1) {
							output.println ("password Auth " + password);
						}
						if (reader.readLine ().indexOf ("SUCCESS") != -1) {
							break;
						}
					}
					System.out.println (s);
				}
				success = true;
			} catch (IOException se) {
				System.out.println ("Connecting to management interface... retrying.");
				++retries;
				try {
					Thread.sleep (2500);
				} catch (InterruptedException d) { }
			} finally {
				try {
					ClientSocket.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//		return output;
	}

	public void updateDetails() {
		InputStreamReader isr = new InputStreamReader (is);
		BufferedReader br = new BufferedReader (isr);

		try {
			//
			String line = null;
			while (true) {
				if (!stopped) {
					line = br.readLine();
					if (line == null) {
						break;
					}
				} else {
					break;
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void stop() {
		stopped = true;
	}

	public void setConfig(config Config) {
		m_config = Config;
		setLoginData(m_config.getUser(), m_config.getpwd());
	}

	public void settrayIcon(TrayIcon trayIcon) {
		m_trayIcon = trayIcon;		
	}
}
