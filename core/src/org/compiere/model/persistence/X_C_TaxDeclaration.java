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
/** Generated Model for C_TaxDeclaration
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_TaxDeclaration extends PO
{
/** Standard Constructor
@param ctx context
@param C_TaxDeclaration_ID id
@param trxName transaction
*/
public X_C_TaxDeclaration (Properties ctx, int C_TaxDeclaration_ID, String trxName)
{
super (ctx, C_TaxDeclaration_ID, trxName);
/** if (C_TaxDeclaration_ID == 0)
{
setC_TaxDeclaration_ID (0);
setDateFrom (new Timestamp(System.currentTimeMillis()));
setDateTo (new Timestamp(System.currentTimeMillis()));
setDateTrx (new Timestamp(System.currentTimeMillis()));
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
public X_C_TaxDeclaration (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=818 */
public static int Table_ID=MTable.getTable_ID("C_TaxDeclaration");

@XendraTrl(Identifier="614619cb-c88b-b92e-7ff2-883b27b88120")
public static String es_PE_TAB_Declaration_Description="Define declaración de impuestos a las autoridades";

@XendraTrl(Identifier="614619cb-c88b-b92e-7ff2-883b27b88120")
public static String es_PE_TAB_Declaration_Name="Declaración";

@XendraTrl(Identifier="614619cb-c88b-b92e-7ff2-883b27b88120")
public static String es_PE_TAB_Declaration_Help="La declaración de impuestos le permite crear información de soporte y conciliar documentos con la contabilidad.";

@XendraTab(Name="Declaration",Description="Define the declaration to the tax authorities",
Help="The tax declaration allows you to create supporting information and reconcile the documents with the accounting",
AD_Window_ID="fb0fc605-6ba3-81e4-e1cd-99ec1bda901b",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="614619cb-c88b-b92e-7ff2-883b27b88120",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Declaration="614619cb-c88b-b92e-7ff2-883b27b88120";

@XendraTrl(Identifier="047464be-adc8-ef08-c21c-eef31f11e14f")
public static String es_PE_TABLE_C_TaxDeclaration_Name="Declaración Impuestos";

@XendraTable(Name="Tax Declaration",Description="Define the declaration to the tax authorities",
Help="The tax declaration allows you to create supporting information and reconcile the documents with the accounting",
TableName="C_TaxDeclaration",AccessLevel="3",AD_Window_ID="fb0fc605-6ba3-81e4-e1cd-99ec1bda901b",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="047464be-adc8-ef08-c21c-eef31f11e14f",Synchronized="2017-08-16 11:42:31.0")
/** TableName=C_TaxDeclaration */
public static final String Table_Name="C_TaxDeclaration";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_TaxDeclaration");

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
    Table_ID = MTable.getTable_ID("C_TaxDeclaration");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_TaxDeclaration[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tax Declaration.
@param C_TaxDeclaration_ID Define the declaration to the tax authorities */
public void setC_TaxDeclaration_ID (int C_TaxDeclaration_ID)
{
if (C_TaxDeclaration_ID < 1) throw new IllegalArgumentException ("C_TaxDeclaration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_TaxDeclaration_ID, Integer.valueOf(C_TaxDeclaration_ID));
}
/** Get Tax Declaration.
@return Define the declaration to the tax authorities */
public int getC_TaxDeclaration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxDeclaration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b8da3455-1216-86ea-793b-4303d8a019e7")
public static String es_PE_FIELD_Declaration_TaxDeclaration_Description="Define declaración de impuestos a las autoridades  ";

@XendraTrl(Identifier="b8da3455-1216-86ea-793b-4303d8a019e7")
public static String es_PE_FIELD_Declaration_TaxDeclaration_Help="La declaración de impuestos le permite crear información de soporte y documentos de conciliación  con la contabilidad.";

@XendraTrl(Identifier="b8da3455-1216-86ea-793b-4303d8a019e7")
public static String es_PE_FIELD_Declaration_TaxDeclaration_Name="Declaración Impuestos";

@XendraField(AD_Column_ID="C_TaxDeclaration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b8da3455-1216-86ea-793b-4303d8a019e7")
public static final String FIELDNAME_Declaration_TaxDeclaration="b8da3455-1216-86ea-793b-4303d8a019e7";
/** Column name C_TaxDeclaration_ID */
public static final String COLUMNNAME_C_TaxDeclaration_ID = "C_TaxDeclaration_ID";
/** Set Date From.
@param DateFrom Starting date for a range */
public void setDateFrom (Timestamp DateFrom)
{
if (DateFrom == null) throw new IllegalArgumentException ("DateFrom is mandatory.");
set_Value (COLUMNNAME_DateFrom, DateFrom);
}
/** Get Date From.
@return Starting date for a range */
public Timestamp getDateFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_DateFrom);
}

@XendraTrl(Identifier="094db889-2812-e843-1fac-4f540fc3d9aa")
public static String es_PE_FIELD_Declaration_DateFrom_Description="Fecha de inicio para un rango";

@XendraTrl(Identifier="094db889-2812-e843-1fac-4f540fc3d9aa")
public static String es_PE_FIELD_Declaration_DateFrom_Help="La Fecha desde indica la fecha inicial de un rango";

@XendraTrl(Identifier="094db889-2812-e843-1fac-4f540fc3d9aa")
public static String es_PE_FIELD_Declaration_DateFrom_Name="Desde Fecha";

@XendraField(AD_Column_ID="DateFrom",IsCentrallyMaintained=true,
AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="094db889-2812-e843-1fac-4f540fc3d9aa")
public static final String FIELDNAME_Declaration_DateFrom="094db889-2812-e843-1fac-4f540fc3d9aa";

@XendraTrl(Identifier="1ae89449-0c9e-4b86-0aec-b60df8d51a6b")
public static String es_PE_COLUMN_DateFrom_Name="Desde Fecha";

@XendraColumn(AD_Element_ID="5bfdcbe1-cf4f-d7f7-c643-7a07f2907ae9",ColumnName="DateFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ae89449-0c9e-4b86-0aec-b60df8d51a6b",
Synchronized="2017-08-05 16:54:28.0")
/** Column name DateFrom */
public static final String COLUMNNAME_DateFrom = "DateFrom";
/** Set Date To.
@param DateTo End date of a date range */
public void setDateTo (Timestamp DateTo)
{
if (DateTo == null) throw new IllegalArgumentException ("DateTo is mandatory.");
set_Value (COLUMNNAME_DateTo, DateTo);
}
/** Get Date To.
@return End date of a date range */
public Timestamp getDateTo() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTo);
}

