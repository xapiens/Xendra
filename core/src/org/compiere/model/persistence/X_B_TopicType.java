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
/** Generated Model for B_TopicType
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_B_TopicType extends PO
{
/** Standard Constructor
@param ctx context
@param B_TopicType_ID id
@param trxName transaction
*/
public X_B_TopicType (Properties ctx, int B_TopicType_ID, String trxName)
{
super (ctx, B_TopicType_ID, trxName);
/** if (B_TopicType_ID == 0)
{
setAuctionType (null);
setB_TopicType_ID (0);
setM_PriceList_ID (0);
setM_Product_ID (0);
setM_ProductMember_ID (0);
setName (null);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_B_TopicType (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=690 */
public static int Table_ID=MTable.getTable_ID("B_TopicType");

@XendraTrl(Identifier="06bb984e-1a81-9423-fbc8-6847efff8641")
public static String es_PE_TAB_TopicType_Description="Tipo del asunto de la subasta";

@XendraTrl(Identifier="06bb984e-1a81-9423-fbc8-6847efff8641")
public static String es_PE_TAB_TopicType_Help="El tipo del asunto de la subasta determina qué clase de subasta se utiliza para un área particular";

@XendraTrl(Identifier="06bb984e-1a81-9423-fbc8-6847efff8641")
public static String es_PE_TAB_TopicType_Name="Tipo Asunto";
@XendraTab(Name="Topic Type",
Description="Auction Topic Type",
Help="The Auction Topic Type determines what kind of auction is used for a particular area",
AD_Window_ID="19b182c9-83df-8f00-42e9-b1efb901fcbd",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="06bb984e-1a81-9423-fbc8-6847efff8641",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_TopicType="06bb984e-1a81-9423-fbc8-6847efff8641";

@XendraTrl(Identifier="a7ffc282-ab8c-a656-ec1d-08a8810fc9a4")
public static String es_PE_TABLE_B_TopicType_Name="Tipo de Asunto";

@XendraTable(Name="Topic Type",AD_Package_ID="a0ba5f31-73ac-fb58-5a46-04ff03d1a8c1",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Auction Topic Type",Help="",
TableName="B_TopicType",AccessLevel="2",AD_Window_ID="19b182c9-83df-8f00-42e9-b1efb901fcbd",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=130,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.bids",
Identifier="a7ffc282-ab8c-a656-ec1d-08a8810fc9a4",Synchronized="2020-03-03 21:36:18.0")
/** TableName=B_TopicType */
public static final String Table_Name="B_TopicType";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"B_TopicType");

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
    Table_ID = MTable.getTable_ID("B_TopicType");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_B_TopicType[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Auction Type.
@param AuctionType Auction Type */
public void setAuctionType (String AuctionType)
{
if (AuctionType == null) throw new IllegalArgumentException ("AuctionType is mandatory.");
if (AuctionType.length() > 1)
{
log.warning("Length > 1 - truncated");
AuctionType = AuctionType.substring(0,0);
}
set_Value (COLUMNNAME_AuctionType, AuctionType);
}
/** Get Auction Type.
@return Auction Type */
public String getAuctionType() 
{
return (String)get_Value(COLUMNNAME_AuctionType);
}

@XendraTrl(Identifier="c843035d-7343-42ff-ce51-d3619a547e72")
public static String es_PE_FIELD_TopicType_AuctionType_Name="Tipo de Subasta";

@XendraField(AD_Column_ID="AuctionType",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c843035d-7343-42ff-ce51-d3619a547e72")
public static final String FIELDNAME_TopicType_AuctionType="c843035d-7343-42ff-ce51-d3619a547e72";

@XendraTrl(Identifier="222be80d-c611-8cde-be0d-5a85f079e794")
public static String es_PE_COLUMN_AuctionType_Name="Tipo de Subasta";

@XendraColumn(AD_Element_ID="3d5bbbf2-7bd2-8cc4-aca9-0fbc1fa9af93",ColumnName="AuctionType",
AD_Reference_ID=17,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="222be80d-c611-8cde-be0d-5a85f079e794",
Synchronized="2019-08-30 22:20:58.0")
/** Column name AuctionType */
public static final String COLUMNNAME_AuctionType = "AuctionType";
/** Set Topic Type.
@param B_TopicType_ID Auction Topic Type */
public void setB_TopicType_ID (int B_TopicType_ID)
{
if (B_TopicType_ID < 1) throw new IllegalArgumentException ("B_TopicType_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_B_TopicType_ID, Integer.valueOf(B_TopicType_ID));
}
/** Get Topic Type.
@return Auction Topic Type */
public int getB_TopicType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_B_TopicType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ccb33fd2-f9e3-6e3f-105a-cd41434f77af")
public static String es_PE_FIELD_TopicType_TopicType_Name="Tipo de Asunto";

@XendraTrl(Identifier="ccb33fd2-f9e3-6e3f-105a-cd41434f77af")
public static String es_PE_FIELD_TopicType_TopicType_Description="Tipo de Asunto";

@XendraTrl(Identifier="ccb33fd2-f9e3-6e3f-105a-cd41434f77af")
public static String es_PE_FIELD_TopicType_TopicType_Help="El tipo de asunto determina qué clase de subasta se utiliza para un área en particular";

@XendraField(AD_Column_ID="B_TopicType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ccb33fd2-f9e3-6e3f-105a-cd41434f77af")
public static final String FIELDNAME_TopicType_TopicType="ccb33fd2-f9e3-6e3f-105a-cd41434f77af";
/** Column name B_TopicType_ID */
public static final String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";
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

@XendraTrl(Identifier="2e31b77d-e006-5b84-1e03-756a61d76336")
public static String es_PE_FIELD_TopicType_Description_Name="Observación";

@XendraTrl(Identifier="2e31b77d-e006-5b84-1e03-756a61d76336")
public static String es_PE_FIELD_TopicType_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="2e31b77d-e006-5b84-1e03-756a61d76336")
public static String es_PE_FIELD_TopicType_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="2e31b77d-e006-5b84-1e03-756a61d76336")
public static final String FIELDNAME_TopicType_Description="2e31b77d-e006-5b84-1e03-756a61d76336";

@XendraTrl(Identifier="059b9e9d-ea23-2883-02d5-004bf94a7d03")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="059b9e9d-ea23-2883-02d5-004bf94a7d03",
Synchronized="2019-08-30 22:20:58.0")
/** Column name Description */
public static final String COLUMNNAME_Description = "Description";
/** Set Comment/Help.
@param Help Comment or Hint */
public void setHelp (String Help)
{
if (Help != null && Help.length() > 2000)
{
log.warning("Length > 2000 - truncated");
Help = Help.substring(0,1999);
}
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

@XendraTrl(Identifier="493ae4d7-8162-c28b-51f4-c470edd277c5")
public static String es_PE_FIELD_TopicType_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="493ae4d7-8162-c28b-51f4-c470edd277c5")
public static String es_PE_FIELD_TopicType_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="493ae4d7-8162-c28b-51f4-c470edd277c5")
public static String es_PE_FIELD_TopicType_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="493ae4d7-8162-c28b-51f4-c470edd277c5")
public static final String FIELDNAME_TopicType_CommentHelp="493ae4d7-8162-c28b-51f4-c470edd277c5";

