package org.xendra.modeleditor.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.model.persistence.X_AD_Function;
import org.compiere.util.Env;
import org.jdom.Element;

public class ViewFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public ViewFolder(Element item) {
		super(item);
		String name =  item.getAttributeValue(X_AD_Function.COLUMNNAME_Name);
		this.setName(String.format("%s",name));		
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
}
