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
/** Generated Model for C_BOELine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BOELine extends PO
{
/** Standard Constructor
@param ctx context
@param C_BOELine_ID id
@param trxName transaction
*/
public X_C_BOELine (Properties ctx, int C_BOELine_ID, String trxName)
{
super (ctx, C_BOELine_ID, trxName);
/** if (C_BOELine_ID == 0)
{
setC_BOE_ID (0);
setC_BoeLine_ID (0);
setC_Currency_ID (0);
setC_Invoice_ID (0);
setProcessed (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BOELine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000117 */
public static int Table_ID=MTable.getTable_ID("C_BOELine");

@XendraTrl(Identifier="d63ed171-a515-c01f-62ba-30b6790f3886")
public static String es_PE_TAB_BillOfExchangeLine_Name="Detalle Letra";

@XendraTab(Name="Bill of Exchange Line",Description="",Help="",
AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="d63ed171-a515-c01f-62ba-30b6790f3886",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchangeLine="d63ed171-a515-c01f-62ba-30b6790f3886";

@XendraTrl(Identifier="0a458553-c9ba-88d0-802e-6dc394c97d3c")
public static String es_PE_TAB_BillOfExchangeLine2_Name="Detalle de Letra";

@XendraTab(Name="Bill of Exchange Line",Description="",Help="",
AD_Window_ID="8f6df5bf-4121-5ea0-797c-32487bcbbea9",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0a458553-c9ba-88d0-802e-6dc394c97d3c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BillOfExchangeLine2="0a458553-c9ba-88d0-802e-6dc394c97d3c";

@XendraTrl(Identifier="10c2beea-e19c-ab80-f07c-86a666e51523")
public static String es_PE_TABLE_C_BOELine_Name="Bill Of Exchange Line";

@XendraTable(Name="Bill Of Exchange Line",Description="Bill Of Exchange Line",Help="",
TableName="C_BOELine",AccessLevel="3",AD_Window_ID="ed5bcd83-9b1c-d7fa-65a9-38f76f7a8d35",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=120,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="8f6df5bf-4121-5ea0-797c-32487bcbbea9",
ID="org.xendra.commercial",Identifier="10c2beea-e19c-ab80-f07c-86a666e51523",
Synchronized="2017-08-16 11:41:27.0")
/** TableName=C_BOELine */
public static final String Table_Name="C_BOELine";


@XendraIndex(Name="c_boeline_boe",Identifier="b63f365b-58fa-050a-4df2-439686ed628e",
Column_Names="c_boe_id",IsUnique="false",TableIdentifier="b63f365b-58fa-050a-4df2-439686ed628e",
Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_c_boeline_boe = "b63f365b-58fa-050a-4df2-439686ed628e";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BOELine");

protected BigDecimal accessLevel = BigDecimal.valueOf(3);
/** AccessLevel
@return 3 - Client - Org 
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
    Table_ID = MTable.getTable_ID("C_BOELine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BOELine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amount Amount in a defined currency */
public void setAmount (BigDecimal Amount)
{
set_Value (COLUMNNAME_Amount, Amount);
}
/** Get Amount.
@return Amount in a defined currency */
public BigDecimal getAmount() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c634a69a-17de-f431-b9d2-8d573fa0c969")
public static String es_PE_FIELD_BillOfExchangeLine_Amount_Description="Total en una moneda definida";

@XendraTrl(Identifier="c634a69a-17de-f431-b9d2-8d573fa0c969")
public static String es_PE_FIELD_BillOfExchangeLine_Amount_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="c634a69a-17de-f431-b9d2-8d573fa0c969")
public static String es_PE_FIELD_BillOfExchangeLine_Amount_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c634a69a-17de-f431-b9d2-8d573fa0c969")
public static final String FIELDNAME_BillOfExchangeLine_Amount="c634a69a-17de-f431-b9d2-8d573fa0c969";

@XendraTrl(Identifier="a6502f93-61fc-9019-88a6-b13cb177ee0f")
public static String es_PE_FIELD_BillOfExchangeLine_Amount2_Description="Total en una moneda definida";

@XendraTrl(Identifier="a6502f93-61fc-9019-88a6-b13cb177ee0f")
public static String es_PE_FIELD_BillOfExchangeLine_Amount2_Help="Indica el total para esta línea del documento";

@XendraTrl(Identifier="a6502f93-61fc-9019-88a6-b13cb177ee0f")
public static String es_PE_FIELD_BillOfExchangeLine_Amount2_Name="Total";

@XendraField(AD_Column_ID="Amount",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6502f93-61fc-9019-88a6-b13cb177ee0f")
public static final String FIELDNAME_BillOfExchangeLine_Amount2="a6502f93-61fc-9019-88a6-b13cb177ee0f";

@XendraTrl(Identifier="1342e20e-e086-0fee-1a29-e3be75b96f6f")
public static String es_PE_COLUMN_Amount_Name="Total";

@XendraColumn(AD_Element_ID="d89b3a02-29fd-e2e3-2d01-dbda08fb2454",ColumnName="Amount",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1342e20e-e086-0fee-1a29-e3be75b96f6f",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Amount */
public static final String COLUMNNAME_Amount = "Amount";
/** Set C_BOEGroup.
@param C_BOEGroup_ID C_BOEGroup */
public void setC_BOEGroup_ID (int C_BOEGroup_ID)
{
if (C_BOEGroup_ID <= 0) set_Value (COLUMNNAME_C_BOEGroup_ID, null);
 else 
set_Value (COLUMNNAME_C_BOEGroup_ID, Integer.valueOf(C_BOEGroup_ID));
}
/** Get C_BOEGroup.
@return C_BOEGroup */
public int getC_BOEGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOEGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9dda7fab-2574-a983-a87a-9b49e468d804")
public static String es_PE_FIELD_BillOfExchangeLine_C_BOEGroup_Name="Grupo Boe";

@XendraField(AD_Column_ID="C_BOEGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dda7fab-2574-a983-a87a-9b49e468d804")
public static final String FIELDNAME_BillOfExchangeLine_C_BOEGroup="9dda7fab-2574-a983-a87a-9b49e468d804";

@XendraTrl(Identifier="a118851f-ea1e-2e97-d4a1-30578f248cf5")
public static String es_PE_FIELD_BillOfExchangeLine_C_BOEGroup2_Name="Grupo de Letra";

@XendraField(AD_Column_ID="C_BOEGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a118851f-ea1e-2e97-d4a1-30578f248cf5")
public static final String FIELDNAME_BillOfExchangeLine_C_BOEGroup2="a118851f-ea1e-2e97-d4a1-30578f248cf5";

@XendraTrl(Identifier="3f6cc891-0cbb-6cca-6fce-bfa8e81cf5b5")
public static String es_PE_COLUMN_C_BOEGroup_ID_Name="C_BOEGroup";

@XendraColumn(AD_Element_ID="98c77de4-f7aa-4c1b-a5ce-a1b48433fb79",ColumnName="C_BOEGroup_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f6cc891-0cbb-6cca-6fce-bfa8e81cf5b5",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_BOEGroup_ID */
public static final String COLUMNNAME_C_BOEGroup_ID = "C_BOEGroup_ID";
/** Set Bill Of Exchange.
@param C_BOE_ID Bill Of Exchange Identifier */
public void setC_BOE_ID (int C_BOE_ID)
{
if (C_BOE_ID < 1) throw new IllegalArgumentException ("C_BOE_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BOE_ID, Integer.valueOf(C_BOE_ID));
}
/** Get Bill Of Exchange.
@return Bill Of Exchange Identifier */
public int getC_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="909b74fd-61d4-7dbe-5974-1d18e5ba66b7")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchange_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="909b74fd-61d4-7dbe-5974-1d18e5ba66b7")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchange_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="909b74fd-61d4-7dbe-5974-1d18e5ba66b7")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchange_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="909b74fd-61d4-7dbe-5974-1d18e5ba66b7")
public static final String FIELDNAME_BillOfExchangeLine_BillOfExchange="909b74fd-61d4-7dbe-5974-1d18e5ba66b7";

@XendraTrl(Identifier="860a479f-bc90-6b67-afa0-f47ba99eee09")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchange2_Description="Identificador de la Letra de Cambio ";

@XendraTrl(Identifier="860a479f-bc90-6b67-afa0-f47ba99eee09")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchange2_Help="El docuemnto Letra de Cambio";

@XendraTrl(Identifier="860a479f-bc90-6b67-afa0-f47ba99eee09")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchange2_Name="Letra de Cambio";

@XendraField(AD_Column_ID="C_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="860a479f-bc90-6b67-afa0-f47ba99eee09")
public static final String FIELDNAME_BillOfExchangeLine_BillOfExchange2="860a479f-bc90-6b67-afa0-f47ba99eee09";

@XendraTrl(Identifier="ef52ecd8-dda6-9c2b-f415-938b5730274e")
public static String es_PE_COLUMN_C_BOE_ID_Name="Letra de Cambio";

@XendraColumn(AD_Element_ID="7dfa9e28-2055-cea9-fa94-b5ebdac44420",ColumnName="C_BOE_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ef52ecd8-dda6-9c2b-f415-938b5730274e",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_BOE_ID */
public static final String COLUMNNAME_C_BOE_ID = "C_BOE_ID";
/** Set Bill Of Exchange Line.
@param C_BoeLine_ID Bill Of Exchange Line */
public void setC_BoeLine_ID (int C_BoeLine_ID)
{
if (C_BoeLine_ID < 1) throw new IllegalArgumentException ("C_BoeLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BoeLine_ID, Integer.valueOf(C_BoeLine_ID));
}
/** Get Bill Of Exchange Line.
@return Bill Of Exchange Line */
public int getC_BoeLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BoeLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f5791e3-4f5f-8c2c-2004-3893dbbf59b2")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchangeLine_Name="Bill Of Exchange Line";

@XendraField(AD_Column_ID="C_BoeLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f5791e3-4f5f-8c2c-2004-3893dbbf59b2")
public static final String FIELDNAME_BillOfExchangeLine_BillOfExchangeLine="1f5791e3-4f5f-8c2c-2004-3893dbbf59b2";

@XendraTrl(Identifier="601eaa2c-e849-2a44-6e3b-c713ceb95aff")
public static String es_PE_FIELD_BillOfExchangeLine_BillOfExchangeLine2_Name="Bill Of Exchange Line";

@XendraField(AD_Column_ID="C_BoeLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="601eaa2c-e849-2a44-6e3b-c713ceb95aff")
public static final String FIELDNAME_BillOfExchangeLine_BillOfExchangeLine2="601eaa2c-e849-2a44-6e3b-c713ceb95aff";
/** Column name C_BoeLine_ID */
public static final String COLUMNNAME_C_BoeLine_ID = "C_BoeLine_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f0c75ae-4863-bc77-ef8c-746d77c914d8")
public static String es_PE_FIELD_BillOfExchangeLine_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="3f0c75ae-4863-bc77-ef8c-746d77c914d8")
public static String es_PE_FIELD_BillOfExchangeLine_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="3f0c75ae-4863-bc77-ef8c-746d77c914d8")
public static String es_PE_FIELD_BillOfExchangeLine_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3f0c75ae-4863-bc77-ef8c-746d77c914d8")
public static final String FIELDNAME_BillOfExchangeLine_Currency="3f0c75ae-4863-bc77-ef8c-746d77c914d8";

@XendraTrl(Identifier="a6248621-0043-3867-88d7-ab35f118732b")
public static String es_PE_FIELD_BillOfExchangeLine_Currency2_Description="Moneda para este registro";

@XendraTrl(Identifier="a6248621-0043-3867-88d7-ab35f118732b")
public static String es_PE_FIELD_BillOfExchangeLine_Currency2_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="a6248621-0043-3867-88d7-ab35f118732b")
public static String es_PE_FIELD_BillOfExchangeLine_Currency2_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a6248621-0043-3867-88d7-ab35f118732b")
public static final String FIELDNAME_BillOfExchangeLine_Currency2="a6248621-0043-3867-88d7-ab35f118732b";

@XendraTrl(Identifier="0fe755ca-eebf-fb65-eaf0-6c4f3c46389b")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0fe755ca-eebf-fb65-eaf0-6c4f3c46389b",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set C_GroupDoc_ID.
@param C_GroupDoc_ID C_GroupDoc_ID */
public void setC_GroupDoc_ID (int C_GroupDoc_ID)
{
if (C_GroupDoc_ID <= 0) set_Value (COLUMNNAME_C_GroupDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_GroupDoc_ID, Integer.valueOf(C_GroupDoc_ID));
}
/** Get C_GroupDoc_ID.
@return C_GroupDoc_ID */
public int getC_GroupDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_GroupDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="7010c9fc-c17f-2447-01ee-78e4a4340ae1")
public static String es_PE_FIELD_BillOfExchangeLine_C_GroupDoc_ID_Name="c_groupdoc_id";

@XendraField(AD_Column_ID="C_GroupDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7010c9fc-c17f-2447-01ee-78e4a4340ae1")
public static final String FIELDNAME_BillOfExchangeLine_C_GroupDoc_ID="7010c9fc-c17f-2447-01ee-78e4a4340ae1";

@XendraTrl(Identifier="378906ef-4044-4cbc-38a2-ec2e81fb8e09")
public static String es_PE_FIELD_BillOfExchangeLine_C_GroupDoc_ID2_Name="c_groupdoc_id";

@XendraField(AD_Column_ID="C_GroupDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="378906ef-4044-4cbc-38a2-ec2e81fb8e09")
public static final String FIELDNAME_BillOfExchangeLine_C_GroupDoc_ID2="378906ef-4044-4cbc-38a2-ec2e81fb8e09";

@XendraTrl(Identifier="3c118899-29cb-3b98-adc5-a9ccc4599544")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="C_GroupDoc_ID";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3c118899-29cb-3b98-adc5-a9ccc4599544",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
/** Set Invoice.
@param C_Invoice_ID Invoice Identifier */
public void setC_Invoice_ID (int C_Invoice_ID)
{
if (C_Invoice_ID < 1) throw new IllegalArgumentException ("C_Invoice_ID is mandatory.");
set_Value (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
}
/** Get Invoice.
@return Invoice Identifier */
public int getC_Invoice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2de5dd9e-fc13-e6d7-72f9-f777f27249ce")
public static String es_PE_FIELD_BillOfExchangeLine_Invoice_Description="Identificador de la factura";

@XendraTrl(Identifier="2de5dd9e-fc13-e6d7-72f9-f777f27249ce")
public static String es_PE_FIELD_BillOfExchangeLine_Invoice_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="2de5dd9e-fc13-e6d7-72f9-f777f27249ce")
public static String es_PE_FIELD_BillOfExchangeLine_Invoice_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2de5dd9e-fc13-e6d7-72f9-f777f27249ce")
public static final String FIELDNAME_BillOfExchangeLine_Invoice="2de5dd9e-fc13-e6d7-72f9-f777f27249ce";

@XendraTrl(Identifier="83d771ef-723f-67a0-702f-49859c95f23f")
public static String es_PE_FIELD_BillOfExchangeLine_Invoice2_Description="Identificador de la factura";

@XendraTrl(Identifier="83d771ef-723f-67a0-702f-49859c95f23f")
public static String es_PE_FIELD_BillOfExchangeLine_Invoice2_Help="La ID de Factura identifica únicamente un documento de Factura.";

@XendraTrl(Identifier="83d771ef-723f-67a0-702f-49859c95f23f")
public static String es_PE_FIELD_BillOfExchangeLine_Invoice2_Name="Factura";

@XendraField(AD_Column_ID="C_Invoice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="83d771ef-723f-67a0-702f-49859c95f23f")
public static final String FIELDNAME_BillOfExchangeLine_Invoice2="83d771ef-723f-67a0-702f-49859c95f23f";

@XendraTrl(Identifier="4372bf90-1c38-0e4c-8de7-55d3c08cd65a")
public static String es_PE_COLUMN_C_Invoice_ID_Name="Factura";

@XendraColumn(AD_Element_ID="e526ea57-1bdf-9871-fd57-0df3c1f9dd42",ColumnName="C_Invoice_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4372bf90-1c38-0e4c-8de7-55d3c08cd65a",
Synchronized="2017-08-05 16:53:18.0")
/** Column name C_Invoice_ID */
public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";
/** Set Identifier.
@param Identifier Identifier */
public void setIdentifier (String Identifier)
{
if (Identifier != null && Identifier.length() > 36)
{
log.warning("Length > 36 - truncated");
Identifier = Identifier.substring(0,35);
}
set_Value (COLUMNNAME_Identifier, Identifier);
}
/** Get Identifier.
@return Identifier */
public String getIdentifier() 
{
String value = (String)get_Value(COLUMNNAME_Identifier);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="092664b2-decd-4445-bce7-aa03093e39e5")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="092664b2-decd-4445-bce7-aa03093e39e5",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Processed.
@param Processed The document has been processed */
public void setProcessed (boolean Processed)
{
set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
}
/** Get Processed.
@return The document has been processed */
public boolean isProcessed() 
{
Object oo = get_Value(COLUMNNAME_Processed);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="a149369b-66e5-2d98-6b51-edf175256b4f")
public static String es_PE_FIELD_BillOfExchangeLine_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="a149369b-66e5-2d98-6b51-edf175256b4f")
public static String es_PE_FIELD_BillOfExchangeLine_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="a149369b-66e5-2d98-6b51-edf175256b4f")
public static String es_PE_FIELD_BillOfExchangeLine_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a149369b-66e5-2d98-6b51-edf175256b4f")
public static final String FIELDNAME_BillOfExchangeLine_Processed="a149369b-66e5-2d98-6b51-edf175256b4f";

@XendraTrl(Identifier="03d1b706-295d-6564-471e-92f0a09fe977")
public static String es_PE_FIELD_BillOfExchangeLine_Processed2_Description="El documento ha sido procesado";

@XendraTrl(Identifier="03d1b706-295d-6564-471e-92f0a09fe977")
public static String es_PE_FIELD_BillOfExchangeLine_Processed2_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="03d1b706-295d-6564-471e-92f0a09fe977")
public static String es_PE_FIELD_BillOfExchangeLine_Processed2_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="03d1b706-295d-6564-471e-92f0a09fe977")
public static final String FIELDNAME_BillOfExchangeLine_Processed2="03d1b706-295d-6564-471e-92f0a09fe977";

