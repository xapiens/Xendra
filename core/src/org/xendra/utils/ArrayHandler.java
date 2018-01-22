package org.xendra.utils;

import java.util.Date;

public class ArrayHandler {

    /** Creates a new instance of ArrayHandler */
    public ArrayHandler() {
    }

    public static Transaction[] growTranAndAdd (Transaction t, Transaction[] tarray) {
        Transaction[] temp = new Transaction[tarray.length+1];
        for (int i = 0; i < tarray.length; i++) {
            temp[i] = tarray[i];
        }
        temp[tarray.length] = t;
        return temp;
    }

    public static TransactionSet[] growTranSetAndAdd (TransactionSet ts, TransactionSet[] tsarray) {
        TransactionSet[] temp = new TransactionSet[tsarray.length+1];
        for (int i = 0; i < tsarray.length; i++) {
            temp[i] = tsarray[i];
        }
        temp[tsarray.length] = ts;
        return temp;
    }

    public static String[] growStringAndAdd (String s, String[] sarray) {
        String[] temp = new String[sarray.length+1];
        for (int i = 0; i < sarray.length; i++) {
            temp[i] = sarray[i];
        }
        temp[sarray.length] = s;
        return temp;
    }
    
    public static double[] growdoubleSetAndAdd (double d, double[] darray) {
        double[] temp = new double[darray.length+1]; 
        // new works for arrays of primitives (not for non-array primitives)
        for (int i = 0; i < darray.length; i++) {
            temp[i] = darray[i];
        }
        temp[darray.length] = d;
        return temp;
    }

    public static Date[] growDateSetAndAdd (Date d, Date[] darray) {
        Date[] temp = new Date[darray.length+1];
        for (int i = 0; i < darray.length; i++) {
            temp[i] = darray[i];
        }
        temp[darray.length] = d;
        return temp;
    }
}
