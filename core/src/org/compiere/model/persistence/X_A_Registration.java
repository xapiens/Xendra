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
/** Generated Model for A_Registration
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_Registration extends PO
{
/** Standard Constructor
@param ctx context
@param A_Registration_ID id
@param trxName transaction
*/
public X_A_Registration (Properties ctx, int A_Registration_ID, String trxName)
{
super (ctx, A_Registration_ID, trxName);
/** if (A_Registration_ID == 0)
{
setA_Registration_ID (0);
setAssetServiceDate (new Timestamp(System.currentTimeMillis()));
setIsAllowPublish (false);	
// N
setIsInProduction (false);	
// N
setIsRegistered (false);	
// N
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_Registration (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=651 */
public static int Table_ID=MTable.getTable_ID("A_Registration");

@XendraTrl(Identifier="591cabb2-373a-40d2-6662-757cd8d87e0c")
public static String es_PE_TAB_Registration_Description="Registro de usuario activo";

@XendraTrl(Identifier="591cabb2-373a-40d2-6662-757cd8d87e0c")
public static String es_PE_TAB_Registration_Help="Registro de un usuario activo";

@XendraTrl(Identifier="591cabb2-373a-40d2-6662-757cd8d87e0c")
public static String es_PE_TAB_Registration_Name="Registro";
@XendraTab(Name="Registration",
Description="Asset User Registration",Help="User Registration of an Asset",
AD_Window_ID="ca233263-48b6-c157-cd25-6ffa7446944f",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="591cabb2-373a-40d2-6662-757cd8d87e0c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Registration="591cabb2-373a-40d2-6662-757cd8d87e0c";

@XendraTrl(Identifier="a05d8a93-9491-133b-edd0-95f99f065990")
public static String es_PE_TABLE_A_Registration_Name="Registro";

@XendraTable(Name="Registration",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="User Asset Registration",Help="",
TableName="A_Registration",AccessLevel="3",AD_Window_ID="ca233263-48b6-c157-cd25-6ffa7446944f",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="a05d8a93-9491-133b-edd0-95f99f065990",Synchronized="2020-03-03 21:36:15.0")
/** TableName=A_Registration */
public static final String Table_Name="A_Registration";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_Registration");

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
    Table_ID = MTable.getTable_ID("A_Registration");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_Registration[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_Value (COLUMNNAME_A_Asset_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="281fe816-83a6-bf71-c5b7-d0259f77b58e")
public static String es_PE_FIELD_Registration_Asset_Name="Activo";

@XendraTrl(Identifier="281fe816-83a6-bf71-c5b7-d0259f77b58e")
public static String es_PE_FIELD_Registration_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="281fe816-83a6-bf71-c5b7-d0259f77b58e")
public static String es_PE_FIELD_Registration_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="281fe816-83a6-bf71-c5b7-d0259f77b58e")
public static final String FIELDNAME_Registration_Asset="281fe816-83a6-bf71-c5b7-d0259f77b58e";

@XendraTrl(Identifier="6df7e415-ea2b-9e11-369b-3d33b1c1f6c9")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6df7e415-ea2b-9e11-369b-3d33b1c1f6c9",
Synchronized="2019-08-30 22:20:56.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID <= 0) set_Value (COLUMNNAME_AD_User_ID, null);
 else 
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9fc77935-ceef-4770-f177-95931ce1153f")
public static String es_PE_FIELD_Registration_UserContact_Name="Usuario";

@XendraTrl(Identifier="9fc77935-ceef-4770-f177-95931ce1153f")
public static String es_PE_FIELD_Registration_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="9fc77935-ceef-4770-f177-95931ce1153f")
public static String es_PE_FIELD_Registration_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9fc77935-ceef-4770-f177-95931ce1153f")
public static final String FIELDNAME_Registration_UserContact="9fc77935-ceef-4770-f177-95931ce1153f";

