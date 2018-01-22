/*
 * Created on Dec 24, 2004
 * 
 * Project: NachoCalendar
 * 
 * DateSelectionListener.java
 */
package net.sf.nachocalendar.tasks.event;

import java.util.EventListener;

/**
 * @author Ignacio Merani
 *
 * 
 */
public interface DateSelectionListener extends EventListener {

    /**
     * @param e
     */
    public void valueChanged(DateSelectionEvent e);
}
