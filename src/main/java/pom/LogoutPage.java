package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
WebDriver driver;	
public LogoutPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver, this);
	// TODO Auto-generated constructor stub
}
@FindBy(xpath = "//a[@class='logout']")  private WebElement signoutb;
public void ClickOnSignoutbutton() {
signoutb.click();
}
}
