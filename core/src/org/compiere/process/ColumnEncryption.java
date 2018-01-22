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
package org.compiere.process;

import java.util.logging.*;

import org.compiere.model.MColumn;
import org.compiere.util.*;



/**
 * 	Column Encryption Test
 *	
 *  @author Jorg Janke
 *  @version $Id: ColumnEncryption.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class ColumnEncryption extends SvrProcess
{
	/** Enable/Disable Encryption		*/
	private boolean	p_IsEncrypted = false;
	/** Change Encryption Settings		*/
	private boolean	p_ChangeSetting = false;
	/** Maximum Length					*/
	private int		p_MaxLength = 0;
	/** Test Value						*/
	private String	p_TestValue = null;
	/** The Column						*/
	private int		p_AD_Column_ID = 0;
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;			
			else if (name.equals("IsEncrypted"))
				p_IsEncrypted = "Y".equals(para[i].getParameter());
			else if (name.equals("ChangeSetting"))
				p_ChangeSetting = "Y".equals(para[i].getParameter());
			else if (name.equals("MaxLength"))
				p_MaxLength = para[i].getParameterAsInt();
			else if (name.equals("TestValue"))
				p_TestValue = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_AD_Column_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
//	@XendraProcess(value="AD_ColumnEncryption",
//	name="Column Encryption",
//	description="Test and enable Column Encryption",
//	help="To enable storage encryption or remove encryption is dangerous as you may loose data. You need to verify that the column is big enough to hold the encrypted value.  You can provide your own encryption method, but cannot change it once enabled.  <br>	The default implementation supports US ASCII String conversion (not Unicode, Numbers, Dates)<br>	Note that support is restricted to setup and test, but not data recovery.",
//	id="00aae39f-d284-6b12-29b7-05585a332773",
//	ParametersName={"IsEncrypted",
//	"ChangeSetting",
//	"MaxLength",
//	"TestValue"},
//	ParametersType={DisplayType.YesNo,
//	DisplayType.YesNo,
//	DisplayType.Integer,
//	DisplayType.String},
//	ParametersSeqNo={10,20,30,40},
//	ParametersReference={"bcbf94d0-aa1b-b784-dcb0-6961408b2d83",
//	"bcbf94d0-aa1b-b784-dcb0-6961408b2d83",
//	"af165dd6-b6c3-1076-a713-b4b11fa4b750",
//	"dc109434-dc5c-098b-4f9f-2ceec7b0f812"},
//	ParametersReferenceValue={"",
//	"",
//	"",
//	""},
//	ParametersIsMandatory={"N","N","N","N"},
//	ParametersIsRange={"N","N","N","N"},
//	ParametersDefaultValue={"N","N","",""},
//	ParametersDefaultValue2={"","","",""},
//	ParametersvFormat={"","","",""},
//	ParametersvalueMin={"","","",""},
//	ParametersvalueMax={"","","",""},
//	ParametersDisplayLogic={"","","",""},
//	ParametersReadOnlyLogic={"","","",""})	
	public String doIt () throws Exception
	{
		log.info("AD_Column_ID=" + p_AD_Column_ID
			+ ", IsEncrypted=" + p_IsEncrypted
			+ ", ChangeSetting=" + p_ChangeSetting
			+ ", MaxLength=" + p_MaxLength);
		MColumn column = new MColumn (getCtx(), p_AD_Column_ID, null);
		if (column.get_ID() == 0 || column.get_ID() != p_AD_Column_ID)
			throw new XendraUserError("@NotFound@ @AD_Column_ID@ - " + p_AD_Column_ID);
		//
		String columnName = column.getColumnName();
		int dt = column.getAD_Reference_ID();
		
		//	Can it be enabled?
		if (column.isKey() 
			|| column.isParent() 
			|| column.isStandardColumn()
			|| column.isVirtualColumn() 
			|| column.isIdentifier() 
			|| column.isTranslated()
			|| DisplayType.isLookup(dt) 
			|| DisplayType.isLOB(dt)
			|| "DocumentNo".equalsIgnoreCase(column.getColumnName())
			|| "Value".equalsIgnoreCase(column.getColumnName())
			|| "Name".equalsIgnoreCase(column.getColumnName()))
		{
			if (column.isEncrypted())
			{
				column.setIsEncrypted(false);
				column.save();
			}
			return columnName + ": cannot be encrypted";
		}
		
		//	Start
		addLog(0, null, null, "Encryption Class = " + SecureEngine.getClassName());
		boolean error = false;
		
		//	Test Value
		if (p_TestValue != null && p_TestValue.length() > 0)
		{
			String encString = SecureEngine.encrypt(p_TestValue);
			addLog(0, null, null, "Encrypted Test Value=" + encString);
			String clearString = SecureEngine.decrypt(encString);
			if (p_TestValue.equals(clearString))
				addLog(0, null, null, "Decrypted=" + clearString 
					+ " (same as test value)");
			else
			{
				addLog(0, null, null, "Decrypted=" + clearString 
					+ " (NOT the same as test value - check algorithm)");
				error = true;
			}
			int encLength = encString.length();
			addLog(0, null, null, "Test Length=" + p_TestValue.length() + " -> " + encLength);
			if (encLength <= column.getFieldLength())
				addLog(0, null, null, "Encrypted Length (" + encLength 
					+ ") fits into field (" + column.getFieldLength() + ")");
			else
			{
				addLog(0, null, null, "Encrypted Length (" + encLength 
					+ ") does NOT fit into field (" + column.getFieldLength() + ") - resize field");
				error = true;
			}
		}

		//	Length Test
		if (p_MaxLength != 0)
		{
			String testClear = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			while (testClear.length() < p_MaxLength)
				testClear += testClear;
			testClear = testClear.substring(0, p_MaxLength);
			log.config("Test=" + testClear + " (" + p_MaxLength + ")");
			//
			String encString = SecureEngine.encrypt(testClear);
			int encLength = encString.length();
			addLog(0, null, null, "Test Max Length=" + testClear.length() + " -> " + encLength);
			if (encLength <= column.getFieldLength())
				addLog(0, null, null, "Encrypted Max Length (" + encLength 
					+ ") fits into field (" + column.getFieldLength() + ")");
			else
			{
				addLog(0, null, null, "Encrypted Max Length (" + encLength 
					+ ") does NOT fit into field (" + column.getFieldLength() + ") - resize field");
				error = true;
			}
		}

		if (p_IsEncrypted != column.isEncrypted())
		{
			if (error || !p_ChangeSetting)
				addLog(0, null, null, "Encryption NOT changed - Encryption=" + column.isEncrypted());
			else
			{
				column.setIsEncrypted(p_IsEncrypted);
				if (column.save())
					addLog(0, null, null, "Encryption CHANGED - Encryption=" + column.isEncrypted());
				else
					addLog(0, null, null, "Save Error");
			}
		}
		return "Encryption=" + column.isEncrypted();
	}	//	doIt

}	//	EncryptionTest
