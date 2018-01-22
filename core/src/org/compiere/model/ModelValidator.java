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
 * Contributor(s) : Layda Salas - globalqss                                   *
 *****************************************************************************/
package org.compiere.model;

import org.compiere.model.persistence.X_AD_Table_ScriptValidator;
import org.compiere.model.reference.REF_EventModelValidator;

/**
 *	Model Validator
 *	
 *  @author Jorg Janke
 *  @version $Id: ModelValidator.java 5583 2015-08-05 14:11:58Z xapiens $
 *  
 *  2007/02/26 laydasalasc - globalqss - Add new timings for all before/after events on documents
 */
public interface ModelValidator
{
	/** Model Change Type New		*/
	public static final int TYPE_BEFORE_NEW = 1;			// teo_sarca [ 1675490 ] 
	public static final int	TYPE_NEW = 1;
	public static final int	CHANGETYPE_NEW = 1;				// Compatibility with Compiere 260c
	public static final int TYPE_AFTER_NEW = 4;			// teo_sarca [ 1675490 ] 
	public static final int TYPE_AFTER_NEW_REPLICATION = 7;	// @Trifon
	/** Model Change Type Change	*/
	public static final int	TYPE_BEFORE_CHANGE = 2;		// teo_sarca [ 1675490 ] 
	public static final int	TYPE_CHANGE = 2;
	public static final int	CHANGETYPE_CHANGE = 2;			// Compatibility with Compiere 260c
	public static final int	TYPE_AFTER_CHANGE = 5;			// teo_sarca [ 1675490 ] 
	public static final int	TYPE_AFTER_CHANGE_REPLICATION = 8; // @Trifon
	/** Model Change Type Delete	*/
	public static final int	TYPE_BEFORE_DELETE = 3;		// teo_sarca [ 1675490 ] 
	public static final int	TYPE_DELETE = 3;
	public static final int	CHANGETYPE_DELETE = 3;			// Compatibility with Compiere 260c
	public static final int	TYPE_AFTER_DELETE = 6;			// teo_sarca [ 1675490 ]
	public static final int	TYPE_BEFORE_DELETE_REPLICATION = 9; // @Trifon 
	
	// Correlation between constant events and list of event script model validators
	public static String[] tableEventValidators = new String[] {
		"", // 0
		REF_EventModelValidator.TableBeforeNew,    // TYPE_BEFORE_NEW = 1
		REF_EventModelValidator.TableBeforeChange, // TYPE_BEFORE_CHANGE = 2
		REF_EventModelValidator.TableBeforeDelete, // TYPE_BEFORE_DELETE = 3
		REF_EventModelValidator.TableAfterNew,     // TYPE_AFTER_NEW = 4
		REF_EventModelValidator.TableAfterChange,  // TYPE_AFTER_CHANGE = 5
		REF_EventModelValidator.TableAfterDelete,   // TYPE_AFTER_DELETE = 6 
//		REF_EventModelValidator.TableAfterNewReplication,     // TYPE_AFTER_NEW_REPLICATION = 7
//		REF_EventModelValidator.TableAfterChangeReplication,  // TYPE_AFTER_CHANGE_REPLICATION = 8
//		REF_EventModelValidator.TableBeforeDeleteReplication   // TYPE_BEFORE_DELETE_REPLICATION = 9 
	};
	
	/** Called before document is prepared */
	public static final int TIMING_BEFORE_PREPARE = 1;
	public static final int DOCTIMING_BEFORE_PREPARE = 1; // Compatibility with Compiere 260c
	/** Called before document is void */
	public static final int TIMING_BEFORE_VOID = 2;
	/** Called before document is close */
	public static final int TIMING_BEFORE_CLOSE = 3;
	/** Called before document is reactivate */
	public static final int TIMING_BEFORE_REACTIVATE = 4;
	/** Called before document is reversecorrect */
	public static final int TIMING_BEFORE_REVERSECORRECT = 5;
	/** Called before document is reverseaccrual */
	public static final int TIMING_BEFORE_REVERSEACCRUAL = 6;
	/** Called before document is completed */
	public static final int TIMING_BEFORE_COMPLETE = 7;
	/** Called after document is prepared */
	public static final int TIMING_AFTER_PREPARE = 8;
	/** Called after document is completed */
	public static final int TIMING_AFTER_COMPLETE = 9;
	public static final int DOCTIMING_AFTER_COMPLETE = 9; // Compatibility with Compiere 260c
	/** Called after document is void */
	public static final int TIMING_AFTER_VOID = 10;
	/** Called after document is closed */
	public static final int TIMING_AFTER_CLOSE = 11;
	/** Called after document is reactivated */
	public static final int TIMING_AFTER_REACTIVATE = 12;
	/** Called after document is reversecorrect */
	public static final int TIMING_AFTER_REVERSECORRECT = 13;
	/** Called after document is reverseaccrual */
	public static final int TIMING_AFTER_REVERSEACCRUAL = 14;
	/** Called before document is posted */
	public static final int TIMING_BEFORE_POST = 15;
	/** Called after document is posted */
	public static final int TIMING_AFTER_POST = 16;
	
