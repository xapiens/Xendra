package com.dravios.openvpn;

import java.io.InputStream;
import java.io.OutputStream;

public class OastConnectionManager {
	public static final int WINDOWS = 0;
	public static final int UNIX = 1;
	public static final int MACOS = 2;    
	private OastConnectionStatus connectionStatus;
    private Runtime runtimeEnv  = Runtime.getRuntime ();
    private Process process;
    private boolean errStatus;
//    OastConfigurationManager configMan;
    InputStream in;
    OutputStream out;
	private config m_config = config.getInstance();

//    public OastConnectionManager (OastConfigurationManager ocm) {
//        runtimeEnv = Runtime.getRuntime ();
//        connectionStatus = new OastConnectionStatus ();
//        configMan = null;
//    }

    public void connect () {
        String cfg;

        if (m_config.getConfigFile () != null)
            cfg = m_config.getConfigFile ();
        else
            cfg = "openvpn.conf";

        String ovx = "openvpn";

        if (m_config.getOpenVPNDir () != null)
            ovx = m_config.getOpenVPNDir ();        // override ovx here with the value guessed or set by the user explicitly

        String file = checkConfigFile (cfg);
        System.out.println ("Trying configuration: " + file);
        String command = ovx + " --config " + file + " --management 127.0.0.1 " + m_config.getManagementPort () + " --management-query-passwords";
        System.out.println ("Trying out: " + command);

        try {
            process = runtimeEnv.exec (command);
            in = process.getInputStream ();
            out = process.getOutputStream ();
            errStatus = false;
        } catch (Exception e) {
            errStatus = true; 
            e.printStackTrace ();
            e.getMessage ();
        }
    }


	public void disconnect () {
        process.destroy ();
    }

    public OastConnectionStatus getConnectionStatus () {
        return connectionStatus;
    }

    public Process getProcess () {
        return process;
    }

    public boolean getErrorStatus () {
        return errStatus;
    }

    public InputStream getInputStream() {
        return in;
    }

    public OutputStream getOutputStream() {
        return out;
    }

    private String checkConfigFile (final String c) {
        if (c.indexOf (" ") != -1) {
            if (getEnv () == UNIX || getEnv () == MACOS)
                return c.replace (" ", "\\ ");
            else
                return ("\"" + c + "\"");
        } else
            return c;
    }
	/**
	 * determine the runtime environment
	 */
	public static final int getEnv () {
		if (System.getProperty ("os.name").equals ("Linux")) {
			return UNIX;
		} else {
			return WINDOWS;
		}
	}
    
}
