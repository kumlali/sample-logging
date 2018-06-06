#sample-logging
A simple project that demonstrates how to:
* use slf4j and log4j2 binding
* write logs to console 
* write logs to file (to enable this, uncomment File appender related lines in `log4j2.xml`)
* send logs to GELF server such as Graylog (to enable this, uncomment Gelf appender related lines in `log4j2.xml`)
* prepare binary distribution package with Maven Assembly Plug-in
* add dependent libraries to the package
* externalize resources from jar file and load them from classpath

#Building
* Clone the project: `git clone https://github.com/kumlali/sample-logging`
* Build it: `mvn package`
* Now you have `target/sample-logging-0.0.1-SNAPSHOT-dist.zip` file.

#Usage
* Extract `sample-logging-0.0.1-SNAPSHOT-dist.zip`.
* Configure `conf/log4j2.xml` if you need.
* On Linux/Unix/Mac:
    * Give execution right to `run.sh`: `chmod +x run.sh`
    * Execute `run.sh`
* On Windows:
** Execute `run.bat`