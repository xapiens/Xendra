#	My Development Environment
#
#	This script sets variable for compiling Compiere from source
#	Ported from Windows script Marek Mosiewicz<marek.mosiewicz@jotel.com.pl>
#	If you have difficulties, compare it with the Windows version.
#	
#  Check the following parameters:
#  -------------------------------

if [ $JAVA_HOME ]; then
  export PATH=$JAVA_HOME/bin:$PATH	
else
  echo JAVA_HOME is not set.
  echo You may not be able to build Xendra
  echo Set JAVA_HOME to the directory of your local JDK.
fi


#Set Xendra Source Directory - default one dir up from place where script resides

SAVED_DIR=`pwd`			#save current dir
cd `dirname $0`/..		#change dir to one up form place where script resides - doesn not work with sym links
export XENDRA_SOURCE=`pwd`	#this is adempiere source
cd $SAVED_DIR			#back to the saved directory

echo XENDRA_SOURCE is $XENDRA_SOURCE

if [ ! -d $XENDRA_SOURCE/client ] ; then
	echo "** XENDRA_SOURCE NOT found"
fi  

#	Passwords for the keystore
export KEYTOOL_PASS=$KEY_PASSWORD
if [ ! $KEYTOOL_PASS ] ; then
	export KEYTOOL_PASS=myPassword
fi

#	Keystore & FTP Password
export ANT_PROPERTIES=-Dpassword=$KEYTOOL_PASS 

#	Ant to send email after completion - change or delete
#export ANT_PROPERTIES="$ANT_PROPERTIES -DMailLogger.mailhost=xxx -DMailLogger.from=xxxx -DMailLogger.failure.to=xxxx -DMailLogger.success.to=xxxx"

#	Automatic Installation - Where Xendra will be unzipped
export XENDRA_ROOT=../Xendra

#	Automatic Installation - Resulting Home Directory
export XENDRA_HOME=$XENDRA_ROOT/Xendra

#	Automatic Installation - Share for final Installers
export XENDRA_INSTALL=/xendra/install
if [ ! -d $XENDRA_INSTALL ] ; then
    mkdir -p $XENDRA_INSTALL
fi  

#  ---------------------------------------------------------------
#  In most cases you don't need to change anything below this line
#  If you need to define something manually do it above this line,
#  it should work, since most variables are checked before set.
#  ---------------------------------------------------------------

export CURRENTDIR=`pwd`

#  Set Version
export XENDRA_VERSION=Xendra
export XENDRA_VERSION_FILE=100
export XENDRA_VENDOR=Dravio SAC

export ENCODING=UTF-8

#	ClassPath
if  [ ! -f $JAVA_HOME/lib/tools.jar ] ; then
	echo "** Need full Java SDK **"
fi
export CLASSPATH=$CLASSPATH:$JAVA_HOME/lib/tools.jar

if  [ ! -f $XENDRA_SOURCE/tools/lib/ant.jar ] ;then
	echo "** Ant.jar NOT found **"
fi
export CLASSPATH=$CLASSPATH:$XENDRA_SOURCE/tools/lib/ant.jar:$XENDRA_SOURCE/tools/lib/ant-launcher.jar:$XENDRA_SOURCE/tools/lib/ant-swing.jar:$XENDRA_SOURCE/tools/lib/ant-commons-net.jar:$XENDRA_SOURCE/tools/lib/commons-net.jar
#export CLASSPATH=$CLASSPATH:$XENDRA_SOURCE/jboss/lib/xml-apis.jar

#	.
#	This is the keystore for code signing.
#	Replace it with the official certificate.
#	Note that this is not the SSL certificate.
#	.

if [ ! -d $XENDRA_SOURCE/keystore ] ; then
    mkdir $XENDRA_SOURCE/keystore			#create dir
fi    
	    
# check 	
if  [ ! -f $XENDRA_SOURCE/keystore/myKeystore ] || [ ! "keytool -list -alias xendra -keyStore $XENDRA_SOURCE/keystore/myKeystore -storepass $KEYTOOL_PASS" ] ; then		     
     # 	This is a dummy keystore for localhost SSL		     
     #	replace it with your SSL certifificate.		     
     #	Please note that a SSL certificate is 		     
     #	different from the code signing certificate.
     #	The SSL does not require an alias of xendra and		     
     #	there should only be one certificate in the keystore
		     
    HOSTNAME=`hostname`
			
			
    echo No Keystore found, creating for $HOSTNAME ...
			    
    KEYTOOL_DNAME="CN=$HOSTNAME, OU=myName, O=XendraUser, L=myTown, ST=myState, C=PE"

    keytool -genkey -keyalg rsa -alias xendra -dname "$KEYTOOL_DNAME" -keypass $KEYTOOL_PASS -validity 365 -keystore $XENDRA_SOURCE/keystore/myKeystore -storepass $KEYTOOL_PASS
    keytool -selfcert -alias xendra -dname "$KEYTOOL_DNAME" -keypass $KEYTOOL_PASS -validity 180 -keystore $XENDRA_SOURCE/keystore/myKeystore -storepass $KEYTOOL_PASS
fi

# Set XENDRA_ENV for all other scripts.
export XENDRA_ENV=Y
