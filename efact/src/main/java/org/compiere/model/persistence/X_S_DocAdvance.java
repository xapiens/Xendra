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
/** Generated Model for S_DocAdvance
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_S_DocAdvance extends PO
{
/** Standard Constructor
@param ctx context
@param S_DocAdvance_ID id
@param trxName transaction
*/
public X_S_DocAdvance (Properties ctx, int S_DocAdvance_ID, String trxName)
{
super (ctx, S_DocAdvance_ID, trxName);
/** if (S_DocAdvance_ID == 0)
{
setS_DocAdvance_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_S_DocAdvance (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000429 */
public static int Table_ID=MTable.getTable_ID("S_DocAdvance");

@XendraTrl(Identifier="bf780937-4ba0-49ce-a01f-c5c1122810ad")
public static String es_PE_TABLE_S_DocAdvance_Name="Doc Adelanto Sunat";

@XendraTable(Name="Doc Adelanto Sunat",AD_Package_ID="2ac04657-d663-47c2-4ec1-927ad71f1e96",
AD_Plugin_ID="",Description="",Help="",TableName="S_DocAdvance",AccessLevel="3",AD_Window_ID="",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="",
Identifier="bf780937-4ba0-49ce-a01f-c5c1122810ad",Synchronized="2022-04-26 22:39:13.0")
/** TableName=S_DocAdvance */
public static final String Table_Name="S_DocAdvance";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"S_DocAdvance");

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
    Table_ID = MTable.getTable_ID("S_DocAdvance");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_S_DocAdvance[").append(get_ID()).append("]");
return sb.toString();
}
/** Set docu_anticipo_docu_numero.
@param docu_anticipo_docu_numero docu_anticipo_docu_numero */
public void setdocu_anticipo_docu_numero (String docu_anticipo_docu_numero)
{
if (docu_anticipo_docu_numero != null && docu_anticipo_docu_numero.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_docu_numero = docu_anticipo_docu_numero.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_docu_numero, docu_anticipo_docu_numero);
}
/** Get docu_anticipo_docu_numero.
@return docu_anticipo_docu_numero */
public String getdocu_anticipo_docu_numero() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_docu_numero);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b6b0c918-c531-4afa-8abe-c4086ee6252f")
public static String es_PE_COLUMN_docu_anticipo_docu_numero_Name="docu_anticipo_docu_numero";

@XendraColumn(AD_Element_ID="9e5159aa-8dc1-40b9-aded-2535a41031ba",
ColumnName="docu_anticipo_docu_numero",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b6b0c918-c531-4afa-8abe-c4086ee6252f",Synchronized="2022-04-26 22:38:07.0")
/** Column name docu_anticipo_docu_numero */
public static final String COLUMNNAME_docu_anticipo_docu_numero = "docu_anticipo_docu_numero";
/** Set docu_anticipo_docu_tipo.
@param docu_anticipo_docu_tipo docu_anticipo_docu_tipo */
public void setdocu_anticipo_docu_tipo (String docu_anticipo_docu_tipo)
{
if (docu_anticipo_docu_tipo != null && docu_anticipo_docu_tipo.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_docu_tipo = docu_anticipo_docu_tipo.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_docu_tipo, docu_anticipo_docu_tipo);
}
/** Get docu_anticipo_docu_tipo.
@return docu_anticipo_docu_tipo */
public String getdocu_anticipo_docu_tipo() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_docu_tipo);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="b13839b2-d185-438f-80f2-bb8f384416c1")
public static String es_PE_COLUMN_docu_anticipo_docu_tipo_Name="docu_anticipo_docu_tipo";

@XendraColumn(AD_Element_ID="f5375435-50c2-4625-b2d1-4305cc5ed16f",
ColumnName="docu_anticipo_docu_tipo",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="b13839b2-d185-438f-80f2-bb8f384416c1",Synchronized="2022-04-26 22:38:07.0")
/** Column name docu_anticipo_docu_tipo */
public static final String COLUMNNAME_docu_anticipo_docu_tipo = "docu_anticipo_docu_tipo";
/** Set docu_anticipo_fecha_emi.
@param docu_anticipo_fecha_emi docu_anticipo_fecha_emi */
public void setdocu_anticipo_fecha_emi (String docu_anticipo_fecha_emi)
{
if (docu_anticipo_fecha_emi != null && docu_anticipo_fecha_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_fecha_emi = docu_anticipo_fecha_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_fecha_emi, docu_anticipo_fecha_emi);
}
/** Get docu_anticipo_fecha_emi.
@return docu_anticipo_fecha_emi */
public String getdocu_anticipo_fecha_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_fecha_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="7ad0c155-75e8-4a08-8e70-f341249476a3")
public static String es_PE_COLUMN_docu_anticipo_fecha_emi_Name="docu_anticipo_fecha_emi";

