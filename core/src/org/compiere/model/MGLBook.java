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
package org.compiere.model;

import java.sql.*;
import java.util.*;

import org.compiere.model.persistence.X_GL_Book;
import org.compiere.util.*;

/**
 *	GL Book
 *	
 *  @author xapiens
 *  @version $Id: MGLCategory.java 508 2007-11-24 23:06:53Z xapiens $
 */
public class MGLBook  extends X_GL_Book
{
	public MGLBook(Properties ctx, int GL_Book_ID, String trxName) {
		super(ctx, GL_Book_ID, trxName);
		if (GL_Book_ID == 0)
		{
			//
		}
	}

	public MGLBook(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}


	/**	Logger						*/
	private static CLogger s_log = CLogger.getCLogger (MGLBook.class);	


}	//	MGLBook
