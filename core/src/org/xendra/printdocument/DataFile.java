package org.xendra.printdocument;

import java.io.Serializable;

import org.simoes.util.*;

import org.compiere.util.CLogger;

/**
 * 
 * The dataFile encapsulates the actual print job data that
 * we will send to the printer.
 * @author Chris Simoes
 *
 *
 */
public class DataFile extends PrintFile implements Cloneable {
	/**
	 * 
	 */
	static CLogger log = CLogger.getCLogger(DataFile.class);

	public DataFile() {
		super();
	}

	public Object clone() {
		final String METHOD_NAME = "clone()";
		DataFile result = null;
		try {
			result = (DataFile)super.clone();
			result.setContents(this.getContents());
		} catch(CloneNotSupportedException e) {
			log.severe(METHOD_NAME + e.getMessage());
			throw new InternalError(METHOD_NAME + e.getMessage());
		}
		return result;
	}
	
}