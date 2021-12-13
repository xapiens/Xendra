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
/** Generated Model for M_StockTaking
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_StockTaking extends PO
{
/** Standard Constructor
@param ctx context
@param M_StockTaking_ID id
@param trxName transaction
*/
public X_M_StockTaking (Properties ctx, int M_StockTaking_ID, String trxName)
{
super (ctx, M_StockTaking_ID, trxName);
/** if (M_StockTaking_ID == 0)
{
setDocumentNo (null);
setIsApproved (false);	
// N
setM_StockTaking_ID (0);
setM_Warehouse_ID (0);
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
public X_M_StockTaking (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000246 */
public static int Table_ID=MTable.getTable_ID("M_StockTaking");

@XendraTrl(Identifier="21e786ac-7b63-4190-afd4-2287f26d2c76")
public static String es_PE_TAB_TomaDeInventario_Name="Toma de inventario";

@XendraTab(Name="Toma de inventario",Description="",Help="",
AD_Window_ID="d70f618b-5e90-467e-b814-86738b3a139d",SeqNo=10,TabLevel=0,IsSingleRow=true,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="21e786ac-7b63-4190-afd4-2287f26d2c76",Synchronized="2017-05-04 22:52:10.0")
public static final String TABNAME_TomaDeInventario="21e786ac-7b63-4190-afd4-2287f26d2c76";

@XendraTrl(Identifier="e20edf2c-e7b9-8336-1dab-625de375e115")
public static String es_PE_TABLE_M_StockTaking_Name="Stock Taking";

@XendraTable(Name="Stock Taking",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="M_StockTaking",AccessLevel="3",AD_Window_ID="d70f618b-5e90-467e-b814-86738b3a139d",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="e20edf2c-e7b9-8336-1dab-625de375e115",Synchronized="2020-03-28 18:30:10.0")
/** TableName=M_StockTaking */
public static final String Table_Name="M_StockTaking";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_StockTaking");

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
    Table_ID = MTable.getTable_ID("M_StockTaking");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_StockTaking[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Trx Organization.
@param AD_OrgTrx_ID Performing or initiating organization */
public void setAD_OrgTrx_ID (int AD_OrgTrx_ID)
{
if (AD_OrgTrx_ID <= 0) set_Value (COLUMNNAME_AD_OrgTrx_ID, null);
 else 
set_Value (COLUMNNAME_AD_OrgTrx_ID, Integer.valueOf(AD_OrgTrx_ID));
}
/** Get Trx Organization.
@return Performing or initiating organization */
public int getAD_OrgTrx_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgTrx_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="affcdb6e-8af7-405a-bc8b-635570162210")
public static String es_PE_FIELD_TomaDeInventario_TrxOrganization_Name="Organización de la Trans.";

@XendraTrl(Identifier="affcdb6e-8af7-405a-bc8b-635570162210")
public static String es_PE_FIELD_TomaDeInventario_TrxOrganization_Description="Organización que inicia ó ejecuta la transacción";

@XendraTrl(Identifier="affcdb6e-8af7-405a-bc8b-635570162210")
public static String es_PE_FIELD_TomaDeInventario_TrxOrganization_Help="La organización que inicia ó ejecuta la transacción (para otra organización). La organización poseedora puede no ser la organización de la transacción en un ambiente de buró de servicio; con servicios centralizados y transacciones inter- organización.";

@XendraField(AD_Column_ID="AD_OrgTrx_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="affcdb6e-8af7-405a-bc8b-635570162210")
public static final String FIELDNAME_TomaDeInventario_TrxOrganization="affcdb6e-8af7-405a-bc8b-635570162210";

@XendraTrl(Identifier="9f546561-bd79-cae5-e0c0-ca759f2012c9")
public static String es_PE_COLUMN_AD_OrgTrx_ID_Name="Trx Organization";

@XendraColumn(AD_Element_ID="b4180358-67aa-fe55-0409-6367a60e0a2e",ColumnName="AD_OrgTrx_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="9f546561-bd79-cae5-e0c0-ca759f2012c9",
Synchronized="2020-03-03 21:38:56.0")
/** Column name AD_OrgTrx_ID */
public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";
/** Set C_GroupDoc_ID.
@param C_GroupDoc_ID C_GroupDoc_ID */
public void setC_GroupDoc_ID (int C_GroupDoc_ID)
{
if (C_GroupDoc_ID <= 0) set_Value (COLUMNNAME_C_GroupDoc_ID, null);
 else 
set_Value (COLUMNNAME_C_GroupDoc_ID, Integer.valueOf(C_GroupDoc_ID));
}
/** Get C_GroupDoc_ID.
@return C_GroupDoc_ID */
public int getC_GroupDoc_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_GroupDoc_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d0421e9a-b181-45bc-a321-defe74ad7ea5")
public static String es_PE_FIELD_TomaDeInventario_C_GroupDoc_ID_Name="c_groupdoc_id";

@XendraField(AD_Column_ID="C_GroupDoc_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="d0421e9a-b181-45bc-a321-defe74ad7ea5")
public static final String FIELDNAME_TomaDeInventario_C_GroupDoc_ID="d0421e9a-b181-45bc-a321-defe74ad7ea5";

@XendraTrl(Identifier="6419ed43-9871-4d25-bd16-1ed526dc0789")
public static String es_PE_COLUMN_C_GroupDoc_ID_Name="C_GroupDoc_ID";

@XendraColumn(AD_Element_ID="6376cf94-c145-e9e0-11ce-5b020ca6bff7",ColumnName="C_GroupDoc_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6419ed43-9871-4d25-bd16-1ed526dc0789",
Synchronized="2020-03-03 21:38:57.0")
/** Column name C_GroupDoc_ID */
public static final String COLUMNNAME_C_GroupDoc_ID = "C_GroupDoc_ID";
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

@XendraTrl(Identifier="76cfba3b-6b66-48ea-849d-0b9f02e2e713")
public static String es_PE_FIELD_TomaDeInventario_Description_Name="Descripción";

@XendraTrl(Identifier="76cfba3b-6b66-48ea-849d-0b9f02e2e713")
public static String es_PE_FIELD_TomaDeInventario_Description_Description="Descripción corta opcional del registro";

@XendraTrl(Identifier="76cfba3b-6b66-48ea-849d-0b9f02e2e713")
public static String es_PE_FIELD_TomaDeInventario_Description_Help="Una descripción esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=255,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="76cfba3b-6b66-48ea-849d-0b9f02e2e713")
public static final String FIELDNAME_TomaDeInventario_Description="76cfba3b-6b66-48ea-849d-0b9f02e2e713";

@XendraTrl(Identifier="aff5e9e1-9e4e-98c2-350a-0a21c15d697d")
public static String es_PE_COLUMN_Description_Name="Description";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aff5e9e1-9e4e-98c2-350a-0a21c15d697d",
Synchronized="2020-03-03 21:38:57.0")
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
set_Value (COLUMNNAME_DocumentNo, DocumentNo);
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
@XendraTrl(Identifier="b2dfbfa0-671e-41de-91a8-26f45b464449")
public static String es_PE_FIELD_TomaDeInventario_DocumentNo_Name="No. del Documento";

@XendraTrl(Identifier="b2dfbfa0-671e-41de-91a8-26f45b464449")
public static String es_PE_FIELD_TomaDeInventario_DocumentNo_Description="Número de secuencia del documento para cada documento";

@XendraTrl(Identifier="b2dfbfa0-671e-41de-91a8-26f45b464449")
public static String es_PE_FIELD_TomaDeInventario_DocumentNo_Help="El número del documento es usualmente generado en automático por el sistema y determinado por el tipo del documento. Si el documento no se salva; el número preliminar se despliega entre \"<>\"";

@XendraField(AD_Column_ID="DocumentNo",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=30,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="b2dfbfa0-671e-41de-91a8-26f45b464449")
public static final String FIELDNAME_TomaDeInventario_DocumentNo="b2dfbfa0-671e-41de-91a8-26f45b464449";

@XendraTrl(Identifier="77080d17-4daa-9ae1-7569-4e197ae8c32c")
public static String es_PE_COLUMN_DocumentNo_Name="Document No";

@XendraColumn(AD_Element_ID="e3ca6e28-702a-2722-d941-b2072a0de9cb",ColumnName="DocumentNo",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=30,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="77080d17-4daa-9ae1-7569-4e197ae8c32c",
Synchronized="2020-03-03 21:38:57.0")
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
@XendraTrl(Identifier="5110a140-6c26-4a41-8d34-aa678d6e172f")
public static String es_PE_FIELD_TomaDeInventario_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="5110a140-6c26-4a41-8d34-aa678d6e172f")
public static final String FIELDNAME_TomaDeInventario_Identifier="5110a140-6c26-4a41-8d34-aa678d6e172f";

@XendraTrl(Identifier="b9d629a8-5a5c-4048-a607-be6b04460be4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b9d629a8-5a5c-4048-a607-be6b04460be4",
Synchronized="2020-03-03 21:38:57.0")
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

@XendraTrl(Identifier="d00f1435-5b15-4bdb-8d96-b6409c8dc8f4")
public static String es_PE_FIELD_TomaDeInventario_Approved_Name="Aprobación";

@XendraTrl(Identifier="d00f1435-5b15-4bdb-8d96-b6409c8dc8f4")
public static String es_PE_FIELD_TomaDeInventario_Approved_Description="Indica si este documento requiere aprobación";

@XendraTrl(Identifier="d00f1435-5b15-4bdb-8d96-b6409c8dc8f4")
public static String es_PE_FIELD_TomaDeInventario_Approved_Help="El Cuadro de Verificación  Aprobado indica si este documento requiere aprobación antes de que pueda ser procesado";

@XendraField(AD_Column_ID="IsApproved",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="d00f1435-5b15-4bdb-8d96-b6409c8dc8f4")
public static final String FIELDNAME_TomaDeInventario_Approved="d00f1435-5b15-4bdb-8d96-b6409c8dc8f4";

@XendraTrl(Identifier="3e32b968-a9e3-5d85-15d3-5d400ab08800")
public static String es_PE_COLUMN_IsApproved_Name="Approved";

@XendraColumn(AD_Element_ID="44388d99-07b7-b005-9e16-78884800beff",ColumnName="IsApproved",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3e32b968-a9e3-5d85-15d3-5d400ab08800",
Synchronized="2020-03-03 21:38:57.0")
/** Column name IsApproved */
public static final String COLUMNNAME_IsApproved = "IsApproved";
/** Set Phys.Inventory.
@param M_Inventory_ID Parameters for a Physical Inventory */
public void setM_Inventory_ID (int M_Inventory_ID)
{
if (M_Inventory_ID <= 0) set_Value (COLUMNNAME_M_Inventory_ID, null);
 else 
set_Value (COLUMNNAME_M_Inventory_ID, Integer.valueOf(M_Inventory_ID));
}
/** Get Phys.Inventory.
@return Parameters for a Physical Inventory */
public int getM_Inventory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Inventory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8771bb48-a123-485f-acc4-1eb22b0d5a5c")
public static String es_PE_FIELD_TomaDeInventario_PhysInventory_Name="Inventario Físico";

@XendraTrl(Identifier="8771bb48-a123-485f-acc4-1eb22b0d5a5c")
public static String es_PE_FIELD_TomaDeInventario_PhysInventory_Description="Parámetros para el inventario físico.";

@XendraTrl(Identifier="8771bb48-a123-485f-acc4-1eb22b0d5a5c")
public static String es_PE_FIELD_TomaDeInventario_PhysInventory_Help="El inventario físico indica parámetros únicos para el inventario físico.";

@XendraField(AD_Column_ID="M_Inventory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="8771bb48-a123-485f-acc4-1eb22b0d5a5c")
public static final String FIELDNAME_TomaDeInventario_PhysInventory="8771bb48-a123-485f-acc4-1eb22b0d5a5c";

@XendraTrl(Identifier="493bb1c5-f068-443f-9352-68d67b7d0e04")
public static String es_PE_COLUMN_M_Inventory_ID_Name="Phys.Inventory";

@XendraColumn(AD_Element_ID="0e8f85f3-fbb2-f347-b412-2f2218e14665",ColumnName="M_Inventory_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="493bb1c5-f068-443f-9352-68d67b7d0e04",
Synchronized="2020-03-03 21:38:57.0")
/** Column name M_Inventory_ID */
public static final String COLUMNNAME_M_Inventory_ID = "M_Inventory_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
set_Value (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}

@XendraTrl(Identifier="8683cdc8-040d-4b79-b87d-78ad0af903c1")
public static String es_PE_FIELD_TomaDeInventario_MovementDate_Name="Fecha de Movimiento";

@XendraTrl(Identifier="8683cdc8-040d-4b79-b87d-78ad0af903c1")
public static String es_PE_FIELD_TomaDeInventario_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="8683cdc8-040d-4b79-b87d-78ad0af903c1")
public static String es_PE_FIELD_TomaDeInventario_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=29,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="8683cdc8-040d-4b79-b87d-78ad0af903c1")
public static final String FIELDNAME_TomaDeInventario_MovementDate="8683cdc8-040d-4b79-b87d-78ad0af903c1";

