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
/** Generated Model for C_BankStatementMatcher
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_C_BankStatementMatcher extends PO
{
/** Standard Constructor
@param ctx context
@param C_BankStatementMatcher_ID id
@param trxName transaction
*/
public X_C_BankStatementMatcher (Properties ctx, int C_BankStatementMatcher_ID, String trxName)
{
super (ctx, C_BankStatementMatcher_ID, trxName);
/** if (C_BankStatementMatcher_ID == 0)
{
setC_BankStatementMatcher_ID (0);
setClassname (null);
setName (null);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_C_BankStatementMatcher (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=658 */
public static int Table_ID=MTable.getTable_ID("C_BankStatementMatcher");

@XendraTrl(Identifier="f2d2569e-4950-ce16-8399-cecca720907d")
public static String es_PE_TAB_BankStatementMatcher_Description="Algoritmo para emparejar el estado de cuenta que es Información a los socios de negocio, las facturas y los pagos.";

@XendraTrl(Identifier="f2d2569e-4950-ce16-8399-cecca720907d")
public static String es_PE_TAB_BankStatementMatcher_Name="Estado de Cuenta";

@XendraTrl(Identifier="f2d2569e-4950-ce16-8399-cecca720907d")
public static String es_PE_TAB_BankStatementMatcher_Help="Un algoritmo para encontrar a socios de negocio, facturas, pagos en estados de cuenta importados. La necesidad de poner la clase del interfaz en ejecución, org.compiere.impexp.BankStatementMatcherInterface";

@XendraTab(Name="Bank Statement Matcher",
Description="Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments",
Help="An algorithm to find Business Partners, Invoices, Payments in imported Bank Statements. The class need to implement the interface org.compiere.impexp.BankStatementMatcherInterface",
AD_Window_ID="28206c86-ec77-b21b-2f4a-34bad0048c29",SeqNo=10,TabLevel=0,IsSingleRow=false,
IsInfoTab=false,IsTranslationTab=false,IsReadOnly=false,AD_Column_ID="",HasTree=false,
WhereClause="",OrderByClause="",CommitWarning="",AD_Process_ID="",AD_ColumnSortOrder_ID="",
AD_ColumnSortYesNo_ID="",IsSortTab=false,Included_Tab_ID="",ReadOnlyLogic="",DisplayLogic="",
IsInsertRecord=true,IsAdvancedTab=false,Parent_Column_ID="",
Identifier="f2d2569e-4950-ce16-8399-cecca720907d",Synchronized="2012-03-17 18:47:08.603")
public static final String TABNAME_BankStatementMatcher="f2d2569e-4950-ce16-8399-cecca720907d";

@XendraTrl(Identifier="cf6d5264-2dc8-4dae-acc8-fe8c07d50216")
public static String es_PE_TABLE_C_BankStatementMatcher_Name="Conciliación de estado de cuenta";


@XendraTable(Name="Bank Statement Matcher",
Description="Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments",
Help="",TableName="C_BankStatementMatcher",AccessLevel="2",
AD_Window_ID="28206c86-ec77-b21b-2f4a-34bad0048c29",AD_Val_Rule_ID="",IsKey=1,LoadSeq=145,
IsSecurityEnabled=false,IsDeleteable=true,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.commercial",Identifier="cf6d5264-2dc8-4dae-acc8-fe8c07d50216",
Synchronized="2017-08-16 11:41:24.0")
/** TableName=C_BankStatementMatcher */
public static final String Table_Name="C_BankStatementMatcher";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"C_BankStatementMatcher");

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
    Table_ID = MTable.getTable_ID("C_BankStatementMatcher");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_BankStatementMatcher[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Bank Statement Matcher.
@param C_BankStatementMatcher_ID Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments */
public void setC_BankStatementMatcher_ID (int C_BankStatementMatcher_ID)
{
if (C_BankStatementMatcher_ID < 1) throw new IllegalArgumentException ("C_BankStatementMatcher_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_C_BankStatementMatcher_ID, Integer.valueOf(C_BankStatementMatcher_ID));
}
/** Get Bank Statement Matcher.
@return Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments */
public int getC_BankStatementMatcher_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_C_BankStatementMatcher_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5b4ec33b-3d45-9155-d26f-fd489d68c8bd")
public static String es_PE_FIELD_BankStatementMatcher_BankStatementMatcher_Description="Algoritmo para conciliar el estado de cuenta, Información a los socios, a las facturas y pagos de negocio";

@XendraTrl(Identifier="5b4ec33b-3d45-9155-d26f-fd489d68c8bd")
public static String es_PE_FIELD_BankStatementMatcher_BankStatementMatcher_Help="Un algoritmo para encontrar a socios de negocio, facturas, pagos en estados de cuenta importados";

@XendraTrl(Identifier="5b4ec33b-3d45-9155-d26f-fd489d68c8bd")
public static String es_PE_FIELD_BankStatementMatcher_BankStatementMatcher_Name="Conciliación de estado de cuenta";

@XendraField(AD_Column_ID="C_BankStatementMatcher_ID",IsCentrallyMaintained=true,
AD_Tab_ID="f2d2569e-4950-ce16-8399-cecca720907d",AD_FieldGroup_ID="",IsDisplayed=false,
DisplayLogic="",DisplayLength=14,IsReadOnly=false,SeqNo=10,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="5b4ec33b-3d45-9155-d26f-fd489d68c8bd")
public static final String FIELDNAME_BankStatementMatcher_BankStatementMatcher="5b4ec33b-3d45-9155-d26f-fd489d68c8bd";
/** Column name C_BankStatementMatcher_ID */
public static final String COLUMNNAME_C_BankStatementMatcher_ID = "C_BankStatementMatcher_ID";
/** Set Classname.
@param Classname Java Classname */
public void setClassname (String Classname)
{
if (Classname == null) throw new IllegalArgumentException ("Classname is mandatory.");
if (Classname.length() > 60)
{
log.warning("Length > 60 - truncated");
Classname = Classname.substring(0,59);
}
set_Value (COLUMNNAME_Classname, Classname);
}
/** Get Classname.
@return Java Classname */
public String getClassname() 
{
String value = (String)get_Value(COLUMNNAME_Classname);
if (value == null)
  return "";
return value;
}
@XendraTrl(Identifier="eb548ce1-e7d0-a669-3979-54ed1b856d02")
public static String es_PE_FIELD_BankStatementMatcher_Classname_Description="Nombre de la clase Java";

@XendraTrl(Identifier="eb548ce1-e7d0-a669-3979-54ed1b856d02")
public static String es_PE_FIELD_BankStatementMatcher_Classname_Help="El nombre de clase identifica el nombre de la clase Java usada por este Informe ó proceso.";

@XendraTrl(Identifier="eb548ce1-e7d0-a669-3979-54ed1b856d02")
public static String es_PE_FIELD_BankStatementMatcher_Classname_Name="Nombre de Clase";

@XendraField(AD_Column_ID="Classname",IsCentrallyMaintained=true,
AD_Tab_ID="f2d2569e-4950-ce16-8399-cecca720907d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=70,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="eb548ce1-e7d0-a669-3979-54ed1b856d02")
public static final String FIELDNAME_BankStatementMatcher_Classname="eb548ce1-e7d0-a669-3979-54ed1b856d02";

@XendraTrl(Identifier="819a576d-81d4-8df5-634b-f2d7a3cde957")
public static String es_PE_COLUMN_Classname_Name="Nombre de Clase";

@XendraColumn(AD_Element_ID="43b208b9-53a3-0d59-0255-aaf07c9bd7ce",ColumnName="Classname",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="819a576d-81d4-8df5-634b-f2d7a3cde957",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Classname */
public static final String COLUMNNAME_Classname = "Classname";
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

@XendraTrl(Identifier="dd18d647-0432-b4e8-dce2-cdd812426468")
public static String es_PE_FIELD_BankStatementMatcher_Description_Description="Observación corta opcional del registro";

@XendraTrl(Identifier="dd18d647-0432-b4e8-dce2-cdd812426468")
public static String es_PE_FIELD_BankStatementMatcher_Description_Help="Una Observación esta limitada a 255 caracteres";

@XendraTrl(Identifier="dd18d647-0432-b4e8-dce2-cdd812426468")
public static String es_PE_FIELD_BankStatementMatcher_Description_Name="Observación";

@XendraField(AD_Column_ID="Description",IsCentrallyMaintained=true,
AD_Tab_ID="f2d2569e-4950-ce16-8399-cecca720907d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=50,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="dd18d647-0432-b4e8-dce2-cdd812426468")
public static final String FIELDNAME_BankStatementMatcher_Description="dd18d647-0432-b4e8-dce2-cdd812426468";

@XendraTrl(Identifier="7161d9ad-988b-9c4f-88bb-f2ec517e4df2")
public static String es_PE_COLUMN_Description_Name="Descripción";

@XendraColumn(AD_Element_ID="2c699aa9-808d-eb67-0fe1-3328890909ca",ColumnName="Description",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=255,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="7161d9ad-988b-9c4f-88bb-f2ec517e4df2",
Synchronized="2017-08-05 16:53:16.0")
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
@XendraTrl(Identifier="c201811a-528d-4541-a7c5-33c674a7fff0")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="c201811a-528d-4541-a7c5-33c674a7fff0",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
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

@XendraTrl(Identifier="f46a4a55-fe30-689a-3886-6cce6c0bf210")
public static String es_PE_FIELD_BankStatementMatcher_Name_Description="Identificador alfanumérico de la entidad.";

@XendraTrl(Identifier="f46a4a55-fe30-689a-3886-6cce6c0bf210")
public static String es_PE_FIELD_BankStatementMatcher_Name_Help="El nombre de una entidad (registro) se usa como una opción de búsqueda predeterminada adicional a la clave de búsqueda. El nombre es de hasta 60 caracteres de longitud.";

@XendraTrl(Identifier="f46a4a55-fe30-689a-3886-6cce6c0bf210")
public static String es_PE_FIELD_BankStatementMatcher_Name_Name="Nombre";

@XendraField(AD_Column_ID="Name",IsCentrallyMaintained=true,
AD_Tab_ID="f2d2569e-4950-ce16-8399-cecca720907d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=60,IsReadOnly=false,SeqNo=40,SortNo=1,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="f46a4a55-fe30-689a-3886-6cce6c0bf210")
public static final String FIELDNAME_BankStatementMatcher_Name="f46a4a55-fe30-689a-3886-6cce6c0bf210";

@XendraTrl(Identifier="96145a1a-a96d-f605-c21d-53bf2c5db28f")
public static String es_PE_COLUMN_Name_Name="Nombre";

@XendraColumn(AD_Element_ID="c0b362bf-e56d-aa8a-9021-c8c580f635de",ColumnName="Name",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=60,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=true,SeqNo=1,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=true,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="96145a1a-a96d-f605-c21d-53bf2c5db28f",
Synchronized="2017-08-05 16:53:16.0")
/** Column name Name */
public static final String COLUMNNAME_Name = "Name";
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

@XendraTrl(Identifier="42b7e2f1-1379-8a2b-e15c-987a5994aae2")
public static String es_PE_FIELD_BankStatementMatcher_Sequence_Description="Método de ordenar registros; el número más bajo viene primero";

@XendraTrl(Identifier="42b7e2f1-1379-8a2b-e15c-987a5994aae2")
public static String es_PE_FIELD_BankStatementMatcher_Sequence_Help="La Secuencia indica el orden de los registros";

@XendraTrl(Identifier="42b7e2f1-1379-8a2b-e15c-987a5994aae2")
public static String es_PE_FIELD_BankStatementMatcher_Sequence_Name="Secuencia";

@XendraField(AD_Column_ID="SeqNo",IsCentrallyMaintained=true,
AD_Tab_ID="f2d2569e-4950-ce16-8399-cecca720907d",AD_FieldGroup_ID="",IsDisplayed=true,
DisplayLogic="",DisplayLength=11,IsReadOnly=false,SeqNo=80,SortNo=0,IsSameLine=false,
IsHeading=false,IsFieldOnly=false,Included_Tab_ID="",Synchronized="2012-03-17 18:47:14.0",
Identifier="42b7e2f1-1379-8a2b-e15c-987a5994aae2")
public static final String FIELDNAME_BankStatementMatcher_Sequence="42b7e2f1-1379-8a2b-e15c-987a5994aae2";

@XendraTrl(Identifier="4a3cc945-91d2-90cc-e42c-26b049a062f4")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=22,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="1",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="4a3cc945-91d2-90cc-e42c-26b049a062f4",
Synchronized="2017-08-05 16:53:16.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
