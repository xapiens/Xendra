package org.xendra.xendrian;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class ExampleListener implements ExceptionListener
{
   protected static String lastMessage = null;
private IListener m_connection;

   public ExampleListener(IListener sales) {
	m_connection = sales;
}

public void onException(final JMSException exception)
   {
      try
      {
    	  m_connection.close();
      }
      catch (Exception e)
      {
         //ignore
      }
      for(int i = 0; i < 10; i++)
      {
         try
         {
        	 m_connection.bootstrap();
            // Step 7. The ExceptionListener gets called and we recreate the JMS objects on the new node

            System.out.println("Connection failure has been detected on a the client.");

            // Close the old resources

            // closeResources();

            System.out.println("The old resources have been closed.");

            // Create new JMS objects on the backup server

            //createJMSObjects(1);

            System.out.println("The new resources have been created.");

            //failoverLatch.countDown();

            return;
         }
         catch (Exception e)
         {
            System.out.println("Failed to handle failover, trying again.");
            try
            {
               Thread.sleep(500);
            }
            catch (InterruptedException e1)
            {
               //ignored
            }
         }
      }
      System.out.println("tried 10 times to reconnect, giving up");
   }
}