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
/** Generated Model for M_OperationResource
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_M_OperationResource extends PO
{
/** Standard Constructor
@param ctx context
@param M_OperationResource_ID id
@param trxName transaction
*/
public X_M_OperationResource (Properties ctx, int M_OperationResource_ID, String trxName)
{
super (ctx, M_OperationResource_ID, trxName);
/** if (M_OperationResource_ID == 0)
{
setM_OperationResource_ID (0);
setM_ProductOperation_ID (0);
setName (null);
setSetupTime (Env.ZERO);
setTeardownTime (Env.ZERO);
setUnitRuntime (Env.ZERO);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_M_OperationResource (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=797 */
public static int Table_ID=MTable.getTable_ID("M_OperationResource");

@XendraTrl(Identifier="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3")
public static String es_PE_TAB_OperationResource_Description="Recursos de la operación del producto";

@XendraTrl(Identifier="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3")
public static String es_PE_TAB_OperationResource_Help="Recursos para la operación del producto. Usted puede tener multiples recursos (ej. herramienta, trabajo) por operación.";

@XendraTrl(Identifier="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3")
public static String es_PE_TAB_OperationResource_Name="Recursos de Operacion";

@XendraTab(Name="Operation Resource",Description="Product Operation Resources",
Help="Resources for the Operation. You can have multiple resources (e.g. tool, labor) per operation.",
AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",SeqNo=40,TabLevel=2,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_OperationResource="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3";

@XendraTrl(Identifier="5d33bf71-64df-01d0-7a3f-c211a4c17406")
public static String es_PE_TABLE_M_OperationResource_Name="Recurso de la Operación";

@XendraTable(Name="Operation Resource",AD_Package_ID="2809ac2d-7d43-20f8-05f0-a478f2e50204",
AD_Plugin_ID="67dff047-7c04-1001-e4d1-ad0b0ce9a44a",Description="Product Operation Resource",
Help="",TableName="M_OperationResource",AccessLevel="3",
AD_Window_ID="19c8d953-bce9-f34c-e702-5d8e285fb49d",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.material",Identifier="5d33bf71-64df-01d0-7a3f-c211a4c17406",
Synchronized="2020-03-03 21:38:45.0")
/** TableName=M_OperationResource */
public static final String Table_Name="M_OperationResource";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"M_OperationResource");

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
    Table_ID = MTable.getTable_ID("M_OperationResource");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_M_OperationResource[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Asset.
@param A_Asset_ID Asset used internally or by customers */
public void setA_Asset_ID (int A_Asset_ID)
{
if (A_Asset_ID <= 0) set_Value (COLUMNNAME_A_Asset_ID, null);
 else 
set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
}
/** Get Asset.
@return Asset used internally or by customers */
public int getA_Asset_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="cca7ef09-f19d-e5a8-9beb-84a94e3c0ce8")
public static String es_PE_FIELD_OperationResource_Asset_Name="Activo";

@XendraTrl(Identifier="cca7ef09-f19d-e5a8-9beb-84a94e3c0ce8")
public static String es_PE_FIELD_OperationResource_Asset_Description="Activo usado por la compañía o sus clientes";

@XendraTrl(Identifier="cca7ef09-f19d-e5a8-9beb-84a94e3c0ce8")
public static String es_PE_FIELD_OperationResource_Asset_Help="Indica si es usado por la compañia o sus clientes";

@XendraField(AD_Column_ID="A_Asset_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="cca7ef09-f19d-e5a8-9beb-84a94e3c0ce8")
public static final String FIELDNAME_OperationResource_Asset="cca7ef09-f19d-e5a8-9beb-84a94e3c0ce8";

@XendraTrl(Identifier="212ef5f1-3c84-334e-65fd-30c8aa1f3a1d")
public static String es_PE_COLUMN_A_Asset_ID_Name="Activo";

@XendraColumn(AD_Element_ID="3cd84c49-e25b-9ecc-5637-ed9a07d76bee",ColumnName="A_Asset_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="212ef5f1-3c84-334e-65fd-30c8aa1f3a1d",
Synchronized="2019-08-30 22:23:20.0")
/** Column name A_Asset_ID */
public static final String COLUMNNAME_A_Asset_ID = "A_Asset_ID";
/** Set Position.
@param C_Job_ID Job Position */
public void setC_Job_ID (int C_Job_ID)
{
if (C_Job_ID <= 0) set_Value (COLUMNNAME_C_Job_ID, null);
 else 
set_Value (COLUMNNAME_C_Job_ID, Integer.valueOf(C_Job_ID));
}
/** Get Position.
@return Job Position */
public int getC_Job_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_Job_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="fdf2f26b-8f3e-acff-fde1-bb979325b124")
public static String es_PE_FIELD_OperationResource_Position_Name="Posición";

@XendraTrl(Identifier="fdf2f26b-8f3e-acff-fde1-bb979325b124")
public static String es_PE_FIELD_OperationResource_Position_Description="Posición del trabajo";

@XendraField(AD_Column_ID="C_Job_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=90,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="fdf2f26b-8f3e-acff-fde1-bb979325b124")
public static final String FIELDNAME_OperationResource_Position="fdf2f26b-8f3e-acff-fde1-bb979325b124";

@XendraTrl(Identifier="8d1b957f-6f29-c5cb-caf6-a84418058f93")
public static String es_PE_COLUMN_C_Job_ID_Name="Posición";

@XendraColumn(AD_Element_ID="90c49ce9-ecea-a060-14e0-eca90ed486ad",ColumnName="C_Job_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="8d1b957f-6f29-c5cb-caf6-a84418058f93",
Synchronized="2019-08-30 22:23:20.0")
/** Column name C_Job_ID */
public static final String COLUMNNAME_C_Job_ID = "C_Job_ID";
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

@XendraTrl(Identifier="c9be11ff-d111-55f4-fef5-73db280e1926")
public static String es_PE_FIELD_OperationResource_Description_Name="Observación";

@XendraTrl(Identifier="c9be11ff-d111-55f4-fef5-73db280e1926")
public static String es_PE_FIELD_OperationResource_Description_Description="Observación";

@XendraTrl(Identifier="c9be11ff-d111-55f4-fef5-73db280e1926")
public static String es_PE_FIELD_OperationResource_Description_Help="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="c9be11ff-d111-55f4-fef5-73db280e1926")
public static final String FIELDNAME_OperationResource_Description="c9be11ff-d111-55f4-fef5-73db280e1926";

@XendraTrl(Identifier="c4b9e3ff-7b8a-60f2-f677-3adeecb7da3c")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c4b9e3ff-7b8a-60f2-f677-3adeecb7da3c",
Synchronized="2019-08-30 22:23:20.0")
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

@XendraTrl(Identifier="7874b0b3-ec79-a03c-676d-af705fe277e3")
public static String es_PE_FIELD_OperationResource_CommentHelp_Name="Ayuda";

@XendraTrl(Identifier="7874b0b3-ec79-a03c-676d-af705fe277e3")
public static String es_PE_FIELD_OperationResource_CommentHelp_Description="Ayuda; Comentario o Sugerencia";

@XendraTrl(Identifier="7874b0b3-ec79-a03c-676d-af705fe277e3")
public static String es_PE_FIELD_OperationResource_CommentHelp_Help="El campo ayuda contiene una sugerencia; comentario o ayuda acerca del uso de esta partida";

@XendraField(AD_Column_ID="Help",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=60,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="7874b0b3-ec79-a03c-676d-af705fe277e3")
public static final String FIELDNAME_OperationResource_CommentHelp="7874b0b3-ec79-a03c-676d-af705fe277e3";

@XendraTrl(Identifier="e128ef1c-5173-f0f4-85d0-e9e832274347")
public static String es_PE_COLUMN_Help_Name="Ayuda";

@XendraColumn(AD_Element_ID="a6fda582-56f9-6bb7-8436-285ce4f8de3f",ColumnName="Help",
AD_Reference_ID=14,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=2000,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="e128ef1c-5173-f0f4-85d0-e9e832274347",
Synchronized="2019-08-30 22:23:20.0")
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
@XendraTrl(Identifier="5d723ab3-48df-4375-8ecd-3920f18bfaa4")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5d723ab3-48df-4375-8ecd-3920f18bfaa4",
Synchronized="2019-08-30 22:23:20.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Operation Resource.
@param M_OperationResource_ID Product Operation Resource */
public void setM_OperationResource_ID (int M_OperationResource_ID)
{
if (M_OperationResource_ID < 1) throw new IllegalArgumentException ("M_OperationResource_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_OperationResource_ID, Integer.valueOf(M_OperationResource_ID));
}
/** Get Operation Resource.
@return Product Operation Resource */
public int getM_OperationResource_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_OperationResource_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="ae8e3fd1-bdfa-063f-19d1-c1028d046772")
public static String es_PE_FIELD_OperationResource_OperationResource_Name="Recurso de la Operación";

@XendraTrl(Identifier="ae8e3fd1-bdfa-063f-19d1-c1028d046772")
public static String es_PE_FIELD_OperationResource_OperationResource_Description="Producto del Recurso de la Operación";

@XendraTrl(Identifier="ae8e3fd1-bdfa-063f-19d1-c1028d046772")
public static String es_PE_FIELD_OperationResource_OperationResource_Help="Recursos para la operación. Usted puede tener multiples recursos (ej. herramientas, trabajo) por la operación.";

@XendraField(AD_Column_ID="M_OperationResource_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=0,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="ae8e3fd1-bdfa-063f-19d1-c1028d046772")
public static final String FIELDNAME_OperationResource_OperationResource="ae8e3fd1-bdfa-063f-19d1-c1028d046772";
/** Column name M_OperationResource_ID */
public static final String COLUMNNAME_M_OperationResource_ID = "M_OperationResource_ID";
/** Set Product Operation.
@param M_ProductOperation_ID Product Manufacturing Operation */
public void setM_ProductOperation_ID (int M_ProductOperation_ID)
{
if (M_ProductOperation_ID < 1) throw new IllegalArgumentException ("M_ProductOperation_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_M_ProductOperation_ID, Integer.valueOf(M_ProductOperation_ID));
}
/** Get Product Operation.
@return Product Manufacturing Operation */
public int getM_ProductOperation_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductOperation_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="1b550ee7-824c-0ced-eac1-757e80e0b60b")
public static String es_PE_FIELD_OperationResource_ProductOperation_Name="Operación del Producto";

@XendraTrl(Identifier="1b550ee7-824c-0ced-eac1-757e80e0b60b")
public static String es_PE_FIELD_OperationResource_ProductOperation_Description="Operación de manufactura del producto";

@XendraTrl(Identifier="1b550ee7-824c-0ced-eac1-757e80e0b60b")
public static String es_PE_FIELD_OperationResource_ProductOperation_Help="La operación para crear el producto. Note que el actual uso y operación de secuencia es determinado por la LDM del producto.";

@XendraField(AD_Column_ID="M_ProductOperation_ID",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=14,IsReadOnly=true,SeqNo=30,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="1b550ee7-824c-0ced-eac1-757e80e0b60b")
public static final String FIELDNAME_OperationResource_ProductOperation="1b550ee7-824c-0ced-eac1-757e80e0b60b";

@XendraTrl(Identifier="c7c97f18-09a5-0177-5042-ab22713f929a")
public static String es_PE_COLUMN_M_ProductOperation_ID_Name="Operación del Producto";

@XendraColumn(AD_Element_ID="d09057a1-9f5e-167b-8e7e-d967dd899ea6",
ColumnName="M_ProductOperation_ID",AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",
FieldLength=10,DefaultValue="",IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,
IsUpdateable=false,ReadOnlyLogic="",IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",
VFormat="",ValueMin="",ValueMax="",Version="0",IsSelectionColumn=false,AD_Process_ID="",
IsAlwaysUpdateable=false,ColumnSQL="",IsAllowLogging=false,
Identifier="c7c97f18-09a5-0177-5042-ab22713f929a",Synchronized="2019-08-30 22:23:20.0")
/** Column name M_ProductOperation_ID */
public static final String COLUMNNAME_M_ProductOperation_ID = "M_ProductOperation_ID";
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

@XendraTrl(Identifier="18f7ce86-d4b6-f276-6aca-5d19db16a442")
public static String es_PE_FIELD_OperationResource_Name_Name="Nombre";

@XendraTrl(Identifier="18f7ce86-d4b6-f276-6aca-5d19db16a442")
public static String es_PE_FIELD_OperationResource_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="18f7ce86-d4b6-f276-6aca-5d19db16a442")
public static String es_PE_FIELD_OperationResource_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="18f7ce86-d4b6-f276-6aca-5d19db16a442")
public static final String FIELDNAME_OperationResource_Name="18f7ce86-d4b6-f276-6aca-5d19db16a442";

