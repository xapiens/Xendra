package com.dravios.openvpn;

import java.awt.TrayIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import com.dravios.openvpn.checks.Checker;
import com.dravios.openvpn.checks.OpenVPNAvailableChecker;
import com.dravios.openvpn.checks.OpenVPNConfigChecker;
import com.dravios.openvpn.checks.UserPassConfChecker;

public class vpn {

	private static Object connectionManager;
	private static String m_ProcessMsg = "";
	private List<Checker> checkers = new ArrayList<Checker>();
	private IOStreams ios;	
	private config m_config = config.getInstance();
	private DialogConf m_panel;
	private TrayIcon m_trayIcon;	
	
	public void setLoginData (final String usern, final String passwordn) {
		ios.setLoginData (usern, passwordn);
	}
	
	public String check()
	{
		List<Checker> checkers = new ArrayList<Checker>();
		checkers.add(new OpenVPNAvailableChecker());
		checkers.add(new OpenVPNConfigChecker());
		checkers.add(new UserPassConfChecker());
		
		for (Checker checker: checkers) {
			try {
				boolean success = checker.validate();

				if (! success) {
					String message = checker.getMessage();
					if (message != null) {
						appendErrorMessage(message);
					}
				}

				if (! checker.coninueValidation()) {
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
		return m_ProcessMsg;
	}
	
	public void start()
	{				
		final OastConnectionManager ocm = new OastConnectionManager ();
		connectionManager = ocm;
		ocm.connect ();
		ios = new IOStreams (ocm.getInputStream(), ocm.getOutputStream(), "NET");
		ios.setConfig(m_config);
		//ios.loginToManagement();
		//ios.settrayIcon(m_trayIcon);
		ios.start ();		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	// grace timeout before stuff gets constructed, just to work around some
		// arcane UI flaws on Linux when using custom widget SwtFancyText
		//delay ();

//		if (Oast.getConfigurationManager ().isUseCustomWidgets ()) {
//			ios.setOwnedControl (((SwtFancyText)textBox).getContainedControl ());
//		} else {
//			ios.setOwnedControl ((Text)textBox);
//		}		
	}

	private static void appendErrorMessage(String message) {
		m_ProcessMsg += message;		
	}

	public void setControlstatus(DialogConf panel) {
		m_panel = panel;
	}

	public config getConfig() {
		return m_config;		
	}

	public void settrayIcon(TrayIcon trayIcon) {
		m_trayIcon = trayIcon;		
	}

	public void stop() {
		ios.stop();		
	}
}
