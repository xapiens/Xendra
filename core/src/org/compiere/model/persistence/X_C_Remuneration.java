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
/** Generated Model for C_Remuneration
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_Remuneration extends PO
{
/** Standard Constructor
@param ctx context
@param C_Remuneration_ID id
@param trxName transaction
*/
public X_C_Remuneration (Properties ctx, int C_Remuneration_ID, String trxName)
{
super (ctx, C_Remuneration_ID, trxName);
/** if (C_Remuneration_ID == 0)
{
setC_Remuneration_ID (0);
setGrossRAmt (Env.ZERO);	
// 0
setGrossRCost (Env.ZERO);
setName (null);
setOvertimeAmt (Env.ZERO);	
// 0
setOvertimeCost (Env.ZERO);
setRemunerationType (null);
setStandardHours (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_Remuneration (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=792 */
public static int Table_ID=MTable.getTable_ID("C_Remuneration");

@XendraTrl(Identifier="7e009222-fc59-3f4d-cb22-8e1d5cc66a04")
public static String es_PE_TAB_Remuneration_Description="Mantener remuneración de niveles";

@XendraTrl(Identifier="7e009222-fc59-3f4d-cb22-8e1d5cc66a04")
public static String es_PE_TAB_Remuneration_Name="Remuneracion";
@XendraTab(Name="Remuneration",
Description="Maintain Remuneration Levels",Help="",
AD_Window_ID="5430bec6-fb8a-fb45-67e1-794d63718e0c",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Remuneration="7e009222-fc59-3f4d-cb22-8e1d5cc66a04";

@XendraTrl(Identifier="ff8d0cc9-cde7-7676-4b33-aae63d0645cd")
public static String es_PE_TABLE_C_Remuneration_Name="Remuneración";

@XendraTable(Name="Remuneration",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="C_Remuneration",AccessLevel="2",AD_Window_ID="5430bec6-fb8a-fb45-67e1-794d63718e0c",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="ff8d0cc9-cde7-7676-4b33-aae63d0645cd",Synchronized="2020-03-03 21:37:35.0")
/** TableName=C_Remuneration */
public static final String Table_Name="C_Remuneration";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_Remuneration");

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
    Table_ID = MTable.getTable_ID("C_Remuneration");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Remuneration[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Remuneration.
@param C_Remuneration_ID Wage or Salary */
public void setC_Remuneration_ID (int C_Remuneration_ID)
{
if (C_Remuneration_ID < 1) throw new IllegalArgumentException ("C_Remuneration_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Remuneration_ID, Integer.valueOf(C_Remuneration_ID));
}
/** Get Remuneration.
@return Wage or Salary */
public int getC_Remuneration_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Remuneration_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="243b8713-1445-1be5-fcae-f49e43fd095b")
public static String es_PE_FIELD_Remuneration_Remuneration_Name="Remuneración";

@XendraTrl(Identifier="243b8713-1445-1be5-fcae-f49e43fd095b")
public static String es_PE_FIELD_Remuneration_Remuneration_Description="Salario ó sueldo.";

@XendraField(AD_Column_ID="C_Remuneration_ID",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="243b8713-1445-1be5-fcae-f49e43fd095b")
public static final String FIELDNAME_Remuneration_Remuneration="243b8713-1445-1be5-fcae-f49e43fd095b";
/** Column name C_Remuneration_ID */
public static final String COLUMNNAME_C_Remuneration_ID = "C_Remuneration_ID";
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

@XendraTrl(Identifier="b715c882-f973-8c60-4915-7c2b2aabbfb6")
public static String es_PE_FIELD_Remuneration_Description_Name="Observación";

@XendraTrl(Identifier="b715c882-f973-8c60-4915-7c2b2aabbfb6")
public static String es_PE_FIELD_Remuneration_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="b715c882-f973-8c60-4915-7c2b2aabbfb6")
public static String es_PE_FIELD_Remuneration_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b715c882-f973-8c60-4915-7c2b2aabbfb6")
public static final String FIELDNAME_Remuneration_Description="b715c882-f973-8c60-4915-7c2b2aabbfb6";

@XendraTrl(Identifier="1d5c3ea5-a7fc-8f53-1dce-109d930a6209")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d5c3ea5-a7fc-8f53-1dce-109d930a6209",
Synchronized="2019-08-30 22:22:12.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Gross Amount.
@param GrossRAmt Gross Remuneration Amount */
public void setGrossRAmt (BigDecimal GrossRAmt)
{
if (GrossRAmt == null) throw new IllegalArgumentException ("GrossRAmt is mandatory.");
set_Value (COLUMNNAME_GrossRAmt, GrossRAmt);
}
/** Get Gross Amount.
@return Gross Remuneration Amount */
public BigDecimal getGrossRAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrossRAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="2a4c087f-5441-cf7d-3dc7-c43348d76e08")
public static String es_PE_FIELD_Remuneration_GrossAmount_Name="Importe Total";

@XendraTrl(Identifier="2a4c087f-5441-cf7d-3dc7-c43348d76e08")
public static String es_PE_FIELD_Remuneration_GrossAmount_Description="Cantidad total de la renumeración.";

@XendraTrl(Identifier="2a4c087f-5441-cf7d-3dc7-c43348d76e08")
public static String es_PE_FIELD_Remuneration_GrossAmount_Help="Cantidad total del sueldo ó del salario (sin gastos indirectos del tiempo suplementario, de las ventajas y del patrón)";

@XendraField(AD_Column_ID="GrossRAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a4c087f-5441-cf7d-3dc7-c43348d76e08")
public static final String FIELDNAME_Remuneration_GrossAmount="2a4c087f-5441-cf7d-3dc7-c43348d76e08";

@XendraTrl(Identifier="fb57e27a-d674-4feb-a837-c0b9cdf44c73")
public static String es_PE_COLUMN_GrossRAmt_Name="Importe Total";

@XendraColumn(AD_Element_ID="fe31dc7a-9e3a-81a8-1d81-2d21ae3ade8f",ColumnName="GrossRAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="fb57e27a-d674-4feb-a837-c0b9cdf44c73",
Synchronized="2019-08-30 22:22:12.0")
/** Column name GrossRAmt */
public static final String COLUMNNAME_GrossRAmt = "GrossRAmt";
/** Set Gross Cost.
@param GrossRCost Gross Remuneration Costs */
public void setGrossRCost (BigDecimal GrossRCost)
{
if (GrossRCost == null) throw new IllegalArgumentException ("GrossRCost is mandatory.");
set_Value (COLUMNNAME_GrossRCost, GrossRCost);
}
/** Get Gross Cost.
@return Gross Remuneration Costs */
public BigDecimal getGrossRCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrossRCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="c0247c5f-03db-ffa4-87d0-045805d505ad")
public static String es_PE_FIELD_Remuneration_GrossCost_Name="Importe de Costo";

