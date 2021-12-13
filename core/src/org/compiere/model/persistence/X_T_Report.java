/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software. you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY  without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model.persistence;

/** Generated Model - DO NOT CHANGE */
import org.compiere.model.*;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.xendra.annotations.*;
import org.compiere.util.*;
/** Generated Model for T_Report
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_T_Report extends PO
{
/** Standard Constructor
@param ctx context
@param T_Report_ID id
@param trxName transaction
*/
public X_T_Report (Properties ctx, int T_Report_ID, String trxName)
{
super (ctx, T_Report_ID, trxName);
/** if (T_Report_ID == 0)
{
setAD_PInstance_ID (0);
setFact_Acct_ID (0);
setPA_ReportLine_ID (0);
setRecord_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_T_Report (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=544 */
public static int Table_ID=MTable.getTable_ID("T_Report");

@XendraTrl(Identifier="18168799-18ac-858f-03db-9e4b7b638770")
public static String es_PE_TABLE_T_Report_Name="T_Report";

@XendraTable(Name="T_Report",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Temporary Reporting Table",
Help="",TableName="T_Report",AccessLevel="4",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="18168799-18ac-858f-03db-9e4b7b638770",
Synchronized="2020-03-03 21:40:29.0")
/** TableName=T_Report */
public static final String Table_Name="T_Report";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"T_Report");

protected BigDecimal accessLevel = BigDecimal.valueOf(4);
/** AccessLevel
@return 4 - System 
*/
protected int get_AccessLevel()
{
return accessLevel.intValue();
}
/** Load Meta Data
@param ctx context
@return PO Info
*/
protected POInfo initPO (Properties ctx)
{
  if (Table_ID == 0)
    Table_ID = MTable.getTable_ID("T_Report");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_T_Report[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Process Instance.
@param AD_PInstance_ID Instance of the process */
public void setAD_PInstance_ID (int AD_PInstance_ID)
{
if (AD_PInstance_ID < 1) throw new IllegalArgumentException ("AD_PInstance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
}
/** Get Process Instance.
@return Instance of the process */
public int getAD_PInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b159ae1c-6744-6529-154e-d87816c6718e")
public static String es_PE_COLUMN_AD_PInstance_ID_Name="Instancia del Proceso";

@XendraColumn(AD_Element_ID="a293ee40-db79-24cc-fb47-781657ecb499",ColumnName="AD_PInstance_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b159ae1c-6744-6529-154e-d87816c6718e",
Synchronized="2019-08-30 22:24:27.0")
/** Column name AD_PInstance_ID */
public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";
/** Set Col_0.
@param Col_0 Col_0 */
public void setCol_0 (BigDecimal Col_0)
{
set_ValueNoCheck (COLUMNNAME_Col_0, Col_0);
}
/** Get Col_0.
@return Col_0 */
public BigDecimal getCol_0() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_0);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="96f4edb2-76ef-2ab9-5329-95647c8ac926")
public static String es_PE_COLUMN_Col_0_Name="Col_0";

@XendraColumn(AD_Element_ID="4f7f5f50-a649-bdac-e4fc-c552baefd3f7",ColumnName="Col_0",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96f4edb2-76ef-2ab9-5329-95647c8ac926",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_0 */
public static final String COLUMNNAME_Col_0 = "Col_0";
/** Set Col_1.
@param Col_1 Col_1 */
public void setCol_1 (BigDecimal Col_1)
{
set_ValueNoCheck (COLUMNNAME_Col_1, Col_1);
}
/** Get Col_1.
@return Col_1 */
public BigDecimal getCol_1() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_1);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="44ffdd03-3dfb-3fdf-79be-2e68810c5b44")
public static String es_PE_COLUMN_Col_1_Name="Col_1";

@XendraColumn(AD_Element_ID="493a5df6-2fe1-01a1-63a0-b27bbbecda35",ColumnName="Col_1",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44ffdd03-3dfb-3fdf-79be-2e68810c5b44",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_1 */
public static final String COLUMNNAME_Col_1 = "Col_1";
/** Set Col_10.
@param Col_10 Col_10 */
public void setCol_10 (BigDecimal Col_10)
{
set_ValueNoCheck (COLUMNNAME_Col_10, Col_10);
}
/** Get Col_10.
@return Col_10 */
public BigDecimal getCol_10() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_10);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="dbb812f5-28f1-5dc9-5ade-edc057b1a6a7")
public static String es_PE_COLUMN_Col_10_Name="Col_10";

