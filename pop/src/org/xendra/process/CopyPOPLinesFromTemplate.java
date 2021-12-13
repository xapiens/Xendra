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
package org.xendra.process;

import java.util.ArrayList;

import org.compiere.model.MPOP;
import org.compiere.model.MPOPLine;
import org.compiere.model.persistence.X_C_OrderLine;
import org.compiere.model.persistence.X_C_InvoiceLine;
import org.compiere.model.persistence.X_C_POP;
import org.compiere.process.SvrProcess;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.xendra.annotations.*;

/**
 *
 * @author xapiens
 */
@XendraProcess(value="CopyPOPColumnsFromTemplate",
name="CopyPOPColumnsFromTemplate",
description="",
help="",
Identifier="4900fe97-8511-45f6-89e8-22dd047d9e79",
classname="org.xendra.process.CopyPOPLinesFromTemplate",
updated="2015-06-20 10:10:12")    
public class CopyPOPLinesFromTemplate extends SvrProcess {
    private int m_Record_ID;
    private int m_AD_Table_ID;
    @Override
    protected void prepare() {
           
    }

    public POPLine[] getPOPtemplatelines()
    {
        ArrayList<POPLine> templatelines = new ArrayList<POPLine>();
        //                             Name,           description        classname, isreadwrite, isvisible,                                                       ad_column_id, line,                ad_table_id, isdefault, isdescription, isnextline, iskey, sourcemethodname,    ad_reference_value_id,       type   ad_reference_id, Type
        templatelines.add(new POPLine("Name"         ,           "",       "String",       false,     true,                                                                    0,   10,                          0,     false,        true,      false,  false,                      "Name",                     0,   DisplayType.String, "B"));
        templatelines.add(new POPLine("Price w Tax"  ,           "",   "BigDecimal",        true,     true,                                                                    0,   20,                          0,     false,       false,      false,  false,    "PriceEnteredWithoutTax",                     0,   DisplayType.Amount, "P"));
        templatelines.add(new POPLine("PriceEntered" ,           "",   "BigDecimal",        true,     true,                                                                    0,   30,                          0,     false,       false,      false,  false,              "PriceEntered",                     0,   DisplayType.Amount, "P"));
        templatelines.add(new POPLine("Value"        ,           "",       "String",       false,     true,                                                                    0,   40,                          0,     false,       false,      false,  false,                     "Value",                     0,   DisplayType.String, "P"));
        templatelines.add(new POPLine("QtyEntered"   ,           "",   "BigDecimal",        true,     true,                                                                    0,   50,                          0,      true,       false,      false,  false,                "QtyEntered",                     0,   DisplayType.Quantity,"B"));
        templatelines.add(new POPLine("C_UOM_ID"     ,           "",      "Integer",        true,     true,                 Util.getColumnID(X_C_OrderLine.Table_ID, "C_UOM_ID"),   60,     X_C_OrderLine.Table_ID,     false,       false,      false,  false,                  "C_UOM_ID",                     0,                    0,"P"));
        templatelines.add(new POPLine("QtyBonus"     ,           "",   "BigDecimal",        true,     true,                                                                    0,   70,                          0,     false,       false,      false,  false,                  "QtyBonus",                     0,   DisplayType.Quantity, "B"));
        templatelines.add(new POPLine("Bonus UOM"    ,           "",      "Integer",        true,     true,                 Util.getColumnID(X_C_OrderLine.Table_ID, "C_UOM_ID"),   80,     X_C_OrderLine.Table_ID,     false,       false,      false,  false,             "C_UOMBonus_ID",                     0,   				   0,"P"));
        templatelines.add(new POPLine("Lot"   	     ,           "",      "Integer",        true,     true,Util.getColumnID(X_C_OrderLine.Table_ID, "M_AttributeSetInstance_ID"),   90,     X_C_OrderLine.Table_ID,     false,       false,      false,  false, "M_AttributeSetInstance_ID",                     0,   DisplayType.PAttribute,"P"));
        templatelines.add(new POPLine("QtyOrdered"   ,           "",             "",       false,     true,                                                                    0,  100,                          0,     false,       false,      false,  false,                "QtyOrdered",                     0,   DisplayType.Quantity,"P"));
        //templatelines.add(new POPLine("% D1"         ,           "",   "BigDecimal",        true,    false,                                                                    0,  110,                          0,     false,       false,      false,  false,                 "Discount1",                   0,   DisplayType.Amount,"P"));
        templatelines.add(new POPLine("% D2"         ,           "",   "BigDecimal",        true,    true,                                                                    0,   110,                          0,     false,       false,      false,  false,                 "Discount2",                     0,   DisplayType.Amount,"P"));
        templatelines.add(new POPLine("Tax"          ,           "",      "Integer",        true,    true,                Util.getColumnID(X_C_InvoiceLine.Table_ID, "C_Tax_ID"),  120,                          0,     false,       false,      false,  false,                 "C_Tax_ID",                      0,   0,"P"));
        templatelines.add(new POPLine("% D.Adic."    ,           "",   "BigDecimal",        true,    true,                                                                    0,   130,                          0,     false,       false,      false,  false,                 "Discount3",                     0,   DisplayType.Amount,"P"));
        templatelines.add(new POPLine("% D4"         ,           "",   "BigDecimal",        true,    true,                                                                    0,   140,                          0,     false,       false,      false,  false,                 "Discount4",                     0,   DisplayType.Amount,"P"));
        templatelines.add(new POPLine("P. Compra"    ,           "",             "",        true,    true,                                                                    0,   150,                          0,     false,       false,      false,  false,         "PriceAcquisition1",                     0,   DisplayType.Amount, "U" ));
        templatelines.add(new POPLine("Desc Compra"  ,           "",   "BigDecimal",        true,    true,                                                                    0,   160,                          0,     false,       false,      false,  false,          "DiscountAcquire1",                     0,   DisplayType.Amount, "U"));
        templatelines.add(new POPLine("Flete"        ,           "",   "BigDecimal",       false,    true,                                                                    0,   170,                          0,     false,       false,      false,  false,                   "Freight",                     0,   DisplayType.Amount, "U"));
        templatelines.add(new POPLine("Margen Vta"   ,           "",   "BigDecimal",        true,    true,                                                                    0,   180,                          0,     false,       false,      false,  false,               "SalesMargin",                     0,   DisplayType.Amount, "U"));
        templatelines.add(new POPLine("P.Venta T"    ,           "",   "BigDecimal",        true,    true,                                                                    0,   190,                          0,     false,       false,      false,  false,         "PriceAcquisition2",                     0,   DisplayType.Amount, "U"));
        templatelines.add(new POPLine("Precio List Vta" ,        "",   "BigDecimal",        true,    true,                                                                    0,   200,                          0,     false,       false,      false,  false,            "SalesPriceList",                     0,   DisplayType.Amount, "U"));
        templatelines.add(new POPLine("Net"          ,           "",   "BigDecimal",        true,   false,                                                                    0,   210,                          0,     false,       false,      false,  false,                       "Net",                     0,   DisplayType.Amount, "P"));
        templatelines.add(new POPLine("Total"        ,           "",   "BigDecimal",        true,    true,                                                                    0,   220,                          0,     false,       false,       true,  false,                     "Total",                     0,   DisplayType.Amount, "P"));
        templatelines.add(new POPLine("Lab"          ,           "",             "",       false,    true,                                                                    0,   230,                          0,     false,       false,      false,  false,         "ProductBrandValue",                     0,   DisplayType.String, "B"));
        
        //templatelines.add(new POSLine("Value"));
        POPLine[] lines = new POPLine[templatelines.size()];
        templatelines.toArray(lines);
        return lines;
    }

