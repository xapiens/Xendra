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
/** Generated Model for C_ProjectIssue
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_ProjectIssue extends PO
{
/** Standard Constructor
@param ctx context
@param C_ProjectIssue_ID id
@param trxName transaction
*/
public X_C_ProjectIssue (Properties ctx, int C_ProjectIssue_ID, String trxName)
{
super (ctx, C_ProjectIssue_ID, trxName);
/** if (C_ProjectIssue_ID == 0)
{
setC_Project_ID (0);
setC_ProjectIssue_ID (0);
setLine (0);	
// @SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_ProjectIssue WHERE C_Project_ID=@C_Project_ID@
setM_AttributeSetInstance_ID (0);
setM_Locator_ID (0);
setMovementDate (new Timestamp(System.currentTimeMillis()));
setMovementQty (Env.ZERO);
setM_Product_ID (0);
setPosted (false);	
// N
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
public X_C_ProjectIssue (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=623 */
public static int Table_ID=MTable.getTable_ID("C_ProjectIssue");

@XendraTrl(Identifier="45120dc3-feab-fcba-b147-fb1a48cabe2e")
public static String es_PE_TAB_Issues_Description="Surtimiento del Proyecto";

@XendraTrl(Identifier="45120dc3-feab-fcba-b147-fb1a48cabe2e")
public static String es_PE_TAB_Issues_Name="Surtimiento";

@XendraTrl(Identifier="45120dc3-feab-fcba-b147-fb1a48cabe2e")
public static String es_PE_TAB_Issues_Help="Enumera las ediciones al proyecto iniciado por la \"edición para proyectar\" proceso. Usted puede publicar recibos, tiempo y costos, ó la acción.";

@XendraTab(Name="Issues",Description="Issues to the Project",
Help="The lab lists the Issues to the project initiated by the 'Issue to Project' process. You can issue Receipts, Time and Expenses, or Stock.",
AD_Window_ID="3d408be2-c806-9eca-e379-2876dfbbec6d",SeqNo=30,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",
DisplayLogic="@ProjectCategory@!S",IsInsertRecord=false,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="45120dc3-feab-fcba-b147-fb1a48cabe2e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Issues="45120dc3-feab-fcba-b147-fb1a48cabe2e";

@XendraTrl(Identifier="c4a046f3-f174-ba02-115c-8d5885ed2e1f")
public static String es_PE_TABLE_C_ProjectIssue_Name="Asunto del Proyecto";

@XendraTable(Name="Project Issue",Description="Project Issues (Material, Labor)",Help="",
TableName="C_ProjectIssue",AccessLevel="3",AD_Window_ID="3d408be2-c806-9eca-e379-2876dfbbec6d",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=135,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.commercial",
Identifier="c4a046f3-f174-ba02-115c-8d5885ed2e1f",Synchronized="2017-08-16 11:42:20.0")
/** TableName=C_ProjectIssue */
public static final String Table_Name="C_ProjectIssue";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_ProjectIssue");

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
    Table_ID = MTable.getTable_ID("C_ProjectIssue");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_ProjectIssue[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Project.
@param C_Project_ID Financial Project */
public void setC_Project_ID (int C_Project_ID)
{
if (C_Project_ID < 1) throw new IllegalArgumentException ("C_Project_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_Project_ID, Integer.valueOf(C_Project_ID));
}
/** Get Project.
@return Financial Project */
public int getC_Project_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Project_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getC_Project_ID()));
}

@XendraTrl(Identifier="31e11354-4835-c512-571a-d094b3a6b949")
public static String es_PE_FIELD_Issues_Project_Description="Identifica un proyecto único";

@XendraTrl(Identifier="31e11354-4835-c512-571a-d094b3a6b949")
public static String es_PE_FIELD_Issues_Project_Help="La ID de un proyecto es un identificador definido por el usuario para un proyecto";

@XendraTrl(Identifier="31e11354-4835-c512-571a-d094b3a6b949")
public static String es_PE_FIELD_Issues_Project_Name="Proyecto";

@XendraField(AD_Column_ID="C_Project_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="31e11354-4835-c512-571a-d094b3a6b949")
public static final String FIELDNAME_Issues_Project="31e11354-4835-c512-571a-d094b3a6b949";

@XendraTrl(Identifier="e2ca7d64-c39c-3864-a4cc-f9eabac8aa65")
public static String es_PE_COLUMN_C_Project_ID_Name="Proyecto";

@XendraColumn(AD_Element_ID="16ff5dcc-9178-73dd-e618-e88bd79d573b",ColumnName="C_Project_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e2ca7d64-c39c-3864-a4cc-f9eabac8aa65",
Synchronized="2017-08-05 16:54:17.0")
/** Column name C_Project_ID */
public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";
/** Set Project Issue.
@param C_ProjectIssue_ID Project Issues (Material, Labor) */
public void setC_ProjectIssue_ID (int C_ProjectIssue_ID)
{
if (C_ProjectIssue_ID < 1) throw new IllegalArgumentException ("C_ProjectIssue_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_ProjectIssue_ID, Integer.valueOf(C_ProjectIssue_ID));
}
/** Get Project Issue.
@return Project Issues (Material, Labor) */
public int getC_ProjectIssue_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_ProjectIssue_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ca4f59ef-30d5-9798-8c1a-7e9d89c60fdf")
public static String es_PE_FIELD_Issues_ProjectIssue_Description="Ediciones del proyecto (material, trabajo).";

@XendraTrl(Identifier="ca4f59ef-30d5-9798-8c1a-7e9d89c60fdf")
public static String es_PE_FIELD_Issues_ProjectIssue_Help="Ediciones del proyecto iniciado por procesos \"ediciones al proyecto\". Usted puede publicar recibos, tiempo y costos, ó acción.";

@XendraTrl(Identifier="ca4f59ef-30d5-9798-8c1a-7e9d89c60fdf")
public static String es_PE_FIELD_Issues_ProjectIssue_Name="Asunto del Proyecto";

@XendraField(AD_Column_ID="C_ProjectIssue_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ca4f59ef-30d5-9798-8c1a-7e9d89c60fdf")
public static final String FIELDNAME_Issues_ProjectIssue="ca4f59ef-30d5-9798-8c1a-7e9d89c60fdf";
/** Column name C_ProjectIssue_ID */
public static final String COLUMNNAME_C_ProjectIssue_ID = "C_ProjectIssue_ID";
/** Set Description.
@param Description Optional short DESCRIPTION of the record */
public void setDescription (String Description)
{
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

@XendraTrl(Identifier="6dc63aed-35e6-cbf3-aaec-28ba88f43326")
public static String es_PE_FIELD_Issues_Description_Description="Observación";

@XendraTrl(Identifier="6dc63aed-35e6-cbf3-aaec-28ba88f43326")
public static String es_PE_FIELD_Issues_Description_Help="Observación";

@XendraTrl(Identifier="6dc63aed-35e6-cbf3-aaec-28ba88f43326")
public static String es_PE_FIELD_Issues_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=130,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6dc63aed-35e6-cbf3-aaec-28ba88f43326")
public static final String FIELDNAME_Issues_Description="6dc63aed-35e6-cbf3-aaec-28ba88f43326";

@XendraTrl(Identifier="230dd532-49fe-736f-739c-2072371da3d5")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="230dd532-49fe-736f-739c-2072371da3d5",
Synchronized="2017-08-05 16:54:17.0")
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
@XendraTrl(Identifier="593c8e32-511d-4bb2-ae38-98b6aef75aaa")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="593c8e32-511d-4bb2-ae38-98b6aef75aaa",
Synchronized="2017-08-05 16:54:17.0")
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

@XendraTrl(Identifier="3258e613-4f36-6b56-a931-7b9bd734577e")
public static String es_PE_FIELD_Issues_LineNo_Description="No. Línea único para este documento";

@XendraTrl(Identifier="3258e613-4f36-6b56-a931-7b9bd734577e")
public static String es_PE_FIELD_Issues_LineNo_Help="Indica el No. Línea para un documento. También controlará el orden de despliegue de las líneas dentro de un documento";

@XendraTrl(Identifier="3258e613-4f36-6b56-a931-7b9bd734577e")
public static String es_PE_FIELD_Issues_LineNo_Name="No. Línea";
@XendraField(AD_Column_ID="Line",
IsCentrallyMaintained=true,AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=70,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="3258e613-4f36-6b56-a931-7b9bd734577e")
public static final String FIELDNAME_Issues_LineNo="3258e613-4f36-6b56-a931-7b9bd734577e";

@XendraTrl(Identifier="891ac967-0918-8b74-d1e8-4d390d3ebfbe")
public static String es_PE_COLUMN_Line_Name="No. Línea";

@XendraColumn(AD_Element_ID="986ef077-61da-f9cf-1c6d-aefe3a35113b",ColumnName="Line",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,
DefaultValue="@SQL=SELECT COALESCE(MAX(Line),0)+10 AS DefaultValue FROM C_ProjectIssue WHERE C_Project_ID=@C_Project_ID@",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="891ac967-0918-8b74-d1e8-4d390d3ebfbe",
Synchronized="2017-08-05 16:54:17.0")
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

@XendraTrl(Identifier="d5db7519-0d80-b2cc-0340-f74c9c754bc5")
public static String es_PE_FIELD_Issues_AttributeSetInstance_Description="Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="d5db7519-0d80-b2cc-0340-f74c9c754bc5")
public static String es_PE_FIELD_Issues_AttributeSetInstance_Help="Valor actual de Instancia del conjunto de atributos del producto";

@XendraTrl(Identifier="d5db7519-0d80-b2cc-0340-f74c9c754bc5")
public static String es_PE_FIELD_Issues_AttributeSetInstance_Name="Instancia del Conjunto de Atributos";

@XendraField(AD_Column_ID="M_AttributeSetInstance_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=100,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d5db7519-0d80-b2cc-0340-f74c9c754bc5")
public static final String FIELDNAME_Issues_AttributeSetInstance="d5db7519-0d80-b2cc-0340-f74c9c754bc5";

@XendraTrl(Identifier="513d7cb0-e0c4-6946-99f5-8e8bf7bcfde0")
public static String es_PE_COLUMN_M_AttributeSetInstance_ID_Name="Instancia del Conjunto de Atributos";

@XendraColumn(AD_Element_ID="137807f2-3c52-e193-3ceb-f10b819cf955",
ColumnName="M_AttributeSetInstance_ID",AD_Reference_ID=35,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="513d7cb0-e0c4-6946-99f5-8e8bf7bcfde0",Synchronized="2017-08-05 16:54:17.0")
/** Column name M_AttributeSetInstance_ID */
public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";
/** Set Shipment/Receipt Line.
@param M_InOutLine_ID Line on Shipment or Receipt document */
public void setM_InOutLine_ID (int M_InOutLine_ID)
{
if (M_InOutLine_ID <= 0) set_Value (COLUMNNAME_M_InOutLine_ID, null);
 else 
set_Value (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
}
/** Get Shipment/Receipt Line.
@return Line on Shipment or Receipt document */
public int getM_InOutLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="335dcbf6-594b-546f-7d18-101b4bb7e62a")
public static String es_PE_FIELD_Issues_ShipmentReceiptLine_Description="Item de entrega ó documento de recibo.";

@XendraTrl(Identifier="335dcbf6-594b-546f-7d18-101b4bb7e62a")
public static String es_PE_FIELD_Issues_ShipmentReceiptLine_Help="Indica un Item único en un documento de entrega / recibo";

@XendraTrl(Identifier="335dcbf6-594b-546f-7d18-101b4bb7e62a")
public static String es_PE_FIELD_Issues_ShipmentReceiptLine_Name="Item Entrega / Recibo";

@XendraField(AD_Column_ID="M_InOutLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=140,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="335dcbf6-594b-546f-7d18-101b4bb7e62a")
public static final String FIELDNAME_Issues_ShipmentReceiptLine="335dcbf6-594b-546f-7d18-101b4bb7e62a";

@XendraTrl(Identifier="e39f5dbf-e873-b57e-2d13-abf9e9fcd333")
public static String es_PE_COLUMN_M_InOutLine_ID_Name="Línea Entrega / Recibo";

@XendraColumn(AD_Element_ID="a4d9928e-fbec-fd6c-b061-d3dbbd7de02c",ColumnName="M_InOutLine_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e39f5dbf-e873-b57e-2d13-abf9e9fcd333",
Synchronized="2017-08-05 16:54:17.0")
/** Column name M_InOutLine_ID */
public static final String COLUMNNAME_M_InOutLine_ID = "M_InOutLine_ID";
/** Set Locator.
@param M_Locator_ID Warehouse Locator */
public void setM_Locator_ID (int M_Locator_ID)
{
if (M_Locator_ID < 1) throw new IllegalArgumentException ("M_Locator_ID is mandatory.");
set_Value (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
}
/** Get Locator.
@return Warehouse Locator */
public int getM_Locator_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1f134701-6bb5-b98c-2cbc-5980d9403b51")
public static String es_PE_FIELD_Issues_Locator_Description="Ubicación de Almacén";

@XendraTrl(Identifier="1f134701-6bb5-b98c-2cbc-5980d9403b51")
public static String es_PE_FIELD_Issues_Locator_Help="El ID de la ubicación indica en que parte del almacén se localiza el producto";

@XendraTrl(Identifier="1f134701-6bb5-b98c-2cbc-5980d9403b51")
public static String es_PE_FIELD_Issues_Locator_Name="Ubicación";

@XendraField(AD_Column_ID="M_Locator_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1f134701-6bb5-b98c-2cbc-5980d9403b51")
public static final String FIELDNAME_Issues_Locator="1f134701-6bb5-b98c-2cbc-5980d9403b51";

@XendraTrl(Identifier="1d403dd3-f6d3-63a4-d10f-4f8cb9209008")
public static String es_PE_COLUMN_M_Locator_ID_Name="Ubicación";

@XendraColumn(AD_Element_ID="67f044ce-2864-93f9-fd0d-320945150933",ColumnName="M_Locator_ID",
AD_Reference_ID=31,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="1d403dd3-f6d3-63a4-d10f-4f8cb9209008",
Synchronized="2017-08-05 16:54:17.0")
/** Column name M_Locator_ID */
public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";
/** Set Movement Date.
@param MovementDate Date a product was moved in or out of inventory */
public void setMovementDate (Timestamp MovementDate)
{
if (MovementDate == null) throw new IllegalArgumentException ("MovementDate is mandatory.");
set_Value (COLUMNNAME_MovementDate, MovementDate);
}
/** Get Movement Date.
@return Date a product was moved in or out of inventory */
public Timestamp getMovementDate() 
{
return (Timestamp)get_Value(COLUMNNAME_MovementDate);
}

@XendraTrl(Identifier="a56f091c-36d2-0f7c-d4f4-d03f342aefbf")
public static String es_PE_FIELD_Issues_MovementDate_Description="Fecha en que un producto fue movido (dentro ó fuera) del inventario";

@XendraTrl(Identifier="a56f091c-36d2-0f7c-d4f4-d03f342aefbf")
public static String es_PE_FIELD_Issues_MovementDate_Help="La fecha del movimiento indica la fecha en que el producto es movido. Éste es el resultado de un embarque; recibo ó movimiento de inventario.";

@XendraTrl(Identifier="a56f091c-36d2-0f7c-d4f4-d03f342aefbf")
public static String es_PE_FIELD_Issues_MovementDate_Name="Fecha de Movimiento";

@XendraField(AD_Column_ID="MovementDate",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="a56f091c-36d2-0f7c-d4f4-d03f342aefbf")
public static final String FIELDNAME_Issues_MovementDate="a56f091c-36d2-0f7c-d4f4-d03f342aefbf";

@XendraTrl(Identifier="88ce5a00-1414-f836-efff-82e9a819fab5")
public static String es_PE_COLUMN_MovementDate_Name="Fecha de Movimiento";

@XendraColumn(AD_Element_ID="7a907f01-8525-820d-22d4-98b06d4b902b",ColumnName="MovementDate",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="88ce5a00-1414-f836-efff-82e9a819fab5",
Synchronized="2017-08-05 16:54:17.0")
/** Column name MovementDate */
public static final String COLUMNNAME_MovementDate = "MovementDate";
/** Set Movement Quantity.
@param MovementQty Quantity of a product moved. */
public void setMovementQty (BigDecimal MovementQty)
{
if (MovementQty == null) throw new IllegalArgumentException ("MovementQty is mandatory.");
set_Value (COLUMNNAME_MovementQty, MovementQty);
}
/** Get Movement Quantity.
@return Quantity of a product moved. */
public BigDecimal getMovementQty() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MovementQty);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="251eae32-4439-8dd2-20a0-f452faaeff6b")
public static String es_PE_FIELD_Issues_MovementQuantity_Description="Cantidad de un producto movido";

@XendraTrl(Identifier="251eae32-4439-8dd2-20a0-f452faaeff6b")
public static String es_PE_FIELD_Issues_MovementQuantity_Help="La Cantidad del Movimiento indica la cantidad de un producto que ha sido movido";

@XendraTrl(Identifier="251eae32-4439-8dd2-20a0-f452faaeff6b")
public static String es_PE_FIELD_Issues_MovementQuantity_Name="Cantidad del Movimiento";

@XendraField(AD_Column_ID="MovementQty",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="251eae32-4439-8dd2-20a0-f452faaeff6b")
public static final String FIELDNAME_Issues_MovementQuantity="251eae32-4439-8dd2-20a0-f452faaeff6b";

@XendraTrl(Identifier="ecb1397f-3247-83da-b6a3-a83318eb5770")
public static String es_PE_COLUMN_MovementQty_Name="Cantidad del Movimiento";

@XendraColumn(AD_Element_ID="36c2f62a-1d3b-a3ff-a433-9fc2eec47380",ColumnName="MovementQty",
AD_Reference_ID=29,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=3,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ecb1397f-3247-83da-b6a3-a83318eb5770",
Synchronized="2017-08-05 16:54:17.0")
/** Column name MovementQty */
public static final String COLUMNNAME_MovementQty = "MovementQty";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
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

@XendraTrl(Identifier="65f9e8e0-db5c-38fd-3e10-c04247397e64")
public static String es_PE_FIELD_Issues_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="65f9e8e0-db5c-38fd-3e10-c04247397e64")
public static String es_PE_FIELD_Issues_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="65f9e8e0-db5c-38fd-3e10-c04247397e64")
public static String es_PE_FIELD_Issues_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="65f9e8e0-db5c-38fd-3e10-c04247397e64")
public static final String FIELDNAME_Issues_Product="65f9e8e0-db5c-38fd-3e10-c04247397e64";

