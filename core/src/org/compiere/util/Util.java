/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *  
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.util;

import java.awt.Color;
import java.awt.font.TextAttribute;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import org.compiere.db.CConnection;
//import org.compiere.interfaces.MD5;
import org.compiere.model.MFunction;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Reference;
import org.compiere.model.persistence.X_A_Machine;
import org.compiere.model.reference.REF_WriteOffType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xendra.Constants;

import bsh.This;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;


/**
 *  General Utilities
 *
 *  @author     Jorg Janke
 *  @version    $Id: Util.java,v 1.3 2006/07/30 00:52:23 jjanke Exp $
 *  
 *  @author     Teo Sarca, SC ARHIPAC SERVICE SRL - BF [ 1748346 ]
 */
public class Util
{
	/**	Logger			*/
	private static Logger log = Logger.getLogger(Util.class.getName());

	/**
	 *	Replace String values.
	 *  @param value string to be processed
	 *  @param oldPart old part
	 *  @param newPart replacement - can be null or ""
	 *  @return String with replaced values
	 */
	public static String replace (String value, String oldPart, String newPart)
	{
		if (value == null || value.length() == 0
				|| oldPart == null || oldPart.length() == 0)
			return value;
		//
		int oldPartLength = oldPart.length();
		String oldValue = value;
		StringBuffer retValue = new StringBuffer();
		int pos = oldValue.indexOf(oldPart);
		while (pos != -1)
		{
			retValue.append (oldValue.substring(0, pos));
			if (newPart != null && newPart.length() > 0)
				retValue.append(newPart);
			oldValue = oldValue.substring(pos+oldPartLength);
			pos = oldValue.indexOf(oldPart);
		}
		retValue.append(oldValue);
		//	log.fine( "Env.replace - " + value + " - Old=" + oldPart + ", New=" + newPart + ", Result=" + retValue.toString());
		return retValue.toString();
	}	//	replace

	/**
	 * Remove CR / LF from String
	 * @param in input
	 * @return cleaned string
	 */
	public static String removeCRLF (String in)
	{
		char[] inArray = in.toCharArray();
		StringBuffer out = new StringBuffer (inArray.length);
		for (int i = 0; i < inArray.length; i++)
		{
			char c = inArray[i];
			if (c == '\n' || c == '\r')
				;
			else
				out.append(c);
		}
		return out.toString();
	}	//	removeCRLF


	/**
	 * Clean - Remove all white spaces
	 * @param in in
	 * @return cleaned string
	 */
	public static String cleanWhitespace (String in)
	{
		char[] inArray = in.toCharArray();
		StringBuffer out = new StringBuffer(inArray.length);
		for (int i = 0; i < inArray.length; i++)
		{
			char c = inArray[i];
			if (!Character.isWhitespace(c))
				out.append (c);
		}
		return out.toString();
	}	//	cleanWhitespace


	/**
	 * Mask HTML content.
	 * i.e. replace characters with &values;
	 * CR is not masked
	 * @param content content
	 * @return masked content
	 * @see #maskHTML(String, boolean)
	 */
	public static String maskHTML (String content)
	{
		return maskHTML (content, false);
	}	//	maskHTML

	/**
	 * Mask HTML content.
	 * i.e. replace characters with &values;
	 * @param content content
	 * @param maskCR convert CR into <br>
	 * @return masked content or null if the <code>content</code> is null
	 */
	public static String maskHTML (String content, boolean maskCR)
	{
		// If the content is null, then return null - teo_sarca [ 1748346 ]
		if (content == null)
			return content;
		//
		StringBuffer out = new StringBuffer();
		char[] chars = content.toCharArray();
		for (int i = 0; i < chars.length; i++)
		{
			char c = chars[i];
			switch (c)
			{
			case '<':
				out.append ("&lt;");
				break;
			case '>':
				out.append ("&gt;");
				break;
			case '&':
				out.append ("&amp;");
				break;
			case '"':
				out.append ("&quot;");
				break;
			case '\'':
				out.append ("&#039;");
				break;
			case '\n':
				if (maskCR)
					out.append ("<br>");
				//
			default:
				int ii =  (int)c;
				if (ii > 255)		//	Write Unicode
					out.append("&#").append(ii).append(";");
				else
					out.append(c);
				break;
			}
		}
		return out.toString();
	}	//	maskHTML

