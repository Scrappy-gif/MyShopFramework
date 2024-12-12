package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
WebDriver driver;
public IndexPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
//Encapsulated web elements (private access modifier)
private By Signinbutton = By.className("login");

public void clickonSigninButton() {
driver.findElement(Signinbutton).click();
}





}
