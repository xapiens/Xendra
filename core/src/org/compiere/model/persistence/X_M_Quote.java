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
/** Generated Model for M_Quote
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_Quote extends PO
{
/** Standard Constructor
@param ctx context
@param M_Quote_ID id
@param trxName transaction
*/
public X_M_Quote (Properties ctx, int M_Quote_ID, String trxName)
{
super (ctx, M_Quote_ID, trxName);
/** if (M_Quote_ID == 0)
{
setAD_User_ID (0);
setC_Period_ID (0);
setLineNetAmt (Env.ZERO);	
// 0
setM_Quote_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_Quote (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000187 */
public static int Table_ID=MTable.getTable_ID("M_Quote");

@XendraTrl(Identifier="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918")
public static String es_PE_TAB_Cuota_Name="Cuota";
@XendraTab(Name="Cuota",Description="",Help="",
AD_Window_ID="9d9ac6c1-ef8e-c5aa-e8e8-83f606634ce2",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Cuota="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918";

@XendraTrl(Identifier="456f5990-af9b-e4a2-d33a-724f940be42d")
public static String es_PE_TABLE_M_Quote_Name="M_Quote";

@XendraTable(Name="M_Quote",Description="",Help="",TableName="M_Quote",AccessLevel="3",
AD_Window_ID="9d9ac6c1-ef8e-c5aa-e8e8-83f606634ce2",AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="456f5990-af9b-e4a2-d33a-724f940be42d",
Synchronized="2017-08-16 11:43:31.0")
/** TableName=M_Quote */
public static final String Table_Name="M_Quote";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_Quote");

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
    Table_ID = MTable.getTable_ID("M_Quote");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_Quote[").append(get_ID()).append("]");
return sb.toString();
}
/** Set User/Contact.
@param AD_User_ID User within the system - Internal or Business Partner Contact */
public void setAD_User_ID (int AD_User_ID)
{
if (AD_User_ID < 1) throw new IllegalArgumentException ("AD_User_ID is mandatory.");
set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
}
/** Get User/Contact.
@return User within the system - Internal or Business Partner Contact */
public int getAD_User_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="e45d444b-10c2-db1d-a011-5aabd0cc7e1c")
public static String es_PE_FIELD_Cuota_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="e45d444b-10c2-db1d-a011-5aabd0cc7e1c")
public static String es_PE_FIELD_Cuota_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraTrl(Identifier="e45d444b-10c2-db1d-a011-5aabd0cc7e1c")
public static String es_PE_FIELD_Cuota_UserContact_Name="Usuario";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="e45d444b-10c2-db1d-a011-5aabd0cc7e1c")
public static final String FIELDNAME_Cuota_UserContact="e45d444b-10c2-db1d-a011-5aabd0cc7e1c";

@XendraTrl(Identifier="c5c20852-abc4-695a-6e9b-37be81d6132f")
public static String es_PE_COLUMN_AD_User_ID_Name="User/Contact";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="c5097aa9-96d2-a0b6-cac0-365f01a8225f",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c5c20852-abc4-695a-6e9b-37be81d6132f",Synchronized="2017-08-05 16:55:29.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
/** Set Nro de Clientes.
@param bpartnerno Nro de Clientes */
public void setbpartnerno (int bpartnerno)
{
set_Value (COLUMNNAME_bpartnerno, Integer.valueOf(bpartnerno));
}
/** Get Nro de Clientes.
@return Nro de Clientes */
public int getbpartnerno() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_bpartnerno);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9becbb2b-f3f1-8500-bf92-60b38b6817d0")
public static String es_PE_FIELD_Cuota_NroDeClientes_Name="bpartnerno";

@XendraField(AD_Column_ID="bpartnerno",IsCentrallyMaintained=true,
AD_Tab_ID="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9becbb2b-f3f1-8500-bf92-60b38b6817d0")
public static final String FIELDNAME_Cuota_NroDeClientes="9becbb2b-f3f1-8500-bf92-60b38b6817d0";

@XendraTrl(Identifier="b6c8d623-b4ba-aa8d-d2e0-813abf8fb4fd")
public static String es_PE_COLUMN_bpartnerno_Name="bpartnerno";

@XendraColumn(AD_Element_ID="f9077b7d-8334-8556-397e-b82e8571de31",ColumnName="bpartnerno",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="b6c8d623-b4ba-aa8d-d2e0-813abf8fb4fd",
Synchronized="2017-08-05 16:55:29.0")
/** Column name bpartnerno */
public static final String COLUMNNAME_bpartnerno = "bpartnerno";
/** Set Period.
@param C_Period_ID Period of the Calendar */
public void setC_Period_ID (int C_Period_ID)
{
if (C_Period_ID < 1) throw new IllegalArgumentException ("C_Period_ID is mandatory.");
set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
}
/** Get Period.
@return Period of the Calendar */
public int getC_Period_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="4a9eb76f-71f9-caf1-ab73-b01e186e965d")
public static String es_PE_FIELD_Cuota_Period_Description="Período de Calendario";

@XendraTrl(Identifier="4a9eb76f-71f9-caf1-ab73-b01e186e965d")
public static String es_PE_FIELD_Cuota_Period_Help="El Período indica un rango de fechas exclusivo para un calendario";

@XendraTrl(Identifier="4a9eb76f-71f9-caf1-ab73-b01e186e965d")
public static String es_PE_FIELD_Cuota_Period_Name="Período";

