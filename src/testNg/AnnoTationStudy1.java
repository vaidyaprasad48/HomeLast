package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnoTationStudy1 {
  @Test
  public void rechargePhone() 
  {
	  Reporter.log("recharge done ",true);
  }
  @BeforeMethod
  public void logInToRechargePortel() 
  {
	  Reporter.log("log in success ",true);
  }

  @AfterMethod
  public void logOutFromRecahrge() 
  {
	  Reporter.log("logout done ",true);
  }

  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("browser launch ",true);
  }

  @AfterClass
  public void closedBrowser() 
  {
	  Reporter.log("Browser closed",true);
  }

  
}
