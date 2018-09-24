Creating maven Project:
mvn archetype:generate -DgroupId=com.wipro.topgear -DartifactId=basicMaven -DarchetypeArtifactId= maven-archetype-quickstart

Above command created a maven project with name as basicMaven and package as com.wipro.topgear and maven project type as quickstart.


Comipling and testing:
C:\Users\madhukar sadula>E:

E:\>cd FSD/MavenProjects/basicMaven

E:\FSD\MavenProjects\basicMaven>mvn clean
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< com.wipro.topgear:basicMaven >--------------------
[INFO] Building basicMaven 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ basicMaven ---
[INFO] Deleting E:\FSD\MavenProjects\basicMaven\target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.822 s
[INFO] Finished at: 2018-09-24T13:53:46+05:30
[INFO] ------------------------------------------------------------------------
'cmd' is not recognized as an internal or external command,
operable program or batch file.

E:\FSD\MavenProjects\basicMaven>mvn compile
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< com.wipro.topgear:basicMaven >--------------------
[INFO] Building basicMaven 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ basicMaven
 ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources,
i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory E:\FSD\MavenProjects\basicMaven\src\m
ain\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ basicMaven ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. b
uild is platform dependent!
[INFO] Compiling 1 source file to E:\FSD\MavenProjects\basicMaven\target\classes

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.453 s
[INFO] Finished at: 2018-09-24T13:53:55+05:30
[INFO] ------------------------------------------------------------------------
'cmd' is not recognized as an internal or external command,
operable program or batch file.

E:\FSD\MavenProjects\basicMaven>mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] --------------------< com.wipro.topgear:basicMaven >--------------------
[INFO] Building basicMaven 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ basicMaven
 ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources,
i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory E:\FSD\MavenProjects\basicMaven\src\m
ain\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ basicMaven ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ ba
sicMaven ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources,
i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory E:\FSD\MavenProjects\basicMaven\src\t
est\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ basicMa
ven ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. b
uild is platform dependent!
[INFO] Compiling 1 source file to E:\FSD\MavenProjects\basicMaven\target\test-cl
asses
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ basicMaven ---
[INFO] Surefire report directory: E:\FSD\MavenProjects\basicMaven\target\surefir
e-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.wipro.topgear.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.032 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.641 s
[INFO] Finished at: 2018-09-24T13:54:10+05:30
[INFO] ------------------------------------------------------------------------
'cmd' is not recognized as an internal or external command,
operable program or batch file.

E:\FSD\MavenProjects\basicMaven>