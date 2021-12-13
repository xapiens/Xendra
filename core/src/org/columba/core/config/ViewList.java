package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ViewList {
	@XmlElement(name="view")
	List<View> views = new ArrayList<View>();
	@XmlElement
	Custom custom = new Custom();
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
	public Custom getCustom() {
		return custom;
	}
	public void setCustom(Custom custom) {
		this.custom = custom;
	}
	public View getView(String id) {
		View ret = null;
		System.out.println("entrando al getView em ViewList");
		for (View view:views ) {			
			if (view.getId().equals(id)) {
				ret = view;
				break;
			}
		}
		if (ret == null)
		{
			ret = new View();
			ret.setId(id);
			Window window = new Window();
			ret.setWindow(window);
			Toolbars toolbar = new Toolbars();
			toolbar.setMain(true);
			ret.setToolbars(toolbar);
		}
		return ret;
	}	
}
