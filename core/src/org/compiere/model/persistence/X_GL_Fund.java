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
/** Generated Model for GL_Fund
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_Fund extends PO
{
/** Standard Constructor
@param ctx context
@param GL_Fund_ID id
@param trxName transaction
*/
public X_GL_Fund (Properties ctx, int GL_Fund_ID, String trxName)
{
super (ctx, GL_Fund_ID, trxName);
/** if (GL_Fund_ID == 0)
{
setAmt (Env.ZERO);	
// 0
setC_AcctSchema_ID (0);
setGL_Fund_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_Fund (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=823 */
public static int Table_ID=MTable.getTable_ID("GL_Fund");

@XendraTrl(Identifier="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675")
public static String es_PE_TAB_Fund_Description="Maintain Fund Control";

@XendraTrl(Identifier="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675")
public static String es_PE_TAB_Fund_Name="Fund";

@XendraTrl(Identifier="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675")
public static String es_PE_TAB_Fund_Help="General Ledger Funds Control allows you to restrict the use of funds.  This is independent from budget control.";

@XendraTab(Name="Fund",Description="Maintain Fund Control",
Help="General Ledger Funds Control allows you to restrict the use of funds.  This is independent from budget control.",
AD_Window_ID="a41bf769-4482-1b0b-a5df-51f1a6e8835a",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Fund="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675";

@XendraTrl(Identifier="314d4fbe-d57c-e9a3-3d38-56dfc072b0a1")
public static String es_PE_TABLE_GL_Fund_Name="GL Fund";

@XendraTable(Name="GL Fund",Description="General Ledger Funds Control",Help="",TableName="GL_Fund",
AccessLevel="2",AD_Window_ID="a41bf769-4482-1b0b-a5df-51f1a6e8835a",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="314d4fbe-d57c-e9a3-3d38-56dfc072b0a1",Synchronized="2017-08-16 11:42:44.0")
/** TableName=GL_Fund */
public static final String Table_Name="GL_Fund";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_Fund");

protected BigDecimal accessLevel = BigDecimal.valueOf(2);
/** AccessLevel
@return 2 - Client 
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
    Table_ID = MTable.getTable_ID("GL_Fund");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_Fund[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Amount.
@param Amt Amount */
public void setAmt (BigDecimal Amt)
{
if (Amt == null) throw new IllegalArgumentException ("Amt is mandatory.");
set_Value (COLUMNNAME_Amt, Amt);
}
/** Get Amount.
@return Amount */
public BigDecimal getAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="17b01ab2-4555-ebbf-8f5a-3abf4c2e8de4")
public static String es_PE_FIELD_Fund_Amount_Description="Total límite para el envío de facturas";

@XendraTrl(Identifier="17b01ab2-4555-ebbf-8f5a-3abf4c2e8de4")
public static String es_PE_FIELD_Fund_Amount_Help="El campo total indica el límite en el que las facturas no serán generadas. Si el total total de la factura esta por debajo de este total; la factura  no será enviada en esta corrida programada. Este campo es solamente desplegado si el cuadro de verificación de total límite es seleccionado";

@XendraTrl(Identifier="17b01ab2-4555-ebbf-8f5a-3abf4c2e8de4")
public static String es_PE_FIELD_Fund_Amount_Name="Total";
@XendraField(AD_Column_ID="Amt",
IsCentrallyMaintained=true,AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=22,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="17b01ab2-4555-ebbf-8f5a-3abf4c2e8de4")
public static final String FIELDNAME_Fund_Amount="17b01ab2-4555-ebbf-8f5a-3abf4c2e8de4";

@XendraTrl(Identifier="c44812ad-d03b-87d0-ccb5-eca604b58e91")
public static String es_PE_COLUMN_Amt_Name="Total";

@XendraColumn(AD_Element_ID="42827f15-aceb-2f14-cc38-b4a7c6022136",ColumnName="Amt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c44812ad-d03b-87d0-ccb5-eca604b58e91",
Synchronized="2017-08-05 16:54:42.0")
/** Column name Amt */
public static final String COLUMNNAME_Amt = "Amt";
/** Set Accounting Schema.
@param C_AcctSchema_ID Rules for accounting */
public void setC_AcctSchema_ID (int C_AcctSchema_ID)
{
if (C_AcctSchema_ID < 1) throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
}
/** Get Accounting Schema.
@return Rules for accounting */
public int getC_AcctSchema_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="98da0f3a-530c-852a-7317-08c7ff0b9859")
public static String es_PE_FIELD_Fund_AccountingSchema_Description="Reglas para contabilizar";

@XendraTrl(Identifier="98da0f3a-530c-852a-7317-08c7ff0b9859")
public static String es_PE_FIELD_Fund_AccountingSchema_Help="Un esquema contable define las reglas contables usadas tales como método de costeo; moneda y calendario";

