package org.xendra.printdocument;

import output.PrinterOutputStream;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        String[] printServicesNames = PrinterOutputStream.getListPrintServicesNames();
        for (String printServiceName : printServicesNames) {
            System.out.println(printServiceName);
        }

	}

}
