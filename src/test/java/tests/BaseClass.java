package tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfigFile;

public class BaseClass {
	ReadConfigFile read= new ReadConfigFile();
	public String baseurl=read.geturl();
	public String browser=read.getbrowser();
	public static  Logger log;
    public WebDriver driver;
   @BeforeClass
public void setup() {
System.setProperty("webdriver.chrome.driver","E:\\Prachi\\Drivers\\chromedriver-win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));   
log=LogManager.getLogger("MyShop");
    		}

		
@AfterClass
public void tearDown() {
	driver.quit();
}
public void captureScreenShot(WebDriver driver,String testName) throws IOException
{
	//step1: convert webdriver object to TakesScreenshot interface
TakesScreenshot screenshot = ((TakesScreenshot)driver);

//step2: call getScreenshotAs method to create image file

File src = screenshot.getScreenshotAs(OutputType.FILE);

File dest = new File(System.getProperty("user.dir") + "//Screenshots//" + testName + ".png");

//step3: copy image file to destination
FileUtils.copyFile(src, dest);
}
}
