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
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Util;
import org.jdom.Element;
import org.xendra.process.update.storeprocedurestoxml;

public class DatabaseFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public DatabaseFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	}
    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.modeleditor", "database.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }
    public void loadChildren() {    
		removeAllChildren();
		Element funcitem = new Element("Function");
		funcitem.setAttribute("name", "Functions");
		FunctionsFolder function = new FunctionsFolder(funcitem);
		add(function);
		Element viewitem = new Element("View");
		viewitem.setAttribute("name", "Views");
		ViewsFolder view = new ViewsFolder(viewitem);
		add(view);
    }
}

