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

import java.math.BigDecimal;
import org.compiere.util.Env;

class lRowTotal 
{
	public lRowTotal() {
		
	}
	
    public void clearAll() {
		TDiscount 			= Env.ZERO;
        TDiscountAmount 	= Env.ZERO;
		TotalNet      		= Env.ZERO;
        GrossTotal 			= Env.ZERO;								
	}

	BigDecimal TDiscount 		= Env.ZERO;
    BigDecimal TDiscountAmount 	= Env.ZERO;
	BigDecimal TotalNet      	= Env.ZERO;
    BigDecimal GrossTotal 		= Env.ZERO;		
    
    public BigDecimal getTDiscount() {
		return TDiscount;
	}
	public void setTDiscount(BigDecimal discount) {
		TDiscount = discount;
	}
	public BigDecimal getTDiscountAmount() {
		return TDiscountAmount;
	}
	public void setTDiscountAmount(BigDecimal discountAmount) {
		TDiscountAmount = discountAmount;
	}
	public BigDecimal getTotalNet() {
		return TotalNet;
	}
	public void setTotalNet(BigDecimal totalNet) {
		TotalNet = totalNet;
	}
	public BigDecimal getGrossTotal() {
		return GrossTotal;
	}
	public void setGrossTotal(BigDecimal grossTotal) {
		GrossTotal = grossTotal;
	}
}
