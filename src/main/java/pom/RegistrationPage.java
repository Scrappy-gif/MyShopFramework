package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
WebDriver driver;
public RegistrationPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements( driver, this);
}
@FindBy(xpath ="//input[@id='id_gender2']") private WebElement title;
@FindBy(id="customer_firstname") private WebElement firstnamename;
@FindBy(id="customer_lastname") private WebElement flname;
@FindBy(id="email") private WebElement email;
@FindBy(id="passwd") private WebElement pass;
@FindBy(id="days") private WebElement day;
@FindBy(id="months") private WebElement month;
@FindBy(id="years") private WebElement year;
@FindBy(id="submitAccount") private WebElement submitbtn;

public void selectTitleMrs()
{
	title.click();
}
public void enterCustomerFirstName(String fname)
{
	firstnamename.sendKeys(fname);
}
public void enterCustomerLastName(String lname)
{
	flname.sendKeys(lname);
}
public void enterCustomerEmail(String emailid)
{   email.clear();
	email.sendKeys(emailid);
}
public void enterCustomerPassword(String pwd)
{
	pass.sendKeys(pwd);
}
public void selectDate(String date)
{
	Select obj= new Select(day);
	obj.selectByValue(date);
}
public void selectMonth(String mn)
{
	Select obj1= new Select(month);
	obj1.selectByValue(mn);
}
public void selectYear(String yr)
{
	Select obj= new Select(year);
	obj.selectByValue(yr);
}
public void ClickOnRegister()
{
	submitbtn.click();
}



}
