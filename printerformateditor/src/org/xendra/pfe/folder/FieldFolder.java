package org.xendra.pfe.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.tree.MutableTreeNode;

import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;

@SuppressWarnings("serial")
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
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.pfe", "field.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}	
    public void setParent(MutableTreeNode newParent) {
        parent = newParent;
    }	
}