@XendraTrl(Identifier="c0247c5f-03db-ffa4-87d0-045805d505ad")
public static String es_PE_FIELD_Remuneration_GrossCost_Description="Importe de Costo";

@XendraTrl(Identifier="c0247c5f-03db-ffa4-87d0-045805d505ad")
public static String es_PE_FIELD_Remuneration_GrossCost_Help="Costos elevados del sueldo ó salario (sin tiempo suplementario, con gastos indirectos de las ventajas y el patrón)";

@XendraField(AD_Column_ID="GrossRCost",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c0247c5f-03db-ffa4-87d0-045805d505ad")
public static final String FIELDNAME_Remuneration_GrossCost="c0247c5f-03db-ffa4-87d0-045805d505ad";

@XendraTrl(Identifier="0b5c7c0b-28ee-e088-d93c-cd9d7b717378")
public static String es_PE_COLUMN_GrossRCost_Name="Importe de Costo";

@XendraColumn(AD_Element_ID="9cd8821f-f34d-da27-a043-7474b5642c00",ColumnName="GrossRCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0b5c7c0b-28ee-e088-d93c-cd9d7b717378",
Synchronized="2019-08-30 22:22:12.0")
/** Column name GrossRCost */
public static final String COLUMNNAME_GrossRCost = "GrossRCost";
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

@XendraTrl(Identifier="8380efaa-942b-2128-1970-2f4189a1a9b2")
public static String es_PE_FIELD_Remuneration_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="8380efaa-942b-2128-1970-2f4189a1a9b2")
public static String es_PE_FIELD_Remuneration_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="8380efaa-942b-2128-1970-2f4189a1a9b2")
public static String es_PE_FIELD_Remuneration_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8380efaa-942b-2128-1970-2f4189a1a9b2")
public static final String FIELDNAME_Remuneration_CommentHelp="8380efaa-942b-2128-1970-2f4189a1a9b2";

@XendraTrl(Identifier="145d3f56-6787-94d0-b117-988c1fdb82a5")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="145d3f56-6787-94d0-b117-988c1fdb82a5",
Synchronized="2019-08-30 22:22:12.0")
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
@XendraTrl(Identifier="e010e705-2540-4665-9e5d-e03736f4188a")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e010e705-2540-4665-9e5d-e03736f4188a",
Synchronized="2019-08-30 22:22:12.0")
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

