package org.columba.core.config;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class jaxbobject {
	public jaxbobject() {
		
	}
	public boolean load(Object object) {
		if (object instanceof Options)
		{
			try {
				JAXBContext jaxbcontext = JAXBContext.newInstance(Options.class);
				Unmarshaller jaxbUnmarshaller = jaxbcontext.createUnmarshaller();
				object = (Options) jaxbUnmarshaller.unmarshal(new StringReader(((Options) object).getConfig().getContent()));
			}
			catch (Exception e)	{
				e.printStackTrace();
			}			
		}
		else if (object instanceof DefaultXmlConfig)
		{
			try {
				JAXBContext jaxbcontext = JAXBContext.newInstance(DefaultXmlConfig.class);
				Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
				object = (DefaultXmlConfig) jaxUnmarshaller.unmarshal(new StringReader(((DefaultXmlConfig) object).getConfig().getContent()));
			} catch (Exception e){
				e.printStackTrace();			
			}
		}
		else if (object instanceof viewsXmlConfig)
		{
			try {
				JAXBContext jaxbcontext = JAXBContext.newInstance(viewsXmlConfig.class);
				Unmarshaller jaxUnmarshaller = jaxbcontext.createUnmarshaller();
				object = (viewsXmlConfig) jaxUnmarshaller.unmarshal(new StringReader(((viewsXmlConfig) object).getConfig().getContent()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return true;
	}
	public boolean save() {
		return true;
	}
	public boolean load() {
		return true;
	}
}
