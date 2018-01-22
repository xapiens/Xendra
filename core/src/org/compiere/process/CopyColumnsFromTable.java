/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2007 ADempiere, Inc. All Rights Reserved.                    *
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
 * Adempiere, Inc.                                                            *
 *****************************************************************************/
package org.compiere.process;

import java.sql.*;
import java.util.logging.*;
import org.compiere.db.*;
import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.M_Element;
import org.compiere.util.*;

import org.xendra.annotations.XendraProcess;
import org.xendra.annotations.XendraProcessParameter;

/**
 *	Copy columns from one table to other
 *	
 *  @author Carlos Ruiz - globalqss
 *  @version $Id: CopyColumnsFromTable
 */
@XendraProcess(value="AD_Table_CopyColumnsFromTable",
name="Copy Columns from Table",
description="Create Dictionary Columns for a Table taking another as base",
help="",
Identifier="8c7c9cc9-fe24-26f6-b58a-71bba5142133",
classname="org.compiere.process.CopyColumnsFromTable",
updated="2015-06-20 10:10:12")	
public class CopyColumnsFromTable extends SvrProcess
{
	/** Target Table		*/
	private int		p_target_AD_Table_ID = 0;
	/** Source Table		*/
	@XendraProcessParameter(Name="Table",
			                ColumnName="AD_Table_ID",
			                Description="Database Table information",
			                Help="The Database Table provides the information of the table definition",
			                AD_Reference_ID=DisplayType.TableDir,
			                SeqNo=10,
			                ReferenceValueID="",
			                ValRuleID="",
			                FieldLength=0,
			                IsMandatory=true,
			                IsRange=false,
			                DefaultValue="",
			                DefaultValue2="",
			                vFormat="",
			                valueMin="",
			                valueMax="",
			                DisplayLogic="",
			                ReadOnlyLogic="",
			                Identifier="940ce7ef-de25-bf01-64f2-91614d5b2cd7")	
	private int		p_source_AD_Table_ID = 0;
	
	/** Column Count	*/
	private int 	m_count = 0;

	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Table_ID"))
				p_source_AD_Table_ID = para[i].getParameterAsInt();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		p_target_AD_Table_ID = getRecord_ID();
	}	//	prepare

	/**
	 * 	Process
	 *	@return info
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		if (p_target_AD_Table_ID == 0)
			throw new XendraSystemError("@NotFound@ @AD_Table_ID@ " + p_target_AD_Table_ID);
		if (p_source_AD_Table_ID == 0)
			throw new XendraSystemError("@NotFound@ @AD_Table_ID@ " + p_source_AD_Table_ID);
		log.info("Source AD_Table_ID=" + p_source_AD_Table_ID
				+ ", Target AD_Table_ID=" + p_target_AD_Table_ID);
		
		MTable targetTable = new MTable(getCtx(), p_target_AD_Table_ID, get_TrxName());
		MColumn[] targetColumns = targetTable.getColumns(true);
		if (targetColumns.length > 0)
			// TODO: dictionary message
			throw new XendraSystemError("Target table must not have columns");
		
		MTable sourceTable = new MTable(getCtx(), p_source_AD_Table_ID, get_TrxName());
		MColumn[] sourceColumns = sourceTable.getColumns(true);
		
		for (int i = 0; i < sourceColumns.length; i++)
		{
			MColumn colTarget = new MColumn(targetTable);
			// special case the key -> sourceTable_ID
			if (sourceColumns[i].getColumnName().equals(sourceTable.getTableName()+"_ID")) {
				String targetColumnName = new String(targetTable.getTableName()+"_ID");
				colTarget.setColumnName(targetColumnName);
				// if the element don't exist, create it 
				M_Element element = M_Element.get (getCtx (), targetColumnName, get_TrxName());
				if (element == null)
				{
					element = new M_Element (getCtx (), targetColumnName, targetTable.getEntityType(), get_TrxName ());
					if (targetColumnName.equalsIgnoreCase (targetTable.getTableName() + "_ID")) {
						element.setColumnName(targetTable.getTableName() + "_ID");
						element.setName(targetTable.getName());
						element.setPrintName(targetTable.getName());
					}
					element.save (get_TrxName());
				}
				colTarget.setAD_Element_ID(element.getAD_Element_ID());
				colTarget.setName(targetTable.getName());
				colTarget.setDescription(targetTable.getDescription());
				colTarget.setHelp(targetTable.getHelp());
			} else {
				colTarget.setColumnName(sourceColumns[i].getColumnName());
				colTarget.setAD_Element_ID(sourceColumns[i].getAD_Element_ID());
				colTarget.setName(sourceColumns[i].getName());
				colTarget.setDescription(sourceColumns[i].getDescription());
				colTarget.setHelp(sourceColumns[i].getHelp());
			}
			colTarget.setVersion(sourceColumns[i].getVersion());
			colTarget.setAD_Val_Rule_ID(sourceColumns[i].getAD_Val_Rule_ID());
			colTarget.setDefaultValue(sourceColumns[i].getDefaultValue());
			colTarget.setFieldLength(sourceColumns[i].getFieldLength());
			colTarget.setIsKey(sourceColumns[i].isKey());
			colTarget.setIsParent(sourceColumns[i].isParent());
			colTarget.setIsMandatory(sourceColumns[i].isMandatory());
			colTarget.setIsTranslated(sourceColumns[i].isTranslated());
			colTarget.setIsIdentifier(sourceColumns[i].isIdentifier());
			colTarget.setSeqNo(sourceColumns[i].getSeqNo());
			colTarget.setIsEncrypted(sourceColumns[i].getIsEncrypted());
			colTarget.setAD_Reference_ID(sourceColumns[i].getAD_Reference_ID());
			colTarget.setAD_Reference_Value_ID(sourceColumns[i].getAD_Reference_Value_ID());
			colTarget.setIsActive(sourceColumns[i].isActive());
			colTarget.setVFormat(sourceColumns[i].getVFormat());
			colTarget.setCallout(sourceColumns[i].getCallout());
			colTarget.setIsUpdateable(sourceColumns[i].isUpdateable());
			colTarget.setAD_Process_ID(sourceColumns[i].getAD_Process_ID());
			colTarget.setValueMin(sourceColumns[i].getValueMin());
			colTarget.setValueMax(sourceColumns[i].getValueMax());
			colTarget.setIsSelectionColumn(sourceColumns[i].isSelectionColumn());
			colTarget.setReadOnlyLogic(sourceColumns[i].getReadOnlyLogic());
			colTarget.setIsSyncDatabase(sourceColumns[i].getIsSyncDatabase());
			colTarget.setIsAlwaysUpdateable(sourceColumns[i].isAlwaysUpdateable());
			colTarget.setColumnSQL(sourceColumns[i].getColumnSQL());
			colTarget.save(get_TrxName());
			
			/* If the column's DB name and other fields are not the same of the element's one
			 * they'll get overwritten, possibly causing errors with duplicated key. The fix
			 * is to set them again after creating the record, as that replacement takes place
			 * only in new records, not in updates.
			 * However, if there's a column with it's name the same as its element's name,
			 * and then another column which uses the same element, there's still this bug :(
			 */
			colTarget.setColumnName(sourceColumns[i].getColumnName());
			colTarget.setName(sourceColumns[i].getName());
			colTarget.setDescription(sourceColumns[i].getDescription());
			colTarget.setHelp(sourceColumns[i].getHelp());
			colTarget.save(get_TrxName());

			// TODO: Copy translations
			m_count++;
		}
		
		//
		return "#" + m_count;
	}	//	doIt

	
}	//	CopyColumnsFromTable