@XendraTrl(Identifier="d3bbd776-8902-dc26-307e-65ba9280bdec")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d3bbd776-8902-dc26-307e-65ba9280bdec",
Synchronized="2019-08-30 22:23:20.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
/** Set Setup Time.
@param SetupTime Setup time before starting Production */
public void setSetupTime (BigDecimal SetupTime)
{
if (SetupTime == null) throw new IllegalArgumentException ("SetupTime is mandatory.");
set_Value (COLUMNNAME_SetupTime, SetupTime);
}
/** Get Setup Time.
@return Setup time before starting Production */
public BigDecimal getSetupTime() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SetupTime);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="806cc6da-4e7c-7af9-2ab8-145d91a84a64")
public static String es_PE_FIELD_OperationResource_SetupTime_Name="Tiempo por lote";

@XendraTrl(Identifier="806cc6da-4e7c-7af9-2ab8-145d91a84a64")
public static String es_PE_FIELD_OperationResource_SetupTime_Description="Tiempo requerido para producir un lote en la operación";

@XendraField(AD_Column_ID="SetupTime",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=100,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="806cc6da-4e7c-7af9-2ab8-145d91a84a64")
public static final String FIELDNAME_OperationResource_SetupTime="806cc6da-4e7c-7af9-2ab8-145d91a84a64";

