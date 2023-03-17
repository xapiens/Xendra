package org.xendra.mfe.folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;

public class SectionFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	public SectionFolder(Element item) {
		super(item);		
		this.setName(item.getAttributeValue("name"));
		loadChildren();
	}

	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "section.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
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
	public void loadChildren() {
		removeAllChildren();
		try {			
			List<Element> items = new ArrayList<Element>();
			Element e = getNode();
			List list = e.getChildren();
			for (int i = 0; i < list.size(); i++) {
				Element item = (Element) list.get(i);
				items.add(item);
			}
			Collections.sort(items, new Comparator<Element>() {
				@Override
				public int compare(Element one, Element two) {
					Integer iseq1 = 0;
					Integer iseq2 = 0;
					String seq1 = one.getAttributeValue("sequence");
					if (seq1 != null)
						iseq1 = Integer.valueOf(seq1);
					String seq2 = two.getAttributeValue("sequence");
					if (seq2 != null)
						iseq2 = Integer.valueOf(seq2);
					return iseq1.compareTo(iseq2);
				}
			});					
			for (Element item:items) {
				Object[] args = { item };
				IExtensionHandler handler = null;
				try {
					handler = PluginManager.getInstance().getExtensionHandler(IExtensionHandlerKeys.ORG_XENDRA_MFE_FOLDER);
				} catch (PluginHandlerNotFoundException ex) {
					ErrorDialog.createDialog(ex.getMessage(),  ex);
				}
				AbstractFolder folder = null;			
				try {
					IExtension extension = handler.getExtension(item.getName());
					folder = (AbstractFolder) extension.instanciateExtension(args);
					this.add(folder);
				} catch (Exception ex) {
					ex.printStackTrace();
				}								
			}		    			
		} catch (Exception e) {

		}		
	}
	public HashMap<String, Double> getDimension() {
		HashMap<String, Double> dimension = new HashMap<String, Double>();
		String width = getNode().getAttributeValue("width");
		if (width == null)
			width = "150";
		String height = getNode().getAttributeValue("height");
		if (height == null)
			height = "200";		
		dimension.put("width", Double.valueOf(width));
		dimension.put("height", Double.valueOf(height));
		return dimension;
	}	
}
