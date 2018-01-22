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
/** Generated Model for M_Package
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Package extends PO
{
/** Standard Constructor
@param ctx context
@param M_Package_ID id
@param trxName transaction
*/
public X_M_Package (Properties ctx, int M_Package_ID, String trxName)
{
super (ctx, M_Package_ID, trxName);
/** if (M_Package_ID == 0)
{
setDocumentNo (null);
setM_InOut_ID (0);
setM_Package_ID (0);
setM_Shipper_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Package (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=664 */
public static int Table_ID=MTable.getTable_ID("M_Package");

@XendraTrl(Identifier="97bbc349-fcd2-e50c-b258-415d9654eceb")
public static String es_PE_TAB_Package_Description="Envío del paquete";

@XendraTrl(Identifier="97bbc349-fcd2-e50c-b258-415d9654eceb")
public static String es_PE_TAB_Package_Name="Paquete";

@XendraTrl(Identifier="97bbc349-fcd2-e50c-b258-415d9654eceb")
public static String es_PE_TAB_Package_Help="Un envío puede tener uno ó más paquetes. Un paquete puede ser seguido.";

@XendraTab(Name="Package",Description="Shipment Package",
Help="A Shipment can have one or more Packages.  A Package may be tracked.",
AD_Window_ID="cc7c5ddb-8738-c1b5-7364-48859b13ec14",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="97bbc349-fcd2-e50c-b258-415d9654eceb",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Package="97bbc349-fcd2-e50c-b258-415d9654eceb";

@XendraTrl(Identifier="52e0bc78-0173-aa29-ff01-cd64df27be54")
public static String es_PE_TABLE_M_Package_Name="Paquete";

@XendraTable(Name="Package",Description="Shipment Package",Help="",TableName="M_Package",
AccessLevel="1",AD_Window_ID="cc7c5ddb-8738-c1b5-7364-48859b13ec14",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=140,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="52e0bc78-0173-aa29-ff01-cd64df27be54",Synchronized="2017-08-16 11:43:23.0")
/** TableName=M_Package */
public static final String Table_Name="M_Package";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Package");

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
    Table_ID = MTable.getTable_ID("M_Package");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Package[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Date received.
@param DateReceived Date a product was received */
public void setDateReceived (Timestamp DateReceived)
{
set_Value (COLUMNNAME_DateReceived, DateReceived);
}
/** Get Date received.
@return Date a product was received */
public Timestamp getDateReceived() 
{
return (Timestamp)get_Value(COLUMNNAME_DateReceived);
}

@XendraTrl(Identifier="1d44056f-b6d2-34d9-3ce8-8fc1c9d825fe")
public static String es_PE_FIELD_Package_DateReceived_Description="Fecha en que un producto fue recibido.";

@XendraTrl(Identifier="1d44056f-b6d2-34d9-3ce8-8fc1c9d825fe")
public static String es_PE_FIELD_Package_DateReceived_Help="La fecha de recibo indica la fecha en que el producto fue recibido.";

@XendraTrl(Identifier="1d44056f-b6d2-34d9-3ce8-8fc1c9d825fe")
public static String es_PE_FIELD_Package_DateReceived_Name="Fecha de Recibo";

@XendraField(AD_Column_ID="DateReceived",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d44056f-b6d2-34d9-3ce8-8fc1c9d825fe")
public static final String FIELDNAME_Package_DateReceived="1d44056f-b6d2-34d9-3ce8-8fc1c9d825fe";

@XendraTrl(Identifier="e4c2a2b3-1b1f-5467-51f8-3f187e300e7c")
public static String es_PE_COLUMN_DateReceived_Name="Fecha de Recibo";

@XendraColumn(AD_Element_ID="d69e8488-829e-c9af-4ab0-68f83357b545",ColumnName="DateReceived",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e4c2a2b3-1b1f-5467-51f8-3f187e300e7c",
Synchronized="2017-08-05 16:55:18.0")
/** Column name DateReceived */
public static final String COLUMNNAME_DateReceived = "DateReceived";
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

@XendraTrl(Identifier="423de0fa-9fbd-c6bd-bddf-a3b096889e9d")
public static String es_PE_FIELD_Package_Description_Description="Observación";

@XendraTrl(Identifier="423de0fa-9fbd-c6bd-bddf-a3b096889e9d")
public static String es_PE_FIELD_Package_Description_Help="Observación";

@XendraTrl(Identifier="423de0fa-9fbd-c6bd-bddf-a3b096889e9d")
public static String es_PE_FIELD_Package_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="423de0fa-9fbd-c6bd-bddf-a3b096889e9d")
public static final String FIELDNAME_Package_Description="423de0fa-9fbd-c6bd-bddf-a3b096889e9d";

@XendraTrl(Identifier="bf7679dd-1f97-cb9a-be01-8fa4ca9e7e91")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bf7679dd-1f97-cb9a-be01-8fa4ca9e7e91",
Synchronized="2017-08-05 16:55:18.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Document No.
@param DocumentNo Document sequence number of the document */
public void setDocumentNo (String DocumentNo)
{
if (DocumentNo == null) throw new IllegalArgumentException ("DocumentNo is mandatory.");
if (DocumentNo.length() > 30)
{
log.warning("Length > 30 - truncated");
DocumentNo = DocumentNo.substring(0,29);
}
set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
}
/** Get Document No.
@return Document sequence number of the document */
public String getDocumentNo() 
{
String value = (String)get_Value(COLUMNNAME_DocumentNo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="14b124af-36b0-342c-0e2b-9b34d79dbf7a")
public static String es_PE_FIELD_Package_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="14b124af-36b0-342c-0e2b-9b34d79dbf7a")
public static String es_PE_FIELD_Package_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraTrl(Identifier="14b124af-36b0-342c-0e2b-9b34d79dbf7a")
public static String es_PE_FIELD_Package_DocumentNo_Name="No. del Documento";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=30,SortNo=-1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="14b124af-36b0-342c-0e2b-9b34d79dbf7a")
public static final String FIELDNAME_Package_DocumentNo="14b124af-36b0-342c-0e2b-9b34d79dbf7a";

@XendraTrl(Identifier="b3791ffe-a122-77d5-8394-dd24d9cf018b")
public static String es_PE_COLUMN_DocumentNo_Name="No. del Documento";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=10,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b3791ffe-a122-77d5-8394-dd24d9cf018b",
Synchronized="2017-08-05 16:55:18.0")
/** Column name DocumentNo */
public static final String COLUMNNAME_DocumentNo = "DocumentNo";
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
@XendraTrl(Identifier="1851eff0-2400-423d-bce7-957ffa8a1144")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1851eff0-2400-423d-bce7-957ffa8a1144",
Synchronized="2017-08-05 16:55:18.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Shipment/Receipt.
@param M_InOut_ID Material Shipment Document */
public void setM_InOut_ID (int M_InOut_ID)
{
if (M_InOut_ID < 1) throw new IllegalArgumentException ("M_InOut_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
}
/** Get Shipment/Receipt.
@return Material Shipment Document */
public int getM_InOut_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="18766974-e3fb-9f00-0334-9edf232953de")
public static String es_PE_FIELD_Package_Receipt_Description="Entrega ó documento de recibo";

@XendraTrl(Identifier="18766974-e3fb-9f00-0334-9edf232953de")
public static String es_PE_FIELD_Package_Receipt_Help="La ID de Entrega / Recibo indica el documento único para esta entrega ó recibo";

@XendraTrl(Identifier="18766974-e3fb-9f00-0334-9edf232953de")
public static String es_PE_FIELD_Package_Receipt_Name="Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOut_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18766974-e3fb-9f00-0334-9edf232953de")
public static final String FIELDNAME_Package_Receipt="18766974-e3fb-9f00-0334-9edf232953de";

