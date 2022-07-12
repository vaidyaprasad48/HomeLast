package verificationUsingTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRadioButton 
{
	@Test
	  public void MyMethod() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
			radioButton1.click();
			Thread.sleep(1000);
//			if(radioButton1.isSelected())
//			{
//				Reporter.log("Tc pass Radio is selected",true);
//			}
//			else
//			{
//				Reporter.log("Tc failed Radio is not selected",true);
//			}
			Assert.assertTrue(radioButton1.isSelected(),"radio button is not selected tast case is fale");
	  }
}