@XendraTrl(Identifier="c268c1d2-245a-8013-2490-117172a9efbf")
public static String es_PE_COLUMN_MovementDate_Name="Movement Date";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=16,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=29,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c268c1d2-245a-8013-2490-117172a9efbf",
Synchronized="2020-03-03 21:38:57.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Stock Taking.
@param M_StockTaking_ID Stock Taking */
public void setM_StockTaking_ID (int M_StockTaking_ID)
{
if (M_StockTaking_ID < 1) throw new IllegalArgumentException ("M_StockTaking_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_StockTaking_ID, Integer.valueOf(M_StockTaking_ID));
}
/** Get Stock Taking.
@return Stock Taking */
public int getM_StockTaking_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_StockTaking_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2050bc56-aed4-47b4-bb16-fd1b50aa44ea")
public static String es_PE_FIELD_TomaDeInventario_StockTaking_Name="Stock Taking";

@XendraField(AD_Column_ID="M_StockTaking_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="2050bc56-aed4-47b4-bb16-fd1b50aa44ea")
public static final String FIELDNAME_TomaDeInventario_StockTaking="2050bc56-aed4-47b4-bb16-fd1b50aa44ea";
/** Column name M_StockTaking_ID */
public static final String COLUMNNAME_M_StockTaking_ID = "M_StockTaking_ID";
/** Set Warehouse.
@param M_Warehouse_ID Storage Warehouse and Service Point */
public void setM_Warehouse_ID (int M_Warehouse_ID)
{
if (M_Warehouse_ID < 1) throw new IllegalArgumentException ("M_Warehouse_ID is mandatory.");
set_Value (COLUMNNAME_M_Warehouse_ID, Integer.valueOf(M_Warehouse_ID));
}
/** Get Warehouse.
@return Storage Warehouse and Service Point */
public int getM_Warehouse_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Warehouse_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5f665a41-ea82-490d-b865-0f9246249075")
public static String es_PE_FIELD_TomaDeInventario_Warehouse_Name="Almacén";

@XendraTrl(Identifier="5f665a41-ea82-490d-b865-0f9246249075")
public static String es_PE_FIELD_TomaDeInventario_Warehouse_Description="Almacén";

@XendraTrl(Identifier="5f665a41-ea82-490d-b865-0f9246249075")
public static String es_PE_FIELD_TomaDeInventario_Warehouse_Help="El Almacén indica un Almacén único donde los productos son almacenados";

@XendraField(AD_Column_ID="M_Warehouse_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="5f665a41-ea82-490d-b865-0f9246249075")
public static final String FIELDNAME_TomaDeInventario_Warehouse="5f665a41-ea82-490d-b865-0f9246249075";

@XendraTrl(Identifier="2c360a73-7803-752c-56e4-2507d7658059")
public static String es_PE_COLUMN_M_Warehouse_ID_Name="Warehouse";

@XendraColumn(AD_Element_ID="402045cd-baa5-aeaf-b148-a921dffb7821",ColumnName="M_Warehouse_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2c360a73-7803-752c-56e4-2507d7658059",
Synchronized="2020-03-03 21:38:57.0")
/** Column name M_Warehouse_ID */
public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";
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

@XendraTrl(Identifier="815d3c74-a04b-40fb-b97c-816656d7d6b2")
public static String es_PE_FIELD_TomaDeInventario_Processed_Name="Procesado";

@XendraTrl(Identifier="815d3c74-a04b-40fb-b97c-816656d7d6b2")
public static String es_PE_FIELD_TomaDeInventario_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="815d3c74-a04b-40fb-b97c-816656d7d6b2")
public static String es_PE_FIELD_TomaDeInventario_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:09.0",
Identifier="815d3c74-a04b-40fb-b97c-816656d7d6b2")
public static final String FIELDNAME_TomaDeInventario_Processed="815d3c74-a04b-40fb-b97c-816656d7d6b2";

@XendraTrl(Identifier="e418ecca-064d-1a56-f84c-f1d85069701d")
public static String es_PE_COLUMN_Processed_Name="Processed";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e418ecca-064d-1a56-f84c-f1d85069701d",
Synchronized="2020-03-03 21:38:57.0")
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

