package org.xendra.utils;

import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.math.BigDecimal;

import org.compiere.util.Env;
public class Transaction {

	int Org_ID;
	int Client_ID;
	int Record_ID;
    Date date;	
    boolean inflow; // else outflow
    //String category;
    int category;
    int currency;
    String description;
    //double amount;
    BigDecimal amount;
    NumberFormat nf;
    public static final SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    
    public int getAD_Org_ID()
    {
    	return Org_ID;
    }
    
    public int getAD_Client_ID()
    {
    	return Client_ID; 
    }    
    
        
    public Date getDate()
    {
    	return date;
    }
    
    public int getC_Cashflow_Group_ID()
    {
    	return category;
    }
    
    public int getC_Currency_ID()
    {
    	return currency;
    }

    public BigDecimal getAmount() 
    {
    	return amount;
    }

    public String getSign()
    {
    	String inflowString;
    	if (inflow)
    		inflowString = "I";
    	else
    		inflowString = "O";
    	return inflowString;
    }
    
    public String getDescription()
    {
    	return description;
    }
    
    public int getRecord_ID()
    {
    	return Record_ID;
    }
        
    
    public Transaction () {
        //default constructor
        date = new Date();
        date = new GregorianCalendar().getTime(); // default to current date
        inflow = false;
        //category = new String("");
        category = 0;
        description = new String("");
        amount = Env.ZERO;        
        commonConstructorStatements();
    }

    public Transaction (int Org_IDin, int Client_IDin, int RecordIdIn, Date dateIn, boolean inflowIn, int categoryIn,
        String descriptionIn, int currencyIn, BigDecimal amountIn) {
    	Org_ID = Org_IDin;
    	Client_ID = Client_IDin;
        date = dateIn;
        inflow = inflowIn;
        category = categoryIn;
        description = descriptionIn;
        Record_ID = RecordIdIn;
        currency = currencyIn;
        amount = amountIn;
        commonConstructorStatements();
    }

    public Transaction (Date dateIn) {
        // i.e.: for new blank transaction copying date from prior transaction
        this();
        date = dateIn;
    }

    void commonConstructorStatements() {
        // get fixed length date for printing.  all locale dates are variable length
        nf = NumberFormat.getCurrencyInstance();
    }

    public String toString () {
        BigDecimal tempAmount = amount;
        if (inflow) tempAmount = amount;
        else tempAmount = amount.negate();
        String amountString = nf.format(tempAmount);
        return "" + df.format(date) + " " + " " + " "
            + cutAndPad(description, 30, "Right") + " "
            + cutAndPad(amountString, 20, "Left");
        
        //return "" + df.format(date) + " " + cutAndPad(category, 20, "Right") + " "
        //    + cutAndPad(description, 30, "Right") + " "
        //    + cutAndPad(amountString, 20, "Left");
    }

    public String cutAndPad(String stringIn, int lenIn, String padSide) {
      // lenIn is the desired length, including padding, not the length of stringIn
      char [] charArrayOut = new char[lenIn];
      int stringInLength = stringIn.length();
      for (int x = 0; x < lenIn; x++) {
          if (padSide.equals("Right")) {
              if (x < stringInLength) charArrayOut[x] = stringIn.charAt(x);
            else charArrayOut[x] = ' ';
      } else {
        // assume left pad if not right pad
        if (x < (lenIn - stringInLength))
          charArrayOut[x] = ' ';
        else charArrayOut[x] = stringIn.charAt(x - (lenIn - stringInLength));
      }
    }
    String stringOut = new String(charArrayOut);
    return stringOut;
  }

    String getDateAsString() {
        return df.format(date);
    }
    
    Date parseDateString(String dateIn) {
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
	
