package org.xendra.xendrian;

import javax.jms.Session;

public interface IListener {
    
    public void log( String message );
    public String bootstrap();
    public void close();
    public Session getSession();
}