    protected String doIt() throws Exception {    	
        m_Record_ID = getRecord_ID();        
        m_AD_Table_ID = getTable_ID();
        
        if (m_AD_Table_ID == X_C_POP.Table_ID)
        {
        	processPOP();
        }
        return null;
    }

    private void processPOP() {
    	POPLine[] templatelines =  getPOPtemplatelines();
    	MPOP pop = new MPOP(Env.getCtx(), m_Record_ID, null);
    	MPOPLine[] lines = pop.getLines();
    	// verificara que lineas estan seleccionadas y las marcara como seleccionadas
    	if (lines.length != 0)
    	{
    		for (MPOPLine line:lines)
    		{
    			for (POPLine templateline:templatelines)
    			{
    				if (line.getSourceMethodName().equals(templateline.getSourceMethodName()))
    				{
    					templateline.setIsUsed(true);
    					break;
    				}
    			}        
    		}
    		for (POPLine templateline:templatelines)
    		{
    			if (!templateline.getIsUsed())
    			{
    				MPOPLine newline = new MPOPLine(Env.getCtx(), 0, get_TrxName());
    				templateline.setPOPLine(newline);
    				newline.setC_POP_ID(m_Record_ID);
    				if (newline.save())
    				{

    				}
    			}
    		}		    	
    	}
    	else
    	{
    		for (POPLine templateline:templatelines)
    		{
				MPOPLine newline = new MPOPLine(Env.getCtx(), 0, get_TrxName());
				templateline.setPOPLine(newline);
				newline.setC_POP_ID(m_Record_ID);
				if (newline.save())
				{

				}
    		}		    	    		
    	}
    }

