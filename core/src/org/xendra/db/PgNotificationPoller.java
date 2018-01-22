package org.xendra.db;

/**
 *
 * @author xapiens
 */
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.postgresql.PGNotification;

/**
 * PgNotificationPoller uses PgNotificationHelper to monitor the database
 * for events of interest.
 *
 * PgNotificationPoller requires a dedicated JDBC connection, which it
 * creates using a properties map and manages its self. It will attempt to
 * reconnect if this connection is lost, and will do its best to handle
 * problems appropriately. Any exceptions from the database will logged
 * via java.util.logging and will be acted on if possible, but not re-thrown.
 *
 * If you want to use your own JDBC connection, use PgNotificationHelper
 * directly and be prepared to deal with SQLExceptions if and when they arise.
 *
 * Note that this class will only function correctly with a post-8.1.x JDBC
 * driver because of changes to notification polling.
 *
 * @author Craig Ringer <ringerc@gmail.com>
 */
//
// TODO / ideas list:
//
// - Support changing of connection props without notification loss, by maintaining
//   old conn until new one successfully established (?).
//
// - Support advisory lock management too
//
// - Let someone grab the connection and do some work on it, holding it exclusively
//   until they hand it back to us.
//
public class PgNotificationPoller {

    public static final String PG_DRIVER_CLASS = "org.postgresql.Driver";
    public static final String P_STATUS = "status";

    /**
     * Status describes what the poller is currently doing.
     *
     * The stopped state indicates that it's not currently listening for notifications,
     * and the listening state indicates that is <i>is</i> listening for notifications.
     */
    public enum Status {
        STOPPED,
        LISTENING;
    }

    /**
     * If the PostgreSQL JDBC driver could not be loaded, this exception is thrown.
     */
    public static class DriverNotFoundException extends RuntimeException {
        public DriverNotFoundException(String message, Throwable e) {
            super(message, e);
        }
    }

    /**
     * Listener interface to be implemented by classes that are interested
     * in hearing about PostgreSQL `NOTIFY' events, and in the status of
     * the polling task.
     *
     * Exceptions thrown by listeners will be caught, logged, and ignored.
     * It is still highly recommended that you avoid letting exceptions propagate
     * out of your listeners in the first place.
     */
    public static interface PgNotificationListener {

        /**
         * Reports that one or more NOTIFY events have been received by the poller.
         *
         * Self-notifications will be delivered, so if you wish to exclude them
         * or identify them, test `receivingBackendPid' against
         * `PGNotification.getPid()' for each notification to see if the sending
         * and receiving backend pid are the same.
         *
         * @param poller Poller that received the NOTIFY
         * @param receivingBackendPid pid of backend that recieved the notification. Test against notices.getPid() to eliminate self notifications.
         * @param notices Read-only list of notification event(s)
         */
        void notified( PgNotificationPoller poller, long receivingBackendPid, List<PGNotification> notices );

        /**
         * Reports a change in poller status, such as a disconnect or reconnect.
         * You may need to query the database to catch up on changes here,
         * as a disconnect or reconnect implies that notifications may have
         * been lost.
         *
         * @param poller Poller that disconnected/reconnected
         * @param oldStatus Status transitioned from
         * @param newStatus Status transitioned to
         * @param targetStatus Status seeking
         */
        void pollerStatusChanged( PgNotificationPoller poller, Status oldStatus, Status newStatus, Status targetStatus );

        /**
         * A LISTEN has been executed on the database, and NOTIFY events for that
         * name will now be received.
         *
         * @param poller Poller that added the listen
         * @param names Read-only collection of name(s) newly LISTENed
         */
        void listenersAdded( PgNotificationPoller poller, Collection<String> names );

        /**
         * An UNLISTEN has been executed on the database, and NOTIFY events for that
         * name will no longer be received.
         *
         * '*' will never be passed as a name. Instead, individual
         * listenRemoved(...) calls will be made.
         *
         * @param poller Poller that added the listen
         * @param names Read-only collection of name(s) newly UNLISTENed
         */
        void listenersRemoved( PgNotificationPoller poller, Collection<String> names );
    }

    /**
     * Adapter for PgNotificationListener in case you're only interested in a subset
     * of the events. Other events are ignored.
     *
     * {@inheritDoc}
     */
    public abstract static class PgNotificationAdapter implements PgNotificationListener {

        /** {@inheritDoc} */
        @Override
        public void notified( PgNotificationPoller poller, long receivingBackendPid, List<PGNotification> notices ) {
        }

        /** {@inheritDoc} */
        @Override
        public void pollerStatusChanged(PgNotificationPoller poller, Status oldStatus, Status newStatus, Status targetStatus) {
        }

        /** {@inheritDoc} */
        @Override
        public void listenersAdded(PgNotificationPoller poller, Collection<String> names) {
        }