@XendraTrl(Identifier="0778af9a-c2fe-6a8c-1786-ae2ea14a1198")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="0778af9a-c2fe-6a8c-1786-ae2ea14a1198",Synchronized="2017-08-05 16:54:17.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Posted.
@param Posted Posting status */
public void setPosted (boolean Posted)
{
set_Value (COLUMNNAME_Posted, Boolean.valueOf(Posted));
}
/** Get Posted.
@return Posting status */
public boolean isPosted() 
{
Object oo = get_Value(COLUMNNAME_Posted);
if (oo != null) 
{
 if (oo instanceof Boolean) return ((Boolean)oo).booleanValue();
 return "Y".equals(oo);
}
return false;
}

@XendraTrl(Identifier="42f2d6ef-e33e-fa14-c5bd-bb31405b7a06")
public static String es_PE_FIELD_Issues_Posted_Description="Las transacciones de contabilidad general han sido procesadas.";

@XendraTrl(Identifier="42f2d6ef-e33e-fa14-c5bd-bb31405b7a06")
public static String es_PE_FIELD_Issues_Posted_Help="El campo fijado indica el estado de la generación de las Líneas contables a la contabilidad general.";

@XendraTrl(Identifier="42f2d6ef-e33e-fa14-c5bd-bb31405b7a06")
public static String es_PE_FIELD_Issues_Posted_Name="Fijada";
@XendraField(AD_Column_ID="Posted",
IsCentrallyMaintained=true,AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="@Processed@=Y & @#ShowAcct@=Y",DisplayLength=23,IsReadOnly=false,
SeqNo=170,SortNo=0,IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="42f2d6ef-e33e-fa14-c5bd-bb31405b7a06")
public static final String FIELDNAME_Issues_Posted="42f2d6ef-e33e-fa14-c5bd-bb31405b7a06";

