/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.sql.*;
import java.util.*;

import org.compiere.model.persistence.X_AD_Tree;
import org.compiere.model.reference.REF_AD_TreeTypeType;
import org.compiere.util.*;

/**
 *	Base Tree Model.
 *	(see also MTree in project base)
 *	
 *  @author Jorg Janke
 *  @version $Id: MTree_Base.java 5583 2015-08-05 14:11:58Z xapiens $
 */
public class MTree_Base extends X_AD_Tree
{
	
	/**
	 * 	Add Node to correct tree
	 *	@param ctx cpntext
	 *	@param treeType tree type
	 *	@param Record_ID id
	 *	@param trxName transaction
	 *	@return true if node added
	 */
	public static boolean addNode (Properties ctx, String treeType, int Record_ID, String trxName)
	{
		//	Get Tree
		int AD_Tree_ID = 0;
		MClient client = MClient.get(ctx);
		MClientInfo ci = client.getInfo();
		
		if (REF_AD_TreeTypeType.Activity.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_Activity_ID();
		else if (REF_AD_TreeTypeType.BoM.equals(treeType))
			throw new IllegalArgumentException("BoM Trees not supported");
		else if (REF_AD_TreeTypeType.BPartner.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_BPartner_ID();
		else if (REF_AD_TreeTypeType.Campaign.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_Campaign_ID();
		else if (REF_AD_TreeTypeType.ElementValue.equals(treeType))
			throw new IllegalArgumentException("ElementValue cannot use this API");
		else if (REF_AD_TreeTypeType.Menu.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_Menu_ID();
		else if (REF_AD_TreeTypeType.Organization.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_Org_ID();
		else if (REF_AD_TreeTypeType.Product.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_Product_ID();
		else if (REF_AD_TreeTypeType.ProductCategory.equals(treeType))
			throw new IllegalArgumentException("Product Category Trees not supported");
		else if (REF_AD_TreeTypeType.Project.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_Project_ID();
		else if (REF_AD_TreeTypeType.SalesRegion.equals(treeType))
			AD_Tree_ID = ci.getAD_Tree_SalesRegion_ID();
		if (AD_Tree_ID == 0)
			throw new IllegalArgumentException("No Tree found");
		MTree_Base tree = MTree_Base.get(ctx, AD_Tree_ID, trxName);
		if (tree.get_ID() != AD_Tree_ID)
			throw new IllegalArgumentException("Tree found AD_Tree_ID=" + AD_Tree_ID);

		//	Insert Tree in correct tree
		boolean saved = false;
		if (REF_AD_TreeTypeType.Menu.equals(treeType))
		{
			MTree_NodeMM node = new MTree_NodeMM (tree, Record_ID);
			saved = node.save();
		}
		else if  (REF_AD_TreeTypeType.BPartner.equals(treeType))
		{
			MTree_NodeBP node = new MTree_NodeBP (tree, Record_ID);
			saved = node.save();
		}
		else if  (REF_AD_TreeTypeType.Product.equals(treeType))
		{
			MTree_NodePR node = new MTree_NodePR (tree, Record_ID);
			saved = node.save();
		}
		else
		{
			MTree_Node node = new MTree_Node (tree, Record_ID);
			saved = node.save();
		}
		return saved;	
	}	//	addNode
	
	
	/**************************************************************************
	 * 	Get Node TableName
	 *	@param treeType tree type
	 *	@return node table name, e.g. AD_TreeNode
	 */
	public static String getNodeTableName(String treeType)
	{
		String	nodeTableName = "AD_TreeNode";
		if (REF_AD_TreeTypeType.Menu.equals(treeType))
			nodeTableName += "MM";
		else if  (REF_AD_TreeTypeType.BPartner.equals(treeType))
			nodeTableName += "BP";
		else if  (REF_AD_TreeTypeType.Product.equals(treeType))
			nodeTableName += "PR";
		//
		else if  (REF_AD_TreeTypeType.CMContainer.equals(treeType))
			nodeTableName += "CMC";
		else if  (REF_AD_TreeTypeType.CMContainerStage.equals(treeType))
			nodeTableName += "CMS";
		else if  (REF_AD_TreeTypeType.CMMedia.equals(treeType))
			nodeTableName += "CMM";
		else if  (REF_AD_TreeTypeType.CMTemplate.equals(treeType))
			nodeTableName += "CMT";
		//
		else if  (REF_AD_TreeTypeType.User1.equals(treeType))
			nodeTableName += "U1";
		else if  (REF_AD_TreeTypeType.User2.equals(treeType))
			nodeTableName += "U2";
		else if  (REF_AD_TreeTypeType.User3.equals(treeType))
			nodeTableName += "U3";
		else if  (REF_AD_TreeTypeType.User4.equals(treeType))
			nodeTableName += "U4";
		return nodeTableName;
	}	//	getNodeTableName

	/**
	 * 	Get Source TableName
	 *	@param treeType tree typw
	 *	@return source table name, e.g. AD_Org or null 
	 */
	public static String getSourceTableName(String treeType)
	{
		if (treeType == null)
			return null;
		String sourceTable = null;
		if (treeType.equals(REF_AD_TreeTypeType.Menu))
			sourceTable = "AD_Menu";
		else if (treeType.equals(REF_AD_TreeTypeType.Organization))
			sourceTable = "AD_Org";
		else if (treeType.equals(REF_AD_TreeTypeType.Product))
			sourceTable = "M_Product";
		else if (treeType.equals(REF_AD_TreeTypeType.ProductCategory))
			sourceTable = "M_Product_Category";
		else if (treeType.equals(REF_AD_TreeTypeType.BoM))
			sourceTable = "M_BOM";
		else if (treeType.equals(REF_AD_TreeTypeType.ElementValue))
			sourceTable = "C_ElementValue";
		else if (treeType.equals(REF_AD_TreeTypeType.BPartner))
			sourceTable = "C_BPartner";
		else if (treeType.equals(REF_AD_TreeTypeType.Campaign))
			sourceTable = "C_Campaign";
		else if (treeType.equals(REF_AD_TreeTypeType.Project))
			sourceTable = "C_Project";
		else if (treeType.equals(REF_AD_TreeTypeType.Activity))
			sourceTable = "C_Activity";
		else if (treeType.equals(REF_AD_TreeTypeType.SalesRegion))
			sourceTable = "C_SalesRegion";
		//
		else if (treeType.equals(REF_AD_TreeTypeType.CMContainer))
			sourceTable = "CM_Container";
		else if (treeType.equals(REF_AD_TreeTypeType.CMContainerStage))
			sourceTable = "CM_CStage";
		else if (treeType.equals(REF_AD_TreeTypeType.CMMedia))
			sourceTable = "CM_Media";
		else if (treeType.equals(REF_AD_TreeTypeType.CMTemplate))
			sourceTable = "CM_Template";
		else if (treeType.equals(REF_AD_TreeTypeType.AccountingSubject))
			sourceTable = "C_Subject";
		//	User Trees
//		else if (treeType.equals(REF_AD_TreeTypeType.User1))
//			sourceTable = "??";
		
		return sourceTable;		
	}	//	getSourceTableName

	/**
	 * 	Get MTree_Base from Cache
	 *	@param ctx context
	 *	@param AD_Tree_ID id
	 *	@param trxName transaction
	 *	@return MTree_Base
	 */
	public static MTree_Base get (Properties ctx, int AD_Tree_ID, String trxName)
	{
		Integer key = new Integer (AD_Tree_ID);
		MTree_Base retValue = (MTree_Base) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MTree_Base (ctx, AD_Tree_ID, trxName);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	}	//	get

	
	/**	Cache						*/
	private static CCache<Integer,MTree_Base> s_cache = new CCache<Integer,MTree_Base>("AD_Tree", 10);
	
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Tree_ID id
	 *	@param trxName transaction
	 */
	public MTree_Base (Properties ctx, int AD_Tree_ID, String trxName)
	{
		super(ctx, AD_Tree_ID, trxName);
		if (AD_Tree_ID == 0)
		{
		//	setName (null);
		//	setTreeType (null);
			setIsAllNodes (true);	//	complete tree
			setIsDefault(false);
		}
	}	//	MTree_Base

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MTree_Base (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MTree_Base

	/**
	 * 	Parent Constructor
	 *	@param client client
	 *	@param name name
	 *	@param treeType
	 */
	public MTree_Base (MClient client, String name, String treeType)
	{
		this (client.getCtx(), 0, client.get_TrxName());
		setClientOrg (client);
		setName (name);
		setTreeType (treeType);
	}	//	MTree_Base

	/**
	 * 	Full Constructor
	 *	@param ctx context
	 *	@param Name name
	 *	@param TreeType tree type
	 *	@param trxName transaction
	 */
	public MTree_Base (Properties ctx, String Name, String TreeType,  
		String trxName)
	{
		super(ctx, 0, trxName);
		setName (Name);
		setTreeType (TreeType);
		setIsAllNodes (true);	//	complete tree
		setIsDefault(false);
	}	//	MTree_Base

	
	/**
	 *	Get Node TableName
	 *	@return node table name, e.g. AD_TreeNode
	 */
	public String getNodeTableName()
	{
		return getNodeTableName(getTreeType());
	}	//	getNodeTableName
	
	/**
	 * 	Get Source TableName (i.e. where to get the name and color)
	 * 	@param tableNameOnly if false return From clause (alias = t)
	 *	@return source table name, e.g. AD_Org or null
	 */
	public String getSourceTableName (boolean tableNameOnly)
	{
		String tableName = getSourceTableName(getTreeType());
		if (tableNameOnly)
			return tableName;
		if ("M_Product".equals(tableName))
			return "M_Product t INNER JOIN M_Product_Category x ON (t.M_Product_Category_ID=x.M_Product_Category_ID)";
		if ("C_BPartner".equals(tableName))
			return "C_BPartner t INNER JOIN C_BP_Group x ON (t.C_BP_Group_ID=x.C_BP_Group_ID)";
		if ("AD_Org".equals(tableName))
			return "AD_Org t INNER JOIN AD_OrgInfo i ON (t.AD_Org_ID=i.AD_Org_ID) "
				+ "LEFT OUTER JOIN AD_OrgType x ON (i.AD_OrgType_ID=x.AD_OrgType_ID)";
		if ("C_Campaign".equals(tableName))
			return "C_Campaign t LEFT OUTER JOIN C_Channel x ON (t.C_Channel_ID=x.C_Channel_ID)";
		if (tableName != null)
			tableName += " t";
		return tableName;
	}	//	getSourceTableName

	
	/**
	 * 	Get fully qualified Name of Action/Color Column
	 *	@return NULL or Action or Color
	 */
	public String getActionColorName()
	{
		String tableName = getSourceTableName(getTreeType());
		if ("AD_Menu".equals(tableName))
			return "t.Action";
		if ("M_Product".equals(tableName) || "C_BPartner".equals(tableName) 
			|| "AD_Org".equals(tableName) || "C_Campaign".equals(tableName))
			return "x.AD_PrintColor_ID";
		return "NULL";
	}	//	getSourceTableName
	
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		if (!isActive() || !isAllNodes())
			setIsDefault(false);
		return true;
	}	//	beforeSabe
	
	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (newRecord)	//	Base Node
		{
			if (REF_AD_TreeTypeType.BPartner.equals(getTreeType()))
			{
				MTree_NodeBP ndBP = new MTree_NodeBP(this, 0);
				ndBP.save();
			}
			else if (REF_AD_TreeTypeType.Menu.equals(getTreeType()))
			{
				MTree_NodeMM ndMM = new MTree_NodeMM(this, 0);
				ndMM.save();
			}
			else if (REF_AD_TreeTypeType.Product.equals(getTreeType()))
			{
				MTree_NodePR ndPR = new MTree_NodePR(this, 0);
				ndPR.save();
			}
			else
			{
				MTree_Node nd = new MTree_Node(this, 0);
				nd.save();
			}
		}
		
		return success;
	}	//	afterSave
	
}	//	MTree_Base
