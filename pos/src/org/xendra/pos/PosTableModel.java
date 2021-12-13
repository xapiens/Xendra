/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2007 Dravio SAC. All Rights Reserved.                		  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.xendra.pos;

import javax.swing.table.DefaultTableModel;

/**
 * Model for our table, both in the POS and the POP. This is done because we must block
 * modification.
 * @author Sergio Aguayo
 * @version $Id: PosTableModel.java 5737 2016-01-20 16:20:33Z xapiens $
 *
 */
public class PosTableModel extends DefaultTableModel {

	/**
	 * Serial number required by Java.
	 */
	private static final long serialVersionUID = -7189473028727873847L;

	/**
	 * Default constructor for specifying column names and number of initial rows.
	 * @param szColumnNames	An array containing the column headers.
	 * @param nRows			The initial number of rows to create.
	 */
	public PosTableModel(String[] szColumnNames, int nRows) {
		super(szColumnNames, nRows);
	}
	
	/**
	 * Returns if the specified cell can be edited. For our case, it always returns false because
	 * we don't allow modification, except for the fifth column (tax in the POP) for which we permit modification.
	 * @param row		The row to check.
	 * @param column	The column in the row to check.
	 * @return Always returns false indicating that editing is forbidden, except for fifth column.
	 */
	public boolean isCellEditable(int row, int column) {
		if (column == 5) return true;
		return false;
	}
} 