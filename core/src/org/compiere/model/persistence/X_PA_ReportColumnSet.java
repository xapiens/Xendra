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
/** Generated Model for PA_ReportColumnSet
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_PA_ReportColumnSet extends PO
{
/** Standard Constructor
@param ctx context
@param PA_ReportColumnSet_ID id
@param trxName transaction
*/
public X_PA_ReportColumnSet (Properties ctx, int PA_ReportColumnSet_ID, String trxName)
{
super (ctx, PA_ReportColumnSet_ID, trxName);
/** if (PA_ReportColumnSet_ID == 0)
{
setName (null);
setPA_ReportColumnSet_ID (0);
setProcessing (false);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_PA_ReportColumnSet (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=447 */
public static int Table_ID=MTable.getTable_ID("PA_ReportColumnSet");

@XendraTrl(Identifier="14c45403-38aa-e2ce-565d-a91e0db9345c")
public static String es_PE_TAB_ReportColumnSet_Description="Mantener conjunto de columnas del Informe financiero";

@XendraTrl(Identifier="14c45403-38aa-e2ce-565d-a91e0db9345c")
public static String es_PE_TAB_ReportColumnSet_Name="Conjunto de Columnas del Informe";

@XendraTrl(Identifier="14c45403-38aa-e2ce-565d-a91e0db9345c")
public static String es_PE_TAB_ReportColumnSet_Help="Los conjuntos de columnas son la combinación de columnas que son incluidas en el Informe financiero.";

@XendraTab(Name="Report Column Set",Description="Maintain Financial Report Column Sets",
Help="Column Sets are the combination of Columns to be included in a Financial Report",
AD_Window_ID="1f84b370-fe0e-cce4-68b9-422e755a2bf5",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="14c45403-38aa-e2ce-565d-a91e0db9345c",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ReportColumnSet="14c45403-38aa-e2ce-565d-a91e0db9345c";

@XendraTrl(Identifier="67839b71-9c90-d67a-d871-1e4c970482f7")
public static String es_PE_TABLE_PA_ReportColumnSet_Name="Grupo de Columnas del Informe";


@XendraTable(Name="Report Column Set",Description="Collection of Columns for Report",Help="",
TableName="PA_ReportColumnSet",AccessLevel="7",AD_Window_ID="1f84b370-fe0e-cce4-68b9-422e755a2bf5",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.performanceanalysis",
Identifier="67839b71-9c90-d67a-d871-1e4c970482f7",Synchronized="2017-08-16 11:43:42.0")
/** TableName=PA_ReportColumnSet */
public static final String Table_Name="PA_ReportColumnSet";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"PA_ReportColumnSet");

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
    Table_ID = MTable.getTable_ID("PA_ReportColumnSet");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_PA_ReportColumnSet[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="e46c5e79-97ce-931e-9704-564fa35a4d99")
public static String es_PE_FIELD_ReportColumnSet_Description_Description="Observación";

@XendraTrl(Identifier="e46c5e79-97ce-931e-9704-564fa35a4d99")
public static String es_PE_FIELD_ReportColumnSet_Description_Help="Observación";

@XendraTrl(Identifier="e46c5e79-97ce-931e-9704-564fa35a4d99")
public static String es_PE_FIELD_ReportColumnSet_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="14c45403-38aa-e2ce-565d-a91e0db9345c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e46c5e79-97ce-931e-9704-564fa35a4d99")
public static final String FIELDNAME_ReportColumnSet_Description="e46c5e79-97ce-931e-9704-564fa35a4d99";

