package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LandingPageWithNoChanges {
WebDriver driver;
public LandingPageWithNoChanges(WebDriver driver) {
this.driver=driver;
PageFactory.initElements( driver,driver);
}

}