@XendraTrl(Identifier="98da0f3a-530c-852a-7317-08c7ff0b9859")
public static String es_PE_FIELD_Fund_AccountingSchema_Name="Esquema Contable";

@XendraField(AD_Column_ID="C_AcctSchema_ID",IsCentrallyMaintained=true,
AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="98da0f3a-530c-852a-7317-08c7ff0b9859")
public static final String FIELDNAME_Fund_AccountingSchema="98da0f3a-530c-852a-7317-08c7ff0b9859";

@XendraTrl(Identifier="2e713f0e-0819-10db-1536-deda90e3377f")
public static String es_PE_COLUMN_C_AcctSchema_ID_Name="Esquema Contable";

@XendraColumn(AD_Element_ID="561c9a32-9b35-9c1a-fabc-8abf7f2bb4ae",ColumnName="C_AcctSchema_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2e713f0e-0819-10db-1536-deda90e3377f",
Synchronized="2017-08-05 16:54:42.0")
/** Column name C_AcctSchema_ID */
public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";
/** Set Date From.
@param DateFrom Starting date for a range */
public void setDateFrom (Timestamp DateFrom)
{
set_Value (COLUMNNAME_DateFrom, DateFrom);
}
/** Get Date From.
@return Starting date for a range */
public Timestamp getDateFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_DateFrom);
}

@XendraTrl(Identifier="398968a0-0ce0-a8c2-3d47-f3c6c6a73692")
public static String es_PE_FIELD_Fund_DateFrom_Description="Fecha de inicio para un rango";

@XendraTrl(Identifier="398968a0-0ce0-a8c2-3d47-f3c6c6a73692")
public static String es_PE_FIELD_Fund_DateFrom_Help="La Fecha desde indica la fecha inicial de un rango";

@XendraTrl(Identifier="398968a0-0ce0-a8c2-3d47-f3c6c6a73692")
public static String es_PE_FIELD_Fund_DateFrom_Name="Desde Fecha";

@XendraField(AD_Column_ID="DateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="398968a0-0ce0-a8c2-3d47-f3c6c6a73692")
public static final String FIELDNAME_Fund_DateFrom="398968a0-0ce0-a8c2-3d47-f3c6c6a73692";

@XendraTrl(Identifier="82678587-981d-9577-76cb-37761712472b")
public static String es_PE_COLUMN_DateFrom_Name="Desde Fecha";

@XendraColumn(AD_Element_ID="5bfdcbe1-cf4f-d7f7-c643-7a07f2907ae9",ColumnName="DateFrom",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="82678587-981d-9577-76cb-37761712472b",
Synchronized="2017-08-05 16:54:42.0")
/** Column name DateFrom */
public static final String COLUMNNAME_DateFrom = "DateFrom";
/** Set Date To.
@param DateTo End date of a date range */
public void setDateTo (Timestamp DateTo)
{
set_Value (COLUMNNAME_DateTo, DateTo);
}
/** Get Date To.
@return End date of a date range */
public Timestamp getDateTo() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTo);
}

@XendraTrl(Identifier="1b7d0a89-c4bc-11e1-dc08-c0aa4aba9d97")
public static String es_PE_FIELD_Fund_DateTo_Description="Fecha final de un rango (inclusive)";

@XendraTrl(Identifier="1b7d0a89-c4bc-11e1-dc08-c0aa4aba9d97")
public static String es_PE_FIELD_Fund_DateTo_Help="La Fecha A indica la fecha final de un rango (inclusive)";

@XendraTrl(Identifier="1b7d0a89-c4bc-11e1-dc08-c0aa4aba9d97")
public static String es_PE_FIELD_Fund_DateTo_Name="A Fecha";
@XendraField(AD_Column_ID="DateTo",
IsCentrallyMaintained=true,AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="1b7d0a89-c4bc-11e1-dc08-c0aa4aba9d97")
public static final String FIELDNAME_Fund_DateTo="1b7d0a89-c4bc-11e1-dc08-c0aa4aba9d97";

@XendraTrl(Identifier="5d741fa9-a3be-d5a1-679f-5309471b44ae")
public static String es_PE_COLUMN_DateTo_Name="A Fecha";

@XendraColumn(AD_Element_ID="c98c05a0-7b58-ed8f-3e5b-fe1e1358ac38",ColumnName="DateTo",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d741fa9-a3be-d5a1-679f-5309471b44ae",
Synchronized="2017-08-05 16:54:42.0")
/** Column name DateTo */
public static final String COLUMNNAME_DateTo = "DateTo";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value (COLUMNNAME_Description, Description);
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

