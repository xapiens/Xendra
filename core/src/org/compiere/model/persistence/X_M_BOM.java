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
import org.compiere.model.reference.REF_M_BOMType;
import org.compiere.model.reference.REF_M_BOMUse;
/** Generated Model for M_BOM
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_BOM extends PO
{
/** Standard Constructor
@param ctx context
@param M_BOM_ID id
@param trxName transaction
*/
public X_M_BOM (Properties ctx, int M_BOM_ID, String trxName)
{
super (ctx, M_BOM_ID, trxName);
/** if (M_BOM_ID == 0)
{
setBOMType (null);	
// A
setBOMUse (null);	
// A
setM_BOM_ID (0);
setM_Product_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_BOM (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=798 */
public static int Table_ID=MTable.getTable_ID("M_BOM");

@XendraTrl(Identifier="9785c10f-a3e7-a184-10e2-186c38969f29")
public static String es_PE_TAB_BOM_Description="Aviso de Cambio de LDM";

@XendraTrl(Identifier="9785c10f-a3e7-a184-10e2-186c38969f29")
public static String es_PE_TAB_BOM_Name="LDM";
@XendraTab(Name="BOM",
Description="Bill of Material of Change Notice",Help="",
AD_Window_ID="64b6deef-ba6e-76a9-8b1f-78e36f73c8f1",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=true,
AD_Column_ID="5fbc52cd-6cde-b1c7-3eca-7aa5b28de102",HasTree=false,WhereClause="",OrderByClause="",
CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",
IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=false,
IsAdvancedTab=false,Parent_Column_ID="",Identifier="9785c10f-a3e7-a184-10e2-186c38969f29",
Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BOM="9785c10f-a3e7-a184-10e2-186c38969f29";

@XendraTrl(Identifier="1e49e24f-8d78-9c77-7616-fc654f85d735")
public static String es_PE_TAB_BOM2_Description="Lista de Materiales";

@XendraTrl(Identifier="1e49e24f-8d78-9c77-7616-fc654f85d735")
public static String es_PE_TAB_BOM2_Name="LDM";
@XendraTab(Name="BOM",
Description="Bill of Materials",Help="",AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",
SeqNo=50,TabLevel=1,IsSingleRow=false,IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,
AD_Column_ID="",HasTree=false,WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",
AD_ColumnSortOrder_ID="",AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",
ReadOnlyLogic="",DisplayLogic="",IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="1e49e24f-8d78-9c77-7616-fc654f85d735",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BOM2="1e49e24f-8d78-9c77-7616-fc654f85d735";

@XendraTrl(Identifier="293d6bcc-0484-1dcb-cfb6-a731540bac2d")
public static String es_PE_TABLE_M_BOM_Name="LDM";

@XendraTable(Name="BOM",Description="Bill of Material",Help="",TableName="M_BOM",AccessLevel="3",
AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",AD_Val_Rule_ID="",IsKey=1,LoadSeq=140,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="293d6bcc-0484-1dcb-cfb6-a731540bac2d",
Synchronized="2017-08-16 11:43:06.0")
/** TableName=M_BOM */
public static final String Table_Name="M_BOM";


@XendraIndex(Name="m_bom_productversiontype",Identifier="57fe251b-13e4-6b3b-ed56-6fc5ef7ad334",
Column_Names="m_product_id, m_changenotice_id",IsUnique="true",
TableIdentifier="57fe251b-13e4-6b3b-ed56-6fc5ef7ad334",Synchronized="2014-06-01 19:03:58.0")
public static final String INDEXNAME_m_bom_productversiontype = "57fe251b-13e4-6b3b-ed56-6fc5ef7ad334";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_BOM");

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
    Table_ID = MTable.getTable_ID("M_BOM");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_BOM[").append(get_ID()).append("]");
return sb.toString();
}

/** BOMType AD_Reference=d1377b1e-da8b-eb9d-fa1d-c3ba010160f7 */
public static final int BOMTYPE_AD_Reference_ID=347;
/** Set BOM Type.
@param BOMType Type of BOM */
public void setBOMType (String BOMType)
{
if (BOMType == null) throw new IllegalArgumentException ("BOMType is mandatory");
if (BOMType.equals(REF_M_BOMType.CurrentActive) || BOMType.equals(REF_M_BOMType.Make_To_Order) || BOMType.equals(REF_M_BOMType.Previous) || BOMType.equals(REF_M_BOMType.PreviousSpare) || BOMType.equals(REF_M_BOMType.Maintenance) || BOMType.equals(REF_M_BOMType.Repair) || BOMType.equals(REF_M_BOMType.Future));
 else throw new IllegalArgumentException ("BOMType Invalid value - " + BOMType + " - Reference_ID=347 - A - O - P - S - M - R - F");
if (BOMType.length() > 1)
{
log.warning("Length > 1 - truncated");
BOMType = BOMType.substring(0,0);
}
set_Value (COLUMNNAME_BOMType, BOMType);
}
/** Get BOM Type.
@return Type of BOM */
public String getBOMType() 
{
return (String)get_Value(COLUMNNAME_BOMType);
}

@XendraTrl(Identifier="6fe6d829-53b9-e5c5-d955-0d874d7ff927")
public static String es_PE_FIELD_BOM_BOMType_Description="Tipo de LDM";

@XendraTrl(Identifier="6fe6d829-53b9-e5c5-d955-0d874d7ff927")
public static String es_PE_FIELD_BOM_BOMType_Help="Tipo de Lista de Materiales";

@XendraTrl(Identifier="6fe6d829-53b9-e5c5-d955-0d874d7ff927")
public static String es_PE_FIELD_BOM_BOMType_Name="Tipo LDM";
@XendraField(AD_Column_ID="BOMType",
IsCentrallyMaintained=true,AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6fe6d829-53b9-e5c5-d955-0d874d7ff927")
public static final String FIELDNAME_BOM_BOMType="6fe6d829-53b9-e5c5-d955-0d874d7ff927";

@XendraTrl(Identifier="f2906c17-a605-cc88-7d88-f7173f5a9fcb")
public static String es_PE_FIELD_BOM_BOMType2_Description="Tipo de LDM";

@XendraTrl(Identifier="f2906c17-a605-cc88-7d88-f7173f5a9fcb")
public static String es_PE_FIELD_BOM_BOMType2_Help="Tipo de Lista de Materiales";

@XendraTrl(Identifier="f2906c17-a605-cc88-7d88-f7173f5a9fcb")
public static String es_PE_FIELD_BOM_BOMType2_Name="Tipo LDM";
@XendraField(AD_Column_ID="BOMType",
IsCentrallyMaintained=true,AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="f2906c17-a605-cc88-7d88-f7173f5a9fcb")
public static final String FIELDNAME_BOM_BOMType2="f2906c17-a605-cc88-7d88-f7173f5a9fcb";

@XendraTrl(Identifier="342835c7-3a47-3bfd-1023-69c7ab86800e")
public static String es_PE_COLUMN_BOMType_Name="Tipo LDM";

@XendraColumn(AD_Element_ID="21ef1f6f-19df-c093-92ae-16d50df3c14f",ColumnName="BOMType",
AD_Reference_ID=17,AD_Reference_Value_ID="d1377b1e-da8b-eb9d-fa1d-c3ba010160f7",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="342835c7-3a47-3bfd-1023-69c7ab86800e",Synchronized="2017-08-05 16:55:00.0")
/** Column name BOMType */
public static final String COLUMNNAME_BOMType = "BOMType";

/** BOMUse AD_Reference=e25746ad-3956-e607-c12a-677f0da9f3bb */
public static final int BOMUSE_AD_Reference_ID=348;
/** Set BOM Use.
@param BOMUse The use of the Bill of Material */
public void setBOMUse (String BOMUse)
{
if (BOMUse == null) throw new IllegalArgumentException ("BOMUse is mandatory");
if (BOMUse.equals(REF_M_BOMUse.Master) || BOMUse.equals(REF_M_BOMUse.Engineering) || BOMUse.equals(REF_M_BOMUse.Manufacturing) || BOMUse.equals(REF_M_BOMUse.Planning));
 else throw new IllegalArgumentException ("BOMUse Invalid value - " + BOMUse + " - Reference_ID=348 - A - E - M - P");
if (BOMUse.length() > 1)
{
log.warning("Length > 1 - truncated");
BOMUse = BOMUse.substring(0,0);
}
set_Value (COLUMNNAME_BOMUse, BOMUse);
}
/** Get BOM Use.
@return The use of the Bill of Material */
public String getBOMUse() 
{
return (String)get_Value(COLUMNNAME_BOMUse);
}

@XendraTrl(Identifier="b9026004-3c9f-d277-78fe-6621668dd11b")
public static String es_PE_FIELD_BOM_BOMUse_Description="Uso de lista de materiales.";

@XendraTrl(Identifier="b9026004-3c9f-d277-78fe-6621668dd11b")
public static String es_PE_FIELD_BOM_BOMUse_Help="El predeterminado de la LDM es usado, Si hay alternativos no estan definidos.";

@XendraTrl(Identifier="b9026004-3c9f-d277-78fe-6621668dd11b")
public static String es_PE_FIELD_BOM_BOMUse_Name="LDM Usada";
@XendraField(AD_Column_ID="BOMUse",
IsCentrallyMaintained=true,AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b9026004-3c9f-d277-78fe-6621668dd11b")
public static final String FIELDNAME_BOM_BOMUse="b9026004-3c9f-d277-78fe-6621668dd11b";

@XendraTrl(Identifier="954b644e-6102-b1a5-430c-8a8e4c94afc3")
public static String es_PE_FIELD_BOM_BOMUse2_Description="Uso de lista de materiales.";

@XendraTrl(Identifier="954b644e-6102-b1a5-430c-8a8e4c94afc3")
public static String es_PE_FIELD_BOM_BOMUse2_Help="El predeterminado de la LDM es usado, Si hay alternativos no estan definidos.";

@XendraTrl(Identifier="954b644e-6102-b1a5-430c-8a8e4c94afc3")
public static String es_PE_FIELD_BOM_BOMUse2_Name="LDM Usada";
@XendraField(AD_Column_ID="BOMUse",
IsCentrallyMaintained=true,AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="954b644e-6102-b1a5-430c-8a8e4c94afc3")
public static final String FIELDNAME_BOM_BOMUse2="954b644e-6102-b1a5-430c-8a8e4c94afc3";

@XendraTrl(Identifier="7f004207-0f52-6dd4-ffb6-a79e34e86429")
public static String es_PE_COLUMN_BOMUse_Name="LDM Usada";

@XendraColumn(AD_Element_ID="51c5a43a-3051-3ff5-ee0e-3bf4cfd76aee",ColumnName="BOMUse",
AD_Reference_ID=17,AD_Reference_Value_ID="e25746ad-3956-e607-c12a-677f0da9f3bb",AD_Val_Rule_ID="",
FieldLength=1,DefaultValue="A",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7f004207-0f52-6dd4-ffb6-a79e34e86429",Synchronized="2017-08-05 16:55:00.0")
/** Column name BOMUse */
public static final String COLUMNNAME_BOMUse = "BOMUse";
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

@XendraTrl(Identifier="3710bd0e-1bc7-9a7d-3a8e-07b8888abd40")
public static String es_PE_FIELD_BOM_Description_Description="Observación";

@XendraTrl(Identifier="3710bd0e-1bc7-9a7d-3a8e-07b8888abd40")
public static String es_PE_FIELD_BOM_Description_Help="Observación";

@XendraTrl(Identifier="3710bd0e-1bc7-9a7d-3a8e-07b8888abd40")
public static String es_PE_FIELD_BOM_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3710bd0e-1bc7-9a7d-3a8e-07b8888abd40")
public static final String FIELDNAME_BOM_Description="3710bd0e-1bc7-9a7d-3a8e-07b8888abd40";

@XendraTrl(Identifier="9e352023-5d7e-d02b-c8c5-c857980887dd")
public static String es_PE_FIELD_BOM_Description2_Description="Observación";

@XendraTrl(Identifier="9e352023-5d7e-d02b-c8c5-c857980887dd")
public static String es_PE_FIELD_BOM_Description2_Help="Observación";

@XendraTrl(Identifier="9e352023-5d7e-d02b-c8c5-c857980887dd")
public static String es_PE_FIELD_BOM_Description2_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9e352023-5d7e-d02b-c8c5-c857980887dd")
public static final String FIELDNAME_BOM_Description2="9e352023-5d7e-d02b-c8c5-c857980887dd";

@XendraTrl(Identifier="bc7cfc6d-5212-c134-ee0d-d792180c9210")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="bc7cfc6d-5212-c134-ee0d-d792180c9210",
Synchronized="2017-08-05 16:55:00.0")
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

@XendraTrl(Identifier="d48996f3-22b3-31cc-46d9-7573f4892921")
public static String es_PE_FIELD_BOM_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="d48996f3-22b3-31cc-46d9-7573f4892921")
public static String es_PE_FIELD_BOM_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="d48996f3-22b3-31cc-46d9-7573f4892921")
public static String es_PE_FIELD_BOM_CommentHelp_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d48996f3-22b3-31cc-46d9-7573f4892921")
public static final String FIELDNAME_BOM_CommentHelp="d48996f3-22b3-31cc-46d9-7573f4892921";

@XendraTrl(Identifier="ae8e6b7e-d10e-b3e0-8a37-1d58b5a5056d")
public static String es_PE_FIELD_BOM_CommentHelp2_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="ae8e6b7e-d10e-b3e0-8a37-1d58b5a5056d")
public static String es_PE_FIELD_BOM_CommentHelp2_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraTrl(Identifier="ae8e6b7e-d10e-b3e0-8a37-1d58b5a5056d")
public static String es_PE_FIELD_BOM_CommentHelp2_Name="Ayuda";
@XendraField(AD_Column_ID="Help",
IsCentrallyMaintained=true,AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="ae8e6b7e-d10e-b3e0-8a37-1d58b5a5056d")
public static final String FIELDNAME_BOM_CommentHelp2="ae8e6b7e-d10e-b3e0-8a37-1d58b5a5056d";

@XendraTrl(Identifier="8a9cb4ae-e4f9-d81d-4507-b76fa6b45811")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a9cb4ae-e4f9-d81d-4507-b76fa6b45811",
Synchronized="2017-08-05 16:55:00.0")
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
@XendraTrl(Identifier="4bb9dee0-4433-4c67-ad3f-d35eff37cc46")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4bb9dee0-4433-4c67-ad3f-d35eff37cc46",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set BOM.
@param M_BOM_ID Bill of Material */
public void setM_BOM_ID (int M_BOM_ID)
{
if (M_BOM_ID < 1) throw new IllegalArgumentException ("M_BOM_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_BOM_ID, Integer.valueOf(M_BOM_ID));
}
/** Get BOM.
@return Bill of Material */
public int getM_BOM_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_BOM_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="6efafd1e-f3a6-f9a8-2104-045721638822")
public static String es_PE_FIELD_BOM_BOM_Description="Lista de materiales";

