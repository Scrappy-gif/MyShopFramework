package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
WebDriver driver;
public AccountPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements( driver,this);
}
@FindBy(id = "email") private WebElement registeredUsersEmail;

@FindBy(id = "passwd") private WebElement registeredUsersPwd;

@FindBy(id = "SubmitLogin")private WebElement submitLogin;

public void enterEmailAddress(String emailAdd) 
{
	registeredUsersEmail.sendKeys(emailAdd);
}

public void enterPassword(String pwd) 
{
	registeredUsersPwd.sendKeys(pwd);
}


public void clickSignIn()
{
	submitLogin.click();
}

}
