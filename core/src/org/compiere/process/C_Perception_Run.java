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
 * Portions created by Layda Salas are Copyright (C) 2005 QSS Ltda.
 * Contributor(s): Layda Salas (globalqss)
 *****************************************************************************/

package org.compiere.process;

import org.compiere.model.MInvoice;
import org.compiere.model.persistence.X_C_Perception;
import org.compiere.util.Env;

/**
 * 
 * @author xapiens
 * @version 0.1
 */
public class C_Perception_Run extends SvrProcess {

	/** The Record */
	private int p_Record_ID = 0;

	/**
	 * Prepare - e.g., get Parameters.
	 */
	protected void prepare() {
		p_Record_ID = getRecord_ID();
	} //prepare

	/**
	 * Process
	 * 
	 * @return message
	 * @throws Exception
	 */

	protected String doIt() throws Exception {

		X_C_Perception perception = new X_C_Perception(getCtx(), p_Record_ID, get_TrxName());

		/**
		 * No Action
		 */
		if (perception.isProcessed()) {
			log.info("Already Posted");
			return "@AlreadyPosted@";
		}
		if (perception.getDateAcct() == null) {
			log.info("DateAcct is null");
			return "DateAcctisnull";
		}
		MInvoice invoice = new MInvoice(Env.getCtx(), perception.getC_Invoice_ID(), null);
		perception.setC_DocType_ID(invoice.getC_DocType_ID());
		perception.setProcessed(true);
		perception.setDateDoc(invoice.getDateInvoiced());
		perception.setDocStatus(DocAction.STATUS_Completed);
		perception.saveEx();
		return "@OK@";
	} // del doIt
	
} // C_Perception_Run
