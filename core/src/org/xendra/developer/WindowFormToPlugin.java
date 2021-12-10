package org.xendra.developer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import org.compiere.model.MWindow;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_TreeNode;
import org.compiere.model.persistence.X_AD_TreeNodeMM;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class WindowFormToPlugin extends SvrProcess {
	private static CLogger	log	= CLogger.getCLogger (WindowFormToPlugin.class);
	private static String directory;
	Document doc = new Document(new Element("gui"));
	Element menu = new Element("menu");
	Element window = new Element("window");
	Element form = new Element("form");
	private int m_AD_Window_ID;
	public static void main(String[] args)
	{
		org.compiere.Xendra.startupEnvironment(true);
		CLogMgt.setLevel(Level.WARNING);
		directory = System.getProperty("user.home").concat("/model/");
		if (args.length > 0)
			directory = args[0];
		if (directory == null || directory.length() == 0)
		{
			System.err.println("No Directory");
			System.exit(1);
		}
		log.warning("Directory: " + directory);

		WindowFormToPlugin sp = new WindowFormToPlugin();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected void prepare() {
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("AD_Window_ID"))
				m_AD_Window_ID = para[i].getParameterAsInt();			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}		
	}
	@Override
	protected String doIt() throws Exception {
		String query = "";		

		List<MWindow> lstwindows = new Query(Env.getCtx(), X_AD_Window.Table_Name, query, get_TrxName())
		.setOrderBy(X_AD_Window.COLUMNNAME_AD_Window_ID).list();
		for (MWindow dbwindow:lstwindows)
		{
			if (dbwindow.getIdentifier().length() == 0)
			{
				dbwindow.setIdentifier(Util.getUUID());
				dbwindow.save();
			}
			if (dbwindow.getSynchronized() == null) {
				dbwindow.setSynchronized(new Timestamp(System.currentTimeMillis()));
				dbwindow.save();
			}										
			Element element = addMenuWindow(dbwindow);
			if (element != null) {
				if (element.getParent() != null) {
					element.detach();
				}
				if (element.getName().equals("menu"))
					menu.addContent(element);
				else if (element.getName().equals("window"))
					window.addContent(element);				
			}
		}
		List<X_AD_Form> lstforms = new Query(Env.getCtx(), X_AD_Form.Table_Name, query, get_TrxName()).setOrderBy(X_AD_Form.COLUMNNAME_AD_Form_ID).list();
		for (X_AD_Form dbform:lstforms)
		{
			if (dbform.getIdentifier() == null)
			{
				dbform.setIdentifier(Util.getUUID());
				dbform.save();
			}			
			if (dbform.getSynchronized() == null) {
				dbform.setSynchronized(new Timestamp(System.currentTimeMillis()));
				dbform.save();
			}													
			Element element = addMenuForm(dbform);
			if (element != null) {
				if (element.getParent() != null)
					element.detach();
				if (element.getName().equals("menu"))
					menu.addContent(element);
				else if (element.getName().equals("form"))
					form.addContent(element);
			}			
		}
		doc.getRootElement().addContent(menu);
		doc.getRootElement().addContent(window);
		doc.getRootElement().addContent(form);		
		XMLOutputter xmOut = new XMLOutputter(Format.getPrettyFormat()); 
		System.out.println(xmOut.outputString(doc));							
		return null;
	}

	private Element find(String identifier) {
		Element search = null;
		//Element root = doc.getRootElement();
		List<Element> children = menu.getChildren();		
		for (int i=0; i < children.size(); i ++) {			
			Element child = children.get(i);
			search = find(child, identifier);
			if (search != null) {
				break;
			}
		}					
		return search;
	}
	private Element find(Element element, String identifier) {
		Element ret = null;
		if (element.getName().equals("translate")) 
			return ret;
		String value = element.getAttributeValue(X_AD_Menu.COLUMNNAME_Identifier);
		if (value.equals(identifier))
			ret = element;
		else {
			List<Element> children = element.getChildren();
			for (int i=0; i < children.size(); i ++) {
				Element child = children.get(i);
				ret = find(child, identifier);
				if (ret != null) {
					break;
				}
			}			
		}
		return ret;			
	}
	private Element addMenuForm(X_AD_Form dbform) {
		Element parentmenu = null;
		Element form = new Element("form");				
		form.setAttribute(X_AD_Form.COLUMNNAME_Name,dbform.getName());							
		form.setAttribute(X_AD_Form.COLUMNNAME_Description,dbform.getDescription());
		form.setAttribute(X_AD_Form.COLUMNNAME_Help,dbform.getHelp());
		form.setAttribute(X_AD_Form.COLUMNNAME_Identifier,dbform.getIdentifier());
		form.setAttribute(X_AD_Form.COLUMNNAME_AccessLevel, dbform.getAccessLevel());
		form.setAttribute(X_AD_Form.COLUMNNAME_Classname, dbform.getClassname());
		form.setAttribute(X_AD_Form.COLUMNNAME_EntityType, dbform.getEntityType());
		form.setAttribute(X_AD_Form.COLUMNNAME_IsBetaFunctionality, dbform.isBetaFunctionality()?"Y":"N");
		form.setAttribute(X_AD_Form.COLUMNNAME_IsMenu, dbform.isMenu()?"Y":"N");
		form.setAttribute(X_AD_Form.COLUMNNAME_Synchronized,dbform.getSynchronized().toString());
		addFormTranslate(form, dbform.getAD_Form_ID());
		String Menuid = "";
		X_AD_Menu dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Form_ID = ? ", null)
		.setParameters(dbform.getAD_Form_ID()).first();		
		if (dbmenu != null)
		{
			if (dbmenu.getIdentifier().length() == 0) {
				dbmenu.setIdentifier(Util.getUUID());
				dbmenu.save();
			}
			if (dbmenu.getSynchronized() == null) {
				dbmenu.setSynchronized(new Timestamp(System.currentTimeMillis()));
				dbmenu.save();
			}			
			Element menu = find(dbmenu.getIdentifier());
			X_AD_TreeNodeMM node = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
			.setParameters(dbmenu.getAD_Menu_ID()).first();
			if (menu == null)  {
				menu = new Element("menu");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_AD_Menu_ID, String.valueOf(dbmenu.getAD_Menu_ID()));
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Name, dbmenu.getName());
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Description, dbmenu.getDescription());
				menu.setAttribute(X_AD_Menu.COLUMNNAME_IsSummary, dbmenu.isSummary()?"Y":"N");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_IsSOTrx,dbmenu.isReadOnly()?"Y":"N");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_IsReadOnly,dbmenu.isReadOnly()?"Y":"N");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Identifier,dbmenu.getIdentifier());
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Synchronized,dbmenu.getSynchronized().toString());
				if (node != null) {
					menu.setAttribute(X_AD_TreeNodeMM.COLUMNNAME_SeqNo, String.valueOf(node.getSeqNo()));
				}
				addMenuTranslate(menu, dbmenu.getAD_Menu_ID());
			}
			menu.addContent(form);
			X_AD_Menu dbparentmenu = null;
			while (node != null) {
				if (node.getParent_ID() > 0)
				{					
					dbparentmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
					.setParameters(node.getParent_ID()).first();
					if (dbparentmenu != null) {
						if (dbparentmenu.getIdentifier().length() == 0) {
							dbparentmenu.setIdentifier(Util.getUUID());
							dbparentmenu.save();
						}
						parentmenu = find(dbparentmenu.getIdentifier());
						if (parentmenu == null) {
							parentmenu = new Element("menu");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_AD_Menu_ID, String.valueOf(dbparentmenu.getAD_Menu_ID()));
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Name, dbparentmenu.getName());
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Description, dbparentmenu.getDescription());
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_IsSummary, dbparentmenu.isSummary()?"Y":"N");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_IsSOTrx,dbparentmenu.isReadOnly()?"Y":"N");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_IsReadOnly,dbparentmenu.isReadOnly()?"Y":"N");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Identifier,dbparentmenu.getIdentifier());
							if (dbparentmenu.getSynchronized() == null) {
								dbparentmenu.setSynchronized(new Timestamp(System.currentTimeMillis()));
								dbparentmenu.save();
							}
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Synchronized,dbparentmenu.getSynchronized().toString());
							// try to find the posicion of the parent in the tree loading like a child 
							X_AD_TreeNodeMM parentnode = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
							.setParameters(dbparentmenu.getAD_Menu_ID()).first();
							if (parentnode != null) {
								parentmenu.setAttribute(X_AD_TreeNodeMM.COLUMNNAME_SeqNo, String.valueOf(parentnode.getSeqNo()));
							}

						}
						List<Element> children = parentmenu.getChildren();
						boolean exist = false;
						for (int i=0; i < children.size(); i ++) {			
							Element child = children.get(i);
							String id = child.getAttributeValue(X_AD_Menu.COLUMNNAME_Identifier);
							if (id.equals(menu.getAttributeValue(X_AD_Menu.COLUMNNAME_Identifier))) {
								exist = true;
								break;
							}
						}					
						if (!exist)	{
							if (menu.getParent() != null)
								menu.detach();
							parentmenu.addContent(menu);
						}
						menu = parentmenu;
						node = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
						.setParameters(dbparentmenu.getAD_Menu_ID()).first();
					}
				} else {
					node = null;
				}
			}			
		} else {
			parentmenu = form;
		}
		return parentmenu;
	}

	private Element addMenuWindow(MWindow dbwindow) {
		Element parentmenu = null;
		Element window = new Element("window");
		window.setAttribute(X_AD_Window.COLUMNNAME_Name,dbwindow.getName());								
		window.setAttribute(X_AD_Window.COLUMNNAME_Description,dbwindow.getDescription());
		window.setAttribute(X_AD_Window.COLUMNNAME_Help,dbwindow.getHelp());
		window.setAttribute(X_AD_Window.COLUMNNAME_WindowType,dbwindow.getWindowType());
		window.setAttribute(X_AD_Window.COLUMNNAME_IsSOTrx,dbwindow.isSOTrx()?"Y":"N");
		window.setAttribute(X_AD_Window.COLUMNNAME_IsBetaFunctionality,dbwindow.isBetaFunctionality()?"Y":"N");
		window.setAttribute(X_AD_Window.COLUMNNAME_Identifier,dbwindow.getIdentifier());
		window.setAttribute(X_AD_Window.COLUMNNAME_Synchronized,dbwindow.getSynchronized().toString());
		addWindowTranslate(window, dbwindow.getAD_Window_ID());
		X_AD_Menu dbmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Window_ID = ?", null)
		.setParameters(dbwindow.getAD_Window_ID()).first();	
		if (dbmenu != null)
		{		
			if (dbmenu.getIdentifier().length() == 0) {
				dbmenu.setIdentifier(Util.getUUID());
				dbmenu.save();
			}
			if (dbmenu.getSynchronized() == null) {
				dbmenu.setSynchronized(new Timestamp(System.currentTimeMillis()));
				dbmenu.save();
			}
			X_AD_TreeNodeMM node = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
			.setParameters(dbmenu.getAD_Menu_ID()).first();
			Element menu = find(dbmenu.getIdentifier());			
			if (menu == null)  {
				menu = new Element("menu");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_AD_Menu_ID, String.valueOf(dbmenu.getAD_Menu_ID()));
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Name, dbmenu.getName());
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Description, dbmenu.getDescription());
				menu.setAttribute(X_AD_Menu.COLUMNNAME_IsSummary, dbmenu.isSummary()?"Y":"N");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_IsSOTrx,dbmenu.isReadOnly()?"Y":"N");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_IsReadOnly,dbmenu.isReadOnly()?"Y":"N");
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Identifier,dbmenu.getIdentifier());
				menu.setAttribute(X_AD_Menu.COLUMNNAME_Synchronized,dbmenu.getSynchronized().toString());
				if (node != null) {
					menu.setAttribute(X_AD_TreeNodeMM.COLUMNNAME_SeqNo, String.valueOf(node.getSeqNo()));
				}
			}
			menu.addContent(window);
			X_AD_Menu dbparentmenu = null;
			while (node != null) {
				if (node.getParent_ID() > 0)
				{
					dbparentmenu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Menu_ID = ?", null)
					.setParameters(node.getParent_ID()).first();
					if (dbparentmenu != null) {
						parentmenu = find(dbparentmenu.getIdentifier());
						if (parentmenu == null) {
							parentmenu = new Element("menu");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_AD_Menu_ID, String.valueOf(dbparentmenu.getAD_Menu_ID()));
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Name, dbparentmenu.getName());
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Description, dbparentmenu.getDescription());
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_IsSummary, dbparentmenu.isSummary()?"Y":"N");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_IsSOTrx,dbparentmenu.isReadOnly()?"Y":"N");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_IsReadOnly,dbparentmenu.isReadOnly()?"Y":"N");
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Identifier,dbparentmenu.getIdentifier());
							if (dbparentmenu.getIdentifier().length() == 0) {
								dbparentmenu.setIdentifier(Util.getUUID());
								dbparentmenu.save();
							}
							if (dbparentmenu.getSynchronized() == null) {
								dbparentmenu.setSynchronized(new Timestamp(System.currentTimeMillis()));
								dbparentmenu.save();
							}
							// try to find the posicion of the parent in the tree loading like a child 
							X_AD_TreeNodeMM parentnode = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
							.setParameters(dbparentmenu.getAD_Menu_ID()).first();
							if (parentnode != null) {
								parentmenu.setAttribute(X_AD_TreeNodeMM.COLUMNNAME_SeqNo, String.valueOf(parentnode.getSeqNo()));
							}							
							parentmenu.setAttribute(X_AD_Menu.COLUMNNAME_Synchronized,dbparentmenu.getSynchronized().toString());													
						}
						List<Element> children = parentmenu.getChildren();
						boolean exist = false;
						for (int i=0; i < children.size(); i ++) {			
							Element child = children.get(i);
							String id = child.getAttributeValue(X_AD_Menu.COLUMNNAME_Identifier);
							if (id.equals(menu.getAttributeValue(X_AD_Menu.COLUMNNAME_Identifier))) {
								exist = true;
								break;
							}
						}					
						if (!exist)	{
							if (menu.getParent() != null)
								menu.detach();
							parentmenu.addContent(menu);
						}
						menu = parentmenu;
						node = new Query(Env.getCtx(), X_AD_TreeNodeMM.Table_Name, "Node_ID = ?", null)
						.setParameters(dbparentmenu.getAD_Menu_ID()).first();
					}
				} else {
					node = null;
				}
			}			
		} else {
			parentmenu = window;
		}
		return parentmenu;
	}
	private void addFormTranslate(Element form, int AD_Form_ID) {
		List<X_AD_Column> formtrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
		.setParameters(X_AD_Form.Table_ID).list();
		for (X_AD_Column columntrl:formtrl) {
			StringBuilder sqltranslate = new StringBuilder();
			sqltranslate.append("SELECT AD_LANGUAGE,")
			.append(columntrl.getColumnName())			
			.append(" FROM ")
			.append(X_AD_Form.Table_Name).append("_trl ")
			.append(" WHERE ").append(X_AD_Form.COLUMNNAME_AD_Form_ID).append("=").append(AD_Form_ID);
			try {
				PreparedStatement pstmt = DB.prepareStatement (sqltranslate.toString(), null);
				ResultSet rs = pstmt.executeQuery();			
				while (rs.next ())
				{
					String tablang = rs.getString(1);
					String tabnam = columntrl.getColumnName();
					String tabtrl = rs.getString(2);

					if (tabtrl != null)
					{
						if (tabtrl.contains("&"))
							tabtrl = tabtrl.replaceAll("&", "&amp;");
						Element e = new Element("translate");
						e.setAttribute("lang", tablang);
						e.setAttribute("name", tabnam);
						e.setAttribute("value", tabtrl);
						form.addContent(e);
					}
				}
				pstmt.close();
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}						
		}
	}

	private void addWindowTranslate(Element window, int AD_Window_ID) {
		List<X_AD_Column> windowtrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
		.setParameters(X_AD_Window.Table_ID).list();		
		for (X_AD_Column columntrl:windowtrl) {
			StringBuilder sqltranslate = new StringBuilder();
			sqltranslate.append("SELECT AD_LANGUAGE,")
			.append(columntrl.getColumnName())			
			.append(" FROM ")
			.append(X_AD_Window.Table_Name).append("_trl ")
			.append(" WHERE ").append(X_AD_Window.COLUMNNAME_AD_Window_ID).append("=").append(AD_Window_ID);
			try {
				PreparedStatement pstmt = DB.prepareStatement (sqltranslate.toString(), null);
				ResultSet rs = pstmt.executeQuery();			
				while (rs.next ())
				{
					String tablang = rs.getString(1);
					String tabnam = columntrl.getColumnName();
					String tabtrl = rs.getString(2);

					if (tabtrl != null)
					{
						if (tabtrl.contains("&"))
							tabtrl = tabtrl.replaceAll("&", "&amp;");
						Element e = new Element("translate");
						e.setAttribute("lang", tablang);
						e.setAttribute("name", tabnam);
						e.setAttribute("value", tabtrl);
						window.addContent(e);
					}
				}
				pstmt.close();
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
		
	private void addMenuTranslate(Element menu, int AD_Menu_ID) {
		List<X_AD_Column> menutrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
		.setParameters(X_AD_Menu.Table_ID).list();		
		for (X_AD_Column columntrl:menutrl)
		{
			StringBuilder sqltranslate = new StringBuilder();
			sqltranslate.append("SELECT AD_LANGUAGE,")
			.append(columntrl.getColumnName())			
			.append(" FROM ")
			.append(X_AD_Menu.Table_Name).append("_trl ")
			.append(" WHERE ").append(X_AD_Menu.COLUMNNAME_AD_Menu_ID).append("=").append(AD_Menu_ID);
			try {
				PreparedStatement pstmt = DB.prepareStatement (sqltranslate.toString(), null);
				ResultSet rs = pstmt.executeQuery();			
				while (rs.next ())
				{
					String tablang = rs.getString(1);
					String tabnam = columntrl.getColumnName();
					String tabtrl = rs.getString(2);

					if (tabtrl != null)
					{
						if (tabtrl.contains("&"))
							tabtrl = tabtrl.replaceAll("&", "&amp;");
						Element e = new Element("translate");
						e.setAttribute("lang", tablang);
						e.setAttribute("name", tabnam);
						e.setAttribute("value", tabtrl);
						menu.addContent(e);
					}
				}
				pstmt.close();
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		
	}
}