        /** {@inheritDoc} */
        @Override
        public void listenersRemoved(PgNotificationPoller poller, Collection<String> names) {
        }

    }

    /**
     * A single object may listen for exceptions thrown by the
     * JDBC connction used by the poller's worker thread. It must implement
     * this interface.
     */
    public interface PgNotificationExceptionListener {

        /**
         * If any exceptions are thrown while working with the JDBC connection,
         * this callback will report them. This may be useful for handling bad
         * usernames/passwords, consistently unreachable servers, etc.
         *
         * It's mainly here so that you can log issues.
         *
         * The poller / worker will act on the exception as best as it can, generally
         * by re-trying its work or if the connection looks dead trying to create a
         * new one. You cannot directly control that, but may supply new credentials
         * or stop() / start() the poller service if needed. It is safe to do so from
         * this callback.
         *
         * The JDBC connection on which the exception was thrown is provided on
         * the off chance it may be required. It will not be used by the poller
         * before this method returns, as this method's execution blocks the
         * poller worker thread, so it's technically safe to execute work on it.
         * Nonetheless, you should really avoid doing anything with it if at
         * all possible.
         *
         * @warning Do not permit exceptions to be thrown by your implementation of this method.
         *
         * @warning This method is called synchronously on the poller's worker thread.
         *          It should schedule any time consuming work to be done later and return
         *          promptly. <b>Delayed work <i>must</i> not use the passed connection</b>.
         *
         * @param poller poller whose worker caught the exception
         * @param conn Connection in use when the exception was thrown
         * @param message Message from poller worker indicating what it was doing at the time
         * @param exc SQLException thrown
         */
        void sqlExceptionEncountered( PgNotificationPoller poller, Connection conn, String message, SQLException exc );

        /**
         * A listener let an exception propagate up to the worker thread's event
         * dispatch methods. The exception will be ignored, but this callback is
         * invoked with it first to make it possible to track down such issues.
         *
         * @param poller Poller whose worker had a listener throw the exception
         * @param message Message from the poller about the problem
         * @param listener The guilty party - the object that threw
         * @param exc Exception thrown by the listener
         */
        void listenerExceptionEncountered( PgNotificationPoller poller, String message, PgNotificationListener listener, Throwable exc );

    }


    private final ConnectionPoller poller = new ConnectionPoller();
    private int pollDelayMs = 1000;
    // TODO backoff
    private int reconnectDelayMs = 30000;
    private int validityTestDelayMs = 10000;
    private int validityTestTimeoutSeconds = 30;


    /**
     * Create a new poller without any connection parameters.
     *
     * The poller will begin in the `STOPPED' state and will not attempt to
     * start polling until connnection details are passed via
     * setConnectionProperties.
     *
     * @throws DriverNotFoundException if jdbc driver not loadable
     */
    public PgNotificationPoller() {
        testDriverPresent();
        poller.start();
    }

    /**
     * Create a new poller with the supplied JDBC URL and connecton properties map.
     *
     * The poller will begin in the STOPPED state, but will immediately begin
     * trying to transition to LISTENING by bringing up a JDBC connection. If
     * connection fails, it will be retried periodically.
     *
     * @param url JDBC URL to connect with
     * @param map JDBC properties map to use for credentials and conn params
     * @throws DriverNotFoundException if jdbc driver not loadable
     */
    public PgNotificationPoller(String url, Properties map) {
        this();
        setConnectionProperties(url, map);
    }

    /**
     * Create a new poller with the supplied JDBC URL and connecton properties map.
     *
     * The poller will begin in the STOPPED state, but will immediately begin
     * trying to transition to LISTENING by bringing up a JDBC connection. If
     * connection fails, it will be retried periodically.
     *
     * @param url JDBC URL to connect with
     * @param username PostgreSQL username
     * @param password PostgreSQL password
     * @throws DriverNotFoundException if jdbc driver not loadable
     */
    public PgNotificationPoller(String url, String username, String password) {
        this();
        setConnectionProperties(url, username, password);
    }

    /**
     * Request a change of connection details, using the new parameters passed.
     *
     * If the new parameters differ from those the current connection (if any)
     * is using, the current connection (if any) will be dropped and the
     * poller will begin trying to establish a new connection if the target
     * status is LISTENING.
     *
     * This call does not change the target status, so the poller will remain
     * stopped if stop() has been called or it has never been started.
     *
     * @warning A call to this method may cause notifications to be missed during the connection change-over.
     *
     * @param url JDBC URL to connect with
     * @param map JDBC properties map to use for credentials and conn params
     */
    public void setConnectionProperties(String url, Properties map) {
        if (map == null)
            throw new NullPointerException("Connection properties map may not be null");
        if (url == null) {
            throw new NullPointerException("URL may not be null");
        }
        poller.setNewConnectionProperties(url, map);
        start();
    }

