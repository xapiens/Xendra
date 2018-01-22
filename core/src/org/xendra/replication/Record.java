package org.xendra.replication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Record {
	String name;
	int level;
	int accesslevel;
	String Identifier;
	int record;
	List<Column> columns = new ArrayList<Column>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}	
	public int getAccesslevel() {
		return accesslevel;
	}
	public void setAccesslevel(int accesslevel) {
		this.accesslevel = accesslevel;
	}
	public String getIdentifier() {
		return Identifier;
	}
	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}
	public int getRecord() {
		return record;
	}
	public void setRecord(int record) {
		this.record = record;
	}
	public void addColumn(Column c) {
		for (Iterator<Column> iterator = columns.iterator(); iterator.hasNext();)
		{
			Column column = iterator.next();
			if (column.getName().equals(c.getName()))
			{
				iterator.remove();
				break;
			}
		}
		columns.add(c);		
	}
	public List<Column> getColumns()
	{
		return columns;
	}
}
