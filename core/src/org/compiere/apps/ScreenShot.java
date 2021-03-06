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
package org.compiere.apps;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.imageio.*;
import javax.imageio.stream.*;
import javax.swing.*;
import org.compiere.util.*;

/**
 *	JPEG File Utility
 *
 * 	@author 	Jorg Janke
 * 	@version 	$Id: ScreenShot.java 508 2007-11-24 23:06:53Z el_man $
 */
public class ScreenShot
{
	/**
	 * 	Create JPEG file from window
	 * 	@param window window
	 * 	@param fileName optional file name
	 * 	@return true if created
	 */
	public static boolean createJPEG (Window window, String fileName)
	{
		if (window == null || fileName == null)
			new IllegalArgumentException("ScreenShot.createJPEG Window os NULL");

		//	Get File
		File file = getJPGFile (window);
		if (file == null)
			return false;
		log.config("File=" + file);
		if (file.exists())
			file.delete();

		//	Get Writer
		Iterator writers = ImageIO.getImageWritersByFormatName("jpg");
		ImageWriter writer = (ImageWriter)writers.next();
		if (writer == null)
		{
			log.log(Level.SEVERE, "no ImageWriter");
			return false;
		}

		//	Get Image
		BufferedImage bi = getImage(window);

		//	Write Image
		try
		{
			ImageOutputStream ios = ImageIO.createImageOutputStream (file);
			writer.setOutput(ios);
			writer.write(bi);
			ios.flush();
			ios.close();

		}
		catch (IOException ex)
		{
			log.log(Level.SEVERE, "ex", ex);
			return false;
		}
		return true;
	}	//	createJPEG


	/**
	 * 	Get JPEG File
	 * 	@param parent parent
	 * 	@return file
	 */
	protected static File getJPGFile (Component parent)
	{
		JFileChooser fc = new JFileChooser();
		fc.addChoosableFileFilter(new ExtensionFileFilter("jpg", Msg.getMsg(Env.getCtx(), "FileJPEG")));
		if (fc.showSaveDialog(parent) != JFileChooser.APPROVE_OPTION)
			return null;
		File file = fc.getSelectedFile();
		if (file == null)
			return null;
		String fileName = file.getAbsolutePath();
		if (!(fileName.toUpperCase().equals(".JPG") || fileName.toUpperCase().equals(".JPEG")))
			fileName += ".jpg";
		return new File (fileName);
	}	//	getFile

	/**
	 * 	Get Image of Window
	 * 	@param window window
	 * 	@return image
	 */
	protected static BufferedImage getImage (Window window)
	{
		BufferedImage bi = new BufferedImage (window.getWidth(), window.getHeight(),
			BufferedImage.TYPE_INT_RGB);	//	TYPE_INT_ARGB is tinted red
		window.paintAll(bi.createGraphics());
		return bi;
	}	//	getImage

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(ScreenShot.class);
}	//	ScreenShot
