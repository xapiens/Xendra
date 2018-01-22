package org.xendra.db;

import java.sql.SQLException;
import java.sql.Statement;
 
/**
 * A fairly stupid statement timeout class, capable of tracking
 * only one statement at a time.
 *
 * @author Craig Ringer <ringerc@gmail.com>
 */
public class JDBCStatementTimeoutThread extends Thread implements JDBCStatementTimeout {
 
    private Statement waitingFor;
    private SQLException lastException;
    long timeRemainingMs;
    long endMillis;
 
    public JDBCStatementTimeoutThread() {
        setName(JDBCStatementTimeoutThread.class.getName());
        setDaemon(true);
    }
 
    @Override
    public synchronized void run() {
        while (true) {
            try {
                wait();
            } catch (InterruptedException e) {
                // re-check if there's something to do and reloop if not
            }
            while (waitingFor != null && timeRemainingMs >= 0) {
                timeRemainingMs = endMillis - System.currentTimeMillis();
                try {
                    wait(timeRemainingMs);
                } catch (InterruptedException e) {
                    // recheck and continue
                }
            }
            lastException = null;
            // done waiting or interrupted. Did we time out, or did the task finish?
            if (waitingFor != null) {
                // whoops, timeout!
                try {
                    try {
                        waitingFor.cancel();
                    } finally {
                        waitingFor = null;
                    }
                } catch (SQLException e) {
                    // Not running on the main worker thread so we can't
                    // safely call reportSQLException(...). Note it down
                    // so the main worker thread can check and report
                    // it later.
                    lastException = e;
                }
            }
        }
    }
 
    @Override
    public synchronized void statementStarting(final Statement stmt, final int timeoutSeconds ) {
        if (waitingFor != null)
            throw new IllegalStateException("Already waiting for completion of statement " + waitingFor);
        waitingFor = stmt;
        timeRemainingMs = timeoutSeconds * 1000;
        endMillis = System.currentTimeMillis() + timeRemainingMs;
        notifyAll();
    }
 
    @Override
    public synchronized SQLException statementDone(Statement stmt) {
        if (waitingFor != null && waitingFor != stmt) {
            throw new IllegalStateException("Statement reported as done, " + stmt + ", was not statement waited for " + waitingFor);
        }
        SQLException lastExc = lastException;
        waitingFor = null;
        lastException = null;
        notifyAll();
        return lastExc;
    }
 
    @Override
    public boolean isWaiting() {
        return waitingFor != null;
    }
 
}