	/**
	 * Get the number of occurances of countChar in string.
	 * @param string String to be searched
	 * @param countChar to be counted character
	 * @return number of occurances
	 */
	public static int getCount (String string, char countChar)
	{
		if (string == null || string.length() == 0)
			return 0;
		int counter = 0;
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == countChar)
				counter++;
		}
		return counter;
	}	//	getCount

	/**
	 * Is String Empty
	 * @param str string
	 * @return true if >= 1 char
	 */
	public static boolean isEmpty (String str)
	{
		return isEmpty(str, false);
	}	//	isEmpty

	/**
	 * Is String Empty
	 * @param str string
	 * @param trimWhitespaces trim whitespaces
	 * @return true if >= 1 char
	 */
	public static boolean isEmpty (String str, boolean trimWhitespaces)
	{
		if (str == null)
			return true;
		if (trimWhitespaces)
			return str.trim().length() == 0;
		else
			return str.length() == 0;
	}	//	isEmpty

	/**************************************************************************
	 * Find index of search character in str.
	 * This ignores content in () and 'texts'
	 * @param str string
	 * @param search search character
	 * @return index or -1 if not found
	 */
	public static int findIndexOf (String str, char search)
	{
		return findIndexOf(str, search, search);
	}   //  findIndexOf

	/**
	 *  Find index of search characters in str.
	 *  This ignores content in () and 'texts'
	 *  @param str string
	 *  @param search1 first search character
	 *  @param search2 second search character (or)
	 *  @return index or -1 if not found
	 */
	public static int findIndexOf (String str, char search1, char search2)
	{
		if (str == null)
			return -1;
		//
		int endIndex = -1;
		int parCount = 0;
		boolean ignoringText = false;
		int size = str.length();
		while (++endIndex < size)
		{
			char c = str.charAt(endIndex);
			if (c == '\'')
				ignoringText = !ignoringText;
			else if (!ignoringText)
			{
				if (parCount == 0 && (c == search1 || c == search2))
					return endIndex;
				else if (c == ')')
					parCount--;
				else if (c == '(')
					parCount++;
			}
		}
		return -1;
	}   //  findIndexOf

	/**
	 *  Find index of search character in str.
	 *  This ignores content in () and 'texts'
	 *  @param str string
	 *  @param search search character
	 *  @return index or -1 if not found
	 */
	public static int findIndexOf (String str, String search)
	{
		if (str == null || search == null || search.length() == 0)
			return -1;
		//
		int endIndex = -1;
		int parCount = 0;
		boolean ignoringText = false;
		int size = str.length();
		while (++endIndex < size)
		{
			char c = str.charAt(endIndex);
			if (c == '\'')
				ignoringText = !ignoringText;
			else if (!ignoringText)
			{
				if (parCount == 0 && c == search.charAt(0))
				{
					if (str.substring(endIndex).startsWith(search))
						return endIndex;
				}
				else if (c == ')')
					parCount--;
				else if (c == '(')
					parCount++;
			}
		}
		return -1;
	}   //  findIndexOf


	/**************************************************************************
	 *  Return Hex String representation of byte b
	 *  @param b byte
	 *  @return Hex
	 */
	static public String toHex (byte b)
	{
		char hexDigit[] = {
				'0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
		};
		char[] array = { hexDigit[(b >> 4) & 0x0f], hexDigit[b & 0x0f] };
		return new String(array);
	}

	/**
	 *  Return Hex String representation of char c
	 *  @param c character
	 *  @return Hex
	 */
	static public String toHex (char c)
	{
		byte hi = (byte) (c >>> 8);
		byte lo = (byte) (c & 0xff);
		return toHex(hi) + toHex(lo);
	}   //  toHex


	/**************************************************************************
	 * Init Cap Words With Spaces
	 * @param in string
	 * @return init cap
	 */
	public static String initCap (String in)
	{
		if (in == null || in.length() == 0)
			return in;
		//
		boolean capitalize = true;
		char[] data = in.toCharArray();
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] == ' ' || Character.isWhitespace(data[i]))
				capitalize = true;
			else if (capitalize)
			{
				data[i] = Character.toUpperCase (data[i]);
				capitalize = false;
			}
			else
				data[i] = Character.toLowerCase (data[i]);
		}
		return new String (data);
	}	//	initCap


	/**************************************************************************
	 * Return a Iterator with only the relevant attributes.
	 * Fixes implementation in AttributedString, which returns everything
	 * @param aString attributed string
	 * @param relevantAttributes relevant attributes
	 * @return iterator
	 */
	static public AttributedCharacterIterator getIterator (AttributedString aString, 
			AttributedCharacterIterator.Attribute[] relevantAttributes)
	{
		AttributedCharacterIterator iter = aString.getIterator();
		Set set = iter.getAllAttributeKeys();
		//	System.out.println("AllAttributeKeys=" + set);
		if (set.size() == 0)
			return iter;
		//	Check, if there are unwanted attributes
		Set<AttributedCharacterIterator.Attribute> unwanted = new HashSet<AttributedCharacterIterator.Attribute>(iter.getAllAttributeKeys());
		for (int i = 0; i < relevantAttributes.length; i++)
			unwanted.remove(relevantAttributes[i]);
		if (unwanted.size() == 0)
			return iter;

		//	Create new String
		StringBuffer sb = new StringBuffer();
		for (char c = iter.first(); c != AttributedCharacterIterator.DONE; c = iter.next())
			sb.append(c);
		aString = new AttributedString(sb.toString());

		//	copy relevant attributes
		Iterator it = iter.getAllAttributeKeys().iterator();
		while (it.hasNext())
		{
			AttributedCharacterIterator.Attribute att = (AttributedCharacterIterator.Attribute)it.next();
			if (!unwanted.contains(att))
			{
				for (char c = iter.first(); c != AttributedCharacterIterator.DONE; c = iter.next())
				{
					Object value = iter.getAttribute(att);
					if (value != null)
					{
						int start = iter.getRunStart(att);
						int limit = iter.getRunLimit(att);
						//	System.out.println("Attribute=" + att + " Value=" + value + " Start=" + start + " Limit=" + limit);
						aString.addAttribute(att, value, start, limit);
						iter.setIndex(limit);
					}
				}
			}
			//	else
			//		System.out.println("Unwanted: " + att);
		}
		return aString.getIterator();
	}	//	getIterator


	/**
	 * Dump a Map (key=value) to out
	 * @param map Map
	 */
	static public void dump (Map map)
	{
		System.out.println("Dump Map - size=" + map.size());
		Iterator it = map.keySet().iterator();
		while (it.hasNext())
		{
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key + "=" + value);
		}
	}	//	dump (Map)

	/**
	 * Print Action and Input Map for component
	 * @param comp  Component with ActionMap
	 */
	public static void printActionInputMap (JComponent comp)
	{
		//	Action Map
		ActionMap am = comp.getActionMap();
		Object[] amKeys = am.allKeys(); //  including Parents
		if (amKeys != null)
		{
			System.out.println("-------------------------");
			System.out.println("ActionMap for Component " + comp.toString());
			for (int i = 0; i < amKeys.length; i++)
			{
				Action a = am.get(amKeys[i]);

				StringBuffer sb = new StringBuffer("- ");
				sb.append(a.getValue(Action.NAME));
				if (a.getValue(Action.ACTION_COMMAND_KEY) != null)
					sb.append(", Cmd=").append(a.getValue(Action.ACTION_COMMAND_KEY));
				if (a.getValue(Action.SHORT_DESCRIPTION) != null)
					sb.append(" - ").append(a.getValue(Action.SHORT_DESCRIPTION));
				System.out.println(sb.toString() + " - " + a);
			}
		}
		/**	Same as below
		KeyStroke[] kStrokes = comp.getRegisteredKeyStrokes();
		if (kStrokes != null)
		{
		System.out.println("-------------------------");
			System.out.println("Registered Key Strokes - " + comp.toString());
			for (int i = 0; i < kStrokes.length; i++)
			{
				System.out.println("- " + kStrokes[i].toString());
			}
		}
		/** Focused				*/
		InputMap im = comp.getInputMap(JComponent.WHEN_FOCUSED);
		KeyStroke[] kStrokes = im.allKeys();
		if (kStrokes != null)
		{
			System.out.println("-------------------------");
			System.out.println("InputMap for Component When Focused - " + comp.toString());
			for (int i = 0; i < kStrokes.length; i++)
			{
				System.out.println("- " + kStrokes[i].toString() + " - "
						+ im.get(kStrokes[i]).toString());
			}
		}
		/** Focused in Window	*/
		im = comp.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		kStrokes = im.allKeys();
		if (kStrokes != null)
		{
			System.out.println("-------------------------");
			System.out.println("InputMap for Component When Focused in Window - " + comp.toString());
			for (int i = 0; i < kStrokes.length; i++)
			{
				System.out.println("- " + kStrokes[i].toString() + " - "
						+ im.get(kStrokes[i]).toString());
			}
		}
		/** Focused when Ancester	*/
		im = comp.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		kStrokes = im.allKeys();
		if (kStrokes != null)
		{
			System.out.println("-------------------------");
			System.out.println("InputMap for Component When Ancestor - " + comp.toString());
			for (int i = 0; i < kStrokes.length; i++)
			{
				System.out.println("- " + kStrokes[i].toString() + " - "
						+ im.get(kStrokes[i]).toString());
			}
		}
		System.out.println("-------------------------");
	}   //  printActionInputMap

	/**
	 * Is 8 Bit
	 * @param str string
	 * @return true if string contains chars > 255
	 */
	public static boolean is8Bit (String str)
	{
		if (str == null || str.length() == 0)
			return true;
		char[] cc = str.toCharArray();
		for (int i = 0; i < cc.length; i++)
		{
			if (cc[i] > 255)
			{
				//	System.out.println("Not 8 Bit - " + str);
				return false;
			}
		}
		return true;
	}	//	is8Bit

	/**
	 * Clean Ampersand (used to indicate shortcut) 
	 * @param in input
	 * @return cleaned string
	 */
	public static String cleanAmp (String in)
	{
		if (in == null || in.length() == 0)
			return in;
		int pos = in.indexOf('&');
		if (pos == -1)
			return in;
		//
		if (pos+1 < in.length() && in.charAt(pos+1) != ' ')
			in = in.substring(0, pos) + in.substring(pos+1);
		return in;
	}	//	cleanAmp

	/**
	 * Trim to max character length
	 * @param str string
	 * @param length max (incl) character length
	 * @return string
	 */
	public static String trimLength (String str, int length)
	{
		if (str == null)
			return str;
		if (length <= 0)
			throw new IllegalArgumentException("Trim length invalid: " + length);
		if (str.length() > length) 
			return str.substring(0, length);
		return str;
	}	//	trimLength

	/**
	 * Size of String in bytes
	 * @param str string
	 * @return size in bytes
	 */
	public static int size (String str)
	{
		if (str == null)
			return 0;
		int length = str.length();
		int size = length;
		try
		{
			size = str.getBytes("UTF-8").length;
		}
		catch (UnsupportedEncodingException e)
		{
			log.log(Level.SEVERE, str, e);
		}
		return size;
	}	//	size

	/**
	 * Trim to max byte size
	 * @param str string
	 * @param size max size in bytes
	 * @return string
	 */
	public static String trimSize (String str, int size)
	{
		if (str == null)
			return str;
		if (size <= 0)
			throw new IllegalArgumentException("Trim size invalid: " + size);
		//	Assume two byte code
		int length = str.length();
		if (length < size/2)
			return str;
		try
		{
			byte[] bytes = str.getBytes("UTF-8");
			if (bytes.length <= size)
				return str;
			//	create new - may cut last character in half
			byte[] result = new byte[size];
			System.arraycopy(bytes, 0, result, 0, size);
			return new String(result, "UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			log.log(Level.SEVERE, str, e);
		}
		return str;
	}	//	trimSize


	/**************************************************************************
	 * Test
	 * @param args args
	 */
	public static void main (String[] args)
	{
		String str = "a�b�c?d?e?f?g?";
		System.out.println(str + " = " + str.length() + " - " + size(str));
		String str1 = trimLength(str, 10);
		System.out.println(str1 + " = " + str1.length() + " - " + size(str1));
		String str2 = trimSize(str, 10);
		System.out.println(str2 + " = " + str2.length() + " - " + size(str2));
		//
		AttributedString aString = new AttributedString ("test test");
		aString.addAttribute(TextAttribute.FOREGROUND, Color.blue);
		aString.addAttribute(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON, 2, 4);
		getIterator (aString, new AttributedCharacterIterator.Attribute[] {TextAttribute.UNDERLINE});
	}	//	main

	/**
	 * String diacritics from given string
	 * @param s	original string
	 * @return string without diacritics
	 */
	public static String stripDiacritics(String s) {
		/* JAVA5 behaviour */
		return s;
		/* JAVA6 behaviour *
		if (s == null) {
			return s;
		}
		String normStr = java.text.Normalizer.normalize(s, java.text.Normalizer.Form.NFD);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < normStr.length(); i++) {
			char ch = normStr.charAt(i);
			if (ch < 255)
				sb.append(ch);
		}
		return sb.toString();
		/* */
	}


	/** 
	 * 
	 * @param Table_ID - ID de la tabla
	 * @param column - nombre de la columna que queremos obtener el ID
	 * @return integer , id de la columna
	 */
	public static Integer getColumnID(int tableId, String column) {
		Integer ColumnLookup = -1;
		String ColumnSQL = "SELECT AD_Column_ID FROM AD_COLUMN  where ad_table_id = ? AND columnname=?";		
		ColumnLookup = DB.getSQLValue(null, ColumnSQL,tableId, column);
		return ColumnLookup;
	}

	/** 
	 * 
	 * @param Table_ID - ID de la tabla
	 * @param column - nombre de la columna que queremos obtener el ID
	 * @return integer , id de la columna
	 */
	public static Integer getProcessID(String value) {
		Integer ColumnLookup = -1;
		String sql = "SELECT AD_Process_ID FROM AD_Process  where value = ? AND isactive='Y'";		
		ColumnLookup = DB.getSQLValue(null, sql, value);
		return ColumnLookup;
	}

	public static String getFriendlyInfo(String info) {
		String detail;
		String friendlyMsg = "";
		String stillreferenced = "is still referenced from table";
		if (info.indexOf("Detail:") != -1)
		{
			detail = info.substring (info.indexOf ("Detail:") + 7);
			if (detail.indexOf("Key") != -1 && detail.indexOf(stillreferenced) != -1)
			{
				StringTokenizer tableST = new StringTokenizer (detail, "\"[(,)]\"");
				int notoken = 0;
				String sql = "";
				String where = "";
				while (tableST.hasMoreTokens())
				{
					String tableString = tableST.nextToken().trim();
					if (notoken == 1)
						where = tableString;
					else if (notoken == 2 || notoken == 3)
						where = where.concat(tableString);
					else if (notoken == 5)
					{
						try
						{
							MTable table = null;
							PO po = null;
							MTable parent = null;
							PO poParent = null;
							sql = " SELECT ".concat(tableString).concat("_id").concat(" from ").concat(tableString).concat(" WHERE ").concat(where);
							PreparedStatement pstmt = DB.prepareStatement(sql.toString(), null);
							ResultSet rs = pstmt.executeQuery();								
							while (rs.next())
							{
								table = MTable.get(Env.getCtx(), tableString);
								po = table.getPO(rs.getInt(tableString.concat("_id")), null);
								if ( tableString.contains("line"))
								{
									String parentname = Util.replace(tableString, "line", "");
									//parentname = parentname.;									
									Integer id = (Integer) po.get_Value(parentname.concat("_id"));
									parent = MTable.get(Env.getCtx(), parentname);
									poParent = parent.getPO(id, null);
									String DocumentNo = (String) poParent.get_Value("DocumentNo");									
									friendlyMsg = Msg.translate(Env.getCtx(), parentname.concat("_id")).concat(" No:").concat(DocumentNo).concat(" esta referenciado ");
								}
							}
						}
						catch (Exception ex)
						{
							ex.printStackTrace();
						}
						finally {

						}
					}
					notoken++;
				}				
			}

		}

		return friendlyMsg;
	}

	
	public static String now(String dateFormat) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());

	}

	/**
	 * @author rlemeill
	 * @param reportLocation http string url ex: http://xendraserver.domain.com/webApp/standalone.jrxml
	 * @return downloaded File (or already existing one)
	 */
	public static File httpDownloadedReport(String reportLocation)
	{	
		System.out.println("tratando de bajar ->"+reportLocation);
		reportLocation = reportLocation.trim();
		File reportFile = null;
		File downloadedFile = null;
		log.info(" report deployed to " + reportLocation);
		try {
			String[] tmps = reportLocation.split("/");
			String cleanFile = tmps[tmps.length-1];
			String localFile = System.getProperty("java.io.tmpdir") + System.getProperty("file.separator") + cleanFile;
			String downloadedLocalFile = System.getProperty("java.io.tmpdir") + System.getProperty("file.separator")+"TMP" + cleanFile;
			reportFile = new File(localFile);
			//  		if (reportFile.exists())
			//  		{
			//  			String localMD5hash = DigestOfFile.GetLocalMD5Hash(reportFile);
			//  			String remoteMD5Hash = "";
			//  			File MD5downloadedFile = getRemoteFile(reportLocation.concat(".MD5"), downloadedLocalFile.concat(".MD5"));
			//  			if (MD5downloadedFile!= null && MD5downloadedFile.exists())
			//  			{
			//  				String text = null;
			//  				StringBuffer contents = new StringBuffer();
			//  				BufferedReader reader = new BufferedReader(new FileReader(MD5downloadedFile));
			//  				while ((text = reader.readLine()) != null) {
			//  					contents.append(text);
			//  				}
			//  				remoteMD5Hash = contents.toString();
			//  			}
			//  			else
			//  			{
			//  				remoteMD5Hash = ejbGetRemoteMD5(reportLocation);
			//  			}
			//  			log.info("MD5 for local file is "+localMD5hash );
			//  			if ( remoteMD5Hash != null)
			//  			{
			//  				if (localMD5hash.equals(remoteMD5Hash))
			//  				{
			//  					log.info(" no need to download: local report is up-to-date");
			//  				}
			//  				else
			//  				{
			//  					log.info(" report on server is different that local one, download and replace");
			downloadedFile = getRemoteFile(reportLocation, downloadedLocalFile);
			reportFile.delete();
			downloadedFile.renameTo(reportFile);
			//  				}
			//  			}
			//  			else
			//  			{
			//  				log.warning("Remote hashing is not available did you deployed webApp.ear?");
			//  				downloadedFile = getRemoteFile(reportLocation, downloadedLocalFile);
			//  				//    				compare hash of existing and downloaded
			//  				if ( DigestOfFile.md5localHashCompare(reportFile,downloadedFile) )
			//  				{
			//  					//nothing file are identical
			//  					log.info(" no need to replace your existing report");
			//  				}
			//  				else
			//  				{
			//  					log.info(" report on server is different that local one, replacing");
			//  					reportFile.delete();
			//  					downloadedFile.renameTo(reportFile);
			//  				}
			//  			}
			//  		}
			//  		else
			//  		{
			//  			reportFile = getRemoteFile(reportLocation,localFile);
			//  		}

		}
		catch (Exception e) {
			log.severe("Unknown exception: "+ e.getMessage());
			return null;
		}
		return reportFile;
	}

	/**
	 * @author rlemeill
	 * @param reportLocation http://applicationserver/webApp/standalone.jrxml for example
	 * @param localPath Where to put the http downloaded file
	 * @return abstract File which represent the downloaded file
	 */
	public static File getRemoteFile(String reportLocation, String localFile)
	{
		try{
			URL reportURL = new URL(reportLocation);
			InputStream in = reportURL.openStream();

			File downloadedFile = new File(localFile);

			if (downloadedFile.exists())
			{
				downloadedFile.delete();
			}
			else
			{
				downloadedFile.createNewFile();
			}

			FileOutputStream fout = new FileOutputStream(downloadedFile);

			byte buf[] = new byte[1024];
			int s = 0;
			while((s = in.read(buf, 0, 1024)) > 0)
				fout.write(buf, 0, s);

			in.close();
			fout.flush();
			fout.close();
			return downloadedFile;
		} catch (FileNotFoundException e) {
			if(reportLocation.indexOf("Subreport") == -1) // Only show the warning if it is not a subreport
				log.warning(reportLocation+" 404 not found: Report cannot be found on server "+ e.getMessage());
			return null;
		} catch (IOException e) {
			log.severe(reportLocation+" I/O error when trying to download (sub)report from server "+ e.getMessage());
			return null;
		}
	}

