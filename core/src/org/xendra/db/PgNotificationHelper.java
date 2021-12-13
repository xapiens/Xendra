/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.xendra.db;

/**
 *
 * @author xapiens
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.compiere.util.CLogger;
import org.postgresql.PGConnection;
import org.postgresql.PGNotification;

/**
 * Use a supplied JDBC connection to a PostgreSQL database, LISTENING for
 * events of interest and reporting events communicated by the database
 * with NOTIFY via a Java listener interface.
 *
 * The PgNotificationHelper doesn't keep a reference to the connection,
 * as it's expected that you may be borrowing it from the connection pool
 * for use by the helper. However, it does expect that you will pass the
 * SAME connection to PgNotificationHelper each call. If you want to change
 * connections, you will need to call relisten() on the new connection to
 * bring the connection into sync with PgNotificationHelper's expectations.
 *
 * If you use PgNotificationHelper on a connection, you should not
 * use any LISTEN or UNLISTEN commands on it directly yourself.
 * PgNotificationHelper may UNLISTEN your notification requests if
 * you call relisten() or change the connection, since it will re-sync
 * the server listen list with its own at that point.
 *
 * Polling isn't done directly by PgNotificationHelper. You should
 * use an appropriate timer to take care of it. Be sure to protect the
 * connection against concurrent use if you're using a timer or thread
 * to poll.
 *
 * Notification listeners are called on the thread the PgNotificationHelper's
 * poll() method was invoked on. If you need them called on the EDT you'll
 * need to do it yourself via EventQueue.invokeLater(...) or similar. Alternately,
 * use PgNotificationPoller, which takes care of this and much more at the cost
 * of removing the JDBC connection from your control.
 *
 * PgNotificationHelper will pass on any SQLExceptions thrown during its work.
 * Each method is documented to indicate what state the class is left in if
 * an SQLException is thrown.
 *
 * If a listen() or unlisten() call fails with an SQLException, the requested
 * names will have been added to or removed from the list the PgNotificationHelper
 * is maintaining, and will be returned by getListenedNames(). However, the actual
 * database listening state is unknown - and it's highly likely no notifications
 * are being received at all. You should call relisten() to try to reset the
 * listening state of the connection and update it to match the list of names
 * in PgNotificationHelper. If that fails, as it is likely to, you will probably
 * need to supply a new connection as the old one is most likely broken/unusable.
 *
 * @author Craig Ringer <ringerc@gmail.com>
 */
//
// We don't impose our own synchronization as it can't be done completely and
// reliably - there's no way to prevent concurrent use of the JDBC connection.
// User is responsible.
//
public class PgNotificationHelper{

    private final Set<String> listenedNames = new HashSet<String>();
    private final List<PgNotificationListener> listeners = new ArrayList();

    /*
     * Create an empty helper without any associated connection. It will not
     * be usable until you call setConnection(...).
     *
     * This call does not do any database work and will not block.
     */
    public PgNotificationHelper() {
    }

    /**
     * Begin LISTENing on `name' by issuing a LISTEN statement to the backend.
     *
     * @param name new name to listen on, which must be a legal PostgreSQL identifier.
     * @throws SQLException if execution of the LISTEN statement throws. See class doc.
     */
    public void listen( Connection conn, String name) throws SQLException {
        listenedNames.add(name);
        sendListens( conn, Arrays.asList(name) );
    }

    /**
     * Begin LISTENing on `name'(s) by issuing a LISTEN statement to the backend for each one
     *
     * @param name new name to listen on, which must be a legal PostgreSQL identifier.
     * @throws SQLException if execution of the LISTEN statement throws. See class doc.
     */
    public void listen(Connection conn, Collection<String> names) throws SQLException {
        listenedNames.addAll(names);
        sendListens( conn, names );
    }

    /**
     * Stop LISTENing on `name' by issuing an UNLISTEN to the backend.
     *
     * Calling UNLISTEN on name(s) that are not being listened to is safe, and
     * has no effect.
     *
     * @param name name to unlisten from, which must be a legal PostgreSQL identifier.
     * @throws SQLException if execution of the UNLISTEN statement throws. See class doc.
     */
    public void unlisten(Connection conn, String name) throws SQLException {
        listenedNames.remove(name);
        sendUnlistens( conn, Arrays.asList(name) );
    }

