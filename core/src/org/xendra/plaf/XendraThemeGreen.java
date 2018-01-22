/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 Adempiere, Inc. All Rights Reserved.                *
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
package org.xendra.plaf;

import java.awt.*;
import javax.swing.plaf.*;

/**
 * 	Xendra default Green Color Theme
 *	
 *  @author Francisco Morosini
 *  @version $Id: XendraThemeGreen.java,v 1.1 2007/06/14 23:44:19 sergioaguayo Exp $
 */
public class XendraThemeGreen extends org.xendra.plaf.XendraTheme
{
	/**
	 * 	Xendra default Theme Blue Metal
	 */
	public XendraThemeGreen()
	{
		setDefault();
		s_theme = this;
		s_name = NAME;
	}	//	XendraThemeBlueMetal

	/**	Name			*/
	public static final String	NAME = "Xendra Theme Green";

	/**
	 *  Set Defaults
	 */
	public void setDefault()
	{
		/** Dark Blue 101, 138, 187      */
		primary1 = new ColorUIResource( 101,  138,  187);
		/** Light Blue 103,152, 203      */
		primary2 = new ColorUIResource(103, 152,  203); 
		/** Lighter Blue 233, 238, 245      */
		primary3= new ColorUIResource(233, 238, 245); // 

		/** Dark Gray                   */
		secondary1= new ColorUIResource(190, 179, 153);
		/** Dark Gray                   */
		secondary2 = new ColorUIResource(196, 189, 174);
		/** Light Green					*/
		secondary3 = new ColorUIResource(200, 224, 194); 
		/** Black                   */
		black = BLACK;
		/** White                   */
		white =  WHITE;

		/** Background for mandatory fields */
		//mandatory =  new ColorUIResource(233, 238, 245); // blueish 
		/** Background for fields in error 180,220,143  */
		//error = new ColorUIResource(220, 241, 203); // green ;
		/** Background for inactive fields  */
		/** grey					*/
		inactive = new ColorUIResource(241,239,222);
		/** Background for info fields      */
		/** light grey					*/
		info =  new ColorUIResource(251, 248, 251); 

		/** Foreground Text OK        */
		txt_ok =new ColorUIResource(0, 153, 255); // blue ;
		/** Foreground Text Error     */
		txt_error = new ColorUIResource(255, 0, 51); // red ;

		/** Black                   */
		// secondary0 = new ColorUIResource(0, 0, 0);                
		/** Control font            */
		controlFont = null;
		_getControlTextFont();
		/** System font             */
		systemFont = null;
		_getSystemTextFont();
		/** User font               */
		userFont = null;
		_getUserTextFont();
		/** Small font              */
		smallFont = null;
		_getSubTextFont();
		/** Window Title font       */
		windowFont = null;
		_getWindowTitleFont();
		/** Menu font               */
		menuFont = null;
		_getMenuTextFont();
	}   //  setDefault
}	//	XendraThemeBlueMetal
