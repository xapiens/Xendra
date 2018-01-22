package org.columba.core.config;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Views {
	@XmlAttribute
	ViewList list = new ViewList();
}
