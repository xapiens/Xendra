package com.dravios.openvpn.checks;

import com.dravios.openvpn.config;


public class OpenVPNAvailableChecker implements Checker {
    private static final String OPENVPN_CMD = "openvpn";
    private static final String OPENVPN_VERSION_PARAMETER = "--version";

    private static final String ERROR_MESSAGE = 
        "OAST require OpenVPN.\n" + 
        "Please download and install\n" +
        "http://openvpn.net/download.html";
     
    private boolean passed;	
	private config m_config = config.getInstance();

    public boolean coninueValidation() {
        return passed;
    }

    public String getMessage() {
        if (passed) {
            return null;
        } else {
            return ERROR_MESSAGE;
        }
    }

    public boolean validate() {
        try {
            String configOpenVPNDir = m_config.getOpenVPNDir();
            
            if (checkWithConfigParam(configOpenVPNDir) || checkInPath()) {
                passed = true;
            } else {
                passed = false;
            }
        } catch (Exception e) {
            passed = false;
        }
        return passed;
    }
    
	private boolean checkWithConfigParam(String configOpenVPNDir) {
        if (configOpenVPNDir == null) {
            return false;
        }
        
        // for now "configOpenVPNDir" is really a path to executable, not it's directory, so try to exec it
        return tryExec(configOpenVPNDir + " " + OPENVPN_VERSION_PARAMETER);
    }
    
    private boolean checkInPath() {
        return tryExec(OPENVPN_CMD + " " + OPENVPN_VERSION_PARAMETER);
    }
    
    private boolean tryExec(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
