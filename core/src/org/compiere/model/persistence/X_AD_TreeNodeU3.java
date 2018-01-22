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
/** Generated Model for AD_TreeNodeU3
 *  @author Xendra (generated) 
 *  @version Release 2.00 - $Id: GenerateModel.java 5535 2015-04-28 06:51:56Z xapiens $ */
public class X_AD_TreeNodeU3 extends PO
{
/** Standard Constructor
@param ctx context
@param AD_TreeNodeU3_ID id
@param trxName transaction
*/
public X_AD_TreeNodeU3 (Properties ctx, int AD_TreeNodeU3_ID, String trxName)
{
super (ctx, AD_TreeNodeU3_ID, trxName);
/** if (AD_TreeNodeU3_ID == 0)
{
setAD_Tree_ID (0);
setNode_ID (0);
setParent_ID (0);
setSeqNo (0);
}
 */
}
/** Load Constructor 
@param ctx context
@param rs result set 
@param trxName transaction
*/
public X_AD_TreeNodeU3 (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=850 */
public static int Table_ID=MTable.getTable_ID("AD_TreeNodeU3");

@XendraTrl(Identifier="3c718270-196f-5341-c8b7-9b3cb76c8e85")
public static String es_PE_TABLE_AD_TreeNodeU3_Name="Tree Node User 3";

@XendraTable(Name="Tree Node User 3",Description="User defined tree 3",Help="",
TableName="AD_TreeNodeU3",AccessLevel="7",AD_Window_ID="",AD_Val_Rule_ID="",IsKey=0,LoadSeq=0,
IsSecurityEnabled=false,IsDeleteable=false,IsHighVolume=true,IsChangeLog=false,IsView=false,
PO_Window_ID="",ID="org.xendra.dictionary",Identifier="3c718270-196f-5341-c8b7-9b3cb76c8e85",
Synchronized="2017-08-16 11:41:04.0")
/** TableName=AD_TreeNodeU3 */
public static final String Table_Name="AD_TreeNodeU3";

protected static KeyNamePair Model = new KeyNamePair(Table_ID,"AD_TreeNodeU3");

protected BigDecimal accessLevel = BigDecimal.valueOf(7);
/** AccessLevel
@return 7 - System - Client - Org 
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
    Table_ID = MTable.getTable_ID("AD_TreeNodeU3");
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
/** Info
@return info
*/
public String toString()
{
StringBuffer sb = new StringBuffer ("X_AD_TreeNodeU3[").append(get_ID()).append("]");
return sb.toString();
}
/** Set Tree.
@param AD_Tree_ID Identifies a Tree */
public void setAD_Tree_ID (int AD_Tree_ID)
{
if (AD_Tree_ID < 1) throw new IllegalArgumentException ("AD_Tree_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_AD_Tree_ID, Integer.valueOf(AD_Tree_ID));
}
/** Get Tree.
@return Identifies a Tree */
public int getAD_Tree_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="3f3c4622-945d-c7e4-0c1b-f53aea98c7bd")
public static String es_PE_COLUMN_AD_Tree_ID_Name="Árbol";

@XendraColumn(AD_Element_ID="508a9d7a-21fa-0280-ccad-9b24fc387a77",ColumnName="AD_Tree_ID",
AD_Reference_ID=19,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="3f3c4622-945d-c7e4-0c1b-f53aea98c7bd",
Synchronized="2017-08-05 16:52:55.0")
/** Column name AD_Tree_ID */
public static final String COLUMNNAME_AD_Tree_ID = "AD_Tree_ID";
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
@XendraTrl(Identifier="eb883ff0-56de-4cb1-a394-533b08ab1647")
public static String es_PE_COLUMN_Identifier_Name="Identifier";

@XendraColumn(AD_Element_ID="f9dfa544-a995-1afd-baaf-53bbadefbbcb",ColumnName="Identifier",
AD_Reference_ID=10,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=36,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=false,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="eb883ff0-56de-4cb1-a394-533b08ab1647",
Synchronized="2017-08-05 16:52:55.0")
/** Column name Identifier */
public static final String COLUMNNAME_Identifier = "Identifier";
/** Set Node_ID.
@param Node_ID Node_ID */
public void setNode_ID (int Node_ID)
{
if (Node_ID < 0) throw new IllegalArgumentException ("Node_ID is mandatory.");
set_ValueNoCheck (COLUMNNAME_Node_ID, Integer.valueOf(Node_ID));
}
/** Get Node_ID.
@return Node_ID */
public int getNode_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Node_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="d33f0ccf-89d2-87b0-17db-a99328c3d332")
public static String es_PE_COLUMN_Node_ID_Name="ID del Nodo";

@XendraColumn(AD_Element_ID="5f06b0a5-21d3-c2be-af28-ec0efb463d76",ColumnName="Node_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=true,IsMandatory=true,IsUpdateable=false,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="d33f0ccf-89d2-87b0-17db-a99328c3d332",
Synchronized="2017-08-05 16:52:55.0")
/** Column name Node_ID */
public static final String COLUMNNAME_Node_ID = "Node_ID";
/** Set Parent.
@param Parent_ID Parent of Entity */
public void setParent_ID (int Parent_ID)
{
if (Parent_ID < 1) throw new IllegalArgumentException ("Parent_ID is mandatory.");
set_Value (COLUMNNAME_Parent_ID, Integer.valueOf(Parent_ID));
}
/** Get Parent.
@return Parent of Entity */
public int getParent_ID() 
{
Integer ii = (Integer)get_Value(COLUMNNAME_Parent_ID);
if (ii == null) return 0;
return ii.intValue();
}

@XendraTrl(Identifier="5cf37586-cd46-588a-606d-e6433c5e6a59")
public static String es_PE_COLUMN_Parent_ID_Name="Padre";

@XendraColumn(AD_Element_ID="26d35f92-f0e2-00bf-656e-99db30e53a7f",ColumnName="Parent_ID",
AD_Reference_ID=13,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="5cf37586-cd46-588a-606d-e6433c5e6a59",
Synchronized="2017-08-05 16:52:55.0")
/** Column name Parent_ID */
public static final String COLUMNNAME_Parent_ID = "Parent_ID";
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

@XendraTrl(Identifier="590aba23-0724-05df-1188-87474acb0c0f")
public static String es_PE_COLUMN_SeqNo_Name="Secuencia";

@XendraColumn(AD_Element_ID="38fa26fe-b59d-fce1-c129-420b57da738b",ColumnName="SeqNo",
AD_Reference_ID=11,AD_Reference_Value_ID="",AD_Val_Rule_ID="",FieldLength=10,DefaultValue="",
IsKey=false,IsInternal=false,IsParent=false,IsMandatory=true,IsUpdateable=true,ReadOnlyLogic="",
IsIdentifier=false,SeqNo=0,IsTranslated=false,Callout="",VFormat="",ValueMin="",ValueMax="",
Version="0",IsSelectionColumn=false,AD_Process_ID="",IsAlwaysUpdateable=false,ColumnSQL="",
IsAllowLogging=false,Identifier="590aba23-0724-05df-1188-87474acb0c0f",
Synchronized="2017-08-05 16:52:55.0")
/** Column name SeqNo */
public static final String COLUMNNAME_SeqNo = "SeqNo";
}
