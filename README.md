How to read a Boolean from the standard application.properties with Spring Boot.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readABooleanFromStandardPropertiesFile-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.properties<br/>
myBoolean=true<br/>
---MyConfigurationBean.java<br/>
private Boolean myBoolean;<br/>
+getter and setter<br/>
---The class who displays the value of the 'myBoolean' configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyBoolean());<br/>
<br/>
<br/>
The application will read the value 'true' of the property myBoolean in the standard application.properties configuration file then display it in the terminal.<br/>