@XendraTrl(Identifier="e5a63c96-39ae-cdf7-2848-6a83cacdf86c")
public static String es_PE_COLUMN_M_InOut_ID_Name="Entrega / Recibo";

@XendraColumn(AD_Element_ID="5c1a0edf-01a0-832e-098b-d49510db71db",ColumnName="M_InOut_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1.000000000000",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,
ColumnSQL="",IsAllowLogging=false,Identifier="e5a63c96-39ae-cdf7-2848-6a83cacdf86c",
Synchronized="2017-08-05 16:55:18.0")
/** Column name M_InOut_ID */
public static final String COLUMNNAME_M_InOut_ID = "M_InOut_ID";
/** Set Package.
@param M_Package_ID Shipment Package */
public void setM_Package_ID (int M_Package_ID)
{
if (M_Package_ID < 1) throw new IllegalArgumentException ("M_Package_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Package_ID, Integer.valueOf(M_Package_ID));
}
/** Get Package.
@return Shipment Package */
public int getM_Package_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Package_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="642f61b3-470b-08bb-d9d6-ca1fcf36e475")
public static String es_PE_FIELD_Package_Package_Description="Paquete de envio";

@XendraTrl(Identifier="642f61b3-470b-08bb-d9d6-ca1fcf36e475")
public static String es_PE_FIELD_Package_Package_Help="Un envio puede tener uno ó mas paquetes. Un paquete puede ser seguido individualmente.";