@XendraTrl(Identifier="6efafd1e-f3a6-f9a8-2104-045721638822")
public static String es_PE_FIELD_BOM_BOM_Help="La composición de el producto.";

@XendraTrl(Identifier="6efafd1e-f3a6-f9a8-2104-045721638822")
public static String es_PE_FIELD_BOM_BOM_Name="LDM";
@XendraField(AD_Column_ID="M_BOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",
IsDisplayed=false,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="6efafd1e-f3a6-f9a8-2104-045721638822")
public static final String FIELDNAME_BOM_BOM="6efafd1e-f3a6-f9a8-2104-045721638822";

@XendraTrl(Identifier="709a8c37-8d9d-5b76-84b3-23caded0d9f9")
public static String es_PE_FIELD_BOM_BOM2_Description="Lista de materiales";

@XendraTrl(Identifier="709a8c37-8d9d-5b76-84b3-23caded0d9f9")
public static String es_PE_FIELD_BOM_BOM2_Help="La composición de el producto.";

@XendraTrl(Identifier="709a8c37-8d9d-5b76-84b3-23caded0d9f9")
public static String es_PE_FIELD_BOM_BOM2_Name="LDM";
@XendraField(AD_Column_ID="M_BOM_ID",
IsCentrallyMaintained=true,AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=50,SortNo=1,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="709a8c37-8d9d-5b76-84b3-23caded0d9f9")
public static final String FIELDNAME_BOM_BOM2="709a8c37-8d9d-5b76-84b3-23caded0d9f9";
/** Column name M_BOM_ID */
public static final String COLUMNNAME_M_BOM_ID = "M_BOM_ID";
/** Set Change Notice.
@param M_ChangeNotice_ID Bill of Materials (Engineering) Change Notice (Version) */
public void setM_ChangeNotice_ID (int M_ChangeNotice_ID)
{
if (M_ChangeNotice_ID <= 0) set_Value (COLUMNNAME_M_ChangeNotice_ID, null);
 else 
set_Value (COLUMNNAME_M_ChangeNotice_ID, Integer.valueOf(M_ChangeNotice_ID));
}
/** Get Change Notice.
@return Bill of Materials (Engineering) Change Notice (Version) */
public int getM_ChangeNotice_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ChangeNotice_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="269a9dd9-2d64-0da3-845e-aa4dc888b9c3")
public static String es_PE_FIELD_BOM_ChangeNotice_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraTrl(Identifier="269a9dd9-2d64-0da3-845e-aa4dc888b9c3")
public static String es_PE_FIELD_BOM_ChangeNotice_Name="Aviso de Cambio";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="269a9dd9-2d64-0da3-845e-aa4dc888b9c3")
public static final String FIELDNAME_BOM_ChangeNotice="269a9dd9-2d64-0da3-845e-aa4dc888b9c3";

