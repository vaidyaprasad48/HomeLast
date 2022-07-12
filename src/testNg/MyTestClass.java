package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void MyMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		System.out.println("hi method is running this is prenting statment");
		
		Reporter.log("hi method is running this is reporter output");
		
		Reporter.log("hi method is running this is reporter output true",true);
		
		Thread.sleep(1000);
  }
  @Test
  public void MyMethod1() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
  }






}