@XendraTrl(Identifier="381afc73-cd97-1855-1f4b-e53d10b108da")
public static String es_PE_FIELD_Declaration_DateTo_Description="Fecha final de un rango (inclusive)";

@XendraTrl(Identifier="381afc73-cd97-1855-1f4b-e53d10b108da")
public static String es_PE_FIELD_Declaration_DateTo_Help="La Fecha A indica la fecha final de un rango (inclusive)";

@XendraTrl(Identifier="381afc73-cd97-1855-1f4b-e53d10b108da")
public static String es_PE_FIELD_Declaration_DateTo_Name="A Fecha";

@XendraField(AD_Column_ID="DateTo",IsCentrallyMaintained=true,
AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="Reference",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="381afc73-cd97-1855-1f4b-e53d10b108da")
public static final String FIELDNAME_Declaration_DateTo="381afc73-cd97-1855-1f4b-e53d10b108da";

@XendraTrl(Identifier="3555dfc1-0727-ff85-5db7-b3fb87a84ae2")
public static String es_PE_COLUMN_DateTo_Name="A Fecha";

@XendraColumn(AD_Element_ID="c98c05a0-7b58-ed8f-3e5b-fe1e1358ac38",ColumnName="DateTo",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3555dfc1-0727-ff85-5db7-b3fb87a84ae2",
Synchronized="2017-08-05 16:54:28.0")
/** Column name DateTo */
public static final String COLUMNNAME_DateTo = "DateTo";
/** Set Transaction Date.
@param DateTrx Transaction Date */
public void setDateTrx (Timestamp DateTrx)
{
if (DateTrx == null) throw new IllegalArgumentException ("DateTrx is mandatory.");
set_Value (COLUMNNAME_DateTrx, DateTrx);
}
/** Get Transaction Date.
@return Transaction Date */
public Timestamp getDateTrx() 
{
return (Timestamp)get_Value(COLUMNNAME_DateTrx);
}

@XendraTrl(Identifier="0444568d-2e77-73c3-57b2-8ac993328f95")
public static String es_PE_FIELD_Declaration_TransactionDate_Description="Fecha de la transacción";

@XendraTrl(Identifier="0444568d-2e77-73c3-57b2-8ac993328f95")
public static String es_PE_FIELD_Declaration_TransactionDate_Help="La fecha de transacción indica la fecha en que se ejecutó la transacción";