@XendraTrl(Identifier="61003949-6747-9715-ef60-e7cc0dbf1222")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="61003949-6747-9715-ef60-e7cc0dbf1222",
Synchronized="2019-08-30 22:20:58.0")
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
@XendraTrl(Identifier="50fc33bb-ef61-4cae-8ce6-0c767c670ae8")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="50fc33bb-ef61-4cae-8ce6-0c767c670ae8",
Synchronized="2019-08-30 22:20:58.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set M_PriceList_ID.
@param M_PriceList_ID Unique identifier of a Price List */
public void setM_PriceList_ID (int M_PriceList_ID)
{
if (M_PriceList_ID < 1) throw new IllegalArgumentException ("M_PriceList_ID is mandatory.");
set_Value (COLUMNNAME_M_PriceList_ID, Integer.valueOf(M_PriceList_ID));
}
/** Get M_PriceList_ID.
@return Unique identifier of a Price List */
public int getM_PriceList_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b2032f2a-a537-e9f3-339f-ce3495a306cb")
public static String es_PE_FIELD_TopicType_M_PriceList_ID_Name="Lista de Precios";

@XendraTrl(Identifier="b2032f2a-a537-e9f3-339f-ce3495a306cb")
public static String es_PE_FIELD_TopicType_M_PriceList_ID_Description="Identificador único de mi lista de precios";

@XendraTrl(Identifier="b2032f2a-a537-e9f3-339f-ce3495a306cb")
public static String es_PE_FIELD_TopicType_M_PriceList_ID_Help="Listas de precios son usadas para determinar el precio; margen y costo de artículos comprados ó vendidos.";

@XendraField(AD_Column_ID="M_PriceList_ID",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="b2032f2a-a537-e9f3-339f-ce3495a306cb")
public static final String FIELDNAME_TopicType_M_PriceList_ID="b2032f2a-a537-e9f3-339f-ce3495a306cb";

@XendraTrl(Identifier="669beba7-2660-695c-87a2-06000d2497f4")
public static String es_PE_COLUMN_M_PriceList_ID_Name="Lista de Precios";

