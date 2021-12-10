package org.xendra.printdocument;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.compiere.util.KeyNamePair;
import org.compiere.util.ValueNamePair;

public class DataSource {
	static DataSource ds;
	static List<String> sessions = new ArrayList<String>();
	static HashMap<String, List<String>> sessionvars = new HashMap<String, List<String>>();
	static HashMap<String, List<String>> sessiongroups = new HashMap<String, List<String>>();
	static HashMap<String, List<String>> groupvars = new HashMap<String, List<String>>();
	static String currentsession = "";
	static HashMap<String, Integer> index = new HashMap<String, Integer>();
	static HashMap<String, Object> list = new HashMap<String, Object>();
	static HashMap<String, Object> listgroup = new HashMap<String, Object>();
	public HashMap<String, Integer> searched = new HashMap<String, Integer>();
	public static DataSource reset() {
		// reset
		if (ds == null) 
			ds = new DataSource();
		return ds;
	}
	public static DataSource getInstance() {
		if (ds == null) 
			ds = new DataSource();
		return ds;
	}	
	public static String get(String group, String key) {
		String var = "";
		String newkey = String.format("%s_%s", group, key);
		Object v = null;
		if (listgroup.containsKey(newkey)) 
			v = listgroup.get(newkey);
		if (v instanceof String) {
			var = (String) v;
		} else if( v instanceof ValueNamePair) {
			ValueNamePair vv = (ValueNamePair) v;
			if (m_mode.equals("V"))
				var = vv.getValue();
			else if (m_mode.equals("N")) 
				var = vv.getName();
		} else if (v instanceof BigDecimal) {
			var = ((BigDecimal) v).toString();
		} else {
			System.out.println("X");
		}
		return var;
	}
	public static String get(String key) {
		String var = "";
		Object v = null;
		if (list.containsKey(key)) 
			v = list.get(key);
		//var = (String) list.get(key);
		if (v instanceof String) {
			var = (String) v;
		}
		else if(v instanceof ValueNamePair) {
			ValueNamePair vv = (ValueNamePair) v;
			if (m_mode.equals("V"))
				var = vv.getValue();
			else if (m_mode.equals("N"))
				var = vv.getName();
		} else {
			System.out.println("X");
		}
		//String var = "";
		//Object v = listvalue.get(pos);
		//if (v instanceof String) {

		return var;
	}
	private static void registerGroup(String group, String key) {
		if (currentsession.length() > 0) {
			List<String> groups = new ArrayList<String>();
			if (sessiongroups.containsKey(currentsession)) {
				groups = sessiongroups.get(currentsession);	
			}
			if (!groups.contains(group)) {
				groups.add(group);
				sessiongroups.put(currentsession, groups);
			}			
			List<String> vars = new ArrayList<String>();
			if (groupvars.containsKey(group)) {
				vars = groupvars.get(group);
			}
			if (!vars.contains(key)) {
				vars.add(key);
				groupvars.put(group, vars);
			}
		}						
	}
	private static void register(String key) {
		if (currentsession.length() > 0) {
			List<String> vars = new ArrayList<String>();
			if (sessionvars.containsKey(currentsession)) {
				vars = sessionvars.get(currentsession);	
			}
			if (!vars.contains(key)) {
				vars.add(key);
				sessionvars.put(currentsession, vars);
			}
		}				
	}
	public static void set(String key, Object value) {
		register(key);
		String var = "";
		if (value instanceof ValueNamePair) {
			list.put(key, value);
		} else if (value instanceof String) { 
			var = (String) value;
			list.put(key, var);
		} else if (value instanceof Timestamp) { 
			var = value.toString();
			list.put(key, var);
		} else if (value instanceof BigDecimal) { 
			var = value.toString();
			list.put(key, var);
		} else {
			System.out.println("X");
		}
	}
//	public static void set(String key, String value) {
//		register(key);
//		list.put(key, value);
//	}
//	public static void set(String key, Timestamp var) {
//		register(key);
//		list.put(key, var.toString());
//	}
//	public static void set(String key, BigDecimal bd) {
//		register(key);
//		String sbd = bd.toString();
//		list.put(key, sbd);
//	}
//	public static void set(String key, ValueNamePair vp) {
//		register(key);
//		list.put(key, vp);	
//	}
	public static void set(String group, String key, ValueNamePair vp) {
		registerGroup(group, key);
		String newkey = String.format("%s_%s", group, key);
		listgroup.put(newkey, vp);
	}
	public static void set(String group, String key, String value) {
		registerGroup(group, key);
		String newkey = String.format("%s_%s", group, key);
		listgroup.put(newkey, value);
	}
	public static void set(String group, String key, BigDecimal value) {
		registerGroup(group, key);
		String newkey = String.format("%s_%s", group, key);
		listgroup.put(newkey, value);
	}		
	private static String m_mode = "V";	
	public static void setModeValue(String mode) {
		m_mode = mode;	
	}
	public static void setLine(String group, String key, ValueNamePair np) {
		registerGroup(group, key);
		String groupkey = String.format("%s_%s", group, key);
		List<ValueNamePair> listvaluenamepair = new ArrayList<ValueNamePair>();
		if (listgroup.containsKey(groupkey)) {
			listvaluenamepair = (List<ValueNamePair>) listgroup.get(groupkey);
		}
		listvaluenamepair.add(np);
		listgroup.put(groupkey, listvaluenamepair);
	}
	
