package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppPOM.KitePinPage;
import kitePOMUsingTestNg.KiteHomePage;
import kitePOMUsingTestNg.KiteLogInPage;
import kiteUtilitty.Utility;
import kitebase.Base;

public class ValidateKiteUserId extends Base 
{
	KiteHomePage home;
	KiteLogInPage login;
	KitePinPage pin;
	String TCID="1234";
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
//		login = new KiteLogInPage(driver);
//		pin = new KitePinPage(driver);
//		home=new KiteHomePage(driver);
		login=new KiteLogInPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.SendUserName(Utility.readDataFromExcle(5, 0));
		login.sendPassword(Utility.readDataFromExcle(5, 1));
		login.clickOnButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//pin.sendPin(Utility.readDataFromExcle(5, 2));
		pin.sendPin(Utility.readDataFromExcle(5, 2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  @Test
  public void validateUserId() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcle(5, 0),"Actual and Expected are not matching TC is failed");
	  Utility.captureScreenshot(driver, TCID);
  }
  
  @AfterMethod
  public void logOutFromKite() throws InterruptedException 
  {
	home.logOut();
  }
  @AfterClass
  public void closedBrowser()
  {
	  driver.close();
  }
}
