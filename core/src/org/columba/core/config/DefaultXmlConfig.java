package org.columba.core.config;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.*;

import org.compiere.model.MConfig;

@XmlRootElement(name = "tools")
@XmlAccessorType(XmlAccessType.FIELD)
public class DefaultXmlConfig extends jaxbobject {
	@XmlAttribute
	String version;
	@XmlElement(required = true)
	protected List<Tool> tool = new ArrayList<Tool>();
	private MConfig conf;
	public DefaultXmlConfig() {
		
	}
	public DefaultXmlConfig(MConfig config) {
		conf = config;
	}
	public MConfig getConfig()
	{
		return conf;
	}		
	public List<Tool> getTool() {
		return tool;
	}
	public void setTool(List<Tool> tool) {
		this.tool = tool;
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