@XendraTrl(Identifier="847633b5-88d6-2220-6333-fd4f0f9be7f2")
public static String es_PE_COLUMN_SetupTime_Name="Tiempo por lote";

@XendraColumn(AD_Element_ID="a4a9a3ef-8759-dcb2-f229-535e609f1fed",ColumnName="SetupTime",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="847633b5-88d6-2220-6333-fd4f0f9be7f2",
Synchronized="2019-08-30 22:23:20.0")
/** Column name SetupTime */
public static final String COLUMNNAME_SetupTime = "SetupTime";
/** Set Teardown Time.
@param TeardownTime Time at the end of the operation */
public void setTeardownTime (BigDecimal TeardownTime)
{
if (TeardownTime == null) throw new IllegalArgumentException ("TeardownTime is mandatory.");
set_Value (COLUMNNAME_TeardownTime, TeardownTime);
}
/** Get Teardown Time.
@return Time at the end of the operation */
public BigDecimal getTeardownTime() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_TeardownTime);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="29586ed7-b7c5-1a53-e7d4-ad8eb2c418bd")
public static String es_PE_FIELD_OperationResource_TeardownTime_Name="Tiempo de Desmontaje";

@XendraTrl(Identifier="29586ed7-b7c5-1a53-e7d4-ad8eb2c418bd")
public static String es_PE_FIELD_OperationResource_TeardownTime_Description="Tiempo de final de operaciones";

