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
/** Generated Model for A_MachineServer
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_A_MachineServer extends PO
{
/** Standard Constructor
@param ctx context
@param A_MachineServer_ID id
@param trxName transaction
*/
public X_A_MachineServer (Properties ctx, int A_MachineServer_ID, String trxName)
{
super (ctx, A_MachineServer_ID, trxName);
/** if (A_MachineServer_ID == 0)
{
setA_MachineServer_ID (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_A_MachineServer (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=1000375 */
public static int Table_ID=MTable.getTable_ID("A_MachineServer");

@XendraTrl(Identifier="2c5df1ea-71a2-4d04-b012-82d124e31f53")
public static String es_PE_TAB_MachineServer_Name="Machine Server";

@XendraTab(Name="Machine Server",Description="",Help="",
AD_Window_ID="b4ab225c-6f13-434a-80f7-4f6fdfa4fdb3",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="2c5df1ea-71a2-4d04-b012-82d124e31f53",Synchronized="2016-12-06 14:57:54.0")
public static final String TABNAME_MachineServer="2c5df1ea-71a2-4d04-b012-82d124e31f53";

@XendraTrl(Identifier="3685f550-9322-4f22-b7c5-f3dcfcde7a6b")
public static String es_PE_TABLE_A_MachineServer_Name="Machine Server";

@XendraTable(Name="Machine Server",AD_Package_ID="1b3656e5-71c7-1296-994e-9b2c4549c7fd",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="",Help="",
TableName="A_MachineServer",AccessLevel="3",AD_Window_ID="b4ab225c-6f13-434a-80f7-4f6fdfa4fdb3",
AD_Val_Rule_ID="",IsKey=1,LoadSeq=0,IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=false,
IsChangeLog=false,IsView=false,PO_Window_ID="",ID="org.xendra.standard",
Identifier="3685f550-9322-4f22-b7c5-f3dcfcde7a6b",Synchronized="2020-03-03 21:36:14.0")
/** TableName=A_MachineServer */
public static final String Table_Name="A_MachineServer";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"A_MachineServer");

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
    Table_ID = MTable.getTable_ID("A_MachineServer");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_A_MachineServer[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Machine Server.
@param A_MachineServer_ID Machine Server */
public void setA_MachineServer_ID (int A_MachineServer_ID)
{
if (A_MachineServer_ID < 1) throw new IllegalArgumentException ("A_MachineServer_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_A_MachineServer_ID, Integer.valueOf(A_MachineServer_ID));
}
/** Get Machine Server.
@return Machine Server */
public int getA_MachineServer_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_MachineServer_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="2722b2b0-bdf2-41f1-9eb0-4616df8cfe64")
public static String es_PE_FIELD_MachineServer_MachineServer_Name="Machine Server";

@XendraField(AD_Column_ID="A_MachineServer_ID",IsCentrallyMaintained=true,
AD_Tab_ID="2c5df1ea-71a2-4d04-b012-82d124e31f53",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=10,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-12-06 14:57:53.0",
Identifier="2722b2b0-bdf2-41f1-9eb0-4616df8cfe64")
public static final String FIELDNAME_MachineServer_MachineServer="2722b2b0-bdf2-41f1-9eb0-4616df8cfe64";
/** Column name A_MachineServer_ID */
public static final String COLUMNNAME_A_MachineServer_ID = "A_MachineServer_ID";
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
@XendraTrl(Identifier="28a5aed3-285a-45a5-aa83-631b99f19d25")
public static String es_PE_FIELD_MachineServer_Identifier_Name="Identifier";

@XendraField(AD_Column_ID="Identifier",IsCentrallyMaintained=true,
AD_Tab_ID="2c5df1ea-71a2-4d04-b012-82d124e31f53",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=36,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-12-06 14:57:53.0",
Identifier="28a5aed3-285a-45a5-aa83-631b99f19d25")
public static final String FIELDNAME_MachineServer_Identifier="28a5aed3-285a-45a5-aa83-631b99f19d25";

@XendraTrl(Identifier="a1e46c34-5640-4491-a83e-ffc66f8500b0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="a1e46c34-5640-4491-a83e-ffc66f8500b0",
Synchronized="2019-08-30 22:20:55.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Name.
@param Name Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name != null && Name.length() > 200)
{
log.warning("Length > 200 - truncated");
Name = Name.substring(0,199);
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

@XendraTrl(Identifier="a67416d9-082c-4bfa-8a22-036a5ba6a4dc")
public static String es_PE_FIELD_MachineServer_Name_Name="Nombre";

@XendraTrl(Identifier="a67416d9-082c-4bfa-8a22-036a5ba6a4dc")
public static String es_PE_FIELD_MachineServer_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="a67416d9-082c-4bfa-8a22-036a5ba6a4dc")
public static String es_PE_FIELD_MachineServer_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="2c5df1ea-71a2-4d04-b012-82d124e31f53",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=200,IsReadOnly=false,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-12-06 14:57:53.0",
Identifier="a67416d9-082c-4bfa-8a22-036a5ba6a4dc")
public static final String FIELDNAME_MachineServer_Name="a67416d9-082c-4bfa-8a22-036a5ba6a4dc";