@XendraColumn(AD_Element_ID="3be09b35-8570-45f7-0798-8b22a219ab5a",ColumnName="Col_10",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="dbb812f5-28f1-5dc9-5ade-edc057b1a6a7",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_10 */
public static final String COLUMNNAME_Col_10 = "Col_10";
/** Set Col_11.
@param Col_11 Col_11 */
public void setCol_11 (BigDecimal Col_11)
{
set_ValueNoCheck (COLUMNNAME_Col_11, Col_11);
}
/** Get Col_11.
@return Col_11 */
public BigDecimal getCol_11() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_11);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="208fc0b0-990f-ae1e-c337-5537a98216d1")
public static String es_PE_COLUMN_Col_11_Name="Col_11";

@XendraColumn(AD_Element_ID="6cfe44a7-4fc2-5efa-ad40-6a8ebc5922a0",ColumnName="Col_11",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="208fc0b0-990f-ae1e-c337-5537a98216d1",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_11 */
public static final String COLUMNNAME_Col_11 = "Col_11";
/** Set Col_12.
@param Col_12 Col_12 */
public void setCol_12 (BigDecimal Col_12)
{
set_ValueNoCheck (COLUMNNAME_Col_12, Col_12);
}
/** Get Col_12.
@return Col_12 */
public BigDecimal getCol_12() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_12);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="0e231fe5-1e20-9777-3ac1-f8bf43d8c893")
public static String es_PE_COLUMN_Col_12_Name="Col_12";

@XendraColumn(AD_Element_ID="e16bf46b-1a1f-f571-d16b-1009a7fa9a26",ColumnName="Col_12",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e231fe5-1e20-9777-3ac1-f8bf43d8c893",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_12 */
public static final String COLUMNNAME_Col_12 = "Col_12";
/** Set Col_13.
@param Col_13 Col_13 */
public void setCol_13 (BigDecimal Col_13)
{
set_ValueNoCheck (COLUMNNAME_Col_13, Col_13);
}
/** Get Col_13.
@return Col_13 */
public BigDecimal getCol_13() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_13);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="6463d41a-e11a-ed71-01bd-2e3a71d289ee")
public static String es_PE_COLUMN_Col_13_Name="Col_13";

@XendraColumn(AD_Element_ID="886ffc85-a68c-a988-10a4-fc7a6550b71e",ColumnName="Col_13",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6463d41a-e11a-ed71-01bd-2e3a71d289ee",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_13 */
public static final String COLUMNNAME_Col_13 = "Col_13";
/** Set Col_14.
@param Col_14 Col_14 */
public void setCol_14 (BigDecimal Col_14)
{
set_ValueNoCheck (COLUMNNAME_Col_14, Col_14);
}
/** Get Col_14.
@return Col_14 */
public BigDecimal getCol_14() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_14);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1ac88ee6-57af-de35-3092-ce16247f9684")
public static String es_PE_COLUMN_Col_14_Name="Col_14";

@XendraColumn(AD_Element_ID="5600cdc6-6408-759d-a942-db252cfb98f7",ColumnName="Col_14",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ac88ee6-57af-de35-3092-ce16247f9684",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_14 */
public static final String COLUMNNAME_Col_14 = "Col_14";
/** Set Col_15.
@param Col_15 Col_15 */
public void setCol_15 (BigDecimal Col_15)
{
set_ValueNoCheck (COLUMNNAME_Col_15, Col_15);
}
/** Get Col_15.
@return Col_15 */
public BigDecimal getCol_15() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_15);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="649d339b-7bf9-8a48-19bf-bb166f2af2f3")
public static String es_PE_COLUMN_Col_15_Name="Col_15";

@XendraColumn(AD_Element_ID="3bf7e8ae-ee6a-d7c0-5806-f1873b9b2f30",ColumnName="Col_15",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="649d339b-7bf9-8a48-19bf-bb166f2af2f3",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_15 */
public static final String COLUMNNAME_Col_15 = "Col_15";
/** Set Col_16.
@param Col_16 Col_16 */
public void setCol_16 (BigDecimal Col_16)
{
set_ValueNoCheck (COLUMNNAME_Col_16, Col_16);
}
/** Get Col_16.
@return Col_16 */
public BigDecimal getCol_16() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_16);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="f9753335-ace7-bd0f-a37b-0c86f2946108")
public static String es_PE_COLUMN_Col_16_Name="Col_16";