    /**
     * As setConnectionProperties(String url, Properties map) but with username
     * and password supplied directly instead of via the properties map.
     *
     * @warning A call to this method may cause notifications to be missed during the connection change-over.
     *
     * @param url JDBC URL to connect with
     * @param username PostgreSQL username
     * @param password PostgreSQL password
     */
    public void setConnectionProperties(String url, String username, String password) {
        Properties props = new Properties();
        if (username != null)
            props.setProperty("user", username);
        if (password != null)
            props.setProperty("password", password);
        setConnectionProperties(url, props);
    }

    /**
     * PgNotificationPoller must periodically check the JDBC connection's receive
     * buffer to see if it has received any notifications. Report how frequently
     * the poller is currently checking for notifications.
     *
     * @see #setPollDelayMs
     *
     * @return delay between polls for notifications, in milliseconds
     */
    public int getPollDelayMs() {
        return pollDelayMs;
    }

    /**
     * PgNotificationPoller must periodically check the JDBC connection's receive
     * buffer to see if it has received any notifications. While this operation
     * doesn't create any client/server communication it's still not entirely free,
     * so the frequency with which notifications are polled for should be adjusted
     * to the app's needs and the rate at which notifications are expected to arrive.
     *
     * @see #getPollDelayMs
     *
     * @param pollDelayMs delay between polls for notifications, in milliseconds
     */
    public void setPollDelayMs(int pollDelayMs) {
        if (pollDelayMs <= 0) {
            throw new IllegalArgumentException("Poll delay must be > 0");
        }
        this.pollDelayMs = pollDelayMs;
    }

    /**
     * How long the poller will wait between reconnect attempts if conn lost.
     *
     * @see #setReconnectDelayMs
     *
     * @return Delay in ms between connect attempts
     */
    public int getReconnectDelayMs() {
        return reconnectDelayMs;
    }

    /**
     * If the poller's connection drops, it will delay a configurable number
     * of milliseconds before each try to re-establish it after the first
     * attempt.
     *
     * @see #getReconnectDelayMs
     *
     * @param delayMs Delay in ms between connect attempts
     */
    public void setReconnectDelayMs(int delayMs) {
        if (delayMs <= 0) {
            throw new IllegalArgumentException("Reconnect delay must be > 0");
        }
        this.reconnectDelayMs = delayMs;
    }

    /**
     * The poller perioidcally checks whether the connection is alive. Report
     * how long it waits between checks.
     *
     * @see #setValidityTestDelayMs
     *
     * @return Delay in ms between connection validity checks
     */
    public int getValidityTestDelayMs() {
        return validityTestDelayMs;
    }

    /**
     * Merely polling for notifications is not sufficient to detect if the
     * connection has broken; an explicit check that produces client/server
     * chat is required.
     *
     * If set to zero, no validity checking is done.
     *
     * The default is 10 seconds.
     *
     * @see #getValidityTestDelayMs
     *
     * @param freqMs Delay in ms between connection validity checks
     */
    public void setValidityTestDelayMs(int delayMs) {
        if (delayMs < 0) {
            throw new IllegalArgumentException("Validity test delay must be >= 0");
        }
        this.validityTestDelayMs = delayMs;
    }

    /**
     * How long to wait before giving up on a validity test.
     *
     * @see #setValidityTestTimeoutSeconds
     *
     * @return how long to wait for connection validity test
     */
    public int getValidityTestTimeoutSeconds() {
        return validityTestTimeoutSeconds;
    }

    /**
     * When testing for connection validity a timeout helps avoid the poller
     * blocking forever on dead tcp/ip connections. This reports how long it
     * waits before giving up on the connection, dropping it, and starting
     * to establish a new one.
     *
     * @see #getValidityTestTimeoutSeconds
     *
     * @param timeout
     */
    public void setValidityTestTimeoutSeconds(int timeout) {
        if (timeout < 0) {
            throw new IllegalArgumentException("Timeout must be >= 0 seconds");
        }
        this.validityTestTimeoutSeconds = timeout;
    }

    /**
     * Ask the poller to poll for notifications as soon as it is next able to.
     * If it's idle and waiting, it will poll immediately, though this call will
     * not block until the poll is completed.
     *
     * Calling pollNow() on a poller in the STOPPED state (whether due to a
     * stop() call, never having been started, or due to a pending reconnect
     * after a connection break) has no effect, and false is returned.
     *
     * @return true if the pollNow request was acted on, false if it could not be
     */
    public boolean pollNow() {
        return poller.pollNow();
    }

