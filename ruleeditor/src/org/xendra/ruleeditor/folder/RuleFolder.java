package org.xendra.ruleeditor.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.command.IWorkerStatusController;
import org.columba.core.resourceloader.IconKeys;
import org.columba.core.resourceloader.ImageLoader;
import org.compiere.util.Env;
import org.jdom.Element;

public class RuleFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;

	public RuleFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
	}

	@Override
	public void createChildren(IWorkerStatusController worker) {
		System.out.println("X");
	}    

    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "drools.gif"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }	
}