@XendraTrl(Identifier="cc4bced4-a99d-c70e-c9ab-7a5af5832612")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cc4bced4-a99d-c70e-c9ab-7a5af5832612",
Synchronized="2017-08-05 16:53:18.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";

/** Ref_BOE_ID AD_Reference=15ad633b-67da-5ecc-9ec0-d9f415de8616 */
public static final int REF_BOE_ID_AD_Reference_ID=1000031;
/** Set Ref_BOE_ID.
@param Ref_BOE_ID Ref_BOE_ID */
public void setRef_BOE_ID (int Ref_BOE_ID)
{
if (Ref_BOE_ID <= 0) set_Value (COLUMNNAME_Ref_BOE_ID, null);
 else 
set_Value (COLUMNNAME_Ref_BOE_ID, Integer.valueOf(Ref_BOE_ID));
}
/** Get Ref_BOE_ID.
@return Ref_BOE_ID */
public int getRef_BOE_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Ref_BOE_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ff9d61f2-e7da-82b7-8061-f87c6106a986")
public static String es_PE_FIELD_BillOfExchangeLine_Ref_BOE_ID_Name="ref_boe_id";

@XendraField(AD_Column_ID="Ref_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="d63ed171-a515-c01f-62ba-30b6790f3886",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ff9d61f2-e7da-82b7-8061-f87c6106a986")
public static final String FIELDNAME_BillOfExchangeLine_Ref_BOE_ID="ff9d61f2-e7da-82b7-8061-f87c6106a986";

@XendraTrl(Identifier="ad31f5c4-f55a-5d22-8886-e228a2a34158")
public static String es_PE_FIELD_BillOfExchangeLine_Ref_BOE_ID2_Name="Referencia de Letra";

@XendraField(AD_Column_ID="Ref_BOE_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0a458553-c9ba-88d0-802e-6dc394c97d3c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ad31f5c4-f55a-5d22-8886-e228a2a34158")
public static final String FIELDNAME_BillOfExchangeLine_Ref_BOE_ID2="ad31f5c4-f55a-5d22-8886-e228a2a34158";

@XendraTrl(Identifier="52f3515b-8959-fc36-b2e5-6e158ac46565")
public static String es_PE_COLUMN_Ref_BOE_ID_Name="ref_boe_id";

@XendraColumn(AD_Element_ID="606339d4-3f3a-b290-a6b3-65710c5c5827",ColumnName="Ref_BOE_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="15ad633b-67da-5ecc-9ec0-d9f415de8616",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="52f3515b-8959-fc36-b2e5-6e158ac46565",Synchronized="2017-08-05 16:53:18.0")
/** Column name Ref_BOE_ID */
public static final String COLUMNNAME_Ref_BOE_ID = "Ref_BOE_ID";
}
