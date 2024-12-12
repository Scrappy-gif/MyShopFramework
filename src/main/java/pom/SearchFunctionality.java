package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionality {
WebDriver driver;
public SearchFunctionality(WebDriver driver) {
this.driver=driver;
PageFactory.initElements( driver, this);
}
@FindBy(id="search_query_top") private WebElement searchtab;
@FindBy(name = "submit_search") private WebElement searchbutton;

public void ClickonSearchbutton(String prod) {
searchtab.sendKeys(prod);
}
public void ClickonSearch() {
searchbutton.click();
}
}
