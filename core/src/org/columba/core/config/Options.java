package org.columba.core.config;

import javax.xml.bind.annotation.*;

import org.compiere.model.MConfig;

@XmlRootElement(name = "options")
@XmlAccessorType(XmlAccessType.FIELD)
public class Options extends jaxbobject {
	@XmlElement(required = true)
    protected Gui gui;
    @XmlElement
    private Locale locale = new Locale();
    @XmlElement 
    private Proxy proxy = new Proxy();
    @XmlAttribute
    private String version;
    @XmlElement
    private Printer printer;
	private MConfig conf;
	public Options() {
		
	}
	public Options(MConfig config) {
		conf = config;
	}
	public MConfig getConfig()
	{
		return conf;
	}
	public Gui getGui() {
		return gui;
	}
	public void setGui(Gui gui) {
		this.gui = gui;
	}	
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}	
	public Proxy getProxy() {
		return proxy;
	}
	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}
	public String toString() {
		return gui.toString();
	}	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}	
	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
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
