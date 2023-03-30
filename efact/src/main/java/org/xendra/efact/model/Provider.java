package org.xendra.efact.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Element;

public class Provider {
	private static final String UID = "uid";
	private static final String NAME = "name";
	private static final String CSVTOKEN = "csvtoken";
	private static final String CSVSEND = "csvsend";
	private static final String CSVCDR = "csvcdr";
	private static final String CSVSIGNED = "csvsigned";
	private static final String CSVPDF = "csvpdf";
	String id = "";
	String name = "";
	List<Csv> listcsv = new ArrayList<Csv>();
	public Provider(Element e) {
		id = e.getAttributeValue(Provider.UID);
		name = e.getAttributeValue(Provider.NAME);
		Iterator iterator = e.getChildren().listIterator();
		Element child;
		while (iterator.hasNext()) {
			child = (Element) iterator.next();
			if (child.getName().equals("csv")) {
				Csv csv = new Csv(child);
				listcsv.add(csv);
			}						
		}
	}	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Csv> getListcsv() {
		return listcsv;
	}	
}
