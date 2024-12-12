package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
WebDriver driver;
public CreateAccount(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}
//Encapsulate web element
@FindBy(xpath="//input[@id='email_create']") private WebElement emailbutton;;
@FindBy(id="SubmitCreate") private WebElement createacbutton;

public void EnterEmailAdress(String adr) {
emailbutton.sendKeys(adr);
}
public void EnterCreateAcButton() {
createacbutton.click();
}









}
