package org.xendra.apps.form;
/*
 * TimeFormat.java
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.DefaultFormatterFactory;

/**
 *
 * @author peter
 */
public class TimeFormat {
    private static final DefaultFormatter timeFormatter =
            new DefaultFormatter() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        
        @Override
        public String valueToString(Object o)
        throws ParseException {
            // Expect something like
            // hh:mm
            if (o==null) {
                return "";
            }
            
            Date date = (Date)o;
            String str = timeFormat.format(date);
            return str;
        }
        @Override
        public Object stringToValue(String s)
        throws ParseException {
            // Expect something like
            // hh:mm
            //System.out.println("String to value from " + s);
            
            if (s.length()==0) {
                return null;
            }
            
            Date date = timeFormat.parse(s);
            return date;
        }
    };
    
    private static final DefaultFormatterFactory timeFormatterFactory = new DefaultFormatterFactory(
            timeFormatter);

    
    public static void setupJFormattedTextField(JFormattedTextField tf) {
        Date now = new Date();
        
        tf.setFormatterFactory(timeFormatterFactory);
        tf.setValue(now);
    }
    
    public static Date getTime(JFormattedTextField tf) {
        return (Date)tf.getValue();
    }
    
    public static void setTime(JFormattedTextField tf, Date d) {
        tf.setValue(d);
    }
    
    /**
     * Gets the date time, using the supplied value for the date part,
     * and this control for the time part.
     *
     */
    public static Date getDate(JFormattedTextField tf, Date date) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        Calendar timeCal = new GregorianCalendar();
        timeCal.setTime(getTime(tf));
        
        cal.set(Calendar.HOUR, timeCal.get(Calendar.HOUR_OF_DAY));
        cal.set(Calendar.MINUTE, timeCal.get(Calendar.MINUTE));
        cal.set(Calendar.SECOND, timeCal.get(Calendar.SECOND));
        cal.set(Calendar.MILLISECOND, timeCal.get(Calendar.MILLISECOND));
        
        return cal.getTime();
    }
    
    
}