@XendraTrl(Identifier="eba5f7e4-57c8-44c8-90c9-a481cb87fa97")
public static String es_PE_FIELD_TomaDeInventario_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,IsHeading=false,
IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:10.0",
Identifier="eba5f7e4-57c8-44c8-90c9-a481cb87fa97")
public static final String FIELDNAME_TomaDeInventario_ProcessNow="eba5f7e4-57c8-44c8-90c9-a481cb87fa97";

@XendraTrl(Identifier="6b881729-50ea-32bb-aed2-76b8a02af294")
public static String es_PE_COLUMN_Processing_Name="Process Now";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6b881729-50ea-32bb-aed2-76b8a02af294",
Synchronized="2020-03-03 21:38:57.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set User List 1.
@param User1_ID User defined list element #1 */
public void setUser1_ID (int User1_ID)
{
if (User1_ID <= 0) set_Value (COLUMNNAME_User1_ID, null);
 else 
set_Value (COLUMNNAME_User1_ID, Integer.valueOf(User1_ID));
}
/** Get User List 1.
@return User defined list element #1 */
public int getUser1_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User1_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="778ae92f-2036-44be-83d4-8a22f667b0c7")
public static String es_PE_FIELD_TomaDeInventario_UserList_Name="Usuario 1";

@XendraTrl(Identifier="778ae92f-2036-44be-83d4-8a22f667b0c7")
public static String es_PE_FIELD_TomaDeInventario_UserList_Description="El usuario definió el elemento # 1";

