package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//stage1 data member
	@FindBy(xpath="//span[@class='user-id']")private WebElement userName;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
	
	//stage 2 constructor
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//stage 3 methods
	public void validUserName()
	{
		String expectedUserName="ELR321";
		String actualUserName = userName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("User Id matching test case is Passed");
		}
		else
		{
			System.out.println("User Id not matching test case is Failed");
		}
	}
	public void logOut() throws InterruptedException 
	{
		userName.click();
		Thread.sleep(1000);
		logOutButton.click();
		
	}

		
		
		
		
		
		
		
		
}
