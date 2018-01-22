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
/** Generated Model for M_Freight
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Freight extends PO
{
/** Standard Constructor
@param ctx context
@param M_Freight_ID id
@param trxName transaction
*/
public X_M_Freight (Properties ctx, int M_Freight_ID, String trxName)
{
super (ctx, M_Freight_ID, trxName);
/** if (M_Freight_ID == 0)
{
setC_Currency_ID (0);
setFreightAmt (Env.ZERO);	
// 0
setM_FreightCategory_ID (0);
setM_Freight_ID (0);
setM_Shipper_ID (0);
setValidFrom (new Timestamp(System.currentTimeMillis()));
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Freight (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=596 */
public static int Table_ID=MTable.getTable_ID("M_Freight");

@XendraTrl(Identifier="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e")
public static String es_PE_TAB_Freight_Description="Tarifas de Fletes";

@XendraTrl(Identifier="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e")
public static String es_PE_TAB_Freight_Name="Flete";

@XendraTrl(Identifier="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e")
public static String es_PE_TAB_Freight_Help="Tarifas de Fletes";
@XendraTab(Name="Freight",
Description="Freight Rates",Help="Freight Rates for Shipper",
AD_Window_ID="46135d20-8666-538b-b7c0-1e7d07971ac3",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Freight="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e";

@XendraTrl(Identifier="0cf75fd5-81f2-b5da-a652-fb33f4efd8ea")
public static String es_PE_TABLE_M_Freight_Name="Carga";

@XendraTable(Name="Freight",Description="Freight Rate",Help="",TableName="M_Freight",
AccessLevel="3",AD_Window_ID="46135d20-8666-538b-b7c0-1e7d07971ac3",AD_Val_Rule_ID="",IsKey=1,
LoadSeq=145,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,
IsView=false,PO_Window_ID="",ID="org.xendra.material",
Identifier="0cf75fd5-81f2-b5da-a652-fb33f4efd8ea",Synchronized="2017-08-16 11:43:11.0")
/** TableName=M_Freight */
public static final String Table_Name="M_Freight";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Freight");

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
    Table_ID = MTable.getTable_ID("M_Freight");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Freight[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Country_ID.
@param C_Country_ID Country  */
public void setC_Country_ID (int C_Country_ID)
{
if (C_Country_ID <= 0) set_Value (COLUMNNAME_C_Country_ID, null);
 else 
set_Value (COLUMNNAME_C_Country_ID, Integer.valueOf(C_Country_ID));
}
/** Get Country_ID.
@return Country  */
public int getC_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3d4e2fd9-0449-45a3-2d4a-4b76cf2dc3ce")
public static String es_PE_FIELD_Freight_Country_ID_Description="País";

@XendraTrl(Identifier="3d4e2fd9-0449-45a3-2d4a-4b76cf2dc3ce")
public static String es_PE_FIELD_Freight_Country_ID_Help="El país define un país. Cada país debe ser definido antes de que pueda ser usado en un documento.";

@XendraTrl(Identifier="3d4e2fd9-0449-45a3-2d4a-4b76cf2dc3ce")
public static String es_PE_FIELD_Freight_Country_ID_Name="País";

@XendraField(AD_Column_ID="C_Country_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="3d4e2fd9-0449-45a3-2d4a-4b76cf2dc3ce")
public static final String FIELDNAME_Freight_Country_ID="3d4e2fd9-0449-45a3-2d4a-4b76cf2dc3ce";

@XendraTrl(Identifier="f1e96a94-2137-fc01-4218-2905ee71be06")
public static String es_PE_COLUMN_C_Country_ID_Name="País";

@XendraColumn(AD_Element_ID="43379d46-930b-f17e-61f3-a1b7f02135c1",ColumnName="C_Country_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f1e96a94-2137-fc01-4218-2905ee71be06",
Synchronized="2017-08-05 16:55:06.0")
/** Column name C_Country_ID */
public static final String COLUMNNAME_C_Country_ID = "C_Country_ID";
/** Set Currency.
@param C_Currency_ID The Currency for this record */
public void setC_Currency_ID (int C_Currency_ID)
{
if (C_Currency_ID < 1) throw new IllegalArgumentException ("C_Currency_ID is mandatory.");
set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
}
/** Get Currency.
@return The Currency for this record */
public int getC_Currency_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="c1b08344-822b-8790-cb3a-e40145bf384f")
public static String es_PE_FIELD_Freight_Currency_Description="Moneda para este registro";

@XendraTrl(Identifier="c1b08344-822b-8790-cb3a-e40145bf384f")
public static String es_PE_FIELD_Freight_Currency_Help="Indica la moneda a ser usada cuando se procese ó Informe este registro";

@XendraTrl(Identifier="c1b08344-822b-8790-cb3a-e40145bf384f")
public static String es_PE_FIELD_Freight_Currency_Name="Moneda";

@XendraField(AD_Column_ID="C_Currency_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c1b08344-822b-8790-cb3a-e40145bf384f")
public static final String FIELDNAME_Freight_Currency="c1b08344-822b-8790-cb3a-e40145bf384f";

@XendraTrl(Identifier="7ce82c1a-74ce-3753-7323-339744337263")
public static String es_PE_COLUMN_C_Currency_ID_Name="Moneda";

@XendraColumn(AD_Element_ID="8daec488-bca2-50fe-f9de-abf0cba2a34a",ColumnName="C_Currency_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7ce82c1a-74ce-3753-7323-339744337263",
Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Currency_ID */
public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";
/** Set Region.
@param C_Region_ID Identifies a geographical Region */
public void setC_Region_ID (int C_Region_ID)
{
if (C_Region_ID <= 0) set_Value (COLUMNNAME_C_Region_ID, null);
 else 
set_Value (COLUMNNAME_C_Region_ID, Integer.valueOf(C_Region_ID));
}
/** Get Region.
@return Identifies a geographical Region */
public int getC_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1d3bf18c-c54f-f63a-2480-ee706ea7a2c1")
public static String es_PE_FIELD_Freight_Region_Description="Identifica una región geográfica";

@XendraTrl(Identifier="1d3bf18c-c54f-f63a-2480-ee706ea7a2c1")
public static String es_PE_FIELD_Freight_Region_Help="La región indica una región única para este país";

@XendraTrl(Identifier="1d3bf18c-c54f-f63a-2480-ee706ea7a2c1")
public static String es_PE_FIELD_Freight_Region_Name="Región";

@XendraField(AD_Column_ID="C_Region_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1d3bf18c-c54f-f63a-2480-ee706ea7a2c1")
public static final String FIELDNAME_Freight_Region="1d3bf18c-c54f-f63a-2480-ee706ea7a2c1";

@XendraTrl(Identifier="5d9408b3-ba86-2c53-cc01-e2ca1ea10369")
public static String es_PE_COLUMN_C_Region_ID_Name="Región";

@XendraColumn(AD_Element_ID="ebf14ae5-8cc5-d3f7-2bd3-ea81d9c6d1fe",ColumnName="C_Region_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d9408b3-ba86-2c53-cc01-e2ca1ea10369",
Synchronized="2017-08-05 16:55:07.0")
/** Column name C_Region_ID */
public static final String COLUMNNAME_C_Region_ID = "C_Region_ID";
/** Set Freight Amount.
@param FreightAmt Freight Amount  */
public void setFreightAmt (BigDecimal FreightAmt)
{
if (FreightAmt == null) throw new IllegalArgumentException ("FreightAmt is mandatory.");
set_Value (COLUMNNAME_FreightAmt, FreightAmt);
}
/** Get Freight Amount.
@return Freight Amount  */
public BigDecimal getFreightAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_FreightAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="470ef8a6-ef6d-5c64-d7e3-d9128a5e7fca")
public static String es_PE_FIELD_Freight_FreightAmount_Description="Total de la entrega";

@XendraTrl(Identifier="470ef8a6-ef6d-5c64-d7e3-d9128a5e7fca")
public static String es_PE_FIELD_Freight_FreightAmount_Help="El Total del Flete indica el total cargado por flete en la moneda del documento";

@XendraTrl(Identifier="470ef8a6-ef6d-5c64-d7e3-d9128a5e7fca")
public static String es_PE_FIELD_Freight_FreightAmount_Name="Total de Flete";

@XendraField(AD_Column_ID="FreightAmt",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="470ef8a6-ef6d-5c64-d7e3-d9128a5e7fca")
public static final String FIELDNAME_Freight_FreightAmount="470ef8a6-ef6d-5c64-d7e3-d9128a5e7fca";

@XendraTrl(Identifier="8a470f63-c946-eac5-86ca-d70bfe2e806e")
public static String es_PE_COLUMN_FreightAmt_Name="Total de Flete";

@XendraColumn(AD_Element_ID="b2162c75-bbbe-b49a-7ffe-6020ce78c453",ColumnName="FreightAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8a470f63-c946-eac5-86ca-d70bfe2e806e",
Synchronized="2017-08-05 16:55:07.0")
/** Column name FreightAmt */
public static final String COLUMNNAME_FreightAmt = "FreightAmt";
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
@XendraTrl(Identifier="2ad1ad1b-2b80-4165-a2bc-79aeef90e722")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="2ad1ad1b-2b80-4165-a2bc-79aeef90e722",
Synchronized="2017-08-05 16:55:07.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Freight Category.
@param M_FreightCategory_ID Category of the Freight */
public void setM_FreightCategory_ID (int M_FreightCategory_ID)
{
if (M_FreightCategory_ID < 1) throw new IllegalArgumentException ("M_FreightCategory_ID is mandatory.");
set_Value (COLUMNNAME_M_FreightCategory_ID, Integer.valueOf(M_FreightCategory_ID));
}
/** Get Freight Category.
@return Category of the Freight */
public int getM_FreightCategory_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_FreightCategory_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="01e8113e-dc8c-0e7b-9541-602c7aba3dab")
public static String es_PE_FIELD_Freight_FreightCategory_Description="Categoría de Fletes";

@XendraTrl(Identifier="01e8113e-dc8c-0e7b-9541-602c7aba3dab")
public static String es_PE_FIELD_Freight_FreightCategory_Help="Las categorías de fletes se utilizan para calcular los fletes del expedidor seleccionado";

@XendraTrl(Identifier="01e8113e-dc8c-0e7b-9541-602c7aba3dab")
public static String es_PE_FIELD_Freight_FreightCategory_Name="Categoría de Fletes";

@XendraField(AD_Column_ID="M_FreightCategory_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="01e8113e-dc8c-0e7b-9541-602c7aba3dab")
public static final String FIELDNAME_Freight_FreightCategory="01e8113e-dc8c-0e7b-9541-602c7aba3dab";

@XendraTrl(Identifier="23e975fd-1781-6e9e-8190-9b12be063e5f")
public static String es_PE_COLUMN_M_FreightCategory_ID_Name="Categoría de Fletes";

@XendraColumn(AD_Element_ID="a6bd0308-4cda-2bdf-220e-15636641b487",
ColumnName="M_FreightCategory_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=true,SeqNo=2,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="23e975fd-1781-6e9e-8190-9b12be063e5f",Synchronized="2017-08-05 16:55:07.0")
/** Column name M_FreightCategory_ID */
public static final String COLUMNNAME_M_FreightCategory_ID = "M_FreightCategory_ID";
/** Set Freight.
@param M_Freight_ID Freight Rate */
public void setM_Freight_ID (int M_Freight_ID)
{
if (M_Freight_ID < 1) throw new IllegalArgumentException ("M_Freight_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Freight_ID, Integer.valueOf(M_Freight_ID));
}
/** Get Freight.
@return Freight Rate */
public int getM_Freight_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Freight_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d3d225cd-75f7-f2bc-b5ea-10b9019e1fe5")
public static String es_PE_FIELD_Freight_Freight_Description="Tasa de carga";

@XendraTrl(Identifier="d3d225cd-75f7-f2bc-b5ea-10b9019e1fe5")
public static String es_PE_FIELD_Freight_Freight_Help="Tarifa de la carga para el expedidor";

@XendraTrl(Identifier="d3d225cd-75f7-f2bc-b5ea-10b9019e1fe5")
public static String es_PE_FIELD_Freight_Freight_Name="Carga";

@XendraField(AD_Column_ID="M_Freight_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d3d225cd-75f7-f2bc-b5ea-10b9019e1fe5")
public static final String FIELDNAME_Freight_Freight="d3d225cd-75f7-f2bc-b5ea-10b9019e1fe5";
/** Column name M_Freight_ID */
public static final String COLUMNNAME_M_Freight_ID = "M_Freight_ID";
/** Set Shipper.
@param M_Shipper_ID Method or manner of product delivery */
public void setM_Shipper_ID (int M_Shipper_ID)
{
if (M_Shipper_ID < 1) throw new IllegalArgumentException ("M_Shipper_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Shipper_ID, Integer.valueOf(M_Shipper_ID));
}
/** Get Shipper.
@return Method or manner of product delivery */
public int getM_Shipper_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Shipper_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getM_Shipper_ID()));
}

@XendraTrl(Identifier="534c2d34-0f40-8f45-48dc-f47ffb535eb0")
public static String es_PE_FIELD_Freight_Shipper_Description="Método ó manera de entrega del producto";

@XendraTrl(Identifier="534c2d34-0f40-8f45-48dc-f47ffb535eb0")
public static String es_PE_FIELD_Freight_Shipper_Help="El transportista indica el responsable de entregar el producto";

@XendraTrl(Identifier="534c2d34-0f40-8f45-48dc-f47ffb535eb0")
public static String es_PE_FIELD_Freight_Shipper_Name="Transportista";

@XendraField(AD_Column_ID="M_Shipper_ID",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="534c2d34-0f40-8f45-48dc-f47ffb535eb0")
public static final String FIELDNAME_Freight_Shipper="534c2d34-0f40-8f45-48dc-f47ffb535eb0";

@XendraTrl(Identifier="3d83bc65-b789-322a-2625-bd29a78dd98d")
public static String es_PE_COLUMN_M_Shipper_ID_Name="Transportista";

@XendraColumn(AD_Element_ID="9aa20cfc-6f2b-2463-7be0-888a548ba3ad",ColumnName="M_Shipper_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3d83bc65-b789-322a-2625-bd29a78dd98d",
Synchronized="2017-08-05 16:55:07.0")
/** Column name M_Shipper_ID */
public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";

/** To_Country_ID AD_Reference=da097900-8f86-9a6d-5a27-605e202ce9a8 */
public static final int TO_COUNTRY_ID_AD_Reference_ID=156;
/** Set To.
@param To_Country_ID Receiving Country */
public void setTo_Country_ID (int To_Country_ID)
{
if (To_Country_ID <= 0) set_Value (COLUMNNAME_To_Country_ID, null);
 else 
set_Value (COLUMNNAME_To_Country_ID, Integer.valueOf(To_Country_ID));
}
/** Get To.
@return Receiving Country */
public int getTo_Country_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_To_Country_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2d62298e-a63d-e339-bf71-292e85bd18d1")
public static String es_PE_FIELD_Freight_To_Description="País que recibe";

@XendraTrl(Identifier="2d62298e-a63d-e339-bf71-292e85bd18d1")
public static String es_PE_FIELD_Freight_To_Help="El A País indica el país que recibe en un documento.";

@XendraTrl(Identifier="2d62298e-a63d-e339-bf71-292e85bd18d1")
public static String es_PE_FIELD_Freight_To_Name="A";
@XendraField(AD_Column_ID="To_Country_ID",
IsCentrallyMaintained=true,AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=110,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="2d62298e-a63d-e339-bf71-292e85bd18d1")
public static final String FIELDNAME_Freight_To="2d62298e-a63d-e339-bf71-292e85bd18d1";

@XendraTrl(Identifier="9e96b7fe-932c-cae0-8de7-a486b31d2596")
public static String es_PE_COLUMN_To_Country_ID_Name="A";

@XendraColumn(AD_Element_ID="777e77a8-1aa3-753d-457e-9ec8db1320db",ColumnName="To_Country_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="da097900-8f86-9a6d-5a27-605e202ce9a8",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="9e96b7fe-932c-cae0-8de7-a486b31d2596",Synchronized="2017-08-05 16:55:07.0")
/** Column name To_Country_ID */
public static final String COLUMNNAME_To_Country_ID = "To_Country_ID";

/** To_Region_ID AD_Reference=f560243f-2ea5-bcb4-265f-52555b17a707 */
public static final int TO_REGION_ID_AD_Reference_ID=157;
/** Set To.
@param To_Region_ID Receiving Region */
public void setTo_Region_ID (int To_Region_ID)
{
if (To_Region_ID <= 0) set_Value (COLUMNNAME_To_Region_ID, null);
 else 
set_Value (COLUMNNAME_To_Region_ID, Integer.valueOf(To_Region_ID));
}
/** Get To.
@return Receiving Region */
public int getTo_Region_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_To_Region_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="b9eacba8-f2c5-788c-a830-cd315efcf978")
public static String es_PE_FIELD_Freight_To2_Description="Región que recibe";

@XendraTrl(Identifier="b9eacba8-f2c5-788c-a830-cd315efcf978")
public static String es_PE_FIELD_Freight_To2_Help="El A Región indica la región que recibe en un documento";

@XendraTrl(Identifier="b9eacba8-f2c5-788c-a830-cd315efcf978")
public static String es_PE_FIELD_Freight_To2_Name="A";
@XendraField(AD_Column_ID="To_Region_ID",
IsCentrallyMaintained=true,AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",
IsDisplayed=true,DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=130,SortNo=0,
IsSameLine=true,IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",
Synchronized="2012-03-17 18:47:14.0",Identifier="b9eacba8-f2c5-788c-a830-cd315efcf978")
public static final String FIELDNAME_Freight_To2="b9eacba8-f2c5-788c-a830-cd315efcf978";

@XendraTrl(Identifier="8e1b6e57-ff1f-ffc0-005b-29b3abbb6ee8")
public static String es_PE_COLUMN_To_Region_ID_Name="A";

@XendraColumn(AD_Element_ID="55ad1efb-84a9-f27e-9c2e-91e38130321d",ColumnName="To_Region_ID",
AD_Reference_ID=18,AD_Reference_Value_ID="f560243f-2ea5-bcb4-265f-52555b17a707",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8e1b6e57-ff1f-ffc0-005b-29b3abbb6ee8",Synchronized="2017-08-05 16:55:07.0")
/** Column name To_Region_ID */
public static final String COLUMNNAME_To_Region_ID = "To_Region_ID";
/** Set Valid from.
@param ValidFrom Valid from including this date (first day) */
public void setValidFrom (Timestamp ValidFrom)
{
if (ValidFrom == null) throw new IllegalArgumentException ("ValidFrom is mandatory.");
set_Value (COLUMNNAME_ValidFrom, ValidFrom);
}
/** Get Valid from.
@return Valid from including this date (first day) */
public Timestamp getValidFrom() 
{
return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
}

@XendraTrl(Identifier="0fb1ef52-e7fa-2201-2531-3f58bba2ecd0")
public static String es_PE_FIELD_Freight_ValidFrom_Description="Válido desde; incluyendo esta fecha (primer día)";

@XendraTrl(Identifier="0fb1ef52-e7fa-2201-2531-3f58bba2ecd0")
public static String es_PE_FIELD_Freight_ValidFrom_Help="La fecha válida desde indica el primer día de un rango de fechas";

@XendraTrl(Identifier="0fb1ef52-e7fa-2201-2531-3f58bba2ecd0")
public static String es_PE_FIELD_Freight_ValidFrom_Name="Válido Desde";

@XendraField(AD_Column_ID="ValidFrom",IsCentrallyMaintained=true,
AD_Tab_ID="c72774bc-e773-b8be-ede5-c8c9e0b7cc6e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=2,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="0fb1ef52-e7fa-2201-2531-3f58bba2ecd0")
public static final String FIELDNAME_Freight_ValidFrom="0fb1ef52-e7fa-2201-2531-3f58bba2ecd0";

@XendraTrl(Identifier="31d1929b-60ae-259d-2258-140f7b74fa99")
public static String es_PE_COLUMN_ValidFrom_Name="Válido Desde";

@XendraColumn(AD_Element_ID="86b1171a-a6c6-0da5-1aea-3f3106450d07",ColumnName="ValidFrom",
AD_Reference_ID=15,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=7,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="31d1929b-60ae-259d-2258-140f7b74fa99",
Synchronized="2017-08-05 16:55:07.0")
/** Column name ValidFrom */
public static final String COLUMNNAME_ValidFrom = "ValidFrom";
}
