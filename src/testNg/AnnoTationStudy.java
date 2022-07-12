package testNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoTationStudy {
  @Test//stage1
  public void validateUserId()
  {
	  Reporter.log("User Id validate",true);
  }
  
  @Test//stage6
  public void validDashboard()
  {
	  Reporter.log("Dashboard valid",true);
  }
  
  @BeforeMethod//stage2
  public void loginToKiteApp()
  {
	  
	  Reporter.log("log in success",true);
	  
  }
  @BeforeClass//stage3
  public void lauchBrowser()
  {
	  Reporter.log("browser launched",true);
  }
  @AfterMethod//stage4
  public void LogOutKite()
  {
	  Reporter.log("login out",true);
	  
  }
  @AfterClass//stage5
  public void closeBrowser()
  {
	  Reporter.log("closed browser",true);
  }














}