@XendraTrl(Identifier="2ddca6a5-1813-8c6e-0608-df3131107fd4")
public static String es_PE_FIELD_BOM_ChangeNotice2_Description="Cuenta de materiales (ingeniería) cambio de aviso (versión)";

@XendraTrl(Identifier="2ddca6a5-1813-8c6e-0608-df3131107fd4")
public static String es_PE_FIELD_BOM_ChangeNotice2_Name="Aviso de Cambio";

@XendraField(AD_Column_ID="M_ChangeNotice_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2ddca6a5-1813-8c6e-0608-df3131107fd4")
public static final String FIELDNAME_BOM_ChangeNotice2="2ddca6a5-1813-8c6e-0608-df3131107fd4";

@XendraTrl(Identifier="5fbc52cd-6cde-b1c7-3eca-7aa5b28de102")
public static String es_PE_COLUMN_M_ChangeNotice_ID_Name="Aviso de Cambio";

@XendraColumn(AD_Element_ID="9ef80c4a-fc78-9760-2916-157f9f8d80b3",ColumnName="M_ChangeNotice_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5fbc52cd-6cde-b1c7-3eca-7aa5b28de102",
Synchronized="2017-08-05 16:55:00.0")
/** Column name M_ChangeNotice_ID */
public static final String COLUMNNAME_M_ChangeNotice_ID = "M_ChangeNotice_ID";
/** Set Product.
@param M_Product_ID Product, Service, Item */
public void setM_Product_ID (int M_Product_ID)
{
if (M_Product_ID < 1) throw new IllegalArgumentException ("M_Product_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
}
/** Get Product.
@return Product, Service, Item */
public int getM_Product_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="0de6469b-b9f7-1e8a-6486-a8bbc02b9aeb")
public static String es_PE_FIELD_BOM_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="0de6469b-b9f7-1e8a-6486-a8bbc02b9aeb")
public static String es_PE_FIELD_BOM_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="0de6469b-b9f7-1e8a-6486-a8bbc02b9aeb")
public static String es_PE_FIELD_BOM_Product_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0de6469b-b9f7-1e8a-6486-a8bbc02b9aeb")
public static final String FIELDNAME_BOM_Product="0de6469b-b9f7-1e8a-6486-a8bbc02b9aeb";

