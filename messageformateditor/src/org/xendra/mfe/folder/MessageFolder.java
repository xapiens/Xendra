package org.xendra.mfe.folder;

import java.io.File;
import java.io.StringReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.columba.api.plugin.IExtension;
import org.columba.api.plugin.IExtensionHandler;
import org.columba.api.plugin.PluginHandlerNotFoundException;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.plugin.PluginManager;
import org.compiere.model.MMessageFormat;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xendra.Constants;
import org.xendra.mfe.plugin.IExtensionHandlerKeys;
import org.xendra.model.AbstractFolder;


public class MessageFolder extends AbstractFolder {
	protected static ImageIcon localIcon = null;
	protected List<String> messages = new ArrayList<String>();
	protected String id;
	public MessageFolder(Element item) {
		super(item);
		this.setName(item.getAttributeValue("name"));
		setID(item.getAttributeValue("uid"));
		loadChildren();
	}

	private void setID(String id) {
		this.id = id;
	}
	private String getID() {
		return this.id;
	}
	public ImageIcon getIcon() {
		if (localIcon == null)
		{
			try {
				localIcon  = new ImageIcon(ImageIO.read(new File(Env.getResource("org.xendra.mfe", "table.png"))));
			}
			catch (Exception e) {}
		}
		return localIcon;
	}
	public Document export(Document doc, Element parent) {
		try {			
			Element e = getNode();
			e.setAttribute(Constants.XML_ATTRIBUTE_SYNCHRONIZED, new Timestamp(System.currentTimeMillis()).toString());
			if (e.getParent() != null)
				e.detach();
			doc = new Document(e);			
			int children = getChildCount();		 
			for (int i=0; i < children; i ++) {
				AbstractFolder s = (AbstractFolder) getChildAt(i);				
				doc = s.export(doc, e);							
			}    
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	public void loadChildren() {
		try {
			String id = getID();
			if (!messages.contains(getID())) {
				removeAllChildren();
				List<Element> items = new ArrayList<Element>();
				List<String> types = new ArrayList<String>();
				types.add("section");
				types.add("process");
				MMessageFormat format = new Query(Env.getCtx(), MMessageFormat.Table_Name, "AD_Messageformat_ID = ?", null)
				.setParameters(Integer.valueOf(id)).first();		
				if (format != null && format.getFormat().length() > 0) {					
					org.jdom.input.SAXBuilder saxBuilder = new SAXBuilder();
					org.jdom.Document doc = saxBuilder.build(new StringReader(format.getFormat()));
					Element message = doc.getRootElement();
					List list = message.getChildren();
					for (int i = 0; i < list.size(); i++) {
						Element item = (Element) list.get(i);
						String name = item.getName();				
						if (types.contains(name)) {
							items.add(item);
						}
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
						} catch (Exception e) {
							e.printStackTrace();
						}								
					}						
				}
				messages.add(getID());
			} else {

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
