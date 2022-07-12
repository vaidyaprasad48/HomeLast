package kitebase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base 
{ 
	//protected WebDriver driver;
	protected WebDriver driver;
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notification");
	opt.addArguments("--Incognito");
	driver =new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	Reporter.log("launching",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}

}
