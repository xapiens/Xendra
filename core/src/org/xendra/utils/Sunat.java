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
package org.xendra.utils;

/**
 *	Sunat Utils 	
 *	
 *  @author xapiens
 *  @version $Id: 
 */

public class Sunat {

	public static boolean isValidRUC(String RUC){
		boolean result = false;
		try {
			if (RUC.trim().length() == 11) {
				int sum = 0;
				int rest;
				int digit;
				int x = 6;
				for (int i = 0; i < RUC.length() - 1; i++) {
					if (i == 4)
						x = 8;
					digit = Integer.parseInt(RUC.substring(i, i + 1));
					x--;
					sum += digit * x;
				}
				rest = sum % 11;
				rest = 11 - rest;
				if (rest >= 10) {
					rest = rest - 10;
				}
				if (rest == Integer.parseInt(RUC.substring(RUC.length() - 1,
						RUC.length()))) {
					result = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main (String[] args)
	{
		System.out.println(Sunat.isValidRUC("20115191287"));
	}
}
