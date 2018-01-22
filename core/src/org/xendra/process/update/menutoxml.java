/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2012 Francisco Morosini, Inc. All Rights Reserve             *
 * This program is free software;											  *
 you can redistribute it and/or modify it    								  *
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
package org.xendra.process.update;

import org.compiere.model.MForm;
import org.compiere.model.MMenu;
import org.compiere.model.MProcess;
import org.compiere.model.MTable;
import org.compiere.model.MWindow;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_TreeNodeMM;
import org.compiere.process.SvrProcess;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogMgt;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.logging.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class menutoxml extends SvrProcess {
	private DocumentBuilder builder = null;
	private static Timestamp now = new Timestamp(System.currentTimeMillis());
	private String path = "C:\\Users\\xapiens\\activedictionary\\";
	//private String path = "/home/xapiens/activedictionary/";
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}

	}
	private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	protected String doIt () throws Exception 
	{			
		String refFileName = path+"m_tree.xml";
		builder = factory.newDocumentBuilder();		
		//StringBuffer sql = new StringBuffer(" SELECT * from AD_Menu WHERE isactive = 'Y'");
		StringBuffer sql = new StringBuffer("SELECT am.AD_Menu_ID, tn.Node_ID,tn.Parent_ID,tn.SeqNo FROM AD_TreeNodeMM tn JOIN ad_Menu am ON tn.node_ID = am.AD_Menu_ID WHERE tn.AD_Tree_ID='10'  AND tn.IsActive='Y'  ORDER BY COALESCE(tn.Parent_ID, -1), tn.SeqNo");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		try
		{
			Document doc = builder.newDocument();							
			Element elemmenu = doc.createElement("menu");
			doc.appendChild(elemmenu);
			pstmt = DB.prepareStatement (sql.toString(), get_TrxName());
			rs = pstmt.executeQuery ();
			while (rs.next ())
			{					
				//Element em = doc.createElement("menu");
				
				int node_id = rs.getInt("node_id");
				int parent_id = rs.getInt("parent_id");
				int seqno = rs.getInt("seqno");
				System.out.println(node_id);
				MMenu node = new MMenu(Env.getCtx(), node_id, get_TrxName());
				MMenu parent = null;
				if (parent_id > 0)
				{
					parent = new MMenu(Env.getCtx(), parent_id, get_TrxName());
					if (parent.getAD_Menu_ID() == 0)
					{
						parent = null;
						continue;
					}
				}			
				//String id = String.valueOf(node.getAD_Menu_ID());				
				Element elemnode = doc.createElement("node");														
				if (node.getSynchronized() == null)
				{
					node.setSynchronized(now);
					node.save();
					Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_Synchronized);
				}				
				if (node.getIdentifier() == null)
				{
					node.setIdentifier(Util.getUUID());
					node.save();
					Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_Identifier);
				}
				//
				//String identifier = node.getIdentifier();
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_Identifier);
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_Synchronized);
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_Name);
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_Description);
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_IsSummary);
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_IsSOTrx);
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_IsReadOnly);
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_Action);
				elemnode.setAttribute(X_AD_TreeNodeMM.COLUMNNAME_SeqNo, String.valueOf(seqno));
				elemnode.setAttribute("id", String.valueOf(node.getAD_Menu_ID()));
				if (node.getAD_Window_ID() > 0)
				{
					MWindow p = new MWindow(Env.getCtx(), node.getAD_Window_ID(), get_TrxName() );
					String windowid = p.getIdentifier();
					if (windowid.length() > 0)
					{
						elemnode.setAttribute("window", windowid);
					}					
				}
				else
					elemnode.setAttribute("window", "");
				if (node.getAD_Workflow_ID() > 0)
				{
					
				}
				if (node.getAD_Task_ID() > 0)
				{
					
				}
				if (node.getAD_Form_ID() > 0)
				{
					MForm f = MForm.getbyID(String.valueOf(node.getAD_Form_ID()));
					String formid = f.getIdentifier();
					if (formid.length() > 0)
					{
						elemnode.setAttribute("form", formid);
					}
					
				}
				else
					elemnode.setAttribute("form", "");
				if (node.getAD_Process_ID() > 0)
				{
					MProcess p = MProcess.get(Env.getCtx(), node.getAD_Process_ID());
					String procid = p.getIdentifier();
					if (procid.length() > 0)
					{
						elemnode.setAttribute("process", procid);
					}
				}
				else
					elemnode.setAttribute("process", "");
				if (node.getAD_Form_ID() > 0)
				{
					
				}
				if (node.getAD_Workbench_ID() > 0)
				{
					
				}				
				Util.setattrToElem(elemnode, node, X_AD_Menu.COLUMNNAME_EntityType);

				String sqllang  = " SELECT * from AD_Menu_Trl WHERE isactive = 'Y' AND ad_menu_id = "+node.getAD_Menu_ID();
				PreparedStatement pslang = null;
				ResultSet rslang = null;
				try
				{
					pslang = DB.prepareStatement (sqllang, get_TrxName());
					rslang = pslang.executeQuery ();				
					while (rslang.next ())
					{						
						String lang = rslang.getString("AD_Language");
						String name = rslang.getString("Name");
						String description = rslang.getString("Description");
						Element emt = doc.createElement("menu_trl");
						emt.setAttribute("lang", lang);
						emt.setAttribute("name", name);
						emt.setAttribute("description", description);
						elemnode.appendChild(emt);
					}
				}				
				catch (Exception e)
				{
					e.printStackTrace();
				}
				finally
				{
					DB.close(rslang,pslang);
				}
				if (parent != null)
				{
					Element elemparent = doc.createElement("parent");
					//elemparent.setAttribute(", arg1)" +
					Util.setattrToElem(elemparent, parent, X_AD_Menu.COLUMNNAME_Identifier);
					elemnode.appendChild(elemparent);	
				}
				//doc.appendChild(elemnode);
				elemmenu.appendChild(elemnode);
				//sb = sb.append("public static final String MENUNAME_").append(id).append(" = \"").append(identifier).append("\";").append("\n");
				//writeXmlToFile(refFileName, doc);				
			}
			writeXmlToFile(refFileName, doc);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DB.close(rs, pstmt);			
		}		
		return null;
	}

	public static void writeXmlToFile(String pFilename, Document pDocument) {
		try {
			Source source = new DOMSource(pDocument);
			File file = new File(pFilename);
			Result result = new StreamResult(file);
			// usa serializer.jar 
			Transformer xformer = TransformerFactory.newInstance().newTransformer();
			xformer.setOutputProperty(OutputKeys.INDENT, "yes"); // add newlines
			xformer.transform(source, result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.FINE);
		menutoxml sp = new menutoxml();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}
