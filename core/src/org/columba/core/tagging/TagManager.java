package org.columba.core.tagging;

import java.awt.Color;
import java.io.File;
import java.io.StringReader;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import javax.swing.event.EventListenerList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.columba.api.exception.StoreException;
import org.columba.core.config.DefaultConfigDirectory;
import org.columba.core.config.Options;
//import org.columba.core.config.XmlConfig;
import org.columba.core.tagging.api.ITag;
import org.columba.core.tagging.api.ITagEvent;
import org.columba.core.tagging.api.ITagListener;
import org.columba.core.tagging.api.ITagManager;
import org.compiere.model.MConfig;
import org.compiere.util.CLogger;
import org.jdom.Document;
import org.jdom.Element;
import org.xendra.Constants;

/**
 *
 *
 * @author mhub
 * @author frd (added eventing, replaced old configuration infrastructure)
 */
public class TagManager implements ITagManager {
	private static final String TAGS = "tags";
	private static final String TAG = "tag";
	private static final String DESCRIPTION = "description";
	private static final String COLOR = "color";
	private static final String NAME = "name";
	private static final String ID = "id";
	
	private static final CLogger LOG = CLogger.getCLogger("org.columba.core.tagging.TagManager");

	public static Hashtable<String, ITag> map = new Hashtable<String, ITag>();

	protected EventListenerList listenerList = new EventListenerList();
	static private TagManager instance;
	private Document document;
	//private MyXmlConfig xmlConfig;

	/**
	 * protected singleton constructor
	 */
	protected TagManager() {

		//File file = DefaultConfigDirectory.getInstance().getCurrentPath();
		//File tagFile = new File(file, "tags.xml");
		MConfig ctags = MConfig.getbyIdentifier(Constants.CORE, "tags");
		Tags tags = new Tags(ctags);
		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(Tags.class);
			Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
			tags = (Tags) jaxUnmarshaller.unmarshal(new StringReader((ctags.getContent())));			
		} catch (Exception e)
		{
			
		}
		
		// load xml configuration
		// -> will be automatically saved every couple of minutes and on
		// shutdown
		
		//xmlConfig = new MyXmlConfig(tagFile);

		//document = xmlConfig.load();