	// Correlation between constant events and list of event script model validators
	public static String[] documentEventValidators = new String[] {
		"", // 0
		REF_EventModelValidator.DocumentBeforePrepare,        // TIMING_BEFORE_PREPARE = 1
		REF_EventModelValidator.DocumentBeforeVoid,           // TIMING_BEFORE_VOID = 2
		REF_EventModelValidator.DocumentBeforeClose,          // TIMING_BEFORE_CLOSE = 3
		REF_EventModelValidator.DocumentBeforeReactivate,     // TIMING_BEFORE_REACTIVATE = 4
		REF_EventModelValidator.DocumentBeforeReverseCorrect, // TIMING_BEFORE_REVERSECORRECT = 5
		REF_EventModelValidator.DocumentBeforeReverseAccrual, // TIMING_BEFORE_REVERSEACCRUAL = 6
		REF_EventModelValidator.DocumentBeforeComplete,       // TIMING_BEFORE_COMPLETE = 7
		REF_EventModelValidator.DocumentAfterPrepare,         // TIMING_AFTER_PREPARE = 8
		REF_EventModelValidator.DocumentAfterComplete,        // TIMING_AFTER_COMPLETE = 9
		REF_EventModelValidator.DocumentAfterVoid,            // TIMING_AFTER_VOID = 10
		REF_EventModelValidator.DocumentAfterClose,           // TIMING_AFTER_CLOSE = 11
		REF_EventModelValidator.DocumentAfterReactivate,      // TIMING_AFTER_REACTIVATE = 12
		REF_EventModelValidator.DocumentAfterReverseCorrect,  // TIMING_AFTER_REVERSECORRECT = 13
		REF_EventModelValidator.DocumentAfterReverseAccrual,  // TIMING_AFTER_REVERSEACCRUAL = 14
		REF_EventModelValidator.DocumentBeforePost,           // TIMING_BEFORE_POST = 15
		REF_EventModelValidator.DocumentAfterPost             // TIMING_AFTER_POST = 16
	};
	
	/**
	 * 	Initialize Validation
	 * 	@param engine validation engine 
	 *	@param client client
	 */
	public void initialize (ModelValidationEngine engine, MClient client);

	/**
	 * 	Get Client to be monitored
	 *	@return AD_Client_ID
	 */
	public int getAD_Client_ID();
	
	/**
	 * 	User logged in 
	 * 	Called before preferences are set
	 *	@param AD_Org_ID org
	 *	@param AD_Role_ID role
	 *	@param AD_User_ID user
	 *	@return error message or null
	 */
	public String login (int AD_Org_ID, int AD_Role_ID, int AD_User_ID);

	
    /**
     * 	Model Change of a monitored Table.
     * 	Called after PO.beforeSave/PO.beforeDelete 
     * 	when you called addModelChange for the table
     * 	@param po persistent object
     * 	@param type TYPE_
     *	@return error message or null
     *	@exception Exception if the recipient wishes the change to be not accept.
     */
	public String modelChange (PO po, int type) throws Exception;

	
	/**
	 * 	Validate Document.
	 * 	Called as first step of DocAction.prepareIt 
	 * 	or at the end of DocAction.completeIt
     * 	when you called addDocValidate for the table.
     * 	Note that totals, etc. may not be correct before the prepare stage.
	 *	@param po persistent object
	 *	@param timing see TIMING_ constants
     *	@return error message or null - 
     *	if not null, the pocument will be marked as Invalid.
	 */
	public String docValidate (PO po, int timing);
		
}	//	ModelValidator