@XendraTrl(Identifier="89583786-0dca-8ed6-1681-2fe88ca86d8e")
public static String es_PE_FIELD_Remuneration_Name_Name="Nombre";

@XendraTrl(Identifier="89583786-0dca-8ed6-1681-2fe88ca86d8e")
public static String es_PE_FIELD_Remuneration_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="89583786-0dca-8ed6-1681-2fe88ca86d8e")
public static String es_PE_FIELD_Remuneration_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=30,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="89583786-0dca-8ed6-1681-2fe88ca86d8e")
public static final String FIELDNAME_Remuneration_Name="89583786-0dca-8ed6-1681-2fe88ca86d8e";

@XendraTrl(Identifier="caa8d4db-7fae-6849-76ab-5d323a5238ff")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="caa8d4db-7fae-6849-76ab-5d323a5238ff",
Synchronized="2019-08-30 22:22:12.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Overtime Amount.
@param OvertimeAmt Hourly Overtime Rate */
public void setOvertimeAmt (BigDecimal OvertimeAmt)
{
if (OvertimeAmt == null) throw new IllegalArgumentException ("OvertimeAmt is mandatory.");
set_Value (COLUMNNAME_OvertimeAmt, OvertimeAmt);
}
/** Get Overtime Amount.
@return Hourly Overtime Rate */
public BigDecimal getOvertimeAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OvertimeAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="094d02d7-05d5-e242-155f-f212fc2ed328")
public static String es_PE_FIELD_Remuneration_OvertimeAmount_Name="Importe de Sobre tiempo";

@XendraTrl(Identifier="094d02d7-05d5-e242-155f-f212fc2ed328")
public static String es_PE_FIELD_Remuneration_OvertimeAmount_Description="Tarifa del suplemento cada hora";

@XendraTrl(Identifier="094d02d7-05d5-e242-155f-f212fc2ed328")
public static String es_PE_FIELD_Remuneration_OvertimeAmount_Help="Cantidad de cada hora sin gastos indirectos de las ventajas y del patrón.";

@XendraField(AD_Column_ID="OvertimeAmt",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="094d02d7-05d5-e242-155f-f212fc2ed328")
public static final String FIELDNAME_Remuneration_OvertimeAmount="094d02d7-05d5-e242-155f-f212fc2ed328";

@XendraTrl(Identifier="3af2180e-b5bf-eabd-ddbe-603d0a896914")
public static String es_PE_COLUMN_OvertimeAmt_Name="Importe de Sobre tiempo";

@XendraColumn(AD_Element_ID="f0c23cfb-fe91-67d5-b2ba-94fd580b1f88",ColumnName="OvertimeAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3af2180e-b5bf-eabd-ddbe-603d0a896914",
Synchronized="2019-08-30 22:22:12.0")
/** Column name OvertimeAmt */
public static final String COLUMNNAME_OvertimeAmt = "OvertimeAmt";
/** Set Overtime Cost.
@param OvertimeCost Hourly Overtime Cost */
public void setOvertimeCost (BigDecimal OvertimeCost)
{
if (OvertimeCost == null) throw new IllegalArgumentException ("OvertimeCost is mandatory.");
set_Value (COLUMNNAME_OvertimeCost, OvertimeCost);
}
/** Get Overtime Cost.
@return Hourly Overtime Cost */
public BigDecimal getOvertimeCost() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OvertimeCost);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d52ff27f-e22a-8f0f-0274-f1019e83bbd1")
public static String es_PE_FIELD_Remuneration_OvertimeCost_Name="Costo de Sobretiempo";

@XendraTrl(Identifier="d52ff27f-e22a-8f0f-0274-f1019e83bbd1")
public static String es_PE_FIELD_Remuneration_OvertimeCost_Description="Costo de cada hora del tiempo suplementario";

@XendraTrl(Identifier="d52ff27f-e22a-8f0f-0274-f1019e83bbd1")
public static String es_PE_FIELD_Remuneration_OvertimeCost_Help="Cantidad de cada hora con gastos indirectos de las ventajas y del patrón";

