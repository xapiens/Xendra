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
/** Generated Model for R_MailText
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_MailText extends PO
{
/** Standard Constructor
@param ctx context
@param R_MailText_ID id
@param trxName transaction
*/
public X_R_MailText (Properties ctx, int R_MailText_ID, String trxName)
{
super (ctx, R_MailText_ID, trxName);
/** if (R_MailText_ID == 0)
{
setIsHtml (false);	
// N
setMailText (null);
setName (null);
setR_MailText_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_MailText (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=416 */
public static int Table_ID=MTable.getTable_ID("R_MailText");

@XendraTrl(Identifier="c62d157f-8b9d-f492-7726-7d98ce1d9292")
public static String es_PE_TAB_MailTemplate_Name="Plantilla de Correo";

@XendraTab(Name="Mail Template",Description="Maintain Mail Template",
Help="A mail template can contain variables, e.g. @Name@.   The variables are replaced based on the context. First, the the User is searched to find the variables. Additional objects are used for dunning (business partner, dunning entry), asset delivery (asset) and invoice print (business partner, invoice)",
AD_Window_ID="ea9f92ec-2db4-81ea-5d61-b74093404bad",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c62d157f-8b9d-f492-7726-7d98ce1d9292",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_MailTemplate="c62d157f-8b9d-f492-7726-7d98ce1d9292";

@XendraTrl(Identifier="ae336a08-c26a-a644-3df1-153fb5f11098")
public static String es_PE_TABLE_R_MailText_Name="Patrón de Correo";

@XendraTable(Name="Mail Template",Description="Text templates for mailings",Help="",
TableName="R_MailText",AccessLevel="7",AD_Window_ID="ea9f92ec-2db4-81ea-5d61-b74093404bad",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=85,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="ae336a08-c26a-a644-3df1-153fb5f11098",Synchronized="2017-08-16 11:43:49.0")
/** TableName=R_MailText */
public static final String Table_Name="R_MailText";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_MailText");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("R_MailText");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_MailText[").append(get_ID()).append("]");
return sb.toString();
}
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
@XendraTrl(Identifier="4a4422e4-d796-412b-8ce2-06ac2bacda8e")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a4422e4-d796-412b-8ce2-06ac2bacda8e",
Synchronized="2017-08-05 16:55:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set HTML.
@param IsHtml Text has HTML tags */
public void setIsHtml (boolean IsHtml)
{
set_Value (COLUMNNAME_IsHtml, Boolean.valueOf(IsHtml));
}
/** Get HTML.
@return Text has HTML tags */
public boolean isHtml() 
{
Object oo = get_Value(COLUMNNAME_IsHtml);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="395aab4d-3ef8-b5a2-1491-0963e5d8fa94")
public static String es_PE_FIELD_MailTemplate_HTML_Description="Texto con etiquetas HTML";

@XendraTrl(Identifier="395aab4d-3ef8-b5a2-1491-0963e5d8fa94")
public static String es_PE_FIELD_MailTemplate_HTML_Name="HTML";
@XendraField(AD_Column_ID="IsHtml",
IsCentrallyMaintained=true,AD_Tab_ID="c62d157f-8b9d-f492-7726-7d98ce1d9292",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="395aab4d-3ef8-b5a2-1491-0963e5d8fa94")
public static final String FIELDNAME_MailTemplate_HTML="395aab4d-3ef8-b5a2-1491-0963e5d8fa94";

@XendraTrl(Identifier="e1ddea37-ab68-7a4a-4404-e053f02d6c11")
public static String es_PE_COLUMN_IsHtml_Name="HTML";

