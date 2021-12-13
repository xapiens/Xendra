// The contents of this file are subject to the Mozilla Public License Version
// 1.1
//(the "License"); you may not use this file except in compliance with the
//License. You may obtain a copy of the License at http://www.mozilla.org/MPL/
//
//Software distributed under the License is distributed on an "AS IS" basis,
//WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
//for the specific language governing rights and
//limitations under the License.
//
//The Original Code is "The Columba Project"
//
//The Initial Developers of the Original Code are Frederik Dietz and Timo
// Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003.
//
//All Rights Reserved.
package org.columba.core.resourceloader;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.compiere.util.Env;
import org.compiere.util.Ini;

public class ImageLoader {

	//private static final String ICON_PATH = "org/columba/core/icons";
	
	public static ImageIcon getMimetypeIcon(String name) {
		try {
		BufferedImage img;
		img = ImageIO.read(new File(Ini.getXendraResource("MIMETYPE")	+ name));		
		
		if (img == null) 
			img = getFallback(false);

		ImageIcon icon = new ImageIcon(img);

		return icon;
		}
		catch (Exception e)
		{}
		return null;
	}
	public static ImageIcon getSmallIconFromResource(String plugin, String name) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(Env.getResource(plugin, name, "16x16")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ImageIcon(img);
	}
	public static ImageIcon getLargeIconFromResource(String plugin, String name) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(Env.getResource(plugin, name, "22x22")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ImageIcon(img);
	}
	public static ImageIcon getIconFromResource(String plugin, String name) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(Env.getResource(plugin, name)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ImageIcon(img);
	}
	public static ImageIcon getIcon(String name) {
		return getIcon(Ini.getXendraResource(), name, false);
		//return getIcon(ImageLoader.ICON_PATH, name, false);
	}

	public static ImageIcon getSmallIcon(String name) {
		return getIcon(Ini.getXendraResource(), name, true);
	}

	public static ImageIcon getIcon(String path, String name, boolean small) {
		BufferedImage img;
		try {
		if (small)
			//url = DiskIO.getResourceURL(path + "/16x16/" + name);
			img = ImageIO.read(new File(Ini.getXendraResource("16x16") + name));
		else
			//url = DiskIO.getResourceURL(path + "/22x22/" + name);
			img = ImageIO.read(new File(Ini.getXendraResource("22x22") + name));

		if (img == null) {
			img = getFallback(small);
		}

		ImageIcon icon = new ImageIcon(img);

		return icon;
		}
		catch (Exception e)
		{}
		return null;
	}

	public static ImageIcon getMiscIcon(String name) {
		URL url;
		try {
			BufferedImage img = ImageIO.read(new File(Ini.getXendraResource("MISC")	+ name));
			if (img == null) {
				img = getFallback(true);
			}
			ImageIcon icon = new ImageIcon(img);

			return icon;				
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
//		url = DiskIO.getResourceURL(Ini.getXendraResource("MISC") + name);
//		if (url == null) {
//			url = getFallback(true);
//		}

	}

	private static BufferedImage getFallback(boolean small) {
		//String path;
		BufferedImage img;
		String name;
		//URL url;
		//path = ImageLoader.ICON_PATH;
		name = "image-missing.png";
		try {
		if (small)
			img = ImageIO.read(new File(Ini.getXendraResource("16x16")	+ name));			
		else
			img = ImageIO.read(new File(Ini.getXendraResource("22x22")	+ name));			
		return img;
		}
		catch (Exception e)
		{}
		return null;
	}

}