@XendraTrl(Identifier="ee79631b-f3d9-2cf1-74a6-53f5aa926111")
public static String es_PE_FIELD_Fund_Description_Description="Observación";

@XendraTrl(Identifier="ee79631b-f3d9-2cf1-74a6-53f5aa926111")
public static String es_PE_FIELD_Fund_Description_Help="Observación";

@XendraTrl(Identifier="ee79631b-f3d9-2cf1-74a6-53f5aa926111")
public static String es_PE_FIELD_Fund_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ee79631b-f3d9-2cf1-74a6-53f5aa926111")
public static final String FIELDNAME_Fund_Description="ee79631b-f3d9-2cf1-74a6-53f5aa926111";

@XendraTrl(Identifier="07da4517-24f8-ce11-5161-392da35537c1")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07da4517-24f8-ce11-5161-392da35537c1",
Synchronized="2017-08-05 16:54:42.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set GL Fund.
@param GL_Fund_ID General Ledger Funds Control */
public void setGL_Fund_ID (int GL_Fund_ID)
{
if (GL_Fund_ID < 1) throw new IllegalArgumentException ("GL_Fund_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_Fund_ID, Integer.valueOf(GL_Fund_ID));
}
/** Get GL Fund.
@return General Ledger Funds Control */
public int getGL_Fund_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_Fund_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8fb4489c-25d0-1533-5f82-0a8f02bf703b")
public static String es_PE_FIELD_Fund_GLFund_Description="General Ledger Funds Control";

@XendraTrl(Identifier="8fb4489c-25d0-1533-5f82-0a8f02bf703b")
public static String es_PE_FIELD_Fund_GLFund_Help="General Ledger Funds Control allows you to restrict the use of funds.  This is independent from budget control.";

@XendraTrl(Identifier="8fb4489c-25d0-1533-5f82-0a8f02bf703b")
public static String es_PE_FIELD_Fund_GLFund_Name="GL Fund";
@XendraField(AD_Column_ID="GL_Fund_ID",
IsCentrallyMaintained=true,AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="8fb4489c-25d0-1533-5f82-0a8f02bf703b")
public static final String FIELDNAME_Fund_GLFund="8fb4489c-25d0-1533-5f82-0a8f02bf703b";
/** Column name GL_Fund_ID */
public static final String COLUMNNAME_GL_Fund_ID = "GL_Fund_ID";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
set_Value (COLUMNNAME_Help, Help);
}
/** Get Comment/Help.
@return Comment or Hint */
public String getHelp() 
{
String value = (String)get_Value(COLUMNNAME_Help);
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

@XendraTrl(Identifier="25a02fa5-789b-c201-9450-bacae0d909b6")
public static String es_PE_FIELD_Fund_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="25a02fa5-789b-c201-9450-bacae0d909b6")
public static String es_PE_FIELD_Fund_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="25a02fa5-789b-c201-9450-bacae0d909b6")
public static String es_PE_FIELD_Fund_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=2000,IsReadOnly=false,SeqNo=50,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="25a02fa5-789b-c201-9450-bacae0d909b6")
public static final String FIELDNAME_Fund_CommentHelp="25a02fa5-789b-c201-9450-bacae0d909b6";

@XendraTrl(Identifier="1012ce90-7920-3232-c8d2-1bf85708a807")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1012ce90-7920-3232-c8d2-1bf85708a807",
Synchronized="2017-08-05 16:54:42.0")
/** Column name Help */
public static final String COLUMNNAME_Help = "Help";
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
@XendraTrl(Identifier="a17965de-17a7-4b5b-8312-cc1c907224ff")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a17965de-17a7-4b5b-8312-cc1c907224ff",
Synchronized="2017-08-05 16:54:42.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 120)
{
log.warning("Length > 120 - truncated");
Name = Name.substring(0,119);
}
set_Value (COLUMNNAME_Name, Name);
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

@XendraTrl(Identifier="6a181802-3c6a-bf2f-193a-66172cc76c7b")
public static String es_PE_FIELD_Fund_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="6a181802-3c6a-bf2f-193a-66172cc76c7b")
public static String es_PE_FIELD_Fund_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="6a181802-3c6a-bf2f-193a-66172cc76c7b")
public static String es_PE_FIELD_Fund_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="34f7ef78-7fa3-e7ea-f23b-2fc7005a7675",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6a181802-3c6a-bf2f-193a-66172cc76c7b")
public static final String FIELDNAME_Fund_Name="6a181802-3c6a-bf2f-193a-66172cc76c7b";

@XendraTrl(Identifier="4da65e9b-e946-ad2f-ebf0-d511b26c4fe7")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4da65e9b-e946-ad2f-ebf0-d511b26c4fe7",
Synchronized="2017-08-05 16:54:42.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
