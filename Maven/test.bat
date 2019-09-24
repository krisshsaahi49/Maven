@echo

set currentpath=%~dp0%
echo %currentpath%
cd %currentpath%
mvn test -DxmlFileName=ee.xml 
Pause