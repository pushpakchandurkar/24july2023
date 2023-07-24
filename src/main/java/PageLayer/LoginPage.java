package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import UtilsClass.UtilsClass;

public class LoginPage extends UtilsClass {

	@FindBy (name="firstName")
	WebElement fname;
	
	@FindBy (name="lastName")
			WebElement lname;
	
	@FindBy (name="phone")
			WebElement phone;
	
	@FindBy (id="userName")
			WebElement email;
	
	@FindBy (name="submit")
	WebElement submit;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);

	}
	
	
	public void enterFirstname(String name)
	{
		UtilsClass.enterValueInTestBox(fname, name);
				
	}
	
	public void enterLastname(String lastname)
	{
		UtilsClass.enterValueInTestBox(lname, lastname);
				
	}
	
	
	public void enterMobileNo(String mob)
	{
		UtilsClass.enterValueInTestBox(phone, mob);
				
	}
	
	public void enterEmail(String mail)
	{
		UtilsClass.enterValueInTestBox(email, mail);
				
	}
	
	public void clickSubmitButton()
	{
		UtilsClass.clickOnButton(submit);
				
	}
	
	




}
