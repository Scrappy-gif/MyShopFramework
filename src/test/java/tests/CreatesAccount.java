package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pom.CreateAccount;
import pom.IndexPage;
import pom.RegisterUserAccount;

public class CreatesAccount extends BaseClass {
@Test
public void VerifyRegistrationPage() throws IOException {
driver.get(baseurl);
IndexPage ip=new IndexPage(driver);
ip.clickonSigninButton();
log.info("User Clicked on Sign in Link");
log.info("Regsitration Functionality Test Case Started");
CreateAccount ca= new CreateAccount(driver);
ca.EnterEmailAdress("pam@gmail.com");
log.info("User Eneter Valid Email ID");
ca.EnterCreateAcButton();
log.info("User Clicked Create Account Buuton");
//2nd page
RegisterUserAccount rsp= new RegisterUserAccount(driver);
log.info("User landed on suucessfuuly regsiter account page");
String msg=rsp.getUserName();

if(msg.equals("Pam Beesly")) {
log.info("Verify login- Paased");
Assert.assertTrue(true);
}
else {
	log.info("Verify Login- failed");
	captureScreenShot(driver, "Verify login");
	Assert.assertTrue(false);
}

log.info("********Login Functionality Test Case Ends********");

}
}
