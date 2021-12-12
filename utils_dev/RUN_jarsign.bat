@Title	Sign jars in %XENDRA_HOME%\lib\
@Rem
@Rem	Sign all jars for WebStart with your certificate
@Rem	Keystore located at c:\adempiere\adempiere-all\keystore\myKeystore
@Rem	Keystore passwords both %KEY_PASSWORD% (default myPassword)
@Rem	Jar files are located in the deployment directory %XENDRA_HOME%\lib
@Rem
@Rem	After this, you need to RUN_setup 
@Rem	to generate/copy the webstart/jnlp distribution

jarsigner -keystore c:\adempiere\adempiere-all2\keystore\myKeystore -storepass %KEY_PASSWORD% -keypass %KEY_PASSWORD% %XENDRA_HOME%\lib\CClient.jar adempiere
jarsigner -keystore c:\adempiere\adempiere-all2\keystore\myKeystore -storepass %KEY_PASSWORD% -keypass %KEY_PASSWORD% %XENDRA_HOME%\lib\CTools.jar adempiere
jarsigner -keystore c:\adempiere\adempiere-all2\keystore\myKeystore -storepass %KEY_PASSWORD% -keypass %KEY_PASSWORD% %XENDRA_HOME%\lib\oracle.jar adempiere
jarsigner -keystore c:\adempiere\adempiere-all2\keystore\myKeystore -storepass %KEY_PASSWORD% -keypass %KEY_PASSWORD% %XENDRA_HOME%\lib\jPDFPrinterDemo.jar adempiere
jarsigner -keystore c:\adempiere\adempiere-all2\keystore\myKeystore -storepass %KEY_PASSWORD% -keypass %KEY_PASSWORD% %XENDRA_HOME%\lib\jPDFPrinterProd.jar adempiere

@Echo	After this execute RUN_setup
@pause