@XendraTrl(Identifier="778ae92f-2036-44be-83d4-8a22f667b0c7")
public static String es_PE_FIELD_TomaDeInventario_UserList_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User1_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:10.0",
Identifier="778ae92f-2036-44be-83d4-8a22f667b0c7")
public static final String FIELDNAME_TomaDeInventario_UserList="778ae92f-2036-44be-83d4-8a22f667b0c7";

@XendraTrl(Identifier="d3fd2da5-001c-3d45-e69e-6d45d2b29b36")
public static String es_PE_COLUMN_User1_ID_Name="User List 1";

@XendraColumn(AD_Element_ID="07453e74-aadd-d9c9-e543-837a6fdb3094",ColumnName="User1_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3fd2da5-001c-3d45-e69e-6d45d2b29b36",
Synchronized="2020-03-03 21:38:57.0")
/** Column name User1_ID */
public static final String COLUMNNAME_User1_ID = "User1_ID";
/** Set User List 2.
@param User2_ID User defined list element #2 */
public void setUser2_ID (int User2_ID)
{
if (User2_ID <= 0) set_Value (COLUMNNAME_User2_ID, null);
 else 
set_Value (COLUMNNAME_User2_ID, Integer.valueOf(User2_ID));
}
/** Get User List 2.
@return User defined list element #2 */
public int getUser2_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_User2_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1fcd0dbf-9bf3-4dfb-809c-bbf10b3475ca")
public static String es_PE_FIELD_TomaDeInventario_UserList22_Name="Usuario 2";

