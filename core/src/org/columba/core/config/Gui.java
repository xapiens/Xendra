package org.columba.core.config;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Gui {
	@XmlElement
	public Theme theme = new Theme();
    @XmlElement(required = true)
    public Font fonts = new Font();
    @XmlElement    
    private Toolbar toolbar = new Toolbar();
	public void setMain(String name, Integer size) {
		Main main = new Main();
		main.setName(name);
		main.setSize(size);
		fonts.addMain(main);
	}
	public void setText(String name, Integer size) {
		Text text = new Text();
		text.setName(name);
		text.setSize(size);
		fonts.addText(text);
	}
	public void addToolbar(Toolbar toolbar) {
		this.toolbar = toolbar; 		
	}
	public Font getFonts() {
		return fonts;
	}
	public void setFonts(Font fonts) {
		this.fonts = fonts;
	}
	public Toolbar getToolbar() {
		return toolbar;
	}
	public void setToolbar(Toolbar toolbar) {
		this.toolbar = toolbar;
	}
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(fonts.toString());
		sb.append(toolbar.toString());
		return sb.toString();
	}
}