@XendraTrl(Identifier="0444568d-2e77-73c3-57b2-8ac993328f95")
public static String es_PE_FIELD_Declaration_TransactionDate_Name="Fecha de la Transacción";

@XendraField(AD_Column_ID="DateTrx",IsCentrallyMaintained=true,
AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=7,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0444568d-2e77-73c3-57b2-8ac993328f95")
public static final String FIELDNAME_Declaration_TransactionDate="0444568d-2e77-73c3-57b2-8ac993328f95";

@XendraTrl(Identifier="17502f3a-cf05-7d9e-09f1-62caacd4cd30")
public static String es_PE_COLUMN_DateTrx_Name="Fecha de la Transacción";

@XendraColumn(AD_Element_ID="3700288f-61dd-2021-b833-cf804ceed1e9",ColumnName="DateTrx",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="17502f3a-cf05-7d9e-09f1-62caacd4cd30",
Synchronized="2017-08-05 16:54:28.0")
/** Column name DateTrx */
public static final String COLUMNNAME_DateTrx = "DateTrx";
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

@XendraTrl(Identifier="f4466c7d-ae87-7879-33b7-d981b01661de")
public static String es_PE_FIELD_Declaration_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="f4466c7d-ae87-7879-33b7-d981b01661de")
public static String es_PE_FIELD_Declaration_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="f4466c7d-ae87-7879-33b7-d981b01661de")
public static String es_PE_FIELD_Declaration_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f4466c7d-ae87-7879-33b7-d981b01661de")
public static final String FIELDNAME_Declaration_Description="f4466c7d-ae87-7879-33b7-d981b01661de";

@XendraTrl(Identifier="19932db1-026e-3c38-778b-06a0d8d361fb")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19932db1-026e-3c38-778b-06a0d8d361fb",
Synchronized="2017-08-05 16:54:28.0")
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
@XendraTrl(Identifier="35627ba2-7366-4a95-96d0-6b4e3aa29419")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="35627ba2-7366-4a95-96d0-6b4e3aa29419",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="5b276a22-c668-e3c3-beae-b13506c5c339")
public static String es_PE_FIELD_Declaration_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="5b276a22-c668-e3c3-beae-b13506c5c339")
public static String es_PE_FIELD_Declaration_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="5b276a22-c668-e3c3-beae-b13506c5c339")
public static String es_PE_FIELD_Declaration_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=120,IsReadOnly=false,SeqNo=30,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="5b276a22-c668-e3c3-beae-b13506c5c339")
public static final String FIELDNAME_Declaration_Name="5b276a22-c668-e3c3-beae-b13506c5c339";

@XendraTrl(Identifier="7aa72c52-fe0f-d5a7-163f-6d0d99217898")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=120,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7aa72c52-fe0f-d5a7-163f-6d0d99217898",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="b9bbc9ec-3989-c62c-6465-907779912129")
public static String es_PE_FIELD_Declaration_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b9bbc9ec-3989-c62c-6465-907779912129")
public static String es_PE_FIELD_Declaration_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b9bbc9ec-3989-c62c-6465-907779912129")
public static String es_PE_FIELD_Declaration_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b9bbc9ec-3989-c62c-6465-907779912129")
public static final String FIELDNAME_Declaration_Processed="b9bbc9ec-3989-c62c-6465-907779912129";

@XendraTrl(Identifier="0e853d2f-7110-6df9-9d20-ec7d6c27d5a5")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0e853d2f-7110-6df9-9d20-ec7d6c27d5a5",
Synchronized="2017-08-05 16:54:28.0")
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

@XendraTrl(Identifier="f6f73361-36ec-e027-4f59-8806073f411b")
public static String es_PE_FIELD_Declaration_ProcessNow_Description="Crear Declaración de Impuestos desde Documentos";

@XendraTrl(Identifier="f6f73361-36ec-e027-4f59-8806073f411b")
public static String es_PE_FIELD_Declaration_ProcessNow_Name="Crear Declaración de Impuestos";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="614619cb-c88b-b92e-7ff2-883b27b88120",AD_FieldGroup_ID="Status",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6f73361-36ec-e027-4f59-8806073f411b")
public static final String FIELDNAME_Declaration_ProcessNow="f6f73361-36ec-e027-4f59-8806073f411b";

@XendraTrl(Identifier="4a060803-64a5-ef10-8011-e696c8cbdb12")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="5601235c-95d4-53c3-5bd1-26c22612b8e5",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="4a060803-64a5-ef10-8011-e696c8cbdb12",Synchronized="2017-08-05 16:54:28.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
