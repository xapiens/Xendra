package org.xendra.ruleeditor.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.util.Env;
import org.jdom.Element;

public class FormFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected Integer id;
	public FormFolder(Element item) {
		super(item);
		setID(item.getAttributeValue("uid"));
		setName(item.getAttributeValue("name"));				
	}
	private void setID(String id) {
		this.id = Integer.valueOf(id);
	}
	private Integer getID() {
		return this.id;
	}	
    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "form.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }	
}
