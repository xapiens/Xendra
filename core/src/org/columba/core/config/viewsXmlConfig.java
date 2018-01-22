package org.columba.core.config;

import javax.xml.bind.annotation.*;

import org.compiere.model.MConfig;

@XmlRootElement(name = "views")
@XmlAccessorType(XmlAccessType.FIELD)
public class viewsXmlConfig  extends jaxbobject {
	private ViewList viewlist; 
	@XmlElement(name="defaultviews")
	private DefaultViews defaultviewlist;
	private MConfig conf;
	public viewsXmlConfig() {
		
	}
	public viewsXmlConfig(MConfig config) {
		conf = config;
	}
	public MConfig getConfig()	{
		return conf;
	}
	public ViewList getViewlist() {
		return viewlist;
	}
	public void setViewlist(ViewList viewlist) {
		this.viewlist = viewlist;
	}
	public DefaultViews getDefaultviewlist() {
		return defaultviewlist;
	}
	public void setDefaultviewlist(DefaultViews defaultviewlist) {
		this.defaultviewlist = defaultviewlist;
	}	
	public boolean load()
	{
		super.load(this);
		Boolean ok = true;
		return ok;
	}
	public boolean save()
	{
		return true;
	}		
}
