@Title Build Xendra Clean
@Rem $Header: /cvsroot/xendra/utils_dev/RUN_build.bat,v 1.22 2005/09/08 21:56:11 jjanke Exp $

@CALL myDevEnv.bat
@IF NOT %XENDRA_ENV%==Y GOTO NOBUILD

@echo Cleanup ...
@"%JAVA_HOME%\bin\java" -Dant.home="." %ANT_PROPERTIES% org.apache.tools.ant.Main clean

@rem -logger org.apache.tools.ant.listener.MailLogger
@rem -lib ../Tools/lib/jasperreports-4.5.1.jar
@echo Building ...
@"%JAVA_HOME%\bin\java" -Xmx500m -Dant.home="." %ANT_PROPERTIES% org.apache.tools.ant.Main  complete 
@IF ERRORLEVEL 1 goto ERROR

dir %XENDRA_INSTALL%

@Echo Done ...
@Pause
@exit

:NOBUILD
@Echo Check myDevEnv.bat (copy from myDevEnvTemplate.bat)

:ERROR
@rem @Color fc

@Pause