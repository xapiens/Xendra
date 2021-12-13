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
/** Generated Model for GL_FundRestriction
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_GL_FundRestriction extends PO
{
/** Standard Constructor
@param ctx context
@param GL_FundRestriction_ID id
@param trxName transaction
*/
public X_GL_FundRestriction (Properties ctx, int GL_FundRestriction_ID, String trxName)
{
super (ctx, GL_FundRestriction_ID, trxName);
/** if (GL_FundRestriction_ID == 0)
{
setC_ElementValue_ID (0);
setGL_Fund_ID (0);
setGL_FundRestriction_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_GL_FundRestriction (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=824 */
public static int Table_ID=MTable.getTable_ID("GL_FundRestriction");

@XendraTrl(Identifier="ac094e1a-4c7e-0483-6153-479a4f7f25d5")
public static String es_PE_TAB_Restriction_Description="Restriction of Funds";

@XendraTrl(Identifier="ac094e1a-4c7e-0483-6153-479a4f7f25d5")
public static String es_PE_TAB_Restriction_Help="If defined, you can use the fund only for the accounts selected. You can select summary values.";

@XendraTrl(Identifier="ac094e1a-4c7e-0483-6153-479a4f7f25d5")
public static String es_PE_TAB_Restriction_Name="Restriction";
@XendraTab(Name="Restriction",
Description="Restriction of Funds",
Help="If defined, you can use the fund only for the accounts selected. You can select summary values.",
AD_Window_ID="a41bf769-4482-1b0b-a5df-51f1a6e8835a",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="ac094e1a-4c7e-0483-6153-479a4f7f25d5",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Restriction="ac094e1a-4c7e-0483-6153-479a4f7f25d5";

@XendraTrl(Identifier="693b571e-a635-f58b-bd60-1ca491445e26")
public static String es_PE_TABLE_GL_FundRestriction_Name="Fund Restriction";

@XendraTable(Name="Fund Restriction",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Restriction of Funds",Help="",
TableName="GL_FundRestriction",AccessLevel="2",AD_Window_ID="a41bf769-4482-1b0b-a5df-51f1a6e8835a",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.accounting",
Identifier="693b571e-a635-f58b-bd60-1ca491445e26",Synchronized="2020-03-03 21:37:57.0")
/** TableName=GL_FundRestriction */
public static final String Table_Name="GL_FundRestriction";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"GL_FundRestriction");

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
    Table_ID = MTable.getTable_ID("GL_FundRestriction");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_GL_FundRestriction[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Account Element.
@param C_ElementValue_ID Account Element */
public void setC_ElementValue_ID (int C_ElementValue_ID)
{
if (C_ElementValue_ID < 1) throw new IllegalArgumentException ("C_ElementValue_ID is mandatory.");
set_Value (COLUMNNAME_C_ElementValue_ID, Integer.valueOf(C_ElementValue_ID));
}
/** Get Account Element.
@return Account Element */
public int getC_ElementValue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ElementValue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fbba9a6e-cde1-0a4e-5f40-8945f440e9e7")
public static String es_PE_FIELD_Restriction_AccountElement_Name="Valor del Elemento";

@XendraTrl(Identifier="fbba9a6e-cde1-0a4e-5f40-8945f440e9e7")
public static String es_PE_FIELD_Restriction_AccountElement_Description="Valor del Elemento";

@XendraTrl(Identifier="fbba9a6e-cde1-0a4e-5f40-8945f440e9e7")
public static String es_PE_FIELD_Restriction_AccountElement_Help="El valor de elemento es un identificador único de una instancia de un elemento.";

@XendraField(AD_Column_ID="C_ElementValue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ac094e1a-4c7e-0483-6153-479a4f7f25d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fbba9a6e-cde1-0a4e-5f40-8945f440e9e7")
public static final String FIELDNAME_Restriction_AccountElement="fbba9a6e-cde1-0a4e-5f40-8945f440e9e7";

@XendraTrl(Identifier="7bb3c4c5-b356-b8e4-4b6d-91c8a916b875")
public static String es_PE_COLUMN_C_ElementValue_ID_Name="Valor del Elemento";

@XendraColumn(AD_Element_ID="5323d042-54f8-4ac3-d8b8-7146736d3d38",ColumnName="C_ElementValue_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="2f455adf-339e-7ef0-6b19-0a540bcca416",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7bb3c4c5-b356-b8e4-4b6d-91c8a916b875",Synchronized="2019-08-30 22:22:34.0")
/** Column name C_ElementValue_ID */
public static final String COLUMNNAME_C_ElementValue_ID = "C_ElementValue_ID";
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

@XendraTrl(Identifier="6a9a396c-4b53-fcd2-2789-c5911048365d")
public static String es_PE_FIELD_Restriction_Description_Name="Observación";

@XendraTrl(Identifier="6a9a396c-4b53-fcd2-2789-c5911048365d")
public static String es_PE_FIELD_Restriction_Description_Description="Observación";

@XendraTrl(Identifier="6a9a396c-4b53-fcd2-2789-c5911048365d")
public static String es_PE_FIELD_Restriction_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="ac094e1a-4c7e-0483-6153-479a4f7f25d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6a9a396c-4b53-fcd2-2789-c5911048365d")
public static final String FIELDNAME_Restriction_Description="6a9a396c-4b53-fcd2-2789-c5911048365d";

@XendraTrl(Identifier="397cd97f-9344-99da-3d1d-e73f0c9d627b")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="397cd97f-9344-99da-3d1d-e73f0c9d627b",
Synchronized="2019-08-30 22:22:34.0")
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

