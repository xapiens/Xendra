package org.xendra.modeleditor.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.util.Env;
import org.jdom.Element;

public class FieldFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected String id;	
	public FieldFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	}
    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.modeleditor", "field.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }	
}
