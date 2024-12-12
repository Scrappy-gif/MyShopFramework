package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserAccount {
	WebDriver driver;
	public RegisterUserAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}

	@FindBy(xpath = "//a[@class='account']") private WebElement username;

	public String getUserName() {
		String text=username.getText();
		return   text;
	}

}
