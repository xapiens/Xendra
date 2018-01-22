package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "tree")
@XmlAccessorType(XmlAccessType.FIELD)
public class FolderTree extends jaxbobject{
	@XmlElement(name = "folder")
	List<Folder> folders = new ArrayList<Folder>();
	public void addFolder(Folder folder) {
		folders.add(folder);		
	}
	public Folder getRoot() {
		return folders.get(0);
	}

}
