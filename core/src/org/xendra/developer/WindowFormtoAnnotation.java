package org.xendra.developer;

import org.compiere.model.MWindow;
import org.compiere.process.SvrProcess;
import org.compiere.util.CLogMgt;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_Column;
import org.compiere.model.persistence.X_AD_Form;
import org.compiere.model.persistence.X_AD_Image;
import org.compiere.model.persistence.X_AD_Menu;
import org.compiere.model.persistence.X_AD_TreeNode;
import org.compiere.model.persistence.X_AD_Window;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.Util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.*;

public class WindowFormtoAnnotation extends SvrProcess {
		
	private int m_AD_Window_ID;
	private HashMap menus = new HashMap();
	private HashMap windows = new HashMap();
	private HashMap forms = new HashMap();
	private static Timestamp now = new Timestamp(System.currentTimeMillis());
	private static CLogger	log	= CLogger.getCLogger (WindowFormtoAnnotation.class);
	private static String directory;
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

	protected String doIt() throws Exception {
		String query = "";
		List<MWindow> lstwindows = new Query(Env.getCtx(), X_AD_Window.Table_Name, query, get_TrxName()).setOrderBy(X_AD_Window.COLUMNNAME_AD_Window_ID).list();
		for (MWindow window:lstwindows)
		{
			if (window.getIdentifier() == null)
			{
				window.setIdentifier(Util.getUUID());
				window.save();
			}
			String Menuid = addMenuWindow(window);
			String imageid = "";
			if (window.getAD_Image_ID() > 0)
			{
				X_AD_Image image = new Query(Env.getCtx(), X_AD_Image.Table_Name, "AD_Image_ID = ?", null)
					.setParameters(window.getAD_Image_ID()).first();
				if (image != null)
					imageid = image.getName();
			}
			Vector vector = new Vector();
			vector.add(window);
			vector.add(Menuid);
			vector.add(imageid);
			windows.put(window.getIdentifier(), vector);
		}
		List<X_AD_Form> lstforms = new Query(Env.getCtx(), X_AD_Form.Table_Name, query, get_TrxName()).setOrderBy(X_AD_Form.COLUMNNAME_AD_Form_ID).list();
		for (X_AD_Form form:lstforms)
		{
			if (form.getIdentifier() == null)
			{
				form.setIdentifier(Util.getUUID());
				form.save();
			}			
			String menuid = addMenuForm(form);
			Vector vector = new Vector();
			vector.add(form);
			vector.add(menuid);
			forms.put(form.getIdentifier(), vector);
		}
		createWindowList();
		return null;
	}
	private String addMenuForm(X_AD_Form form) {
		String Menuid = "";
		X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Form_ID = ? ", null).setParameters(form.getAD_Form_ID())
				.setParameters(form.getAD_Form_ID()).first();
		if (menu != null)
		{
			Menuid = menu.getIdentifier();
			common.addMenu(menu, menus);
		}
		return Menuid;
	}
	private String addMenuWindow(MWindow window) {
		String Menuid = "";
		X_AD_Menu menu = new Query(Env.getCtx(), X_AD_Menu.Table_Name, "AD_Window_ID = ?", null)
				.setParameters(window.getAD_Window_ID()).first();
		if (menu != null)
		{				
			Menuid = menu.getIdentifier();
			common.addMenu(menu, menus);
		}
		return Menuid;
	}