@XendraColumn(AD_Element_ID="010cb7e3-c8de-43b3-ab06-a9bac0247c8f",
ColumnName="docu_anticipo_fecha_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="7ad0c155-75e8-4a08-8e70-f341249476a3",Synchronized="2022-04-26 22:38:07.0")
/** Column name docu_anticipo_fecha_emi */
public static final String COLUMNNAME_docu_anticipo_fecha_emi = "docu_anticipo_fecha_emi";
/** Set docu_anticipo_hora_emi.
@param docu_anticipo_hora_emi docu_anticipo_hora_emi */
public void setdocu_anticipo_hora_emi (String docu_anticipo_hora_emi)
{
if (docu_anticipo_hora_emi != null && docu_anticipo_hora_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_hora_emi = docu_anticipo_hora_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_hora_emi, docu_anticipo_hora_emi);
}
/** Get docu_anticipo_hora_emi.
@return docu_anticipo_hora_emi */
public String getdocu_anticipo_hora_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_hora_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="8b3301ca-3953-483f-92bc-725dc381ebf0")
public static String es_PE_COLUMN_docu_anticipo_hora_emi_Name="docu_anticipo_hora_emi";

@XendraColumn(AD_Element_ID="d4d2ec40-5a36-413e-b789-f632163928eb",
ColumnName="docu_anticipo_hora_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="8b3301ca-3953-483f-92bc-725dc381ebf0",Synchronized="2022-04-26 22:38:07.0")
/** Column name docu_anticipo_hora_emi */
public static final String COLUMNNAME_docu_anticipo_hora_emi = "docu_anticipo_hora_emi";
/** Set docu_anticipo_numero_docu_emi.
@param docu_anticipo_numero_docu_emi docu_anticipo_numero_docu_emi */
public void setdocu_anticipo_numero_docu_emi (String docu_anticipo_numero_docu_emi)
{
if (docu_anticipo_numero_docu_emi != null && docu_anticipo_numero_docu_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_numero_docu_emi = docu_anticipo_numero_docu_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_numero_docu_emi, docu_anticipo_numero_docu_emi);
}
/** Get docu_anticipo_numero_docu_emi.
@return docu_anticipo_numero_docu_emi */
public String getdocu_anticipo_numero_docu_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_numero_docu_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="6fd5f565-14d6-4d9f-9706-34a1c504471a")
public static String es_PE_COLUMN_docu_anticipo_numero_docu_emi_Name="docu_anticipo_numero_docu_emi";

@XendraColumn(AD_Element_ID="6abb99d6-1beb-4a97-a6ce-6b4fd96fb468",
ColumnName="docu_anticipo_numero_docu_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="6fd5f565-14d6-4d9f-9706-34a1c504471a",Synchronized="2022-04-26 22:38:07.0")
/** Column name docu_anticipo_numero_docu_emi */
public static final String COLUMNNAME_docu_anticipo_numero_docu_emi = "docu_anticipo_numero_docu_emi";
/** Set docu_anticipo_prepago.
@param docu_anticipo_prepago docu_anticipo_prepago */
public void setdocu_anticipo_prepago (String docu_anticipo_prepago)
{
if (docu_anticipo_prepago != null && docu_anticipo_prepago.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_prepago = docu_anticipo_prepago.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_prepago, docu_anticipo_prepago);
}
/** Get docu_anticipo_prepago.
@return docu_anticipo_prepago */
public String getdocu_anticipo_prepago() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_prepago);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="ae6fbd74-1ae5-4572-bbdc-83479be82eff")
public static String es_PE_COLUMN_docu_anticipo_prepago_Name="docu_anticipo_prepago";

