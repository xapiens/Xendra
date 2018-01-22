package org.columba.core.tagging;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

import org.compiere.model.MConfig;

@XmlAccessorType(XmlAccessType.FIELD)
public class Tags {
	List<Tag> tags = new ArrayList<Tag>();
	MConfig conf;
	public Tags(MConfig config) {
		conf = config;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}
