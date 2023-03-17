package org.xendra.mfe.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.util.Env;
import org.jdom.Element;
import org.xendra.model.AbstractFolder;

public class ColumnFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public ColumnFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	} 
	public ImageIcon getIcon() {
		if (localIcon == null) {
			try {
			localIcon = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.modeleditor", "table.png"))));
			} catch (Exception e) {}
		}
		return localIcon;
	}
}
