package parallelAndSerialExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass1 
{
	@Test
	  public void MyMethod() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
	  }
}
