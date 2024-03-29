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

package org.columba.core.gui.exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.logging.Logger;

import org.columba.api.exception.IExceptionListener;
import org.columba.core.connectionstate.ConnectionStateImpl;
import org.columba.core.gui.dialog.ErrorDialog;
import org.columba.core.resourceloader.GlobalResourceLoader;
import org.columba.ristretto.imap.IMAPDisconnectedException;
import org.columba.ristretto.imap.IMAPException;
import org.columba.ristretto.io.ConnectionDroppedException;
import org.compiere.util.CLogger;

/**
 * Handles all exceptions catched by Worker.construct(). Opens error dialogs.
 * 
 * @author fdietz
 */
public class ExceptionHandler implements IExceptionListener {
	private static final String RESOURCE_PATH = "org.columba.core.i18n.dialog";
	
	private static final CLogger LOG = CLogger.getCLogger("org.columba.api.command");

	/**
	 * Handle all kinds of exceptions.
	 * 
	 * @param e
	 *            exception to process
	 */
	public void processException(Exception e) {
		// Print the stacktrace to our log file.
		StringWriter error = new StringWriter();
		e.printStackTrace(new PrintWriter(error));
		LOG.severe(error.toString());

		if (e instanceof SocketException) {
			processSocketException((SocketException) e);
			ConnectionStateImpl.getInstance().setOnline(false);
		} else if (e instanceof IOException) {
			processIOException((IOException) e);
		} else if (e instanceof IMAPException) {
			processIMAPExcpetion((IMAPException) e);
		} else {
			// show error dialog, with exception message and stack-trace
			// -> dialog also provides a button for the user to easily
			// -> report a bug
			showErrorDialog(e.getMessage(), e);
		}
	}

	/**
	 * @param exception
	 */
	private void processIMAPExcpetion(IMAPException exception) {
		String errorMessage = "";
		String serverResponse = "";

		if (exception.getResponse() != null) {
			serverResponse = ": "
					+ exception.getResponse().getResponseMessage();
		}

		if (exception instanceof IMAPDisconnectedException) {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "imap_disconnected_error");
		} else {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "imap_error")
					+ serverResponse;
		}

		showErrorDialog(errorMessage, exception);
	}

	/**
	 * Handle all java.net.SocketException
	 * 
	 * @param e
	 *            a socket exception
	 */
	private void processSocketException(SocketException e) {
		String errorMessage = "";

		if (e instanceof ConnectException) {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "connect_error");
		} else if (e instanceof NoRouteToHostException) {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "no_route_to_host_error");
		} else if (e instanceof PortUnreachableException) {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "port_unreachable_error");
		} else {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "generic_socket_error");
		}

		showErrorDialog(errorMessage, e);
	}

	/**
	 * Handle all java.io.IOExceptions
	 * 
	 * @param e
	 *            io exception to process
	 */
	private void processIOException(IOException e) {
		String errorMessage = e.getMessage();

		if (e instanceof SocketTimeoutException) {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "socket_timeout_error");
		} else if (e instanceof UnknownHostException) {
			errorMessage = MessageFormat.format(GlobalResourceLoader.getString(
					RESOURCE_PATH, "error", "unknown_host_error"),
					new Object[] { e.getMessage() });
		} else if (e instanceof ConnectionDroppedException) {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "connection_dropped_error");
		} else {
			errorMessage = GlobalResourceLoader.getString(RESOURCE_PATH,
					"error", "generic_io_error");
		}

		showErrorDialog(errorMessage, e);
	}

	/**
	 * Show error dialog.
	 * 
	 * @param errorMessage
	 *            human-readable error message
	 * @param e
	 *            exception to process
	 */
	private void showErrorDialog(String details, Exception e) {

		if (details == null)
			details = e.toString();

		ErrorDialog.createDialog(details, e);

	}

	public void exceptionOccured(Exception e) {
		processException(e);
	}
}