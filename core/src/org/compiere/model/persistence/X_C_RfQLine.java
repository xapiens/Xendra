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
/** Generated Model for C_RfQLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQLine_ID id
@param trxName transaction
*/
public X_C_RfQLine (Properties ctx, int C_RfQLine_ID, String trxName)
{
super (ctx, C_RfQLine_ID, trxName);
/** if (C_RfQLine_ID == 0)
{
setC_RfQ_ID (0);
setC_RfQLine_ID (0);
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_RfQLine WHERE C_RfQ_ID=@C_RfQ_ID@
setM_AttributeSetInstance_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=676 */
public static int Table_ID=MTable.getTable_ID("C_RfQLine");

@XendraTrl(Identifier="f81119bd-c043-13f4-d180-04ce09a2f600")
public static String es_PE_TAB_Line_Description="Ìtem RfQ ";

@XendraTrl(Identifier="f81119bd-c043-13f4-d180-04ce09a2f600")
public static String es_PE_TAB_Line_Help="Solicitud para el Ìtem de cita";

@XendraTrl(Identifier="f81119bd-c043-13f4-d180-04ce09a2f600")
public static String es_PE_TAB_Line_Name="Línea";
@XendraTab(Name="Line",Description="RfQ Line",
Help="Request for Quotation Line",AD_Window_ID="5489b4f6-e5c1-38be-86b2-ee5f7e420113",SeqNo=20,
TabLevel=1,IsSingleRow=true,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f81119bd-c043-13f4-d180-04ce09a2f600",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Line="f81119bd-c043-13f4-d180-04ce09a2f600";

@XendraTrl(Identifier="83c80c72-2311-a611-d4bf-7180d1b038bb")
public static String es_PE_TABLE_C_RfQLine_Name="Línea SPC (RfQ)";

@XendraTable(Name="RfQ Line",AD_Package_ID="98af94a4-a4cd-bdc0-5651-5880caf79899",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Request for Quotation Line",
Help="",TableName="C_RfQLine",AccessLevel="1",AD_Window_ID="5489b4f6-e5c1-38be-86b2-ee5f7e420113",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="83c80c72-2311-a611-d4bf-7180d1b038bb",Synchronized="2020-03-03 21:37:37.0")
/** TableName=C_RfQLine */
public static final String Table_Name="C_RfQLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQLine");

protected BigDecimal accessLevel = BigDecimal.valueOf(1);
/** AccessLevel
@return 1 - Org 
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
    Table_ID = MTable.getTable_ID("C_RfQLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQLine[").append(get_ID()).append("]");
return sb.toString();
}
/** Set RfQ.
@param C_RfQ_ID Request for Quotation */
public void setC_RfQ_ID (int C_RfQ_ID)
{
if (C_RfQ_ID < 1) throw new IllegalArgumentException ("C_RfQ_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQ_ID, Integer.valueOf(C_RfQ_ID));
}
/** Get RfQ.
@return Request for Quotation */
public int getC_RfQ_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQ_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_RfQ_ID()));
}

@XendraTrl(Identifier="8d89c8f6-bffd-034c-47ad-780a6511ee03")
public static String es_PE_FIELD_Line_RfQ_Name="Solicitud de Cotización";

@XendraTrl(Identifier="8d89c8f6-bffd-034c-47ad-780a6511ee03")
public static String es_PE_FIELD_Line_RfQ_Description="Solicitud de cita";

@XendraTrl(Identifier="8d89c8f6-bffd-034c-47ad-780a6511ee03")
public static String es_PE_FIELD_Line_RfQ_Help="Solicitud de cita para ser enviada a los proveedores de un RfQ asunto. Despues de seleccionar el proveedor, opcionalmente crea las ordenes de venta ó cotización para el cliente así como la orden de compra para proveedor (s)";

@XendraField(AD_Column_ID="C_RfQ_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8d89c8f6-bffd-034c-47ad-780a6511ee03")
public static final String FIELDNAME_Line_RfQ="8d89c8f6-bffd-034c-47ad-780a6511ee03";

