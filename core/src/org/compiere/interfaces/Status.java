package org.compiere.interfaces;

/**
 * Tnterface for xendra/Status.
 */
public interface Status
{
   public final static String dbhost =	"host";
   public final static String dbbackuphost = "backuphost";
   public final static String dbport = "dbport";
   public final static String dbbackupport = "backupdbport";
   public final static String dbName = "dbname";
   public final static String dbuid  = "dbuid";
   public final static String dbpwd  = "dbpwd";
   public final static String poolclient  = "poolclient";
   public final static String date_version = "date_version";
   //public final static String machineserial = "machineserial";

   public final static String JMS_NAME="jms/queue/HolonQueue";
   //public final static String JMS_NAME="jms/queue/test";
   public final static String JNDI_NAME="xendra/Status";
   
   public final static String EJB_NAME="xendraStatus";
   
   /**
    * Get Version (Date)
    * @return version e.g. 2002-09-02    */
   public String getDateVersion(  );

   /**
    * Get Main Version
    * @return main version - e.g. Version 2.4.3b    */
   public String getMainVersion(  );

//   /**
//    * Get Database Type
//    * @return Database Type    */
//   public String getDbType(  );

   /**
    * Get JMS Queue for POS
    * @return JMS Queue String for POS    */ 
   public String getPoolServer(  );
   public String getPoolClient(  );
   /**
    * Get Database Host
    * @return Database Host Name    */
   public String getDbHost(  );

   /**
    * Get Backup Database Host
    * @return Backup Database Host Name    */
   public String getBackupDbHost(  );
  
   /**
    * Get Database Port
    * @return Database Port    */
   public int getDbPort(  );

   /**
    * Get Backup Database Port
    * @return Backup Database Port    */
   public int getBackupDbPort(  );
   
   /**
    * Get Database SID
    * @return Database SID    */
   public String getDbName(  );

   /**
    * Get Database URL
    * @return Database URL    */
   public String getConnectionURL(  );

   /**
    * Get Database UID
    * @return Database User Name    */
   public String getDbUid(  );

   /**
    * Get Database PWD
    * @return Database User Password    */
   public String getDbPwd(  );

   /**
    * Get Version Count
    * @return number of version inquiries    */
   public int getVersionCount(  );

   /**
    * Get Database Count
    * @return number of database inquiries    */
   public int getDatabaseCount(  );

   /**
    * Describes the instance and its content for debugging purpose
    * @return Debugging information about the instance and its content    */
   public String getStatus(  );
}