	class POPLine {
		String m_name;
		String m_description;
		String m_classname;
		String m_SourceMethodName;
		String m_type;
		Integer m_AD_Column_ID;
		Integer m_AD_Reference_ID;
		Integer m_AD_Reference_Value_ID;
		Integer m_AD_Table_ID;
		Integer m_Line;
		Boolean m_IsDefault;
		Boolean m_IsUsed = false;
		Boolean m_IsDescription;
		Boolean m_IsSelected = false;
		Boolean m_IsReadWrite;
		Boolean m_IsVisible;
		Boolean m_IsNextLine;
		Boolean m_IsKey;

		POPLine(String Name,
				String Description,
				String Classname,
				Boolean IsReadWrite,
				Boolean IsVisible,
				Integer AD_Column_ID,
				Integer Line,
				Integer AD_Table_ID,
				Boolean IsDefault,
				Boolean IsDescription,
				Boolean IsNextLine,
				Boolean IsKey,
				String SourceMethodName,
				Integer AD_Reference_Value_ID,
				Integer AD_Reference_ID,
				String type) {


			m_name = Name;
			m_description = Description;
			m_classname = Classname;
			m_SourceMethodName = SourceMethodName;
			m_AD_Column_ID = AD_Column_ID;
			m_AD_Reference_ID = AD_Reference_ID;
			m_AD_Reference_Value_ID = AD_Reference_Value_ID;
			m_AD_Table_ID = AD_Table_ID;
			m_Line = Line;
			m_IsDefault = IsDefault;
			m_IsUsed = false;
			m_IsDescription = IsDescription;
			m_IsSelected = false;
			m_IsReadWrite = IsReadWrite;
			m_IsVisible = IsVisible;
			m_IsNextLine = IsNextLine;
			m_IsKey = IsKey;
			m_type = type;
		}

		public Boolean getIsSelected() {
			return m_IsSelected;
		}

		public void setIsSelected(Boolean IsSelected) {
			this.m_IsSelected = IsSelected;
		}

		public String getName() {
			return m_name;
		}

		public String getSourceMethodName() {
			return m_SourceMethodName;
		}

		public Boolean getIsUsed() {
			return m_IsUsed;
		}

		public void setIsUsed(Boolean IsUsed) {
			this.m_IsUsed = IsUsed;
		}

		public Integer getAD_Column_ID() {
			return m_AD_Column_ID;
		}

		public Integer getAD_Reference_ID() {
			return m_AD_Reference_ID;
		}

		public Integer getAD_Reference_Value_ID() {
			return m_AD_Reference_Value_ID;
		}

		public Integer getAD_Table_ID() {
			return m_AD_Table_ID;
		}

		public Boolean getIsDefault() {
			return m_IsDefault;
		}

		public Boolean getIsDescription() {
			return m_IsDescription;
		}

		public Boolean getIsReadWrite() {
			return m_IsReadWrite;
		}

		public Boolean getIsVisible() {
			return m_IsVisible;
		}

		public String getClassname() {
			return m_classname;
		}

		public String getDescription() {
			return m_description;
		}

		public Integer getLine() {
			return m_Line;
		}

		public Boolean getIsNextLine() {
			return m_IsNextLine;
		}

		public Boolean getIsKey() {
			return m_IsKey;
		}

		public String getM_type() {
			return m_type;
		}

		public void setM_type(String m_type) {
			this.m_type = m_type;
		}

		void setPOPLine(MPOPLine newline) {
			if (newline != null)
			{
				newline.setName(getName());
				newline.setDescription(getDescription());

				if (this.getAD_Reference_ID() > 0)
				{
					newline.setAD_Reference_ID(this.getAD_Reference_ID());
				}
				if (this.getAD_Table_ID() > 0)
					newline.setAD_Table_ID(this.getAD_Table_ID());
				if (this.getAD_Column_ID() > 0)
					newline.setAD_Column_ID(this.getAD_Column_ID());
				if (this.getClassname() != null)
					newline.setClassname(getClassname());
				newline.setIsReadWrite(this.getIsReadWrite());
				newline.setIsVisible(this.getIsVisible());            
				newline.setLine(this.getLine());
				newline.setIsDefault(this.getIsDefault());
				newline.setIsDescription(this.getIsDescription());
				newline.setIsNextLine(this.getIsNextLine());
				newline.setIsKey(this.getIsKey());
				newline.setSourceMethodName(this.getSourceMethodName());
				if (this.getAD_Reference_Value_ID() > 0 )
					newline.setAD_Reference_Value_ID(this.getAD_Reference_Value_ID());
				newline.setType(this.getM_type());
			}
		}
	}
}