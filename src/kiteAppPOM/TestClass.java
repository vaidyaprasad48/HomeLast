package kiteAppPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteUtilitty.Utility;

public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{	
		//stage 1 start browser
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		//stage2 for loginpage
		
		KiteLogInPage login =new KiteLogInPage(driver);
		login.SendUserName();
		login.sendPassword();
		login.clickOnButton();
		
		Thread.sleep(1000);
		
		KitePinPage pin =new KitePinPage(driver);
		pin.sendPin(Utility.readDataFromExcle(5, 2));
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		KiteHomePage home=new KiteHomePage(driver);
		home.validUserName();
		home.logOut();
		
		driver.close();

	}

}
