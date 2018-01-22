/******************************************************************************
 * Product: Xendra ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 Compiere, Inc. All Rights Reserved.                *
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


import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.logging.Logger;

import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

//import org.compiere.plaf.ColorBlind;
import org.compiere.swing.ColorBlind;
import org.compiere.swing.ExtendedTheme;
import org.compiere.util.Ini;

import com.jgoodies.looks.plastic.PlasticScrollBarUI;
import com.jgoodies.looks.plastic.theme.*;


/**
 * A theme based on GTK2-Gilouche and tango project iconset.
 * It has been optimized to work with Suse SLED 10 default desktop settings.
 * 
 *
 * @author vpj-cd
 * @version $Revision: 1.1 $
 * @author Low Heng Sin
 * - Fixed invisible disactive component issue
 * - Use red instead of green as background for error field
 */
public class XendraTheme extends com.jgoodies.looks.plastic.PlasticTheme {

    
	/**
	 *  Return Theme Name
	 *  @return Theme Name
	 */
	public String getName()
	{
		return s_name;
	}   //  getName
    

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		return getName();
	}	//	toString
	
        
        	
	/** Static Initializer		*/
	static
	{
		s_theme = new org.xendra.plaf.XendraTheme();
	}
	
	//-------------------------------------------------
	/** Theme Name	*/
	protected static String			s_name = "Xendra Theme";
        public static final String	NAME = s_name;
	/**	Logger					*/
	protected static Logger 	log = Logger.getLogger(org.xendra.plaf.XendraTheme.class.getName());
	/** Active Theme			*/
	protected static XendraTheme	s_theme = null;
	// #658ABB dark blue
	public static ColorUIResource primary0 = new ColorUIResource(101, 138, 107);
	// #658ABB dark blue
	public static ColorUIResource primary1 = new ColorUIResource( 101,  138,  187); // standard
	// #6798CB dark blue
	public static ColorUIResource primary2 = new ColorUIResource(103, 152,  203);  // standard
	// #E9EEF5 white blue
	public static ColorUIResource primary3= new ColorUIResource(233, 238, 245); // standard
	// #FF0000 red
	public final ColorUIResource secondary0 = new ColorUIResource(255, 0, 0); // NO USED
	// #BEB399 white brown
	public static ColorUIResource secondary1= new ColorUIResource(190, 179, 153); // standard
	// #C4BDAE white brown
	public static ColorUIResource secondary2= new ColorUIResource(196, 189, 174); // standard
	// #C8E0C2 white green Xendra Theme color
	public static ColorUIResource secondary3=  new ColorUIResource(200, 224, 194); // stadard
	// #FFFFFF white
	public final ColorUIResource secondary4 = new ColorUIResource(255, 255, 255);   
	/** Black                   */
	public static ColorUIResource black = BLACK;
	/** White                   */
	public static ColorUIResource white =  WHITE;

	/** Background for mandatory fields */
	public static ColorUIResource mandatory =  new ColorUIResource(243, 239, 171); // white yellow	
	/** Background for fields in error */	
	public static ColorUIResource error = new ColorUIResource(255, 204, 204); // pink
	/** Background for inactive fields  */
	public static ColorUIResource inactive = new ColorUIResource(241,239,222); // white gray 
	/** Background for info fields      */
	public static ColorUIResource info =  new ColorUIResource(251, 248, 251); // #FBF8FB almost white
	/** Foreground Text OK        */
	public static ColorUIResource txt_ok =new ColorUIResource(0, 153, 255); // #0099FF petrol blue
	/** Foreground Text Error     */
	public static ColorUIResource txt_error = new ColorUIResource(255, 0, 51); // #FF0033 carmin red
	/** Control font            */
	public static FontUIResource controlFont;
	/** System font             */
	public static FontUIResource systemFont;
	/** User font               */
	public static FontUIResource userFont;
	/** Small font              */
	public static FontUIResource smallFont;
	/** Window Title font       */
	public static FontUIResource windowFont;
	/** Menu font               */
	public static FontUIResource menuFont;
	/** Default Font            */
	public static final String      FONT_DEFAULT = "Dialog";
	/** Default Font Size       */
	public static final int         FONT_SIZE = 12;
	/**************************************************************************
	 *  Get Primary 1 (blue in default Metal Theme)
	 *  @return color
	 */
	public ColorUIResource getPrimary1()
	{
		return ColorBlind.getDichromatColorUIResource(primary1);
	}
	public ColorUIResource getPrimary2()
	{
		return ColorBlind.getDichromatColorUIResource(primary2);
	}
	public ColorUIResource getPrimary3()
	{
		return ColorBlind.getDichromatColorUIResource(primary3);
	}

	/**
	 *  Get Seconary 1 (gray in default Metal Theme)
	 *  @return color
	 */
	public ColorUIResource getSecondary0()
	{
		return ColorBlind.getDichromatColorUIResource(secondary0);
	}
	public ColorUIResource getSecondary1()
	{
		return ColorBlind.getDichromatColorUIResource(secondary1);
	}
	public ColorUIResource getSecondary2()
	{
		return ColorBlind.getDichromatColorUIResource(secondary2);
	}
	public ColorUIResource getSecondary3()
	{
		return ColorBlind.getDichromatColorUIResource(secondary3);
	}
	public ColorUIResource getSecondary4()
	{
		return ColorBlind.getDichromatColorUIResource(secondary4);
	}

	public ColorUIResource getBlack()
	{
		return ColorBlind.getDichromatColorUIResource(black);
	}
	public ColorUIResource getWhite()
	{
		return ColorBlind.getDichromatColorUIResource(white);
	}
	
	/**
	 *  Control Font (plain)
	 *  @return font
	 */
	protected static FontUIResource _getControlTextFont()
	{
		if (controlFont == null)
		{
			try
			{
				controlFont = new FontUIResource(Font.getFont("swing.plaf.metal.controlFont",
					new Font(FONT_DEFAULT, Font.PLAIN, FONT_SIZE)));
			}
			catch (Exception e)
			{
				controlFont = new FontUIResource(FONT_DEFAULT, Font.PLAIN, FONT_SIZE);
			}
		}
		return controlFont;
	}
	public FontUIResource getControlTextFont() {return _getControlTextFont();}

	/**
	 *  System Font
	 *  @return font
	 */
	protected static FontUIResource _getSystemTextFont()
	{
		if (systemFont == null)
		{
			try
			{
				systemFont = new FontUIResource(Font.getFont("swing.plaf.metal.systemFont",
					new Font(FONT_DEFAULT, Font.PLAIN, FONT_SIZE)));
			}
			catch (Exception e)
			{
				systemFont =  new FontUIResource(FONT_DEFAULT, Font.PLAIN, FONT_SIZE);
			}
		}
		return systemFont;
	}
	public FontUIResource getSystemTextFont() {return _getSystemTextFont();}

	/**
	 *  User Font
	 *  @return font
	 */
	protected static FontUIResource _getUserTextFont()
	{
		if (userFont == null)
		{
			try
			{
				userFont = new FontUIResource(Font.getFont("swing.plaf.metal.userFont",
					new Font(FONT_DEFAULT, Font.PLAIN, FONT_SIZE)));
			}
			catch (Exception e)
			{
				userFont =  new FontUIResource(FONT_DEFAULT, Font.PLAIN, FONT_SIZE);
			}
		}
		return userFont;
	}
	public FontUIResource getUserTextFont() {return _getUserTextFont();}

	/**
	 *  Menu
	 *  @return font
	 */
	protected static FontUIResource _getMenuTextFont()
	{
		if (menuFont == null)
		{
			try
			{
				menuFont = new FontUIResource(Font.getFont("swing.plaf.metal.menuFont",
					new Font(FONT_DEFAULT, Font.PLAIN, FONT_SIZE)));
			}
			catch (Exception e)
			{
				menuFont = new FontUIResource(FONT_DEFAULT, Font.PLAIN, FONT_SIZE);
			}
		}
		return menuFont;
	}
	public FontUIResource getMenuTextFont() {return _getMenuTextFont();}

	/**
	 *  Window Title
	 *  @return font
	 */
	protected static FontUIResource _getWindowTitleFont()
	{
		if (windowFont == null)
		{
			try
			{
				windowFont = new FontUIResource(Font.getFont("swing.plaf.metal.windowFont",
					new Font(FONT_DEFAULT, Font.BOLD, FONT_SIZE+2)));
			}
			catch (Exception e)
			{
				windowFont = new FontUIResource(FONT_DEFAULT, Font.BOLD, FONT_SIZE+2);
			}
		}
		return windowFont;
	}
	public FontUIResource getWindowTitleFont() {return _getWindowTitleFont();}

	/**
	 *  Sub Text
	 *  @return font
	 */
	protected static FontUIResource _getSubTextFont()
	{
		if (smallFont == null)
		{
			try
			{
				smallFont = new FontUIResource(Font.getFont("swing.plaf.metal.smallFont",
					new Font(FONT_DEFAULT, Font.PLAIN, FONT_SIZE-2)));
			}
			catch (Exception e)
			{
				smallFont = new FontUIResource(FONT_DEFAULT, Font.PLAIN, FONT_SIZE-2);
			}
		}
		return smallFont;
	}
	public FontUIResource getSubTextFont() {return _getSubTextFont();}

	/**
	 *  Parses Color into String representation.
	 *  Required as SystemColors and Alpha Colors have different formats
	 *  @param c Color
	 *  @return [r=102,g=102,b=153,a=255]
	 *  @see #parseColor
	 */
	public static String getColorAsString (Color c)
	{
		if (c == null)
			c = SystemColor.control;
		StringBuffer sb = new StringBuffer("[r=").append(c.getRed())
			.append(",g=").append(c.getGreen())
			.append(",b=").append(c.getBlue())
			.append(",a=").append(c.getAlpha())
			.append("]");
	//	System.out.println(sb.toString());
		return sb.toString();
	}   //  getColorAsString

	/**
	 * 	Set Default Colors
	 */
	public void setDefault()
	{
	}	//	setDefault

	//-----------------------------------------------------


    public ColorUIResource getFocusColor() {
        return getPrimary2();
    }
    
    public ColorUIResource getPrimaryControlShadow() {
        return getPrimary3();
    }

    public ColorUIResource getMenuSelectedBackground() {
        return getPrimary1();
    }
    public ColorUIResource getMenuSelectedForeground() {
        return WHITE;    	
    }
    
    public ColorUIResource getMenuItemBackground() {
        //return WHITE;    	
        return new ColorUIResource( 121, 153, 83);
    }
	
    public ColorUIResource getToggleButtonCheckColor() {
        return new ColorUIResource( 220, 241, 203);
    }

    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        Object[] uiDefaults =
            {
                "ScrollBar.thumbHighlight",
                getPrimaryControlHighlight(),
                PlasticScrollBarUI.MAX_BUMPS_WIDTH_KEY,
                new Integer(22),
                PlasticScrollBarUI.MAX_BUMPS_WIDTH_KEY, new Integer(30),
                //"TabbedPane.selected", getWhite(),
                "TabbedPane.selectHighlight",  new ColorUIResource(231, 218, 188),
                ExtendedTheme.ERROR_BG_KEY,
    			error,
    			ExtendedTheme.ERROR_FG_KEY,
    			txt_error,
    			ExtendedTheme.INACTIVE_BG_KEY,
    			inactive,
    			ExtendedTheme.INFO_BG_KEY,
    			info,
    			ExtendedTheme.MANDATORY_BG_KEY,
    			mandatory
    		};  
        table.putDefaults(uiDefaults);
    }
}
