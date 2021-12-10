package org.xendra.controls;

import java.util.Date;

import org.compiere.grid.ed.VDate;
import java.util.Locale;

import com.l2fprod.common.beans.editor.AbstractPropertyEditor;

public class CalendarPropertyEditor extends AbstractPropertyEditor {
	private String dateFormatString;
	  /**
	   * Constructor for NachoCalendarDatePropertyEditor
	   */
	  public CalendarPropertyEditor() {
	    editor = new VDate();
	    ((VDate)editor).setValue(new Date());
	  }	
	  
	  /**
	   * Constructor for NachoCalendarDatePropertyEditor
	   * 
	   * @param dateFormatString string used to format the Date object,
	   *          see: <b>java.text.SimpleDateFormat </b>
	   * 
	   * @param locale Locale used to display the Date object
	   */
	  public CalendarPropertyEditor(String dateFormatString, Locale locale) {
	    editor = new VDate();
	    ((VDate)editor).setValue(new Date());
	  }
	  
	  /**
	   * Constructor for NachoCalendarDatePropertyEditor
	   * 
	   * @param locale Locale used to display the Date object
	   */
	  public CalendarPropertyEditor(Locale locale) {
	    editor = new VDate();
	    ((VDate)editor).setValue(new Date());
	    ((VDate)editor).setLocale(locale);
	  }
	  
	  /**
	   * Returns the Date of the Calendar
	   * 
	   * @return the date choosed as a <b>java.util.Date </b>b> object or
	   *         null is the date is not set
	   */
	  public Object getValue() {
	    return ((VDate)editor).getValue();
	  }
	  
	  /**
	   * Sets the Date of the Calendar
	   * 
	   * @param value the Date object
	   */
	  public void setValue(Object value) {
	    if (value != null) {
	      ((VDate)editor).setValue(value);
	    }
	  }
	  
	  /**
	   * Returns the Date formated with the locale and formatString set.
	   * 
	   * @return the choosen Date as String
	   */
	  public String getAsText() {
	    Date date = (Date)getValue();
	    java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
	      getDateFormatString());
	    String s = formatter.format(date);
	    return s;
	  }
	  
	  /**
	   * Sets the date format string. E.g "MMMMM d, yyyy" will result in
	   * "July 21, 2004" if this is the selected date and locale is
	   * English.
	   * 
	   * @param dateFormatString The dateFormatString to set.
	   */
	  public void setDateFormatString(String dateFormatString) {
	    this.dateFormatString = dateFormatString;
	  }

	  /**
	   * Gets the date format string.
	   * 
	   * @return Returns the dateFormatString.
	   */
	  public String getDateFormatString() {
	    return dateFormatString;
	  }
	  
	  /**
	   * Sets the locale.
	   * 
	   * @param l The new locale value
	   */
	  public void setLocale(Locale l) {
	    ((VDate)editor).setLocale(l);
	  }

	  /**
	   * Returns the Locale used.
	   * 
	   * @return the Locale object
	   */
	  public Locale getLocale() {
	    return ((VDate)editor).getLocale();
	  }	  	 
}
