/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
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
package org.compiere.model;

import org.compiere.model.reference.REF_AD_FieldObscureType;


/**
 *	Obscure Strings (e.g. Credit Card Numbers).
 *	Obscure Type defined in AD_Field
 *	
 *  @author Jorg Janke
 *  @version $Id: Obscure.java 508 2007-11-24 23:06:53Z el_man $
 */
public class Obscure extends Object
{
	/**
	 *	Obscure clear value.
	 * 	Obscure Digits but last 4
	 *	@param clearValue clear value
	 *	@return obscured value or "-"
	 */	
	public static String obscure (String clearValue)
	{
		if (clearValue == null || clearValue.length() == 0)
			return "-";
		Obscure ob = new Obscure (clearValue);
		return ob.getObscuredValue();
	}	//	obscure

	/**
	 *	Obscure clear value
	 *	@param clearValue clear value
	 *	@param obscureType Obscure Type
	 *	@return obscured value
	 */	
	public static String obscure (String clearValue, String obscureType)
	{
		Obscure ob = new Obscure (clearValue, obscureType);
		return ob.getObscuredValue();
	}	//	obscure


	/**************************************************************************
	 * 	Obscure
	 */
	public Obscure ()
	{
	}	//	Obscure

	/**
	 * 	Obscure.
	 * 	Obscure Digits but last 4
	 *	@param clearValue clear value
	 */
	public Obscure (String clearValue)
	{
		setClearValue(clearValue);
	}	//	Obscure

	/**
	 * 	Obscure
	 *	@param clearValue clear value
	 *	@param obscureType Obscure Type
	 */
	public Obscure (String clearValue, String obscureType)
	{
		setClearValue(clearValue);
		setType(obscureType);
	}	//	Obscure
	
	/** Obscure Type			*/
	private String m_type = REF_AD_FieldObscureType.ObscureDigitsButLast4;
	/**	Clear Value				*/
	private String 	m_clearValue;
	/** Obscrure Value			*/
	private String 	m_obscuredValue;

	/**
	 *	Set Type
	 *	@param obscureType Obscure Type
	 */
	public void setType (String obscureType)
	{
		;
		if (obscureType == null || 
				obscureType.equals(REF_AD_FieldObscureType.ObscureDigitsButLast4) || 
				obscureType.equals(REF_AD_FieldObscureType.ObscureDigitsButFirstLast4) || 
				obscureType.equals(REF_AD_FieldObscureType.ObscureAlphaNumericButFirstLast4) || 
				obscureType.equals(REF_AD_FieldObscureType.ObscureAlphaNumericButLast4))
		{
			m_type = obscureType;
			m_obscuredValue = null;
			return;
		}
		throw new IllegalArgumentException ("ObscureType Invalid value - Reference_ID=291 - 904 - 944 - A44 - A04");
	}	//	setType

	/**
	 * 	Get Obscure Type
	 *	@return type
	 */
	public String getType ()
	{
		return m_type;
	}	//	getType

	/**
	 *	Get Clear Value
	 * 	@return Returns the clear Value.
	 */
	public String getClearValue ()
	{
		return m_clearValue;
	}	//	getClearValue

	/**
	 *	Set Clear Value
	 *	@param clearValue The clearValue to set.
	 */
	public void setClearValue (String clearValue)
	{
		m_clearValue = clearValue;
		m_obscuredValue = null;
	}	//	setClearValue

	/**
	 *	Get Obscured Value
	 *	@param clearValue The clearValue to set.
	 *	@return Returns the obscuredValue.
	 */
	public String getObscuredValue (String clearValue)
	{
		setClearValue(clearValue);
		return getObscuredValue();
	}	//	getObscuredValue

	/**
	 *	Get Obscured Value
	 *	@return Returns the obscuredValue.
	 */
	public String getObscuredValue ()
	{
		if (m_obscuredValue != null)
			return m_obscuredValue;
		if (m_clearValue == null || m_clearValue.length() == 0)
			return m_clearValue;	
		//
		boolean alpha = m_type.charAt(0) == 'A';
		int clearStart = Integer.parseInt(m_type.substring(1,2));
		int clearEnd = Integer.parseInt(m_type.substring(2));
		//
		char[] chars = m_clearValue.toCharArray();
		int length = chars.length;
		StringBuffer sb = new StringBuffer(length);
		for (int i = 0; i < length; i++)
		{
			char c = chars[i];
			if (i < clearStart)
				sb.append(c);
			else if (i >= length-clearEnd)
				sb.append(c);
			else
			{
				if (!alpha && !Character.isDigit(c))
					sb.append(c);
				else
					sb.append('*');
			}				
		}
		m_obscuredValue = sb.toString();
		return m_obscuredValue;
	}	//	getObscuredValue


	/**************************************************************************
	 *	test
	 *	@param args ignored
	 */
	public static void main (String[] args)
	{
		System.out.println (Obscure.obscure("1a2b3c4d5e6f7g8h9",REF_AD_FieldObscureType.ObscureDigitsButLast4));
	}	//	main

	
}	//	Obscrure
