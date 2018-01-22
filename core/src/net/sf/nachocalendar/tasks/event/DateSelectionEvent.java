/*
 * Created on Dec 24, 2004
 * 
 * Project: NachoCalendar
 * 
 * DateSelectionEvent.java
 */
package net.sf.nachocalendar.tasks.event;

import java.util.EventObject;

/**
 * @author Ignacio Merani
 *
 * 
 */
public class DateSelectionEvent extends EventObject {

    /**
     * @param source
     */
    public DateSelectionEvent(Object source) {
        super(source);
    }
}