@XendraTrl(Identifier="6eeb9b37-7013-f64f-ddbe-f6085d44479c")
public static String es_PE_COLUMN_Posted_Name="Fijada";

@XendraColumn(AD_Element_ID="5eb52ebc-6992-12f5-b85a-e0a136df259b",ColumnName="Posted",
AD_Reference_ID=28,AD_Reference_Value_ID="d2b659dd-6c8c-baf3-fc71-0ee997273154",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="N",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6eeb9b37-7013-f64f-ddbe-f6085d44479c",Synchronized="2017-08-05 16:54:17.0")
/** Column name Posted */
public static final String COLUMNNAME_Posted = "Posted";
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

@XendraTrl(Identifier="b915b599-d6a4-368e-7653-bebae890d640")
public static String es_PE_FIELD_Issues_Processed_Description="El documento ha sido procesado";

@XendraTrl(Identifier="b915b599-d6a4-368e-7653-bebae890d640")
public static String es_PE_FIELD_Issues_Processed_Help="El cuadro de verificación procesada indica que un documento ha sido procesado";

@XendraTrl(Identifier="b915b599-d6a4-368e-7653-bebae890d640")
public static String es_PE_FIELD_Issues_Processed_Name="Procesado";

@XendraField(AD_Column_ID="Processed",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=160,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b915b599-d6a4-368e-7653-bebae890d640")
public static final String FIELDNAME_Issues_Processed="b915b599-d6a4-368e-7653-bebae890d640";

@XendraTrl(Identifier="ff3cb4ef-01db-d049-35d7-eca1935ac0ae")
public static String es_PE_COLUMN_Processed_Name="Procesado";

@XendraColumn(AD_Element_ID="3f7035d2-fa5e-7416-fc0c-e49e43f9e083",ColumnName="Processed",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ff3cb4ef-01db-d049-35d7-eca1935ac0ae",
Synchronized="2017-08-05 16:54:17.0")
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

@XendraTrl(Identifier="c92643e6-2943-1841-3c7c-6083715c335e")
public static String es_PE_FIELD_Issues_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=20,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c92643e6-2943-1841-3c7c-6083715c335e")
public static final String FIELDNAME_Issues_ProcessNow="c92643e6-2943-1841-3c7c-6083715c335e";

@XendraTrl(Identifier="aa9d0f31-97d4-784a-7036-d9656415ef3b")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=20,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="N",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="aa9d0f31-97d4-784a-7036-d9656415ef3b",
Synchronized="2017-08-05 16:54:17.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
/** Set Expense Line.
@param S_TimeExpenseLine_ID Time and Expense Report Line */
public void setS_TimeExpenseLine_ID (int S_TimeExpenseLine_ID)
{
if (S_TimeExpenseLine_ID <= 0) set_Value (COLUMNNAME_S_TimeExpenseLine_ID, null);
 else 
set_Value (COLUMNNAME_S_TimeExpenseLine_ID, Integer.valueOf(S_TimeExpenseLine_ID));
}
/** Get Expense Line.
@return Time and Expense Report Line */
public int getS_TimeExpenseLine_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_TimeExpenseLine_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="55b5b6ee-c466-44c7-ba54-d5453b155846")
public static String es_PE_FIELD_Issues_ExpenseLine_Description="Item de informe de tiempo y gasto.";

@XendraTrl(Identifier="55b5b6ee-c466-44c7-ba54-d5453b155846")
public static String es_PE_FIELD_Issues_ExpenseLine_Name="Item de Gasto";

@XendraField(AD_Column_ID="S_TimeExpenseLine_ID",IsCentrallyMaintained=true,
AD_Tab_ID="45120dc3-feab-fcba-b147-fb1a48cabe2e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=true,SeqNo=150,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="55b5b6ee-c466-44c7-ba54-d5453b155846")
public static final String FIELDNAME_Issues_ExpenseLine="55b5b6ee-c466-44c7-ba54-d5453b155846";

@XendraTrl(Identifier="26b6532d-d7b8-945d-f660-b38821e26b3f")
public static String es_PE_COLUMN_S_TimeExpenseLine_ID_Name="Línea de Gasto";

@XendraColumn(AD_Element_ID="fdc3026d-532f-f17c-aeb5-bda1203240c4",
ColumnName="S_TimeExpenseLine_ID",AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="26b6532d-d7b8-945d-f660-b38821e26b3f",Synchronized="2017-08-05 16:54:17.0")
/** Column name S_TimeExpenseLine_ID */
public static final String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";
}
