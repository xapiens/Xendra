package org.columba.core.config;

import java.lang.reflect.Field;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Toolbars {
	@XmlAttribute
	Boolean main;
	public void set(String id, boolean value) {
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field f:fields)
			{
				if (f.getName().equals(id))
				{					
					f.set(this, value);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}				
	}		

	public Boolean get(String id) {
		Boolean result = false;
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field f:fields)
			{
				if (f.getName().equals(id))
				{
					Object ret = f.get(this);
					if (ret.getClass().equals(Boolean.class)) {
						result = (Boolean) ret;
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}
	/*	//String identifier = (String) f.get(clazz);
	for (ToolbarArea area:areas) {
		if (area.getName().equals(id))
			return area;
	}
	return null; */

	public Boolean getMain() {
		return main;
	}
	public void setMain(Boolean main) {
		this.main = main;
	}
}