@XendraTrl(Identifier="00d5116c-6cfc-52b5-5289-12355f925c7d")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="f4ac36a1-4200-1386-677e-14ac90afb4fe",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="00d5116c-6cfc-52b5-5289-12355f925c7d",Synchronized="2019-08-30 22:20:56.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Registration.
@param A_Registration_ID User Asset Registration */
public void setA_Registration_ID (int A_Registration_ID)
{
if (A_Registration_ID < 1) throw new IllegalArgumentException ("A_Registration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_Registration_ID, Integer.valueOf(A_Registration_ID));
}
/** Get Registration.
@return User Asset Registration */
public int getA_Registration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Registration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="387c4c8e-fd64-fb24-c44d-b26243800aaf")
public static String es_PE_FIELD_Registration_Registration_Name="Registro";

@XendraTrl(Identifier="387c4c8e-fd64-fb24-c44d-b26243800aaf")
public static String es_PE_FIELD_Registration_Registration_Description="Usar registro activo";

@XendraTrl(Identifier="387c4c8e-fd64-fb24-c44d-b26243800aaf")
public static String es_PE_FIELD_Registration_Registration_Help="Usar registro de un activo.";

@XendraField(AD_Column_ID="A_Registration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="387c4c8e-fd64-fb24-c44d-b26243800aaf")
public static final String FIELDNAME_Registration_Registration="387c4c8e-fd64-fb24-c44d-b26243800aaf";
/** Column name A_Registration_ID */
public static final String COLUMNNAME_A_Registration_ID = "A_Registration_ID";
/** Set In Service Date.
@param AssetServiceDate Date when Asset was put into service */
public void setAssetServiceDate (Timestamp AssetServiceDate)
{
if (AssetServiceDate == null) throw new IllegalArgumentException ("AssetServiceDate is mandatory.");
set_ValueNoCheck (COLUMNNAME_AssetServiceDate, AssetServiceDate);
}
/** Get In Service Date.
@return Date when Asset was put into service */
public Timestamp getAssetServiceDate() 
{
return (Timestamp)get_Value(COLUMNNAME_AssetServiceDate);
}

@XendraTrl(Identifier="b4bef35a-6c16-adc1-64a5-a3e58e5c5fce")
public static String es_PE_FIELD_Registration_InServiceDate_Name="En Fecha de Servicio";

@XendraTrl(Identifier="b4bef35a-6c16-adc1-64a5-a3e58e5c5fce")
public static String es_PE_FIELD_Registration_InServiceDate_Description="Fecha cuando el activo ha sido puesto en servicio";

@XendraTrl(Identifier="b4bef35a-6c16-adc1-64a5-a3e58e5c5fce")
public static String es_PE_FIELD_Registration_InServiceDate_Help="La fecha en que el activo fue puesto en servicio - usado generalmente como fecha del comienzo para la depreciación.";

@XendraField(AD_Column_ID="AssetServiceDate",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4bef35a-6c16-adc1-64a5-a3e58e5c5fce")
public static final String FIELDNAME_Registration_InServiceDate="b4bef35a-6c16-adc1-64a5-a3e58e5c5fce";

@XendraTrl(Identifier="f1e63285-67e5-d9db-689a-84ad77ce735c")
public static String es_PE_COLUMN_AssetServiceDate_Name="En Fecha de Servicio";

@XendraColumn(AD_Element_ID="cef463b7-4708-9a3d-c88d-445ecacd44a3",ColumnName="AssetServiceDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1e63285-67e5-d9db-689a-84ad77ce735c",
Synchronized="2019-08-30 22:20:56.0")
/** Column name AssetServiceDate */
public static final String COLUMNNAME_AssetServiceDate = "AssetServiceDate";
/** Set Business Partner .
@param C_BPartner_ID Identifies a Business Partner */
public void setC_BPartner_ID (int C_BPartner_ID)
{
if (C_BPartner_ID <= 0) set_Value (COLUMNNAME_C_BPartner_ID, null);
 else 
set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
}
/** Get Business Partner .
@return Identifies a Business Partner */
public int getC_BPartner_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="321fe998-4efa-b2d7-6349-f54baf372274")
public static String es_PE_FIELD_Registration_BusinessPartner_Name="Socio de Negocio";

@XendraTrl(Identifier="321fe998-4efa-b2d7-6349-f54baf372274")
public static String es_PE_FIELD_Registration_BusinessPartner_Description="Identifica un Socio de Negocio";

@XendraTrl(Identifier="321fe998-4efa-b2d7-6349-f54baf372274")
public static String es_PE_FIELD_Registration_BusinessPartner_Help="Un socio de negocio es cualquiera con quien usted realiza transacciones. Este puede incluir Proveedores; Clientes; Empleados ó Vendedores.";

@XendraField(AD_Column_ID="C_BPartner_ID",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="321fe998-4efa-b2d7-6349-f54baf372274")
public static final String FIELDNAME_Registration_BusinessPartner="321fe998-4efa-b2d7-6349-f54baf372274";

@XendraTrl(Identifier="ec8bc184-e94b-6007-7d5b-9d96204e6428")
public static String es_PE_COLUMN_C_BPartner_ID_Name="Socio de Negocio";

@XendraColumn(AD_Element_ID="fe333dc3-4f40-1276-5f6a-d09bb66dc423",ColumnName="C_BPartner_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="06fdbbe9-e1c4-3ee4-4a9d-73d1a990cc42",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ec8bc184-e94b-6007-7d5b-9d96204e6428",Synchronized="2019-08-30 22:20:56.0")
/** Column name C_BPartner_ID */
public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";
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

@XendraTrl(Identifier="ec990135-d62c-9651-f473-f3d9024d1acc")
public static String es_PE_FIELD_Registration_Description_Name="Observación";

@XendraTrl(Identifier="ec990135-d62c-9651-f473-f3d9024d1acc")
public static String es_PE_FIELD_Registration_Description_Description="Observación";

@XendraTrl(Identifier="ec990135-d62c-9651-f473-f3d9024d1acc")
public static String es_PE_FIELD_Registration_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ec990135-d62c-9651-f473-f3d9024d1acc")
public static final String FIELDNAME_Registration_Description="ec990135-d62c-9651-f473-f3d9024d1acc";

@XendraTrl(Identifier="ac013812-146c-ed34-692c-590373f07ae5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac013812-146c-ed34-692c-590373f07ae5",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
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

@XendraTrl(Identifier="fe5cd56f-e2da-d51c-f1d9-bcd9ec83badd")
public static String es_PE_FIELD_Registration_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="fe5cd56f-e2da-d51c-f1d9-bcd9ec83badd")
public static String es_PE_FIELD_Registration_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="fe5cd56f-e2da-d51c-f1d9-bcd9ec83badd")
public static String es_PE_FIELD_Registration_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fe5cd56f-e2da-d51c-f1d9-bcd9ec83badd")
public static final String FIELDNAME_Registration_CommentHelp="fe5cd56f-e2da-d51c-f1d9-bcd9ec83badd";

