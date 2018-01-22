//The contents of this file are subject to the Mozilla Public License Version 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.undation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
package org.columba.core.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.xml.bind.annotation.*;

/**
 * A list of filters.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class FilterList {
	//@XmlElement
	//Filter filter;
	@XmlElement
	Properties properties;		
	@XmlElement(name = "filter")
	List<Filter> filters = new ArrayList<Filter>();
//	public Filter getFilter() {
//		return filter;
//	}
//	public void setFilter(Filter filter) {
//		this.filter = filter;
//	}	
	public void addProperty(String name, String value) 
	{
		properties.put(name, value);
	}	
	public void add(Filter f) {
		if (f != null) {	
			addFilter(f);
		}
	}
	private void addFilter(Filter f) {
		filters.add(f);		
	}
	
	public void addAll(FilterList list) {
		int size = list.count();

		for (int i = 0; i < size; i++) {
			Filter newFilter = list.get(i);
			add(newFilter);
		}		
	}
	
	public void remove(Filter f) {
		if (f != null) {
			filters.remove(f);
		}		
	}
	
	public void insert(Filter filter, int index) {
		if (filter != null) {
			filters.add(index, filter);
			//getRoot().insertElement(filter.getRoot(), index);
		}		
	}
	
	public void moveUp(Filter filter) {
		move(indexOf(filter), -1);		
	}
	
	public void moveDown(Filter filter) {
		move(indexOf(filter), 1);	
	}
	
	public void move(Filter filter, int nrOfPositions) {
		move(indexOf(filter), nrOfPositions);		
	}
	
	public void move(int filterIndex, int nrOfPositions) {
		if ((filterIndex >= 0) && (filterIndex < count())) {
			//XmlElement filterXML = getRoot().getElement(filterIndex);
			Filter filter = filters.get(filterIndex);
			int newFilterIndex = filterIndex + nrOfPositions;

			if (newFilterIndex < 0) {
				newFilterIndex = 0;
			}

			//getRoot().removeElement(filterIndex);
			filters.remove(filterIndex);

			if (newFilterIndex > count()) {
				//getRoot().addElement(filterXML);
				filters.add(filter);
			} else {
				//getRoot().insertElement(filterXML, newFilterIndex);
				filters.add(newFilterIndex, filter);
			}
		}		
	}
	
	public int indexOf(Filter filter) {
		int index = -1;
		if (filter != null) {
			int childCount = filters.size();

			for (int i = 0; (index == -1) && (i < childCount); i++) {
				//if (getRoot().getElement(i).equals(filter.getRoot())) {
				if (filters.get(i).equals(filter))
					index = i;				
			}
		}
		return index;
	}
	
	public int count() {
		return filters.size();
	}
	
	public Filter get(int index) {
		Filter filter = filters.get(index);
		return filter;
	}
	
	public void remove(int index) {
		filters.remove(index);		
	}
}
