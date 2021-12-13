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
/** Generated Model for C_TaxPostal
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_TaxPostal extends PO
{
/** Standard Constructor
@param ctx context
@param C_TaxPostal_ID id
@param trxName transaction
*/
public X_C_TaxPostal (Properties ctx, int C_TaxPostal_ID, String trxName)
{
super (ctx, C_TaxPostal_ID, trxName);
/** if (C_TaxPostal_ID == 0)
{
setC_Tax_ID (0);
setC_TaxPostal_ID (0);
setPostal (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_TaxPostal (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=701 */
public static int Table_ID=MTable.getTable_ID("C_TaxPostal");

@XendraTrl(Identifier="261cb55a-eef8-9a80-aef4-b00e75265589")
public static String es_PE_TAB_TaxZIP_Description="Impuesto C.P.";

@XendraTrl(Identifier="261cb55a-eef8-9a80-aef4-b00e75265589")
public static String es_PE_TAB_TaxZIP_Help="Para impuesto local, usted puede tener que definir una lista (los rangos de) código postal.";

@XendraTrl(Identifier="261cb55a-eef8-9a80-aef4-b00e75265589")
public static String es_PE_TAB_TaxZIP_Name="Impuesto C.P.";
@XendraTab(Name="Tax ZIP",
Description="Tax Postal/ZIP",
Help="For local tax, you may have to define a list of (ranges of) postal codes or ZIPs",
AD_Window_ID="738fa9ed-8c68-6bf1-79fe-8963640b6a8b",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="261cb55a-eef8-9a80-aef4-b00e75265589",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TaxZIP="261cb55a-eef8-9a80-aef4-b00e75265589";

@XendraTrl(Identifier="69d36dcc-fd14-ff52-9bcc-ac3037ce1f55")
public static String es_PE_TABLE_C_TaxPostal_Name="C.P. Impuesto";

@XendraTable(Name="Tax ZIP",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Tax Postal/ZIP",Help="",
TableName="C_TaxPostal",AccessLevel="2",AD_Window_ID="738fa9ed-8c68-6bf1-79fe-8963640b6a8b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="69d36dcc-fd14-ff52-9bcc-ac3037ce1f55",Synchronized="2020-03-03 21:37:44.0")
/** TableName=C_TaxPostal */
public static final String Table_Name="C_TaxPostal";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_TaxPostal");

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
    Table_ID = MTable.getTable_ID("C_TaxPostal");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_TaxPostal[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tax.
@param C_Tax_ID Tax identifier */
public void setC_Tax_ID (int C_Tax_ID)
{
if (C_Tax_ID < 1) throw new IllegalArgumentException ("C_Tax_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Tax_ID, Integer.valueOf(C_Tax_ID));
}
/** Get Tax.
@return Tax identifier */
public int getC_Tax_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Tax_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e8dfbf64-76ce-67d8-a612-8c747c89dfe4")
public static String es_PE_FIELD_TaxZIP_Tax_Name="Impuesto";

@XendraTrl(Identifier="e8dfbf64-76ce-67d8-a612-8c747c89dfe4")
public static String es_PE_FIELD_TaxZIP_Tax_Description="Identificador del Impuesto";

@XendraTrl(Identifier="e8dfbf64-76ce-67d8-a612-8c747c89dfe4")
public static String es_PE_FIELD_TaxZIP_Tax_Help="El Impuesto indica el tipo de impuesto para esta línea del documento";

@XendraField(AD_Column_ID="C_Tax_ID",IsCentrallyMaintained=true,
AD_Tab_ID="261cb55a-eef8-9a80-aef4-b00e75265589",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8dfbf64-76ce-67d8-a612-8c747c89dfe4")
public static final String FIELDNAME_TaxZIP_Tax="e8dfbf64-76ce-67d8-a612-8c747c89dfe4";

@XendraTrl(Identifier="5ef8ca4a-cdd3-0927-0ffa-d4bec9a58201")
public static String es_PE_COLUMN_C_Tax_ID_Name="Impuesto";

@XendraColumn(AD_Element_ID="38ff24fc-b68c-51a9-60f8-ef2a1f060de2",ColumnName="C_Tax_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5ef8ca4a-cdd3-0927-0ffa-d4bec9a58201",
Synchronized="2019-08-30 22:22:21.0")
/** Column name C_Tax_ID */
public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";
/** Set Tax ZIP.
@param C_TaxPostal_ID Tax Postal/ZIP */
public void setC_TaxPostal_ID (int C_TaxPostal_ID)
{
if (C_TaxPostal_ID < 1) throw new IllegalArgumentException ("C_TaxPostal_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_TaxPostal_ID, Integer.valueOf(C_TaxPostal_ID));
}
/** Get Tax ZIP.
@return Tax Postal/ZIP */
public int getC_TaxPostal_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxPostal_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="63990624-e2b2-abbf-f99a-631565032890")
public static String es_PE_FIELD_TaxZIP_TaxZIP_Name="C.P. Impuesto";

@XendraTrl(Identifier="63990624-e2b2-abbf-f99a-631565032890")
public static String es_PE_FIELD_TaxZIP_TaxZIP_Description="C.P. Impuesto";

@XendraTrl(Identifier="63990624-e2b2-abbf-f99a-631565032890")
public static String es_PE_FIELD_TaxZIP_TaxZIP_Help="Para el impuesto local, usted puede definir una lista (los rangos de) códigos postales";

@XendraField(AD_Column_ID="C_TaxPostal_ID",IsCentrallyMaintained=true,
AD_Tab_ID="261cb55a-eef8-9a80-aef4-b00e75265589",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="63990624-e2b2-abbf-f99a-631565032890")
public static final String FIELDNAME_TaxZIP_TaxZIP="63990624-e2b2-abbf-f99a-631565032890";
/** Column name C_TaxPostal_ID */
public static final String COLUMNNAME_C_TaxPostal_ID = "C_TaxPostal_ID";
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
@XendraTrl(Identifier="eec7df5c-1bf7-4b06-a787-1092cddf0bdb")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eec7df5c-1bf7-4b06-a787-1092cddf0bdb",
Synchronized="2019-08-30 22:22:21.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set ZIP.
@param Postal Postal code */
public void setPostal (String Postal)
{
if (Postal == null) throw new IllegalArgumentException ("Postal is mandatory.");
if (Postal.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal = Postal.substring(0,9);
}
set_Value (COLUMNNAME_Postal, Postal);
}
/** Get ZIP.
@return Postal code */
public String getPostal() 
{
String value = (String)get_Value(COLUMNNAME_Postal);
if (value == null)
  return "";
return value;
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), getPostal());
}

@XendraTrl(Identifier="3b51f028-3ce8-80bb-ef01-49e885b1804b")
public static String es_PE_FIELD_TaxZIP_ZIP_Name="Código Postal";

@XendraTrl(Identifier="3b51f028-3ce8-80bb-ef01-49e885b1804b")
public static String es_PE_FIELD_TaxZIP_ZIP_Description="Código Postal";

@XendraTrl(Identifier="3b51f028-3ce8-80bb-ef01-49e885b1804b")
public static String es_PE_FIELD_TaxZIP_ZIP_Help="El campo Código Postal identifica el código postal para esta entidad";

@XendraField(AD_Column_ID="Postal",IsCentrallyMaintained=true,
AD_Tab_ID="261cb55a-eef8-9a80-aef4-b00e75265589",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b51f028-3ce8-80bb-ef01-49e885b1804b")
public static final String FIELDNAME_TaxZIP_ZIP="3b51f028-3ce8-80bb-ef01-49e885b1804b";

@XendraTrl(Identifier="6ac913b7-d11f-012b-0325-392a88282056")
public static String es_PE_COLUMN_Postal_Name="Código Postal";

@XendraColumn(AD_Element_ID="b91ba048-ef4f-31e3-3865-fa3cff649df8",ColumnName="Postal",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6ac913b7-d11f-012b-0325-392a88282056",
Synchronized="2019-08-30 22:22:21.0")
/** Column name Postal */
public static final String COLUMNNAME_Postal = "Postal";
/** Set ZIP To.
@param Postal_To Postal code to */
public void setPostal_To (String Postal_To)
{
if (Postal_To != null && Postal_To.length() > 10)
{
log.warning("Length > 10 - truncated");
Postal_To = Postal_To.substring(0,9);
}
set_Value (COLUMNNAME_Postal_To, Postal_To);
}
/** Get ZIP To.
@return Postal code to */
public String getPostal_To() 
{
String value = (String)get_Value(COLUMNNAME_Postal_To);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ade6b8eb-2c87-f47a-3610-ffda34f79f14")
public static String es_PE_FIELD_TaxZIP_ZIPTo_Name="C.P. Para";

@XendraTrl(Identifier="ade6b8eb-2c87-f47a-3610-ffda34f79f14")
public static String es_PE_FIELD_TaxZIP_ZIPTo_Description="Codigo postal para";

@XendraTrl(Identifier="ade6b8eb-2c87-f47a-3610-ffda34f79f14")
public static String es_PE_FIELD_TaxZIP_ZIPTo_Help="Rangos para codigos";

@XendraField(AD_Column_ID="Postal_To",IsCentrallyMaintained=true,
AD_Tab_ID="261cb55a-eef8-9a80-aef4-b00e75265589",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ade6b8eb-2c87-f47a-3610-ffda34f79f14")
public static final String FIELDNAME_TaxZIP_ZIPTo="ade6b8eb-2c87-f47a-3610-ffda34f79f14";

@XendraTrl(Identifier="44a87d79-6077-c443-1650-f37d08572549")
public static String es_PE_COLUMN_Postal_To_Name="C.P. Para";

@XendraColumn(AD_Element_ID="489fa871-27ae-dd65-54c9-e2d05e022f2b",ColumnName="Postal_To",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="44a87d79-6077-c443-1650-f37d08572549",
Synchronized="2019-08-30 22:22:21.0")
/** Column name Postal_To */
public static final String COLUMNNAME_Postal_To = "Postal_To";
}
