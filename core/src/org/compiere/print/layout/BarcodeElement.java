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
package org.compiere.print.layout;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Properties;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.linear.ean.UCCEAN128Barcode;
import net.sourceforge.barbecue.output.OutputException;

import org.compiere.model.reference.REF_AD_PrintFieldAlignment;
import org.compiere.model.reference.REF_AD_PrintFormatItemBarcodeType;
import org.compiere.print.MPrintFont;
import org.compiere.print.MPrintFormatItem;

/**
 * 	Barcode Print Element
 *	
 *  @author Jorg Janke
 *  @version $Id: BarcodeElement.java 5583 2015-08-05 14:11:58Z xapiens $
 * 
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 * 			<li>FR [ 1803359 ] Migrate to barbecue 1.1
 */
public class BarcodeElement extends PrintElement
{
	/**
	 * 	Barcode Element Constructor
	 *	@param code barcode data string
	 *	@param item format item
	 */
	public BarcodeElement (String code, MPrintFormatItem item)
	{
		super ();
		if (code == null || code.length() == 0
			|| item == null
			|| item.getBarcodeType() == null || item.getBarcodeType().length() == 0)
			m_valid = false;
		
		createBarcode(code, item);
		if (m_barcode == null)
			m_valid = false;
		m_allowOverflow = item.isHeightOneLine(); // teo_sarca, [ 1673590 ]
	}	//	BarcodeElement

	/**	Valid					*/
	private boolean 	m_valid = true;
	/**	 Barcode				*/
	private Barcode		m_barcode = null;
	/**  Allow this field to overflow over next fields */// teo_sarca, [ 1673590 ]
	private boolean m_allowOverflow = true;

	/**
	 * 	Create Barcode
	 *	@param code barcode data string
	 *	@param item printformat item
	 */
	private void createBarcode(String code, MPrintFormatItem item)
	{
		String type = item.getBarcodeType();
		try
		{
			if (type.equals(REF_AD_PrintFormatItemBarcodeType.Codabar2Of7Linear))
				m_barcode = BarcodeFactory.create2of7(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.CodabarMonarchLinear))
				m_barcode = BarcodeFactory.createMonarch(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.CodabarNW_7Linear))
				m_barcode = BarcodeFactory.createNW7(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.CodabarUSD_4Linear))
				m_barcode = BarcodeFactory.createUSD4(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code128ACharacterSet))
				m_barcode = BarcodeFactory.createCode128A(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code128BCharacterSet))
				m_barcode = BarcodeFactory.createCode128B(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code128CCharacterSet))
				m_barcode = BarcodeFactory.createCode128C(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code128DynamicallySwitching))
				m_barcode = BarcodeFactory.createCode128(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code393Of9LinearWithChecksum))
				m_barcode = BarcodeFactory.create3of9(code, true);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code393Of9LinearWOChecksum))
				m_barcode = BarcodeFactory.create3of9(code, false);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code39LinearWithChecksum))
				m_barcode = BarcodeFactory.createCode39(code, true);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code39LinearWOChecksum))
				m_barcode = BarcodeFactory.createCode39(code, false);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code39USD3WithChecksum))
				m_barcode = BarcodeFactory.createUSD3(code, true);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.Code39USD3WOChecksum))
				m_barcode = BarcodeFactory.createUSD3(code, false);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.CodeabarLinear))
				m_barcode = BarcodeFactory.createCodabar(code);
			
			//	http://www.idautomation.com/code128faq.html
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.EAN128))
				m_barcode = BarcodeFactory.createEAN128(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.GlobalTradeItemNoGTINUCCEAN128))
				m_barcode = BarcodeFactory.createGlobalTradeItemNumber(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.PDF417TwoDimensional))
				m_barcode = BarcodeFactory.createPDF417(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.SCC_14ShippingCodeUCCEAN128))
				m_barcode = BarcodeFactory.createSCC14ShippingCode(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.ShipmentIDNumberUCCEAN128))
				m_barcode = BarcodeFactory.createShipmentIdentificationNumber(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.SSCC_18NumberUCCEAN128))
				m_barcode = BarcodeFactory.createSSCC18(code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.UCC128))
				m_barcode = BarcodeFactory.createUCC128(UCCEAN128Barcode.EAN128_AI, code);
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.EAN13)) //@Trifon
				m_barcode = BarcodeFactory.createEAN13(code); //@Trifon
			
			//	http://www.usps.com/cpim/ftp/pubs/pub97/97apxs_006.html#_Toc481397331
			else if (type.equals(REF_AD_PrintFormatItemBarcodeType.USPostalServiceUCCEAN128))
			{
				m_barcode = BarcodeFactory.createUSPS(code);
				m_barcode.setDrawingText(false);
			}
			else 
				log.warning("Invalid Type" + type);
		}
		catch (Exception e)
		{
			log.warning(code + " - " + e.toString());
			m_valid = false;
		}
		
		if (m_valid && m_barcode != null)
		{
			if (item.getAD_PrintFont_ID() != 0)
			{
				MPrintFont mFont = MPrintFont.get(item.getAD_PrintFont_ID());
				if (mFont != null)
					m_barcode.setFont(mFont.getFont());
			}
			if (item.getMaxWidth() > 0)
				m_barcode.setBarWidth(item.getMaxWidth());
			if (item.getMaxHeight() > 0)
				m_barcode.setBarHeight(item.getMaxHeight());
		//	m_barcode.setResolution(72);
			//
			p_width = m_barcode.getWidth();
			p_height = m_barcode.getHeight();
			log.fine(type + " height=" + p_height + ", width=" + p_width);
		}
	}	//	createBarcode
	
	/**
	 * 	Get Barcode
	 *	@return Barcode
	 */
	public Barcode getBarcode()
	{
		return m_barcode;
	}	//	getBarcode
	
	/**
	 * 	Is Barcode Valid
	 *	@return true if valid
	 */
	public boolean isValid()
	{
		return m_valid;
	}	//	isValid
	
	/**
	 * 	Layout and Calculate Size
	 * 	Set p_width & p_height
	 * 	@return true if calculated
	 */
	protected boolean calculateSize ()
	{
		return true;
	}	//	calculateSize

	/**
	 * @author teo_sarca - [ 1673590 ] report table - barcode overflows over next fields
	 * @return can this element overflow over the next fields
	 */
	public boolean isAllowOverflow() { // 
		return m_allowOverflow;
	}
	
	/**
	 * 	Paint Element
	 *	@param g2D graphics
	 *	@param pageNo page no
	 *	@param pageStart page start
	 *	@param ctx context
	 *	@param isView view
	 */
	public void paint (Graphics2D g2D, int pageNo, Point2D pageStart,
		Properties ctx, boolean isView)
	{
		if (!m_valid || m_barcode == null)
			return;
		
		//	Position
		Point2D.Double location = getAbsoluteLocation(pageStart);
		int x = (int)location.x;
		if (REF_AD_PrintFieldAlignment.TrailingRight.equals(p_FieldAlignmentType))
			x += p_maxWidth - p_width;
		else if (REF_AD_PrintFieldAlignment.Center.equals(p_FieldAlignmentType))
			x += (p_maxWidth - p_width) / 2;
		int y = (int)location.y;

		try {
			m_barcode.draw(g2D, x, y);
		} catch (OutputException e) {
		}
	}	//	paint
	
	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		if (m_barcode == null)
			return super.toString();
		return super.toString() + " " + m_barcode.getData();
	}	//	toString
	
}	//	BarcodeElement