	public static void setLine(String group, String key, String value) {
		registerGroup(group, key);
		String groupkey = String.format("%s_%s", group, key);
		List<String> listvalues = new ArrayList<String>();
		if (listgroup.containsKey(groupkey)) {
			listvalues = (List<String>) listgroup.get(groupkey);
		}
		listvalues.add(value);		
		listgroup.put(groupkey, listvalues);		
	}
	
	public static void setLine(String group, String key, BigDecimal value) {
		registerGroup(group, key);
		String groupkey = String.format("%s_%s", group, key);
		List<BigDecimal> listvalue = new ArrayList<BigDecimal>();
		if (listgroup.containsKey(groupkey)) {
			listvalue = (List<BigDecimal>) listgroup.get(groupkey);
		} 
		listvalue.add(value);
		listgroup.put(groupkey, listvalue);		
	}


	//registerGroup(group, key);
	//List<BigDecimal> listvalue = new ArrayList<BigDecimal>();
	//if (listgroup.containsKey(key)) {
	//	listvalue = (List<BigDecimal>) listgroup.get(key);
	//} 
	//listvalue.add(value);
	//listgroup.put(key, listvalue);			
	public static String getLine(String group, String key) {
		String groupkey = String.format("%s_%s", group, key);
		List<Object> listvalue = new ArrayList<Object>();
		if (listgroup.containsKey(groupkey)) {
			listvalue = (List<Object>) listgroup.get(groupkey);
		}
		Integer pos = 0;
		if (index.containsKey(groupkey)) {
			pos = index.get(groupkey);
		}				
		Object v = listvalue.get(pos);
		String var = "";
		if (v instanceof String) {
			var = (String) listvalue.get(pos);
		} else if (v instanceof BigDecimal) {
			var = ((BigDecimal) v).toString();
		} else if (v instanceof ValueNamePair) {
			ValueNamePair vv = (ValueNamePair) v;
			if (m_mode.equals("V"))
				var = vv.getValue();
			else if (m_mode.equals("N"))
				var = vv.getName();
		}		
		pos++;
		index.put(groupkey, pos);
		return var;		
	}
	