		// create tag vector
		//loadModel(document);
	}

	public static TagManager getInstance() {
		if (instance == null) {
			synchronized (TagManager.class) {
				if (instance == null)
					instance = new TagManager();
			}
		}
		return instance;
	}

	/**
	 * @param document
	 */
	private void loadModel(Document document) {
		Element tagsElement = null;
		if (document.hasRootElement())
			tagsElement = document.getRootElement();
		else {
			tagsElement = new Element("tags");
			document.setRootElement(tagsElement);
		}

		List<Element> list = tagsElement.getChildren();
		Iterator<Element> it = list.listIterator();
		while (it.hasNext()) {
			Element tagElement = it.next();
			Tag tag = new Tag(tagElement.getAttributeValue(TagManager.ID),
					tagElement.getAttributeValue(TagManager.NAME));
			if (tagElement.getAttributeValue(TagManager.COLOR) != null) {
				String colorString = tagElement
						.getAttributeValue(TagManager.COLOR);
				int rgb = Integer.parseInt(colorString);
				tag.setColor(new Color(rgb));
			}
			if (tagElement.getAttributeValue(TagManager.DESCRIPTION) != null) {
				String description = tagElement
						.getAttributeValue(TagManager.DESCRIPTION);
				tag.setDescription(description);
			}

			map.put(tag.getId(), tag);
		}
	}

	/**
	 * @param document
	 */
	private void saveModel(Document document) {
		Element tagsElement = document.getRootElement();

		// ensure root exists
		if (tagsElement == null) {
			tagsElement = new Element(TagManager.TAGS);
			document.setRootElement(tagsElement);
		}

		// clear
		tagsElement.removeContent();

		Iterator<ITag> it = getAllTags();
		while (it.hasNext()) {
			ITag tag = it.next();
			Element tagElement = new Element(TagManager.TAG);
			tagElement.setAttribute(TagManager.ID, tag.getId());
			tagElement.setAttribute(TagManager.NAME, tag.getName());
			if (tag.getColor() != null) {
				int rgb = tag.getColor().getRGB();
				tagElement
						.setAttribute(TagManager.COLOR, Integer.toString(rgb));
			}

			if ( tag.getDescription() != null) {
				tagElement.setAttribute("description", tag.getDescription());
			}

			tagsElement.addContent(tagElement);
		}
	}

	/**
	 * @see org.columba.core.tagging.api.ITagManager#addTag(java.lang.String)
	 */
	public ITag addTag(String name) throws StoreException {
		// Do not allow an empty name
		if ((name == null) || (name.trim().length() == 0))
			throw new IllegalArgumentException("name == null");

		// create uuid
		String uuid = UUID.randomUUID().toString();
		ITag tag = new Tag(uuid, name);

		// very unlikely to happen
		if (map.containsKey(uuid))
			throw new IllegalArgumentException("duplicate key " + uuid);

		map.put(tag.getId(), tag);

		// notify listeners
		fireTagAddedEvent(tag.getId());

		return tag;
	}

	/**
	 * @see org.columba.core.tagging.api.ITagManager#getAllTags()
	 */
	public Iterator<ITag> getAllTags() {
		return map.values().iterator();
	}

	/**
	 * @see org.columba.core.tagging.api.ITagManager#getTag(java.lang.String)
	 */
	public ITag getTag(String id) {
		return map.get(id);
	}

	/**
	 * @see org.columba.core.tagging.api.ITagManager#removeTag(java.lang.String)
	 */
	public void removeTag(String id) throws StoreException {
		map.remove(id);

		// notify listeners
		fireTagDeletedEvent(id);
	}

	/**
	 * @see org.columba.core.tagging.api.ITagManager#replaceTag(org.columba.core.tagging.api.ITag)
	 */
	public void replaceTag(ITag tag) throws StoreException {
		if (tag == null)
			throw new IllegalArgumentException("tag == null");

		// this will overwrite the "old" tag with same id
		map.put(tag.getId(), tag);

		// notify listeners
		fireTagChangedEvent(tag.getId());
	}

	/** ************** eventing ***************************** */

	/**
	 * @see org.columba.core.tagging.api.ITagManager#addTagListener(org.columba.core.tagging.api.ITagListener)
	 */
	public void addTagListener(ITagListener l) {
		listenerList.add(ITagListener.class, l);

	}

	/**
	 * @see org.columba.core.tagging.api.ITagManager#removeTagListener(org.columba.core.tagging.api.ITagListener)
	 */
	public void removeTagListener(ITagListener l) {
		listenerList.remove(ITagListener.class, l);
	}

	/**
	 * @param id
	 */
	protected void fireTagChangedEvent(String id) {
		ITagEvent e = new TagEvent(this, id);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ITagListener.class) {
				((ITagListener) listeners[i + 1]).tagChanged(e);
			}
		}
	}

	/**
	 * @param id
	 */
	protected void fireTagAddedEvent(String id) {
		ITagEvent e = new TagEvent(this, id);
		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ITagListener.class) {
				((ITagListener) listeners[i + 1]).tagAdded(e);
			}
		}
	}

	/**
	 * @param id
	 */
	protected void fireTagDeletedEvent(String id) {
		ITagEvent e = new TagEvent(this, id);

		// Guaranteed to return a non-null array
		Object[] listeners = listenerList.getListenerList();

		// Process the listeners last to first, notifying
		// those that are interested in this event
		for (int i = listeners.length - 2; i >= 0; i -= 2) {
			if (listeners[i] == ITagListener.class) {
				((ITagListener) listeners[i + 1]).tagDeleted(e);
			}
		}
	}

//	class MyXmlConfig extends XmlConfig {
//
//		public MyXmlConfig(File xmlFile) {
//			super(xmlFile, null);
//		}
//
//		@Override
//		protected void transformModelToDocument(Document document) {
//			saveModel(document);
//		}
//
//	}
}