@XendraColumn(AD_Element_ID="652afdd3-9ff1-082d-5831-6aad828e0e09",ColumnName="M_PriceList_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="669beba7-2660-695c-87a2-06000d2497f4",
Synchronized="2019-08-30 22:20:58.0")
/** Column name M_PriceList_ID */
public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";
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

@XendraTrl(Identifier="023d14a5-4777-16ed-05ec-5becb5b77964")
public static String es_PE_FIELD_TopicType_Product_Name="Producto";

@XendraTrl(Identifier="023d14a5-4777-16ed-05ec-5becb5b77964")
public static String es_PE_FIELD_TopicType_Product_Description="Producto; servicio ó artículo.";

@XendraTrl(Identifier="023d14a5-4777-16ed-05ec-5becb5b77964")
public static String es_PE_FIELD_TopicType_Product_Help="Identifica un artículo que puede ser comprado ó vendido es esta organización.";

@XendraField(AD_Column_ID="M_Product_ID",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="023d14a5-4777-16ed-05ec-5becb5b77964")
public static final String FIELDNAME_TopicType_Product="023d14a5-4777-16ed-05ec-5becb5b77964";

@XendraTrl(Identifier="83a79d86-8b26-80fd-4191-605e10a7e409")
public static String es_PE_COLUMN_M_Product_ID_Name="Producto";

@XendraColumn(AD_Element_ID="b4701f57-f2fc-567c-58e2-a6aefbc3932c",ColumnName="M_Product_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="4281f8eb-238e-6b28-eb66-8cc866e6312c",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="83a79d86-8b26-80fd-4191-605e10a7e409",Synchronized="2019-08-30 22:20:58.0")
/** Column name M_Product_ID */
public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";
/** Set Membership.
@param M_ProductMember_ID Product used to deternine the price of the membership for the topic type */
public void setM_ProductMember_ID (int M_ProductMember_ID)
{
if (M_ProductMember_ID < 1) throw new IllegalArgumentException ("M_ProductMember_ID is mandatory.");
set_Value (COLUMNNAME_M_ProductMember_ID, Integer.valueOf(M_ProductMember_ID));
}
/** Get Membership.
@return Product used to deternine the price of the membership for the topic type */
public int getM_ProductMember_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductMember_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="728e7ce7-007f-b2d4-0499-c291df0e5d37")
public static String es_PE_FIELD_TopicType_Membership_Name="Miembro";

@XendraTrl(Identifier="728e7ce7-007f-b2d4-0499-c291df0e5d37")
public static String es_PE_FIELD_TopicType_Membership_Description="Producto usado para determinar el precio de calidad de el miembro para el tipo de asunto.";

@XendraTrl(Identifier="728e7ce7-007f-b2d4-0499-c291df0e5d37")
public static String es_PE_FIELD_TopicType_Membership_Help="El asunto se puede requerir para pagar un horario de la calidad de miembro.";

@XendraField(AD_Column_ID="M_ProductMember_ID",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="728e7ce7-007f-b2d4-0499-c291df0e5d37")
public static final String FIELDNAME_TopicType_Membership="728e7ce7-007f-b2d4-0499-c291df0e5d37";

@XendraTrl(Identifier="2a79ada6-fdde-ea36-b34f-46b72e895b49")
public static String es_PE_COLUMN_M_ProductMember_ID_Name="Miembro";

@XendraColumn(AD_Element_ID="ea3fbee8-b54d-dc9b-6a06-a0d732add1dc",ColumnName="M_ProductMember_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="28b49c4d-0409-b2e0-b70e-d686f8d6503f",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="2a79ada6-fdde-ea36-b34f-46b72e895b49",Synchronized="2019-08-30 22:20:58.0")
/** Column name M_ProductMember_ID */
public static final String COLUMNNAME_M_ProductMember_ID = "M_ProductMember_ID";
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

@XendraTrl(Identifier="bbf01185-faec-0324-22c9-11e58a3d5529")
public static String es_PE_FIELD_TopicType_Name_Name="Nombre";

@XendraTrl(Identifier="bbf01185-faec-0324-22c9-11e58a3d5529")
public static String es_PE_FIELD_TopicType_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="bbf01185-faec-0324-22c9-11e58a3d5529")
public static String es_PE_FIELD_TopicType_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="06bb984e-1a81-9423-fbc8-6847efff8641",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="bbf01185-faec-0324-22c9-11e58a3d5529")
public static final String FIELDNAME_TopicType_Name="bbf01185-faec-0324-22c9-11e58a3d5529";

@XendraTrl(Identifier="6f8063d9-20ae-b7a7-499f-9d99300df50c")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="6f8063d9-20ae-b7a7-499f-9d99300df50c",
Synchronized="2019-08-30 22:20:58.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
}
