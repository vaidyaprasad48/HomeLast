package kiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\java selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LogInButton = driver.findElement(By.xpath("//button[@type='submit']"));
		UserId.sendKeys("ELR321");
		Password.sendKeys("Dhana1111");
		LogInButton.click();
		
		//for next page we have to used sincronization
		Thread.sleep(1000);
		
		WebElement PinNumber = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		PinNumber.sendKeys("982278");
		ContinueButton.click();
		
		Thread.sleep(2000);

		WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
	
		String actualUserId = UserName.getText();
		String expectedUserId="ELR3212";
		
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("User Id matching test case is Passed");
		}
		else 
		{
			System.out.println("User Id not matching test case is Failed");
		}
		UserName.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
