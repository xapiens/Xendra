package org.xendra.printdocument.driver;

import java.io.FileWriter;
import java.io.IOException;

public class Printer  {
	private Object DriverLock = new Object();
	private FileWriter os = null;
	//private MPrinterDriver m_driver;

	/* Printer commands */
	//public static final String FONT_NORMAL_BOLD     = ((char)0x1b) + "!" + ((char)0x08);
	//public static final String FONT_NORMAL          = ((char)0x1b) + "!" + ((char)0x00);
	//public static final String FONT_CONDENSED       = ((char)0x1b) + "!" + ((char)0x15);
	//public static final String FONT_CANCELCONDENSED = ((char)0x1b) + "!" + ((char)0x18);
	//public static final String FONT_CANCELCONDENSED = ((char)0x1b) + "!" + ((char)0x00);
	//public static final String PAPER_CUT 			= new String(new byte[]{10,29,86,66}); // multimax
	//public static final String PAPER_CUT 			= new String(new byte[]{29,86,1,49});  // creazioni
	//public static final String PAPER_CUT = "GSV" + ((char)0x64)+ ((char)0xfa); // + ((char)0x250);
	//public static final String LINE_FEED			= new String (new byte []{10});
        //public static final String CASHPOS_OPEN        = ((char)0x1b) + "!" + ((char)0x70)+ ((char)0x00)+ ((char)0x07);
        //public static final String CASHPOS_OPEN 		= ((char)0x1b) + "p" + ((char)0x00)+ ((char)0x25); // + ((char)0x250);
        //public static final String CASHPOS_OPEN 		= ((char)0x1b) + "p" + ((char)0x00)+ ((char)0x64)+ ((char)0xfa); // + ((char)0x250);
	
	public Printer(String deviceoutput) throws Exception {
		
		synchronized(DriverLock) {
			try {												
				os = new FileWriter(deviceoutput);
			}
			catch (IOException e) {
				throw new Exception("Could not open the printer: " + e);
			}
		}
	}
	
//	public void setDriver(MPrinterDriver pd) {
//		m_driver = pd;		
////			FONT_NORMAL_BOLD     = ((char)0x1b) + "!" + ((char)0x08);
////			FONT_NORMAL          = ((char)0x1b) + "!" + ((char)0x00);
////			FONT_CONDENSED       = ((char)0x1b) + "!" + ((char)0x15);
////			FONT_CANCELCONDENSED = ((char)0x1b) + "!" + ((char)0x00);
////			PAPER_CUT 			 = new String(new byte[]{10,29,86,66}); // multimax
////			LINE_FEED			 = new String (new byte []{10});			
//	}
//	

//	public void boldOn() throws Exception {
//		try {
//			synchronized(DriverLock) {
//				os.write(m_driver.getFontBold());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}
//	}
//
//	public void boldOff() throws Exception {
//		try {
//			synchronized(DriverLock) {
//				os.write(m_driver.getFontNormal());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}
//	}

//	public void lineFeed() throws Exception {
//		try {
//			synchronized(DriverLock) {
//				os.write(m_driver.getLineFeed());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}
//	}
	
//	public void pageFeed() throws Exception {
//		try {
//			synchronized(DriverLock) {
//				os.write(m_driver.getPageFeed());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}		
//	}

//	public void paperCut() throws Exception {
//		try {
//			synchronized(DriverLock) {
//                 os.write(m_driver.getPaperCut());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}
//	}


//	public void condensedOff() throws Exception {
//		try {
//			synchronized(DriverLock) {
//				os.write(m_driver.getFontNormal());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}
//	}

//	public void condensedOn() throws Exception {
//		try {
//			synchronized(DriverLock) {
//				os.write(m_driver.getFontCondensed());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}
//	}
//
//	public void cashdraweropen() throws Exception {
//		try {
//			synchronized(DriverLock) {				
//				os.write(m_driver.getCashdrawerOpen());
//			}
//		}
//		catch (IOException e) {
//			throw new Exception("Error writing to printer: " + e);
//		}
//	}
        	
	public void output(String text) throws Exception {
		try {
			synchronized(DriverLock) {
				os.write(text);
			}
		}
		catch (IOException e) {
			throw new Exception("Error writing to printer: " + e);
		}
	}
	
	public void close() throws Exception {
		try {
			synchronized(DriverLock) {
				os.flush();
				os.close();
				os = null;
			}
		}
		catch (IOException e) {
			throw new Exception("Error closing printer: " + e);
		}
	}
}