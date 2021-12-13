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
/** Generated Model for M_DistributionList
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_DistributionList extends PO
{
/** Standard Constructor
@param ctx context
@param M_DistributionList_ID id
@param trxName transaction
*/
public X_M_DistributionList (Properties ctx, int M_DistributionList_ID, String trxName)
{
super (ctx, M_DistributionList_ID, trxName);
/** if (M_DistributionList_ID == 0)
{
setM_DistributionList_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_DistributionList (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=666 */
public static int Table_ID=MTable.getTable_ID("M_DistributionList");

@XendraTrl(Identifier="61b8bec4-f938-2127-9632-aca1368da9c0")
public static String es_PE_TAB_DistributionList_Description="Las listas de distribución permiten para distribuir productos a una lista seleccionada de socios.";

@XendraTrl(Identifier="61b8bec4-f938-2127-9632-aca1368da9c0")
public static String es_PE_TAB_DistributionList_Help="La lista de distribución contiene socios de negocio y una cantidad ó un cociente de la distribución para crear órdenes";

@XendraTrl(Identifier="61b8bec4-f938-2127-9632-aca1368da9c0")
public static String es_PE_TAB_DistributionList_Name="Lista Distribución";

@XendraTab(Name="Distribution List",
Description="Distribution Lists allow to distribute products to a selected list of partners",
Help="Distribution list contain business partners and a distribution quantity or ratio for creating Orders",
AD_Window_ID="03fdd9ab-3028-a4cb-326c-022a2d5cadfe",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="61b8bec4-f938-2127-9632-aca1368da9c0",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_DistributionList="61b8bec4-f938-2127-9632-aca1368da9c0";

@XendraTrl(Identifier="0e408cd3-4810-13af-9d9f-49aa24eb78e8")
public static String es_PE_TABLE_M_DistributionList_Name="Lista de Distribución";

@XendraTable(Name="Distribution List",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",
Description="Distribution Lists allow to distribute products to a selected list of partners",
Help="",TableName="M_DistributionList",AccessLevel="3",
AD_Window_ID="03fdd9ab-3028-a4cb-326c-022a2d5cadfe",AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="0e408cd3-4810-13af-9d9f-49aa24eb78e8",
Synchronized="2020-03-03 21:38:21.0")
/** TableName=M_DistributionList */
public static final String Table_Name="M_DistributionList";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_DistributionList");

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
    Table_ID = MTable.getTable_ID("M_DistributionList");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_DistributionList[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="989ea697-dc25-b35a-3e9e-c1545a78eeb0")
public static String es_PE_FIELD_DistributionList_Description_Name="Observación";

@XendraTrl(Identifier="989ea697-dc25-b35a-3e9e-c1545a78eeb0")
public static String es_PE_FIELD_DistributionList_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="989ea697-dc25-b35a-3e9e-c1545a78eeb0")
public static String es_PE_FIELD_DistributionList_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="61b8bec4-f938-2127-9632-aca1368da9c0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="989ea697-dc25-b35a-3e9e-c1545a78eeb0")
public static final String FIELDNAME_DistributionList_Description="989ea697-dc25-b35a-3e9e-c1545a78eeb0";

@XendraTrl(Identifier="0dbd10ed-8ec2-5e35-650e-c2890bc710f9")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0dbd10ed-8ec2-5e35-650e-c2890bc710f9",
Synchronized="2019-08-30 22:23:03.0")
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

@XendraTrl(Identifier="55bada8d-423f-0362-acd1-788bc0919398")
public static String es_PE_FIELD_DistributionList_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="55bada8d-423f-0362-acd1-788bc0919398")
public static String es_PE_FIELD_DistributionList_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="55bada8d-423f-0362-acd1-788bc0919398")
public static String es_PE_FIELD_DistributionList_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="61b8bec4-f938-2127-9632-aca1368da9c0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55bada8d-423f-0362-acd1-788bc0919398")
public static final String FIELDNAME_DistributionList_CommentHelp="55bada8d-423f-0362-acd1-788bc0919398";

@XendraTrl(Identifier="a189a7d4-6524-20d5-4230-a958144b7422")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a189a7d4-6524-20d5-4230-a958144b7422",
Synchronized="2019-08-30 22:23:03.0")
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
@XendraTrl(Identifier="569e43f3-4982-44f9-ae39-026b3d2d744c")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="569e43f3-4982-44f9-ae39-026b3d2d744c",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Distribution List.
@param M_DistributionList_ID Distribution Lists allow to distribute products to a selected list of partners */
public void setM_DistributionList_ID (int M_DistributionList_ID)
{
if (M_DistributionList_ID < 1) throw new IllegalArgumentException ("M_DistributionList_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_DistributionList_ID, Integer.valueOf(M_DistributionList_ID));
}
/** Get Distribution List.
@return Distribution Lists allow to distribute products to a selected list of partners */
public int getM_DistributionList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_DistributionList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="214d66d9-f09f-031c-2543-e0a772b6b20a")
public static String es_PE_FIELD_DistributionList_DistributionList_Name="Lista de Distribución";

