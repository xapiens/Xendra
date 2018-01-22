package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Custom {
	@XmlElementWrapper(name="View")
	@XmlElement
	List<View> views = new ArrayList<View>();
	public List<View> getViews() {
		return views;
	}
	public void setViews(List<View> views) {
		if (views == null)
			views = new ArrayList<View>();
		this.views = views;
	}
	public void addView(View view) {		
		views.add(view);
	}	
}
