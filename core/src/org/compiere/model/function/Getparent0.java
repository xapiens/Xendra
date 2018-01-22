package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getparent0 
{
 
@XendraFunction(Name="getparent",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="638653b1-66dd-33c0-d1f9-4e2b3c11010c",
Arguments="p_node_id numeric, p_treetype text, p_client_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "638653b1-66dd-33c0-d1f9-4e2b3c11010c";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    ParentID NUMERIC;");
	sb.appendln("    TreeID NUMERIC;");
	sb.appendln("BEGIN");
	sb.appendln("TreeID = gettree(p_Client_ID, p_TreeType);");
	sb.appendln("SELECT Parent_ID into ParentID");
	sb.appendln("FROM AD_TreeNode ");
	sb.appendln("WHERE AD_Tree_ID = TreeID AND Node_ID = p_Node_ID;");
	sb.appendln("RETURN ParentID;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=638653b1-66dd-33c0-d1f9-4e2b3c11010c");
	return sb.toString();
}
}
