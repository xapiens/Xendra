//The contents of this file are subject to the Mozilla Public License Version 1.1
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
//The Initial Developers of the Original Code are Frederik Dietz and Timo Stich.
//Portions created by Frederik Dietz and Timo Stich are Copyright (C) 2003. 
//
//All Rights Reserved.

package org.columba.core.base;

/**
 * This is a helper class providing a quick and easy way to obtain useful
 * information about the operating system Columba is running on.
 * 
 * @author Hrk (Luca Santarelli) <hrk@users.sourceforge.net>
 */
public class OSInfo {
	private static final String OS_NAME = "os.name"; //$NON-NLS-1$

	private static final String OS_ARCH = "os.arch"; //$NON-NLS-1$

	// Platform identifiers: Windows, Linux, Mac OS, ...

	/**
	 * Returns whether the underlying operating system is a Windows or Windows
	 * NT platform.
	 * 
	 * @return isWindows32Platform
	 * 
	 * @see #org.columba.core.base.OSInfo.isWindowsPlatform()
	 * @see #org.columba.core.base.OSInfo.isWinNTPlatform()
	 */
	public static boolean isWin32Platform() {
		return (isWinNTPlatform() || isWindowsPlatform());
	}

	/**
	 * Returns whether the underlying operating system is a Windows NT platform.
	 * 
	 * @return isWinNTPlatform
	 * 
	 * @see #org.columba.core.base.OSInfo.isWinNT()
	 * @see #org.columba.core.base.OSInfo.isWin2K()
	 * @see #org.columba.core.base.OSInfo.isWin2K3()
	 * @see #org.columba.core.base.OSInfo.isWinXP()
	 */
	public static boolean isWinNTPlatform() {
		return (isWinXP() || isWin2K3()|| isWin2K() || isWinNT() );
	}

	/**
	 * Returns whether the underlying operating system is a Windows platform.
	 * 
	 * @return isWindowsPlatform
	 * 
	 * @see #org.columba.core.base.OSInfo.isWin95()
	 * @see #org.columba.core.base.OSInfo.isWin98()
	 * @see #org.columba.core.base.OSInfo.isWinME()
	 */
	public static boolean isWindowsPlatform() {
		return (isWin95() || isWin98() || isWinME());
	}

	// Single OS identifiers: Window 95, Window 98, ...

	/**
	 * Returns whether the underlying operating system is Windows 95.
	 * 
	 * @return isWin95
	 */
	public static boolean isWin95() {
		return "Windows 95".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Windows 98.
	 * 
	 * @return isWin98
	 */
	public static boolean isWin98() {
		return "Windows 98".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Windows ME.
	 * 
	 * @return isWinME
	 */
	public static boolean isWinME() {
		return "Windows ME".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Windows NT.
	 * 
	 * @return isWinNT
	 */
	public static boolean isWinNT() {
		return "Windows NT".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Windows 2000.
	 * 
	 * @return isWin2K
	 */
	public static boolean isWin2K() {
		return "Windows 2000".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Windows 2003.
	 * 
	 * @return isWin2K3
	 */
	public static boolean isWin2K3() {
		return "Windows 2003".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Windows XP.
	 * 
	 * @return isWinXP
	 */
	public static boolean isWinXP() {
		return "Windows XP".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Linux.
	 * 
	 * @return isLinux
	 */
	public static boolean isLinux() {
		return "Linux".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is Solaris.
	 * 
	 * @return isSolaris
	 */
	public static boolean isSolaris() {
		return "Solaris".equalsIgnoreCase(System.getProperty(OS_NAME)); //$NON-NLS-1$
	}

	/**
	 * Returns whether the underlying operating system is some MacOS.
	 * 
	 * @return isMac
	 */
	public static boolean isMac() {
		return System.getProperty(OS_NAME).toLowerCase().indexOf("mac") != -1; //$NON-NLS-1$
	}

	public static boolean isAMD64Bit() {
		return System.getProperty(OS_ARCH).toLowerCase().indexOf("amd64") != -1; //$NON-NLS-1$
	}
}
