package org.xendra.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TransactionSet {

    Transaction t;
    boolean recurring;
    int frequencyCount;
    String frequencyUnit;
    Date untilDate;

    public TransactionSet() {
        // default constructor
        t = new Transaction();
        recurring = false;
        frequencyCount = 0;
        frequencyUnit = null;
        untilDate = null;
    }

    public TransactionSet(Transaction tIn, boolean recurringIn, int frequencyCountIn,
        String frequencyUnitIn) {
        t = tIn;
        recurring = recurringIn;
        if (recurring) {
            //if (frequencyCountIn.equals("")) {
            //    frequencyCount = 0; // to avoid Integer parse exception
            //} else {
            //    frequencyCount = (new Integer(frequencyCountIn)).intValue();
            //}
        	frequencyCount = frequencyCountIn;
            frequencyUnit  = frequencyUnitIn;
        } else {
            frequencyCount = 0;
            frequencyUnit = "";
        }
        untilDate = null;
    }

    public TransactionSet(Transaction tIn, boolean recurringIn, int frequencyCountIn,
        String frequencyUnitIn, Date untilDateIn) {
            this(tIn, recurringIn, frequencyCountIn, frequencyUnitIn);
            //if (untilDateIn.equals(" ")) {
                // do nothing
            //} else if (untilDateIn.equals("")) {
                // do nothing
            //} else 
            if (untilDateIn == null) {
                // do nothing
            } else {
                //try {
                    //untilDate = DateFormatter.df.parse(untilDateIn);
                	untilDate = untilDateIn;
                //} catch (java.text.ParseException pe) {
                //    System.out.println("Parse exception in TransactionSet constructor: " + pe);
                //    System.out.println("untilDateIn is:" + untilDateIn + "|ending here");
                //    if (untilDateIn == null) System.out.println("untilDateIn is null");
                //    untilDate = null;
                //}
            }
    }

    public TransactionSet(Date dateIn) {
        t = new Transaction(dateIn);
        recurring = false;
        frequencyCount = 0;
        frequencyUnit = null;
        untilDate = null;
    }

    public Transaction[] generateTransactions (java.util.Date dateFrom, java.util.Date dateTo) {
        Transaction[] tranTemp = new Transaction[0];

        if (recurring) {
            // switch recurring field if invalid frequency unit
            String[] tempList = getFrequencyUnits();
            boolean freqOkay = false;
            for (int i=0; i < tempList.length; i++) {
                if (frequencyUnit.equals(tempList[i])) freqOkay = true;
            }
            recurring = freqOkay;
        }

        if (!recurring) {
            if (t.date.compareTo(dateFrom) >= 0) {
                if (t.date.compareTo(dateTo) <= 0) {
                    tranTemp = new Transaction[1];
                    tranTemp[0] = t;
                    return tranTemp;
                }
            }
        }
        if (recurring) {
            java.util.Date currentDate = new java.util.Date(0);
            currentDate = t.date;
            Date endDate = dateTo;
            if (untilDate != null) {
                if (untilDate.compareTo(endDate) < 0) {
                    // if untilDate is before dateTo, use untilDate
                    endDate = untilDate;
                }
            }
            while (currentDate.compareTo(endDate) <= 0) {
                if(currentDate.compareTo(dateFrom) >= 0) {
                    Transaction tTemp = new Transaction (t.getAD_Org_ID(), t.getAD_Client_ID(),t.getRecord_ID(), currentDate, t.inflow, t.category,
                        t.description,t.getC_Currency_ID(), t.amount);
                    tranTemp = ArrayHandler.growTranAndAdd(tTemp,tranTemp);
                }
                currentDate = incrementDate(currentDate);
            }

        }
        return tranTemp;
    }

    public static String[] getFrequencyUnits() {
        // master list of valid frequencyUnits
        String[] list = {   "D",
                            "W",
                            "M",
                            "Q",
                            "Y" };
        return list;
    }

    Date incrementDate(Date dateIn) {
        // System.out.println("entering incrementDate with " + dateIn);

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dateIn);

        if (frequencyUnit.equals("D")) gc.add(Calendar.DATE, 1 * frequencyCount);
        if (frequencyUnit.equals("W")) gc.add(Calendar.DATE, 7 * frequencyCount);
        if (frequencyUnit.equals("M")) gc.add(Calendar.MONTH, 1 * frequencyCount);
        if (frequencyUnit.equals("Q")) gc.add(Calendar.MONTH, 3 * frequencyCount);
        if (frequencyUnit.equals("Y")) gc.add(Calendar.MONTH, 12 * frequencyCount);

        // getTime returns a java.util.Date
        return gc.getTime();
    }

    String tsForWriteToFile() {
        // on reading file, tokenizer gives next non-null value, so must not
        // write null values to file.  Change data before writing:
    	
        //if (t.category.equals("")) t.category = " ";
        if (t.description.equals("")) t.description = " ";
        if (frequencyUnit.equals("")) frequencyUnit = " ";

        String returnValue = "" + DateFormatter.df.format(t.date) + "|" + t.inflow +
            "|" + t.category + "|" + t.description + "|" +
            t.amount + "|" + recurring + "|" + frequencyCount
            + "|" + frequencyUnit + "|"; // last pipe before untilDate

        if (untilDate != null) {
            returnValue = returnValue + DateFormatter.df.format(untilDate);
        } else {
            returnValue = returnValue + " ";
        }

        return returnValue;
    }

    String getUntilDateAsString() {
        if (untilDate == null) {
            return "";
        }
        return DateFormatter.df.format(untilDate);
    }
    
    

}