@XendraTrl(Identifier="c1924db1-9ccd-2da9-d8f2-d8f4cd572898")
public static String es_PE_COLUMN_C_RfQ_ID_Name="SPC (RfQ)";

@XendraColumn(AD_Element_ID="8b6564e2-4b5a-7abd-5fdd-c2ab5ad134a1",ColumnName="C_RfQ_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c1924db1-9ccd-2da9-d8f2-d8f4cd572898",
Synchronized="2019-08-30 22:22:14.0")
/** Column name C_RfQ_ID */
public static final String COLUMNNAME_C_RfQ_ID = "C_RfQ_ID";
/** Set RfQ Line.
@param C_RfQLine_ID Request for Quotation Line */
public void setC_RfQLine_ID (int C_RfQLine_ID)
{
if (C_RfQLine_ID < 1) throw new IllegalArgumentException ("C_RfQLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQLine_ID, Integer.valueOf(C_RfQLine_ID));
}
/** Get RfQ Line.
@return Request for Quotation Line */
public int getC_RfQLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="bcce7ddf-bce1-f4dc-88f1-d770a4e56d3f")
public static String es_PE_FIELD_Line_RfQLine_Name="Item SPC (RfQ)";

@XendraTrl(Identifier="bcce7ddf-bce1-f4dc-88f1-d770a4e56d3f")
public static String es_PE_FIELD_Line_RfQLine_Description="Item SPC (RfQ)";

@XendraTrl(Identifier="bcce7ddf-bce1-f4dc-88f1-d770a4e56d3f")
public static String es_PE_FIELD_Line_RfQLine_Help="Pedido para el Item de la cita.";

@XendraField(AD_Column_ID="C_RfQLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bcce7ddf-bce1-f4dc-88f1-d770a4e56d3f")
public static final String FIELDNAME_Line_RfQLine="bcce7ddf-bce1-f4dc-88f1-d770a4e56d3f";
/** Column name C_RfQLine_ID */
public static final String COLUMNNAME_C_RfQLine_ID = "C_RfQLine_ID";
/** Set Work Complete.
@param DateWorkComplete Date when work is (planned to be) complete */
public void setDateWorkComplete (Timestamp DateWorkComplete)
{
set_Value (COLUMNNAME_DateWorkComplete, DateWorkComplete);
}
/** Get Work Complete.
@return Date when work is (planned to be) complete */
public Timestamp getDateWorkComplete() 
{
return (Timestamp)get_Value(COLUMNNAME_DateWorkComplete);
}

@XendraTrl(Identifier="629193d0-8149-1ec0-7c95-60ca80a12dab")
public static String es_PE_FIELD_Line_WorkComplete_Name="Trabajo Completo";

@XendraTrl(Identifier="629193d0-8149-1ec0-7c95-60ca80a12dab")
public static String es_PE_FIELD_Line_WorkComplete_Description="Fecha cuando es el trabajo (planeado) termina";

@XendraField(AD_Column_ID="DateWorkComplete",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="629193d0-8149-1ec0-7c95-60ca80a12dab")
public static final String FIELDNAME_Line_WorkComplete="629193d0-8149-1ec0-7c95-60ca80a12dab";

@XendraTrl(Identifier="500fbe38-4832-c21a-4373-bf75405389ba")
public static String es_PE_COLUMN_DateWorkComplete_Name="Trabajo Completo";

@XendraColumn(AD_Element_ID="079fae2c-844c-a019-755f-7222cea008ac",ColumnName="DateWorkComplete",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="500fbe38-4832-c21a-4373-bf75405389ba",
Synchronized="2019-08-30 22:22:14.0")
/** Column name DateWorkComplete */
public static final String COLUMNNAME_DateWorkComplete = "DateWorkComplete";
/** Set Work Start.
@param DateWorkStart Date when work is (planned to be) started */
public void setDateWorkStart (Timestamp DateWorkStart)
{
set_Value (COLUMNNAME_DateWorkStart, DateWorkStart);
}
/** Get Work Start.
@return Date when work is (planned to be) started */
public Timestamp getDateWorkStart() 
{
return (Timestamp)get_Value(COLUMNNAME_DateWorkStart);
}

