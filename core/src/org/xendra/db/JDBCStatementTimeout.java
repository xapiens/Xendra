package org.xendra.db;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * A service capable of registering a statement for cancellation after
 * a timeout and of later cancelling that timer if informed that the
 * statement has finished.
 *
 * @author Craig Ringer <ringerc@gmail.com>
 */
public interface JDBCStatementTimeout {
 
    /**
     * Start waiting on the statement `stmt'.
     * 
     * @param stmt Wait for this statement to finish
     * @param timeoutSeconds for this long
     */
    void statementStarting(final Statement stmt, final int timeoutSeconds );
 
    /**
     * Report that the statement `stmt' has finished or failed. It may have
     * failed due to our own cancellation request. 
     *
     * @param stmt Statement to remove from waiting list
     * @return null unless task was cancelled and cancellation threw, in which case that exception
     */
    SQLException statementDone(Statement stmt);
 
    /**
     * @return true if and only if waiting for one or more statements
     */
    boolean isWaiting();
 
 
}