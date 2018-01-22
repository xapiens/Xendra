package org.compiere.impexp;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Field {
	String name = "";
	String type = "";
	private String value;		
	public void setName(String name) {
		this.name = name;
	}	
	public String getName() {
		return name;
	}
	public void settype(String type) {
		this.type = type;		
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public String getFieldValue() {
		String fieldvalue = "";
		if (type.equals(ImpFormatRow.DATATYPE_String)) {
			fieldvalue = String.format("%s='%s'",name,value);
		}
		else if (type.equals(ImpFormatRow.DATATYPE_Date)) {
			fieldvalue = String.format("%s='%s'",name,parseDate(value));
		}
		return fieldvalue;
	}	
	private String parseDate (String info)
	{
		SimpleDateFormat	m_dformat = null;
		String				m_dataFormat = "";
		if (m_dformat == null)
		{
			try
			{
				m_dformat = new SimpleDateFormat(m_dataFormat);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			if (m_dformat == null)
				m_dformat = (SimpleDateFormat)DateFormat.getDateInstance();
			m_dformat.setLenient(true);
		}

		Timestamp ts = null;
		try
		{
			ts = new Timestamp (m_dformat.parse(info).getTime());
		}
		catch (ParseException pe)
		{
			pe.printStackTrace();
		}
		if (ts == null)
			ts = new Timestamp (System.currentTimeMillis());
		//
		String dateString = ts.toString();
		return dateString.substring(0, dateString.indexOf('.'));	//	cut off miliseconds
	}	//	parseNumber	
}
