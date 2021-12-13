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
/** Generated Model for R_RequestProcessor_Route
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_R_RequestProcessor_Route extends PO
{
/** Standard Constructor
@param ctx context
@param R_RequestProcessor_Route_ID id
@param trxName transaction
*/
public X_R_RequestProcessor_Route (Properties ctx, int R_RequestProcessor_Route_ID, String trxName)
{
super (ctx, R_RequestProcessor_Route_ID, trxName);
/** if (R_RequestProcessor_Route_ID == 0)
{
setAD_User_ID (0);
setR_RequestProcessor_ID (0);
setR_RequestProcessor_Route_ID (0);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_R_RequestProcessor_Route (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=474 */
public static int Table_ID=MTable.getTable_ID("R_RequestProcessor_Route");

@XendraTrl(Identifier="3d6267ed-5f23-6b11-e123-ad46f1593c8e")
public static String es_PE_TAB_Routing_Description="Ruta de la solicitud";

@XendraTrl(Identifier="3d6267ed-5f23-6b11-e123-ad46f1593c8e")
public static String es_PE_TAB_Routing_Help="Define la secuencia de palabras claves y a quien deben ser dirigidos las solicitudes via web y los de e-mail.";

@XendraTrl(Identifier="3d6267ed-5f23-6b11-e123-ad46f1593c8e")
public static String es_PE_TAB_Routing_Name="Ruta";
@XendraTab(Name="Routing",
Description="Request Routing",
Help="Define the sequence of request types and keywords and to whom the web and mail requests should be routed to. The keywords are separated by space, comma, semicolon, tab or new line. The first match wins (first request type then keyword.",
AD_Window_ID="33d28bbc-a670-970b-7b9c-ecf75fc3740d",SeqNo=20,TabLevel=1,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="3d6267ed-5f23-6b11-e123-ad46f1593c8e",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_Routing="3d6267ed-5f23-6b11-e123-ad46f1593c8e";

@XendraTrl(Identifier="26529be5-246b-43db-8617-c67de629274e")
public static String es_PE_TABLE_R_RequestProcessor_Route_Name="Ruteo de la Solicitud";


@XendraTable(Name="Request Routing",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Automatic routing of requests",
Help="",TableName="R_RequestProcessor_Route",AccessLevel="2",
AD_Window_ID="33d28bbc-a670-970b-7b9c-ecf75fc3740d",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.standard",Identifier="26529be5-246b-43db-8617-c67de629274e",
Synchronized="2020-03-03 21:39:40.0")
/** TableName=R_RequestProcessor_Route */
public static final String Table_Name="R_RequestProcessor_Route";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"R_RequestProcessor_Route");

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
    Table_ID = MTable.getTable_ID("R_RequestProcessor_Route");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_R_RequestProcessor_Route[").append(get_ID()).append("]");
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

@XendraTrl(Identifier="7074f347-2581-0c93-a083-063a14a6c8ce")
public static String es_PE_FIELD_Routing_UserContact_Name="Usuario";

@XendraTrl(Identifier="7074f347-2581-0c93-a083-063a14a6c8ce")
public static String es_PE_FIELD_Routing_UserContact_Description="ID de Usuario dentro del sistema";

@XendraTrl(Identifier="7074f347-2581-0c93-a083-063a14a6c8ce")
public static String es_PE_FIELD_Routing_UserContact_Help="La ID de usuario identifica un usuario único en el sistema";

@XendraField(AD_Column_ID="AD_User_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3d6267ed-5f23-6b11-e123-ad46f1593c8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7074f347-2581-0c93-a083-063a14a6c8ce")
public static final String FIELDNAME_Routing_UserContact="7074f347-2581-0c93-a083-063a14a6c8ce";

@XendraTrl(Identifier="007a9432-d760-7812-a70c-59f17cd29966")
public static String es_PE_COLUMN_AD_User_ID_Name="Usuario";

@XendraColumn(AD_Element_ID="abdf8dee-d3cd-73ec-c758-683e907797f4",ColumnName="AD_User_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="a1ea6cc6-fa00-1e16-1059-b4df151aaf4b",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="007a9432-d760-7812-a70c-59f17cd29966",Synchronized="2019-08-30 22:23:50.0")
/** Column name AD_User_ID */
public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";
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
@XendraTrl(Identifier="8fa9bb96-2fb9-4543-a938-4f377c594b05")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8fa9bb96-2fb9-4543-a938-4f377c594b05",
Synchronized="2019-08-30 22:23:50.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Keyword.
@param Keyword Case insensitive keyword */
public void setKeyword (String Keyword)
{
if (Keyword != null && Keyword.length() > 60)
{
log.warning("Length > 60 - truncated");
Keyword = Keyword.substring(0,59);
}
set_Value (COLUMNNAME_Keyword, Keyword);
}
/** Get Keyword.
@return Case insensitive keyword */
public String getKeyword() 
{
String value = (String)get_Value(COLUMNNAME_Keyword);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="abff6859-8fa2-abda-2010-08500e656f4e")
public static String es_PE_FIELD_Routing_Keyword_Name="Palabra clave";

@XendraTrl(Identifier="abff6859-8fa2-abda-2010-08500e656f4e")
public static String es_PE_FIELD_Routing_Keyword_Description="Palabra clave no sensible a mayúsculas / minúsculas";

@XendraTrl(Identifier="abff6859-8fa2-abda-2010-08500e656f4e")
public static String es_PE_FIELD_Routing_Keyword_Help="Palabra clave insensible a mayúsculas para correspondencia. Si hay dos palabras; ambas palabras deben existir.";

@XendraField(AD_Column_ID="Keyword",IsCentrallyMaintained=true,
AD_Tab_ID="3d6267ed-5f23-6b11-e123-ad46f1593c8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="abff6859-8fa2-abda-2010-08500e656f4e")
public static final String FIELDNAME_Routing_Keyword="abff6859-8fa2-abda-2010-08500e656f4e";

@XendraTrl(Identifier="c20fecfc-97bc-f111-337d-1ba1816d32ce")
public static String es_PE_COLUMN_Keyword_Name="Palabra clave";

@XendraColumn(AD_Element_ID="6f7779e8-2b8c-ce5e-af47-7b95aee9a09e",ColumnName="Keyword",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c20fecfc-97bc-f111-337d-1ba1816d32ce",
Synchronized="2019-08-30 22:23:50.0")
/** Column name Keyword */
public static final String COLUMNNAME_Keyword = "Keyword";
/** Set Request Processor.
@param R_RequestProcessor_ID Processor for Requests */
public void setR_RequestProcessor_ID (int R_RequestProcessor_ID)
{
if (R_RequestProcessor_ID < 1) throw new IllegalArgumentException ("R_RequestProcessor_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestProcessor_ID, Integer.valueOf(R_RequestProcessor_ID));
}
/** Get Request Processor.
@return Processor for Requests */
public int getR_RequestProcessor_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestProcessor_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fcad833b-10f3-9deb-8d6c-b8b896654ba1")
public static String es_PE_FIELD_Routing_RequestProcessor_Name="Procesador de Solicitudes";

@XendraField(AD_Column_ID="R_RequestProcessor_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3d6267ed-5f23-6b11-e123-ad46f1593c8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=40,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fcad833b-10f3-9deb-8d6c-b8b896654ba1")
public static final String FIELDNAME_Routing_RequestProcessor="fcad833b-10f3-9deb-8d6c-b8b896654ba1";

@XendraTrl(Identifier="3e4f7aeb-f4c0-3c03-1ae6-587a40805e33")
public static String es_PE_COLUMN_R_RequestProcessor_ID_Name="Procesador de Solicitudes";

@XendraColumn(AD_Element_ID="46933b36-2a16-058b-35d6-decb281596a9",
ColumnName="R_RequestProcessor_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=22,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="1",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3e4f7aeb-f4c0-3c03-1ae6-587a40805e33",Synchronized="2019-08-30 22:23:50.0")
/** Column name R_RequestProcessor_ID */
public static final String COLUMNNAME_R_RequestProcessor_ID = "R_RequestProcessor_ID";
/** Set Request Routing.
@param R_RequestProcessor_Route_ID Automatic routing of requests */
public void setR_RequestProcessor_Route_ID (int R_RequestProcessor_Route_ID)
{
if (R_RequestProcessor_Route_ID < 1) throw new IllegalArgumentException ("R_RequestProcessor_Route_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_R_RequestProcessor_Route_ID, Integer.valueOf(R_RequestProcessor_Route_ID));
}
/** Get Request Routing.
@return Automatic routing of requests */
public int getR_RequestProcessor_Route_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestProcessor_Route_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="9364f387-02d7-455a-a0e6-e911d5d944e7")
public static String es_PE_FIELD_Routing_RequestRouting_Name="Ruteo de la Solicitud";

@XendraTrl(Identifier="9364f387-02d7-455a-a0e6-e911d5d944e7")
public static String es_PE_FIELD_Routing_RequestRouting_Description="Ruteo automático de la solicitud";

@XendraField(AD_Column_ID="R_RequestProcessor_Route_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3d6267ed-5f23-6b11-e123-ad46f1593c8e",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="9364f387-02d7-455a-a0e6-e911d5d944e7")
public static final String FIELDNAME_Routing_RequestRouting="9364f387-02d7-455a-a0e6-e911d5d944e7";
/** Column name R_RequestProcessor_Route_ID */
public static final String COLUMNNAME_R_RequestProcessor_Route_ID = "R_RequestProcessor_Route_ID";
/** Set Request Type.
@param R_RequestType_ID Type of request (e.g. Inquiry, Complaint, ..) */
public void setR_RequestType_ID (int R_RequestType_ID)
{
if (R_RequestType_ID <= 0) set_Value (COLUMNNAME_R_RequestType_ID, null);
 else 
set_Value (COLUMNNAME_R_RequestType_ID, Integer.valueOf(R_RequestType_ID));
}
/** Get Request Type.
@return Type of request (e.g. Inquiry, Complaint, ..) */
public int getR_RequestType_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_R_RequestType_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="33c4a046-c3f2-2e4d-e810-bff145a6aecc")
public static String es_PE_FIELD_Routing_RequestType_Name="Tipo de Solicitud";

@XendraTrl(Identifier="33c4a046-c3f2-2e4d-e810-bff145a6aecc")
public static String es_PE_FIELD_Routing_RequestType_Description="Tipo de Solicitud (pregunta; queja).";

@XendraTrl(Identifier="33c4a046-c3f2-2e4d-e810-bff145a6aecc")
public static String es_PE_FIELD_Routing_RequestType_Help="Tipos de solicitud son usados para procesar y categorizar solicitudes. Ejemplos: consultas de cuentas; garantías; etc.";

@XendraField(AD_Column_ID="R_RequestType_ID",IsCentrallyMaintained=true,
AD_Tab_ID="3d6267ed-5f23-6b11-e123-ad46f1593c8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="33c4a046-c3f2-2e4d-e810-bff145a6aecc")
public static final String FIELDNAME_Routing_RequestType="33c4a046-c3f2-2e4d-e810-bff145a6aecc";

@XendraTrl(Identifier="0a58393b-17b2-9f15-cfc9-e04bc88bdc99")
public static String es_PE_COLUMN_R_RequestType_ID_Name="Tipo de Solicitud";

@XendraColumn(AD_Element_ID="5d38239d-4d14-9ae8-35a8-4f92ae90ab59",ColumnName="R_RequestType_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="0a58393b-17b2-9f15-cfc9-e04bc88bdc99",
Synchronized="2019-08-30 22:23:50.0")
/** Column name R_RequestType_ID */
public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";
/** Set Sequence.
@param SeqNo Method of ordering records: lowest number comes first */
public void setSeqNo (int SeqNo)
{
set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
}
/** Get Sequence.
@return Method of ordering records: lowest number comes first */
public int getSeqNo() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
if (ii == null) return 0;
return ii.intValue();
}
/** Get Record ID/ColumnName
@return ID/ColumnName pair
*/public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
}

@XendraTrl(Identifier="d0c91825-b50a-27b6-3661-2e2fc7ecbb11")
public static String es_PE_FIELD_Routing_Sequence_Name="Secuencia";

@XendraTrl(Identifier="d0c91825-b50a-27b6-3661-2e2fc7ecbb11")
public static String es_PE_FIELD_Routing_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="d0c91825-b50a-27b6-3661-2e2fc7ecbb11")
public static String es_PE_FIELD_Routing_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="3d6267ed-5f23-6b11-e123-ad46f1593c8e",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=60,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="d0c91825-b50a-27b6-3661-2e2fc7ecbb11")
public static final String FIELDNAME_Routing_Sequence="d0c91825-b50a-27b6-3661-2e2fc7ecbb11";

@XendraTrl(Identifier="8bf5e179-78a3-7a1f-3da5-1e3a4e219fb1")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8bf5e179-78a3-7a1f-3da5-1e3a4e219fb1",
Synchronized="2019-08-30 22:23:50.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