@XendraColumn(AD_Element_ID="91ed2b07-85b5-e57c-f735-58d40b21cd15",ColumnName="Col_16",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f9753335-ace7-bd0f-a37b-0c86f2946108",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_16 */
public static final String COLUMNNAME_Col_16 = "Col_16";
/** Set Col_17.
@param Col_17 Col_17 */
public void setCol_17 (BigDecimal Col_17)
{
set_ValueNoCheck (COLUMNNAME_Col_17, Col_17);
}
/** Get Col_17.
@return Col_17 */
public BigDecimal getCol_17() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_17);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="57c14495-3544-b5cc-2723-ee192cc8ecfa")
public static String es_PE_COLUMN_Col_17_Name="Col_17";

@XendraColumn(AD_Element_ID="fc9b713f-a280-8547-c5ff-e184d5deed16",ColumnName="Col_17",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57c14495-3544-b5cc-2723-ee192cc8ecfa",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_17 */
public static final String COLUMNNAME_Col_17 = "Col_17";
/** Set Col_18.
@param Col_18 Col_18 */
public void setCol_18 (BigDecimal Col_18)
{
set_ValueNoCheck (COLUMNNAME_Col_18, Col_18);
}
/** Get Col_18.
@return Col_18 */
public BigDecimal getCol_18() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_18);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="1319dc2b-d614-e5d3-2b4d-4cc12334c838")
public static String es_PE_COLUMN_Col_18_Name="Col_18";

@XendraColumn(AD_Element_ID="3f3f131f-a01d-1a73-18d4-4922704ddbfd",ColumnName="Col_18",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1319dc2b-d614-e5d3-2b4d-4cc12334c838",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_18 */
public static final String COLUMNNAME_Col_18 = "Col_18";
/** Set Col_19.
@param Col_19 Col_19 */
public void setCol_19 (BigDecimal Col_19)
{
set_ValueNoCheck (COLUMNNAME_Col_19, Col_19);
}
/** Get Col_19.
@return Col_19 */
public BigDecimal getCol_19() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_19);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="ac43d3a2-b519-70e3-6f5b-cb40cc62d333")
public static String es_PE_COLUMN_Col_19_Name="Col_19";

@XendraColumn(AD_Element_ID="6f81e944-fefc-b445-5363-8efcde7fb6d0",ColumnName="Col_19",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac43d3a2-b519-70e3-6f5b-cb40cc62d333",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_19 */
public static final String COLUMNNAME_Col_19 = "Col_19";
/** Set Col_2.
@param Col_2 Col_2 */
public void setCol_2 (BigDecimal Col_2)
{
set_ValueNoCheck (COLUMNNAME_Col_2, Col_2);
}
/** Get Col_2.
@return Col_2 */
public BigDecimal getCol_2() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_2);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d9550f7a-b3ea-7651-a4c9-f798c7345942")
public static String es_PE_COLUMN_Col_2_Name="Col_2";

@XendraColumn(AD_Element_ID="c06b1677-b7d4-55c5-6186-352bdbd52598",ColumnName="Col_2",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9550f7a-b3ea-7651-a4c9-f798c7345942",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_2 */
public static final String COLUMNNAME_Col_2 = "Col_2";
/** Set Col_20.
@param Col_20 Col_20 */
public void setCol_20 (BigDecimal Col_20)
{
set_ValueNoCheck (COLUMNNAME_Col_20, Col_20);
}
/** Get Col_20.
@return Col_20 */
public BigDecimal getCol_20() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_20);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="260ff2e3-3d49-fee4-255f-6c7697377b3e")
public static String es_PE_COLUMN_Col_20_Name="Col_20";

@XendraColumn(AD_Element_ID="b3ef32e0-0b4b-723f-7322-c94afeec7d81",ColumnName="Col_20",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="260ff2e3-3d49-fee4-255f-6c7697377b3e",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_20 */
public static final String COLUMNNAME_Col_20 = "Col_20";
/** Set Col_3.
@param Col_3 Col_3 */
public void setCol_3 (BigDecimal Col_3)
{
set_ValueNoCheck (COLUMNNAME_Col_3, Col_3);
}
/** Get Col_3.
@return Col_3 */
public BigDecimal getCol_3() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_3);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="cc88b315-baa4-b37b-7b41-1fdc2c4be186")
public static String es_PE_COLUMN_Col_3_Name="Col_3";

