package org.xendra.xendrian;

import java.io.IOException;

import org.jboss.logging.MessageBundle;
import org.jboss.logging.Messages;
import org.jboss.logging.Message;


@MessageBundle(projectCode="XENDRIAN")
public interface XendrianMessages {
	XendrianMessages MESSAGES = Messages.getBundle(XendrianMessages.class);
	
	@Message(id = 1, value = "X")
	IOException http2PriRequestFailed();
}