@XendraTrl(Identifier="29b466f3-b42e-3edf-85c7-2826464117e9")
public static String es_PE_FIELD_Line_WorkStart_Name="Inicia el Trabajo";

@XendraTrl(Identifier="29b466f3-b42e-3edf-85c7-2826464117e9")
public static String es_PE_FIELD_Line_WorkStart_Description="Fecha cuando el trabajo (planeado para) se comienza.";

@XendraField(AD_Column_ID="DateWorkStart",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29b466f3-b42e-3edf-85c7-2826464117e9")
public static final String FIELDNAME_Line_WorkStart="29b466f3-b42e-3edf-85c7-2826464117e9";

@XendraTrl(Identifier="4134a0df-e367-6e49-a6cf-c94e640000d2")
public static String es_PE_COLUMN_DateWorkStart_Name="Inicia el Trabajo";

@XendraColumn(AD_Element_ID="eacd3b09-4768-e18d-b651-2ec68cc53f56",ColumnName="DateWorkStart",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4134a0df-e367-6e49-a6cf-c94e640000d2",
Synchronized="2019-08-30 22:22:14.0")
/** Column name DateWorkStart */
public static final String COLUMNNAME_DateWorkStart = "DateWorkStart";
/** Set Delivery Days.
@param DeliveryDays Number of Days (planned) until Delivery */
public void setDeliveryDays (int DeliveryDays)
{
set_Value (COLUMNNAME_DeliveryDays, Integer.valueOf(DeliveryDays));
}
/** Get Delivery Days.
@return Number of Days (planned) until Delivery */
public int getDeliveryDays() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_DeliveryDays);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="67c2f909-d705-1e5b-5757-0747503649e2")
public static String es_PE_FIELD_Line_DeliveryDays_Name="Días de Entrega";

@XendraTrl(Identifier="67c2f909-d705-1e5b-5757-0747503649e2")
public static String es_PE_FIELD_Line_DeliveryDays_Description="Numero de dias (planeado) hasta la entega";

@XendraField(AD_Column_ID="DeliveryDays",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67c2f909-d705-1e5b-5757-0747503649e2")
public static final String FIELDNAME_Line_DeliveryDays="67c2f909-d705-1e5b-5757-0747503649e2";

@XendraTrl(Identifier="2c9feaf1-08c6-3f26-1620-bed959eeb0d8")
public static String es_PE_COLUMN_DeliveryDays_Name="Días de Entrega";

@XendraColumn(AD_Element_ID="be6b99df-af16-3107-0958-5fe3af220ffc",ColumnName="DeliveryDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c9feaf1-08c6-3f26-1620-bed959eeb0d8",
Synchronized="2019-08-30 22:22:14.0")
/** Column name DeliveryDays */
public static final String COLUMNNAME_DeliveryDays = "DeliveryDays";
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

@XendraTrl(Identifier="69d06d49-fded-beac-bfff-5345886939b0")
public static String es_PE_FIELD_Line_Description_Name="Observación";

@XendraTrl(Identifier="69d06d49-fded-beac-bfff-5345886939b0")
public static String es_PE_FIELD_Line_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="69d06d49-fded-beac-bfff-5345886939b0")
public static String es_PE_FIELD_Line_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="69d06d49-fded-beac-bfff-5345886939b0")
public static final String FIELDNAME_Line_Description="69d06d49-fded-beac-bfff-5345886939b0";

@XendraTrl(Identifier="2edff840-e45e-c7bf-5bbd-994bd2b52438")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2edff840-e45e-c7bf-5bbd-994bd2b52438",
Synchronized="2019-08-30 22:22:14.0")
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

@XendraTrl(Identifier="55949182-418e-138e-7f29-e7fe9532bd43")
public static String es_PE_FIELD_Line_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="55949182-418e-138e-7f29-e7fe9532bd43")
public static String es_PE_FIELD_Line_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="55949182-418e-138e-7f29-e7fe9532bd43")
public static String es_PE_FIELD_Line_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55949182-418e-138e-7f29-e7fe9532bd43")
public static final String FIELDNAME_Line_CommentHelp="55949182-418e-138e-7f29-e7fe9532bd43";

