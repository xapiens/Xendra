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
/** Generated Model for M_ChangeNotice
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_ChangeNotice extends PO
{
/** Standard Constructor
@param ctx context
@param M_ChangeNotice_ID id
@param trxName transaction
*/
public X_M_ChangeNotice (Properties ctx, int M_ChangeNotice_ID, String trxName)
{
super (ctx, M_ChangeNotice_ID, trxName);
/** if (M_ChangeNotice_ID == 0)
{
setIsApproved (false);	
// N
setM_ChangeNotice_ID (0);
setName (null);
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
public X_M_ChangeNotice (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=799 */
public static int Table_ID=MTable.getTable_ID("M_ChangeNotice");

@XendraTrl(Identifier="0ecca59d-550b-5e4e-8e60-d89ee19b35ea")
public static String es_PE_TAB_ChangeNotice_Description="(Ingenieria) Aviso de cambio (Version)";

@XendraTrl(Identifier="0ecca59d-550b-5e4e-8e60-d89ee19b35ea")
public static String es_PE_TAB_ChangeNotice_Name="Aviso de Cambio";
@XendraTab(Name="Change Notice",
Description="(Engineering) Change Note (Version)",Help="",
AD_Window_ID="8a10e84b-05cb-5640-2377-dbc3e3e24069",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="0ecca59d-550b-5e4e-8e60-d89ee19b35ea",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ChangeNotice="0ecca59d-550b-5e4e-8e60-d89ee19b35ea";

@XendraTrl(Identifier="cc25f4a0-318d-09c0-0044-27abd2862df7")
public static String es_PE_TAB_ChangeNotice2_Description="Lista de materiales (Ingenieria) cambio de noticia (Version)";

@XendraTrl(Identifier="cc25f4a0-318d-09c0-0044-27abd2862df7")
public static String es_PE_TAB_ChangeNotice2_Name="Aviso de Cambio";

@XendraTab(Name="Change Notice",
Description="Bill of Materials (Engineering) Change Notice (Version)",Help="",
AD_Window_ID="64b6deef-ba6e-76a9-8b1f-78e36f73c8f1",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="cc25f4a0-318d-09c0-0044-27abd2862df7",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ChangeNotice2="cc25f4a0-318d-09c0-0044-27abd2862df7";

@XendraTrl(Identifier="0f26dc35-ce06-56ef-0bde-4583af1c45a3")
public static String es_PE_TABLE_M_ChangeNotice_Name="Aviso de Cambio";

@XendraTable(Name="Change Notice",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_ChangeNotice",AccessLevel="3",AD_Window_ID="64b6deef-ba6e-76a9-8b1f-78e36f73c8f1",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="0f26dc35-ce06-56ef-0bde-4583af1c45a3",Synchronized="2020-03-03 21:38:18.0")
/** TableName=M_ChangeNotice */
public static final String Table_Name="M_ChangeNotice";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_ChangeNotice");

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
    Table_ID = MTable.getTable_ID("M_ChangeNotice");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_ChangeNotice[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="47664e90-b696-0d75-7bb3-eeaa98d28d7a")
public static String es_PE_FIELD_ChangeNotice_Description_Name="Observación";

@XendraTrl(Identifier="47664e90-b696-0d75-7bb3-eeaa98d28d7a")
public static String es_PE_FIELD_ChangeNotice_Description_Description="Observación";

@XendraTrl(Identifier="47664e90-b696-0d75-7bb3-eeaa98d28d7a")
public static String es_PE_FIELD_ChangeNotice_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="cc25f4a0-318d-09c0-0044-27abd2862df7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="47664e90-b696-0d75-7bb3-eeaa98d28d7a")
public static final String FIELDNAME_ChangeNotice_Description="47664e90-b696-0d75-7bb3-eeaa98d28d7a";

@XendraTrl(Identifier="788b97dc-9d95-8566-f1d3-45ad8b272656")
public static String es_PE_FIELD_ChangeNotice_Description2_Name="Observación";

@XendraTrl(Identifier="788b97dc-9d95-8566-f1d3-45ad8b272656")
public static String es_PE_FIELD_ChangeNotice_Description2_Description="Observación";

@XendraTrl(Identifier="788b97dc-9d95-8566-f1d3-45ad8b272656")
public static String es_PE_FIELD_ChangeNotice_Description2_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="0ecca59d-550b-5e4e-8e60-d89ee19b35ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="788b97dc-9d95-8566-f1d3-45ad8b272656")
public static final String FIELDNAME_ChangeNotice_Description2="788b97dc-9d95-8566-f1d3-45ad8b272656";

@XendraTrl(Identifier="81505a0f-66f8-7857-b692-482fdfc0eeb2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="81505a0f-66f8-7857-b692-482fdfc0eeb2",
Synchronized="2019-08-30 22:22:59.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Detail Information.
@param DetailInfo Additional Detail Information */
public void setDetailInfo (String DetailInfo)
{
set_Value (COLUMNNAME_DetailInfo, DetailInfo);
}
/** Get Detail Information.
@return Additional Detail Information */
public String getDetailInfo() 
{
String value = (String)get_Value(COLUMNNAME_DetailInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="40271519-d5b0-b900-7838-299ffb27bfec")
public static String es_PE_FIELD_ChangeNotice_DetailInformation_Name="Imprimir Detalle de Transacciones";

@XendraField(AD_Column_ID="DetailInfo",IsCentrallyMaintained=true,
AD_Tab_ID="cc25f4a0-318d-09c0-0044-27abd2862df7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="40271519-d5b0-b900-7838-299ffb27bfec")
public static final String FIELDNAME_ChangeNotice_DetailInformation="40271519-d5b0-b900-7838-299ffb27bfec";

@XendraTrl(Identifier="48935e82-a496-3a63-29f1-a487460c616b")
public static String es_PE_FIELD_ChangeNotice_DetailInformation2_Name="Imprimir Detalle de Transacciones";

@XendraField(AD_Column_ID="DetailInfo",IsCentrallyMaintained=true,
AD_Tab_ID="0ecca59d-550b-5e4e-8e60-d89ee19b35ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="48935e82-a496-3a63-29f1-a487460c616b")
public static final String FIELDNAME_ChangeNotice_DetailInformation2="48935e82-a496-3a63-29f1-a487460c616b";

@XendraTrl(Identifier="ddd09dba-0a3b-1e26-5c86-b4be38b2afb5")
public static String es_PE_COLUMN_DetailInfo_Name="Imprimir Detalle de Transacciones";

@XendraColumn(AD_Element_ID="7e3059bd-f5bc-4828-6462-c2d9d165f019",ColumnName="DetailInfo",
AD_Reference_ID=36,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=0,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ddd09dba-0a3b-1e26-5c86-b4be38b2afb5",
Synchronized="2019-08-30 22:22:59.0")
/** Column name DetailInfo */
public static final String COLUMNNAME_DetailInfo = "DetailInfo";
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

@XendraTrl(Identifier="13aaa450-0acd-852d-76ce-d1e366552519")
public static String es_PE_FIELD_ChangeNotice_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="13aaa450-0acd-852d-76ce-d1e366552519")
public static String es_PE_FIELD_ChangeNotice_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="13aaa450-0acd-852d-76ce-d1e366552519")
public static String es_PE_FIELD_ChangeNotice_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="cc25f4a0-318d-09c0-0044-27abd2862df7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="13aaa450-0acd-852d-76ce-d1e366552519")
public static final String FIELDNAME_ChangeNotice_CommentHelp="13aaa450-0acd-852d-76ce-d1e366552519";

@XendraTrl(Identifier="b07d55c2-3d7b-bf8d-e32a-beca140c2d86")
public static String es_PE_FIELD_ChangeNotice_CommentHelp2_Name="Ayuda";

@XendraTrl(Identifier="b07d55c2-3d7b-bf8d-e32a-beca140c2d86")
public static String es_PE_FIELD_ChangeNotice_CommentHelp2_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="b07d55c2-3d7b-bf8d-e32a-beca140c2d86")
public static String es_PE_FIELD_ChangeNotice_CommentHelp2_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="0ecca59d-550b-5e4e-8e60-d89ee19b35ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b07d55c2-3d7b-bf8d-e32a-beca140c2d86")
public static final String FIELDNAME_ChangeNotice_CommentHelp2="b07d55c2-3d7b-bf8d-e32a-beca140c2d86";

@XendraTrl(Identifier="cd4fbcce-8a96-3483-f230-7e089000ce6f")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cd4fbcce-8a96-3483-f230-7e089000ce6f",
Synchronized="2019-08-30 22:22:59.0")
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
@XendraTrl(Identifier="f0ced450-b357-4066-9e32-1210e6a27111")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f0ced450-b357-4066-9e32-1210e6a27111",
Synchronized="2019-08-30 22:22:59.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Approved.
@param IsApproved Indicates if this document requires approval */
public void setIsApproved (boolean IsApproved)
{
set_Value (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
}
/** Get Approved.
@return Indicates if this document requires approval */
public boolean isApproved() 
{
Object oo = get_Value(COLUMNNAME_IsApproved);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="0a3456ce-786c-81a8-23f7-f70a57fbdf86")
public static String es_PE_COLUMN_IsApproved_Name="Aprobación";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a3456ce-786c-81a8-23f7-f70a57fbdf86",
Synchronized="2019-08-30 22:22:59.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Change Notice.
@param M_ChangeNotice_ID Bill of Materials (Engineering) Change Notice (Version) */
public void setM_ChangeNotice_ID (int M_ChangeNotice_ID)
{
if (M_ChangeNotice_ID < 1) throw new IllegalArgumentException ("M_ChangeNotice_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ChangeNotice_ID, Integer.valueOf(M_ChangeNotice_ID));
}
/** Get Change Notice.
@return Bill of Materials (Engineering) Change Notice (Version) */
public int getM_ChangeNotice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ChangeNotice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="10207bc3-4f87-4f51-1974-c1f0e5d24357")
public static String es_PE_FIELD_ChangeNotice_ChangeNotice_Name="Aviso de Cambio";

@XendraTrl(Identifier="10207bc3-4f87-4f51-1974-c1f0e5d24357")
public static String es_PE_FIELD_ChangeNotice_ChangeNotice_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="cc25f4a0-318d-09c0-0044-27abd2862df7",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="10207bc3-4f87-4f51-1974-c1f0e5d24357")
public static final String FIELDNAME_ChangeNotice_ChangeNotice="10207bc3-4f87-4f51-1974-c1f0e5d24357";

@XendraTrl(Identifier="4320ed5e-94aa-edf2-22b2-b509ee6d300b")
public static String es_PE_FIELD_ChangeNotice_ChangeNotice2_Name="Aviso de Cambio";

@XendraTrl(Identifier="4320ed5e-94aa-edf2-22b2-b509ee6d300b")
public static String es_PE_FIELD_ChangeNotice_ChangeNotice2_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="0ecca59d-550b-5e4e-8e60-d89ee19b35ea",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4320ed5e-94aa-edf2-22b2-b509ee6d300b")
public static final String FIELDNAME_ChangeNotice_ChangeNotice2="4320ed5e-94aa-edf2-22b2-b509ee6d300b";
/** Column name M_ChangeNotice_ID */
public static final String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
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

@XendraTrl(Identifier="c921fca2-9641-258e-ac05-2638a4f6de95")
public static String es_PE_FIELD_ChangeNotice_Name_Name="Nombre";

@XendraTrl(Identifier="c921fca2-9641-258e-ac05-2638a4f6de95")
public static String es_PE_FIELD_ChangeNotice_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="c921fca2-9641-258e-ac05-2638a4f6de95")
public static String es_PE_FIELD_ChangeNotice_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="cc25f4a0-318d-09c0-0044-27abd2862df7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c921fca2-9641-258e-ac05-2638a4f6de95")
public static final String FIELDNAME_ChangeNotice_Name="c921fca2-9641-258e-ac05-2638a4f6de95";

@XendraTrl(Identifier="5f3d74ad-2a7f-20be-8f3e-b14ce9459519")
public static String es_PE_FIELD_ChangeNotice_Name2_Name="Nombre";

@XendraTrl(Identifier="5f3d74ad-2a7f-20be-8f3e-b14ce9459519")
public static String es_PE_FIELD_ChangeNotice_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="5f3d74ad-2a7f-20be-8f3e-b14ce9459519")
public static String es_PE_FIELD_ChangeNotice_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="0ecca59d-550b-5e4e-8e60-d89ee19b35ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5f3d74ad-2a7f-20be-8f3e-b14ce9459519")
public static final String FIELDNAME_ChangeNotice_Name2="5f3d74ad-2a7f-20be-8f3e-b14ce9459519";