@XendraTrl(Identifier="ed536192-30bf-c5f5-e444-816e40a64f35")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ed536192-30bf-c5f5-e444-816e40a64f35",
Synchronized="2019-08-30 22:20:56.0")
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
@XendraTrl(Identifier="3051729a-1026-4fb9-b591-e973be531562")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3051729a-1026-4fb9-b591-e973be531562",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Allowed to be Published.
@param IsAllowPublish You allow to publish the information, not just statistical summary info */
public void setIsAllowPublish (boolean IsAllowPublish)
{
set_Value (COLUMNNAME_IsAllowPublish, Boolean.valueOf(IsAllowPublish));
}
/** Get Allowed to be Published.
@return You allow to publish the information, not just statistical summary info */
public boolean isAllowPublish() 
{
Object oo = get_Value(COLUMNNAME_IsAllowPublish);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="d7663691-6dc7-7b0c-4d84-806344954035")
public static String es_PE_FIELD_Registration_AllowedToBePublished_Name="Mostrar lo Publicado";

@XendraTrl(Identifier="d7663691-6dc7-7b0c-4d84-806344954035")
public static String es_PE_FIELD_Registration_AllowedToBePublished_Description="Usted permite publicar la información, no resumen estadístico de Información.";

@XendraField(AD_Column_ID="IsAllowPublish",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=140,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7663691-6dc7-7b0c-4d84-806344954035")
public static final String FIELDNAME_Registration_AllowedToBePublished="d7663691-6dc7-7b0c-4d84-806344954035";

@XendraTrl(Identifier="d2fe3492-0c1a-5363-166a-f2abd179646d")
public static String es_PE_COLUMN_IsAllowPublish_Name="Mostrar lo Publicado";

@XendraColumn(AD_Element_ID="9431e926-fb2d-bc74-e2fb-a54ed9bd4fe1",ColumnName="IsAllowPublish",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d2fe3492-0c1a-5363-166a-f2abd179646d",
Synchronized="2019-08-30 22:20:56.0")
/** Column name IsAllowPublish */
public static final String COLUMNNAME_IsAllowPublish = "IsAllowPublish";
/** Set In Production.
@param IsInProduction The system is in production */
public void setIsInProduction (boolean IsInProduction)
{
set_Value (COLUMNNAME_IsInProduction, Boolean.valueOf(IsInProduction));
}
/** Get In Production.
@return The system is in production */
public boolean isInProduction() 
{
Object oo = get_Value(COLUMNNAME_IsInProduction);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="f245ef0a-196b-de62-90e2-d2c50c061f2d")
public static String es_PE_FIELD_Registration_InProduction_Name="En Producción";

@XendraTrl(Identifier="f245ef0a-196b-de62-90e2-d2c50c061f2d")
public static String es_PE_FIELD_Registration_InProduction_Description="El Sistema está en producción";

@XendraField(AD_Column_ID="IsInProduction",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=150,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f245ef0a-196b-de62-90e2-d2c50c061f2d")
public static final String FIELDNAME_Registration_InProduction="f245ef0a-196b-de62-90e2-d2c50c061f2d";

@XendraTrl(Identifier="1971572d-4c09-5369-613f-8be0a0fd04a3")
public static String es_PE_COLUMN_IsInProduction_Name="En Producción";

@XendraColumn(AD_Element_ID="0d37a1a4-d555-6b82-cfa6-6be72f417aa6",ColumnName="IsInProduction",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1971572d-4c09-5369-613f-8be0a0fd04a3",
Synchronized="2019-08-30 22:20:56.0")
/** Column name IsInProduction */
public static final String COLUMNNAME_IsInProduction = "IsInProduction";
/** Set Registered.
@param IsRegistered The application is registered. */
public void setIsRegistered (boolean IsRegistered)
{
set_Value (COLUMNNAME_IsRegistered, Boolean.valueOf(IsRegistered));
}
/** Get Registered.
@return The application is registered. */
public boolean isRegistered() 
{
Object oo = get_Value(COLUMNNAME_IsRegistered);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="3b3e3a44-e718-ed6f-117d-65741f57285e")
public static String es_PE_FIELD_Registration_Registered_Name="Registrado";

@XendraTrl(Identifier="3b3e3a44-e718-ed6f-117d-65741f57285e")
public static String es_PE_FIELD_Registration_Registered_Description="La aplicación es registrada.";

@XendraField(AD_Column_ID="IsRegistered",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3b3e3a44-e718-ed6f-117d-65741f57285e")
public static final String FIELDNAME_Registration_Registered="3b3e3a44-e718-ed6f-117d-65741f57285e";

@XendraTrl(Identifier="42ecdc92-5c01-db62-cb8e-d7fa2eb8e540")
public static String es_PE_COLUMN_IsRegistered_Name="Registrado";

@XendraColumn(AD_Element_ID="723a813c-2ec8-705a-a3d8-de4c5c70d97c",ColumnName="IsRegistered",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="42ecdc92-5c01-db62-cb8e-d7fa2eb8e540",
Synchronized="2019-08-30 22:20:56.0")
/** Column name IsRegistered */
public static final String COLUMNNAME_IsRegistered = "IsRegistered";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID <= 0) set_Value (COLUMNNAME_M_Product_ID, null);
 else 
set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="722f598b-283a-00e8-0c2e-a162fc1c92f8")
public static String es_PE_FIELD_Registration_Product_Name="Producto";

@XendraTrl(Identifier="722f598b-283a-00e8-0c2e-a162fc1c92f8")
public static String es_PE_FIELD_Registration_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="722f598b-283a-00e8-0c2e-a162fc1c92f8")
public static String es_PE_FIELD_Registration_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="722f598b-283a-00e8-0c2e-a162fc1c92f8")
public static final String FIELDNAME_Registration_Product="722f598b-283a-00e8-0c2e-a162fc1c92f8";

