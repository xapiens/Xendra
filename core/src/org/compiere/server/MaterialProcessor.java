/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
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
 *****************************************************************************/
package org.compiere.server;


import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MAlertProcessorLog;
import org.compiere.model.MClient;
import org.compiere.model.MMaterialPolicy;
import org.compiere.model.MMaterialProcessor;
import org.compiere.model.MMaterialProcessorLog;
import org.compiere.model.Query;
import org.compiere.util.Env;
import org.compiere.util.TimeUtil;


/**
 * Material Processor
 * 
 * @author xapiens
 * 
 * @version $Id: CostProcessor.java,v 2.0 2010/06/27 05:36:56 xapiens
 */
public class MaterialProcessor extends XendraServer {

	/**
	 * Storage Processor
	 * 
	 * @param model
	 *            model
	 */
	public MaterialProcessor(MMaterialProcessor model) {
		super(model, 0); // 30 seconds delay
		m_model = model;
		m_client = MClient.get(model.getCtx(), model.getAD_Client_ID());
		//Env.setContext(getCtx(), "#AD_Client_ID", model.getAD_Client_ID());			 
	} // MaterialProcessor

	private boolean start = false;
	/** The Concrete Model */
	private MMaterialProcessor m_model = null;
	/** Last Summary */
	private StringBuffer m_summary = new StringBuffer();
	/** Client onfo */
	private MClient m_client = null;

	private HashMap<String, Thread> m_materialpolicy = new HashMap<String, Thread>();
	/**
	 * Work
	 */
	protected void doWork() {
		m_summary = new StringBuffer();
		//Env.setContext(Env.getCtx(), "#AD_Client_ID", m_model.getAD_Client_ID());		
		postSession();		
	}

	//	/**
	//	 * Post Session
	//	 */
	private void postSession() {		
		List<MMaterialPolicy> policies = new Query(Env.getCtx(), MMaterialPolicy.Table_Name, "M_MaterialProcessor_ID = ?", null)
		.setParameters(m_model.getM_MaterialProcessor_ID()).list();
		if (policies.size() == 0) {
			log.log(Level.WARNING, String.format("no policies found for %s", m_model.getName()));
		}
		for (MMaterialPolicy policy:policies) {
			if (!m_materialpolicy.containsKey(policy.getIdentifier())) {			
				policy.setFrequencyStartAt(m_model.getFrequencyStartAt());
				policy.setMaterialProcessor(this);
				policy.setClient(m_client);
				Thread threadpolicy = new Thread(policy);
				threadpolicy.setName(String.format("MaterialPolicy %s",m_client.getName()));
				m_materialpolicy.put(policy.getIdentifier(),threadpolicy);
				log.log(Level.WARNING, String.format("running material policy para %s", m_client.getName()));
				threadpolicy.start();
			} else {
				Thread threadpolicy = m_materialpolicy.get(policy.getIdentifier());								
				State state = threadpolicy.getState();
				if (state.name().equals("TERMINATED")) {
					policy.setClient(m_client);
					threadpolicy = new Thread(policy);
					threadpolicy.setName(String.format("MaterialPolicy %s",m_client.getName()));
					m_materialpolicy.put(policy.getIdentifier(),threadpolicy);
					log.log(Level.WARNING, String.format("running material policy para %s", m_client.getName()));
					threadpolicy.start();
				}				
			}			
		}
	}

	public void sessionlog() {
		MMaterialProcessorLog pLog = new MMaterialProcessorLog(m_model, m_summary.toString());
		pLog.setReference("#" + String.valueOf(p_runCount) 
			+ " - " + TimeUtil.formatElapsed(new Timestamp(p_startWork)));
		pLog.save();		
	}
	/**
	 * Get Server Info
	 * 
	 * @return info
	 */
	public String getServerInfo() {
		return "#" + p_runCount + " - Last=" + m_summary.toString();
	} // getServerInfo

	public void setSummary(String summary) {
		m_summary = new StringBuffer(summary);
	}
} // MaterialProcessor