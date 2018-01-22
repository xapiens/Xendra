package org.xendra.xendrian;

import javax.jms.Session;

public interface IRulesServices {
    
    public void log( String message );
    public String bootstrap();
    public void close();
    public Session getSession();
}