@XendraTrl(Identifier="f79e4b8e-6ad9-2bc4-b31b-a7103936d198")
public static String es_PE_FIELD_Restriction_GLFund_Name="GL Fund";

@XendraTrl(Identifier="f79e4b8e-6ad9-2bc4-b31b-a7103936d198")
public static String es_PE_FIELD_Restriction_GLFund_Description="General Ledger Funds Control";

@XendraTrl(Identifier="f79e4b8e-6ad9-2bc4-b31b-a7103936d198")
public static String es_PE_FIELD_Restriction_GLFund_Help="General Ledger Funds Control allows you to restrict the use of funds.  This is independent from budget control.";

@XendraField(AD_Column_ID="GL_Fund_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ac094e1a-4c7e-0483-6153-479a4f7f25d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f79e4b8e-6ad9-2bc4-b31b-a7103936d198")
public static final String FIELDNAME_Restriction_GLFund="f79e4b8e-6ad9-2bc4-b31b-a7103936d198";

@XendraTrl(Identifier="e7b1a758-bf72-ebb0-4d64-6450bfc84471")
public static String es_PE_COLUMN_GL_Fund_ID_Name="GL Fund";

@XendraColumn(AD_Element_ID="72c2a71c-3e24-469b-9517-87e9d06d7985",ColumnName="GL_Fund_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e7b1a758-bf72-ebb0-4d64-6450bfc84471",
Synchronized="2019-08-30 22:22:34.0")
/** Column name GL_Fund_ID */
public static final String COLUMNNAME_GL_Fund_ID = "GL_Fund_ID";
/** Set Fund Restriction.
@param GL_FundRestriction_ID Restriction of Funds */
public void setGL_FundRestriction_ID (int GL_FundRestriction_ID)
{
if (GL_FundRestriction_ID < 1) throw new IllegalArgumentException ("GL_FundRestriction_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_GL_FundRestriction_ID, Integer.valueOf(GL_FundRestriction_ID));
}
/** Get Fund Restriction.
@return Restriction of Funds */
public int getGL_FundRestriction_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_GL_FundRestriction_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5a1a909e-78be-08fb-27ff-4d5ee8063a3f")
public static String es_PE_FIELD_Restriction_FundRestriction_Name="Fund Restriction";

@XendraTrl(Identifier="5a1a909e-78be-08fb-27ff-4d5ee8063a3f")
public static String es_PE_FIELD_Restriction_FundRestriction_Description="Restriction of Funds";

@XendraTrl(Identifier="5a1a909e-78be-08fb-27ff-4d5ee8063a3f")
public static String es_PE_FIELD_Restriction_FundRestriction_Help="If defined, you can use the fund only for the accounts selected.";

@XendraField(AD_Column_ID="GL_FundRestriction_ID",IsCentrallyMaintained=true,
AD_Tab_ID="ac094e1a-4c7e-0483-6153-479a4f7f25d5",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5a1a909e-78be-08fb-27ff-4d5ee8063a3f")
public static final String FIELDNAME_Restriction_FundRestriction="5a1a909e-78be-08fb-27ff-4d5ee8063a3f";
/** Column name GL_FundRestriction_ID */
public static final String COLUMNNAME_GL_FundRestriction_ID = "GL_FundRestriction_ID";
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
@XendraTrl(Identifier="ece2729f-5fff-44fb-a303-5f294b2426d7")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ece2729f-5fff-44fb-a303-5f294b2426d7",
Synchronized="2019-08-30 22:22:34.0")
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

@XendraTrl(Identifier="e1518b59-168d-cd36-9147-b9a94e6fd8da")
public static String es_PE_FIELD_Restriction_Name_Name="Nombre";

@XendraTrl(Identifier="e1518b59-168d-cd36-9147-b9a94e6fd8da")
public static String es_PE_FIELD_Restriction_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="e1518b59-168d-cd36-9147-b9a94e6fd8da")
public static String es_PE_FIELD_Restriction_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="ac094e1a-4c7e-0483-6153-479a4f7f25d5",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e1518b59-168d-cd36-9147-b9a94e6fd8da")
public static final String FIELDNAME_Restriction_Name="e1518b59-168d-cd36-9147-b9a94e6fd8da";

@XendraTrl(Identifier="56255760-86cd-95a2-f033-256e55d9e928")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="56255760-86cd-95a2-f033-256e55d9e928",
Synchronized="2019-08-30 22:22:34.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
