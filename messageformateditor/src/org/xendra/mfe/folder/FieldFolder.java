package org.xendra.mfe.folder;

import java.io.File;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.model.MMessageFormat;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Parent;
import org.xendra.model.AbstractFolder;


public class FieldFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public FieldFolder(Element item) {
		super(item);		
		this.setName(item.getAttributeValue("name"));
	}
	
	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "tag.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}
	public void delete() {
		Element e = this.getNode();		
		Parent p = e.getParent();
		p.removeContent(e);
	}
	
	public Document export(Document doc, Element parent) {
		Element e = getNode();
		if (e.getParent() != null)
			e.detach();
		parent.addContent(e);
		int children = getChildCount();
		for (int i=0; i < children; i ++) {
			AbstractFolder f = (AbstractFolder) getChildAt(i);
			doc = f.export(doc, e);			
		}		
		return doc;
    }	
}