@XendraTrl(Identifier="642f61b3-470b-08bb-d9d6-ca1fcf36e475")
public static String es_PE_FIELD_Package_Package_Name="Paquete";

@XendraField(AD_Column_ID="M_Package_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="642f61b3-470b-08bb-d9d6-ca1fcf36e475")
public static final String FIELDNAME_Package_Package="642f61b3-470b-08bb-d9d6-ca1fcf36e475";
/** Column name M_Package_ID */
public static final String COLUMNNAME_M_Package_ID = "M_Package_ID";
/** Set Shipper.
@param M_Shipper_ID Method or manner of product delivery */
public void setM_Shipper_ID (int M_Shipper_ID)
{
if (M_Shipper_ID < 1) throw new IllegalArgumentException ("M_Shipper_ID is mandatory.");
set_Value (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
}
/** Get Shipper.
@return Method or manner of product delivery */
public int getM_Shipper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6682c3d0-27ee-1824-33aa-d799bcc1c426")
public static String es_PE_FIELD_Package_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="6682c3d0-27ee-1824-33aa-d799bcc1c426")
public static String es_PE_FIELD_Package_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="6682c3d0-27ee-1824-33aa-d799bcc1c426")
public static String es_PE_FIELD_Package_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6682c3d0-27ee-1824-33aa-d799bcc1c426")
public static final String FIELDNAME_Package_Shipper="6682c3d0-27ee-1824-33aa-d799bcc1c426";

@XendraTrl(Identifier="0d704577-cb0c-3777-e3a7-fc63baaf76c5")
public static String es_PE_COLUMN_M_Shipper_ID_Name="Transportista";

