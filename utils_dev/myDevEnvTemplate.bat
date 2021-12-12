@echo off 
:: possible locations under HKLM\SOFTWARE of JavaSoft registry data
set "javaNativeVersion="
set "java32ON64=Wow6432Node\"

:: for variables
::    %%k = HKLM\SOFTWARE subkeys where to search for JavaSoft key
::    %%j = full path of "Java Runtime Environment" key under %%k
::    %%v = current java version
::    %%e = path to java

set "javaDir="
set "javaVersion="
for %%k in ( "%javaNativeVersion%" "%java32ON64%") do if not defined javaDir (
    for %%j in (
        "HKLM\SOFTWARE\%%~kJavaSoft\Java Development Kit"
    ) do for /f "tokens=3" %%v in (
        'reg query "%%~j" /v "CurrentVersion" 2^>nul ^| find /i "CurrentVersion"'
    ) do for /f "tokens=2,*" %%d in (
        'reg query "%%~j\%%v" /v "JavaHome"   2^>nul ^| find /i "JavaHome"'
    ) do ( set "javaDir=%%~e" & set "javaVersion=%%v" )
)

if not defined javaDir (
	ECHO Java not found
) else (
	SET JAVA_HOME=%javaDir%
)

@Rem	My Development Environment
@Rem
@Rem	This script sets variable for compiling Xendra from source


@Rem  Check the following parameters:
@Rem  -------------------------------

@Rem	Set Java Home
@Rem SET JAVA_HOME=C:\Program Files\Java\jdk1.5.0_04
@Rem IF NOT EXIST "%JAVA_HOME%\bin" ECHO "** JAVA_HOME NOT found"
@Rem SET PATH=%JAVA_HOME%\bin;%PATH%

@Rem	Set Xendra Source Directory
@set XENDRA_HOME=%~dp0\..
@set XENDRA_SOURCE=%~dp0\..
SET CLASSPATH=
@IF NOT EXIST "%XENDRA_SOURCE%" ECHO "** XENDRA_SOURCE NOT found"

@Rem	Passwords for the keystore
@SET KEYTOOL_PASS=%KEY_PASSWORD%
@IF "%KEYTOOL_PASS%"=="" SET KEYTOOL_PASS=myPassword

@Rem	Keystore & FTP Password
@SET ANT_PROPERTIES=-Dpassword=%KEYTOOL_PASS% 

@Rem	Ant to send email after completion - change or delete
@SET ANT_PROPERTIES=%ANT_PROPERTIES% -DMailLogger.mailhost=xxx -DMailLogger.from=xxxx -DMailLogger.failure.to=xxxx -DMailLogger.success.to=xxxx 

@Rem	Automatic Installation - Where Xendra will be unzipped
@SET XENDRA_ROOT=C:\
@Rem	Automatic Installation - Resulting Home Directory
@SET XENDRA_HOME=%XENDRA_ROOT%Xendra
@Rem	Automatic Installation - Share for final Installers
@SET XENDRA_INSTALL=C:\Install
@IF NOT EXIST %XENDRA_INSTALL% Mkdir %XENDRA_INSTALL%


@Rem  ---------------------------------------------------------------
@Rem  In most cases you don't need to change anything below this line
@Rem  If you need to define something manually do it above this line,
@Rem  it should work, since most variables are checked before set.
@Rem  ---------------------------------------------------------------

@SET CURRENTDIR=%CD%

@Rem Set Version
@SET XENDRA_VERSION=Xendra
@SET XENDRA_VERSION_FILE=200
@SET XENDRA_VENDOR=Dravio SAC

@SET ENCODING=UTF-8

@Rem	ClassPath

@IF NOT EXIST "%JAVA_HOME%\lib\tools.jar" ECHO "** Need Full Java SDK **"
@SET CLASSPATH=%CLASSPATH%;%JAVA_HOME%\lib\tools.jar
@IF NOT EXIST %XENDRA_SOURCE%\tools\lib\ant.jar ECHO "** Ant.jar NOT found **"
@SET CLASSPATH=%CLASSPATH%;%XENDRA_SOURCE%\tools\lib\ant.jar;%XENDRA_SOURCE%\tools\lib\ant-launcher.jar;%XENDRA_SOURCE%\tools\lib\ant-swing.jar;%XENDRA_SOURCE%\tools\lib\ant-commons-net.jar;%XENDRA_SOURCE%\tools\lib\commons-net-1.4.0.jar;%XENDRA_SOURCE%\JasperReportsTools\lib\jasperreports-4.5.1.jar
@Rem SET CLASSPATH=%CLASSPATH%;%XENDRA_SOURCE%\jboss\lib\xml-apis.jar
@Rem	Set XDoclet 1.1.2 Environment
@SET XDOCLET_HOME=%XENDRA_SOURCE%\tools

@Rem	Java Keystore for signing jars
@IF NOT EXIST %XENDRA_SOURCE%\keystore MKDIR %XENDRA_SOURCE%\keystore
@IF EXIST "%XENDRA_SOURCE%\keystore\myKeystore" GOTO CHECKKEYVALUE

:CREATEXENDRAKEY
@Echo No Java Keystore found, creating ...
@Rem	.
@Rem	This is the keystore for code signing.
@Rem	Replace it with the official certificate.
@Rem	Note that this is not the SSL certificate.
@Rem	.

SET KEYTOOL_DNAME="CN=myName, OU=myName, O=myOrg, L=myTown, ST=myState, C=PE"

"%JAVA_HOME%\bin\keytool" -genkey -keyalg rsa -alias xendra -dname %KEYTOOL_DNAME% -keypass %KEYTOOL_PASS% -validity 365 -keystore %XENDRA_SOURCE%\keystore\myKeystore -storepass %KEYTOOL_PASS%

"%JAVA_HOME%\bin\keytool" -selfcert -alias xendra -dname %KEYTOOL_DNAME% -keypass %KEYTOOL_PASS% -validity 180 -keystore %XENDRA_SOURCE%\keystore\myKeystore -storepass %KEYTOOL_PASS%

:CHECKKEYVALUE
@"%JAVA_HOME%\bin\keytool" -list -alias xendra -keyStore %XENDRA_SOURCE%\keystore\myKeystore -storepass %KEYTOOL_PASS%
@IF ERRORLEVEL 1 GOTO :CREATEXENDRAKEY

@Rem Set XENDRA_ENV for all other scripts.
@SET XENDRA_ENV=Y