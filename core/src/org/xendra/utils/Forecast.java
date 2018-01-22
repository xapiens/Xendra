package org.xendra.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import org.compiere.model.PO.*;
import org.compiere.model.persistence.X_C_Cashflow_Group;


//import cfforecaster.ArrayHandler;
//import cfforecaster.DateFormatter;
//import cfforecaster.Transaction;
//import cfforecaster.TransactionSet;

public class Forecast {

    public TransactionSet[] ts;
    String name;

    /** Creates a new instance of Forecast */
    public Forecast() {
        name = "Default";
    }

    public Forecast(String nameIn) {
        name = nameIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameIn) {
        name = nameIn;
    }

    public int getTransactionSetCount() {
        return ts.length;
    }

    public void addTransactionSet(TransactionSet tsAdd) {
        if (ts == null) {
            ts = new TransactionSet[1];
            ts[0] = tsAdd;
        } else {
            ts = ArrayHandler.growTranSetAndAdd(tsAdd, ts);
        }
    }

    public void deleteTransactionSet(int tsIndex) {
        // put here instead of ArrayHandler because not used by any other array
        if (ts.length == 1) {
            ts = new TransactionSet[0];
        } else {
            TransactionSet[] tsTemp = new TransactionSet[ts.length-1];
            for (int i = 0; i < tsIndex; i++) {
                tsTemp[i] = ts[i];
            }
            for (int i = tsIndex; i < tsTemp.length; i++) {
                tsTemp[i] = ts[i+1];
            }
            ts = tsTemp;
        }
    }

    void writeForecastToFile(String nameIn) {
        try {
            PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter("CFP" + nameIn + ".txt")));
            if (ts != null) { // use test if forecast does not have any transaction sets yet
                for (int i=0; i < ts.length; i++) {
                    out.println(ts[i].tsForWriteToFile());
                }
            } else {
                // no transaction sets yet, ie: writing a new forecast
                out.println(DateFormatter.df.format((new GregorianCalendar().getTime())) + "|" + "true"
                    + "|" + " " + "|" + " " + "|" +
                    "0" + "|" + "false" + "|" + "0" +
                    "|" + " " + "|" + " ");
            }
            out.close();
        } catch (IOException ioe) {
            System.err.println("io exception: " + ioe);
        }
    }

    void readForecastFromFile(String nameIn) {
        String line;
        String fileName = "CFP" + nameIn + ".txt";

        ts = null; // empty current ts

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            while ((line = in.readLine()) != null) {
                String[] readSet = new String[9];
                int index = 0;
                StringTokenizer st = new StringTokenizer(line,"|");
                while (st.hasMoreTokens()) {
                    readSet[index++] = st.nextToken();
                }

                if (readSet[2] == null) {
                    // debugging System.out.println("readSet[2] == null");
                    readSet[2] = " "; // assign blank category
                }
                if (readSet[3] == null) {
                    // debugging System.out.println("readSet[3] == null");
                    readSet[3] = " "; // assign blank description
                }
                if (readSet[7] == null) {
                    readSet[7] = " "; // assign blank frequencyUnit
                }
                if (readSet[8] == null) {
                    readSet[8] = " "; // assign blank untilDate
                }

 /*               addTransactionSet(new TransactionSet(new Transaction(
                    DateFormatter.df.parse(readSet[0]),
                    (new Boolean(readSet[1])).booleanValue(),
                    readSet[2],readSet[3],
                    Double.parseDouble(readSet[4])),
                    (new Boolean(readSet[5])).booleanValue(),
                    readSet[6], readSet[7], readSet[8]));*/
                // debugging System.out.println("added new transactionset from file");
            }
            in.close();
        } catch (IOException ioe) {
            System.err.println("io exception: " + ioe);
        } /*catch (java.text.ParseException pe) {
            // for parsing date from readSet[0]
            System.err.println("parse exception: " + pe);
        }*/
    }

    Transaction[] generateDetailForReport(Date fromDate, Date toDate) {
        Transaction[] detailForReport = new Transaction[0];
        for (int i = 0; i < ts.length; i++) {
            Transaction[] temp = ts[i].generateTransactions(fromDate, toDate);
            Transaction[] temp2 = new Transaction[detailForReport.length+temp.length];
            for (int j = 0; j < detailForReport.length; j++) {
                temp2[j] = detailForReport[j];
            }
            for (int j = detailForReport.length; j < detailForReport.length+temp.length; j++) {
                temp2[j] = temp[j-detailForReport.length];
            }
            detailForReport = new Transaction[detailForReport.length+temp.length];
            detailForReport = temp2;
        }
        return detailForReport;
    }
    
    String[] getCategoryList() {
        // there might be a better algorithm for "select distinct"    	
        String[] fullList = new String[ts.length];
        for (int i = 0; i < ts.length; i++) {
        	X_C_Cashflow_Group cashflowgroup = new X_C_Cashflow_Group (null, ts[i].t.category, null);
            //fullList[i] = ts[i].t.category;
        	fullList[i] = cashflowgroup.getDescription();
            //System.out.println("debug: Forecast.getCategoryList adding: " + fullList[i]);
        }
        if (fullList.length <= 1) return fullList;
        
        Arrays.sort(fullList);
        String list[] = new String[fullList.length]; 
        // list is as long as fullList, but does not include duplicates in fullList
        list[0] = fullList[0];
        int counter = 1;
	for (int i = 1; i < fullList.length; i++) {
            if (fullList[i] != null && !fullList[i].equals("")) {
                // skip nulls and blanks
                if (!fullList[i].equals(fullList[i-1])) {
                    // skip duplicates
                    list[counter] = fullList[i];
                    //System.out.println("debug: Forecast.getCategoryList adding unique: " + list[i]);
                    counter++;
                }
            }
        }
        String[] distinctList = new String[counter];
        for (int i = 0; i < counter; i++) distinctList[i] = list[i];
        return distinctList;
    }

    String[] getDescriptionList() {
        String[] fullList = new String[ts.length];
        for (int i = 0; i < ts.length; i++) {
            fullList[i] = ts[i].t.description;
        }
        if (fullList.length <= 1) return fullList;
        
        Arrays.sort(fullList);
        String list[] = new String[fullList.length]; 
        // list is as long as fullList, but does not include duplicates in fullList
        list[0] = fullList[0];
        int counter = 1;
	for (int i = 1; i < fullList.length; i++) {
            if (fullList[i] != null && !fullList[i].equals("")) {
                // skip nulls and blanks
                if (!fullList[i].equals(fullList[i-1])) {
                    // skip duplicates
                    list[counter] = fullList[i];
                    counter++;
                }
            }
        }
        String[] distinctList = new String[counter];
        for (int i = 0; i < counter; i++) distinctList[i] = list[i];
        return distinctList;
    }

}