@XendraTrl(Identifier="29586ed7-b7c5-1a53-e7d4-ad8eb2c418bd")
public static String es_PE_FIELD_OperationResource_TeardownTime_Help="Tiempo muerto de operaciones";

@XendraField(AD_Column_ID="TeardownTime",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=110,SortNo=0,IsSameLine=true,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="29586ed7-b7c5-1a53-e7d4-ad8eb2c418bd")
public static final String FIELDNAME_OperationResource_TeardownTime="29586ed7-b7c5-1a53-e7d4-ad8eb2c418bd";

@XendraTrl(Identifier="ac1c092c-8f4f-de3a-8c3e-402013fd0193")
public static String es_PE_COLUMN_TeardownTime_Name="Tiempo de Desmontaje";

@XendraColumn(AD_Element_ID="5151cda7-dd8d-eb5a-c132-3653bff993f4",ColumnName="TeardownTime",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="ac1c092c-8f4f-de3a-8c3e-402013fd0193",
Synchronized="2019-08-30 22:23:20.0")
/** Column name TeardownTime */
public static final String COLUMNNAME_TeardownTime = "TeardownTime";
/** Set Runtime per Unit.
@param UnitRuntime Time to produce one unit */
public void setUnitRuntime (BigDecimal UnitRuntime)
{
if (UnitRuntime == null) throw new IllegalArgumentException ("UnitRuntime is mandatory.");
set_Value (COLUMNNAME_UnitRuntime, UnitRuntime);
}
/** Get Runtime per Unit.
@return Time to produce one unit */
public BigDecimal getUnitRuntime() 
{
BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UnitRuntime);
if (bd == null) return Env.ZERO;
return bd;
}

@XendraTrl(Identifier="67ceb929-40ad-4381-f518-ac68bbb53c01")
public static String es_PE_FIELD_OperationResource_RuntimePerUnit_Name="Tiempo de Corrida por Unidad";

@XendraTrl(Identifier="67ceb929-40ad-4381-f518-ac68bbb53c01")
public static String es_PE_FIELD_OperationResource_RuntimePerUnit_Description="Tiempo de corrida para producir una unidad";

@XendraField(AD_Column_ID="UnitRuntime",IsCentrallyMaintained=true,
AD_Tab_ID="b055e8d1-8c17-6f2f-c5c2-72ec42cef4c3",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=26,IsReadOnly=false,SeqNo=120,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="67ceb929-40ad-4381-f518-ac68bbb53c01")
public static final String FIELDNAME_OperationResource_RuntimePerUnit="67ceb929-40ad-4381-f518-ac68bbb53c01";

@XendraTrl(Identifier="f863df95-a261-aa09-bd00-190d0432a753")
public static String es_PE_COLUMN_UnitRuntime_Name="Tiempo de Corrida por Unidad";

@XendraColumn(AD_Element_ID="1ac087b3-1c73-dc7b-442d-b951f640621b",ColumnName="UnitRuntime",
AD_Reference_ID=22,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="f863df95-a261-aa09-bd00-190d0432a753",
Synchronized="2019-08-30 22:23:20.0")
/** Column name UnitRuntime */
public static final String COLUMNNAME_UnitRuntime = "UnitRuntime";
}
