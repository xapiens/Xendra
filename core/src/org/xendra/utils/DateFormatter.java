package org.xendra.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatter {

    // used to replace previous separate SimpleDateFormats in several other classes
    // with one date format in one place

    public static final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");

    /** Creates a new instance of DateFormatter */
    public DateFormatter() {
    }
    
    public static Date parseDateString(String dateIn) {
	System.out.println("debug: trying to parse date: /" + dateIn + "/\n");
	if (dateIn == null) return null;
	if (dateIn.equals("")) return null;
        String[] dateArray = null;  
        dateArray = dateIn.split("/");
        // from (month, day, year) to (year, month-1, day)
        GregorianCalendar cal = new GregorianCalendar(Integer.valueOf(dateArray[2]).intValue(),
                                                      Integer.valueOf(dateArray[0]).intValue()-1, 
                                                      // month count is zero-based
                                                      Integer.valueOf(dateArray[1]).intValue());
                                                       
        // clean up the date
        //can't use: if (cal.get(Calendar.MONTH) == 0) cal = new GregorianCalendar(); // use current date
        if (cal.get(Calendar.DAY_OF_MONTH) == 0) cal = new GregorianCalendar(); // use current date
        if (cal.get(Calendar.YEAR) < 1900) cal.roll(Calendar.YEAR, 2000);  

        //System.out.println("debug: date out is: " + cal.getTime());
        return cal.getTime();        
    }

}
