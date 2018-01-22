package com.dravios.openvpn.checks;

public interface Checker {
    
    /**
     * @return whether validation passed.
     */
    public boolean validate();
    
    /**
     * @return some message for user, null if no message.
     */
    public String getMessage();
    
    /**
     * @return whether should run remaining checkers
     */
    public boolean coninueValidation();
}