@XendraTrl(Identifier="6057abfa-c1c1-6cb6-a992-f1b72b1bc91b")
public static String es_PE_FIELD_BOM_Product2_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="6057abfa-c1c1-6cb6-a992-f1b72b1bc91b")
public static String es_PE_FIELD_BOM_Product2_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraTrl(Identifier="6057abfa-c1c1-6cb6-a992-f1b72b1bc91b")
public static String es_PE_FIELD_BOM_Product2_Name="Producto";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="6057abfa-c1c1-6cb6-a992-f1b72b1bc91b")
public static final String FIELDNAME_BOM_Product2="6057abfa-c1c1-6cb6-a992-f1b72b1bc91b";

@XendraTrl(Identifier="76610741-be0b-71e6-82c5-f358a2d83a7f")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="76610741-be0b-71e6-82c5-f358a2d83a7f",Synchronized="2017-08-05 16:55:00.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
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

@XendraTrl(Identifier="d835022f-26a4-c773-4537-f8fc8268ac7d")
public static String es_PE_FIELD_BOM_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="d835022f-26a4-c773-4537-f8fc8268ac7d")
public static String es_PE_FIELD_BOM_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="d835022f-26a4-c773-4537-f8fc8268ac7d")
public static String es_PE_FIELD_BOM_Name_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="d835022f-26a4-c773-4537-f8fc8268ac7d")
public static final String FIELDNAME_BOM_Name="d835022f-26a4-c773-4537-f8fc8268ac7d";

