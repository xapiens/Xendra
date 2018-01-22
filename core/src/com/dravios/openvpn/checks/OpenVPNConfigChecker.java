package com.dravios.openvpn.checks;

import java.io.File;

import com.dravios.openvpn.config;



public class OpenVPNConfigChecker implements Checker {
    private static final String CANNOT_FIND_CONF = "Can't find configuration file for OpenVPN";
    private static final String PLEASE_CHECK_SETTINGS = "Please check OAST settings.";
    
    private String message;	
	private config m_config = config.getInstance();
    
    public boolean coninueValidation() {
        return true;
    }

    public String getMessage() {
        return message;
    }

    public boolean validate() {
        final String conf = m_config.getConfigFile();
        
        message = null;
        validateConfig(conf, CANNOT_FIND_CONF);
        
        if (message != null) {
            message += PLEASE_CHECK_SETTINGS;
            return false;
        } else {
            return true;
        }
    }
    
	private void validateConfig(String configFile, String errorMessage) {
		if (configFile == null) {
			message = (message == null ? "" : message) + errorMessage + "\n";
		}
		else if (! new File(configFile).exists()) {
            message = (message == null ? "" : message) + errorMessage + "\n";
        }
    }

}
