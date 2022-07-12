package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kiteAppPOM.KitePinPage;
import kitePOMUsingTestNg.KiteHomePage;
import kitePOMUsingTestNg.KiteLogInPage;
import kiteUtilitty.Utility;
import kiteUtilitty.UtilityProp;
import kitebase.Base;
import kitebase.BaseNew;

@Listeners(kiteUtilitty.Listener.class)
public class ValidateKiteUserIdUsingProperty extends BaseNew 
{
	KiteHomePage home;
	KiteLogInPage login;
	KitePinPage pin;
	String TCID="444";
	@Parameters("browserName")
	@BeforeClass
	public void launchBrowser(@Optional String name) throws IOException
	{
		login=new KiteLogInPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		
		if(name.equals("chrome"))
		{
			openBrowser();
		}
		else if(name.equals("Firefox"))
		{
			openbrowserFirefox();
		}
		
		
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.SendUserName(UtilityProp.getDataFromPropertiesFiles("UN"));
		login.sendPassword(UtilityProp.getDataFromPropertiesFiles("PWD"));
		login.clickOnButton();
		pin.sendPin(UtilityProp.getDataFromPropertiesFiles("PIN"));
		pin.clickOnContinueButton();
		
	}
  @Test
  public void validateUserId() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertiesFiles("UN"));
	  //Utility.captureScreenshot(driver, TCID);
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
