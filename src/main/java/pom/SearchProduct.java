package pom;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
WebDriver driver;
public SearchProduct(WebDriver driver) {
this.driver= driver;
PageFactory.initElements( driver,this);
}
//@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a") 
//private WebElement firstdress;
@FindBy(xpath = "//div[@class='right-block']") private By alldresses;

//public void ClickOnFirstDress() {
//firstdress.click();
//}
public List<WebElement> getAlldressElement(){

return driver.findElements(alldresses);
}

}

