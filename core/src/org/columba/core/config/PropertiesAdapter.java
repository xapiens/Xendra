package org.columba.core.config;

import java.util.Iterator;
import java.util.Properties;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class PropertiesAdapter  extends XmlAdapter<PropertiesMap, Properties> {
	public PropertiesMap marshal(Properties v) throws Exception {
		PropertiesMap pm = new PropertiesMap();
		Iterator it = v.keySet().iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			Object value = v.get(name);
			MapEntryType e = new MapEntryType();
			e.setName(name);
			//e.key = key;
			if (value instanceof Integer) {
				e.setValue(String.valueOf(value));
			} else if (value instanceof String) {
				e.setValue((String)value);
			} else {
				System.out.println("X");
			}
			
			//e.value = value;
			pm.getEntry().add(e);
		}
		return pm;
	}
	@Override
	public Properties unmarshal(PropertiesMap v) throws Exception {
		Properties p = new Properties();
		for (MapEntryType e:v.getEntry()) {
			p.put(e.getName(), e.getValue());
			//p.put(e.key, e.value);
		}
		return p;
	}
}