//	/**
//	 * @param requestedURLString
//	 * @return md5 hash of remote file computed directly on application server
//	 * 			null if problem or if report doesn't seem to be on AS (different IP or 404)
//	 */
//	public static String ejbGetRemoteMD5(String requestedURLString)
//	{
//		InitialContext context = null;
//		String md5Hash = null;
//		try {
//			URL requestURL = new URL(requestedURLString);
//			//String requestURLHost = requestURL.getHost();
//			Hashtable<String, String> env = new Hashtable<String, String>();
//			env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
//			env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
//			env.put(Context.PROVIDER_URL, requestURL.getHost() + ":" + Util.getAppsPort());
//			context = new InitialContext(env);
//			if (isRequestedonAS(requestURL) && isMD5HomeInterfaceAvailable())
//			{
//				MD5 md5 = (MD5) context.lookup(MD5.JNDI_NAME);
//				md5Hash = md5.getFileMD5(requestedURLString);
//				log.info("MD5 for " + requestedURLString + " is " + md5Hash);
//			}
//
//		}
//		catch (MalformedURLException e) {
//			log.severe("URL is invalid: "+ e.getMessage());
//			return null;
//		}
//		catch (NamingException e){
//			log.warning("Unable to create jndi context did you deployed webApp.ear package?\nRemote hashing is impossible");
//			return null;
//		}
//		return md5Hash;
//	}

	/**
	 * @param requestURL
	 * @return true if the report is on the same ip address than Application Server
	 */
	private static boolean isRequestedonAS(URL requestURL)
	{
		boolean tBool = false;
		try{
			InetAddress[] request_iaddrs = InetAddress.getAllByName(requestURL.getHost());
			InetAddress as_iaddr = InetAddress.getByName(CConnection.get().getAppsHost());
			for(int i=0;i<request_iaddrs.length;i++)
			{
				log.info("Got "+request_iaddrs[i].toString()+" for "+requestURL+" as address #"+i);
				if(request_iaddrs[i].equals(as_iaddr))
				{
					log.info("Requested report is on application server host");
					tBool = true;
					break;
				}
			}
		}
		catch (UnknownHostException e) {
			log.severe("Unknown dns lookup error");
			return false;
		}
		return tBool;

	}

	/**
	 * @return true if the class org.compiere.interfaces.MD5Home is present
	 */
	private static boolean isMD5HomeInterfaceAvailable()
	{
		try
		{
			Class.forName("org.compiere.interfaces.MD5");
			log.info("EJB client for MD5 remote hashing is present");
			return true;
		}
		catch (ClassNotFoundException e)
		{
			log.warning("EJB Client for MD5 remote hashing absent\nyou need the class org.compiere.interfaces.MD5 - from webEJB-client.jar - in classpath");
			return false;
		}
	}

	public static String getDocumentNo(int TableID, int KeyID) {
		String tablename = MTable.getTableName(Env.getCtx(), TableID);
		String sql = "SELECT Documentno From "+tablename+" WHERE "+tablename+"_ID=?";
		String retValue = DB.getSQLValueString(null, sql, KeyID);
		if (retValue == null)
			retValue = "";
		return retValue;
	}  


	public static int getDataReferenceID(String identifier) 
	{
		String sql = "SELECT ad_reference_id FROM AD_Reference where identifier = ? ";
		int retValue = DB.getSQLValue(null, sql.toString(), identifier);
		return retValue;
	}
	public static String getParentDocumentNo(int KeyID, String tableName, String parentTableName) {
		String retValue = "";
		String sql = "SELECT "+parentTableName+"_ID From "+tableName+" WHERE "+tableName+"_ID=?";
		int KeyParentID = DB.getSQLValue(null, sql, KeyID);
		if (KeyParentID > 0)
		{
			sql = "SELECT DocumentNo From "+parentTableName+" WHERE "+parentTableName+"_ID=?";
			retValue = DB.getSQLValueString(null, sql, KeyParentID);
			if (retValue == null)
				retValue = "";		  
		}
		return retValue;
	}

	public static String getParentDescription(int KeyID, String tableName, String parentTableName) {
		String retValue = "";
		String sql = "SELECT "+parentTableName+"_ID From "+tableName+" WHERE "+tableName+"_ID=?";
		int KeyParentID = DB.getSQLValue(null, sql, KeyID);
		if (KeyParentID > 0)
		{
			sql = "SELECT Description From "+parentTableName+" WHERE "+parentTableName+"_ID=?";
			retValue = DB.getSQLValueString(null, sql, KeyParentID);
			if (retValue == null)
				retValue = "";		  
		}
		return retValue;
	}

	public static String getLocalHostName() {
		String macaddr = getLocalMacAddress();
		String localhost = "localhost";
		try {
			Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
			for (NetworkInterface netIf : Collections.list(nets)) {
				byte[] mac = netIf.getHardwareAddress();
				if (mac == null)
					continue;
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < mac.length; i++) {
					sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
				}
				if (sb.toString().equals(macaddr))
				{
					Enumeration<InetAddress> inetAddresses = netIf.getInetAddresses();
					for (InetAddress inetAddress : Collections.list(inetAddresses)) {
						if (inetAddress.getClass().equals(java.net.Inet4Address.class))
						{
							localhost = inetAddress.getHostAddress();							
							break;
						}
					}				
				}
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return localhost;		
	}
	
	public static String getLocalMacAddress() {
		String address = "";
		try {
			String loopback = "lo";
			StringBuilder sb = new StringBuilder("loopback");
			Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
			byte[] mac = null;
			for (NetworkInterface netIf : Collections.list(nets)) {
				if (netIf.getName().equals(loopback))
					continue;
				mac = netIf.getHardwareAddress();
				if (mac != null && netIf.getName().startsWith("eth"))
					break;
			}
			if (mac != null)
			{
				sb = new StringBuilder();
				for (int i = 0; i < mac.length; i++) {
					sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
				}
			}
			address = sb.toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		return address;
	}
	public static  String getcurrenttime()
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String currenttime = df.format(System.currentTimeMillis());
		return currenttime;
	}

	public static void writeXmlToFile(String pFilename, Document pDocument) {
		try {
			Source source = new DOMSource(pDocument);
			File file = new File(pFilename);
			Result result = new StreamResult(file);
			// usa serializer.jar 
			Transformer xformer = TransformerFactory.newInstance().newTransformer();
			xformer.setOutputProperty(OutputKeys.INDENT, "yes"); // add newlines
			xformer.transform(source, result);
		}
		catch (TransformerException e) {
			e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
		}
	}    

	public static void writeToFile(StringBuffer sb, String fileName)
	{
		writeToFile(sb.toString(), fileName);
	}
	
	/**************************************************************************
	 * 	Write to file
	 * 	@param sb string buffer
	 * 	@param fileName file name
	 */
	public static void writeToFile (String sb, String fileName)
	{
		try
		{
			File out = new File (fileName);
			// FileWriter fw = new FileWriter (out);
			// http://sourceforge.net/tracker/index.php?func=detail&aid=1629947&group_id=176962&atid=879332
			boolean ignore = false;
			Writer fw = new OutputStreamWriter(new FileOutputStream(out, false), "UTF-8");
			for (int i = 0; i < sb.length(); i++)
			{
				char c = sb.charAt(i);
				//	after
				if (c == ';' || c == '}')
				{
					if (sb.substring(i+1).startsWith(";"))
					{
						ignore = true;
						continue;
					}
					fw.write (c);
					if (sb.substring(i+1).startsWith("//"))
					{
						fw.write('\t');							
					}
					if (!ignore)
						fw.write(Env.NL);					
					else
						ignore = false;
				}
				//	before & after
				else if (c == '{')
				{
					fw.write(Env.NL);
					fw.write (c);
					fw.write(Env.NL);
				}
				else
					fw.write (c);
			}
			fw.flush ();
			fw.close ();
			float size = out.length();
			size /= 1024;
			log.info(out.getAbsolutePath() + " - " + size + " kB");
		}
		catch (Exception ex)
		{
			log.log(Level.SEVERE, fileName, ex);
		}
	}	//	writeToFile

	public static Boolean setattr(Element xpf, String name, Object objectclass) {
		Boolean ok = true;
		if (objectclass == null)
		{
			System.out.println(name+" tiene valor null");
			ok = false;		
		}
		else if (objectclass instanceof String)
			xpf.setAttribute(name, (String) objectclass);
		else if (objectclass instanceof Boolean)
			xpf.setAttribute(name, (Boolean) objectclass ? "Y" : "N");
		else if (objectclass instanceof Number)
			xpf.setAttribute(name, String.valueOf(objectclass));
		else if (objectclass instanceof Integer)
			xpf.setAttribute(name, String.valueOf(objectclass));
		else if (objectclass instanceof Timestamp)
			xpf.setAttribute(name, objectclass.toString());
		else if (objectclass instanceof BigDecimal)
			xpf.setAttribute(name,  objectclass.toString());
		else
			ok = false;
		return ok;
	}

	public static void setattrToElem(org.jdom.Element xpf, PO persistence, String propertyname) {
		try 
		{
			if (propertyname.contains(" "))
			{
				propertyname = propertyname.replace(" ", "_");
			}
			Object srcvalue = persistence.get_Value(propertyname);
			String value = "";
			if (srcvalue == null)
				value = "";
			else if (srcvalue instanceof Boolean)
			{
				value = (Boolean) srcvalue ? "Y" : "N";
			}
			else if (srcvalue instanceof Number)
			{
				value = String.valueOf(srcvalue);
			}
			else if (srcvalue instanceof Integer)
			{
				value = String.valueOf(srcvalue);
			}
			else if (srcvalue instanceof String)
			{
				value = (String) srcvalue;
			}
			else if (srcvalue instanceof Timestamp)
			{
				value = srcvalue.toString();
			}
			else
			{
				System.out.println("X");
			}
			xpf.setAttribute(propertyname, value);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void setattrToElem(Element xpf, PO persistence, String propertyname) {
		try 
		{
			if (propertyname.contains(" "))
			{
				propertyname = propertyname.replace(" ", "_");
			}
			Object srcvalue = persistence.get_Value(propertyname);
			String value = "";
			if (srcvalue == null)
				value = "";
			else if (srcvalue instanceof Boolean)
			{
				value = (Boolean) srcvalue ? "Y" : "N";
			}
			else if (srcvalue instanceof Number)
			{
				value = String.valueOf(srcvalue);
			}
			else if (srcvalue instanceof Integer)
			{
				value = String.valueOf(srcvalue);
			}
			else if (srcvalue instanceof String)
			{
				value = (String) srcvalue;
			}
			else if (srcvalue instanceof Timestamp)
			{
				value = srcvalue.toString();
			}
			else
			{
				System.out.println("X");
			}
			xpf.setAttribute(propertyname, value);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static Timestamp getattrTs(Element xpf, String name)
	{
		return (Timestamp) getattr(xpf, name, Timestamp.class);
	}
	public static BigDecimal  getattrBD (Element xpf, String name)
	{
		return (BigDecimal) getattr(xpf, name, BigDecimal.class);
	}
	public static String  getattrStr (Element xpf, String name)
	{
		return (String) getattr(xpf, name, String.class);
	}
	public static Boolean getattrBool(Element xpf, String name)
	{
		return (Boolean) getattr(xpf, name, Boolean.class);
	}

	public static Integer getattrInt(Element xpf, String name)
	{
		return (Integer) getattr(xpf, name, Integer.class);
	}

	public static Object getattr(Element xpf, String name, Object objectclass) {
		Object retvalue = null;
		try 
		{
			String srcvalue = xpf.getAttribute(name);
			if (objectclass.equals(Boolean.class))
			{
				retvalue = srcvalue.equals("Y") ? true : false;
			}
			else if (objectclass.equals(Number.class))
			{		
				retvalue = Integer.valueOf(srcvalue);
			}
			else if (objectclass.equals(Integer.class))
			{
				if (srcvalue.length() > 0)
					retvalue = Integer.valueOf(srcvalue);
				else
					retvalue = 0;
			}
			else if (objectclass.equals(String.class))
			{
				retvalue = srcvalue;
			}
			else if (objectclass.equals(Timestamp.class))
			{
				if (srcvalue.length() == 0)
					retvalue = null;
				else
					retvalue = Timestamp.valueOf(srcvalue);
			}
			else if (objectclass.equals(BigDecimal.class))
			{
				if ( srcvalue.length() == 0 )
					retvalue = Env.ZERO;
				else
					retvalue = new BigDecimal(srcvalue);
			}			
			else if (srcvalue == null)
			{

			}
			else
			{
				System.out.println("X");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return retvalue;
	}

	public static String getUUID() {
		return java.util.UUID.randomUUID().toString();
	}

	public static URL getURL(String dirname, String filename)
	{
		URL url = null;
		try 
		{
			String filepath = dirname + filename;
			File file = new File(filepath);
			if (!file.exists())
				throw new Exception(file.getAbsolutePath()+" FileDontExist");
			url = file.toURI().toURL();
			System.out.println(url.toString());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return url;
	}

	public static void addPath(String s) {
		File f = new File(s);
		if (f.exists())
		{
			try {
				URL u = f.toURI().toURL();
				URLClassLoader urlClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
				//URLClassLoader urlClassLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
				Class urlClass = URLClassLoader.class;
				Method method = urlClass.getDeclaredMethod("addURL", new Class[]{URL.class});
				method.setAccessible(true);		
				Object test = method.invoke(urlClassLoader, new Object[]{u});
				System.out.println(String.format("adding classpath %s", f.getAbsolutePath()));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println(String.format("classpath file %s don't exists", f.getAbsolutePath()));
		}
	}

	public static String getXMLTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			if (el.getFirstChild() == null)
				textVal = "";
			else
				textVal = el.getFirstChild().getNodeValue();
		}
		return textVal;	
	}

	public static int getXMLIntValue(Element ele, String tagName) {
		Integer intval = -1;
		try {
			String textvalue = getXMLTextValue(ele,tagName);
			if (textvalue.length() > 0)
			{
				intval = Integer.parseInt(textvalue);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return intval;
	}

	public static Object getTime(int value) {
		String hour = "";
		if ( value <= 12 )
			hour = String.valueOf(value).concat(" am.");
		else
			hour = String.valueOf(value-12).concat(" pm.");
		return hour;
	}
	
	public static String getvalue(ResultSet rs, String namecolumn) {
		String value = null;
		try {
			value = rs.getString(namecolumn);
			if (value == null)
				value = "";		
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return value;
	}

	public static BigDecimal percent(BigDecimal base, BigDecimal pct) {
		BigDecimal percent = base.multiply(pct.divide(Env.ONEHUNDRED,BigDecimal.ROUND_HALF_UP));
		percent = percent.setScale(2, BigDecimal.ROUND_HALF_UP);
		return percent;		
	}

	/**
	 * Pads the string with the specified character, with alignment and length.
	 * @param str			The string to work with.
	 * @param nspaces		The number of characters the resulting string will have (will cut if needed).
	 * @param align		The alignment. See MPosPrintFormat.FIELDALIGNMENTTYPE_*.
	 * @param padchar		The char to use for padding (usually a space).
	 * @return The modified string.
	 */
	public static String pad(String str, int nspaces, String align, char padchar) {
		String result = new String();
		
		if (align == null)
			align = Constants.FIELDALIGNMENTTYPE_LeadingLeft;
		
		if (nspaces == 0)
			nspaces = str.length();
		
		if (str.length() == nspaces) return str;
		
		if (str.length() > nspaces ) {
			result = str.substring(0, nspaces-1);
		}
		else {
			result = str;
			if (align.equals(Constants.FIELDALIGNMENTTYPE_LeadingLeft) || align.equals(Constants.FIELDALIGNMENTTYPE_Default)) {
				// Left
				for (int i = 0; i < (nspaces-str.length()); i++) {
					result = result + padchar;
				}			
			}
			else if (align.equals(Constants.FIELDALIGNMENTTYPE_TrailingRight)){
				// Right
				for (int i = 0; i < (nspaces-str.length()); i++) {
					result = padchar + result;
				}
			}
			else if (align.equals(Constants.FIELDALIGNMENTTYPE_Center)){
				// Center
				for (int i = 0; i < (nspaces-str.length()); i++) {
					if ((i & 1) > 0) {
						result = padchar + result;
					}
					else {
						result = result + padchar;
					}
				}
				
			}
		}
		return result;
	}

	public static String dateString(Calendar d) {
		String s = "";
		s += d.get(Calendar.YEAR);
		s += (d.get(Calendar.MONTH) < Calendar.OCTOBER ? "0" + (d.get(Calendar.MONTH)+1) : d.get(Calendar.MONTH)+1);
		s += d.get(Calendar.DAY_OF_MONTH);
		s += "T";
		s += (d.get(Calendar.HOUR_OF_DAY) < 10 ? "0" + d.get(Calendar.HOUR_OF_DAY) : d.get(Calendar.HOUR_OF_DAY));
		s += (d.get(Calendar.MINUTE) < 10 ? "0" + d.get(Calendar.MINUTE) : d.get(Calendar.MINUTE));
		s += (d.get(Calendar.SECOND) < 10 ? "0" + d.get(Calendar.SECOND) : d.get(Calendar.SECOND));
		return s;
	}

	public static String getURLToString(String sigURL) {
		URL url;
		StringBuilder response = new StringBuilder();
		try {
			if ((url = getResourceURL(sigURL)) == null) {
				return null;
			}
			URLConnection connection = url.openConnection();
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							connection.getInputStream()));

			String inputLine;

			while ((inputLine = in.readLine()) != null) 
				response.append(inputLine);

			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return response.toString();		
	}
	
	public static URL getResourceURL(String path) 
	{
		URL url;
		if (path == null) {
			throw new IllegalArgumentException("path = null");
		}

		url = This.class.getResource("/" + path);

		if (url == null) {
			return null;
		}

		return url;
	}

	public static String getMessageProtocol() {
		String protocol = "remote://";
		if (Env.isServerEmbedded())
		{
			protocol = "jnp://";
		}
		return protocol;
	}

	public static int getAppsPort() {
		int port = 1099;
		return port;
	}
	
	public static Object convertObject(int type, Object value) {		
		if (type == DisplayType.String)
			return String.valueOf(value);
		//else if (type == DisplayType.TableDir)
		//	return Integer.valueOf(value);
		else if (type == DisplayType.Integer)
			return Integer.valueOf(((String) value).toString());
		else if (type == DisplayType.Amount)
			return new BigDecimal(value.toString());
		else if (type == DisplayType.YesNo)
			return Boolean.valueOf(value.equals("true"));
		else if (type == DisplayType.CostPrice)
			return new BigDecimal(String.valueOf(value));
		//else if (type.equals("HashMap")
		//	return new HashMap(value);
		else if (type == DisplayType.URL) {
			return String.valueOf(value);
		}
		else if (type == DisplayType.Date)
		{
			try
			{
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date parsedDate = dateFormat.parse(String.valueOf(value));
				Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
				return timestamp;			
			}
			catch (Exception e)
			{

			}
			return null;
		}
		else if (type == DisplayType.DateTime)
		{
			try
			{
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			    Date parsedDate = dateFormat.parse(String.valueOf(value));
			    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
			    return timestamp;
			}
			catch (Exception e)
			{
				
			}
			return null;
		}
		else
			return null;
	}

	public static String getStringclean(String funcname) {		
		char[] nameArray = funcname.toCharArray();
		StringBuffer nameClean = new StringBuffer();
		boolean initCap = true;
		for (int i = 0; i < nameArray.length; i++)
		{
			char c = nameArray[i];
			if (Character.isJavaIdentifierPart(c))
			{
				if (initCap)
					nameClean.append(Character.toUpperCase(c));
				else
					nameClean.append(c);
				initCap = false;
			}
			else
			{
				if (c == '+')
					nameClean.append("Plus");
				else if (c == '-')
					nameClean.append("_");
				else if (c == '>')
				{
					if (funcname.indexOf('<') == -1)	//	ignore <xx>
						nameClean.append("Gt");
				}
				else if (c == '<')
				{
					if (funcname.indexOf('>') == -1)	//	ignore <xx>
						nameClean.append("Le");
				}
				else if (c == '!')
					nameClean.append("Not");
				else if (c == '=')
					nameClean.append("Eq");
				else if (c == '~')
					nameClean.append("Like");
				initCap = true;
			}
		}
		return nameClean.toString();						
	}

	public static void append(StringBuffer xtab, String format) {		
		int length = xtab.length(); 
		int lastnewline = xtab.lastIndexOf("\n");
		if (lastnewline > 0)
			length = length - lastnewline;
		if (format.endsWith(";"))
			;
		else if (length >= 100)
			xtab.append("\n");
		else if (length + format.length() > 100)
			xtab.append("\n");
		xtab.append(format);						
	}

	public static String processSQL(String sql) {
		String error = "";
		Trx trx = Trx.get(Trx.createTrxName(), true);
		trx.start();
		try {
			String trxName = trx.getTrxName();
			int no = DB.executeUpdate(sql, false, trxName);
			if (no == -1)
			{
				if (DB.getLastSQLState().equals("42701")) // duplicate column
				{
					no = 0;
				}
				else if (DB.getLastSQLState().equals("42P07")) // duplicate table
				{
					no = 0;
				}
				else 
				{
					String msg= "@Error@";
					ValueNamePair pp = CLogger.retrieveError();
					if (pp != null)
						msg = pp.getName() + " - ";
					msg += sql;
					error = msg;
				}
			}
			else
				trx.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			trx.rollback();
		}
		finally
		{
			trx.close();
		}
		return error;
	}

	public static Hashtable getProperties(String properties) {		
		Hashtable props = new Hashtable();
		if (properties == null || properties.length() == 0)
			return props;
		List<String> list = new ArrayList<String>();
		StringTokenizer tpok = new StringTokenizer(properties, "@");				
		while (tpok.hasMoreTokens()) {
			String token = tpok.nextToken();
			list.add(token);
		}				
		if (list.size() > 0)
		{	
			for (String item:list)
			{
				tpok = new StringTokenizer(item, "=");
				while (tpok.hasMoreTokens()) {
					String varname = tpok.nextToken();
					if (tpok.hasMoreTokens())
					{
						String varvalue = tpok.nextToken();
						if (varname.equals(X_AD_Reference.COLUMNNAME_Synchronized))
						{	
							Timestamp currentSynchro = Timestamp.valueOf(varvalue);
							Calendar cal = Calendar.getInstance(); // locale-specific
							cal.setTime(currentSynchro);
							cal.set(Calendar.MILLISECOND, 0);
							currentSynchro = new Timestamp(cal.getTimeInMillis());
							props.put(X_AD_Reference.COLUMNNAME_Synchronized, currentSynchro);
						}
						else if (varname.equals(X_AD_Reference.COLUMNNAME_Identifier))
						{
							String Identifier = varvalue.trim();
							if (Identifier != null)
								props.put(X_AD_Reference.COLUMNNAME_Identifier, Identifier);
						}
						else if (varname.equals(X_AD_Reference.COLUMNNAME_Extension))
						{
							props.put(X_AD_Reference.COLUMNNAME_Extension, varvalue.trim());
						}						
						else 
						{
							props.put(varname, varvalue);
						}
							
					}
					else 
					{
						if (varname.trim().length() > 0)	
							props.put("comment", varname);
					}
				}
			}
			Iterator keys = props.keySet().iterator();
			while (keys.hasNext())
			{
				String key = (String)keys.next();
				Object value = props.get(key);
				if (key.equals("updated"))
				{
					props.remove(key);
					key = MFunction.COLUMNNAME_Synchronized;
					props.put(key, value);
					keys = props.keySet().iterator();
					continue;
				}	
				else if (key.equals("uuid"))
				{
					props.remove(key);
					if (((String) value).length() > 36)
						value = ((String) value).substring(0, 36);
					key = MFunction.COLUMNNAME_Identifier;
					props.put(key, value);
					keys = props.keySet().iterator();
					continue;
				}
				else if (key.equals("extension"))
				{
					props.remove(key);
					key = MFunction.COLUMNNAME_Extension;
					props.put(key, value);
					keys = props.keySet().iterator();
					continue;						
				}
				else if (key.equals(X_AD_Reference.COLUMNNAME_Synchronized))
				{
					Calendar cal = Calendar.getInstance();
					if (value instanceof Timestamp)
						cal.setTime((Timestamp) value);
					else 
						cal.setTime(Timestamp.valueOf((String) value));
					cal.set(Calendar.MILLISECOND, 0);
					long time = cal.getTimeInMillis();									
					props.put(key, new Timestamp(time));
				}
			}								
		}		
		return props;
	}

	public static String getStringFromFile(File pluginDirectory) {
		String strFileContents = "";
		BufferedInputStream buf;						
		try {
			buf = new BufferedInputStream(new FileInputStream(pluginDirectory));
            byte[] contents = new byte[1024];			                         
            int bytesRead=0;			                        			                        
            while( (bytesRead = buf.read(contents)) != -1){			                                
              strFileContents += new String(contents, 0, bytesRead);
              //System.out.print(strFileContents);
            }			        				
		} catch (Exception e1) {
			e1.printStackTrace();
		}		
		return strFileContents;
	}
//	public static void setXendrianServer(String macaddr) {		
//		setUniquePropertyServer(macaddr, "xendrianserver", "true", "false");
//	}
//	public static void setWebServer(String macaddr) {
//		setUniquePropertyServer(macaddr, "webserver", "true", "false");
//		setUniquePropertyServer(macaddr, "webport", "8080", "8080");
//	}
	public static void setUniquePropertyServer(String macaddr, String property, String unique, String nonunique) {
		if (macaddr == null || macaddr.length() == 0)
			macaddr = Util.getLocalMacAddress();
		List<X_A_Machine> machines = new Query(Env.getCtx(), X_A_Machine.Table_Name, "IsActive = 'Y'", null).list();
		for (X_A_Machine machine:machines)
		{			
			HashMap props = machine.getProperties();
			String propertyName = (String) props.get(property);					
			if (machine.getMac_Address().equals(macaddr))
			{
				props.put(property, unique);
				machine.setProperties(props);
				machine.save();
			}		
			else if (propertyName != null)
			{
				props.put(property, nonunique);
				machine.setProperties(props);
				machine.save();
			}
		}		
	}
    // Get file name portion of URL.
    public static String getFileName(URL url) {
        String fileName = url.getFile();
        return fileName.substring(fileName.lastIndexOf('/') + 1);
    }
    public static String getFileName(String path) {
    	return path.substring(path.lastIndexOf("/") + 1);
    }

	public static String setMultiLineMessage(String m_processMsg, int minwindow, int maxwindow) {
		int lenmsg = m_processMsg.length();
		int length = 0;
		///int minwindow = 15;
		//int maxwindow = 25;
		String buf = new String("<html><body>");
		for (int i=0; i < lenmsg; i ++)
		{
			buf += m_processMsg.charAt(i);
			if (length >= minwindow && length <= maxwindow )
			{
				if (m_processMsg.charAt(i) == ' ')
				{
					buf += "<br>";
					length = 0;
				}
			}
			if (length > maxwindow)
			{
				buf += "<br>";
				length = 0;				
			}
			length++;
		}
		buf += "</body></html>";
		return buf;
	}

	public static String ListtoString(List<String> list) {
		String var = "";
		for (String listvalue:list)
		{
			if (var.length()  > 0)
				var += ",";
			var += listvalue;
		}
		return var;
	}

	public static List<String> StringtoList(String var) {
		List<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer( var , "," );
		while ( st.hasMoreTokens()) {
			String varitem = st.nextToken();
			if (!list.contains(varitem))
				list.add(varitem);
		}
		return list;
	}
	// assertEquals(bd("1.05"), round(bd("1.03"), bd("0.05"), RoundingMode.UP));
	// assertEquals(bd("1.10"), round(bd("1.051"), bd("0.05"), RoundingMode.UP));
	// sassertEquals(bd("1.05"), round(bd("1.05"), bd("0.05"), RoundingMode.UP));
	public static BigDecimal round(BigDecimal value, BigDecimal round, String AdjustType) {
		if (AdjustType.equals(REF_WriteOffType.None))
			return value;
		if (round.signum() == 0) {
			// 0 increment does not make much sense, but prevent division by 0
			return value;
		} else {
			value = value.setScale(2);
			round = round.setScale(2);
//			BigDecimal TWENTY = new BigDecimal("20");
//			BigDecimal divided = value.divide(TWENTY, 2, RoundingMode.FLOOR);
//			BigDecimal result = divided.multiply(TWENTY);
			if (AdjustType.equals(REF_WriteOffType.WriteOffAmt))
			{
				BigDecimal decimal = value.subtract(value.setScale(0, RoundingMode.FLOOR)).movePointRight(value.scale()); 
				while (!decimal.toString().endsWith("0"))
				{
					value = value.subtract(round);
					decimal = value.subtract(value.setScale(0, RoundingMode.FLOOR)).movePointRight(value.scale());
				}
			}
			else if (AdjustType.equals(REF_WriteOffType.Donation))
			{
				BigDecimal decimal = value.subtract(value.setScale(0, RoundingMode.FLOOR)).movePointRight(value.scale()); 
				while (!decimal.toString().endsWith("0"))
				{
					value = value.add(round);
					decimal = value.subtract(value.setScale(0, RoundingMode.FLOOR)).movePointRight(value.scale());
				}
			}
			return value;
		}
	}		
	public static List<ValueNamePair> RefList(String identifier)
	{
		List<ValueNamePair> value = new ArrayList<ValueNamePair>();
		String language = Env.getAD_Language(Env.getCtx());
		String sql = null;
		if (Env.isBaseLanguage (language, "AD_Ref_List"))	//	Get TreeTypes & Name
			sql = "SELECT l.Value, l.Name FROM AD_Ref_List l JOIN AD_Reference r ON l.AD_Reference_ID = r.AD_Reference_ID WHERE r.identifier = '%s' AND IsActive='Y'";
		else
			sql = "SELECT l.Value, t.Name FROM AD_Ref_List l JOIN AD_Reference r ON l.AD_Reference_ID = r.AD_Reference_ID, AD_Ref_List_Trl t "
					+ " WHERE l.AD_Ref_List_ID=t.AD_Ref_List_ID AND r.identifier = '%s' AND l.IsActive='Y'"
					+ " AND t.AD_Language=" + DB.TO_STRING(language);
		try
		{
			PreparedStatement stmt = DB.prepareStatement(String.format(sql,identifier), null);
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
			{
				ValueNamePair kp = new ValueNamePair(rs.getString(1), rs.getString(2));
				value.add(kp);
			}
			rs.close();
			stmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return value;		
	}
	public static String RefListValue(String identifier)
	{
		String value = "";
		String language = Env.getAD_Language(Env.getCtx());
		String sql = null;
		if (Env.isBaseLanguage (language, "AD_Ref_List"))	//	Get TreeTypes & Name
			sql = "SELECT Value, Name FROM AD_Ref_List WHERE Identifier='%s' AND IsActive='Y'";
		else
			sql = "SELECT l.Value, t.Name FROM AD_Ref_List l, AD_Ref_List_Trl t "
					+ "WHERE l.Identifier='%s' AND l.AD_Ref_List_ID=t.AD_Ref_List_ID AND l.IsActive='Y'"
					+ " AND t.AD_Language=" + DB.TO_STRING(language);
		try
		{
			PreparedStatement stmt = DB.prepareStatement(String.format(sql,identifier), null);
			ResultSet rs = stmt.executeQuery();
			if (rs.next())
			{
				value = rs.getString(2);
			}
			rs.close();
			stmt.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}

	public static Integer getid(org.jdom.Element pos, String xmltag, String tablename, String searchfield)
	{
		Integer id = 0;		
		String value = JDom.getattrStr(pos, xmltag);
		if (value != null && value.length() > 0)
		{
			PO po = new Query(Env.getCtx(), tablename, String.format("%s = ?", searchfield), null)
			.setParameters(value).first();
			if (po != null)
				id = po.get_ValueAsInt(String.format("%s_ID", tablename));		
		}
		return id;
	}
}   //  Util