@XendraTrl(Identifier="57378bde-f7ab-4773-bd33-29c69c61320b")
public static String es_PE_COLUMN_Name_Name="Name";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=200,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="57378bde-f7ab-4773-bd33-29c69c61320b",
Synchronized="2019-08-30 22:20:55.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Properties.
@param Properties Properties */
public void setProperties (HashMap Properties)
{
set_Value (COLUMNNAME_Properties, Properties);
}
/** Get Properties.
@return Properties */
public HashMap getProperties() 
{
HashMap propsrc = (HashMap)get_Value(COLUMNNAME_Properties);
if (propsrc == null) return new HashMap();
 HashMap propdst = (HashMap) propsrc.clone();
return propdst;
}

@XendraTrl(Identifier="c14ad57b-d425-4a72-a563-72efd883b381")
public static String es_PE_COLUMN_Properties_Name="Properties";

@XendraColumn(AD_Element_ID="acc3987b-292c-475a-86b5-5104970a96f3",ColumnName="Properties",
AD_Reference_ID=46,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=1,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c14ad57b-d425-4a72-a563-72efd883b381",
Synchronized="2019-08-30 22:20:55.0")
/** Column name Properties */
public static final String COLUMNNAME_Properties = "Properties";
/** Set ServerType.
@param ServerType ServerType */
public void setServerType (String ServerType)
{
if (ServerType != null && ServerType.length() > 2)
{
log.warning("Length > 2 - truncated");
ServerType = ServerType.substring(0,1);
}
set_Value (COLUMNNAME_ServerType, ServerType);
}
/** Get ServerType.
@return ServerType */
public String getServerType() 
{
return (String)get_Value(COLUMNNAME_ServerType);
}

@XendraTrl(Identifier="a998f09e-4378-4dae-8b42-7d7004610392")
public static String es_PE_FIELD_MachineServer_ServerType_Name="servertype";

@XendraField(AD_Column_ID="ServerType",IsCentrallyMaintained=true,
AD_Tab_ID="2c5df1ea-71a2-4d04-b012-82d124e31f53",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=1,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2016-12-06 14:57:54.0",
Identifier="a998f09e-4378-4dae-8b42-7d7004610392")
public static final String FIELDNAME_MachineServer_ServerType="a998f09e-4378-4dae-8b42-7d7004610392";

@XendraTrl(Identifier="3591a2f8-44a6-4069-bee7-360a3a216485")
public static String es_PE_COLUMN_ServerType_Name="servertype";

@XendraColumn(AD_Element_ID="2132ca36-eabf-41c4-811c-2890d45876bb",ColumnName="ServerType",
AD_Reference_ID=17,AD_Reference_Value_ID="a8ab0df9-7482-42bb-877a-13029372964f",AD_Val_Rule_ID="",
FieldLength=2,DefaultValue="",IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,
IsUpdateable=true,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="3591a2f8-44a6-4069-bee7-360a3a216485",Synchronized="2019-08-30 22:20:55.0")
/** Column name ServerType */
public static final String COLUMNNAME_ServerType = "ServerType";
}
