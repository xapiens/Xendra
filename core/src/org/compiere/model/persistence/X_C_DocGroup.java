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
/** Generated Model for C_DocGroup
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_DocGroup extends PO
{
/** Standard Constructor
@param ctx context
@param C_DocGroup_ID id
@param trxName transaction
*/
public X_C_DocGroup (Properties ctx, int C_DocGroup_ID, String trxName)
{
super (ctx, C_DocGroup_ID, trxName);
/** if (C_DocGroup_ID == 0)
{
setC_DocGroup_ID (0);
setIsSOTrx (true);	
// 'Y'
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_DocGroup (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000000 */
public static int Table_ID=MTable.getTable_ID("C_DocGroup");

@XendraTrl(Identifier="71fde5e6-78fc-1ab0-600f-8314aa6ffc95")
public static String es_PE_TAB_DocumentGroup_Description="Agrupa varios tipos de documentos para algunos reportes contables.";

@XendraTrl(Identifier="71fde5e6-78fc-1ab0-600f-8314aa6ffc95")
public static String es_PE_TAB_DocumentGroup_Name="Grupo de Documentos";

@XendraTab(Name="Document Group",
Description="Groups varioud Document Types for some Accounting Reports",Help="",
AD_Window_ID="b9ac075c-28fd-ccbe-c632-33ba372be5bf",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="71fde5e6-78fc-1ab0-600f-8314aa6ffc95",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DocumentGroup="71fde5e6-78fc-1ab0-600f-8314aa6ffc95";

@XendraTrl(Identifier="23d5aecb-be20-ecc0-b2df-b5514673ba4d")
public static String es_PE_TABLE_C_DocGroup_Name="Grupo de Documentos";

@XendraTable(Name="Document Group",
Description="Document Groups are used in certain accounting reports for including only certain document types on it.",
Help="",TableName="C_DocGroup",AccessLevel="3",AD_Window_ID="b9ac075c-28fd-ccbe-c632-33ba372be5bf",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="23d5aecb-be20-ecc0-b2df-b5514673ba4d",Synchronized="2017-08-16 11:41:42.0")
/** TableName=C_DocGroup */
public static final String Table_Name="C_DocGroup";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_DocGroup");

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
    Table_ID = MTable.getTable_ID("C_DocGroup");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_DocGroup[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Document Group.
@param C_DocGroup_ID Identifies a document group exclusively. */
public void setC_DocGroup_ID (int C_DocGroup_ID)
{
if (C_DocGroup_ID < 1) throw new IllegalArgumentException ("C_DocGroup_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_DocGroup_ID, Integer.valueOf(C_DocGroup_ID));
}
/** Get Document Group.
@return Identifies a document group exclusively. */
public int getC_DocGroup_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_DocGroup_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="12deda92-d2a1-6b5c-5111-bab0e189b765")
public static String es_PE_FIELD_DocumentGroup_DocumentGroup_Description="Identifica a un Grupo de Documentos exclusivamente.";

@XendraTrl(Identifier="12deda92-d2a1-6b5c-5111-bab0e189b765")
public static String es_PE_FIELD_DocumentGroup_DocumentGroup_Name="Grupo de Documentos";

@XendraField(AD_Column_ID="C_DocGroup_ID",IsCentrallyMaintained=true,
AD_Tab_ID="71fde5e6-78fc-1ab0-600f-8314aa6ffc95",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=0,IsReadOnly=true,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="12deda92-d2a1-6b5c-5111-bab0e189b765")
public static final String FIELDNAME_DocumentGroup_DocumentGroup="12deda92-d2a1-6b5c-5111-bab0e189b765";
/** Column name C_DocGroup_ID */
public static final String COLUMNNAME_C_DocGroup_ID = "C_DocGroup_ID";
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

@XendraTrl(Identifier="cfcce854-2f36-0eac-ed58-e88e27729dff")
public static String es_PE_FIELD_DocumentGroup_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="cfcce854-2f36-0eac-ed58-e88e27729dff")
public static String es_PE_FIELD_DocumentGroup_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="cfcce854-2f36-0eac-ed58-e88e27729dff")
public static String es_PE_FIELD_DocumentGroup_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="71fde5e6-78fc-1ab0-600f-8314aa6ffc95",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cfcce854-2f36-0eac-ed58-e88e27729dff")
public static final String FIELDNAME_DocumentGroup_Description="cfcce854-2f36-0eac-ed58-e88e27729dff";

@XendraTrl(Identifier="7a84d333-a427-1f4c-a90a-a08d6bb467bf")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a84d333-a427-1f4c-a90a-a08d6bb467bf",
Synchronized="2017-08-05 16:53:34.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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
@XendraTrl(Identifier="d9a68748-9fac-48fb-94df-a31d041e7779")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d9a68748-9fac-48fb-94df-a31d041e7779",
Synchronized="2017-08-05 16:53:34.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Sales Transaction.
@param IsSOTrx This is a Sales Transaction */
public void setIsSOTrx (boolean IsSOTrx)
{
set_Value (COLUMNNAME_IsSOTrx, Boolean.valueOf(IsSOTrx));
}
/** Get Sales Transaction.
@return This is a Sales Transaction */
public boolean isSOTrx() 
{
Object oo = get_Value(COLUMNNAME_IsSOTrx);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b15797be-429c-1bc9-cbeb-8399efb659a3")
public static String es_PE_FIELD_DocumentGroup_SalesTransaction_Description="Esta es una transacción de ventas";

@XendraTrl(Identifier="b15797be-429c-1bc9-cbeb-8399efb659a3")
public static String es_PE_FIELD_DocumentGroup_SalesTransaction_Help="El cuadro de verificación Transacción de Ventas indica si este ítem es una transacción de ventas";

@XendraTrl(Identifier="b15797be-429c-1bc9-cbeb-8399efb659a3")
public static String es_PE_FIELD_DocumentGroup_SalesTransaction_Name="Transacción de Ventas";

@XendraField(AD_Column_ID="IsSOTrx",IsCentrallyMaintained=true,
AD_Tab_ID="71fde5e6-78fc-1ab0-600f-8314aa6ffc95",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b15797be-429c-1bc9-cbeb-8399efb659a3")
public static final String FIELDNAME_DocumentGroup_SalesTransaction="b15797be-429c-1bc9-cbeb-8399efb659a3";

@XendraTrl(Identifier="58ccc1f6-cd55-0d00-6ff0-66b62c6e85c2")
public static String es_PE_COLUMN_IsSOTrx_Name="Transacción de Ventas";

@XendraColumn(AD_Element_ID="4084b69f-a51d-5676-4d8c-395a13e6b2df",ColumnName="IsSOTrx",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="'Y'",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58ccc1f6-cd55-0d00-6ff0-66b62c6e85c2",
Synchronized="2017-08-05 16:53:34.0")
/** Column name IsSOTrx */
public static final String COLUMNNAME_IsSOTrx = "IsSOTrx";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory.");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
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

@XendraTrl(Identifier="b88b5015-6a11-fc75-ba78-6338cb5044d6")
public static String es_PE_FIELD_DocumentGroup_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="b88b5015-6a11-fc75-ba78-6338cb5044d6")
public static String es_PE_FIELD_DocumentGroup_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="b88b5015-6a11-fc75-ba78-6338cb5044d6")
public static String es_PE_FIELD_DocumentGroup_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="71fde5e6-78fc-1ab0-600f-8314aa6ffc95",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=0,IsReadOnly=false,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b88b5015-6a11-fc75-ba78-6338cb5044d6")
public static final String FIELDNAME_DocumentGroup_Name="b88b5015-6a11-fc75-ba78-6338cb5044d6";

@XendraTrl(Identifier="e00b9a06-71a2-74a0-2213-5996148dbf9e")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e00b9a06-71a2-74a0-2213-5996148dbf9e",
Synchronized="2017-08-05 16:53:34.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