@XendraColumn(AD_Element_ID="8435dd86-0885-4d8e-a9cc-3a0870e69c50",
ColumnName="docu_anticipo_prepago",AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="ae6fbd74-1ae5-4572-bbdc-83479be82eff",Synchronized="2022-04-26 22:38:07.0")
/** Column name docu_anticipo_prepago */
public static final String COLUMNNAME_docu_anticipo_prepago = "docu_anticipo_prepago";
/** Set docu_anticipo_tipo_docu_emi.
@param docu_anticipo_tipo_docu_emi docu_anticipo_tipo_docu_emi */
public void setdocu_anticipo_tipo_docu_emi (String docu_anticipo_tipo_docu_emi)
{
if (docu_anticipo_tipo_docu_emi != null && docu_anticipo_tipo_docu_emi.length() > 45)
{
log.warning("Length > 45 - truncated");
docu_anticipo_tipo_docu_emi = docu_anticipo_tipo_docu_emi.substring(0,44);
}
set_Value (COLUMNNAME_docu_anticipo_tipo_docu_emi, docu_anticipo_tipo_docu_emi);
}
/** Get docu_anticipo_tipo_docu_emi.
@return docu_anticipo_tipo_docu_emi */
public String getdocu_anticipo_tipo_docu_emi() 
{
String value = (String)get_Value(COLUMNNAME_docu_anticipo_tipo_docu_emi);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="89813d72-b10f-4366-be92-b15bdfd0b796")
public static String es_PE_COLUMN_docu_anticipo_tipo_docu_emi_Name="docu_anticipo_tipo_docu_emi";

@XendraColumn(AD_Element_ID="d6fd5586-3186-48a1-98ea-e1160d995f16",
ColumnName="docu_anticipo_tipo_docu_emi",AD_Reference_ID=10,AD_Reference_Value_ID="",
AD_Val_Rule_ID="",FieldLength=45,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,
IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,
Callout="",VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="89813d72-b10f-4366-be92-b15bdfd0b796",Synchronized="2022-04-26 22:38:07.0")
/** Column name docu_anticipo_tipo_docu_emi */
public static final String COLUMNNAME_docu_anticipo_tipo_docu_emi = "docu_anticipo_tipo_docu_emi";
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
@XendraTrl(Identifier="67803ca1-8d83-4a89-b83e-02bc34aeb692")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="67803ca1-8d83-4a89-b83e-02bc34aeb692",
Synchronized="2022-04-26 22:38:07.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Doc Adelanto Sunat.
@param S_DocAdvance_ID Doc Adelanto Sunat */
public void setS_DocAdvance_ID (int S_DocAdvance_ID)
{
if (S_DocAdvance_ID < 1) throw new IllegalArgumentException ("S_DocAdvance_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_S_DocAdvance_ID, Integer.valueOf(S_DocAdvance_ID));
}
/** Get Doc Adelanto Sunat.
@return Doc Adelanto Sunat */
public int getS_DocAdvance_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocAdvance_ID);
if (ii == null) return 0;
return ii.intValue();
}
/** Column name S_DocAdvance_ID */
public static final String COLUMNNAME_S_DocAdvance_ID = "S_DocAdvance_ID";
/** Set S_DocHeader_ID.
@param S_DocHeader_ID S_DocHeader_ID */
public void setS_DocHeader_ID (int S_DocHeader_ID)
{
if (S_DocHeader_ID <= 0) set_Value (COLUMNNAME_S_DocHeader_ID, null);
 else 
set_Value (COLUMNNAME_S_DocHeader_ID, Integer.valueOf(S_DocHeader_ID));
}
/** Get S_DocHeader_ID.
@return S_DocHeader_ID */
public int getS_DocHeader_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_S_DocHeader_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cee48d46-56cc-4ad0-ab85-1cbf0ae8d1db")
public static String es_PE_COLUMN_S_DocHeader_ID_Name="S_DocHeader_ID";

@XendraColumn(AD_Element_ID="51cdf354-f5f5-4380-86e3-e1607a818626",ColumnName="S_DocHeader_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="cee48d46-56cc-4ad0-ab85-1cbf0ae8d1db",
Synchronized="2022-04-26 22:38:07.0")
/** Column name S_DocHeader_ID */
public static final String COLUMNNAME_S_DocHeader_ID = "S_DocHeader_ID";
}
