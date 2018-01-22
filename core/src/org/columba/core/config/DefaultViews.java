package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class DefaultViews {
	//@XmlAttribute
	//@XmlElementWrapper(name="View")
	//@XmlElement(name="ViewList")
	//@XmlElement	
	@XmlElement(name="view")
	List<View> views = new ArrayList<View>();
	public List<View> getViews() {
		return views;
	}
	public void setViews(List<View> views) {
		this.views = views;
	}
	public View add(String id) {
		View ret = null;
		for (View view:views)
		{
			if (view.getId().equals(id))
			{
				ret = view;
			}
		}
		if (ret == null)
		{
			ret = new View();
			ret.setId(id);
			views.add(ret);
		}
		return ret;
	}
	public void addView(View view) {		
		views.add(view);
	}	
}
