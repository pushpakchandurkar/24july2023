package UtilsClass;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{
	
	public static void enterValueInTestBox(WebElement wb, String value)
	{
		if(wb.isDisplayed() && wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickOnButton(WebElement wb)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.click();
		}
	}
	

}
