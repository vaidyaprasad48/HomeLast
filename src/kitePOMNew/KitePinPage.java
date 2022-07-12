package kitePOMNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	//stage 1 data member
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	//2.Constructor
	//. Initialize within a constructor with access level public using pagefactory 
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//stage3 Methods
	public void sendPin(String UserPIN)
	{
		PIN.sendKeys(UserPIN);
	}
	public void clickOnContinueButton()
	{
		continueButton.click();
	}

	
	
	
	
	
	
	
	
}
