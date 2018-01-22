package org.compiere.model.function;


import org.xendra.annotations.*;
import org.apache.commons.lang.text.StrBuilder;
public class Getlevel0 
{
 
@XendraFunction(Name="getlevel",Output="integer",Owner="xendra",Language="plpgsql",
Identifier="7e12a340-8516-1fb4-4fbf-b6ee42a7390a",
Arguments="p_nodeid numeric, treetype character, p_client_id numeric",Extension="",
Synchronized="2013-09-29 01:27:28.0")
	public static final String Identifier = "7e12a340-8516-1fb4-4fbf-b6ee42a7390a";

	public static final String getCode() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("DECLARE");
	sb.appendln("    nodeID NUMERIC;");
	sb.appendln("    treeID      NUMERIC;");
	sb.appendln("    level integer;");
	sb.appendln("    c RECORD;");
	sb.appendln("BEGIN");
	sb.appendln("treeID = getTree(p_Client_ID, TreeType);");
	sb.appendln("--nodeID = p_Node_ID;");
	sb.appendln("level := 0;");
	sb.appendln("FOR c IN SELECT Parent_ID ");
	sb.appendln("FROM AD_TreeNode ");
	sb.appendln("WHERE AD_Tree_ID = treeID AND Node_ID = p_nodeid");
	sb.appendln("LOOP");
	sb.appendln("nodeID := c.Parent_ID;");
	sb.appendln("level := level + 1;");
	sb.appendln("END LOOP;");
	sb.appendln("RETURN level;");
	sb.appendln("END;");
	return sb.toString();
}
	public static final String getComments() 
{
 	StrBuilder sb = new StrBuilder();
 	sb.appendln("@Synchronized=2013-09-29 01:27:28.0");
	sb.appendln("@Identifier=7e12a340-8516-1fb4-4fbf-b6ee42a7390a");
	return sb.toString();
}
}
