package org.compiere.model;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import org.compiere.model.persistence.X_A_PrinterDriver;

public class MPrinterDriver extends X_A_PrinterDriver {	
	
	private boolean initialized = false;
	public HashMap m_attribs = new HashMap();
	public MPrinterDriver(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

	public MPrinterDriver(Properties ctx, int A_PrinterDriver_ID, String trxName) {
		super(ctx, A_PrinterDriver_ID, trxName);
		
	}
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ( this.getName() );
		return sb.toString ();
	}	//	toString	

	public void initialize() {
			HashMap props = this.getProperties();
			Iterator iter = props.entrySet().iterator();			
			while (iter.hasNext())
			{
				List<String> sequences = new ArrayList<String>();
				Map.Entry entry = (Map.Entry) iter.next();
				String key = (String) entry.getKey();			
				String code = (String) entry.getValue();
				StringTokenizer tok = new StringTokenizer(code, ".");
				while (tok.hasMoreTokens()) {
					String t = tok.nextToken();
					sequences.add(t);
				}	
				String command = "";
				for (String sequence:sequences)
				{
					int idx = sequence.indexOf("|");
					if (idx > 0)
					{
						String type = sequence.substring(0,idx);
						String value = sequence.substring(idx+1);	
						if (type.equals("char"))
						{
			
							int decode = Integer.decode(value);
							char nvalue = (char) decode;
							command += nvalue;
						}
						else if (type.equals("string"))
						{
							command += value;
						}
						else if (type.equals("byte"))
						{
							BigInteger bi = BigInteger.valueOf(Integer.valueOf(value));							
							byte[] bytes = bi.toByteArray();
							String nvalue = new String(bytes);
							command += nvalue;
						}
						else
						{
							System.out.println("X");
						}
					
					}
				}
				m_attribs.put(key, command);
			}			
			initialized = true;
	}	
	private String getProperty(String key) {
		if (!initialized)
		{
			initialize();
		}
		String value = "";
		if (m_attribs.containsKey(key))
			value = (String) m_attribs.get(key);		
		return value;
	}
	public String getFontNormal() {
		return getProperty("normal");		
	}
	public String getFontBold() {
		return getProperty("bold");
	}
	public String getFontCondensed() {
		return getProperty("condensed");	
	}
	public String getPaperCut() {
		return getProperty("paper_cut");
	}
	public String getLineFeed() {
		return getProperty("line_feed");
	}
	public String getPageFeed() {
		return getProperty("page_feed");
	}
	public String getCashdrawerOpen() {
		return getProperty("cashdrawer_open");
	}	
}
