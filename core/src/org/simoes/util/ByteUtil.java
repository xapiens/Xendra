package org.simoes.util;

import org.compiere.util.CLogger;

/**
 * Utility class for manipulating bytes in Java
 * that I have found useful.
 * 
 * @author Chris Simoes
 */
public class ByteUtil {
	static CLogger log = CLogger.getCLogger(ByteUtil.class);
	
	public static byte[] copyByteArray(byte[] a) {
		int size = a.length;
		byte[] copy = new byte[size];
		System.arraycopy(a, 0, copy, 0, size);
		return copy;
	}

}