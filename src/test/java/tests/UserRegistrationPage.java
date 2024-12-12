package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pom.CreateAccount;
import pom.IndexPage;
import pom.RegisterUserAccount;
import pom.RegistrationPage;

public class UserRegistrationPage<RegistrationSuccessPage> extends BaseClass {
@Test
public void VerifyUserRegistrationAndLogin() {
driver.get(baseurl);
//land on 1st page
IndexPage i= new IndexPage(driver);
log.info("User Successfully enter into the application");
i.clickonSigninButton();
log.info("User Click on Sign in link");
//land on 2nd page
CreateAccount c= new CreateAccount(driver);
log.info("User landed on create account page");
c.EnterEmailAdress("johncena@gmail.com");
log.info("User Enter Email id");
c.EnterCreateAcButton();
log.info("User Click create buuton");
//land on 3rd page
RegistrationPage rp=new RegistrationPage(driver);
log.info("User landed on Registration page");
rp.selectTitleMrs();
log.info("User selected mrs radio button");
rp.enterCustomerFirstName("John");
log.info("User enter firstname");
rp.enterCustomerLastName("Cena");
log.info("User enter lastname");

rp.enterCustomerEmail("johncena@gmail.com");
log.info("User enter email");
rp.enterCustomerPassword("Pam@1234567");
log.info("User enter password");
rp.selectDate("12");
log.info("User enter day");
rp.selectMonth("7");
log.info("User enter month");
rp.selectYear("1988");
log.info("User enter month");
rp.ClickOnRegister();
log.info("User Click on Regsiter Button");
//land 4th page
RegisterUserAccount rsp= new RegisterUserAccount(driver);
log.info("User landed on suucessfuuly regsiter account page");
String msg=rsp.getUserName();

Assert.assertEquals("John Cena", msg);
System.out.println("Test Case Passed");

log.info("********User Regsitraion Functionality Test Case Ends********");


}
}
