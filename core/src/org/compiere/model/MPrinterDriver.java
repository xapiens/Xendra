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
import org.xendra.printdocument.driver.PrinterDriver;

public class MPrinterDriver extends X_A_PrinterDriver implements PrinterDriver {	
	
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
						if (type.equals("char")) {
			
							int decode = Integer.decode(value);
							char nvalue = (char) decode;
							command += nvalue;
						}
						else if (type.equals("string")) {
							command += value;
						}
						else if (type.equals("byte")) {
							BigInteger bi = BigInteger.valueOf(Integer.valueOf(value));							
							byte[] bytes = bi.toByteArray();
							String nvalue = new String(bytes);
							command += nvalue;
						}
						else if (type.equals("hex")) {
							Integer i = Integer.decode(value);
							BigInteger bi = BigInteger.valueOf(i);
							byte[] bytes = bi.toByteArray();
							String nvalue = new String(bytes);
							command += nvalue;
						}
						else
						{
							System.out.println("X20");
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

	@Override
	public String beeper() {
		return getProperty(PrinterDriver.beeper);		
	}
	@Override
	public String line_space_24() {
		return getProperty(PrinterDriver.line_space_24);		
	}
	@Override
	public String line_space_30() {
		return getProperty(PrinterDriver.line_space_30);		
	}
	@Override
	public String image_mode() {
		return getProperty(PrinterDriver.image_mode);
	}
	@Override
	public String hw_init() {
		return getProperty(PrinterDriver.hw_init);
	}
	@Override
	public String cd_kick_2() {
		return getProperty(PrinterDriver.cd_kick_2);
	}
	@Override
	public String cd_kick_5() {
		return getProperty(PrinterDriver.cd_kick_5);
	}
	@Override
	public String paper_full_cut() {
		return getProperty(PrinterDriver.paper_full_cut);
	}
	@Override
	public String paper_part_cut() {
		return getProperty(PrinterDriver.paper_part_cut);
	}
	@Override
	public String txt_normal() {
		return getProperty(PrinterDriver.txt_normal);
	}
	public String txt_2height() {
		return getProperty(PrinterDriver.txt_2height);
	}
	public String txt_2width() {
		return getProperty(PrinterDriver.txt_2width);
	}
	public String txt_4square() {
		return getProperty(PrinterDriver.txt_4square);
	}
	public String txt_underl_off() {
		return getProperty(PrinterDriver.txt_underl_off);
	}
	public String txt_underl_on() {
		return getProperty(PrinterDriver.txt_underl_on);
	}
	public String txt_underl2_on() {
		return getProperty(PrinterDriver.txt_underl2_on);
	}
	public String txt_bold_off() {
		return getProperty(PrinterDriver.txt_bold_off);
	}
	public String txt_bold_on() {
		return getProperty(PrinterDriver.txt_bold_on);
	}
	public String txt_font_a() {
		return getProperty(PrinterDriver.txt_font_a);
	}
	public String txt_font_b() {
		return getProperty(PrinterDriver.txt_font_b);
	}
	public String txt_align_lt() {
		return getProperty(PrinterDriver.txt_align_lt);
	}
	public String txt_align_ct() {
		return getProperty(PrinterDriver.txt_align_ct);
	}
	public String txt_align_rt() {
		return getProperty(PrinterDriver.txt_align_rt);
	}
	public String charcode_pc437() {
		return getProperty(PrinterDriver.charcode_pc437);
	}
	public String charcode_jis() {
		return getProperty(PrinterDriver.charcode_jis);
	}
	public String charcode_pc850() {
		return getProperty(PrinterDriver.charcode_pc850);
	}
	public String charcode_pc860() {
		return getProperty(PrinterDriver.charcode_pc860);
	}
	public String charcode_pc863() {
		return getProperty(PrinterDriver.charcode_pc863);
	}
	public String charcode_weu() {
		return getProperty(PrinterDriver.charcode_weu);
	}
	public String charcode_greek() {
		return getProperty(PrinterDriver.charcode_greek);
	}
	public String charcode_hebrew() {
		return getProperty(PrinterDriver.charcode_hebrew);
	}
	public String charcode_pc1252() {
		return getProperty(PrinterDriver.charcode_pc1252);
	}
	public String charcode_pc866() {
		return getProperty(PrinterDriver.charcode_pc866);
	}
	public String charcode_pc852() {
		return getProperty(PrinterDriver.charcode_pc852);
	}
	public String charcode_pc858() {
		return getProperty(PrinterDriver.charcode_pc858);
	}
	public String charcode_thai42() {
		return getProperty(PrinterDriver.charcode_thai42);
	}
	public String charcode_thai11() {
		return getProperty(PrinterDriver.charcode_thai11);
	}
	public String charcode_thai13() {
		return getProperty(PrinterDriver.charcode_thai13);
	}
	public String charcode_thai14() {
		return getProperty(PrinterDriver.charcode_thai14);
	}
	public String charcode_thai16() {
		return getProperty(PrinterDriver.charcode_thai16);
	}
	public String charcode_thai17() {
		return getProperty(PrinterDriver.charcode_thai17);
	}
	public String charcode_thai18() {
		return getProperty(PrinterDriver.charcode_thai18);
	}
	public String barcode_txt_off() {
		return getProperty(PrinterDriver.barcode_txt_off);
	}
	public String barcode_txt_abv() {
		return getProperty(PrinterDriver.barcode_txt_abv);
	}
	public String barcode_txt_blw() {
		return getProperty(PrinterDriver.barcode_txt_blw);
	}
	public String barcode_txt_bth() {
		return getProperty(PrinterDriver.barcode_txt_bth);
	}
	public String barcode_font_a() {
		return getProperty(PrinterDriver.barcode_font_a);
	}
	public String barcode_font_b() {
		return getProperty(PrinterDriver.barcode_font_b);
	}
	public String barcode_height() {
		return getProperty(PrinterDriver.barcode_height);
	}
	public String barcode_width() {
		return getProperty(PrinterDriver.barcode_width);
	}
	public String barcode_upc_a() {
		return getProperty(PrinterDriver.barcode_upc_a);
	}
	public String barcode_upc_e() {
		return getProperty(PrinterDriver.barcode_upc_e);
	} 
	public String barcode_ean13() {
		return getProperty(PrinterDriver.barcode_ean13);
	} 
	public String barcode_ean8() {
		return getProperty(PrinterDriver.barcode_ean8);
	} 
	public String barcode_code39() {
		return getProperty(PrinterDriver.barcode_code39);
	} 
	public String barcode_itf() {
		return getProperty(PrinterDriver.barcode_itf);
	} 
	public String barcode_nw7() {
		return getProperty(PrinterDriver.barcode_nw7);
	} 
	public String pd_n50() {
		return getProperty(PrinterDriver.pd_n50);
	} 
	public String pd_n37() {
		return getProperty(PrinterDriver.barcode_height);
	} 
	public String pd_n25() {
		return getProperty(PrinterDriver.barcode_height);
	} 
	public String pd_n12() {
		return getProperty(PrinterDriver.barcode_height);
	} 
	public String pd_n0() {
		return getProperty(PrinterDriver.barcode_height);
	} 
	public String pd_p50() {
		return getProperty(PrinterDriver.barcode_height);
	} 
	public String pd_p37() {
		return getProperty(PrinterDriver.barcode_height);
	} 
	public String pd_p25() {
		return getProperty(PrinterDriver.barcode_height);
	} 
	public String pd_p12() {
		return getProperty(PrinterDriver.barcode_height);
	} 	
}
