package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pom.AccountPage;
import pom.IndexPage;
import pom.SearchDress;
import pom.SearchFunctionality;
import pom.SearchProduct;

public class SearchFunction extends BaseClass {
@Test(groups = "Regression",priority = 1)
public void VerifyLoginFunctionality() {
driver.get(baseurl);
log.info("********Verify Search Functionality Test Case Starts********");
//1st page
IndexPage pg= new IndexPage(driver);
log.info("User Successfully enter into the application");
pg.clickonSigninButton();
log.info("User Clicked on Sign in Link");
//2nd page
AccountPage ap=new AccountPage(driver);
log.info("User landed on create account page");

ap.enterEmailAddress("beeslypam@gmail.com");
log.info("User Enter Email id");

ap.enterPassword("Pam@1234567");
log.info("User enter password");

ap.clickSignIn();
log.info("User Successfully Sign in into application");
}

@Test(dependsOnGroups = "Regression",priority = 2)
public void VerifySearchFunctionality(){
log.info("********Verify Search Functionality Test Case Starts********");

SearchFunctionality sf= new SearchFunctionality(driver);
sf.ClickonSearchbutton("Dresses");
log.info("User search fro proudct dresses");
sf.ClickonSearch();
log.info("User click on search button");
log.info("********Verify Search Functionality Test Case Ends********");
}
@Test
public void VerifyProductFunctionality() {
SearchDress sp= new SearchDress(driver);
log.info("********Verify Product Functionality Test Case Started********");
sp.ClickOnDress();

log.info("User click on first dress");
//
String expectedTitle = "Printed Dress - My Shop";
Assert.assertTrue(driver.getTitle().contains(expectedTitle));
log.info("********Verify Product Functionality Test Case Ends********");

}


}
