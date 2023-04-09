package org.xendra.modeleditor.folder;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Hashtable;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.db.CConnection;
import org.compiere.model.MFunction;
import org.compiere.model.persistence.X_AD_Function;
import org.compiere.model.persistence.X_AD_View;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Element;
import org.xendra.db.Querys;
import org.xendra.process.update.storeprocedurestoxml;

public class ViewsFolder extends AbstractFolder{
	protected static ImageIcon localIcon = null;
	public ViewsFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	}
    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.modeleditor", "procedure.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }
    public void loadChildren() {
    	CConnection m_cc = CConnection.get();
		removeAllChildren();
		try {			
			setDatabaseSystem(m_cc);		
			//PreparedStatement pstmt = DB.prepareStatement(storeprocedurestoxml.getSQLAllStoreProcedures("", ""), null);
			PreparedStatement pstmt = DB.prepareStatement(Querys.GETVIEWS, null);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Element dbitem = new Element("view");
				//String comments = rs.getString(X_AD_Function.COLUMNNAME_Comments);
				//Hashtable props = Util.getProperties(comments);
				Hashtable props = Util.getProperties(rs.getString("comment"));
				Iterator keys = props.keySet().iterator();
				while (keys.hasNext())
				{
					String key = (String)keys.next();					
					if (key.equals("updated"))
					{						
						String value = (String) props.get(key);
						dbitem.setAttribute(MFunction.COLUMNNAME_Synchronized, value);
						continue;
					}	
					else if (key.equals("uuid"))
					{
						String value = (String) props.get(key);
						dbitem.setAttribute(MFunction.COLUMNNAME_Identifier, value);
						continue;
					}
					else if (key.equals(MFunction.COLUMNNAME_Identifier)) 
					{
						String value = (String) props.get(key);
						dbitem.setAttribute(MFunction.COLUMNNAME_Identifier, value);
						continue;						
					}
					else if (key.equals("extension"))
					{
						String value = (String) props.get(key);
						dbitem.setAttribute(MFunction.COLUMNNAME_Extension, value);
						continue;						
					}
					else if (key.equals(X_AD_Function.COLUMNNAME_Synchronized))
					{						
						Timestamp value = (Timestamp) props.get(key);
						dbitem.setAttribute(X_AD_Function.COLUMNNAME_Synchronized, value.toString());
					}
				}
				//dbitem.setAttribute(X_AD_Function.COLUMNNAME_Name, rs.getString("functionname"));
				//if (comments == null)
				//	comments = "";
				dbitem.setAttribute(X_AD_View.COLUMNNAME_Name, rs.getString("viewname"));
				dbitem.setAttribute(X_AD_View.COLUMNNAME_Comments, rs.getString("comment"));
				dbitem.setAttribute(X_AD_View.COLUMNNAME_Owner, rs.getString("viewowner"));
				dbitem.setAttribute(X_AD_View.COLUMNNAME_Definition, rs.getString("definition"));
				ViewFolder p = new ViewFolder(dbitem);
				add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			setDBTarget(m_cc);
		}
    }
	public static void setDatabaseSystem(CConnection cc) {
		CConnection m_cc = CConnection.get(cc.getDbHost(), cc.getDbPort(), cc.getDbName(), DB.getDatabase().getSystemUser(), "postgres");
		setDBTarget(m_cc);		
	}	
	private static void setDBTarget(CConnection m_cc) {
		DB.setDBTarget(m_cc);		
		setsearchpath(null);
	}
	public static void setsearchpath(String trxName) {
		String search_path = DB.getSQLValueString(trxName, "SELECT setting FROM pg_settings where name = 'search_path'");
		if (!search_path.toLowerCase().contains("xendra") || !search_path.toLowerCase().contains("public"))
		{			
			int no = DB.executeUpdate("set search_path to public,xendra;", trxName);
			if (no < 0)
				System.out.println("err");
		}
	}		    
}