@XendraTrl(Identifier="bda7a117-f21c-b0ce-b473-75943c302b87")
public static String es_PE_FIELD_BOM_Name2_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="bda7a117-f21c-b0ce-b473-75943c302b87")
public static String es_PE_FIELD_BOM_Name2_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="bda7a117-f21c-b0ce-b473-75943c302b87")
public static String es_PE_FIELD_BOM_Name2_Name="Nombre";
@XendraField(AD_Column_ID="Name",
IsCentrallyMaintained=true,AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=1,
IsSameLine=false,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="bda7a117-f21c-b0ce-b473-75943c302b87")
public static final String FIELDNAME_BOM_Name2="bda7a117-f21c-b0ce-b473-75943c302b87";

@XendraTrl(Identifier="028c6733-390d-f3ee-a0d1-37e52817f08a")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="028c6733-390d-f3ee-a0d1-37e52817f08a",
Synchronized="2017-08-05 16:55:00.0")
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

@XendraTrl(Identifier="643f57c5-5e74-25e6-f163-3b40fed543d1")
public static String es_PE_FIELD_BOM_ProcessNow_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="1e49e24f-8d78-9c77-7616-fc654f85d735",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="643f57c5-5e74-25e6-f163-3b40fed543d1")
public static final String FIELDNAME_BOM_ProcessNow="643f57c5-5e74-25e6-f163-3b40fed543d1";

@XendraTrl(Identifier="17ed3c8f-1fef-4528-7d20-3283f307f66b")
public static String es_PE_FIELD_BOM_ProcessNow2_Name="Procesar Ahora";

@XendraField(AD_Column_ID="Processing",IsCentrallyMaintained=true,
AD_Tab_ID="9785c10f-a3e7-a184-10e2-186c38969f29",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=23,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="17ed3c8f-1fef-4528-7d20-3283f307f66b")
public static final String FIELDNAME_BOM_ProcessNow2="17ed3c8f-1fef-4528-7d20-3283f307f66b";

@XendraTrl(Identifier="caa11a9b-fac2-c702-c1a7-2f6c4056afe1")
public static String es_PE_COLUMN_Processing_Name="Procesar Ahora";

@XendraColumn(AD_Element_ID="f2096404-1a98-35ec-09ea-273b3e19b7de",ColumnName="Processing",
AD_Reference_ID=28,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="caa11a9b-fac2-c702-c1a7-2f6c4056afe1",
Synchronized="2017-08-05 16:55:00.0")
/** Column name Processing */
public static final String COLUMNNAME_Processing = "Processing";
}