@XendraColumn(AD_Element_ID="210b08d7-aed0-d899-7dfb-c1d1523e0ae6",ColumnName="Col_3",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc88b315-baa4-b37b-7b41-1fdc2c4be186",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_3 */
public static final String COLUMNNAME_Col_3 = "Col_3";
/** Set Col_4.
@param Col_4 Col_4 */
public void setCol_4 (BigDecimal Col_4)
{
set_ValueNoCheck (COLUMNNAME_Col_4, Col_4);
}
/** Get Col_4.
@return Col_4 */
public BigDecimal getCol_4() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_4);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="b6e12f9f-b382-f909-1432-a4c7232652f6")
public static String es_PE_COLUMN_Col_4_Name="Col_4";

@XendraColumn(AD_Element_ID="d3879211-bbcd-f1cf-4039-cde57398bbbb",ColumnName="Col_4",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6e12f9f-b382-f909-1432-a4c7232652f6",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_4 */
public static final String COLUMNNAME_Col_4 = "Col_4";
/** Set Col_5.
@param Col_5 Col_5 */
public void setCol_5 (BigDecimal Col_5)
{
set_ValueNoCheck (COLUMNNAME_Col_5, Col_5);
}
/** Get Col_5.
@return Col_5 */
public BigDecimal getCol_5() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_5);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d1276fce-7a75-b8e6-fce6-839963abcfad")
public static String es_PE_COLUMN_Col_5_Name="Col_5";

@XendraColumn(AD_Element_ID="635c711d-5311-f6b0-75ed-4ccf8ab2b770",ColumnName="Col_5",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d1276fce-7a75-b8e6-fce6-839963abcfad",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_5 */
public static final String COLUMNNAME_Col_5 = "Col_5";
/** Set Col_6.
@param Col_6 Col_6 */
public void setCol_6 (BigDecimal Col_6)
{
set_ValueNoCheck (COLUMNNAME_Col_6, Col_6);
}
/** Get Col_6.
@return Col_6 */
public BigDecimal getCol_6() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_6);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7179410f-3836-b6a3-27de-40ba5a4690d8")
public static String es_PE_COLUMN_Col_6_Name="Col_6";

@XendraColumn(AD_Element_ID="92d84f5d-59d2-8096-4e05-f9544c3504ea",ColumnName="Col_6",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7179410f-3836-b6a3-27de-40ba5a4690d8",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_6 */
public static final String COLUMNNAME_Col_6 = "Col_6";
/** Set Col_7.
@param Col_7 Col_7 */
public void setCol_7 (BigDecimal Col_7)
{
set_ValueNoCheck (COLUMNNAME_Col_7, Col_7);
}
/** Get Col_7.
@return Col_7 */
public BigDecimal getCol_7() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_7);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="985b0ac3-e184-7d1b-88d5-bfd12ba7e0bb")
public static String es_PE_COLUMN_Col_7_Name="Col_7";

@XendraColumn(AD_Element_ID="3c68249a-d0d4-e600-1425-d52a1c02fc06",ColumnName="Col_7",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="985b0ac3-e184-7d1b-88d5-bfd12ba7e0bb",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_7 */
public static final String COLUMNNAME_Col_7 = "Col_7";
/** Set Col_8.
@param Col_8 Col_8 */
public void setCol_8 (BigDecimal Col_8)
{
set_ValueNoCheck (COLUMNNAME_Col_8, Col_8);
}
/** Get Col_8.
@return Col_8 */
public BigDecimal getCol_8() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_8);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7d105d58-0307-075f-c3c6-aa3e793ea61b")
public static String es_PE_COLUMN_Col_8_Name="Col_8";

@XendraColumn(AD_Element_ID="aac8dac5-d9b2-3ab5-1490-427265444afe",ColumnName="Col_8",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7d105d58-0307-075f-c3c6-aa3e793ea61b",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_8 */
public static final String COLUMNNAME_Col_8 = "Col_8";
/** Set Col_9.
@param Col_9 Col_9 */
public void setCol_9 (BigDecimal Col_9)
{
set_ValueNoCheck (COLUMNNAME_Col_9, Col_9);
}
/** Get Col_9.
@return Col_9 */
public BigDecimal getCol_9() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Col_9);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="3d3ba521-77a7-7de2-4100-69b783728f92")
public static String es_PE_COLUMN_Col_9_Name="Col_9";

@XendraColumn(AD_Element_ID="13d15ad7-6c78-df33-0377-c597458a97b6",ColumnName="Col_9",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d3ba521-77a7-7de2-4100-69b783728f92",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Col_9 */
public static final String COLUMNNAME_Col_9 = "Col_9";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_ValueNoCheck (COLUMNNAME_Description, Description);
}
/** Get Description.
@return Optional short DESCRIPTION of the record */
public String getDescription() 
{
String value = (String)get_Value(COLUMNNAME_Description);
if (value == null)
  return "";
if (value.contains("\""))
  value = value.replaceAll("\"","'");
if (value.contains("\n"))
  value = value.replaceAll("\n"," ");
if (value.contains(";"))
  value = value.replaceAll(";",":");
return value;
}

