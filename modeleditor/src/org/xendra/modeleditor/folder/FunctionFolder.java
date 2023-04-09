package org.xendra.modeleditor.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.model.persistence.X_AD_Function;
import org.compiere.util.Env;
import org.jdom.Element;

public class FunctionFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public FunctionFolder(Element item) {
		super(item);
		String name =  item.getAttributeValue(X_AD_Function.COLUMNNAME_Name);
		String arguments = item.getAttributeValue(X_AD_Function.COLUMNNAME_Arguments);
		this.setName(String.format("%s(%s)",name,arguments));
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
