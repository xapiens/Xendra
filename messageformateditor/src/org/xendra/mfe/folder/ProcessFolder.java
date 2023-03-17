package org.xendra.mfe.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.model.persistence.X_AD_Process;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;

public class ProcessFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public ProcessFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue(X_AD_Process.COLUMNNAME_Name));		
	}
	public Document export(Document doc, Element parent) {		
		Element e = getNode();
		if (e.getParent() != null)
			e.detach();
		parent.addContent(e);
		return doc;
	}	
	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "process.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}	
}
