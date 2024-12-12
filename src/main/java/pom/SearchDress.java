package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchDress {
	WebDriver driver;
	public SearchDress(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements( driver,this);
	}
@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[7]/div/div[2]/h5/a")	
WebElement dress;
public void ClickOnDress() {
dress.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
