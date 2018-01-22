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
 *****************************************************************************/
package org.compiere.wf;

import java.awt.Point;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.xendra.exceptions.DBException;
import org.compiere.model.MColumn;
import org.compiere.model.MTable;
import org.compiere.model.Query;
import org.compiere.model.persistence.X_AD_WF_Node;
import org.compiere.model.persistence.X_AD_Workflow;
import org.compiere.model.reference.REF_WF_Action;
import org.compiere.model.reference.REF__FrequencyType;
import org.compiere.model.reference.REF_WF_Join_Split;
import org.compiere.util.CCache;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;

/**
 *	Workflow Node Model
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: MWFNode.java 5583 2015-08-05 14:11:58Z xapiens $
 * 
 * @author Teo Sarca, www.arhipac.ro
 * 			<li>FR [ 2214883 ] Remove SQL code and Replace for Query
 * 			<li>BF [ 2815732 ] MWFNode.getWorkflow not working in trx
 * 				https://sourceforge.net/tracker/?func=detail&aid=2815732&group_id=176962&atid=879332 
 */
public class MWFNode extends X_AD_WF_Node
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4330589837679937718L;


	/**
	 * 	Get WF Node from Cache
	 *	@param ctx context
	 *	@param AD_WF_Node_ID id
	 *	@return MWFNode
	 */
	public static MWFNode get (Properties ctx, int AD_WF_Node_ID)
	{
		Integer key = new Integer (AD_WF_Node_ID);
		MWFNode retValue = (MWFNode) s_cache.get (key);
		if (retValue != null)
			return retValue;
		retValue = new MWFNode (ctx, AD_WF_Node_ID, null);
		if (retValue.get_ID () != 0)
			s_cache.put (key, retValue);
		return retValue;
	}	//	get

	/**	Cache						*/
	private static CCache<Integer,MWFNode>	s_cache	= new CCache<Integer,MWFNode> (Table_Name, 50);
	
	
	/**************************************************************************
	 * 	Standard Constructor - save to cache
	 *	@param ctx context
	 *	@param AD_WF_Node_ID id
	 *	@param trxName transaction
	 */
	public MWFNode (Properties ctx, int AD_WF_Node_ID, String trxName)
	{
		super (ctx, AD_WF_Node_ID, trxName);
		if (AD_WF_Node_ID == 0)
		{
		//	setAD_WF_Node_ID (0);
		//	setAD_Workflow_ID (0);
		//	setValue (null);
		//	setName (null);
			setAction (REF_WF_Action.WaitSleep);
			setCost (Env.ZERO);
			setDuration (0);
			setEntityType (ENTITYTYPE_UserMaintained);	// U
			setIsCentrallyMaintained (true);	// Y
			setJoinElement (REF_WF_Join_Split.XOR);	// X
			setDurationLimit (0);
			setSplitElement (REF_WF_Join_Split.XOR);	// X
			setWaitingTime (0);
			setXPosition (0);
			setYPosition (0);
		}
		//	Save to Cache
		if (get_ID() != 0)
			s_cache.put (new Integer(getAD_WF_Node_ID()), this);
	}	//	MWFNode

	/**
	 * 	Parent Constructor
	 *	@param wf workflow (parent)
	 *	@param Value value
	 *	@param Name name
	 */
	public MWFNode (MWorkflow wf, String Value, String Name)
	{
		this (wf.getCtx(), 0, wf.get_TrxName());
		setClientOrg(wf);
		setAD_Workflow_ID (wf.getAD_Workflow_ID());
		setValue (Value);
		setName (Name);
		m_durationBaseMS = wf.getDurationBaseSec() * 1000;
	}	//	MWFNode
	
	/**
	 * 	Load Constructor - save to cache
	 * 	@param ctx context
	 * 	@param rs result set to load info from
	 *	@param trxName transaction
	 */
	public MWFNode (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
		loadNext();
		loadTrl();
		//	Save to Cache
		s_cache.put (get_ID(), this);
	}	//	MWFNode

	
	
	/**	Next Modes				*/
	private List<MWFNodeNext>	m_next = new ArrayList<MWFNodeNext>();
	/**	Translated Name			*/
	private String			m_name_trl = null;
	/**	Translated Description	*/
	private String			m_description_trl = null;
	/**	Translated Help			*/
	private String			m_help_trl = null;
	/**	Translation Flag		*/
	private boolean			m_translated = false;
	/**	Column					*/
	private MColumn		m_column = null;
	/**	Process Parameters		*/
	private MWFNodePara[]	m_paras = null;
	/** Duration Base MS		*/
	private long			m_durationBaseMS = -1;
	
	/**
	 * 	Set Client Org
	 *	@param AD_Client_ID client
	 *	@param AD_Org_ID org
	 */
	public void setClientOrg (int AD_Client_ID, int AD_Org_ID)
	{
		super.setClientOrg (AD_Client_ID, AD_Org_ID);
	}	//	setClientOrg

	/**
	 * 	Load Next
	 */
	private void loadNext()
	{
		m_next = new Query(getCtx(), MWFNodeNext.Table_Name, "AD_WF_Node_ID=?", get_TrxName())
								.setParameters(new Object[]{get_ID()})
								.setOnlyActiveRecords(true)
								.setOrderBy(MWFNodeNext.COLUMNNAME_SeqNo)
								.list();
		boolean splitAnd = REF_WF_Join_Split.AND.equals(getSplitElement());
		for (MWFNodeNext next : m_next)
		{
			next.setFromSplitAnd(splitAnd);
		}
		log.fine("#" + m_next.size());
	}	//	loadNext

	/**
	 * 	Load Translation
	 */
	private void loadTrl()
	{
		if (Env.isBaseLanguage(getCtx(), "AD_Workflow") || get_ID() == 0)
			return;
		final String sql = "SELECT Name, Description, Help FROM AD_WF_Node_Trl"
							+" WHERE AD_WF_Node_ID=? AND AD_Language=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, get_TrxName());
			pstmt.setInt(1, get_ID());
			pstmt.setString(2, Env.getAD_Language(getCtx()));
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				m_name_trl = rs.getString(1);
				m_description_trl = rs.getString(2);
				m_help_trl = rs.getString(3);
				m_translated = true;
			}
		}
		catch (SQLException e)
		{
			//log.log(Level.SEVERE, sql, e);
			throw new DBException(e, sql);
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		log.fine("Trl=" + m_translated);
	}	//	loadTrl

	/**
	 * 	Get Number of Next Nodes
	 * 	@return number of next nodes
	 */
	public int getNextNodeCount()
	{
		return m_next.size();
	}	//	getNextNodeCount

	/**
	 * 	Get the transitions
	 * 	@param AD_Client_ID for client
	 * 	@return array of next nodes
	 */
	public MWFNodeNext[] getTransitions(int AD_Client_ID)
	{
		ArrayList<MWFNodeNext> list = new ArrayList<MWFNodeNext>();
		for (int i = 0; i < m_next.size(); i++)
		{
			MWFNodeNext next = m_next.get(i);
			if (next.getAD_Client_ID() == 0 || next.getAD_Client_ID() == AD_Client_ID)
				list.add(next);
		}
		MWFNodeNext[] retValue = new MWFNodeNext [list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getNextNodes

	
	/**************************************************************************
	 * 	Get Name
	 * 	@param translated translated
	 * 	@return Name
	 */
	public String getName(boolean translated)
	{
		if (translated && m_translated)
			return m_name_trl;
		return getName();
	}	//	getName

	/**
	 * 	Get Description
	 * 	@param translated translated
	 * 	@return Description
	 */
	public String getDescription(boolean translated)
	{
		if (translated && m_translated)
			return m_description_trl;
		return getDescription();
	}	//	getDescription

	/**
	 * 	Get Help
	 * 	@param translated translated
	 * 	@return Name
	 */
	public String getHelp(boolean translated)
	{
		if (translated && m_translated)
			return m_help_trl;
		return getHelp();
	}	//	getHelp

	/**
	 * 	Set Position
	 * 	@param position point
	 */
	public void setPosition (Point position)
	{
		setPosition(position.x, position.y);
	}	//	setPosition

	/**
	 * 	Set Position
	 * 	@param x x
	 * 	@param y y
	 */
	public void setPosition (int x, int y)
	{
		setXPosition(x);
		setYPosition(y);
	}	//	setPosition

	/**
	 * 	Get Position
	 * 	@return position point
	 */
	public Point getPosition ()
	{
		return new Point (getXPosition(), getYPosition());
	}	//	getPosition

	/**
	 * 	Get Action Info
	 *	@return info
	 */
	public String getActionInfo()
	{
		String action = getAction();
		if (REF_WF_Action.AppsProcess.equals(action))
			return "Process:AD_Process_ID=" + getAD_Process_ID();
		else if (REF_WF_Action.DocumentAction.equals(action))
			return "DocumentAction=" + getDocAction();
		else if (REF_WF_Action.AppsReport.equals(action))
			return "Report:AD_Process_ID=" + getAD_Process_ID();
		else if (REF_WF_Action.AppsTask.equals(action))
			return "Task:AD_Task_ID=" + getAD_Task_ID();
		else if (REF_WF_Action.SetVariable.equals(action))
			return "SetVariable:AD_Column_ID=" + getAD_Column_ID();
		else if (REF_WF_Action.SubWorkflow.equals(action))
			return "Workflow:AD_Workflow_ID=" + getAD_Workflow_ID();
		else if (REF_WF_Action.UserChoice.equals(action))
			return "UserChoice:AD_Column_ID=" + getAD_Column_ID();
		/*
		else if (REF_WF_Action.UserWorkbench.equals(action))
			return "Workbench:?";*/
		else if (REF_WF_Action.UserForm.equals(action))
			return "Form:AD_Form_ID=" + getAD_Form_ID();
		else if (REF_WF_Action.UserWindow.equals(action))
			return "Window:AD_Window_ID=" + getAD_Window_ID();
		else if (REF_WF_Action.WaitSleep.equals(action))
			return "Sleep:WaitTime=" + getWaitTime();
		return "??";
	}	//	getActionInfo
	
	
	/**
	 * 	Get Attribute Name
	 *	@see org.compiere.model.persistence.X_AD_WF_Node#getAttributeName()
	 *	@return Attribute Name
	 */
	public String getAttributeName ()
	{
		if (getAD_Column_ID() == 0)
			return super.getAttributeName();
		//	We have a column
		String attribute = super.getAttributeName();
		if (attribute != null && attribute.length() > 0)
			return attribute;
		setAttributeName(getColumn().getColumnName());
		return super.getAttributeName ();
	}	//	getAttributeName
	
	
	/**
	 * 	Get Column
	 *	@return column if valid
	 */
	public MColumn getColumn()
	{
		if (getAD_Column_ID() == 0)
			return null;
		if (m_column == null)
			m_column = MColumn.get(getCtx(), getAD_Column_ID());
		return m_column;
	}	//	getColumn
	
	/**
	 * 	Is this an Approval setp?
	 *	@return true if User Approval
	 */
	public boolean isUserApproval()
	{
		if (!REF_WF_Action.UserChoice.equals(getAction()))
			return false;
		return getColumn() != null 
			&& "IsApproved".equals(getColumn().getColumnName());
	}	//	isApproval

	/**
	 * 	Is this a User Choice step?
	 *	@return true if User Choice
	 */
	public boolean isUserChoice()
	{
		return REF_WF_Action.UserChoice.equals(getAction());
	}	//	isUserChoice
	
	/**
	 * 	Is this a Manual user step?
	 *	@return true if Window/Form/Workbench
	 */
	public boolean isUserManual()
	{
		if (REF_WF_Action.UserForm.equals(getAction())
			|| REF_WF_Action.UserWindow.equals(getAction())
			/*|| REF_WF_Action.UserWorkbench.equals(getAction())*/)
			return true;
		return false;
	}	//	isUserManual
	
	
	/**
	 * 	Get Duration in ms
	 *	@return duration in ms
	 */
	public long getDurationMS ()
	{
		long duration = super.getDuration ();
		if (duration == 0)
			return 0;
		if (m_durationBaseMS == -1)
			m_durationBaseMS = getAD_Workflow().getDurationBaseSec() * 1000;
		return duration * m_durationBaseMS;
	}	//	getDurationMS
	
	/**
	 * 	Get Duration Limit in ms
	 *	@return duration limit in ms
	 */
	public long getLimitMS ()
	{
		long limit = super.getDurationLimit();
		if (limit == 0)
			return 0;
		if (m_durationBaseMS == -1)
			m_durationBaseMS = getAD_Workflow().getDurationBaseSec() * 1000;
		return limit * m_durationBaseMS;
	}	//	getLimitMS
	
	/**
	 * 	Get Duration CalendarField
	 *	@return Calendar.MINUTE, etc.
	 */
	public int getDurationCalendarField()
	{
		return getAD_Workflow().getDurationCalendarField();
	}	//	getDirationCalendarField
	
	/**
	 * 	Calculate Dynamic Priority
	 * 	@param seconds second after created
	 *	@return dyn prio
	 */
	public int calculateDynamicPriority (int seconds)
	{
		if (seconds == 0 || getDynPriorityUnit() == null 
			|| getDynPriorityChange() == null 
			|| Env.ZERO.compareTo(getDynPriorityChange()) == 0)
			return 0;
		//
		BigDecimal divide = Env.ZERO;
		if (REF__FrequencyType.Minute.equals(getDynPriorityUnit()))
			divide = new BigDecimal (60);
		else if (REF__FrequencyType.Hour.equals(getDynPriorityUnit()))
			divide = new BigDecimal (3600);
		else if (REF__FrequencyType.Day.equals(getDynPriorityUnit()))
			divide = new BigDecimal (86400);
		else
			return 0;
		//
		BigDecimal change = new BigDecimal (seconds)
			.divide(divide, BigDecimal.ROUND_DOWN)
			.multiply(getDynPriorityChange());
		return change.intValue();
	}	//	calculateDynamicPriority
	
	/**************************************************************************
	 * 	Get Parameters
	 *	@return array of parameters
	 */
	public MWFNodePara[] getParameters()
	{
		if (m_paras == null)
			m_paras = MWFNodePara.getParameters(getCtx(), getAD_WF_Node_ID());
		return m_paras;
	}	//	getParameters

	/**
	 * Get Workflow
	 * @return workflow
	 * @deprecated please use {@link #getAD_Window()}
	 */
	public MWorkflow getWorkflow()
	{
		return getAD_Workflow();
	}	//	getWorkflow
	
	//@Override
	public MWorkflow getAD_Workflow()
	{
		if (get_TrxName() == null)
			return MWorkflow.get(getCtx(), getAD_Workflow_ID());
		else 
			//return (MWorkflow)super.getAD_Workflow();
			return (MWorkflow)MTable.get(getCtx(), X_AD_Workflow.Table_Name)
			.getPO(getAD_Workflow_ID(), get_TrxName());
	}
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("MWFNode[");
		sb.append(get_ID())
			.append("-").append(getName())
			.append(",Action=").append(getActionInfo())
			.append ("]");
		return sb.toString ();
	}	//	toString

	/**
	 * 	User String Representation
	 *	@return info
	 */
	public String toStringX ()
	{
		StringBuffer sb = new StringBuffer ("MWFNode[");
		sb.append(getName())
			.append("-").append(getActionInfo())
			.append("]");
		return sb.toString ();
	}	//	toStringX
	
	/**
	 * 	Before Save
	 *	@param newRecord new
	 *	@return true if can be saved
	 */
	@Override
	protected boolean beforeSave (boolean newRecord)
	{
//		if(MWorkflow.WORKFLOWTYPE_Manufacturing.equals(getAD_Workflow().getWorkflowType()))
//		{
//			setAction(MWFNode.REF_WF_Action.WaitSleep);
//			return true;
//		}
		
		String action = getAction();
		if (action.equals(REF_WF_Action.WaitSleep))
			;
		else if (action.equals(REF_WF_Action.AppsProcess) || action.equals(REF_WF_Action.AppsReport)) 
		{
			if (getAD_Process_ID() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "AD_Process_ID"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.AppsTask)) 
		{
			if (getAD_Task_ID() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "AD_Task_ID"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.DocumentAction)) 
		{
			if (getDocAction() == null || getDocAction().length() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "DocAction"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.EMail))
		{
			if (getR_MailText_ID() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "R_MailText_ID"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.SetVariable)) 
		{
			if (getAttributeValue() == null)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "AttributeValue"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.SubWorkflow))
		{
			if (getAD_Workflow_ID() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "AD_Workflow_ID"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.UserChoice)) 
		{
			if (getAD_Column_ID() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "AD_Column_ID"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.UserForm)) 
		{
			if (getAD_Form_ID() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "AD_Form_ID"));
				return false;
			}
		}
		else if (action.equals(REF_WF_Action.UserWindow)) 
		{
			if (getAD_Window_ID() == 0)
			{
				log.saveError("FillMandatory", Msg.getElement(getCtx(), "AD_Window_ID"));
				return false;
			}
		}
//		else if (action.equals(REF_WF_Action.UserWorkbench)) 
//		{
//		&& getAD_Workbench_ID() == 0)
//			log.saveError("FillMandatory", Msg.getElement(getCtx(), "AD_Workbench_ID"));
//			return false;
//		}
		
		return true;
	}	//	beforeSave
	
	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return saved
	 */
	@Override
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (!success)
			return success;
		return true;
	}	//	afterSave
	
	/**
	 * 	After Delete
	 *	@param success success
	 *	@return deleted
	 */
	@Override
	protected boolean afterDelete (boolean success)
	{
		return success;
	}	//	afterDelete

	/**
	 * Check if the workflow node is valid for given date
	 * @param date
	 * @return true if valid
	 */
	public boolean isValidFromTo(Timestamp date)
	{
		Timestamp validFrom = getValidFrom();
		Timestamp validTo = getValidTo();
		
		if (validFrom != null && date.before(validFrom))
			return false;
		if (validTo != null && date.after(validTo))
			return false;
		return true;
	}
}	//	M_WFNext

