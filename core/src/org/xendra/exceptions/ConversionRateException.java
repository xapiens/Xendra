/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                          *
 * Copyright (C) 2008 SC ARHIPAC SERVICE SRL. All Rights Reserved.            *
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
package org.xendra.exceptions;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.Format;

import org.compiere.model.MConversionType;
import org.compiere.model.MCurrency;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;
/*
 * @author xapiens
 */
public class ConversionRateException extends XendraException
{
	/**
	 *
	 */
	private static final long serialVersionUID = -2798371272365454799L;

	public ConversionRateException(BigDecimal amount, int cCurrencyID, int cCurrencyID2,
			int cConversionTypeID, Timestamp pDatedoc) {
		super(getMessage(null, amount, cCurrencyID,cCurrencyID2,cConversionTypeID,pDatedoc));
	}
	public ConversionRateException(String msg, BigDecimal amount, int cCurrencyID, int cCurrencyID2,
			int cConversionTypeID, Timestamp pDatedoc) {
		super(getMessage(msg, amount, cCurrencyID,cCurrencyID2,cConversionTypeID,pDatedoc));
	}

	private static String getMessage(String msg, BigDecimal amount, int cCurrencyID, int cCurrencyID2,
			int cConversionTypeID, Timestamp pDatedoc) {
		Env.setContext(Env.getCtx(), "#RateException", true);
		Env.setContext(Env.getCtx(), "#RateCurrency_ID", cCurrencyID);
		Env.setContext(Env.getCtx(), "#RateCurrencyTo_ID", cCurrencyID2);
		Env.setContext(Env.getCtx(), "#RateConversionType_ID", cConversionTypeID);
		Env.setContext(Env.getCtx(), "#RateDateDoc", pDatedoc);
		String p_Error = "";
		if (msg != null)
			p_Error = msg.concat(" conversion de ");
		else
			p_Error = " conversion de ";

		if (amount != null)
		{
			p_Error = p_Error.concat(DisplayType.getNumberFormat(DisplayType.Amount).format(amount));
			p_Error = p_Error.concat(" ");
		}
		if (cCurrencyID > 0)
			p_Error = p_Error.concat(MCurrency.get(Env.getCtx(), cCurrencyID).getDescription());
		else
			p_Error = p_Error.concat("Moneda no definida (0) ");
		p_Error = p_Error.concat(" a ");
		if (cCurrencyID2 > 0)
			p_Error = p_Error.concat(MCurrency.get(Env.getCtx(), cCurrencyID2).getDescription());
		else
			p_Error = p_Error.concat("Moneda no definida (0) ");
		if (cConversionTypeID == 0 )
			p_Error = p_Error.concat(" cuyo tipo de moneda no fue seleccionada ");
		else
		{
			p_Error = p_Error.concat(" tipo: ");
			p_Error = p_Error.concat(MConversionType.get(Env.getCtx(), cConversionTypeID).getName());
		}
		if (pDatedoc == null)
		{
			p_Error = p_Error.concat(" cuya fecha no fue seleccionada ");
		}
		else
		{
			p_Error = p_Error.concat(" para la fecha ");
			p_Error = p_Error.concat(DateFormat.getDateInstance().format(pDatedoc));
		}
		p_Error = p_Error.concat(" no existe ");
		return p_Error;
	}
}