	private void createWindowList() {
		StringBuffer header = new StringBuffer("package org.compiere.model.window;\n");
		header = header.append("import org.xendra.annotations.*;\n");
		header = header.append("public class X_AD_WindowList { \n");
		StringBuffer sb = new StringBuffer();
		for (Iterator it = menus.entrySet().iterator(); it.hasNext();)
		{
			Map.Entry entry = (Map.Entry) it.next();
			String id = (String) entry.getKey();
			Vector props = (Vector) entry.getValue();
			String parentid = (String) props.get(0);
			X_AD_Menu menu = (X_AD_Menu) props.get(1);
			int level = (int) props.get(2);
			if (menu.getSynchronized() == null)
			{
				menu.setSynchronized(new Timestamp(System.currentTimeMillis()));
				menu.save();
			}
			if (menu.getIdentifier() == null || menu.getIdentifier().trim().length() == 0)
			{
				menu.setIdentifier(Util.getUUID());
				menu.save();
			}
			try {
				List<X_AD_Column> menutrl = new Query(Env.getCtx(), X_AD_Column.Table_Name, "istranslated = 'Y' AND AD_Table_ID = ?", null)
				.setParameters(X_AD_Menu.Table_ID).list();		
				for (X_AD_Column columntrl:menutrl)
				{
					StringBuilder sqltranslate = new StringBuilder();
					sqltranslate.append("SELECT AD_LANGUAGE,")
					.append(columntrl.getColumnName())			
					.append(" FROM ")
					.append(X_AD_Menu.Table_Name).append("_trl ")
					.append(" WHERE ").append(X_AD_Menu.COLUMNNAME_AD_Menu_ID).append("=").append(menu.getAD_Menu_ID());
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
							Util.append(sb, String.format("\n@XendraTrl(%s=\"%s\")",X_AD_Menu.COLUMNNAME_Identifier,menu.getIdentifier()));
							sb = sb.append("\npublic static String ").append(tablang).append("_MENU_")																	
																	.append(Util.getStringclean(menu.getName()))
																	.append(menu.isSummary() ? "_SUM":"")
																	.append("_")
																	.append(tabnam).append(" = \"").append(tabtrl).append("\";");
						}
					}
					pstmt.close();
					rs.close();
				}
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}			
			sb.append("\n@XendraMenu(");
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Menu.COLUMNNAME_AD_Menu_ID,menu.getAD_Menu_ID()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Menu.COLUMNNAME_Name,menu.getName()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Menu.COLUMNNAME_Description,menu.getDescription()));
			Util.append(sb, String.format("%s=%s,",X_AD_Menu.COLUMNNAME_IsSummary,menu.isSummary()));
			Util.append(sb, String.format("%s=%s,",X_AD_Menu.COLUMNNAME_IsSOTrx,menu.isSOTrx()));
			Util.append(sb, String.format("%s=%s,",X_AD_Menu.COLUMNNAME_IsReadOnly,menu.isReadOnly()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_TreeNode.COLUMNNAME_Parent_ID,parentid));
			Util.append(sb, String.format("%s=\"%s\",","level",level));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Menu.COLUMNNAME_Identifier,menu.getIdentifier()));
			Util.append(sb, String.format("%s=\"%s\")",X_AD_Menu.COLUMNNAME_Synchronized,menu.getSynchronized()));
			sb = sb.append("\npublic static final String MENUNAME_").append(Util.getStringclean(menu.getName())).append(menu.isSummary() ? "_SUM":"").append(" = \"").append(menu.getIdentifier()).append("\";").append("\n");			
		}
		for (Iterator it = windows.entrySet().iterator(); it.hasNext();)
		{
			Map.Entry entry = (Map.Entry) it.next();
			String id = (String) entry.getKey();	
			Vector props = (Vector) entry.getValue();
			MWindow window = (MWindow) props.get(0);
			String menuid =  (String) props.get(1);
			String imageid = (String) props.get(2);
			if (window.getSynchronized() == null)
			{
				window.setSynchronized(new Timestamp(System.currentTimeMillis()));
				window.save();
			}			
			sb.append("\n@XendraWindow(");
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Window.COLUMNNAME_Name,window.getName()));							
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Window.COLUMNNAME_Description,window.getDescription()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Window.COLUMNNAME_Help,window.getHelp()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Window.COLUMNNAME_WindowType,window.getWindowType()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Menu.COLUMNNAME_AD_Menu_ID, menuid));
			Util.append(sb, String.format("%s=%s,",X_AD_Window.COLUMNNAME_IsSOTrx,window.isSOTrx()));
			Util.append(sb, String.format("%s=%s,",X_AD_Window.COLUMNNAME_IsBetaFunctionality,window.isBetaFunctionality()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Window.COLUMNNAME_AD_Image_ID,imageid));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Window.COLUMNNAME_Identifier,window.getIdentifier()));
			Util.append(sb, String.format("%s=\"%s\")",X_AD_Window.COLUMNNAME_Synchronized,window.getSynchronized()));
			sb = sb.append("\npublic static final String WINDOWNAME_").append(Util.getStringclean(window.getName())).append(" = \"").append(window.getIdentifier()).append("\";").append("\n");
			
		}
		for (Iterator it = forms.entrySet().iterator(); it.hasNext();)
		{
			Map.Entry entry = (Map.Entry) it.next();
			String id = (String) entry.getKey();	
			Vector props = (Vector) entry.getValue();
			X_AD_Form form = (X_AD_Form) props.get(0);
			String menuid = (String) props.get(1);
			if (form.getSynchronized() == null)
			{
				form.setSynchronized(new Timestamp(System.currentTimeMillis()));
				form.save();
			}						
			sb.append("\n@XendraForm(");
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Form.COLUMNNAME_Name,form.getName()));							
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Form.COLUMNNAME_Description,form.getDescription()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Form.COLUMNNAME_Help,form.getHelp()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Menu.COLUMNNAME_AD_Menu_ID, menuid));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Form.COLUMNNAME_Identifier,form.getIdentifier()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Form.COLUMNNAME_AccessLevel, form.getAccessLevel()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Form.COLUMNNAME_Classname, form.getClassname()));
			Util.append(sb, String.format("%s=\"%s\",",X_AD_Form.COLUMNNAME_EntityType, form.getEntityType()));
			Util.append(sb, String.format("%s=%s,",X_AD_Form.COLUMNNAME_IsBetaFunctionality, form.isBetaFunctionality()));
			Util.append(sb, String.format("%s=%s,",X_AD_Form.COLUMNNAME_IsMenu, form.isMenu()));
			Util.append(sb, String.format("%s=\"%s\")",X_AD_Form.COLUMNNAME_Synchronized,form.getSynchronized()));
			sb = sb.append("\npublic static final String FORMNAME_").append(Util.getStringclean(form.getName())).append(" = \"").append(form.getIdentifier()).append("\";").append("\n");			
		}
		header = header.append(sb);
		header = header.append("}");
		Util.writeToFile(header, directory+"X_AD_WindowList.java");
	}
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
		
		WindowFormtoAnnotation sp = new WindowFormtoAnnotation();
		try {
			sp.doIt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}    
}