@XendraColumn(AD_Element_ID="9aa20cfc-6f2b-2463-7be0-888a548ba3ad",ColumnName="M_Shipper_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0d704577-cb0c-3777-e3a7-fc63baaf76c5",
Synchronized="2017-08-05 16:55:19.0")
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";
/** Set Info Received.
@param ReceivedInfo Information of the receipt of the package (acknowledgement) */
public void setReceivedInfo (String ReceivedInfo)
{
if (ReceivedInfo != null && ReceivedInfo.length() > 255)
{
log.warning("Length > 255 - truncated");
ReceivedInfo = ReceivedInfo.substring(0,254);
}
set_Value (COLUMNNAME_ReceivedInfo, ReceivedInfo);
}
/** Get Info Received.
@return Information of the receipt of the package (acknowledgement) */
public String getReceivedInfo() 
{
String value = (String)get_Value(COLUMNNAME_ReceivedInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="26b8de66-64c7-22c7-32dd-54ac548eed78")
public static String es_PE_FIELD_Package_InfoReceived_Description="Información del recibo de paquete (reconocimiento)";

@XendraTrl(Identifier="26b8de66-64c7-22c7-32dd-54ac548eed78")
public static String es_PE_FIELD_Package_InfoReceived_Name="Información Recibida";

@XendraField(AD_Column_ID="ReceivedInfo",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=true,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="26b8de66-64c7-22c7-32dd-54ac548eed78")
public static final String FIELDNAME_Package_InfoReceived="26b8de66-64c7-22c7-32dd-54ac548eed78";

@XendraTrl(Identifier="07f23593-bef5-50e0-4418-82b7dc1a53dc")
public static String es_PE_COLUMN_ReceivedInfo_Name="Información Recibida";

@XendraColumn(AD_Element_ID="2162aa71-5f9b-b59c-c500-1466e777d179",ColumnName="ReceivedInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="07f23593-bef5-50e0-4418-82b7dc1a53dc",
Synchronized="2017-08-05 16:55:19.0")
/** Column name ReceivedInfo */
public static final String COLUMNNAME_ReceivedInfo = "ReceivedInfo";
/** Set Ship Date.
@param ShipDate Shipment Date/Time */
public void setShipDate (Timestamp ShipDate)
{
set_Value (COLUMNNAME_ShipDate, ShipDate);
}
/** Get Ship Date.
@return Shipment Date/Time */
public Timestamp getShipDate() 
{
return (Timestamp)get_Value(COLUMNNAME_ShipDate);
}

@XendraTrl(Identifier="ac516022-fe79-e1f7-c90f-6130b3fc04dc")
public static String es_PE_FIELD_Package_ShipDate_Description="Fecha de entrega Fecha/Hora";

@XendraTrl(Identifier="ac516022-fe79-e1f7-c90f-6130b3fc04dc")
public static String es_PE_FIELD_Package_ShipDate_Help="Fecha actual Fecha/Hora de entrega (recolección)";

@XendraTrl(Identifier="ac516022-fe79-e1f7-c90f-6130b3fc04dc")
public static String es_PE_FIELD_Package_ShipDate_Name="Fecha de entrega";

@XendraField(AD_Column_ID="ShipDate",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ac516022-fe79-e1f7-c90f-6130b3fc04dc")
public static final String FIELDNAME_Package_ShipDate="ac516022-fe79-e1f7-c90f-6130b3fc04dc";

@XendraTrl(Identifier="b8534f03-e956-3520-a1bb-3a99e57dfbf3")
public static String es_PE_COLUMN_ShipDate_Name="Fecha de entrega";

@XendraColumn(AD_Element_ID="d8b9eadd-d7de-545a-a14d-fe481306c7ec",ColumnName="ShipDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b8534f03-e956-3520-a1bb-3a99e57dfbf3",
Synchronized="2017-08-05 16:55:19.0")
/** Column name ShipDate */
public static final String COLUMNNAME_ShipDate = "ShipDate";
/** Set Tracking Info.
@param TrackingInfo Tracking Info */
public void setTrackingInfo (String TrackingInfo)
{
if (TrackingInfo != null && TrackingInfo.length() > 255)
{
log.warning("Length > 255 - truncated");
TrackingInfo = TrackingInfo.substring(0,254);
}
set_Value (COLUMNNAME_TrackingInfo, TrackingInfo);
}
/** Get Tracking Info.
@return Tracking Info */
public String getTrackingInfo() 
{
String value = (String)get_Value(COLUMNNAME_TrackingInfo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="a777fe44-810a-36ac-f67e-434ee588f4dc")
public static String es_PE_FIELD_Package_TrackingInfo_Name="Información del Seguimiento";

@XendraField(AD_Column_ID="TrackingInfo",IsCentrallyMaintained=true,
AD_Tab_ID="97bbc349-fcd2-e50c-b258-415d9654eceb",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a777fe44-810a-36ac-f67e-434ee588f4dc")
public static final String FIELDNAME_Package_TrackingInfo="a777fe44-810a-36ac-f67e-434ee588f4dc";

@XendraTrl(Identifier="a0076ddd-55d8-c3dd-c435-1f70daa65de1")
public static String es_PE_COLUMN_TrackingInfo_Name="Información del Seguimiento";

@XendraColumn(AD_Element_ID="bcd19528-39cc-3ebe-8e1c-0e479ab74fa1",ColumnName="TrackingInfo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a0076ddd-55d8-c3dd-c435-1f70daa65de1",
Synchronized="2017-08-05 16:55:19.0")
/** Column name TrackingInfo */
public static final String COLUMNNAME_TrackingInfo = "TrackingInfo";
}
