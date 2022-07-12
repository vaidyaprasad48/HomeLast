package kitePOMUsingTestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAppPOM.KitePinPage;
import kiteUtilitty.Utility;

public class ValidateKiteAppUserName {
	
	WebDriver driver;//globally declear kila
	
	Sheet mySheet;
	KiteLogInPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	

	
	@BeforeClass 
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		
		
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notification");
		opt.addArguments("--Incognito");
		
		
		
		driver =new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//step2
		File myfile=new File("C:\\java selenium\\poi-bin-5.2.2-20220312\\26MarchB.xlsx");
		mySheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		
		login=new KiteLogInPage(driver);
		pin=new KitePinPage(driver);
		home =new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
		
		login.SendUserName(UN);
		Reporter.log("send usernames",true);
		login.sendPassword(PWD);
		Reporter.log("sending  password",true);
		login.clickOnButton();
		Reporter.log("click on login",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(Utility.readDataFromExcle(5, 2));
		Reporter.log("sending PIN",true);
		pin.clickOnContinueButton();
		Reporter.log("clicking on continue button ",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
	}
  @Test
  public void validateUserName() 
  {
	  String expectedUN = mySheet.getRow(5).getCell(0).getStringCellValue();
	  String actualUN = home.getActualUserName();
	  Reporter.log("validating UserName",true);
	  Assert.assertEquals(actualUN, expectedUN,"Actual and expected UN are not matching TC failed");
	  Reporter.log("Actual and Expected UN are matching TC passed",true);
	  
	  
	  
  }
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException
  {
	  home.logOut();
	  Reporter.log("logging out",true);
  }
  @AfterClass
  public void closedBrowser() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("Clkosing browser",true);
	  driver.close();
	  
  }
 






















}