    /**
     * Report the current state of the poller.
     *
     * The poller may be trying to (re)connect, in which case its state will
     * be STOPPED even though it's trying to transition to the target state
     * LISTENING. Similarly, if it's just been asked to stop, it might be
     * LISTENING even though it's in the process of switching to STOPPED.
     *
     * getStatus() tells you whether, at this <i>particular instant</i>, the
     * poller is receiving notifications.
     *
     * @return poller status
     */
    public Status getStatus() {
        return poller.status;
    }

    /**
     * Report the status the poller is trying to be in, which may or may not
     * be the same as its currents status.
     *
     * If getTargetStatus() consistently reports listening, but getStatus()
     * consistently reports stopped, it's likely that there's an issue establishing
     * a connection. Check getLastException() for hints on what might be wrong.
     *
     * See getStatus() for details.
     *
     * @see #stop
     * @see #start
     * @see #getStatus
     *
     * @return target status of poller
     */
    public Status getTargetStatus(){
        return poller.pub_targetStatus;
    }

    /**
     * Register an object's interest in hearing about notifications received,
     * poller state changes, and names added to or removed from the list being
     * monitored.
     *
     * @see #removeNotificationListener
     *
     * @param listener New object to receive notification events
     */
    public void addNotificationListener(PgNotificationListener listener) {
        // poller.listeners is thread-safe
        poller.listeners.add(listener);
    }

    /**
     * Remove an object from the list of objects interested in hearing about
     * notification-related events.
     *
     * If the passed object is not in the current listener list, no action
     * is taken.
     *
     * @see #addNotificationListener
     *
     * @param listener Object to stop notifying.
     */
    public void removeNotificationListener(PgNotificationListener listener) {
        // poller.listeners is thread-safe
        poller.listeners.remove(listener);
    }

    /**
     * Clear the list of object to be informed when notifications arrive, state
     * changes, etc.
     *
     * @see #removeNotificationListener
     * @see #addNotificationListener
     */
    public void clearNotificationListeners() {
        // poller.listeners is thread-safe
        poller.listeners.clear();
    }

    /**
     * Add the passed name, which must be a legal PostgreSQL identifier, to the
     * set of notifications that should be LISTENed to.
     *
     * This call won't block waiting for the addition to take effect. Objects
     * listening for notification events will receive a listenersAdded call when
     * the change has been applied by the worker thread. Until then, notifications
     * on this name may not be received.
     *
     * If the target status is STOPPED, this call will not transition it to
     * LISTENING, so it will have no effect until start() is called.
     *
     * @see #unlisten
     * @see #unlistenAll
     * @param name PostgreSQL identifier to LISTEN for notifications on
     */
    public void listen(String name) {
        poller.addListenedName(name);
    }

    /**
     * Remove the passed name from the list of notifications that should be
     * LISTENed to.
     *
     * This call won't block waiting for the removal to take effect. Objects
     * listening for notification events will receive a listenersRemoved call when
     * the change has been applied by the worker thread. It is possible that
     * notifications for this name may be received in the mean time.
     *
     * If the target status is STOPPED, this call will not transition it to
     * LISTENING, so it will have no effect until start() is called.
     *
     * If the name is not currently on the list of names to be listened to,
     * this call has no effect.
     *
     * @see #listen
     * @see #listenAll
     * @param name PostgreSQL identifier to stop listening for notifications on
     */
    public void unlisten(String name) {
        poller.removeListenedName(name);
    }

    /**
     * Remove all names name from the list of notifications that should be
     * LISTENed to, leaving the poller listening for no notifications at all.
     *
     * This call won't block waiting for the removal to take effect. Objects
     * listening for notification events will receive a listenersRemoved call when
     * the change has been applied by the worker thread. It is possible that
     * notifications may be received in the mean time.
     *
     * @see #listen
     * @see #unlisten
     */
    public void unlistenAll() {
        poller.clearListenedNames();
    }

    /**
     * Stop listening for notifications and close down the JDBC connection
     * used for listening.
     *
     * If the target status is already STOPPED, this call has no effect.
     *
     * This call won't block waiting for the change to take effect. Objects
     * listening for notification events will receive a listenersRemoved call
     * and a statusChanged call once the shutdown takes effect. It is possible that
     * notifications may be received in the mean time.
     *
     * @see #getTargetStatus
     */
    public void stop() {
        poller.setTargetStatus(Status.STOPPED);
    }

    /**
     * Begin listening for notification events if not already doing so. If
     * necessary, a new JDBC connection will be created to listen on, using
     * credentials supplied in the ctor or in setCredentials.
     *
     * If the target status is already LISTENING, this call has no effect.
     *
     * @see #getTargetStatus
     */
    public void start() {
        poller.setTargetStatus(Status.LISTENING);
    }

