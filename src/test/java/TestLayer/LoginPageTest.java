package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass{
	
	@BeforeClass
	public void setUp()
	{
		BaseClass.initilization();
	}
	
	
	@Test
	public void ValidateRegisterPageFunctionality()
	{
		LoginPage registerpage = new LoginPage();
		
		registerpage.enterFirstname("chetan");
		registerpage.enterLastname("Ingale");
		registerpage.enterMobileNo("999999");
		registerpage.enterEmail("chetan@gmail.com");
		registerpage.clickSubmitButton();

	}
	
	@AfterClass
	public void tearDown() throws Exception
	{
		Thread.sleep(4000);
		driver.close();
	}

}