@XendraField(AD_Column_ID="OvertimeCost",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d52ff27f-e22a-8f0f-0274-f1019e83bbd1")
public static final String FIELDNAME_Remuneration_OvertimeCost="d52ff27f-e22a-8f0f-0274-f1019e83bbd1";

@XendraTrl(Identifier="69fe52f0-635d-7918-2a88-112578bfd5cc")
public static String es_PE_COLUMN_OvertimeCost_Name="Costo de Sobretiempo";

@XendraColumn(AD_Element_ID="4262e677-f797-c790-373f-b3b0d43afab8",ColumnName="OvertimeCost",
AD_Reference_ID=37,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="69fe52f0-635d-7918-2a88-112578bfd5cc",
Synchronized="2019-08-30 22:22:12.0")
/** Column name OvertimeCost */
public static final String COLUMNNAME_OvertimeCost = "OvertimeCost";
/** Set Remuneration Type.
@param RemunerationType Type of Remuneration */
public void setRemunerationType (String RemunerationType)
{
if (RemunerationType.length() > 1)
{
log.warning("Length > 1 - truncated");
RemunerationType = RemunerationType.substring(0,0);
}
set_Value (COLUMNNAME_RemunerationType, RemunerationType);
}
/** Get Remuneration Type.
@return Type of Remuneration */
public String getRemunerationType() 
{
return (String)get_Value(COLUMNNAME_RemunerationType);
}

@XendraTrl(Identifier="a2de15c5-4c3e-958c-0eda-afe2a4ed1dc2")
public static String es_PE_FIELD_Remuneration_RemunerationType_Name="Tipo de Remuneración";

@XendraTrl(Identifier="a2de15c5-4c3e-958c-0eda-afe2a4ed1dc2")
public static String es_PE_FIELD_Remuneration_RemunerationType_Description="Tipo de Remuneración";

@XendraField(AD_Column_ID="RemunerationType",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a2de15c5-4c3e-958c-0eda-afe2a4ed1dc2")
public static final String FIELDNAME_Remuneration_RemunerationType="a2de15c5-4c3e-958c-0eda-afe2a4ed1dc2";

@XendraTrl(Identifier="006d83a2-69c6-1792-ede7-f9a229e96765")
public static String es_PE_COLUMN_RemunerationType_Name="Tipo de Remuneración";

@XendraColumn(AD_Element_ID="50bc4c49-f237-ba38-3f35-abe38ef3228a",ColumnName="RemunerationType",
AD_Reference_ID=17,AD_Reference_Value_ID="6611551e-81c4-53c9-8768-c3bfde62fcf1",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="006d83a2-69c6-1792-ede7-f9a229e96765",Synchronized="2019-08-30 22:22:12.0")
/** Column name RemunerationType */
public static final String COLUMNNAME_RemunerationType = "RemunerationType";
/** Set Standard Hours.
@param StandardHours Standard Work Hours based on Remuneration Type */
public void setStandardHours (int StandardHours)
{
set_Value (COLUMNNAME_StandardHours, Integer.valueOf(StandardHours));
}
/** Get Standard Hours.
@return Standard Work Hours based on Remuneration Type */
public int getStandardHours() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_StandardHours);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="05f641aa-9c50-9945-d19b-8285f682bd76")
public static String es_PE_FIELD_Remuneration_StandardHours_Name="Horas Estandar";

@XendraTrl(Identifier="05f641aa-9c50-9945-d19b-8285f682bd76")
public static String es_PE_FIELD_Remuneration_StandardHours_Description="Horas estándares de trabajo basadas en tipo de la remuneración.";

@XendraTrl(Identifier="05f641aa-9c50-9945-d19b-8285f682bd76")
public static String es_PE_FIELD_Remuneration_StandardHours_Help="Número de horas por el tipo de la remuneración (ej. 8 horas diarias, 40 horas semanales, etc.) para determinarse cuando comienza en horas extras.";

@XendraField(AD_Column_ID="StandardHours",IsCentrallyMaintained=true,
AD_Tab_ID="7e009222-fc59-3f4d-cb22-8e1d5cc66a04",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="05f641aa-9c50-9945-d19b-8285f682bd76")
public static final String FIELDNAME_Remuneration_StandardHours="05f641aa-9c50-9945-d19b-8285f682bd76";

@XendraTrl(Identifier="d52506fa-1fca-541a-6e9e-83144a132b00")
public static String es_PE_COLUMN_StandardHours_Name="Horas Estandar";

@XendraColumn(AD_Element_ID="cd51f49c-c08f-e6e9-4bdf-b7b7efc8eb4b",ColumnName="StandardHours",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d52506fa-1fca-541a-6e9e-83144a132b00",
Synchronized="2019-08-30 22:22:12.0")
/** Column name StandardHours */
public static final String COLUMNNAME_StandardHours = "StandardHours";
}
