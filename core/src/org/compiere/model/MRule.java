/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 * Contributor(s): Carlos Ruiz - globalqss                                    *
 *****************************************************************************/
package org.compiere.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.columba.core.xml.XmlElement;
import org.compiere.model.persistence.X_AD_Rule;
import org.compiere.model.reference.REF_AD_Rule_EventType;
import org.compiere.model.reference.REF_RuleType;
import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Util;

/**
 *	Persistent Rule Model
 *  @author Carlos Ruiz
 *  @version $Id: MRule.java
 */
public class MRule extends X_AD_Rule
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 343261652226641676L;
	//global or login context variable prefix
	public final static String GLOBAL_CONTEXT_PREFIX = "G_";
	//window context variable prefix
	public final static String WINDOW_CONTEXT_PREFIX = "W_";
	//method call arguments prefix
	public final static String ARGUMENTS_PREFIX = "A_";
	//process parameters prefix
	public final static String PARAMETERS_PREFIX = "P_";
	
	public static final String SCRIPT_PREFIX = "@script:";
	public static final String RULEAGENDA_PREFIX = "@agenda:";
	/**
	 * 	Get Rule from Cache
	 *	@param ctx context
	 *	@param AD_Rule_ID id
	 *	@return MRule
	 */
	public static MRule get (Properties ctx, int AD_Rule_ID)
	{
		Integer key = new Integer (AD_Rule_ID);
		MRule retValue = (MRule) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MRule (ctx, AD_Rule_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	}	//	get

	/**
	 * 	Get Rule from Cache
	 *	@param ctx context
	 *	@param ruleValue case sensitive rule Value
	 *	@return Rule
	 */
	public static MRule get (Properties ctx, String ruleValue)
	{
		if (ruleValue == null)
			return null;
		Iterator it = s_cache.values().iterator();
		while (it.hasNext())
		{
			MRule retValue = (MRule)it.next();
			if (ruleValue.equals(retValue.getValue()))
				return retValue;
		}
		//
		MRule retValue = null;
		String sql = "SELECT * FROM AD_Rule WHERE Value=? AND IsActive='Y'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setString(1, ruleValue);
			rs = pstmt.executeQuery ();
			if (rs.next ())
				retValue = new MRule (ctx, rs, null);
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		finally {
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		
		if (retValue != null)
		{
			Integer key = new Integer (retValue.getAD_Rule_ID());
			s_cache.put (key, retValue);
		}
		return retValue;
	}	//	get
	
	/**
	 * 	Get Model Validation Login Rules
	 *	@param ctx context
	 *	@return Rule
	 */
	public static ArrayList<MRule> getModelValidatorLoginRules (Properties ctx)
	{
		ArrayList<MRule> rules = new ArrayList<MRule>();
		MRule rule = null;
		String sql = "SELECT * FROM AD_Rule WHERE EventType=? AND IsActive='Y'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement (sql, null);
			pstmt.setString(1, REF_AD_Rule_EventType.ModelValidatorLoginEvent);
			rs = pstmt.executeQuery ();
			while (rs.next ()) {
				rule = new MRule (ctx, rs, null);
				rules.add(rule);
			}
		}
		catch (Exception e)
		{
			s_log.log(Level.SEVERE, sql, e);
		}
		finally {
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		
		if (rules != null && rules.size() > 0)
			return rules;
		else
			return null;
	}	//	getModelValidatorLoginRules

	/**	Cache						*/
	private static CCache<Integer,MRule> s_cache = new CCache<Integer,MRule>("AD_Rule", 20);
	
	/**	Static Logger	*/
	private static CLogger	s_log	= CLogger.getCLogger (MRule.class);
	private static Object m_rule;
	
	/* Engine Manager */
	private ScriptEngineManager factory = null;
	/* The Engine */
	ScriptEngine engine = null;
	
	/**************************************************************************
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param AD_Rule_ID id
	 *	@param trxName transaction
	 */
	public MRule (Properties ctx, int AD_Rule_ID, String trxName)
	{
		super (ctx, AD_Rule_ID, trxName);
	}	//	MRule

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MRule (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MRule
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true
	 */
	protected boolean beforeSave (boolean newRecord)
	{
		// Validate format for scripts
		// must be engine:name
		// where engine can be groovy, jython or beanshell
		if (getRuleType().equals(REF_RuleType.JSR223ScriptingAPIs)) {
			String engineName = getEngineName();
			if (engineName == null || 
					(!   (engineName.equalsIgnoreCase("groovy")
							|| engineName.equalsIgnoreCase("jython") 
							|| engineName.equalsIgnoreCase("beanshell")))) {
				log.saveError("Error", Msg.getMsg(getCtx(), "WrongScriptValue"));
				return false;
			}
		}
		return true;
	}	//	beforeSave
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer (getName());
		return sb.toString ();
	}	//	toString

	/**
	 * 	Script Engine for this rule
	 *	@return ScriptEngine
	 */
	public ScriptEngine getScriptEngine() {
		factory = new ScriptEngineManager();
		String engineName = getEngineName();
		if (engineName != null)
			engine = factory.getEngineByName(getEngineName());
		return engine;
	}

	public String getEngineName() {
		int colonPosition = getValue().indexOf(":");
		if (colonPosition < 0)
			return null;
		return getValue().substring(0, colonPosition);
	}
	
	/**************************************************************************
	 *	Set Context ctx to the engine based on windowNo
	 *  @param engine ScriptEngine
	 *  @param ctx context
	 *  @param windowNo window number
	 */
	public static void setContext(ScriptEngine engine, Properties ctx, int windowNo) {
		Enumeration<Object> en = ctx.keys();
		while (en.hasMoreElements())
		{
			String key = en.nextElement().toString();
			//  filter
			if (key == null || key.length() == 0
					|| key.startsWith("P")              //  Preferences
					|| (key.indexOf('|') != -1 && !key.startsWith(String.valueOf(windowNo)))    //  other Window Settings
					|| (key.indexOf('|') != -1 && key.indexOf('|') != key.lastIndexOf('|')) //other tab
			)
				continue;
			Object value = ctx.get(key);
			if (value != null) {
				if (value instanceof Boolean)
					engine.put(convertKey(key, windowNo), ((Boolean)value).booleanValue());
				else if (value instanceof Integer)
					engine.put(convertKey(key, windowNo), ((Integer)value).intValue());
				else if (value instanceof Double)
					engine.put(convertKey(key, windowNo), ((Double)value).doubleValue());
				else
					engine.put(convertKey(key, windowNo), value);
			}
		}
	}

	/**
	 *  Convert Key
	 *  # -> _
	 *  @param key
	 * @param m_windowNo 
	 *  @return converted key
	 */
	public static String convertKey (String key, int m_windowNo)
	{
		String k = m_windowNo + "|";
		if (key.startsWith(k))
		{
			String retValue = WINDOW_CONTEXT_PREFIX + key.substring(k.length());
			retValue = Util.replace(retValue, "|", "_");
			return retValue;
		}
		else
		{
			String retValue = null;
			if (key.startsWith("#"))
				retValue = GLOBAL_CONTEXT_PREFIX + key.substring(1);
			else
				retValue = key;
			retValue = Util.replace(retValue, "#", "_");
			return retValue;
		}
	}   //  convertKey

	public static XmlElement getAll() {
		XmlElement root = new XmlElement();
		// first the groups
		String wheregroups = "properties->'type' = 'group' AND  IsActive = 'Y' ";
		HashMap mapgroups = new HashMap();
		List<X_AD_Rule> groups = new Query(Env.getCtx(), X_AD_Rule.Table_Name, wheregroups, null)
			.setOrderBy("id").list();
		for (X_AD_Rule grp:groups) {
			XmlElement xmlgroup = new XmlElement("id");
			xmlgroup.addAttribute("uid", String.valueOf(grp.getAD_Rule_ID()));
			xmlgroup.addAttribute("AD_Plugin_ID", String.valueOf(grp.getAD_Plugin_ID()));
			xmlgroup.addAttribute("type", "group");
			xmlgroup.addAttribute("name", grp.getName());
			mapgroups.put(grp.getAD_Rule_ID(), xmlgroup);
		}
		//
		//String where = "properties->'type'  = 'kiebase' OR properties->'type' = 'group' AND  IsActive = 'Y' ";
		String where = "properties->'type' = 'kiebase' AND  IsActive = 'Y' ";
		String whererule = "Parent_ID = ?";
		String id = "";
		List<X_AD_Rule> kiebases = new Query(Env.getCtx(), X_AD_Rule.Table_Name, where, null)
			.setOrderBy("id").list();
		XmlElement idcontainer = null;
		for (X_AD_Rule kiebase:kiebases)
		{
			String type = "";
			if (id.compareTo(kiebase.getID()) != 0)
			{
				id = kiebase.getID();
				idcontainer = new XmlElement("id");			
				idcontainer.addAttribute("uid", "0");
				idcontainer.addAttribute("AD_Plugin_ID", String.valueOf(kiebase.getAD_Plugin_ID()));
				idcontainer.addAttribute("type", "plugin");
				idcontainer.addAttribute("name", id);
				for (X_AD_Rule grp:groups) {
					if (grp.getAD_Plugin_ID() == kiebase.getAD_Plugin_ID()) {
						XmlElement e = (XmlElement) mapgroups.get(grp.getAD_Rule_ID());
						idcontainer.addElement(e);
					}
				}								
				root.addElement(idcontainer);
			}			
			type = (String) kiebase.getProperties().get("type");
			if (type == null)
				type = "";
			String group = (String) kiebase.getProperties().get("group");
			if (group == null)
				group = "";
			XmlElement e = null;
			if (group.length() > 0) {
				for (X_AD_Rule grp:groups) {
					if (grp.getAD_Rule_ID() == Integer.valueOf(group)) {
						e = (XmlElement) mapgroups.get(grp.getAD_Rule_ID());						
					}
				}
			}			
			XmlElement defaultElement = new XmlElement("folder");		
			defaultElement.addAttribute("uid", String.valueOf(kiebase.getAD_Rule_ID()));
			defaultElement.addAttribute("type", type);
			defaultElement.addAttribute("AD_Plugin_ID", String.valueOf(kiebase.getAD_Plugin_ID()));			
			defaultElement.addAttribute("name", kiebase.getName());
			if (e == null) {
				idcontainer.addElement(defaultElement);
			} else {
				e.addElement(defaultElement);
			}							
			List<X_AD_Rule> rules = new Query(Env.getCtx(), X_AD_Rule.Table_Name,whererule,null).setParameters(kiebase.getAD_Rule_ID()).setOrderBy("AD_Rule_ID").list();
			for (X_AD_Rule rule:rules)
			{
				String ruletype = (String) rule.getProperties().get("type");
				if (ruletype == null)
					ruletype = "";				
				XmlElement RuleElement = new XmlElement("folder");
				RuleElement.addAttribute("uid", String.valueOf(rule.getAD_Rule_ID()));
				RuleElement.addAttribute("type", ruletype);
				RuleElement.addAttribute("AD_Plugin_ID", String.valueOf(rule.getAD_Plugin_ID()));
				RuleElement.addAttribute("name", rule.getName());
				defaultElement.addElement(RuleElement);			
			}						
		}
		return root;
	}

	public void setParent(MRule parentrule) {
		setParent_ID(parentrule.getAD_Rule_ID());
		setAD_Plugin_ID(parentrule.getAD_Plugin_ID());
		setID(parentrule.getID());		
	}

}	//	MRule