@XendraTrl(Identifier="b5c9956a-1a7a-aee2-e999-89fe10477098")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b5c9956a-1a7a-aee2-e999-89fe10477098",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Accounting Fact.
@param Fact_Acct_ID Accounting Fact */
public void setFact_Acct_ID (int Fact_Acct_ID)
{
if (Fact_Acct_ID < 1) throw new IllegalArgumentException ("Fact_Acct_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Fact_Acct_ID, Integer.valueOf(Fact_Acct_ID));
}
/** Get Accounting Fact.
@return Accounting Fact */
public int getFact_Acct_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Fact_Acct_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="84fe7047-9928-21b7-37be-f744ef28bed1")
public static String es_PE_COLUMN_Fact_Acct_ID_Name="Hecho Contable";

@XendraColumn(AD_Element_ID="c1839793-0346-4c78-96ff-8f7942ce0082",ColumnName="Fact_Acct_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="84fe7047-9928-21b7-37be-f744ef28bed1",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Fact_Acct_ID */
public static final String COLUMNNAME_Fact_Acct_ID = "Fact_Acct_ID";
/** Set Level no.
@param LevelNo Level no */
public void setLevelNo (int LevelNo)
{
set_ValueNoCheck (COLUMNNAME_LevelNo, Integer.valueOf(LevelNo));
}
/** Get Level no.
@return Level no */
public int getLevelNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_LevelNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d8b112c9-9588-09ea-3f87-ac82fbca0145")
public static String es_PE_COLUMN_LevelNo_Name="No. Nivel";

@XendraColumn(AD_Element_ID="921dedce-e02b-c2ef-b03d-5727e1971853",ColumnName="LevelNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d8b112c9-9588-09ea-3f87-ac82fbca0145",
Synchronized="2019-08-30 22:24:27.0")
/** Column name LevelNo */
public static final String COLUMNNAME_LevelNo = "LevelNo";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_ValueNoCheck (COLUMNNAME_Name, Name);
}
/** Get Name.
@return Alphanumeric identifier of the entity */
public String getName() 
{
String value = (String)get_Value(COLUMNNAME_Name);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getName());
}

@XendraTrl(Identifier="88ac7aa2-c979-3832-88f3-ab1316e9fe1c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88ac7aa2-c979-3832-88f3-ab1316e9fe1c",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Report Line.
@param PA_ReportLine_ID Report Line */
public void setPA_ReportLine_ID (int PA_ReportLine_ID)
{
if (PA_ReportLine_ID < 1) throw new IllegalArgumentException ("PA_ReportLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportLine_ID, Integer.valueOf(PA_ReportLine_ID));
}
/** Get Report Line.
@return Report Line */
public int getPA_ReportLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f7ccfc24-55cd-73b6-35f5-201ce0825c57")
public static String es_PE_COLUMN_PA_ReportLine_ID_Name="Línea de Informe";

@XendraColumn(AD_Element_ID="52ed6403-4961-3af8-0136-2d580aef2758",ColumnName="PA_ReportLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f7ccfc24-55cd-73b6-35f5-201ce0825c57",
Synchronized="2019-08-30 22:24:27.0")
/** Column name PA_ReportLine_ID */
public static final String COLUMNNAME_PA_ReportLine_ID = "PA_ReportLine_ID";
/** Set Record ID.
@param Record_ID Direct internal record ID */
public void setRecord_ID (int Record_ID)
{
if (Record_ID < 0) throw new IllegalArgumentException ("Record_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
}
/** Get Record ID.
@return Direct internal record ID */
public int getRecord_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9dfbdcc1-f965-8b99-7afa-98aa2c0982a0")
public static String es_PE_COLUMN_Record_ID_Name="ID de Registro";

@XendraColumn(AD_Element_ID="86e36e4b-d1dc-2deb-449d-c1f6769e1603",ColumnName="Record_ID",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9dfbdcc1-f965-8b99-7afa-98aa2c0982a0",
Synchronized="2019-08-30 22:24:27.0")
/** Column name Record_ID */
public static final String COLUMNNAME_Record_ID = "Record_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_ValueNoCheck (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="44954f39-89d0-2129-7ab7-4cb247ec6c37")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44954f39-89d0-2129-7ab7-4cb247ec6c37",
Synchronized="2019-08-30 22:24:27.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
