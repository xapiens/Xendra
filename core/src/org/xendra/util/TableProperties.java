package org.xendra.util;

import java.util.HashMap;

public class TableProperties extends HashMap {

	public TableProperties(HashMap properties) {
		this.putAll(properties);
	}

	public Integer getInteger(String PropertyName) {
		Integer ret = null;
		Object var = get(PropertyName);
		if (var != null) {
			ret = Integer.valueOf((String) var);
		}
		return ret;
	}

}
