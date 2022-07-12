package kitePomUsingExcle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage 
{
	//1. data member 2. constructor 3.methods

	//1. data member
	@FindBy(id="userid")private WebElement userName;
	
	@FindBy(id="password")private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//2.Constructor
	//. Initialize within a constructor with access level public using pagefactory 
	public KiteLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//initelement(static method)
	}
	//step3 Method
	
	public void SendUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	public void sendPassword(String pasSword)
	{
		password.sendKeys(pasSword);
	}
	public void clickOnButton()
	{
		loginButton.click();
	}








}
