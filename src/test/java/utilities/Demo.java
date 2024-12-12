package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {

public static void main(String[] args) throws IOException {

File file=new File("C:\\Users\\Mukul Bhate\\eclipse-workspace\\MyShop\\Configuration\\config.properties");
Properties pro = new Properties();
FileInputStream fi= new FileInputStream(file);
pro.load(fi);

System.out.println(pro.getProperty("baseUrl"));
System.out.println(pro.getProperty("browser"));
	}

}
