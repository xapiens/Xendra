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


import org.compiere.model.MClient;
import org.compiere.model.MMaterialProcessor;
import org.compiere.model.persistence.X_A_MachineServer;
import org.compiere.util.Env;
import org.xendra.material.MaterialManager;
import org.xendra.material.MaterialServer;

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
		Env.setContext(getCtx(), "#AD_Client_ID", model.getAD_Client_ID());			 
	} // MaterialProcessor

	private boolean start = false;
	/** The Concrete Model */
	private MMaterialProcessor m_model = null;
	/** Last Summary */
	private StringBuffer m_summary = new StringBuffer();
	/** Client onfo */
	private MClient m_client = null;

	/**
	 * Work
	 */
	protected void doWork() {
		m_summary = new StringBuffer();
		Env.setContext(Env.getCtx(), "#AD_Client_ID", m_model.getAD_Client_ID());		
		//postSession();		
		Env.getMaterialManager(m_client, m_model.getFrequencyStartAt());		
	}

//	/**
//	 * Post Session
//	 */
//	private void postSession() {		
////		m_kernel = MaterialKernel.getInstance();
////		m_kernel.setClient(m_client);
//	}

	/**
	 * Get Server Info
	 * 
	 * @return info
	 */
	public String getServerInfo() {
		return "#" + p_runCount + " - Last=" + m_summary.toString();
	} // getServerInfo

	public void setKernel(MaterialManager stockKernel) {
		// TODO Auto-generated method stub	
	}
} // MaterialProcessor