	public static void setLine(String key, String value) {
		register(key);
		List<String> listvalues = new ArrayList<String>();
		if (list.containsKey(key)) {
			listvalues = (List<String>) list.get(key);
		}
		listvalues.add(value);		
		list.put(key, listvalues);
	}
	public static void setLine(String key, ValueNamePair np) {
		register(key);
		List<ValueNamePair> listvaluenamepair = new ArrayList<ValueNamePair>();
		if (list.containsKey(key)) {
			listvaluenamepair = (List<ValueNamePair>) list.get(key);
		}
		listvaluenamepair.add(np);
		list.put(key, listvaluenamepair);
	}
	public static void setLine(String key, Boolean var) {
		register(key);
		List<Boolean> listvalue = new ArrayList<Boolean>();
		if (list.containsKey(key)) {
			listvalue = (List<Boolean>) list.get(key);
		}
		listvalue.add(var);
		list.put(key, listvalue);
	}
	public static void setLine(String key, BigDecimal value) {
		register(key);
		List<BigDecimal> listvalue = new ArrayList<BigDecimal>();
		if (list.containsKey(key)) {
			listvalue = (List<BigDecimal>) list.get(key);
		} 
		listvalue.add(value);
		list.put(key, listvalue);
	}
	public String searchvalue(String key) {
		String var = "";
		Object v = list.get(key);
		if (v instanceof String) {
			var = (String) v;
		} else if (v instanceof BigDecimal) {
			var = ((BigDecimal) v).toString();
		} else if (v instanceof ValueNamePair) {
			if (m_mode.equals("V")) 
				var = ((ValueNamePair) v).getValue();
			else 
				var = ((ValueNamePair) v).getName();
		}
		return var;
	}
	public List<String> searchvalueline(String key) {
		List<String> ret = new ArrayList<String>();
		List<Object> listvalue = new ArrayList<Object>();
		if (list.containsKey(key)) {
			listvalue = (List<Object>) list.get(key);
		}
		Iterator it = listvalue.iterator();
		while (it.hasNext()) {
			Object v = (Object) it.next();
			String var = "";
			if (v instanceof String) {
				var = (String) v;
			} else if (v instanceof BigDecimal) {
				var = ((BigDecimal) v).toString();
			} else if (v instanceof ValueNamePair) {
				if (m_mode.equals("V"))
					var = ((ValueNamePair) v).getValue();
				else 
					var = ((ValueNamePair) v).getName();
			}
			ret.add(var);
		}
		return ret;
	}	
	public static String getLine(String key) {
		String var = "";
		List<Object> listvalue = new ArrayList<Object>();
		if (list.containsKey(key)) {
			listvalue = (List<Object>) list.get(key);
		}
		Integer pos = 0;
		if (index.containsKey(key)) {
			pos = index.get(key);
		}
		Object v = listvalue.get(pos);
		if (v instanceof String) {
			var = (String) listvalue.get(pos);
		} else if (v instanceof BigDecimal) {
			var = ((BigDecimal) v).toString();
		} else if (v instanceof ValueNamePair) {
			ValueNamePair vv = (ValueNamePair) v;
			if (m_mode.equals("V"))
				var = vv.getValue();
			else if (m_mode.equals("N"))
				var = vv.getName();
		}		
		pos++;
		index.put(key, pos);
		return var;
	}
	//	public static void setLine(String key, KeyNamePair kp) {
	//		List<KeyNamePair> listvaluekeypair = new ArrayList<KeyNamePair>();
	//		if (list.containsKey(key)) {
	//			listvaluekeypair = (List<KeyNamePair>) list.get(key);
	//		}
	//		listvaluekeypair.add(kp);
	//		list.put(key, listvaluekeypair);
	//	}
	//	public static void clear() {
	//		index = new HashMap<String, Integer>();
	//		list = new HashMap<String, Object>();		
	//	}
	public static void clear(String sessionname) {
		if (!sessions.contains(sessionname))
			sessions.add(sessionname);
		currentsession = sessionname;
		if (sessionvars.containsKey(sessionname)) {
			List<String> vars = sessionvars.get(sessionname);
			for (String var:vars) {
				list.remove(var);
				index.remove(var);
			}

		}
		if (sessiongroups.containsKey(sessionname)) {
			List<String> groups = new ArrayList<String>();
			if (sessiongroups.containsKey(currentsession)) {
				groups = sessiongroups.get(currentsession);
				for (String group:groups) {
					List<String> vars = new ArrayList<String>();
					if (groupvars.containsKey(group)) {
						vars = groupvars.get(group);
						for (String var:vars) {
							String newvar = String.format("%s_%s", group, var);
							listgroup.remove(newvar);
							index.remove(newvar);
						}
					}
				}
			}	
		}
	}
}
