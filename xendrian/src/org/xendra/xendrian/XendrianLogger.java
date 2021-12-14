package org.xendra.xendrian;

import java.io.IOException;
import java.nio.file.Path;

import org.jboss.logging.BasicLogger;
import org.jboss.logging.LogMessage;
import org.jboss.logging.Logger;
import org.jboss.logging.Message;

import org.jboss.logging.MessageLogger;

@MessageLogger(projectCode = "XENDRIAN")
public interface XendrianLogger extends BasicLogger {
	XendrianLogger XENDRIAN_LOGGER = Logger.getMessageLogger(XendrianLogger.class, XendrianLogger.class.getPackage().getName());
	
	@LogMessage(level = Logger.Level.ERROR)
	@Message(id = 5001 , value = "An exception ocurred")
	void exceptionReadingFile(final Path File, final IOException e);

}
