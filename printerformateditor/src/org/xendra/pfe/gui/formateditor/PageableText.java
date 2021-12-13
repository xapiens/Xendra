package org.xendra.pfe.gui.formateditor;

/*
 * This example is from the book "Java Foundation Classes in a Nutshell".
 * Written by David Flanagan. Copyright (c) 1999 by O'Reilly & Associates.  
 * You may distribute this source code for non-commercial purposes only.
 * You may study, modify, and use this example for any purpose, as long as
 * this notice is retained.  Note that this example is provided "as is",
 * WITHOUT WARRANTY of any kind either expressed or implied.
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.print.*;
import java.io.*;
import java.util.Vector;

import javax.imageio.ImageIO;

import org.xendra.printdocument.PrintDocument;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class PageableText implements Pageable, Printable {
	private static final int BLACK = 0xFF000000;
	private static final int WHITE = 0xFFFFFFFF;

	// Constants for font name, size, style and line spacing
	public static String FONTFAMILY = "Monospaced";
	public static int FONTSIZE = 10;
	public static int FONTSTYLE = Font.PLAIN;
	public static float LINESPACEFACTOR = 1.1f;

	PageFormat format;   // The page size, margins, and orientation
	Vector lines;        // The text to be printed, broken into lines
	Font font;           // The font to print with
	int linespacing;     // How much space between lines
	int linesPerPage;    // How many lines fit on a page
	int numPages;        // How many pages required to print all lines
	int baseline = -1;   // The baseline position of the font.
	private PrintDocument m_pd;

	/** Create a PageableText object for a string of text */
	public PageableText(String text, PageFormat format) throws IOException { 
		this(new StringReader(text), format); 
	}

	/** Create a PageableText object for a file of text */
	public PageableText(File file, PageFormat format) throws IOException { 
		this(new FileReader(file), format); 
	}

	/** Create a PageableText object for a stream of text */
	public PageableText(Reader stream, PageFormat format) throws IOException {
		this.format = format;

		// First, read all the text, breaking it into lines.
		// This code ignores tabs, and does not wrap long lines.
		BufferedReader in = new BufferedReader(stream);
		lines = new Vector();
		String line;
		while((line = in.readLine()) != null) 
			lines.addElement(line);

		// Create the font we will use, and compute spacing between lines
		font = new Font(FONTFAMILY, FONTSTYLE, FONTSIZE);
		linespacing = (int) (FONTSIZE * LINESPACEFACTOR);

		// Figure out how many lines per page, and how many pages
		linesPerPage = (int)Math.floor(format.getImageableHeight()/linespacing);
		numPages = (lines.size()-1)/linesPerPage + 1;
	}

	public PageableText(PrintDocument pd, PageFormat format) throws IOException {
		m_pd = pd;
		Reader stream = new StringReader(pd.getOutput());
		BufferedReader in = new BufferedReader(stream);
		this.format = format;
		lines = new Vector();
		String line;
		while((line = in.readLine()) != null)
			lines.addElement(line);	
		font = new Font(FONTFAMILY, FONTSTYLE, FONTSIZE);
		linespacing = (int) (FONTSIZE * LINESPACEFACTOR);

		linesPerPage = (int) Math.floor(format.getImageableHeight()/linespacing);
		numPages = (lines.size()-1)/linesPerPage + 1;

	}

	// These are the methods of the Pageable interface.
	// Note that the getPrintable() method returns this object, which means
	// that this class must also implement the Printable interface.
	public int getNumberOfPages() { return numPages; }
	public PageFormat getPageFormat(int pagenum) { return format; }
	public Printable getPrintable(int pagenum) { return this; }

	/**
	 * This is the print() method of the Printable interface.
	 * It does most of the printing work.
	 */
	public int print(Graphics g, PageFormat format, int pagenum) {
		if (m_pd == null)
			return NO_SUCH_PAGE;
		// Tell the PrinterJob if the page number is not a legal one.
		if ((pagenum < 0) | (pagenum >= numPages)) 
			return NO_SUCH_PAGE;

		// First time we're called, figure out the baseline for our font.
		// We couldn't do this earlier because we needed a Graphics object
		if (baseline == -1) {
			FontMetrics fm = g.getFontMetrics(font);
			baseline = fm.getAscent();
		}

		// Clear the background to white.  This shouldn't be necessary, but is
		// required on some systems to workaround an implementation bug
		g.setColor(Color.white);
		g.fillRect((int)format.getImageableX(), (int)format.getImageableY(),
				(int)format.getImageableWidth(), 
				(int)format.getImageableHeight());

		// Set the font and the color we will be drawing with.
		// Note that you cannot assume that black is the default color!
		g.setFont(font);
		g.setColor(Color.black);

		// Figure out which lines of text we will print on this page
		int startLine = pagenum * linesPerPage;
		int endLine = startLine + linesPerPage - 1;
		if (endLine >= lines.size()) 
			endLine = lines.size()-1;

		// Compute the position on the page of the first line.
		int x0 = (int) format.getImageableX();
		int y0 = (int) format.getImageableY() + baseline;

//		java.util.List<Vector> images = m_pd.getImages();
//		for (Vector image:images) {
//			String filepath = (String) image.firstElement();
//			File file = new File(filepath);
//			BufferedImage img = null;
//			try {
//				img = ImageIO.read(file);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			//BufferedImage img = (BufferedImage) image.firstElement();
//			Point p = (Point) image.lastElement();
//			if (img != null)
//				g.drawImage(img, p.x, p.y, null);
//		}
		//		java.util.List<Vector> qrcodes = m_pd.getQRCodes();
		//		for (Vector qrcode:qrcodes) {
		//			String code = (String) qrcode.firstElement();
		//			Point p = (Point) qrcode.lastElement();
		//			QRCodeWriter qrCodeWriter = new QRCodeWriter();
		//			BitMatrix bitMatrix = null;
		//			try {
		//				bitMatrix = qrCodeWriter.encode(code, BarcodeFormat.QR_CODE, 100, 100);
		//			} catch (WriterException e) {
		//				e.printStackTrace();
		//			}
		//			BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
		//			for (int x = 0; x < 100; x++) {
		//				for (int y = 0; y < 100; y++) {
		//					image.setRGB(x, y, bitMatrix.get(x, y) ? BLACK : WHITE);
		//				}
		//			}    	
		//			if (image != null)
		//				g.drawImage(image, p.x, p.y, null);
		//		}
		// Loop through the lines, drawing them all to the page.
		for(int i=startLine; i <= endLine; i++) {
			// Get the line
			String line = (String)lines.elementAt(i);
			if (m_pd.containQRCode(i)) {
				try {
					QRCodeWriter qrCodeWriter = new QRCodeWriter();
					String code = m_pd.getQRCode(i);
					BitMatrix bitMatrix = qrCodeWriter.encode(code, BarcodeFormat.QR_CODE, 100, 100);
					BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
					for (int x = 0; x < 100; x++) {
						for (int y = 0; y < 100; y++) {
							image.setRGB(x, y, bitMatrix.get(x, y) ? BLACK : WHITE);
						}
					}    
					g.drawImage(image, x0, y0, null);
					Double imagelines = new Double(image.getHeight()) / new Double(linespacing);
					y0 += linespacing * imagelines;  		
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
			else if (m_pd.containCommand(i)) {
				try {
					String command = m_pd.getCommand(i);
					g.drawString(String.format("<%s>", command), x0, y0);
					y0 += linespacing;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else if (m_pd.containsGraphic(i)) {
				try {
					String filename = m_pd.getGraphic(i);
					File file = new File(filename);
					if (file.exists()) {
						BufferedImage image = ImageIO.read(file);
						g.drawImage(image, x0, y0, null);
						Double imagelines = new Double(image.getHeight()) / new Double(linespacing);
						y0 += linespacing * imagelines;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			// Draw the line.
			// We use the integer version of drawString(), not the Java 2D
			// version that uses floating-point coordinates. A bug in early
			// Java2 implementations prevents the Java 2D version from working.
			//else if (line.length() > 0)  {
			else {
				g.drawString(line, x0, y0);
				// Move down the page for the next line.
				y0 += linespacing;
			}						 
		}

		// Tell the PrinterJob that we successfully printed the page.
		return PAGE_EXISTS;
	}

	/**
	 * This is a test program that demonstrates the use of PageableText
	 */
	public static void main(String[] args) throws IOException, PrinterException {
		// Get the PrinterJob object that coordinates everything
		PrinterJob job = PrinterJob.getPrinterJob();

		// Get the default page format, then ask the user to customize it.
		PageFormat format = job.pageDialog(job.defaultPage());

		// Create our PageableText object, and tell the PrinterJob about it
		job.setPageable(new PageableText(new File(args[0]), format));

		// Ask the user to select a printer, etc., and if not canceled, print!
		if (job.printDialog()) 
			job.print();
	}
}