@XendraColumn(AD_Element_ID="79dc78bc-a5f9-32cc-0d1b-ceb9fcfe4508",ColumnName="IsHtml",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e1ddea37-ab68-7a4a-4404-e053f02d6c11",
Synchronized="2017-08-05 16:55:50.0")
/** Column name IsHtml */
public static final String COLUMNNAME_IsHtml = "IsHtml";
/** Set Subject.
@param MailHeader Mail Header (Subject) */
public void setMailHeader (String MailHeader)
{
if (MailHeader != null && MailHeader.length() > 2000)
{
log.warning("Length > 2000 - truncated");
MailHeader = MailHeader.substring(0,1999);
}
set_Value (COLUMNNAME_MailHeader, MailHeader);
}
/** Get Subject.
@return Mail Header (Subject) */
public String getMailHeader() 
{
String value = (String)get_Value(COLUMNNAME_MailHeader);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8fdb2504-fed7-75f5-51fd-af9bffdd81b5")
public static String es_PE_FIELD_MailTemplate_Subject_Name="Encabezado del Correo";

@XendraField(AD_Column_ID="MailHeader",IsCentrallyMaintained=true,
AD_Tab_ID="c62d157f-8b9d-f492-7726-7d98ce1d9292",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8fdb2504-fed7-75f5-51fd-af9bffdd81b5")
public static final String FIELDNAME_MailTemplate_Subject="8fdb2504-fed7-75f5-51fd-af9bffdd81b5";

@XendraTrl(Identifier="693139dc-3f24-8a5b-61f7-b06e98c8ad64")
public static String es_PE_COLUMN_MailHeader_Name="Encabezado del Correo";

@XendraColumn(AD_Element_ID="eaf3a915-5f26-6dff-023f-736e57ed1dee",ColumnName="MailHeader",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="693139dc-3f24-8a5b-61f7-b06e98c8ad64",
Synchronized="2017-08-05 16:55:50.0")
/** Column name MailHeader */
public static final String COLUMNNAME_MailHeader = "MailHeader";
/** Set Mail Text.
@param MailText Text used for Mail message */
public void setMailText (String MailText)
{
if (MailText == null) throw new IllegalArgumentException ("MailText is mandatory.");
set_Value (COLUMNNAME_MailText, MailText);
}
/** Get Mail Text.
@return Text used for Mail message */
public String getMailText() 
{
String value = (String)get_Value(COLUMNNAME_MailText);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="336ccde5-5905-80ac-6eda-18adbfc395b5")
public static String es_PE_FIELD_MailTemplate_MailText_Description="Texto usado para mensajes de correo";

@XendraTrl(Identifier="336ccde5-5905-80ac-6eda-18adbfc395b5")
public static String es_PE_FIELD_MailTemplate_MailText_Help="El texto de correo indica el texto usado para mensajes de correo.";

@XendraTrl(Identifier="336ccde5-5905-80ac-6eda-18adbfc395b5")
public static String es_PE_FIELD_MailTemplate_MailText_Name="Texto del Correo";

@XendraField(AD_Column_ID="MailText",IsCentrallyMaintained=true,
AD_Tab_ID="c62d157f-8b9d-f492-7726-7d98ce1d9292",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="336ccde5-5905-80ac-6eda-18adbfc395b5")
public static final String FIELDNAME_MailTemplate_MailText="336ccde5-5905-80ac-6eda-18adbfc395b5";

@XendraTrl(Identifier="e55b8adc-974c-68e2-e70b-44c9af781e65")
public static String es_PE_COLUMN_MailText_Name="Texto del Correo";

@XendraColumn(AD_Element_ID="d5e995a9-c611-6ca1-fa1e-2f71ea10cf48",ColumnName="MailText",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e55b8adc-974c-68e2-e70b-44c9af781e65",
Synchronized="2017-08-05 16:55:50.0")
/** Column name MailText */
public static final String COLUMNNAME_MailText = "MailText";
/** Set Mail Text 2.
@param MailText2 Optional second text part used for Mail message */
public void setMailText2 (String MailText2)
{
set_Value (COLUMNNAME_MailText2, MailText2);
}
/** Get Mail Text 2.
@return Optional second text part used for Mail message */
public String getMailText2() 
{
String value = (String)get_Value(COLUMNNAME_MailText2);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a37bcaa1-b46a-2a95-5759-3770eda809d7")
public static String es_PE_FIELD_MailTemplate_MailText22_Description="Segunda parte opcional de texto usada para el mensaje del correo.";

@XendraTrl(Identifier="a37bcaa1-b46a-2a95-5759-3770eda809d7")
public static String es_PE_FIELD_MailTemplate_MailText22_Help="El texto del correo indica el texto usado para los mensajes del correo.";

@XendraTrl(Identifier="a37bcaa1-b46a-2a95-5759-3770eda809d7")
public static String es_PE_FIELD_MailTemplate_MailText22_Name="Texto 2 de Mail";

@XendraField(AD_Column_ID="MailText2",IsCentrallyMaintained=true,
AD_Tab_ID="c62d157f-8b9d-f492-7726-7d98ce1d9292",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a37bcaa1-b46a-2a95-5759-3770eda809d7")
public static final String FIELDNAME_MailTemplate_MailText22="a37bcaa1-b46a-2a95-5759-3770eda809d7";

@XendraTrl(Identifier="6b27f9ea-cd54-fc9e-8691-c514285d21ba")
public static String es_PE_COLUMN_MailText2_Name="Texto 2 de Mail";

@XendraColumn(AD_Element_ID="cf36d7ee-81dc-3e1b-299a-75bfa5edf03f",ColumnName="MailText2",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b27f9ea-cd54-fc9e-8691-c514285d21ba",
Synchronized="2017-08-05 16:55:50.0")
/** Column name MailText2 */
public static final String COLUMNNAME_MailText2 = "MailText2";
/** Set Mail Text 3.
@param MailText3 Optional third text part used for Mail message */
public void setMailText3 (String MailText3)
{
set_Value (COLUMNNAME_MailText3, MailText3);
}
/** Get Mail Text 3.
@return Optional third text part used for Mail message */
public String getMailText3() 
{
String value = (String)get_Value(COLUMNNAME_MailText3);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b4996f3d-a7e9-10f9-ae9f-5f4f87128612")
public static String es_PE_FIELD_MailTemplate_MailText33_Description="Tercera parte opcional del texto usada para el mensaje del correo.";

@XendraTrl(Identifier="b4996f3d-a7e9-10f9-ae9f-5f4f87128612")
public static String es_PE_FIELD_MailTemplate_MailText33_Help="El texto del correo indica el texto usado para los mensajes del correo.";

@XendraTrl(Identifier="b4996f3d-a7e9-10f9-ae9f-5f4f87128612")
public static String es_PE_FIELD_MailTemplate_MailText33_Name="Texto 3 de Mail";

@XendraField(AD_Column_ID="MailText3",IsCentrallyMaintained=true,
AD_Tab_ID="c62d157f-8b9d-f492-7726-7d98ce1d9292",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b4996f3d-a7e9-10f9-ae9f-5f4f87128612")
public static final String FIELDNAME_MailTemplate_MailText33="b4996f3d-a7e9-10f9-ae9f-5f4f87128612";

@XendraTrl(Identifier="a3932f39-f93a-d1bc-379f-52242faffc13")
public static String es_PE_COLUMN_MailText3_Name="Texto 3 de Mail";

@XendraColumn(AD_Element_ID="708eebf3-d573-6315-dbb8-b1555d0c8e93",ColumnName="MailText3",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a3932f39-f93a-d1bc-379f-52242faffc13",
Synchronized="2017-08-05 16:55:50.0")
/** Column name MailText3 */
public static final String COLUMNNAME_MailText3 = "MailText3";
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

@XendraTrl(Identifier="3fa20cbd-6740-e759-5123-540d65b386a7")
public static String es_PE_FIELD_MailTemplate_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="3fa20cbd-6740-e759-5123-540d65b386a7")
public static String es_PE_FIELD_MailTemplate_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="3fa20cbd-6740-e759-5123-540d65b386a7")
public static String es_PE_FIELD_MailTemplate_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c62d157f-8b9d-f492-7726-7d98ce1d9292",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3fa20cbd-6740-e759-5123-540d65b386a7")
public static final String FIELDNAME_MailTemplate_Name="3fa20cbd-6740-e759-5123-540d65b386a7";

@XendraTrl(Identifier="0a24b505-67c2-f74f-41cc-82854328ebb5")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=true,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a24b505-67c2-f74f-41cc-82854328ebb5",
Synchronized="2017-08-05 16:55:50.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Mail Template.
@param R_MailText_ID Text templates for mailings */
public void setR_MailText_ID (int R_MailText_ID)
{
if (R_MailText_ID < 1) throw new IllegalArgumentException ("R_MailText_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_MailText_ID, Integer.valueOf(R_MailText_ID));
}
/** Get Mail Template.
@return Text templates for mailings */
public int getR_MailText_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_MailText_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="a7a1010f-10e9-08d1-e8bd-079005f7e750")
public static String es_PE_FIELD_MailTemplate_MailTemplate_Description="Patrón de texto para correos.";

@XendraTrl(Identifier="a7a1010f-10e9-08d1-e8bd-079005f7e750")
public static String es_PE_FIELD_MailTemplate_MailTemplate_Help="El patrón de correo indica el patrón de correo para mensajes de retorno.";

@XendraTrl(Identifier="a7a1010f-10e9-08d1-e8bd-079005f7e750")
public static String es_PE_FIELD_MailTemplate_MailTemplate_Name="Patrón de Correo";

@XendraField(AD_Column_ID="R_MailText_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c62d157f-8b9d-f492-7726-7d98ce1d9292",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a7a1010f-10e9-08d1-e8bd-079005f7e750")
public static final String FIELDNAME_MailTemplate_MailTemplate="a7a1010f-10e9-08d1-e8bd-079005f7e750";
/** Column name R_MailText_ID */
public static final String COLUMNNAME_R_MailText_ID = "R_MailText_ID";
}
