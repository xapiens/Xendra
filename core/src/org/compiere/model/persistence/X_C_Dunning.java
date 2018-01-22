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
/** Generated Model for C_Dunning
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Dunning extends PO
{
/** Standard Constructor
@param ctx context
@param C_Dunning_ID id
@param trxName transaction
*/
public X_C_Dunning (Properties ctx, int C_Dunning_ID, String trxName)
{
super (ctx, C_Dunning_ID, trxName);
/** if (C_Dunning_ID == 0)
{
setC_Dunning_ID (0);
setCreateLevelsSequentially (false);	
// N
setIsDefault (false);	
// N
setName (null);
setSendDunningLetter (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Dunning (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=301 */
public static int Table_ID=MTable.getTable_ID("C_Dunning");

@XendraTrl(Identifier="c47db153-864c-bc82-8e97-66296fc823ef")
public static String es_PE_TAB_Dunning_Description="Mantener Reglas de Morosidad";

@XendraTrl(Identifier="c47db153-864c-bc82-8e97-66296fc823ef")
public static String es_PE_TAB_Dunning_Name="Morosidad";

@XendraTrl(Identifier="c47db153-864c-bc82-8e97-66296fc823ef")
public static String es_PE_TAB_Dunning_Help="La pestaña Morosidad define los parámetros para un nivel de morosidad.";

@XendraTab(Name="Dunning",Description="Maintain Dunning Rules",
Help="The Dunning Tab defines the parameters for a dunning level.",
AD_Window_ID="3474d11d-d9ea-1bda-8265-679528dc5382",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c47db153-864c-bc82-8e97-66296fc823ef",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Dunning="c47db153-864c-bc82-8e97-66296fc823ef";

@XendraTrl(Identifier="92023e94-7888-fec3-7795-77b11bd50a17")
public static String es_PE_TABLE_C_Dunning_Name="Morosidad";

@XendraTable(Name="Dunning",Description="Dunning Rules for overdue invoices",Help="",
TableName="C_Dunning",AccessLevel="3",AD_Window_ID="3474d11d-d9ea-1bda-8265-679528dc5382",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=65,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="92023e94-7888-fec3-7795-77b11bd50a17",Synchronized="2017-08-16 11:41:44.0")
/** TableName=C_Dunning */
public static final String Table_Name="C_Dunning";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Dunning");

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
    Table_ID = MTable.getTable_ID("C_Dunning");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Dunning[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Dunning.
@param C_Dunning_ID Dunning Rules for overdue invoices */
public void setC_Dunning_ID (int C_Dunning_ID)
{
if (C_Dunning_ID < 1) throw new IllegalArgumentException ("C_Dunning_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Dunning_ID, Integer.valueOf(C_Dunning_ID));
}
/** Get Dunning.
@return Dunning Rules for overdue invoices */
public int getC_Dunning_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Dunning_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d5eb34c3-02a6-5638-b0e1-0ece33bbbe7b")
public static String es_PE_FIELD_Dunning_Dunning_Description="Reglas de morosidad para facturas vencidas";

@XendraTrl(Identifier="d5eb34c3-02a6-5638-b0e1-0ece33bbbe7b")
public static String es_PE_FIELD_Dunning_Dunning_Help="La Morosidad indica las reglas y métodos de cálculo de morosidad para pagos vencidos";

@XendraTrl(Identifier="d5eb34c3-02a6-5638-b0e1-0ece33bbbe7b")
public static String es_PE_FIELD_Dunning_Dunning_Name="Morosidad";

@XendraField(AD_Column_ID="C_Dunning_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c47db153-864c-bc82-8e97-66296fc823ef",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5eb34c3-02a6-5638-b0e1-0ece33bbbe7b")
public static final String FIELDNAME_Dunning_Dunning="d5eb34c3-02a6-5638-b0e1-0ece33bbbe7b";
/** Column name C_Dunning_ID */
public static final String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";
/** Set Create levels sequentially.
@param CreateLevelsSequentially Create Dunning Letter by level sequentially */
public void setCreateLevelsSequentially (boolean CreateLevelsSequentially)
{
set_Value (COLUMNNAME_CreateLevelsSequentially, Boolean.valueOf(CreateLevelsSequentially));
}
/** Get Create levels sequentially.
@return Create Dunning Letter by level sequentially */
public boolean isCreateLevelsSequentially() 
{
Object oo = get_Value(COLUMNNAME_CreateLevelsSequentially);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="84f9053d-e1e8-0af2-2aed-5ecf8ae1a646")
public static String es_PE_FIELD_Dunning_CreateLevelsSequentially_Description="Create Dunning Letter by level sequentially";

@XendraTrl(Identifier="84f9053d-e1e8-0af2-2aed-5ecf8ae1a646")
public static String es_PE_FIELD_Dunning_CreateLevelsSequentially_Help="If selected, the dunning letters are created in the sequence of the dunning levels.  Otherwise, the dunning level is based on the days (over)due.";

@XendraTrl(Identifier="84f9053d-e1e8-0af2-2aed-5ecf8ae1a646")
public static String es_PE_FIELD_Dunning_CreateLevelsSequentially_Name="Crear Niveles Secuenciales";

@XendraField(AD_Column_ID="CreateLevelsSequentially",IsCentrallyMaintained=true,
AD_Tab_ID="c47db153-864c-bc82-8e97-66296fc823ef",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="84f9053d-e1e8-0af2-2aed-5ecf8ae1a646")
public static final String FIELDNAME_Dunning_CreateLevelsSequentially="84f9053d-e1e8-0af2-2aed-5ecf8ae1a646";

@XendraTrl(Identifier="3a8b2855-f3ba-f263-0d0a-f55bc68dd185")
public static String es_PE_COLUMN_CreateLevelsSequentially_Name="Create levels sequentially";

@XendraColumn(AD_Element_ID="14551fc0-68d6-94c6-f55f-75933b4c02c1",
ColumnName="CreateLevelsSequentially",AD_Reference_ID=20,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3a8b2855-f3ba-f263-0d0a-f55bc68dd185",Synchronized="2017-08-05 16:53:36.0")
/** Column name CreateLevelsSequentially */
public static final String COLUMNNAME_CreateLevelsSequentially = "CreateLevelsSequentially";
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

@XendraTrl(Identifier="e8f1987b-0d77-e6c7-cde7-5942e140940b")
public static String es_PE_FIELD_Dunning_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="e8f1987b-0d77-e6c7-cde7-5942e140940b")
public static String es_PE_FIELD_Dunning_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="e8f1987b-0d77-e6c7-cde7-5942e140940b")
public static String es_PE_FIELD_Dunning_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="c47db153-864c-bc82-8e97-66296fc823ef",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e8f1987b-0d77-e6c7-cde7-5942e140940b")
public static final String FIELDNAME_Dunning_Description="e8f1987b-0d77-e6c7-cde7-5942e140940b";

@XendraTrl(Identifier="fdd00ae8-d6be-062b-d88c-32bcc5b67b78")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fdd00ae8-d6be-062b-d88c-32bcc5b67b78",
Synchronized="2017-08-05 16:53:36.0")
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
@XendraTrl(Identifier="9bcbfe74-665e-4073-ae35-75cc7fba97df")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9bcbfe74-665e-4073-ae35-75cc7fba97df",
Synchronized="2017-08-05 16:53:36.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Default.
@param IsDefault Default value */
public void setIsDefault (boolean IsDefault)
{
set_Value (COLUMNNAME_IsDefault, Boolean.valueOf(IsDefault));
}
/** Get Default.
@return Default value */
public boolean isDefault() 
{
Object oo = get_Value(COLUMNNAME_IsDefault);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="6ae21111-26b8-c391-40e0-235d76604053")
public static String es_PE_FIELD_Dunning_Default_Description="Valor Predeterminado";

@XendraTrl(Identifier="6ae21111-26b8-c391-40e0-235d76604053")
public static String es_PE_FIELD_Dunning_Default_Help="El cuadro de verificación indica si este registro será usado como un valor predeterminado";

@XendraTrl(Identifier="6ae21111-26b8-c391-40e0-235d76604053")
public static String es_PE_FIELD_Dunning_Default_Name="Predeterminado";

@XendraField(AD_Column_ID="IsDefault",IsCentrallyMaintained=true,
AD_Tab_ID="c47db153-864c-bc82-8e97-66296fc823ef",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6ae21111-26b8-c391-40e0-235d76604053")
public static final String FIELDNAME_Dunning_Default="6ae21111-26b8-c391-40e0-235d76604053";

@XendraTrl(Identifier="1c7fb6ca-99b3-6b6a-c79a-a19a838289c7")
public static String es_PE_COLUMN_IsDefault_Name="Predeterminado";

@XendraColumn(AD_Element_ID="8617f892-e113-a5fd-8715-687f792f136c",ColumnName="IsDefault",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1c7fb6ca-99b3-6b6a-c79a-a19a838289c7",
Synchronized="2017-08-05 16:53:36.0")
/** Column name IsDefault */
public static final String COLUMNNAME_IsDefault = "IsDefault";
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

@XendraTrl(Identifier="d4ac7f65-45cd-d2cb-7c7d-3a1399d139ed")
public static String es_PE_FIELD_Dunning_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d4ac7f65-45cd-d2cb-7c7d-3a1399d139ed")
public static String es_PE_FIELD_Dunning_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d4ac7f65-45cd-d2cb-7c7d-3a1399d139ed")
public static String es_PE_FIELD_Dunning_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="c47db153-864c-bc82-8e97-66296fc823ef",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=40,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d4ac7f65-45cd-d2cb-7c7d-3a1399d139ed")
public static final String FIELDNAME_Dunning_Name="d4ac7f65-45cd-d2cb-7c7d-3a1399d139ed";

@XendraTrl(Identifier="4c4e2f45-f558-467f-3890-d80d80075577")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4c4e2f45-f558-467f-3890-d80d80075577",
Synchronized="2017-08-05 16:53:36.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Send dunning letters.
@param SendDunningLetter Indicates if dunning letters will be sent */
public void setSendDunningLetter (boolean SendDunningLetter)
{
set_Value (COLUMNNAME_SendDunningLetter, Boolean.valueOf(SendDunningLetter));
}
/** Get Send dunning letters.
@return Indicates if dunning letters will be sent */
public boolean isSendDunningLetter() 
{
Object oo = get_Value(COLUMNNAME_SendDunningLetter);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="fd2104ce-06ac-ef73-1a37-c1e15a2b25c7")
public static String es_PE_FIELD_Dunning_SendDunningLetters_Description="Indica si se enviarán cartas de morosidad";

@XendraTrl(Identifier="fd2104ce-06ac-ef73-1a37-c1e15a2b25c7")
public static String es_PE_FIELD_Dunning_SendDunningLetters_Help="El cuadro de verificación enviar cartas de morosidad indica si cartas de morosidad serán enviadas a los socios de negocio que usan esta regla de morosidad";

@XendraTrl(Identifier="fd2104ce-06ac-ef73-1a37-c1e15a2b25c7")
public static String es_PE_FIELD_Dunning_SendDunningLetters_Name="Enviar Cartas de Morosidad";

@XendraField(AD_Column_ID="SendDunningLetter",IsCentrallyMaintained=true,
AD_Tab_ID="c47db153-864c-bc82-8e97-66296fc823ef",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fd2104ce-06ac-ef73-1a37-c1e15a2b25c7")
public static final String FIELDNAME_Dunning_SendDunningLetters="fd2104ce-06ac-ef73-1a37-c1e15a2b25c7";

@XendraTrl(Identifier="e4b243d0-4542-a6db-966a-6a202600295b")
public static String es_PE_COLUMN_SendDunningLetter_Name="Enviar Cartas de Morosidad";

@XendraColumn(AD_Element_ID="e8e91bdd-9c12-8c86-cfa5-f99974c92a08",ColumnName="SendDunningLetter",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4b243d0-4542-a6db-966a-6a202600295b",
Synchronized="2017-08-05 16:53:36.0")
/** Column name SendDunningLetter */
public static final String COLUMNNAME_SendDunningLetter = "SendDunningLetter";
}