@XendraTrl(Identifier="1fcd0dbf-9bf3-4dfb-809c-bbf10b3475ca")
public static String es_PE_FIELD_TomaDeInventario_UserList22_Description="El usuario definió el elemento # 2";

@XendraTrl(Identifier="1fcd0dbf-9bf3-4dfb-809c-bbf10b3475ca")
public static String es_PE_FIELD_TomaDeInventario_UserList22_Help="El elemento definido por el usuario despliega los elementos opcionales que han sido definidos para esta combinación de cuentas";

@XendraField(AD_Column_ID="User2_ID",IsCentrallyMaintained=true,
AD_Tab_ID="21e786ac-7b63-4190-afd4-2287f26d2c76",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2017-05-04 22:52:10.0",
Identifier="1fcd0dbf-9bf3-4dfb-809c-bbf10b3475ca")
public static final String FIELDNAME_TomaDeInventario_UserList22="1fcd0dbf-9bf3-4dfb-809c-bbf10b3475ca";

@XendraTrl(Identifier="30a910bb-b1bf-b204-fda6-293957562bc3")
public static String es_PE_COLUMN_User2_ID_Name="User List 2";

@XendraColumn(AD_Element_ID="1b668c90-6743-20a2-df62-576857d72c06",ColumnName="User2_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="30a910bb-b1bf-b204-fda6-293957562bc3",
Synchronized="2020-03-03 21:38:57.0")
/** Column name User2_ID */
public static final String COLUMNNAME_User2_ID = "User2_ID";
}