    /**
     * Stop LISTENing on `name'(s) by issuing an UNLISTEN to the backend for each one.
     *
     * Calling UNLISTEN on name(s) that are not being listened to is safe, and
     * has no effect.
     *
     * @param name name to unlisten from, which must be a legal PostgreSQL identifier.
     * @throws SQLException if execution of the UNLISTEN statement throws. See class doc.
     */
    public void unlisten( Connection conn, Collection<String> names) throws SQLException {
        listenedNames.removeAll(names);
        sendUnlistens( conn, names );
    }

    /**
     * Send a NOTIFY on `name' via the JDBC connection.
     *
     * If this PgNotificationListener is listening on `name',
     * it will receive its own notification.
     *
     * @param name to send NOTIFY for
     * @throws SQLException if the NOTIFY statement failed to execute or statement close failed
     */
    public void sendNotify(Connection conn, String name) throws SQLException {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            stmt.execute("NOTIFY " + name + ";");
        } finally {
            if (stmt != null)
                stmt.close();
        }
    }

    /**
     * Call UNLISTEN on all names the connection is currently listening on.
     * No more notifications will be received after the next poll(), and
     * getListenedNames() will return the empty set.
     *
     * @throws SQLException if execution of any statement on the connection fails
     */
    public void unlistenAll(Connection conn) throws SQLException {
        listenedNames.clear();
        relisten(conn);
    }

    /**
     * Update the database's list of names being listened to to match that
     * of PgNotificationHelper by issuing appropriate LISTEN and UNLISTEN
     * statements.
     *
     * Gets the list of names the backend is LISTENing for notifications on,
     * compares it to the result of getListenedNames(), and issues appropriate
     * LISTEN and UNLISTEN statements to bring the database into sync with the
     * local list.
     *
     * No notifications will be lost, as individual LISTEN and UNLISTEN
     * calls will be issued to update the database listening status to
     * match that of PgNotificationHelper. UNLISTEN * is never used.
     *
     * @throws SQLException
     */
    public void relisten(Connection conn) throws SQLException {
        //Set<String> dbListenedNames = getDbListenedNames(conn);
        // find the names we must listen() to, ie all names in listenedNames
        // that we're not already listening to.
        Set<String> namesToAdd = new HashSet<String>(listenedNames);
        //namesToAdd.removeAll(dbListenedNames);
        sendListens( conn, namesToAdd );
        // find the names we must unlisten() from, ie all names we're listening
        // to that are NOT in listenedNames.
        //dbListenedNames.removeAll(listenedNames);
        //sendUnlistens( conn, dbListenedNames );
    }

    /**
     * Replace the list of listened-to names entirely. Any names currently being
     * listened to, but that do not appear in `newListenedNames', will be UNLISTENed.
     *
     * No notifications will be lost, as individual LISTEN and UNLISTEN
     * calls will be issued to update the database listening status to
     * match that of PgNotificationHelper. UNLISTEN * is never used.
     *
     *
     * If this method throws, the new list of names will have been stored in
     * PgNotificationHelper and will be used from now on, but the listening state
     * of the connection its self will be unknown. It is highly likely that the
     * connection is broken and is not receiving notifications. It should be
     * replaced with a fresh, usable connection by calling setConnection(...).
     *
     * @param newListenedNames New set of names to listen to
     * @throws SQLException thrown by any JDBC call on the connection during relisten()
     */
    public void relisten(Connection conn, Collection<String> newListenedNames) throws SQLException {
        this.listenedNames.clear();
        this.listenedNames.addAll(newListenedNames);
        relisten(conn);
    }

    /**
     * Check for notifications.
     *
     * If you're using a pre-8.x JDBC driver you must issue some kind
     * of dummy query on the connection before calling poll() to get any
     * results.
     *
     * @warning a poll call will <i>not</i> detect a broken connection, as no
     *          client->server communication is initiated. Additionally, the
     *          JDBC driver doesn't check the status of the TCP/IP socket from
     *          PgConnection.getNotifications(...) so it won't notice if it's
     *          been closed by the remote end.
     *
     * @param conn Connection to poll on
     * @param pg_backend_pid process ID of backend associated with conn
     * @param useDummyStatement whether to send a dummy statement before checking for notifications
     * @throws SQLException if something broke
     */
    // see http://jdbc.postgresql.org/documentation/84/listennotify.html
    public void poll(Connection conn, boolean useDummyStatement) throws SQLException { //, long pg_backend_pid, boolean useDummyStatement) throws SQLException {
        if ( useDummyStatement ) {
           Statement stmt = conn.createStatement();
            try {
                // It is *VITAL* that this statement not fail, and not affeect the
                // connection state in any way. Otherwise, if we're borrowing this
                // connection while someone else is using it for other work we might
                // cause some major chaos.
                //
                // Thankfully, the backend will notice an empty statement, and
                // respond with an "empty statement" message at the protocol level.
                // No query gets logged, and no snapshot gets created, but it's not
                // an error.
                //
                stmt.execute("SELECT 1");
            } finally {
                stmt.close();
            }
        }
        PGNotification notifications[];
        try {
            notifications = ((PGConnection) conn).getNotifications();
            if (notifications != null) {
                List<PGNotification> notificationView = Collections.unmodifiableList(Arrays.asList(notifications));
                for (PgNotificationListener l : listeners) {
                    // xapiens
                    l.notified(this, 0, notificationView);
                }
            }
        } catch (SQLException ex) {
            CLogger.getCLogger(PgNotificationHelper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Register an object as interested in hearing about received NOTIFY events from the database
     *
     * This call does not do any database work and will not block.
     *
     * @param listener object that should receive notification callbacks
     */
    public void addNotificationListener(PgNotificationListener listener) {
        if (listener == null)
            throw new NullPointerException("Listener may not be null");
        listeners.add(listener);
    }

    /**
     * Remove an object from the list of objects interested in hearing about NOTIFY events from the database.
     *
     * If the object isn't in the list, no action is taken.
     *
     * This call does not do any database work and will not block.
     *
     * @param listener Object to stop sending callbacks to
     */
    public void removeNotificationListener(PgNotificationListener listener) {
        if (listener == null)
            throw new NullPointerException("Listener may not be null");
        listeners.remove(listener);
    }

    /**
     * Remove all objects from the list of objects interested in hearing about NOTIFY events.
     *
     * This call does not do any database work and will not block.
     */
    public void clearNotificationListeners() {
        listeners.clear();
    }

    /**
     * PgNotificationHelper manages a set of names that it should be listening
     * to. Unless you've caught an exception from database operations, this set
     * is the same as the list of names PostgreSQL is listening for NOTIFY events on.
     *
     * getListenedNames() returns a read-only view of that set.
     *
     * This call does not do any database work and will not block.
     *
     * @return a read-only view of the set of currently listened-to names
     */
    public Set<String> getListenedNames() {
        return Collections.unmodifiableSet(listenedNames);
    }

//    /**
//     * Get a list of the names the database has us on record as
//     * listening to. The set should have the same contents as
//     * that returned by getListenedNames() ... but beware of
//     * PostgreSQL's case folding of identifiers.
//     *
//     * Reads the set of names the database is currently listing to from the
//     * pg_catalog.pg_listener view.
//     *
//     * @return Name list from pg_catalog.pg_listener
//     */
//    public Set<String> getDbListenedNames(Connection conn) throws SQLException {
//        Set<String> names = new HashSet<String>();
////        Statement stmt = null;
////        try {
////            stmt = conn.createStatement();
////            ResultSet rs = stmt.executeQuery("SELECT relname FROM pg_catalog.pg_listener WHERE listenerpid = pg_backend_pid();");
////            while (rs.next()) {
////                names.add(rs.getString(1));
////            }
////            rs.close();
////        } finally {
////            stmt.close();
////        }
//        return names;
//    }

    /**
     * LISTEN to the passed name list.
     *
     * Does not affect listenedNames.
     *
     * @param names names to send LISTENs on
     * @throws SQLException
     */
    private void sendListens(Connection conn, Collection<String> names) throws SQLException {
        if (names.isEmpty())
            return;
        sendListenControlCommands( conn, Collections.unmodifiableCollection(names), true);
    }

    /**
     * UNLISTEN from the passed name list.
     *
     * Does not affect listenedNames.
     *
     * @param names names to send UNLISTENs on
     * @throws SQLException
     */
    private void sendUnlistens(Connection conn, Collection<String> names) throws SQLException {
        if (names.isEmpty())
            return;
        sendListenControlCommands( conn, Collections.unmodifiableCollection(names), false);
    }

    /**
     * Issues LISTEN or UNLISTEN commands on the passed names then informs
     * any objects on the notification recipient list of the change in
     * listened names.
     *
     * Does not affect listenedNames.
     *
     * @param names Names to listen to / unlisten from
     * @param shouldListen true to LISTEN, false to UNLISTEN
     * @throws SQLException if something breaks
     */
    private void sendListenControlCommands(Connection conn, Collection<String> names, final boolean shouldListen) throws SQLException {
        assertSafeIdentifiers(names);
        final Statement stmt = conn.createStatement();
        final String cmd = shouldListen ? "LISTEN " : "UNLISTEN ";
        try {
            for (String name : names) {
                stmt.addBatch(cmd + name);
            }
            stmt.executeBatch();
        } finally {
            if (stmt != null)
                stmt.close();
        }
        for (PgNotificationListener l : listeners) {
            // WARNING listeners must not throw!
            if (shouldListen) {
                l.listenersAdded(this, conn, names);
            } else {
                l.listenersRemoved(this, conn, names);
            }
        }
    }

    private void assertSafeIdentifiers(Collection<String> names) throws IllegalArgumentException {
        // Doesn't try to ensure that the identifier is valid, only that it's
        // safe to send.
        boolean ok;
        for (String n : names) {
            ok = n.indexOf(';') == -1;
            if (!ok)
                throw new IllegalArgumentException("Name \"" + n + "\" is not a valid identifier for LISTEN");
        }
    }

    /**
     * Listener interface to be implemented by classes that are interested
     * in hearing about PostgreSQL `NOTIFY' events.
     *
     * Your listeners must never throw, or they will interfere with
     * event dispatch to other listeners.
     */
    public interface PgNotificationListener {

        /**
         * Reports that a NOTIFY event has been received.
         *
         * Self-notifications will be delivered, so if you wish to exclude them
         * or identify them, test `receivingBackendPid' against
         * `PGNotification.getPid()' for each notification to see if the sending
         * and receiving backend pid are the same.
         *
         * @param poller Helper that received the NOTIFY
         * @param receivingBackendPid pid of backend that recieved the notification. Test against notices.getPid() to eliminate self notifications.
         * @param notices Notification events
         */

        void notified( PgNotificationHelper helper, long receivingBackendPid, List<PGNotification> notices );

        /**
         * A LISTEN has been executed on the database, and NOTIFY events for that
         * name will now be received.
         *
         * listenersAdded will be called if a new connection has been
         * supplied and has just been listened on. In this case names were
         * already on the list of names to listen to, but a new LISTEN was
         * just issued for each. If the old connection was broken it's possible
         * that notifications were lost during the gap, so the app may need
         * to act on that.
         *
         * @param poller Poller that added the listen
         * @param names Read-only list of name(s) newly LISTENed
         */
        void listenersAdded( PgNotificationHelper helper, Connection conn, Collection<String> names );

        /**
         * An UNLISTEN has been executed on the database, and NOTIFY events for that
         * name will no longer be received.
         *
         * '*' will never be passed as a name. Instead, individual
         * listenRemoved(...) calls will be made.
         *
         * listenersRemoved will <b>not</b> be called if the connection has been
         * lost. This means that listenersRemoved isn't perfectly symmetric with
         * listenersAdded. If the connection is dropped, listenersRemoved will
         * not be called but listenersAdded will be.
         *
         * @param poller Poller that added the listen
         * @param names Read-only list of name(s) newly UNLISTENed
         */
        void listenersRemoved( PgNotificationHelper helper, Connection conn, Collection<String> names );
    }
}