@XendraField(AD_Column_ID="C_Period_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="4a9eb76f-71f9-caf1-ab73-b01e186e965d")
public static final String FIELDNAME_Cuota_Period="4a9eb76f-71f9-caf1-ab73-b01e186e965d";

@XendraTrl(Identifier="7f0c6bcb-0de1-7406-0722-fef8687f03e6")
public static String es_PE_COLUMN_C_Period_ID_Name="Period";

@XendraColumn(AD_Element_ID="8f295c04-0eb4-a8f3-829f-cc6a6bd1df1e",ColumnName="C_Period_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="997febad-70ed-4f83-f0d4-a1dbf24bdcfa",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7f0c6bcb-0de1-7406-0722-fef8687f03e6",Synchronized="2017-08-05 16:55:29.0")
/** Column name C_Period_ID */
public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";
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
@XendraTrl(Identifier="11dac767-077e-44c5-90f8-5d5d6824bee2")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="11dac767-077e-44c5-90f8-5d5d6824bee2",
Synchronized="2017-08-05 16:55:29.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Laboratorio.
@param Laboratorio_ID Laboratorio */
public void setLaboratorio_ID (int Laboratorio_ID)
{
if (Laboratorio_ID <= 0) set_Value (COLUMNNAME_Laboratorio_ID, null);
 else 
set_Value (COLUMNNAME_Laboratorio_ID, Integer.valueOf(Laboratorio_ID));
}
/** Get Laboratorio.
@return Laboratorio */
public int getLaboratorio_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Laboratorio_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="8f4d88d2-e6cb-6bcd-0c6b-faad7860f65a")
public static String es_PE_FIELD_Cuota_Laboratorio_Name="Laboratorio";

@XendraField(AD_Column_ID="Laboratorio_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="8f4d88d2-e6cb-6bcd-0c6b-faad7860f65a")
public static final String FIELDNAME_Cuota_Laboratorio="8f4d88d2-e6cb-6bcd-0c6b-faad7860f65a";

@XendraTrl(Identifier="bee75757-d036-b3b2-2fa0-3e4632d1260f")
public static String es_PE_COLUMN_Laboratorio_ID_Name="Laboratorio";

@XendraColumn(AD_Element_ID="65491451-f2ef-609a-e8f3-11a7fbcf464d",ColumnName="Laboratorio_ID",
AD_Reference_ID=30,AD_Reference_Value_ID="",AD_Val_Rule_ID="fe5f7cfa-310e-1278-0df1-ea10f286f7d2",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=true,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="bee75757-d036-b3b2-2fa0-3e4632d1260f",Synchronized="2017-08-05 16:55:29.0")
/** Column name Laboratorio_ID */
public static final String COLUMNNAME_Laboratorio_ID = "Laboratorio_ID";
/** Set Line Amount.
@param LineNetAmt Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public void setLineNetAmt (BigDecimal LineNetAmt)
{
if (LineNetAmt == null) throw new IllegalArgumentException ("LineNetAmt is mandatory.");
set_Value (COLUMNNAME_LineNetAmt, LineNetAmt);
}
/** Get Line Amount.
@return Line Extended Amount (Quantity * Actual Price) without Freight and Charges */
public BigDecimal getLineNetAmt() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_LineNetAmt);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="d2d72fbb-63ee-0112-be01-44ee7c1ca424")
public static String es_PE_FIELD_Cuota_LineAmount_Description="Total neto de la línea (Cantidad * Precio Actual) sin fletes ni cargos";

@XendraTrl(Identifier="d2d72fbb-63ee-0112-be01-44ee7c1ca424")
public static String es_PE_FIELD_Cuota_LineAmount_Help="Indica el total neto de la línea basado en la cantidad y el precio actual. Cualquier cargo adicional ó flete no es incluido.";

@XendraTrl(Identifier="d2d72fbb-63ee-0112-be01-44ee7c1ca424")
public static String es_PE_FIELD_Cuota_LineAmount_Name="Neto de Línea";

@XendraField(AD_Column_ID="LineNetAmt",IsCentrallyMaintained=true,
AD_Tab_ID="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=20,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d2d72fbb-63ee-0112-be01-44ee7c1ca424")
public static final String FIELDNAME_Cuota_LineAmount="d2d72fbb-63ee-0112-be01-44ee7c1ca424";

@XendraTrl(Identifier="ee64fe3f-9d70-8345-261e-43626bb907a6")
public static String es_PE_COLUMN_LineNetAmt_Name="Line Amount";

@XendraColumn(AD_Element_ID="ba57a535-4ae3-c6eb-74ec-3dcb0973d6f6",ColumnName="LineNetAmt",
AD_Reference_ID=12,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=131089,DefaultValue="0",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ee64fe3f-9d70-8345-261e-43626bb907a6",
Synchronized="2017-08-05 16:55:29.0")
/** Column name LineNetAmt */
public static final String COLUMNNAME_LineNetAmt = "LineNetAmt";
/** Set M_Quote.
@param M_Quote_ID M_Quote */
public void setM_Quote_ID (int M_Quote_ID)
{
if (M_Quote_ID < 1) throw new IllegalArgumentException ("M_Quote_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_Quote_ID, Integer.valueOf(M_Quote_ID));
}
/** Get M_Quote.
@return M_Quote */
public int getM_Quote_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_Quote_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d7e82b6f-5cdd-1239-3ff9-6a62e34d890d")
public static String es_PE_FIELD_Cuota_M_Quote_Name="M_Quote";

@XendraField(AD_Column_ID="M_Quote_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2c519eab-bb13-7d0a-e0aa-e22cd9ae7918",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d7e82b6f-5cdd-1239-3ff9-6a62e34d890d")
public static final String FIELDNAME_Cuota_M_Quote="d7e82b6f-5cdd-1239-3ff9-6a62e34d890d";
/** Column name M_Quote_ID */
public static final String COLUMNNAME_M_Quote_ID = "M_Quote_ID";
}