@XendraTrl(Identifier="f3a67e00-f66f-5bde-3a0c-2b05fb007069")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f3a67e00-f66f-5bde-3a0c-2b05fb007069",
Synchronized="2019-08-30 22:22:59.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="51ae32a6-7bf1-99d1-4648-54c0875f1790")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="51ae32a6-7bf1-99d1-4648-54c0875f1790",
Synchronized="2019-08-30 22:22:59.0")
/** Column name Processed */
public static final String COLUMNNAME_Processed = "Processed";
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

@XendraTrl(Identifier="e5ac94cd-ae3b-7da0-a6b9-361c2eff26c2")
public static String es_PE_FIELD_ChangeNotice_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="cc25f4a0-318d-09c0-0044-27abd2862df7",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e5ac94cd-ae3b-7da0-a6b9-361c2eff26c2")
public static final String FIELDNAME_ChangeNotice_ProcessNow="e5ac94cd-ae3b-7da0-a6b9-361c2eff26c2";

@XendraTrl(Identifier="4ce92842-1fb2-1d6e-21ca-a63441850862")
public static String es_PE_FIELD_ChangeNotice_ProcessNow2_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="0ecca59d-550b-5e4e-8e60-d89ee19b35ea",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4ce92842-1fb2-1d6e-21ca-a63441850862")
public static final String FIELDNAME_ChangeNotice_ProcessNow2="4ce92842-1fb2-1d6e-21ca-a63441850862";

@XendraTrl(Identifier="0dc5015a-038a-3395-b916-6fd968e07df6")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dc5015a-038a-3395-b916-6fd968e07df6",
Synchronized="2019-08-30 22:22:59.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
