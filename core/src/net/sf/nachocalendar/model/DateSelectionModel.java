/*
 *  NachoCalendar
 *
 * Project Info:  http://nachocalendar.sf.net
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation;
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * Changes
 * -------
 *
 * -------
 *
 * DateSelectionModel.java
 * 
 * Created on Dec 24, 2004
 * 
 */
package net.sf.nachocalendar.model;

import java.util.Date;

import net.sf.nachocalendar.event.DateSelectionListener;

/**
 * @author Ignacio Merani
 *
 * 
 */
public interface DateSelectionModel {
    public static final int SINGLE_SELECTION = 0;
    public static final int SINGLE_INTERVAL_SELECTION = 1;
    public static final int MULTIPLE_INTERVAL_SELECTION = 2;
    
    
    /** Adds the interval to the selection.
     * @param from
     * @param to
     */
    public void addSelectionInterval(Date from, Date to);

    /**
     *  Clears the current selection.
     */
    public void clearSelection();

    /** Checks if provided date is selected.
     * @return true if date is selected
     */
    public boolean isSelectedDate(Date date);

    /** Checks if selection is empty.
     * @return true if selection is empty.
     */
    public boolean isSelectionEmpty();
    
    /**
     * @return
     */
    public int getSelectionMode();
    
    /**
     * @param selectionMode
     */
    public void setSelectionMode(int selectionMode);
    

    /** Removes the interval from selection.
     * @param from starting date
     * @param to end date
     */
    public void removeSelectionInterval(Date from, Date to);

    /**
     * Registers DateSelectionListener to receive events.
     * @param listener The listener to register.
     */
    public void addDateSelectionListener(DateSelectionListener listener);

    /**
     * Removes DateSelectionListener from the list of listeners.
     * @param listener The listener to remove.
     */
    public void removeDateSelectionListener(DateSelectionListener listener);
    
    /**
     * @return
     */
    public Date getLeadSelectionDate();
    
    /**
     * @param date
     */
    public void setLeadSelectionDate(Date date);
    
    /**
     * @return
     */
    public Object getSelectedDate();
    
    /**
     * @return
     */
    public Object[] getSelectedDates();
    
    /**
     * @param date
     */
    public void setSelectedDate(Object date);
    
    /**
     * @param date
     */
    public void setSelectedDates(Object[] dates);
}