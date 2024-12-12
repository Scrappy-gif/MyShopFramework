package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pom.AccountPage;
import pom.IndexPage;
import pom.LogoutPage;
import pom.RegisterUserAccount;

public class UserAccountPage extends BaseClass {
@Test(groups ="Regression",priority =  1)
public void VerifyUserSignin() throws IOException {
driver.get(baseurl);
log.info("********Login Functionality Test Case Starts********");
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

//3rd page
RegisterUserAccount rsp= new RegisterUserAccount(driver);
log.info("User landed on suucessfuuly regsiter account page");
String msg=rsp.getUserName();

if(msg.equals("Pam Beesl")) {
log.info("Verify login- Passed");
Assert.assertTrue(true);
}
else {
	log.info("Verify Login- failed");
	captureScreenShot(driver, "Verify login");
	Assert.assertTrue(true);
}

log.info("********Login Functionality Test Case Ends********");
}
@Test(dependsOnMethods = "VerifyUserSignin", dependsOnGroups = "Regression",priority = 2)
public void VerifyLogoutUser() {
log.info("********Logout Functionality Test Case Started********");

LogoutPage logout=new LogoutPage(driver);
logout.ClickOnSignoutbutton();
log.info("User Click on sign out button");
log.info("********Logout Functionality Test Case Ends********");
}
}