@XendraTrl(Identifier="3d0af363-ee01-51a7-8056-d2ab0893622f")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d0af363-ee01-51a7-8056-d2ab0893622f",
Synchronized="2017-08-05 16:55:43.0")
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
@XendraTrl(Identifier="3307e86a-9777-404a-a8f0-2081fecbaf84")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3307e86a-9777-404a-a8f0-2081fecbaf84",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="0493aba0-a7bd-52d2-1b3d-e65d4aca0c36")
public static String es_PE_FIELD_ReportColumnSet_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="0493aba0-a7bd-52d2-1b3d-e65d4aca0c36")
public static String es_PE_FIELD_ReportColumnSet_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="0493aba0-a7bd-52d2-1b3d-e65d4aca0c36")
public static String es_PE_FIELD_ReportColumnSet_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="14c45403-38aa-e2ce-565d-a91e0db9345c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0493aba0-a7bd-52d2-1b3d-e65d4aca0c36")
public static final String FIELDNAME_ReportColumnSet_Name="0493aba0-a7bd-52d2-1b3d-e65d4aca0c36";

@XendraTrl(Identifier="c093b3f4-3dae-7ceb-ecbf-a81194ac42bf")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c093b3f4-3dae-7ceb-ecbf-a81194ac42bf",
Synchronized="2017-08-05 16:55:43.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Report Column Set.
@param PA_ReportColumnSet_ID Collection of Columns for Report */
public void setPA_ReportColumnSet_ID (int PA_ReportColumnSet_ID)
{
if (PA_ReportColumnSet_ID < 1) throw new IllegalArgumentException ("PA_ReportColumnSet_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_PA_ReportColumnSet_ID, Integer.valueOf(PA_ReportColumnSet_ID));
}
/** Get Report Column Set.
@return Collection of Columns for Report */
public int getPA_ReportColumnSet_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_PA_ReportColumnSet_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2ee58b2f-3793-a3f4-5082-faba123df331")
public static String es_PE_FIELD_ReportColumnSet_ReportColumnSet_Description="Colección de columnas para Informe";

@XendraTrl(Identifier="2ee58b2f-3793-a3f4-5082-faba123df331")
public static String es_PE_FIELD_ReportColumnSet_ReportColumnSet_Help="El conjunto de columnas del Informe identifica las columnas usadas en un Informe.";

@XendraTrl(Identifier="2ee58b2f-3793-a3f4-5082-faba123df331")
public static String es_PE_FIELD_ReportColumnSet_ReportColumnSet_Name="Grupo de Columnas del Informe";

@XendraField(AD_Column_ID="PA_ReportColumnSet_ID",IsCentrallyMaintained=true,
AD_Tab_ID="14c45403-38aa-e2ce-565d-a91e0db9345c",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ee58b2f-3793-a3f4-5082-faba123df331")
public static final String FIELDNAME_ReportColumnSet_ReportColumnSet="2ee58b2f-3793-a3f4-5082-faba123df331";
/** Column name PA_ReportColumnSet_ID */
public static final String COLUMNNAME_PA_ReportColumnSet_ID = "PA_ReportColumnSet_ID";
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

@XendraTrl(Identifier="3cca83da-b8a7-77ca-8015-32cc3c22bd1c")
public static String es_PE_FIELD_ReportColumnSet_ProcessNow_Description="Copiar columnas de un reporte desde otro conjunto de columnas";

@XendraTrl(Identifier="3cca83da-b8a7-77ca-8015-32cc3c22bd1c")
public static String es_PE_FIELD_ReportColumnSet_ProcessNow_Help="Copiar columnas al final de éste conjunto de columnas";

@XendraTrl(Identifier="3cca83da-b8a7-77ca-8015-32cc3c22bd1c")
public static String es_PE_FIELD_ReportColumnSet_ProcessNow_Name="Copiar Columnas";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="14c45403-38aa-e2ce-565d-a91e0db9345c",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3cca83da-b8a7-77ca-8015-32cc3c22bd1c")
public static final String FIELDNAME_ReportColumnSet_ProcessNow="3cca83da-b8a7-77ca-8015-32cc3c22bd1c";

@XendraTrl(Identifier="456d5332-0d1b-b3b6-d866-594182f8c31b")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="446ef822-9c87-8b07-0125-162a8c405fa2",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="456d5332-0d1b-b3b6-d866-594182f8c31b",Synchronized="2017-08-05 16:55:43.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
