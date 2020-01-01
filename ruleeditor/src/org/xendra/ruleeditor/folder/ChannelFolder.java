package org.xendra.ruleeditor.folder;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.compiere.util.Env;
import org.jdom.Element;

public class ChannelFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public ChannelFolder(Element item) {
		super(item);
	}
    public ImageIcon getIcon() {
    	if (localIcon == null)
    	{
    		try {
    			localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.ruleeditor", "channel.png"))));
    		}
    		catch (Exception e) {}
    	}
        return localIcon;
    }		
}
