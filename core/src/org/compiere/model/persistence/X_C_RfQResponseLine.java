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
/** Generated Model for C_RfQResponseLine
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_RfQResponseLine extends PO
{
/** Standard Constructor
@param ctx context
@param C_RfQResponseLine_ID id
@param trxName transaction
*/
public X_C_RfQResponseLine (Properties ctx, int C_RfQResponseLine_ID, String trxName)
{
super (ctx, C_RfQResponseLine_ID, trxName);
/** if (C_RfQResponseLine_ID == 0)
{
setC_RfQLine_ID (0);
setC_RfQResponse_ID (0);
setC_RfQResponseLine_ID (0);
setIsSelectedWinner (false);	
// N
setIsSelfService (false);	
// N
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_RfQResponseLine (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=673 */
public static int Table_ID=MTable.getTable_ID("C_RfQResponseLine");

@XendraTrl(Identifier="1327191c-15de-d841-6047-cab41117fb3f")
public static String es_PE_TAB_ResponseLine_Description="Ìtem de respuesta RfQ";

@XendraTrl(Identifier="1327191c-15de-d841-6047-cab41117fb3f")
public static String es_PE_TAB_ResponseLine_Name="Ítem Respuesta";

@XendraTrl(Identifier="1327191c-15de-d841-6047-cab41117fb3f")
public static String es_PE_TAB_ResponseLine_Help="Solicitud de la cita del Ìtem de la respuesta de un vendedor potencial";

@XendraTab(Name="Response Line",Description="RfQ Response Line",
Help="Request for Quotation Response Line from a potential Vendor",
AD_Window_ID="00321465-3813-5160-b116-f76e77af89f6",SeqNo=20,TabLevel=2,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1327191c-15de-d841-6047-cab41117fb3f",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_ResponseLine="1327191c-15de-d841-6047-cab41117fb3f";

@XendraTrl(Identifier="5e32d7ad-83c9-41d1-1794-32b13ef5a6c3")
public static String es_PE_TABLE_C_RfQResponseLine_Name="Línea Respuesta SPC (RfQ)";

@XendraTable(Name="RfQ Response Line",Description="Request for Quotation Response Line",Help="",
TableName="C_RfQResponseLine",AccessLevel="1",AD_Window_ID="00321465-3813-5160-b116-f76e77af89f6",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="5e32d7ad-83c9-41d1-1794-32b13ef5a6c3",Synchronized="2017-08-16 11:42:26.0")
/** TableName=C_RfQResponseLine */
public static final String Table_Name="C_RfQResponseLine";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_RfQResponseLine");

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
    Table_ID = MTable.getTable_ID("C_RfQResponseLine");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_RfQResponseLine[").append(get_ID()).append("]");
return sb.toString();
}
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

@XendraTrl(Identifier="884edbeb-886f-0356-0687-576b11843bd8")
public static String es_PE_FIELD_ResponseLine_RfQLine_Description="Item SPC (RfQ)";

@XendraTrl(Identifier="884edbeb-886f-0356-0687-576b11843bd8")
public static String es_PE_FIELD_ResponseLine_RfQLine_Help="Pedido para el Item de la cita.";

@XendraTrl(Identifier="884edbeb-886f-0356-0687-576b11843bd8")
public static String es_PE_FIELD_ResponseLine_RfQLine_Name="Ítem";

@XendraField(AD_Column_ID="C_RfQLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="884edbeb-886f-0356-0687-576b11843bd8")
public static final String FIELDNAME_ResponseLine_RfQLine="884edbeb-886f-0356-0687-576b11843bd8";

@XendraTrl(Identifier="1ee1a099-c3d7-5b19-5595-98556de462b0")
public static String es_PE_COLUMN_C_RfQLine_ID_Name="Línea SPC (RfQ)";

@XendraColumn(AD_Element_ID="aec09b62-5630-9404-c995-62b10762d39c",ColumnName="C_RfQLine_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1ee1a099-c3d7-5b19-5595-98556de462b0",
Synchronized="2017-08-05 16:54:23.0")
/** Column name C_RfQLine_ID */
public static final String COLUMNNAME_C_RfQLine_ID = "C_RfQLine_ID";
/** Set RfQ Response.
@param C_RfQResponse_ID Request for Quotation Response from a potential Vendor */
public void setC_RfQResponse_ID (int C_RfQResponse_ID)
{
if (C_RfQResponse_ID < 1) throw new IllegalArgumentException ("C_RfQResponse_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQResponse_ID, Integer.valueOf(C_RfQResponse_ID));
}
/** Get RfQ Response.
@return Request for Quotation Response from a potential Vendor */
public int getC_RfQResponse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQResponse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="93ccf94e-7673-5732-24fb-ad2988193573")
public static String es_PE_FIELD_ResponseLine_RfQResponse_Description="Solicitud de respuesta de la cita de un proveedor potencial";

@XendraTrl(Identifier="93ccf94e-7673-5732-24fb-ad2988193573")
public static String es_PE_FIELD_ResponseLine_RfQResponse_Help="Solicitud de respuesta de la cita de un proveedor potencial";

@XendraTrl(Identifier="93ccf94e-7673-5732-24fb-ad2988193573")
public static String es_PE_FIELD_ResponseLine_RfQResponse_Name="Respuesta";

@XendraField(AD_Column_ID="C_RfQResponse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="93ccf94e-7673-5732-24fb-ad2988193573")
public static final String FIELDNAME_ResponseLine_RfQResponse="93ccf94e-7673-5732-24fb-ad2988193573";

@XendraTrl(Identifier="4d741b8c-9ad2-9924-e627-0645deaea4ee")
public static String es_PE_COLUMN_C_RfQResponse_ID_Name="Respuesta SPC (RfQ)";

@XendraColumn(AD_Element_ID="b7d78b5a-511a-1743-401f-ca73179542cf",ColumnName="C_RfQResponse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4d741b8c-9ad2-9924-e627-0645deaea4ee",
Synchronized="2017-08-05 16:54:23.0")
/** Column name C_RfQResponse_ID */
public static final String COLUMNNAME_C_RfQResponse_ID = "C_RfQResponse_ID";
/** Set RfQ Response Line.
@param C_RfQResponseLine_ID Request for Quotation Response Line */
public void setC_RfQResponseLine_ID (int C_RfQResponseLine_ID)
{
if (C_RfQResponseLine_ID < 1) throw new IllegalArgumentException ("C_RfQResponseLine_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_RfQResponseLine_ID, Integer.valueOf(C_RfQResponseLine_ID));
}
/** Get RfQ Response Line.
@return Request for Quotation Response Line */
public int getC_RfQResponseLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_RfQResponseLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="f6fe77a1-6a87-7391-41d2-c862a0602238")
public static String es_PE_FIELD_ResponseLine_RfQResponseLine_Description="Solicitud para el Item de respuesta.";

@XendraTrl(Identifier="f6fe77a1-6a87-7391-41d2-c862a0602238")
public static String es_PE_FIELD_ResponseLine_RfQResponseLine_Help="Solicitud para línea de respuesta de la cita de un vendedor potencial.";

@XendraTrl(Identifier="f6fe77a1-6a87-7391-41d2-c862a0602238")
public static String es_PE_FIELD_ResponseLine_RfQResponseLine_Name="Item Respuesta SPC (RfQ)";

@XendraField(AD_Column_ID="C_RfQResponseLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f6fe77a1-6a87-7391-41d2-c862a0602238")
public static final String FIELDNAME_ResponseLine_RfQResponseLine="f6fe77a1-6a87-7391-41d2-c862a0602238";
/** Column name C_RfQResponseLine_ID */
public static final String COLUMNNAME_C_RfQResponseLine_ID = "C_RfQResponseLine_ID";
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

@XendraTrl(Identifier="d05574ad-8da5-6167-43aa-764343eedac7")
public static String es_PE_FIELD_ResponseLine_WorkComplete_Description="Fecha cuando es el trabajo (planeado) termina";

@XendraTrl(Identifier="d05574ad-8da5-6167-43aa-764343eedac7")
public static String es_PE_FIELD_ResponseLine_WorkComplete_Name="Trabajo Completo";

@XendraField(AD_Column_ID="DateWorkComplete",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d05574ad-8da5-6167-43aa-764343eedac7")
public static final String FIELDNAME_ResponseLine_WorkComplete="d05574ad-8da5-6167-43aa-764343eedac7";

@XendraTrl(Identifier="533a63ba-a223-b6a0-c1ea-23f382c4d434")
public static String es_PE_COLUMN_DateWorkComplete_Name="Trabajo Completo";

@XendraColumn(AD_Element_ID="079fae2c-844c-a019-755f-7222cea008ac",ColumnName="DateWorkComplete",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="533a63ba-a223-b6a0-c1ea-23f382c4d434",
Synchronized="2017-08-05 16:54:23.0")
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

@XendraTrl(Identifier="3eff238b-21c5-6468-eb3b-6080a2462f6b")
public static String es_PE_FIELD_ResponseLine_WorkStart_Description="Fecha cuando el trabajo (planeado para) se comienza.";

@XendraTrl(Identifier="3eff238b-21c5-6468-eb3b-6080a2462f6b")
public static String es_PE_FIELD_ResponseLine_WorkStart_Name="Inicia el Trabajo";

@XendraField(AD_Column_ID="DateWorkStart",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3eff238b-21c5-6468-eb3b-6080a2462f6b")
public static final String FIELDNAME_ResponseLine_WorkStart="3eff238b-21c5-6468-eb3b-6080a2462f6b";

@XendraTrl(Identifier="41c26406-f289-71a1-57a3-474934c87b1a")
public static String es_PE_COLUMN_DateWorkStart_Name="Inicia el Trabajo";

@XendraColumn(AD_Element_ID="eacd3b09-4768-e18d-b651-2ec68cc53f56",ColumnName="DateWorkStart",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="41c26406-f289-71a1-57a3-474934c87b1a",
Synchronized="2017-08-05 16:54:23.0")
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

@XendraTrl(Identifier="d818d7fa-aca0-a868-7c9d-8988411968e8")
public static String es_PE_FIELD_ResponseLine_DeliveryDays_Description="Numero de dias (planeado) hasta la entega";

@XendraTrl(Identifier="d818d7fa-aca0-a868-7c9d-8988411968e8")
public static String es_PE_FIELD_ResponseLine_DeliveryDays_Name="Días de Entrega";

@XendraField(AD_Column_ID="DeliveryDays",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d818d7fa-aca0-a868-7c9d-8988411968e8")
public static final String FIELDNAME_ResponseLine_DeliveryDays="d818d7fa-aca0-a868-7c9d-8988411968e8";

@XendraTrl(Identifier="7c9e5207-b3f2-4fcf-ae21-b8049e81b199")
public static String es_PE_COLUMN_DeliveryDays_Name="Días de Entrega";

@XendraColumn(AD_Element_ID="be6b99df-af16-3107-0958-5fe3af220ffc",ColumnName="DeliveryDays",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7c9e5207-b3f2-4fcf-ae21-b8049e81b199",
Synchronized="2017-08-05 16:54:23.0")
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

@XendraTrl(Identifier="992eb6fe-b6dc-6a43-42b4-aa5058e12480")
public static String es_PE_FIELD_ResponseLine_Description_Description="Observación";

@XendraTrl(Identifier="992eb6fe-b6dc-6a43-42b4-aa5058e12480")
public static String es_PE_FIELD_ResponseLine_Description_Help="Observación";

@XendraTrl(Identifier="992eb6fe-b6dc-6a43-42b4-aa5058e12480")
public static String es_PE_FIELD_ResponseLine_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="992eb6fe-b6dc-6a43-42b4-aa5058e12480")
public static final String FIELDNAME_ResponseLine_Description="992eb6fe-b6dc-6a43-42b4-aa5058e12480";

@XendraTrl(Identifier="7b9d71b2-fcfb-421a-f705-6b9ad4484bb7")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7b9d71b2-fcfb-421a-f705-6b9ad4484bb7",
Synchronized="2017-08-05 16:54:23.0")
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

@XendraTrl(Identifier="42fea41f-60f9-49bb-2244-ccd55da2cfcd")
public static String es_PE_FIELD_ResponseLine_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="42fea41f-60f9-49bb-2244-ccd55da2cfcd")
public static String es_PE_FIELD_ResponseLine_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="42fea41f-60f9-49bb-2244-ccd55da2cfcd")
public static String es_PE_FIELD_ResponseLine_CommentHelp_Name="Ayuda";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42fea41f-60f9-49bb-2244-ccd55da2cfcd")
public static final String FIELDNAME_ResponseLine_CommentHelp="42fea41f-60f9-49bb-2244-ccd55da2cfcd";

@XendraTrl(Identifier="5484bbe1-9d0b-e8d0-5c47-e1c5a1596296")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5484bbe1-9d0b-e8d0-5c47-e1c5a1596296",
Synchronized="2017-08-05 16:54:23.0")
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
@XendraTrl(Identifier="7a1cdbbc-f6bf-47bc-b324-1ae7b277cd34")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7a1cdbbc-f6bf-47bc-b324-1ae7b277cd34",
Synchronized="2017-08-05 16:54:23.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Selected Winner.
@param IsSelectedWinner The resonse is the selected winner */
public void setIsSelectedWinner (boolean IsSelectedWinner)
{
set_Value (COLUMNNAME_IsSelectedWinner, Boolean.valueOf(IsSelectedWinner));
}
/** Get Selected Winner.
@return The resonse is the selected winner */
public boolean isSelectedWinner() 
{
Object oo = get_Value(COLUMNNAME_IsSelectedWinner);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="2a5c9de9-7fa1-4fa3-a616-2d88fc981a0b")
public static String es_PE_FIELD_ResponseLine_SelectedWinner_Description="La respuesta es el ganador seleccionado";

@XendraTrl(Identifier="2a5c9de9-7fa1-4fa3-a616-2d88fc981a0b")
public static String es_PE_FIELD_ResponseLine_SelectedWinner_Help="La respuesta es el ganador seleccionado. Si están seleccionadas en nivel de la respuesta, se no hacen caso las selecciones de línea.";

@XendraTrl(Identifier="2a5c9de9-7fa1-4fa3-a616-2d88fc981a0b")
public static String es_PE_FIELD_ResponseLine_SelectedWinner_Name="Ganador Seleccionado";

@XendraField(AD_Column_ID="IsSelectedWinner",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2a5c9de9-7fa1-4fa3-a616-2d88fc981a0b")
public static final String FIELDNAME_ResponseLine_SelectedWinner="2a5c9de9-7fa1-4fa3-a616-2d88fc981a0b";

@XendraTrl(Identifier="a61d4a1f-9824-9b93-2673-a13977f74c05")
public static String es_PE_COLUMN_IsSelectedWinner_Name="Ganador Seleccionado";

@XendraColumn(AD_Element_ID="355329e9-c7ca-11f3-ed90-90ddacc86007",ColumnName="IsSelectedWinner",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a61d4a1f-9824-9b93-2673-a13977f74c05",
Synchronized="2017-08-05 16:54:23.0")
/** Column name IsSelectedWinner */
public static final String COLUMNNAME_IsSelectedWinner = "IsSelectedWinner";
/** Set Self-Service.
@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service */
public void setIsSelfService (boolean IsSelfService)
{
set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
}
/** Get Self-Service.
@return This is a Self-Service entry or this entry can be changed via Self-Service */
public boolean isSelfService() 
{
Object oo = get_Value(COLUMNNAME_IsSelfService);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="ce1f2f4e-4ba2-4187-b36a-06994680d077")
public static String es_PE_FIELD_ResponseLine_Self_Service_Description="Esta es una entrada del autoservicio ó esta entrada se puede cambiar vía autoservicio";

@XendraTrl(Identifier="ce1f2f4e-4ba2-4187-b36a-06994680d077")
public static String es_PE_FIELD_ResponseLine_Self_Service_Help="El autoservicio permite que los usuarios incorporen datos o que pongan al día sus datos. La bandera indica, que este expediente fue incorporado o creado vía autoservicio o que el usuario puede cambiarlo vía funcionalidad del autoservicio.";

@XendraTrl(Identifier="ce1f2f4e-4ba2-4187-b36a-06994680d077")
public static String es_PE_FIELD_ResponseLine_Self_Service_Name="Auto-Servicio";

@XendraField(AD_Column_ID="IsSelfService",IsCentrallyMaintained=true,
AD_Tab_ID="1327191c-15de-d841-6047-cab41117fb3f",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=true,SeqNo=130,SortNo=0,IsSameLine=true,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ce1f2f4e-4ba2-4187-b36a-06994680d077")
public static final String FIELDNAME_ResponseLine_Self_Service="ce1f2f4e-4ba2-4187-b36a-06994680d077";

@XendraTrl(Identifier="5685bcb3-5a5b-0c17-0a2c-a11d1f010e5b")
public static String es_PE_COLUMN_IsSelfService_Name="Auto-Servicio";

@XendraColumn(AD_Element_ID="8f201030-f9ab-66d2-f4de-7209f41f2af8",ColumnName="IsSelfService",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5685bcb3-5a5b-0c17-0a2c-a11d1f010e5b",
Synchronized="2017-08-05 16:54:23.0")
/** Column name IsSelfService */
public static final String COLUMNNAME_IsSelfService = "IsSelfService";
}