@XendraTrl(Identifier="214d66d9-f09f-031c-2543-e0a772b6b20a")
public static String es_PE_FIELD_DistributionList_DistributionList_Description="Las listas de distribución permiten para distribuir productos a una lista seleccionada de socios.";

@XendraTrl(Identifier="214d66d9-f09f-031c-2543-e0a772b6b20a")
public static String es_PE_FIELD_DistributionList_DistributionList_Help="La lista de distribución contiene socios de negocio y una cantidad ó un cociente de la distribución para crear órdenes.";

@XendraField(AD_Column_ID="M_DistributionList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="61b8bec4-f938-2127-9632-aca1368da9c0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="214d66d9-f09f-031c-2543-e0a772b6b20a")
public static final String FIELDNAME_DistributionList_DistributionList="214d66d9-f09f-031c-2543-e0a772b6b20a";
/** Column name M_DistributionList_ID */
public static final String COLUMNNAME_M_DistributionList_ID = "M_DistributionList_ID";
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

@XendraTrl(Identifier="107ecff7-fff5-a7da-8c28-63acf2d1a4ce")
public static String es_PE_FIELD_DistributionList_Name_Name="Nombre";

@XendraTrl(Identifier="107ecff7-fff5-a7da-8c28-63acf2d1a4ce")
public static String es_PE_FIELD_DistributionList_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="107ecff7-fff5-a7da-8c28-63acf2d1a4ce")
public static String es_PE_FIELD_DistributionList_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="61b8bec4-f938-2127-9632-aca1368da9c0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="107ecff7-fff5-a7da-8c28-63acf2d1a4ce")
public static final String FIELDNAME_DistributionList_Name="107ecff7-fff5-a7da-8c28-63acf2d1a4ce";

@XendraTrl(Identifier="19f26025-d662-2795-64bc-3cf04d7090dd")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="19f26025-d662-2795-64bc-3cf04d7090dd",
Synchronized="2019-08-30 22:23:03.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="37b4b3ca-708b-1854-cd20-769129b44a55")
public static String es_PE_FIELD_DistributionList_ProcessNow_Name="Crea Ordenes";

@XendraTrl(Identifier="37b4b3ca-708b-1854-cd20-769129b44a55")
public static String es_PE_FIELD_DistributionList_ProcessNow_Description="Cree las órdenes basadas en la línea de artículos de la lista de distribución";

@XendraTrl(Identifier="37b4b3ca-708b-1854-cd20-769129b44a55")
public static String es_PE_FIELD_DistributionList_ProcessNow_Help="Observe al hacer el redondeo, la cantidad total de orden(es) es probable ser más alto a la cantidad incorporada.";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="61b8bec4-f938-2127-9632-aca1368da9c0",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="37b4b3ca-708b-1854-cd20-769129b44a55")
public static final String FIELDNAME_DistributionList_ProcessNow="37b4b3ca-708b-1854-cd20-769129b44a55";

@XendraTrl(Identifier="2465f4ed-16d8-0bb9-7e65-fbc9cc0667b8")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="46e83f6f-4a63-888d-70e4-f0ee08ad5c98",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2465f4ed-16d8-0bb9-7e65-fbc9cc0667b8",Synchronized="2019-08-30 22:23:03.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Total Ratio.
@param RatioTotal Total of relative weight in a distribution */
public void setRatioTotal (BigDecimal RatioTotal)
{
set_Value (COLUMNNAME_RatioTotal, RatioTotal);
}
/** Get Total Ratio.
@return Total of relative weight in a distribution */
public BigDecimal getRatioTotal() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RatioTotal);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="7438769b-ed27-f185-fc06-ff6d9cac6ca3")
public static String es_PE_FIELD_DistributionList_TotalRatio_Name="Cociente total";

@XendraTrl(Identifier="7438769b-ed27-f185-fc06-ff6d9cac6ca3")
public static String es_PE_FIELD_DistributionList_TotalRatio_Help="El total de peso relativo de una distribución. Si el total de todos los cocientes es 100, es igual que por ciento.";

@XendraField(AD_Column_ID="RatioTotal",IsCentrallyMaintained=true,
AD_Tab_ID="61b8bec4-f938-2127-9632-aca1368da9c0",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7438769b-ed27-f185-fc06-ff6d9cac6ca3")
public static final String FIELDNAME_DistributionList_TotalRatio="7438769b-ed27-f185-fc06-ff6d9cac6ca3";

@XendraTrl(Identifier="b2e880ca-6ed0-be63-7d62-7354cd52b7a3")
public static String es_PE_COLUMN_RatioTotal_Name="Cociente total";

@XendraColumn(AD_Element_ID="513d0200-b915-1131-ef5a-20113576c53b",ColumnName="RatioTotal",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b2e880ca-6ed0-be63-7d62-7354cd52b7a3",
Synchronized="2019-08-30 22:23:03.0")
/** Column name RatioTotal */
public static final String COLUMNNAME_RatioTotal = "RatioTotal";
}
