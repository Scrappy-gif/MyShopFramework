package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.AccountPage;
import pom.CreateAccount;
import pom.IndexPage;
import pom.RegistrationPage;
import utilities.ReadExcel;

public class DDT extends BaseClass {
	@DataProvider(name = "loginData")
	public Object[][] getLoginData() throws IOException {
		return ReadExcel.getExcelData("E:\\Prachi\\Excel.xlsx", "Sheet3");
	}

	@Test(dataProvider = "loginData")
	public void DDTS(String Email, String FirstName, String LastName, String Emaild, String Password)
			throws InterruptedException {
		driver.get(baseurl);
		log.info("********Data Driven Test Case Starts********");
//1st page
		IndexPage pg = new IndexPage(driver);
		log.info("User Successfully enter into the application");
		pg.clickonSigninButton();
		log.info("User Clicked on Sign in Link");
//2nd page
		CreateAccount c = new CreateAccount(driver);
		log.info("User landed on create account page");
		c.EnterEmailAdress(Email); // Use the dynamic email from DataProvider
		log.info("User Enter Email id");
		c.EnterCreateAcButton();
		log.info("User Click create buuton");
//land on 3rd page
		RegistrationPage rp = new RegistrationPage(driver);
		log.info("User landed on Registration page");
		rp.selectTitleMrs();
		log.info("User selected mrs radio button");
		rp.enterCustomerFirstName(FirstName);
		log.info("User enter firstname");
		rp.enterCustomerLastName(LastName);
		log.info("User enter lastname");
		rp.enterCustomerEmail(Emaild);
		log.info("User enter email");
		rp.enterCustomerPassword(Password);
		log.info("User enter password");
		rp.selectDate("12");
		log.info("User enter day");
		rp.selectMonth("7");
		log.info("User enter month");
		rp.selectYear("1988");
		log.info("User enter month");
		rp.ClickOnRegister();
		log.info("User Click on Regsiter Button");
		Thread.sleep(2000);

}
}
