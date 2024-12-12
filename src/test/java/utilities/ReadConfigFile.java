package utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfigFile {
File file= new File("C:\\Users\\Mukul Bhate\\eclipse-workspace\\MyShop\\Configuration\\config.properties");
Properties prop;
public ReadConfigFile()  {
try {
	FileInputStream fis =new FileInputStream(file);
	prop= new Properties();
	prop.load(fis);
} catch (Exception e) {
	System.out.println("Exception is :"+e.getMessage());
}}
public String getbrowser() {
String browser=prop.getProperty("chrome");
return browser;
}
public String geturl() {
String url=prop.getProperty("baseUrl");
return url;
}

}