    /**
     * @see PgNotificationExceptionListener
     * @see #setPgNotificationExceptionListener
     * @return current exception listener
     */
    public PgNotificationExceptionListener getPgNotificationExceptionListener() {
        return poller.exceptionListener;
    }

    /**
     * Register an exception listener which will be informed of all
     * SQLExceptions encountered during the operation of the worker
     * thread.
     *
     * It's recommended that you set the listener once during
     * poller setup and leave it.
     *
     * @see PgNotificationExceptionListener
     *
     * @param newExceptionListener
     */
    public void setPgNotificationExceptionListener(PgNotificationExceptionListener newExceptionListener) {
        poller.exceptionListener = newExceptionListener;
    }

    /**
     * Test to see if the JDBC driver is present and loadable, and thow
     * DriverNotFoundException if not.
     *
     * @throws DriverNotFoundException if jdbc driver not loadable
     */
    private void testDriverPresent() {
        try {
            Class.forName(PG_DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            throw new DriverNotFoundException("Couldn't load JDBC driver " + PG_DRIVER_CLASS, e);
        }
    }

    private class ConnectionPoller extends Thread implements PgNotificationHelper.PgNotificationListener {

        // Simple threading rules:
        // If a var is prefixed by `pub' it must only ever be accessed while the ConnectionPoller
        // monitor is held. No database operations may be performed while the ConnectionPoller monitor is held.
        // Variables not prefixed by `pub' must never be updated by direct external triggers such as
        // outside method calls.

        // `status' must only ever be changed by method private and internal to ConnectionPoller and running
        // on the ConnectionPoller thread, or things will break horribly.
        private Status status = Status.STOPPED;
        // targetStatus must only ever be set by outside callers via setTargetStatus(...).
        private Status pub_targetStatus = Status.STOPPED;

        private final Set<PgNotificationListener> listeners = Collections.synchronizedSet( new HashSet<PgNotificationListener>() );
        private final PgNotificationHelper helper = new PgNotificationHelper();
        private JDBCStatementTimeout connValidTimer;
        private Connection conn;
        private Properties connProperties, pub_newConnProperties;
        private String url, pub_newUrl;
        // Timestamps recording last time of poll and last time of reconnect
        // so that we can honour our delay parameters. Note that these get
        // updated even if the attempted operation fails.
        private long lastPollTimeMs, lastReconnectTimeMs, lastValidityTestMs;

        // Object to be told about any SQLExceptions we hit.
        private PgNotificationExceptionListener exceptionListener;

        private final Set<String> pub_namesToListenTo = new HashSet<String>();
        // *ONLY* test or set this while holding the monitor for namesToListenTo
        private boolean pub_namesToListenToChanged = false;

        public ConnectionPoller() {
            super("PgNotificationPoller$ConnectionPoller");
            setDaemon(true);
            helper.addNotificationListener(this);
            lastPollTimeMs = 0;
            lastReconnectTimeMs = 0;
            JDBCStatementTimeoutThread timeoutThread = new JDBCStatementTimeoutThread();
            connValidTimer = timeoutThread;
            timeoutThread.start();
        }

        @Override
        public void run() {
            // Vars to hold copies of state
            boolean needsReconnect, runStart_namesToListenToChanged;
            final Set<String> runStart_namesToListenTo = new HashSet<String>();
            String runStart_url;
            Properties runStart_properties;
            Status runStart_targetStatus;
            // Lifetime loop
            while (true) {
                checkConnWaitTimerStatus();
                // Lock and examine externally-writable state to decide what to do.
                // Some state may need to be copied to permit updates to it
                // to run concurrently with the database work done in this thread.
                synchronized(this) {
                    if (pub_newUrl == null || pub_newConnProperties == null) {
                        // Should never be the case if we're actually run()
                        throw new IllegalStateException("newUrl and/or newConnProperties must never be null if run() called");
                    }
                    // See if there is any work to do, and if there is not, sleep
                    // until there is.
                    needsReconnect = false;
                    runStart_namesToListenToChanged = pub_namesToListenToChanged;
                    // WARNING: runStart_namesToListenTo may not be copied, unless pub_namesToListenToChanged .
                    // otherwise it will be empty and should not be relied on.
                    runStart_namesToListenTo.clear();
                    runStart_url = pub_newUrl;
                    runStart_properties = pub_newConnProperties;
                    runStart_targetStatus = pub_targetStatus;
                    try {
                        if (status == Status.STOPPED && pub_targetStatus == Status.STOPPED) {
                            // We're stopped. Sleep until woken by state change.
                            this.wait();
                            // Re-check to see what to do now
                            continue;
                        } else if (status == Status.STOPPED && pub_targetStatus == Status.LISTENING) {
                            // Needs reconnect, but we're rate limited. Make sure we
                            // sleep to honour the rate limit if needed.
                            needsReconnect = true;
                        } else if (status == Status.LISTENING && pub_targetStatus == Status.STOPPED) {
                            // We've been asked to drop the connection. No sleep needed, continue
                            // execution immediately.
                        } else if (status == Status.LISTENING && pub_targetStatus == Status.LISTENING) {
                            if (  !pub_newUrl.equals(url) || !pub_newConnProperties.equals(connProperties)) {
                                // Have connection properties changed? If so, we'll need to reconnect.
                                needsReconnect = true;
                            } else if (pub_namesToListenToChanged) {
                                // Names to listen to have changed. We'll apply the changes
                                // immediately without waiting the poll delay.
                                //
                                // First, copy names to listen to to reflect current state
                                runStart_namesToListenTo.addAll(pub_namesToListenTo);
                                // Now that we've recorded our intentions, we can mark that
                                // we've seen the changes so far. If something goes
                                // wrong acting on them, we'll relisten() or reconnect,
                                // so the helper will get updated one way or the other.
                                pub_namesToListenToChanged = false;
                            } else {
                                // We're just polling. Delay if necessary before executing poll.
                                long delayMs = (lastPollTimeMs + pollDelayMs) - System.currentTimeMillis();
                                if (delayMs > 0) {
                                    this.wait(delayMs);
                                    // Make sure nothing has changed while we waited,
                                    // such as a pollNow() call or the like.
                                    continue;
                                }
                            }
                        } else {
                            // Unreachable without coding error
                            throw new IllegalStateException("Unreachable code reached, programmer error - new state(s) added?");
                        }
                        if (needsReconnect) {
                            long delayMs = (lastReconnectTimeMs + reconnectDelayMs) - System.currentTimeMillis();
                            if (delayMs > 0) {
                                // Make sure nothing has changed while we waited
                                this.wait(delayMs);
                                continue;
                            }
                        }
                    } catch (InterruptedException e) {
                        // We were woken by something. Re-check state.
                        continue;
                    }

                } // end of synchronized(this) block

                // (From here on, we no longer hold our monitor and may *NOT*
                // safely access the pub_ variables).
                // We're now acting on our earlier decisions. If the public
                // state changes we won't know, and it's too late to do anything
                // about it. It'll get caught next go-around.

                if (needsReconnect) {
                    // By clearing the connection we'll ensure that
                    // status is Status.STOPPED if it wasn't already.
                    clearConnection();
                }
                // Now see if we need to drop the connection or to connect
                // (in the latter case, possibly due to just having dropped
                // the connection above).
                if (status != runStart_targetStatus) {
                    switch (runStart_targetStatus) {
                        case LISTENING:
                            if (status == Status.STOPPED) {
                                connect(runStart_url, runStart_properties);
                            }
                            break;
                        case STOPPED:
                            if (status == Status.LISTENING) {
                                clearConnection();
                            }
                            break;
                    }
                }
                // Now, if we're in the target status (possibly due to work
                // just done above), perform the real work.
                if (status == runStart_targetStatus) {
                    switch (status) {
                        case LISTENING:
                            if ( validityTestDelayMs > 0 && (System.currentTimeMillis() - lastValidityTestMs > validityTestDelayMs) ) {
                                // Time to make sure the connection is still here
                                if (!testConnection()) {
                                    // Connection is broken and has been cleared, return to go and do not collect $200
                                    continue;
                                }
                            }
                            if (runStart_namesToListenToChanged) {
                                updateListeners(runStart_namesToListenTo);
                            }
                            // Now, if we didn't break something by updating listeners, poll()
                            if (status == Status.LISTENING)
                                poll();
                            break;
                        case STOPPED:
                            /* do nothing */
                            break;
                    }
                }
            }
        }

        //------------------ THE FOLLOWING MAY *ONLY* BE CALLED FROM THE ConnectionPoller thread ------------------//

        private void reportSQLException(String msg, SQLException e) {
            final PgNotificationExceptionListener el = exceptionListener;
            if (el != null) {
                el.sqlExceptionEncountered(PgNotificationPoller.this, conn, msg, e);
            }
        }

        private void reportListenerException(String msg, PgNotificationListener l, Throwable e) {
            final PgNotificationExceptionListener el = exceptionListener;
            if (el != null) {
                el.listenerExceptionEncountered(PgNotificationPoller.this, msg, l, e);
            }
        }

        // Returns true if ok, false if problem
        // not synchronized, must not access pub members
        private boolean poll() {
            assert(status == Status.LISTENING);
            assert(Thread.currentThread().equals(this));
            try {
                lastPollTimeMs = System.currentTimeMillis();
                helper.poll(conn, true);
                return true;
            } catch (SQLException e) {
                reportSQLException("Polling for notifications failed, will try to reconnect", e);
                return false;
            }
        }

        // Returns true if ok, false if problem
        // not synchronized, must not access pub members
        private boolean testConnection() {
            assert(status == Status.LISTENING);
            assert(Thread.currentThread().equals(this));
            lastValidityTestMs = System.currentTimeMillis();
            if (isConnValid(validityTestTimeoutSeconds)) {
                return true;
            }
            clearConnection();
            return false;
        }

        private void checkConnWaitTimerStatus() {
            assert(Thread.currentThread().equals(this));
            // Ensure that no statement is being waited on. If there is one,
            // something has gone horribly wrong, since this should only be
            // called from run() when we're clean and about to go around again.
            assert( ! connValidTimer.isWaiting() );
        }


        /**
         * Test if the connection is valid and return true if so.
         *
         * Should use Connection.isValid() ... if Pg actually implemented it.
         *
         * @param timeoutSeconds delay before giving up on connection
         * @return true if test statement succeeded, false if failed or timeout
         */
        private boolean isConnValid(int timeoutSeconds) {
            assert(Thread.currentThread().equals(this));
            if (conn == null)
                return false;
            try {
                final Statement stmt = conn.createStatement();
                connValidTimer.statementStarting(stmt, timeoutSeconds);
                try {
                    stmt.execute("SELECT 1;");
                } finally {
                    SQLException exc = connValidTimer.statementDone(stmt);
                    stmt.close();
                    if (exc != null) {
                        reportSQLException("Error cancelling timed-out connection validity test statement", exc);
                    }
                }
                return true;
            } catch (SQLException e) {
                reportSQLException("Connection validity test statement failed", e);
                return false;
            }
        }

        // always succeeds in clearing connection
        // not synchronized, must not access pub members
        private void clearConnection() {
            assert(Thread.currentThread().equals(this));
            ///try {
                //helper.setConnection(null);
            //} catch (SQLException e) {
            //    reportSQLException("Problem while unlistening from probably broken connection", e);
            ///}
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                reportSQLException("Problem while closing probably broken connection", e);
            }
            conn = null;
            setStatus(Status.STOPPED);
        }

        // not synchronized, must not access pub members
        private void connect(String newUrl, Properties newProperties) {
            assert(Thread.currentThread().equals(this));
            if (conn != null)
                clearConnection();
            try {
                assert(status == Status.STOPPED);
                lastReconnectTimeMs = System.currentTimeMillis();
                conn = DriverManager.getConnection(newUrl, newProperties);
                conn.setAutoCommit(true);
                conn.setReadOnly(true);
                conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
                // Will relisten as part of connect
                //helper.setConnection(newUrl, newProperties);
                //helper.
                // xapiens
                url = newUrl;
                connProperties = newProperties;
                setStatus(Status.LISTENING);
            } catch (SQLException e) {
                reportSQLException("Could not connect to listening channel", e);
                // Do nothing. Our status hasn't changed, and we'll try
                // to reconnect again in a bit.
            }
        }

        // not synchronized, must not access pub members
        private void setStatus(final Status newStatus) {
            assert(Thread.currentThread().equals(this));
            final Status oldStatus = status;
            this.status = newStatus;
            notifyStatusListeners(oldStatus, newStatus);
        }

        private void notifyStatusListeners(final Status oldStatus, final Status newStatus) {
            assert(Thread.currentThread().equals(this));
            final Status targetStatus = pub_targetStatus;
            if (oldStatus != newStatus) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        for (PgNotificationListener l : listeners) {
                            try {
                                l.pollerStatusChanged(PgNotificationPoller.this, oldStatus, newStatus, targetStatus);
                            } catch (Throwable t) {
                                reportListenerException("PgNotificationListener.pollerStatusChanged(...)", l, t);
                            }
                        }
                    }
                });
            }
        }



        //@Override xapiens
        public void listenersAdded(PgNotificationHelper helper, final Collection<String> names) {
            assert(Thread.currentThread().equals(this));
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    for (PgNotificationListener l : listeners) {
                        try {
                            l.listenersAdded(PgNotificationPoller.this, names);
                        } catch (Throwable t) {
                            reportListenerException("PgNotificationListener.listenersAdded(...)", l, t);
                        }
                    }
                }
            });
        }

        //@Override
        // xapiens
        public void listenersRemoved(PgNotificationHelper helper, final Collection<String> names) {
            assert(Thread.currentThread().equals(this));
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    for (PgNotificationListener l : listeners) {
                        try {
                            l.listenersRemoved(PgNotificationPoller.this, names);
                        } catch (Throwable t) {
                            reportListenerException("PgNotificationListener.listenersRemoved(...)", l, t);
                        }
                    }
                }
            });
        }

        // returns true if all ok, false if conn problem
        // not synchronized, must not access pub members
        private boolean updateListeners(Set<String> namesToListenTo) {
            assert(status == Status.LISTENING);
            assert(Thread.currentThread().equals(this));
            // Copy and clear records of what to do next
            Set<String> toAdd = null, toRemove = null;
            boolean clearAll = false;
            if (namesToListenTo.isEmpty()) {
                clearAll = true;
            } else {
                toAdd = new HashSet<String>(namesToListenTo);
                toAdd.removeAll(helper.getListenedNames());
                toRemove = new HashSet<String>(helper.getListenedNames());
                toRemove.removeAll(namesToListenTo);
            }
            // then update the helper, now that we've released the namesToListenTo lock
            // and can thus perform database work without blocking anybody trying
            // to change the list of names to listen to.
            try {
                if (clearAll) {
                    // xapiens
                    helper.unlistenAll(conn);
                } else {
                    for (String l : toRemove) {
                       helper.unlisten(conn,l);
                    }
                    for (String l : toAdd) {
                       helper.listen(conn, l);
                    }
                }
            } catch (SQLException e) {
                // Something went wrong while doing our update work.
                reportSQLException("Failed to update listens on helper, trying to relisten", e);
                // Reset the helper to a clean state, supplying the list of names
                // we expect it to have since we don't know what state it landed up in.
                try {
                    // TODO: Be smarter with notifications here
                    // TODO: Notify people here
                    helper.relisten(conn, namesToListenTo);
                } catch (SQLException e2) {
                    reportSQLException("Failed to relisten(), re-setting connection. Notify events may be lost.", e2);
                    clearConnection();
                    return false;
                }
            }
            return true;
        }



        //------------------ THE FOLLOWING MAY *NOT* BE CALLED FROM THE ConnectionPoller thread ------------------//

        /**
         * Tell the poller that its desired status has changed.
         * @param newStatus New status to seek
         */
        public synchronized void setTargetStatus(Status newStatus) {
            assert(!Thread.currentThread().equals(this));
            this.pub_targetStatus = newStatus;
            notifyAll();
        }

        /**
         * Inform the poller that the desired connection properties have
         * changed. If the new and old properties actually differ, this will
         * trigger a reconnect.
         *
         * @param map New properties map, which is copied for storage
         */
        public synchronized void setNewConnectionProperties(String url, Properties map) {
            assert(!Thread.currentThread().equals(this));
            this.pub_newUrl = url;
            this.pub_newConnProperties = copyPropertiesIncludingDefaults(map);
        }

        public synchronized void addListenedName(String name) {
            assert(!Thread.currentThread().equals(this));
            pub_namesToListenTo.add(name);
            pub_namesToListenToChanged = true;
        }

        public synchronized void removeListenedName(String name) {
            assert(!Thread.currentThread().equals(this));
            pub_namesToListenTo.remove(name);
            pub_namesToListenToChanged = true;
        }

        public synchronized void clearListenedNames() {
            assert(!Thread.currentThread().equals(this));
            pub_namesToListenTo.clear();
            pub_namesToListenToChanged = true;
        }

        public synchronized boolean pollNow() {
            lastPollTimeMs = 0;
            notifyAll();
            return status == Status.LISTENING;
        }

        //------------------ The following may be called from any thread ------------------//
        // They must not modify any locals at all and must not even access them unless
        // they are guaranteed thread-safe, like `listeners'.

        @Override
        public void notified(PgNotificationHelper helper, final long receivingBackendPid, final List<PGNotification> notices) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    for (PgNotificationListener l : listeners) {
                        try {
                            l.notified(PgNotificationPoller.this, receivingBackendPid, notices);
                        } catch (Throwable t) {
                            reportListenerException("PgNotificationListener.notified(...)", l, t);
                        }
                    }
                }
            });
        }

        public void listenersAdded(PgNotificationHelper helper, Connection conn, Collection<String> names) {
            listenersAdded(helper, names);
        }

        public void listenersRemoved(PgNotificationHelper helper, Connection conn, Collection<String> names) {
            throw new UnsupportedOperationException("Not supported yet.");
        }


    }


    /**
     * Copy the properties map `input' into a new properties map.
     * Any default properties maps are merged into the new map first, so that
     * the returned map is a single properties map containing all the properties
     * of the whole defaults inheritance tree.
     *
     * The result from calling getProperty(...) on the new map will be the same
     * as on the old map.
     *
     * This operation is really, really not fast.
     *
     * @param input
     * @return
     */
    private static Properties copyPropertiesIncludingDefaults(Properties input) {
        Properties newProps = new Properties();
        for (Enumeration e = input.propertyNames(); e.hasMoreElements(); ) {
           final String key = (String) e.nextElement();
           newProps.setProperty(key, input.getProperty(key));
        }
        return newProps;
    }

}