@XendraTrl(Identifier="1e7c51db-9e1d-ee11-de3e-cb3bfbc84567")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="1e7c51db-9e1d-ee11-de3e-cb3bfbc84567",Synchronized="2019-08-30 22:20:56.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="d24fca4b-758f-8b8b-eb7d-7591490486f5")
public static String es_PE_FIELD_Registration_Name_Name="Nombre";

@XendraTrl(Identifier="d24fca4b-758f-8b8b-eb7d-7591490486f5")
public static String es_PE_FIELD_Registration_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d24fca4b-758f-8b8b-eb7d-7591490486f5")
public static String es_PE_FIELD_Registration_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d24fca4b-758f-8b8b-eb7d-7591490486f5")
public static final String FIELDNAME_Registration_Name="d24fca4b-758f-8b8b-eb7d-7591490486f5";

@XendraTrl(Identifier="2d3c38e3-aaee-31a4-fd38-8e1cd3b1c67d")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2d3c38e3-aaee-31a4-fd38-8e1cd3b1c67d",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Note.
@param Note Optional additional user defined information */
public void setNote (String Note)
{
if (Note != null && Note.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Note = Note.substring(0,1999);
}
set_Value (COLUMNNAME_Note, Note);
}
/** Get Note.
@return Optional additional user defined information */
public String getNote() 
{
String value = (String)get_Value(COLUMNNAME_Note);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ef8e21f3-beca-6947-8df8-2f792723fcb4")
public static String es_PE_FIELD_Registration_Note_Name="Nota";

@XendraTrl(Identifier="ef8e21f3-beca-6947-8df8-2f792723fcb4")
public static String es_PE_FIELD_Registration_Note_Description="Información adicional opcional definida por el usuario";

@XendraTrl(Identifier="ef8e21f3-beca-6947-8df8-2f792723fcb4")
public static String es_PE_FIELD_Registration_Note_Help="El campo Nota permite una entrada opcional de información definida por el usuario considerando este registro";

@XendraField(AD_Column_ID="Note",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=170,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ef8e21f3-beca-6947-8df8-2f792723fcb4")
public static final String FIELDNAME_Registration_Note="ef8e21f3-beca-6947-8df8-2f792723fcb4";

@XendraTrl(Identifier="14567229-7ba8-2f66-c930-79bcbebe283a")
public static String es_PE_COLUMN_Note_Name="Nota";

@XendraColumn(AD_Element_ID="5fea140b-6b26-b544-b237-3b3fa64ae1c6",ColumnName="Note",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="14567229-7ba8-2f66-c930-79bcbebe283a",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Note */
public static final String COLUMNNAME_Note = "Note";
/** Set Process Now.
@param Processing Process Now */
public void setProcessing (boolean Processing)
{
set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
}
/** Get Process Now.
@return Process Now */
public boolean isProcessing() 
{
Object oo = get_Value(COLUMNNAME_Processing);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="b60792c4-a7ae-22b0-4177-73aa9632b741")
public static String es_PE_FIELD_Registration_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b60792c4-a7ae-22b0-4177-73aa9632b741")
public static final String FIELDNAME_Registration_ProcessNow="b60792c4-a7ae-22b0-4177-73aa9632b741";

@XendraTrl(Identifier="58411aa7-52ca-7a74-9aa2-877917dcb8d9")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="58411aa7-52ca-7a74-9aa2-877917dcb8d9",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Remote Addr.
@param Remote_Addr Remote Address */
public void setRemote_Addr (String Remote_Addr)
{
if (Remote_Addr != null && Remote_Addr.length() > 60)
{
log.warning("Length > 60 - truncated");
Remote_Addr = Remote_Addr.substring(0,59);
}
set_Value (COLUMNNAME_Remote_Addr, Remote_Addr);
}
/** Get Remote Addr.
@return Remote Address */
public String getRemote_Addr() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Addr);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d47fce1f-be5b-0fbb-cbcd-400a3ccd37a5")
public static String es_PE_FIELD_Registration_RemoteAddr_Name="Dirección Remota";

@XendraTrl(Identifier="d47fce1f-be5b-0fbb-cbcd-400a3ccd37a5")
public static String es_PE_FIELD_Registration_RemoteAddr_Description="Dirección remota";

@XendraTrl(Identifier="d47fce1f-be5b-0fbb-cbcd-400a3ccd37a5")
public static String es_PE_FIELD_Registration_RemoteAddr_Help="La dirección remota indica una dirección alternativa ó externa";

@XendraField(AD_Column_ID="Remote_Addr",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=190,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d47fce1f-be5b-0fbb-cbcd-400a3ccd37a5")
public static final String FIELDNAME_Registration_RemoteAddr="d47fce1f-be5b-0fbb-cbcd-400a3ccd37a5";

@XendraTrl(Identifier="adc465c3-54ab-8752-703d-a9304fd14b73")
public static String es_PE_COLUMN_Remote_Addr_Name="Dirección Remota";

@XendraColumn(AD_Element_ID="b1551fd7-ca8d-4a87-8302-e41caf5553d6",ColumnName="Remote_Addr",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="adc465c3-54ab-8752-703d-a9304fd14b73",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Remote_Addr */
public static final String COLUMNNAME_Remote_Addr = "Remote_Addr";
/** Set Remote Host.
@param Remote_Host Remote host Info */
public void setRemote_Host (String Remote_Host)
{
if (Remote_Host != null && Remote_Host.length() > 120)
{
log.warning("Length > 120 - truncated");
Remote_Host = Remote_Host.substring(0,119);
}
set_Value (COLUMNNAME_Remote_Host, Remote_Host);
}
/** Get Remote Host.
@return Remote host Info */
public String getRemote_Host() 
{
String value = (String)get_Value(COLUMNNAME_Remote_Host);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="d14d8cb5-a93e-f419-e8a3-a1581ef2e533")
public static String es_PE_FIELD_Registration_RemoteHost_Name="Host Remoto";

@XendraField(AD_Column_ID="Remote_Host",IsCentrallyMaintained=true,
AD_Tab_ID="591cabb2-373a-40d2-6662-757cd8d87e0c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=true,SeqNo=180,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d14d8cb5-a93e-f419-e8a3-a1581ef2e533")
public static final String FIELDNAME_Registration_RemoteHost="d14d8cb5-a93e-f419-e8a3-a1581ef2e533";

@XendraTrl(Identifier="7b771520-1bcd-3e4c-4e82-4ec4f4ea49fe")
public static String es_PE_COLUMN_Remote_Host_Name="Host Remoto";

@XendraColumn(AD_Element_ID="eb636ff7-fd5e-fa57-d640-f766bf4e52b2",ColumnName="Remote_Host",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b771520-1bcd-3e4c-4e82-4ec4f4ea49fe",
Synchronized="2019-08-30 22:20:56.0")
/** Column name Remote_Host */
public static final String COLUMNNAME_Remote_Host = "Remote_Host";
}