@XendraTrl(Identifier="af95afed-6918-5de0-4ff3-ecf3c67b3cb1")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="af95afed-6918-5de0-4ff3-ecf3c67b3cb1",
Synchronized="2019-08-30 22:22:14.0")
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
@XendraTrl(Identifier="48657af4-7687-4963-8196-97e3b92bedf9")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="48657af4-7687-4963-8196-97e3b92bedf9",
Synchronized="2019-08-30 22:22:14.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Line No.
@param Line Unique line for this document */
public void setLine (int Line)
{
set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
}
/** Get Line No.
@return Unique line for this document */
public int getLine() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Line);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1e5b1f4e-aa69-0af9-4eaf-432ee7ce6a74")
public static String es_PE_FIELD_Line_LineNo_Name="No. Línea";

@XendraTrl(Identifier="1e5b1f4e-aa69-0af9-4eaf-432ee7ce6a74")
public static String es_PE_FIELD_Line_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="1e5b1f4e-aa69-0af9-4eaf-432ee7ce6a74")
public static String es_PE_FIELD_Line_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraField(AD_Column_ID="Line",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=50,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1e5b1f4e-aa69-0af9-4eaf-432ee7ce6a74")
public static final String FIELDNAME_Line_LineNo="1e5b1f4e-aa69-0af9-4eaf-432ee7ce6a74";

@XendraTrl(Identifier="7ec38e4a-2883-742a-f4a4-07a0d19357cb")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_RfQLine WHERE C_RfQ_ID=@C_RfQ_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ec38e4a-2883-742a-f4a4-07a0d19357cb",
Synchronized="2019-08-30 22:22:14.0")
/** Column name Line */
public static final String COLUMNNAME_Line = "Line";
/** Set Attribute Set Instance.
@param M_AttributeSetInstance_ID Product Attribute Set Instance */
public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
{
if (M_AttributeSetInstance_ID < 0) throw new IllegalArgumentException ("M_AttributeSetInstance_ID is mandatory.");
set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
}
/** Get Attribute Set Instance.
@return Product Attribute Set Instance */
public int getM_AttributeSetInstance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="214525f0-3ad9-7aad-ad18-c8d4852dc499")
public static String es_PE_FIELD_Line_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraTrl(Identifier="214525f0-3ad9-7aad-ad18-c8d4852dc499")
public static String es_PE_FIELD_Line_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="214525f0-3ad9-7aad-ad18-c8d4852dc499")
public static String es_PE_FIELD_Line_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="214525f0-3ad9-7aad-ad18-c8d4852dc499")
public static final String FIELDNAME_Line_AttributeSetInstance="214525f0-3ad9-7aad-ad18-c8d4852dc499";

@XendraTrl(Identifier="bde31360-cf2c-21cb-c1c1-160b2386c532")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bde31360-cf2c-21cb-c1c1-160b2386c532",Synchronized="2019-08-30 22:22:14.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
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

@XendraTrl(Identifier="9dd81589-f132-f108-6260-a868b804359c")
public static String es_PE_FIELD_Line_Product_Name="Producto";

@XendraTrl(Identifier="9dd81589-f132-f108-6260-a868b804359c")
public static String es_PE_FIELD_Line_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="9dd81589-f132-f108-6260-a868b804359c")
public static String es_PE_FIELD_Line_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f81119bd-c043-13f4-d180-04ce09a2f600",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9dd81589-f132-f108-6260-a868b804359c")
public static final String FIELDNAME_Line_Product="9dd81589-f132-f108-6260-a868b804359c";

@XendraTrl(Identifier="999e2eb9-ed27-31dd-6f71-45ec090a4204")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="999e2eb9-ed27-31dd-6f71-45ec090a4204",Synchronized="2019-08-30 22:22:14.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
}
