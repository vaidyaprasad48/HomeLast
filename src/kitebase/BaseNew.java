package kitebase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import kiteUtilitty.UtilityProp;

public class BaseNew 
{
	protected WebDriver driver;
	public void openBrowser() throws IOException 
	{
	
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notification");
		//opt.addArguments("--Incognito");
		driver =new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(UtilityProp.getDataFromPropertiesFiles("URL"));
		Reporter.log("launching",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	
	}
	public void openbrowserFirefox() throws IOException
	{
		 System.setProperty("webdriver.gecko.driver","C:\\java selenium\\geckodriver.exe");
			
			//WebDriver driver =new ChromeDriver();
		  
		  	 driver= new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.get(UtilityProp.getDataFromPropertiesFiles("URL"));
			Reporter.log("launching",true);
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
			
			
			
	}
	public void captureScreenshot(String TDIC) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\photoSelenium\\MyScreenshot"+TDIC+".png");
		FileHandler.copy(src, dest);
		
		
	}
}
